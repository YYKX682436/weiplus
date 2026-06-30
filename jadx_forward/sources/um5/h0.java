package um5;

/* loaded from: classes10.dex */
public final class h0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um5.z f510698d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(um5.z zVar) {
        super(0);
        this.f510698d = zVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        um5.z zVar = this.f510698d;
        android.opengl.GLES20.glDeleteTextures(1, new int[]{zVar.f510762b.f510661a}, 0);
        android.graphics.SurfaceTexture surfaceTexture = zVar.f510762b.f510666f;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        return jz5.f0.f384359a;
    }
}
