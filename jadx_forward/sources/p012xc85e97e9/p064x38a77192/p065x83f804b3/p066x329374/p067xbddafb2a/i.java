package p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a;

/* loaded from: classes14.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.k f91936d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.j f91937e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.k kVar, p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.j jVar) {
        super(2);
        this.f91936d = kVar;
        this.f91937e = jVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue;
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f384359a;
            }
        }
        p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.k kVar = this.f91936d;
        p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.l lVar = (p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.l) kVar.f91944b.mo152xb9724478();
        java.util.Map b17 = lVar.b();
        p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.j jVar = this.f91937e;
        java.lang.Integer num = (java.lang.Integer) b17.get(jVar.f91938a);
        n0.v2 v2Var = jVar.f91940c;
        if (num != null) {
            ((n0.q4) v2Var).mo148714x53d8522f(java.lang.Integer.valueOf(num.intValue()));
            intValue = num.intValue();
        } else {
            intValue = ((java.lang.Number) ((n0.q4) v2Var).mo128745x754a37bb()).intValue();
        }
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.U(-715769699);
        int e17 = lVar.e();
        java.lang.Object obj3 = jVar.f91938a;
        if (intValue < e17) {
            java.lang.Object c17 = lVar.c(intValue);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c17, obj3)) {
                ((w0.p) kVar.f91943a).a(c17, u0.j.b(oVar, -1238863364, true, new p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.f(lVar, intValue)), oVar, 568);
            }
        }
        y0Var2.o(false);
        n0.d2.c(obj3, new p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.h(jVar), oVar, 8);
        return jz5.f0.f384359a;
    }
}
