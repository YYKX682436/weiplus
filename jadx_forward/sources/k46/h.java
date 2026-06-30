package k46;

/* loaded from: classes13.dex */
public class h extends k46.f {

    /* renamed from: f, reason: collision with root package name */
    public final java.io.File f385647f;

    public h() {
        super(null);
        java.io.File createTempFile = java.io.File.createTempFile("commons-compress", "packtemp");
        this.f385647f = createTempFile;
        createTempFile.deleteOnExit();
        ((java.io.FilterOutputStream) this).out = java.nio.file.Files.newOutputStream(createTempFile.toPath(), new java.nio.file.OpenOption[0]);
    }

    @Override // k46.f
    public java.io.InputStream b() {
        ((java.io.FilterOutputStream) this).out.close();
        return new k46.g(this, java.nio.file.Files.newInputStream(this.f385647f.toPath(), new java.nio.file.OpenOption[0]));
    }
}
