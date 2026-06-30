package j0;

/* loaded from: classes14.dex */
public final class p4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0.u4 f378033d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(j0.u4 u4Var) {
        super(1);
        this.f378033d = u4Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        j0.u4 u4Var = this.f378033d;
        float a17 = u4Var.a() + floatValue;
        n0.v2 v2Var = u4Var.f378117b;
        if (a17 > ((java.lang.Number) ((n0.q4) v2Var).mo128745x754a37bb()).floatValue()) {
            floatValue = ((java.lang.Number) ((n0.q4) v2Var).mo128745x754a37bb()).floatValue() - u4Var.a();
        } else if (a17 < 0.0f) {
            floatValue = -u4Var.a();
        }
        float a18 = u4Var.a() + floatValue;
        ((n0.q4) u4Var.f378116a).mo148714x53d8522f(java.lang.Float.valueOf(a18));
        return java.lang.Float.valueOf(floatValue);
    }
}
