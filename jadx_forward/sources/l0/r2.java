package l0;

/* loaded from: classes14.dex */
public final class r2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l0.a3 f396028d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(l0.a3 a3Var) {
        super(1);
        this.f396028d = a3Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        l0.a3 a3Var = this.f396028d;
        float floatValue2 = ((java.lang.Number) ((n0.q4) a3Var.f395567g).mo128745x754a37bb()).floatValue() + floatValue;
        float e17 = e06.p.e(floatValue2, a3Var.f395571k, a3Var.f395572l);
        float f17 = floatValue2 - e17;
        l0.p1 p1Var = (l0.p1) ((n0.q4) a3Var.f395575o).mo128745x754a37bb();
        float f18 = 0.0f;
        if (p1Var != null) {
            float f19 = f17 < 0.0f ? p1Var.f395954b : p1Var.f395955c;
            if (!(f19 == 0.0f)) {
                f18 = ((float) java.lang.Math.sin((e06.p.e(f17 / r3, -1.0f, 1.0f) * 3.1415927f) / 2)) * (p1Var.f395953a / f19);
            }
        }
        ((n0.q4) a3Var.f395565e).mo148714x53d8522f(java.lang.Float.valueOf(e17 + f18));
        ((n0.q4) a3Var.f395566f).mo148714x53d8522f(java.lang.Float.valueOf(f17));
        ((n0.q4) a3Var.f395567g).mo148714x53d8522f(java.lang.Float.valueOf(floatValue2));
        return jz5.f0.f384359a;
    }
}
