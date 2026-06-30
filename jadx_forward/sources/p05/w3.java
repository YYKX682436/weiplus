package p05;

/* loaded from: classes10.dex */
public final class w3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p05.l4 f432257d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(p05.l4 l4Var) {
        super(1);
        this.f432257d = l4Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        float[] m17 = (float[]) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m17, "m");
        if (this.f432257d.f432125e) {
            android.opengl.Matrix.scaleM(m17, 0, 1.0f, -1.0f, 1.0f);
        }
        return jz5.f0.f384359a;
    }
}
