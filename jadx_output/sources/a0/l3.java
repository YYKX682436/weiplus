package a0;

/* loaded from: classes14.dex */
public final class l3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0.m3 f214d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(a0.m3 m3Var) {
        super(1);
        this.f214d = m3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        a0.m3 m3Var = this.f214d;
        float d17 = m3Var.d() + floatValue + m3Var.f230d;
        float e17 = e06.p.e(d17, 0.0f, ((java.lang.Number) ((n0.q4) m3Var.f229c).getValue()).intValue());
        boolean z17 = !(d17 == e17);
        float d18 = e17 - m3Var.d();
        int b17 = a06.d.b(d18);
        ((n0.q4) m3Var.f227a).setValue(java.lang.Integer.valueOf(m3Var.d() + b17));
        m3Var.f230d = d18 - b17;
        if (z17) {
            floatValue = d18;
        }
        return java.lang.Float.valueOf(floatValue);
    }
}
