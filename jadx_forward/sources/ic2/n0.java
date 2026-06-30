package ic2;

/* loaded from: classes2.dex */
public final class n0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.hx0 f371885d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ic2.p0 f371886e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(r45.hx0 hx0Var, ic2.p0 p0Var) {
        super(0);
        this.f371885d = hx0Var;
        this.f371886e = p0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.w31 w31Var = new r45.w31();
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = this.f371885d.m75934xbce7f2f(1);
        if (m75934xbce7f2f != null) {
            w31Var.mo11468x92b714fd(m75934xbce7f2f.g());
            this.f371886e.getClass();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("processGetFollower: follow contact size = ");
            int i17 = 0;
            sb6.append(w31Var.m75941xfb821914(0).size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SyncHandler", sb6.toString());
            java.util.LinkedList m75941xfb821914 = w31Var.m75941xfb821914(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getFollowers(...)");
            for (java.lang.Object obj : m75941xfb821914) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) obj;
                ya2.g gVar = ya2.h.f542017a;
                ya2.b2 b17 = gVar.b(c19782x23db1cfa.m76197x6c03c64c());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SyncHandler", "sync follow contact index=" + i17 + " username=" + c19782x23db1cfa.m76197x6c03c64c() + " nickname=" + c19782x23db1cfa.m76184x8010e5e4() + " followFlag=" + c19782x23db1cfa.m76170x756826b3() + " user_flag=" + c19782x23db1cfa.m76195x13a3e4aa() + " avatarUrl=" + c19782x23db1cfa.m76175x6d346f39());
                if (b17 != null) {
                    b17.f69328x21f9b213 = c19782x23db1cfa.m76184x8010e5e4();
                    b17.f69345xaed49e5b = c19782x23db1cfa.m76195x13a3e4aa();
                    b17.f69313xcad4ef95 = c19782x23db1cfa.m76170x756826b3();
                    b17.f69300x731cac1b = c19782x23db1cfa.m76160xd133dfec();
                    b17.f69301x81118c51 = c19782x23db1cfa.m76175x6d346f39();
                    gVar.k(b17);
                } else {
                    gVar.j(c19782x23db1cfa);
                }
                i17 = i18;
            }
        }
        return jz5.f0.f384359a;
    }
}
