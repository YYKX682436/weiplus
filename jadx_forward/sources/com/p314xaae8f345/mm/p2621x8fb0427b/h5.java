package com.p314xaae8f345.mm.p2621x8fb0427b;

@j95.b
/* loaded from: classes15.dex */
public final class h5 extends i95.w implements com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.c6 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2621x8fb0427b.h5 f276539d = new com.p314xaae8f345.mm.p2621x8fb0427b.h5();

    public boolean Ai() {
        return wi() && (c01.z1.i() & 17592186044416L) != 0;
    }

    public final boolean Bi() {
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_emoticon_enable_bubble_recommend, false)) {
            if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_emoticon_privacy_setting, false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiPrivacy", "match shouldShowPrivacyPolicy");
                return true;
            }
            if (Ui()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiPrivacy", "match shouldShowPrivacyPolicy");
                return true;
            }
        }
        if (wi()) {
            return (c01.z1.i() & 2097152) != 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiPrivacy", "match isEmojiRecommendAllowed");
        return false;
    }

    public final void Di(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiPrivacy", "setEmojiRecommendFromPersonalizedEnabled: enabled=" + z17);
        long i17 = c01.z1.i();
        c01.z1.P(z17 ? i17 | 17592186044416L : i17 & (-17592186044417L));
        r45.p53 p53Var = new r45.p53();
        p53Var.f464294d = 102;
        p53Var.f464295e = z17 ? 1 : 2;
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
        com.p314xaae8f345.mm.p2621x8fb0427b.z4.f277924j.g();
    }

    public final void Ni(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiPrivacy", "setEmojiRecommendFromUnsavedEnabled: enabled=" + z17);
        long i17 = c01.z1.i();
        c01.z1.P(z17 ? i17 | 2097152 : i17 & (-2097153));
        r45.p53 p53Var = new r45.p53();
        p53Var.f464294d = 86;
        p53Var.f464295e = z17 ? 1 : 2;
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
    }

    public final void Ri(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiPrivacy", "setUserAcceptation: agreed=" + z17);
        r45.p53 p53Var = new r45.p53();
        p53Var.f464294d = 85;
        p53Var.f464295e = z17 ? 1 : 2;
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
        long i17 = c01.z1.i();
        c01.z1.P(z17 ? i17 | 17592188141568L : i17 & (-17592188141569L));
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6384xa2a6a296 c6384xa2a6a296 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6384xa2a6a296();
        c6384xa2a6a296.f137298d = 3;
        c6384xa2a6a296.f137299e = z17 ? 2L : 3L;
        c6384xa2a6a296.k();
    }

    public final boolean Ui() {
        if (bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2528x5c28046.C20132x92d10112()) == 1) {
            return true;
        }
        return wi() && (c01.z1.i() & 1048576) == 0;
    }

    public final boolean wi() {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            return false;
        }
        if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_emoticon_privacy_setting, false) || ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
            return false;
        }
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).wi();
        java.lang.Object l17 = gm0.j1.u().c().l(274436, null);
        if (l17 == null) {
            return false;
        }
        java.lang.String str = (java.lang.String) l17;
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && str.toUpperCase().equals("CN");
    }
}
