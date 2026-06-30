package yo4;

/* loaded from: classes10.dex */
public final class e1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18795x62fd7c3f f545735d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f545736e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18795x62fd7c3f c18795x62fd7c3f, long j17) {
        super(0);
        this.f545735d = c18795x62fd7c3f;
        this.f545736e = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18795x62fd7c3f c18795x62fd7c3f = this.f545735d;
        long j17 = c18795x62fd7c3f.B1 ? 1L : 4L;
        uo4.i iVar = new uo4.i();
        java.util.ArrayList E = c18795x62fd7c3f.f257408r.E();
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 h1Var = c18795x62fd7c3f.G.f257276t;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6759x7a5829e7 c6759x7a5829e7 = iVar.f511242a;
        c6759x7a5829e7.f140856d = c6759x7a5829e7.b("EditId", c18795x62fd7c3f.D1, true);
        iVar.f511242a.f140866n = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40062x608a19a0(c18795x62fd7c3f.getContext());
        iVar.f511242a.f140863k = j17;
        iVar.c(E);
        iVar.b(h1Var);
        iVar.f511242a.f140861i = c18795x62fd7c3f.f257412v.f545820r == null ? 0L : 1L;
        jp4.a aVar = c18795x62fd7c3f.m72543x67c60a58().f104751q;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6759x7a5829e7 c6759x7a5829e72 = iVar.f511242a;
        c6759x7a5829e72.f140867o = c6759x7a5829e72.b("SeekTimeStr", kz5.n0.g0(aVar.f382565a, "#", null, null, 0, null, null, 62, null), true);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6759x7a5829e7 c6759x7a5829e73 = iVar.f511242a;
        c6759x7a5829e73.f140868p = c6759x7a5829e73.b("UpdateCompositionTimeStr", kz5.n0.g0(aVar.f382566b, "#", null, null, 0, null, null, 62, null), true);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (!android.text.TextUtils.isEmpty(iVar.f511242a.f140867o)) {
            java.util.Iterator it = h1Var.f257130c.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) it.next();
                if (i1Var.f257150b == 2) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    sb7.append(dq4.c.f323902a.b(i1Var.f257149a));
                    sb7.append('#');
                    sb6.append(sb7.toString());
                }
            }
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6759x7a5829e7 c6759x7a5829e74 = iVar.f511242a;
        c6759x7a5829e74.f140869q = c6759x7a5829e74.b("VideoGOPStr", sb6.toString(), true);
        iVar.f511242a.f140862j = this.f545736e;
        iVar.a();
        return jz5.f0.f384359a;
    }
}
