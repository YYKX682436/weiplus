package el2;

/* loaded from: classes3.dex */
public final class x1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cm2.b0 f335475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ el2.c2 f335476e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2495xc50a8b8b.g f335477f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(cm2.b0 b0Var, el2.c2 c2Var, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        super(0);
        this.f335475d = b0Var;
        this.f335476e = c2Var;
        this.f335477f = gVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862();
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f335477f;
        byte[] g17 = gVar != null ? gVar.g() : null;
        if (g17 != null) {
            try {
                c19786x6a1e2862.mo11468x92b714fd(g17);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
            }
        }
        cm2.b0 b0Var = this.f335475d;
        b0Var.getClass();
        b0Var.f124864v = c19786x6a1e2862;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.y30 y30Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c40.f193640m;
        android.content.Context m17 = this.f335476e.m();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m17, "access$getContext(...)");
        y30Var.a(m17, new cm2.b0(b0Var.f124864v, b0Var.f124865w));
        return jz5.f0.f384359a;
    }
}
