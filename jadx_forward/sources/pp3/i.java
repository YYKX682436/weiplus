package pp3;

/* loaded from: classes5.dex */
public class i implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.util.Pair f439011d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f439012e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pp3.j f439013f;

    public i(pp3.j jVar, android.util.Pair pair, java.lang.String str) {
        this.f439013f = jVar;
        this.f439011d = pair;
        this.f439012e = str;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 548) {
            this.f439013f.getClass();
            android.util.Pair pair = this.f439011d;
            r45.k55 e17 = bm5.d1.e(pt0.f0.Li(this.f439012e, ((java.lang.Long) pair.first).longValue()).j());
            r45.l55 Ui = ((lp3.l) ((mp3.j) i95.n0.c(mp3.j.class))).Ui(e17, ((java.lang.Long) pair.second).longValue());
            if (Ui != null) {
                if (Ui.f460690i != 0) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6833x9828a7c c6833x9828a7c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6833x9828a7c();
                    c6833x9828a7c.f141546e = Ui.f460688g;
                    c6833x9828a7c.f141547f = java.lang.System.currentTimeMillis();
                    c6833x9828a7c.f141548g = c6833x9828a7c.b("UserName", Ui.f460685d, true);
                    c6833x9828a7c.f141549h = c6833x9828a7c.b("PattedUserName", Ui.f460686e, true);
                    c6833x9828a7c.f141550i = c6833x9828a7c.b("PatSuffix", lp3.p.a(Ui.f460686e), true);
                    if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(e17.f459918d)) {
                        c6833x9828a7c.f141551j = c6833x9828a7c.b("ChatRoomName", e17.f459918d, true);
                    }
                    c6833x9828a7c.f141552k = 2;
                    c6833x9828a7c.f141554m = 2;
                    c6833x9828a7c.k();
                    c6833x9828a7c.o();
                    return;
                }
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6857x603256ba c6857x603256ba = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6857x603256ba();
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(e17.f459918d)) {
                    c6857x603256ba.f141754h = c6857x603256ba.b("ChatroomName", e17.f459918d, true);
                }
                c6857x603256ba.f141756j = ((java.lang.Long) pair.second).longValue() - ((lp3.l) ((mp3.j) i95.n0.c(mp3.j.class))).Ri(e17.f459918d, pair);
                c6857x603256ba.f141758l = ((java.lang.Long) pair.second).longValue() <= ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().w3(e17.f459918d) ? 1 : 0;
                c6857x603256ba.f141759m = ((lp3.l) ((mp3.j) i95.n0.c(mp3.j.class))).Vi(e17, ((java.lang.Long) pair.second).longValue()) + 1;
                c6857x603256ba.f141752f = c6857x603256ba.b("Username", c01.z1.r(), true);
                c6857x603256ba.f141753g = c6857x603256ba.b("PattedUserName", e17.f459918d, true);
                c6857x603256ba.f141751e = Ui.f460688g;
                c6857x603256ba.f141760n = c6857x603256ba.b("PatSuffix", lp3.p.a(Ui.f460686e), true);
                c6857x603256ba.f141761o = 2;
                c6857x603256ba.f141762p = 2;
                lp3.l.Ni(c6857x603256ba);
                c6857x603256ba.k();
                c6857x603256ba.o();
            }
        }
    }
}
