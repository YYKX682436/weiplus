package h51;

/* loaded from: classes12.dex */
public class d implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public java.io.File f360551d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f360552e;

    public d() {
        new java.util.ArrayList();
        this.f360552e = true;
        java.io.File createTempFile = java.io.File.createTempFile("mm_patch", "tmp");
        this.f360551d = createTempFile;
        createTempFile.deleteOnExit();
    }

    public void a() {
        try {
            java.io.File file = this.f360551d;
            if (file != null) {
                file.delete();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("HdiffApk-tempFile", "e = " + e17);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f360552e) {
            this.f360551d.delete();
        }
    }
}
