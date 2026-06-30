package jh;

/* loaded from: classes12.dex */
public class d implements java.io.FileFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f381221a;

    public d(jh.e eVar, java.util.HashMap hashMap) {
        this.f381221a = hashMap;
    }

    @Override // java.io.FileFilter
    public boolean accept(java.io.File file) {
        java.lang.String name;
        java.lang.String absolutePath;
        java.util.HashMap hashMap = this.f381221a;
        try {
            name = file.getName();
            absolutePath = file.getAbsolutePath();
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.WarmUpDelegate", th6, "", new java.lang.Object[0]);
        }
        if (!name.contains("_malformed_") && !name.contains("_temp_")) {
            android.system.StructStat lstat = android.system.Os.lstat(absolutePath);
            long max = java.lang.Math.max(lstat.st_atime, lstat.st_mtime) * 1000;
            oj.j.c("Matrix.WarmUpDelegate", "File(%s) last access time %s", absolutePath, java.lang.Long.valueOf(max));
            if (java.lang.System.currentTimeMillis() - max > 259200000) {
                file.delete();
                oj.j.c("Matrix.WarmUpDelegate", "Delete long time no access file(%s)", absolutePath);
            } else if (max < java.lang.System.currentTimeMillis()) {
                int lastIndexOf = name.lastIndexOf(46);
                if (lastIndexOf == -1) {
                    return false;
                }
                java.lang.String substring = name.substring(0, lastIndexOf);
                if (name.endsWith(".hash")) {
                    return false;
                }
                android.util.Pair pair = (android.util.Pair) hashMap.get(substring);
                if (pair == null) {
                    hashMap.put(substring, new android.util.Pair(file, java.lang.Long.valueOf(max)));
                } else if (max > ((java.lang.Long) pair.second).longValue()) {
                    if (java.lang.System.currentTimeMillis() - ((java.lang.Long) pair.second).longValue() >= 172800000) {
                        ((java.io.File) pair.first).delete();
                        oj.j.c("Matrix.WarmUpDelegate", "Delete file(%s) cause %s is newer(%s vs %s).", ((java.io.File) pair.first).getName(), name, pair.second, java.lang.Long.valueOf(max));
                    }
                    hashMap.put(substring, new android.util.Pair(file, java.lang.Long.valueOf(max)));
                } else if (java.lang.System.currentTimeMillis() - max >= 172800000) {
                    file.delete();
                    oj.j.c("Matrix.WarmUpDelegate", "Delete file(%s) cause %s is newer(%s vs %s).", name, ((java.io.File) pair.first).getName(), java.lang.Long.valueOf(max), pair.second);
                }
            } else if (max - java.lang.System.currentTimeMillis() >= 604800000) {
                file.delete();
                oj.j.c("Matrix.WarmUpDelegate", "Delete future file(%s)", absolutePath);
            }
            return false;
        }
        if (java.lang.System.currentTimeMillis() - file.lastModified() >= 172800000) {
            oj.j.c("Matrix.WarmUpDelegate", "Delete malformed and temp file %s", absolutePath);
            file.delete();
        }
        return false;
    }
}
