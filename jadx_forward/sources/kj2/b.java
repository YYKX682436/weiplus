package kj2;

/* loaded from: classes10.dex */
public final class b implements si2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kj2.o f389918a;

    public b(kj2.o oVar) {
        this.f389918a = oVar;
    }

    @Override // si2.c
    public void a(int i17, r45.xn1 contact) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        kj2.o oVar = this.f389918a;
        vi2.h hVar = (vi2.h) kz5.n0.a0(oVar.f389962h, i17);
        if (hVar != null) {
            hVar.f519083d = vi2.g.f519080e;
        }
        oVar.f389963i.m8147xed6e4d18(i17);
        fj2.s sVar = fj2.s.f344716a;
        ml2.w4 w4Var = ml2.w4.f409723h;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) contact.m75936x14adae67(0);
        if (c19782x23db1cfa == null || (str = c19782x23db1cfa.m76197x6c03c64c()) == null) {
            str = "";
        }
        fj2.s.h(sVar, w4Var, str, 0, 0, 12, null);
        p3325xe03a0797.p3326xc267989b.y0 a17 = oVar.f389957c.a();
        if (a17 != null) {
            p3325xe03a0797.p3326xc267989b.l.d(a17, null, null, new kj2.d(oVar, contact, i17, null), 3, null);
        }
    }
}
