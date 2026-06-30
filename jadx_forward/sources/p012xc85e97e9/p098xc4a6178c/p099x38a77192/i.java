package p012xc85e97e9.p098xc4a6178c.p099x38a77192;

/* loaded from: classes5.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.s f93259d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p098xc4a6178c.p099x38a77192.e f93260e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(yz5.s sVar, p012xc85e97e9.p098xc4a6178c.p099x38a77192.e eVar) {
        super(4);
        this.f93259d = sVar;
        this.f93260e = eVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int i17;
        e0.g items = (e0.g) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        n0.o oVar = (n0.o) obj3;
        int intValue2 = ((java.lang.Number) obj4).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "$this$items");
        if ((intValue2 & 14) == 0) {
            i17 = (((n0.y0) oVar).e(items) ? 4 : 2) | intValue2;
        } else {
            i17 = intValue2;
        }
        if ((intValue2 & 112) == 0) {
            i17 |= ((n0.y0) oVar).c(intValue) ? 32 : 16;
        }
        if (((i17 & 731) ^ 146) == 0) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f384359a;
            }
        }
        this.f93259d.v(items, java.lang.Integer.valueOf(intValue), this.f93260e.b(intValue), oVar, java.lang.Integer.valueOf((i17 & 14) | (i17 & 112)));
        return jz5.f0.f384359a;
    }
}
