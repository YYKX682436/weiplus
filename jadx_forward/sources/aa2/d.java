package aa2;

/* loaded from: classes2.dex */
public final class d implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aa2.j f84031d;

    public d(aa2.j jVar) {
        this.f84031d = jVar;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        r45.e21 e21Var;
        r45.e21 e21Var2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2;
        if (g4Var.z()) {
            aa2.j jVar = this.f84031d;
            boolean p17 = jVar.p();
            r45.e21 e21Var3 = jVar.f84038d;
            java.lang.String str = null;
            java.lang.String m76197x6c03c64c = (e21Var3 == null || (c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) e21Var3.m75936x14adae67(1)) == null) ? null : c19782x23db1cfa2.m76197x6c03c64c();
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = jVar.f515691a;
            boolean z17 = false;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m76197x6c03c64c, xy2.c.e(activityC0065xcd7aa112))) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13667xc5da9466 c13667xc5da9466 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13667xc5da9466) pf5.z.f435481a.a(activityC0065xcd7aa112).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13667xc5da9466.class);
                r45.r03 r03Var = jVar.f84037c;
                if (!c13667xc5da9466.W6((r03Var == null || (e21Var2 = (r45.e21) r03Var.m75936x14adae67(16)) == null) ? 0 : e21Var2.m75939xb282bd08(12), (r03Var == null || (e21Var = (r45.e21) r03Var.m75936x14adae67(16)) == null) ? 0L : e21Var.m75942xfb822ef2(13))) {
                    z17 = true;
                }
            }
            if (z17) {
                g4Var.l(20004, jVar.f515691a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cic), com.p314xaae8f345.mm.R.raw.f79320xd5ed9fee, p17);
                return;
            }
            r45.e21 e21Var4 = jVar.f84038d;
            if (e21Var4 != null && (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) e21Var4.m75936x14adae67(1)) != null) {
                str = c19782x23db1cfa.m76197x6c03c64c();
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, xy2.c.e(jVar.f515691a))) {
                return;
            }
            g4Var.l(20005, jVar.f515691a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573232dy4), com.p314xaae8f345.mm.R.raw.f80290xd9c5d1ec, p17);
        }
    }
}
