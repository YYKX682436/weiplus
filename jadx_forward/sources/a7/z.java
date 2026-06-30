package a7;

/* loaded from: classes13.dex */
public class z implements a7.y {
    @Override // a7.y
    public java.lang.Class a() {
        return java.io.InputStream.class;
    }

    @Override // a7.y
    public java.lang.Object b(java.io.File file) {
        return new java.io.FileInputStream(file);
    }

    @Override // a7.y
    public void c(java.lang.Object obj) {
        ((java.io.InputStream) obj).close();
    }
}
