package n34;

/* loaded from: classes4.dex */
public class q extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public q() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        r45.a90 a90Var;
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ExtGetSnsDataEventListener");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5392xb2fbacad c5392xb2fbacad = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5392xb2fbacad) abstractC20979x809547d1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ExtGetSnsDataEventListener");
        r4 = false;
        r4 = false;
        r4 = false;
        boolean z17 = false;
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExtGetSnsDataEventListener", "ExtGetSnsDataEvent arrived before account was ready, ignore it.");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ExtGetSnsDataEventListener");
        } else if (!(c5392xb2fbacad instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5392xb2fbacad)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.ExtGetSnsDataEventListener", "mismatched event");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ExtGetSnsDataEventListener");
        } else if (c5392xb2fbacad.f135729g.f88074a == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ExtGetSnsDataEventListener");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226();
            c17933xe8d1b226.mo9015xbf5d97fd(c5392xb2fbacad.f135729g.f88074a);
            if (c17933xe8d1b226.f38324x142bbdc6 <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExtGetSnsDataEventListener", "sns == null || sns.getLocalid()<=0");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ExtGetSnsDataEventListener");
            } else {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = c17933xe8d1b226.m70371x485d7();
                am.f8 f8Var = c5392xb2fbacad.f135730h;
                f8Var.f88181e = 0;
                f8Var.f88185i = 0;
                f8Var.f88186j = 0;
                f8Var.f88183g = new java.util.LinkedList();
                f8Var.f88184h = new java.util.LinkedList();
                r45.a90 a90Var2 = m70371x485d7.f39014x86965dde;
                if (a90Var2 != null) {
                    int i18 = a90Var2.f451370e;
                    f8Var.f88181e = i18;
                    if (!com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226.m70336x13b21a82(i18) && (i17 = (a90Var = m70371x485d7.f39014x86965dde).f451370e) != 7 && i17 != 8) {
                        ((java.util.LinkedList) f8Var.f88183g).add(a90Var.f451372g);
                    } else if (m70371x485d7.f39014x86965dde.f451373h != null) {
                        for (int i19 = 0; i19 < m70371x485d7.f39014x86965dde.f451373h.size(); i19++) {
                            java.util.List list = f8Var.f88183g;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 hj6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj();
                            r45.jj4 jj4Var = (r45.jj4) m70371x485d7.f39014x86965dde.f451373h.get(i19);
                            hj6.getClass();
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsThumbImgUri", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                            java.lang.String str4 = null;
                            if (jj4Var == null || (str3 = jj4Var.f459388d) == null || str3.equals("")) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsThumbImgUri", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                                str = null;
                            } else {
                                str = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), jj4Var.f459388d) + ca4.z0.U(jj4Var);
                                if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsThumbImgUri", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                                } else {
                                    str = jj4Var.f459393i;
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsThumbImgUri", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                                }
                            }
                            ((java.util.LinkedList) list).add(str);
                            java.util.List list2 = f8Var.f88184h;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 hj7 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj();
                            r45.jj4 jj4Var2 = (r45.jj4) m70371x485d7.f39014x86965dde.f451373h.get(i19);
                            hj7.getClass();
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsBigImgUri", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                            if (jj4Var2 == null || (str2 = jj4Var2.f459388d) == null || str2.equals("")) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsBigImgUri", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                            } else {
                                str4 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), jj4Var2.f459388d) + ca4.z0.J(jj4Var2);
                                if (com.p314xaae8f345.mm.vfs.w6.j(str4)) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsBigImgUri", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                                } else {
                                    str4 = jj4Var2.f459391g;
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsBigImgUri", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                                }
                            }
                            ((java.util.LinkedList) list2).add(str4);
                            if (i19 == 0 && m70371x485d7.f39014x86965dde.f451373h.get(i19) != null) {
                                f8Var.f88185i = (int) ((r45.jj4) m70371x485d7.f39014x86965dde.f451373h.get(i19)).f459398p.f461053d;
                                f8Var.f88186j = (int) ((r45.jj4) m70371x485d7.f39014x86965dde.f451373h.get(i19)).f459398p.f461054e;
                            }
                        }
                    }
                }
                f8Var.f88182f = ((java.util.LinkedList) f8Var.f88183g).size();
                f8Var.f88178b = c17933xe8d1b226.f38324x142bbdc6;
                f8Var.f88177a = c17933xe8d1b226.m70374x6bf53a6c();
                f8Var.f88179c = m70371x485d7.f39013x4c306a8a;
                f8Var.f88180d = m70371x485d7.f39015xc86e6609;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ExtGetSnsDataEventListener");
                z17 = true;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ExtGetSnsDataEventListener");
        return z17;
    }
}
