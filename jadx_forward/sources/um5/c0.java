package um5;

/* loaded from: classes10.dex */
public final class c0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um5.i0 f510672d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(um5.i0 i0Var) {
        super(0);
        this.f510672d = i0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        um5.i0 i0Var = this.f510672d;
        java.util.Iterator it = i0Var.f510701u.iterator();
        while (it.hasNext()) {
            um5.z zVar = (um5.z) it.next();
            android.opengl.GLES20.glDeleteTextures(1, new int[]{zVar.f510762b.f510661a}, 0);
            android.graphics.SurfaceTexture surfaceTexture = zVar.f510762b.f510666f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
        }
        i0Var.f510701u.clear();
        return jz5.f0.f384359a;
    }
}
