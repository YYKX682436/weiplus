package el2;

/* loaded from: classes3.dex */
public final class t1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.c2 f335446d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2495xc50a8b8b.g f335447e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.y42 f335448f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(el2.c2 c2Var, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, r45.y42 y42Var) {
        super(0);
        this.f335446d = c2Var;
        this.f335447e = gVar;
        this.f335448f = y42Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.m mVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r.f195592n;
        el2.c2 c2Var = this.f335446d;
        android.content.Context m17 = c2Var.m();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m17, "access$getContext(...)");
        gk2.e S0 = c2Var.f335295e.S0();
        r45.k92 k92Var = new r45.k92();
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f335447e;
        byte[] g17 = gVar != null ? gVar.g() : null;
        if (g17 != null) {
            try {
                k92Var.mo11468x92b714fd(g17);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
            }
        }
        cm2.h0 h0Var = new cm2.h0(k92Var);
        r45.y42 y42Var = this.f335448f;
        h0Var.f124930s = y42Var.m75934xbce7f2f(5);
        h0Var.f124931t = y42Var.m75934xbce7f2f(6);
        java.lang.String m75945x2fec8307 = y42Var.m75945x2fec8307(4);
        h0Var.f124920f = m75945x2fec8307 != null ? m75945x2fec8307 : "";
        mVar.a(m17, S0, c2Var.f335296f, h0Var);
        return jz5.f0.f384359a;
    }
}
