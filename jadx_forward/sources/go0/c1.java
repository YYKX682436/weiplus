package go0;

/* loaded from: classes14.dex */
public final class c1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.f1 f355277d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(go0.f1 f1Var) {
        super(1);
        this.f355277d = f1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        float[] m17 = (float[]) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m17, "m");
        android.opengl.Matrix.scaleM(m17, 0, !this.f355277d.R ? 1.0f : -1.0f, -1.0f, 1.0f);
        return jz5.f0.f384359a;
    }
}
