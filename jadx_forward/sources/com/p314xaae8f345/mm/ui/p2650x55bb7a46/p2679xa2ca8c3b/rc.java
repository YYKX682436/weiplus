package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes5.dex */
public class rc implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f286954d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.util.Pair f286955e;

    public rc(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.nc ncVar, java.lang.String str, android.util.Pair pair) {
        this.f286954d = str;
        this.f286955e = pair;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c1
    /* renamed from: onDismiss */
    public void mo889xb349b3ab() {
        android.util.Pair pair = this.f286955e;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(this.f286954d, ((java.lang.Long) pair.first).longValue());
        r45.k55 e17 = bm5.d1.e(Li.j());
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
                    c6833x9828a7c.f141545d = 2;
                } else {
                    c6833x9828a7c.f141545d = 1;
                }
                c6833x9828a7c.f141552k = 1;
                c6833x9828a7c.f141554m = 2;
                c6833x9828a7c.f141553l = 1;
                c6833x9828a7c.k();
                c6833x9828a7c.o();
                return;
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6857x603256ba c6857x603256ba = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6857x603256ba();
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(Li.Q0())) {
                c6857x603256ba.f141754h = c6857x603256ba.b("ChatroomName", Li.Q0(), true);
                c6857x603256ba.f141750d = 2;
            } else {
                c6857x603256ba.f141750d = 1;
            }
            c6857x603256ba.f141756j = ((java.lang.Long) pair.second).longValue() - ((lp3.l) ((mp3.j) i95.n0.c(mp3.j.class))).Ri(e17.f459918d, pair);
            c6857x603256ba.f141758l = ((java.lang.Long) pair.second).longValue() <= ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().w3(e17.f459918d) ? 1 : 0;
            c6857x603256ba.f141752f = c6857x603256ba.b("Username", c01.z1.r(), true);
            c6857x603256ba.f141753g = c6857x603256ba.b("PattedUserName", e17.f459918d, true);
            c6857x603256ba.f141751e = Ui.f460688g;
            c6857x603256ba.f141760n = c6857x603256ba.b("PatSuffix", lp3.p.a(Ui.f460686e), true);
            c6857x603256ba.f141762p = 1;
            c6857x603256ba.f141761o = 2;
            mp3.j jVar = (mp3.j) i95.n0.c(mp3.j.class);
            java.lang.String str = c6857x603256ba.f141752f;
            java.lang.String str2 = c6857x603256ba.f141753g;
            ((lp3.l) jVar).getClass();
            java.lang.String Vi = ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).Vi(str);
            java.lang.String Ui2 = ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).Ui(str);
            java.lang.String Vi2 = ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).Vi(str2);
            java.lang.String Ui3 = ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).Ui(str2);
            c6857x603256ba.f141764r = c6857x603256ba.b("FromStatusID", Vi, true);
            c6857x603256ba.f141766t = c6857x603256ba.b("FromStatusIcon", Ui2, true);
            c6857x603256ba.f141765s = c6857x603256ba.b("ToStatusID", Vi2, true);
            c6857x603256ba.f141767u = c6857x603256ba.b("ToStatusIcon", Ui3, true);
            c6857x603256ba.k();
            c6857x603256ba.o();
        }
    }
}
