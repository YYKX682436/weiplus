package cj;

/* loaded from: classes12.dex */
public class d extends cj.c {
    @Override // cj.c
    public boolean b(com.tencent.matrix.resource.analyzer.model.DestroyedActivityInfo destroyedActivityInfo) {
        java.io.File file;
        c(0, wi.b.NO_DUMP, destroyedActivityInfo.mActivityName, destroyedActivityInfo.mKey, "no dump", "0");
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 > 31) {
            oj.j.b("Matrix.LeakProcessor.ForkDump", "unsupported API version " + i17, new java.lang.Object[0]);
            return false;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            file = xi.k.f454661e.f("FDP", true);
        } catch (java.io.FileNotFoundException e17) {
            oj.j.d("Matrix.LeakProcessor.ForkDump", e17, "", new java.lang.Object[0]);
            file = null;
        }
        if (file == null) {
            oj.j.b("Matrix.LeakProcessor.ForkDump", "cannot create hprof file, just ignore", new java.lang.Object[0]);
            return true;
        }
        if (!com.tencent.matrix.resource.MemoryUtil.h(file.getPath(), 600L)) {
            oj.j.b("Matrix.LeakProcessor.ForkDump", java.lang.String.format("heap dump for further analyzing activity with key [%s] was failed, just ignore.", destroyedActivityInfo.mKey), new java.lang.Object[0]);
            return true;
        }
        oj.j.c("Matrix.LeakProcessor.ForkDump", java.lang.String.format("dump cost=%sms refString=%s path=%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), destroyedActivityInfo.mKey, file.getPath()), new java.lang.Object[0]);
        java.lang.String str = destroyedActivityInfo.mActivityName;
        com.tencent.matrix.resource.watcher.f fVar = this.f41825a;
        fVar.b(str, true);
        fVar.d();
        if (this.f41827c == null) {
            this.f41827c = new cj.b(this);
        }
        ((cj.b) this.f41827c).a(new ti.w0(file, destroyedActivityInfo.mKey, destroyedActivityInfo.mActivityName));
        return true;
    }
}
