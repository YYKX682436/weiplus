package my0;

/* loaded from: classes5.dex */
public final class h extends ly0.v {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f414197c;

    /* renamed from: d, reason: collision with root package name */
    public final my0.f f414198d;

    /* renamed from: e, reason: collision with root package name */
    public final ly0.p f414199e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.String imagePath, byte[] bArr, my0.f aiScene) {
        super(kz5.b0.c(imagePath));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imagePath, "imagePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aiScene, "aiScene");
        this.f414197c = bArr;
        this.f414198d = aiScene;
        this.f414199e = ly0.p.f403761d;
    }

    @Override // ly0.v
    public ly0.n a(java.util.List imageUrls, yz5.l rawCompletionCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageUrls, "imageUrls");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rawCompletionCallback, "rawCompletionCallback");
        return new my0.e(imageUrls, this.f414197c, this.f414198d.f414194d, null, rawCompletionCallback, null);
    }

    @Override // ly0.v
    public ly0.p d() {
        return this.f414199e;
    }

    @Override // ly0.v
    public java.lang.Object e(java.lang.String taskId, java.util.List generatedImagePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskId, "taskId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(generatedImagePath, "generatedImagePath");
        return new my0.g(taskId, (java.lang.String) kz5.n0.X(generatedImagePath));
    }
}
