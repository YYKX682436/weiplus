package a0;

/* loaded from: classes14.dex */
public final class l3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0.m3 f81747d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(a0.m3 m3Var) {
        super(1);
        this.f81747d = m3Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        a0.m3 m3Var = this.f81747d;
        float d17 = m3Var.d() + floatValue + m3Var.f81763d;
        float e17 = e06.p.e(d17, 0.0f, ((java.lang.Number) ((n0.q4) m3Var.f81762c).mo128745x754a37bb()).intValue());
        boolean z17 = !(d17 == e17);
        float d18 = e17 - m3Var.d();
        int b17 = a06.d.b(d18);
        ((n0.q4) m3Var.f81760a).mo148714x53d8522f(java.lang.Integer.valueOf(m3Var.d() + b17));
        m3Var.f81763d = d18 - b17;
        if (z17) {
            floatValue = d18;
        }
        return java.lang.Float.valueOf(floatValue);
    }
}
