package com.p314xaae8f345.mm.ui.p2731xc84c5534;

/* loaded from: classes11.dex */
public abstract class k0 {
    public static final java.util.Map a(java.lang.String str, java.lang.String digest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(digest, "digest");
        java.lang.String str2 = i17 > 0 ? "1" : "0";
        try {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str, true);
            java.lang.String str3 = n17 != null && c01.e2.P(n17) ? "1" : "2";
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 q57 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().q5(str);
            boolean z17 = q57 != null && q57.A0() == 1;
            java.lang.String str4 = z17 ? "1" : "0";
            if (z17) {
                digest = "";
            }
            java.util.Map l17 = kz5.c1.l(new jz5.l("if_sent_from_self", str4), new jz5.l("if_have_red", str2), new jz5.l("red_type", str3), new jz5.l("number_red_cnt", java.lang.String.valueOf(i17)));
            if (!z17) {
                l17.put("digest", digest);
            }
            return l17;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenImKefuConversationReporter", "buildKfListReportParams ex %s", e17.getMessage());
            return kz5.q0.f395534d;
        }
    }

    public static final void b(int i17, java.lang.String talker, com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var) {
        long j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6664x332c394 c6664x332c394 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6664x332c394();
        if (i17 == 1) {
            j17 = 12;
        } else if (i17 == 2) {
            j17 = 15;
        } else if (i17 == 3) {
            j17 = 16;
        } else if (i17 != 4) {
            return;
        } else {
            j17 = 17;
        }
        c6664x332c394.f140084d = j17;
        c6664x332c394.f140085e = c6664x332c394.b("SessionName", talker, true);
        c6664x332c394.f140087g = c01.h2.b(talker);
        c6664x332c394.f140086f = l4Var != null ? l4Var.d1() : 0L;
        c6664x332c394.k();
        if (i17 == 1) {
            int d17 = l4Var != null ? l4Var.d1() : 0;
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6664x332c394 c6664x332c3942 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6664x332c394();
            c6664x332c3942.f140084d = 1L;
            c6664x332c3942.f140085e = c6664x332c3942.b("SessionName", talker, true);
            c6664x332c3942.f140087g = c01.h2.b(talker);
            c6664x332c3942.f140086f = d17;
            c6664x332c3942.k();
        }
    }
}
