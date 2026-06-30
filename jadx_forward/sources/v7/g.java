package v7;

/* loaded from: classes12.dex */
public class g implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final java.io.File f515126d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v7.h f515127e;

    public g(v7.h hVar, java.io.File file) {
        this.f515127e = hVar;
        this.f515126d = file;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        v7.h hVar = this.f515127e;
        hVar.getClass();
        java.io.File file = this.f515126d;
        long j17 = 0;
        if (file.exists()) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (!file.setLastModified(currentTimeMillis)) {
                long length = file.length();
                if (length != 0) {
                    java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(file, "rwd");
                    long j18 = length - 1;
                    randomAccessFile.seek(j18);
                    byte readByte = randomAccessFile.readByte();
                    randomAccessFile.seek(j18);
                    randomAccessFile.write(readByte);
                    randomAccessFile.close();
                } else if (!file.delete() || !file.createNewFile()) {
                    throw new java.io.IOException("Error recreate zero-size file " + file);
                }
                if (file.lastModified() < currentTimeMillis) {
                    java.lang.String.format("Last modified date %s is not set for file %s", new java.util.Date(file.lastModified()), file.getAbsolutePath());
                }
            }
        }
        java.io.File parentFile = file.getParentFile();
        java.util.List<java.io.File> linkedList = new java.util.LinkedList();
        java.io.File[] listFiles = parentFile.listFiles();
        if (listFiles != null) {
            linkedList = java.util.Arrays.asList(listFiles);
            java.util.Collections.sort(linkedList, new v7.e(null));
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            j17 += ((java.io.File) it.next()).length();
        }
        linkedList.size();
        for (java.io.File file2 : linkedList) {
            if (!(j17 <= ((v7.j) hVar).f515129b)) {
                long length2 = file2.length();
                if (file2.delete()) {
                    j17 -= length2;
                    file2.toString();
                } else {
                    file2.toString();
                }
            }
        }
        return null;
    }
}
