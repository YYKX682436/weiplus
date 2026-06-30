package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13;

/* loaded from: classes4.dex */
public class z extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5 {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5
    public void h(android.view.ViewStub viewStub, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildContent", "com.tencent.mm.plugin.sns.ui.item.HBRewardTimeLineItem");
        baseViewHolder.L.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.alj);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.RunnableC17943x7a38efee runnableC17943x7a38efee = baseViewHolder.f250809j;
        runnableC17943x7a38efee.setTextColor(runnableC17943x7a38efee.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561015a31));
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.r(baseViewHolder) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.r(baseViewHolder).setLayoutResource(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571039cs2);
            if (!baseViewHolder.f250823q) {
                baseViewHolder.T = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17989x79511098) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.r(baseViewHolder).inflate();
                baseViewHolder.f250823q = true;
            }
        } else {
            baseViewHolder.T = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17989x79511098) baseViewHolder.f250805h.findViewById(com.p314xaae8f345.mm.R.id.gxb);
            baseViewHolder.f250823q = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.HBRewardTimeLineItem", "viewtype " + this.f250783g);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17973x67e3e70e c17973x67e3e70e = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17973x67e3e70e) baseViewHolder.T.findViewById(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.tm.f252066h[0]);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17972xe84284f4 m70599xcb16a3ea = c17973x67e3e70e.m70599xcb16a3ea();
        baseViewHolder.T.b(m70599xcb16a3ea);
        baseViewHolder.T.c(c17973x67e3e70e.m70600xf31bd94f());
        baseViewHolder.T.a(c17973x67e3e70e);
        m70599xcb16a3ea.setOnClickListener(this.f250784h.f249572e.f251346p);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildContent", "com.tencent.mm.plugin.sns.ui.item.HBRewardTimeLineItem");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5
    public void p(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ns nsVar, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720, int i18, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs bsVar) {
        java.lang.String str;
        java.lang.String str2;
        r45.da6 da6Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillItem", "com.tencent.mm.plugin.sns.ui.item.HBRewardTimeLineItem");
        java.lang.String str3 = nsVar.f251569h;
        android.view.View view = baseViewHolder.f250826r0;
        if (view != null) {
            if (!nsVar.f251587z || (da6Var = baseViewHolder.f38401xca815c7f.f38998xb2b52717) == null || da6Var.f453807d <= 0) {
                view.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563373c63);
            } else {
                view.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563374c64);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18146x7d99d446 g17 = baseViewHolder.T.g(0);
        new java.util.ArrayList().add(g17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oj ojVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oj();
        ojVar.f251635a = str3;
        ojVar.f251636b = 0;
        ojVar.f251638d = this.f250785i;
        if (g17 != null) {
            g17.setTag(ojVar);
        }
        r45.kj4 kj4Var = nsVar.Y;
        baseViewHolder.f250806h0 = kj4Var;
        if (kj4Var == null) {
            str = "com.tencent.mm.plugin.sns.ui.item.HBRewardTimeLineItem";
            str2 = "fillItem";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MiroMsg.HBRewardTimeLineItem", "mediaPostInfo is null " + nsVar.f251569h);
        } else if (c01.z1.r().equals(c19807x593d1720.f39018xf3f56116)) {
            baseViewHolder.T.setVisibility(0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.tm tmVar = bsVar.f249577j;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17989x79511098 c17989x79511098 = baseViewHolder.T;
            java.lang.String str4 = nsVar.f251569h;
            int hashCode = this.f250782f.hashCode();
            boolean z17 = nsVar.f251577p;
            boolean z18 = this.f250785i;
            com.p314xaae8f345.mm.p2621x8fb0427b.s7 d17 = com.p314xaae8f345.mm.p2621x8fb0427b.s7.d();
            d17.f276846b = c19807x593d1720.f39015xc86e6609;
            str = "com.tencent.mm.plugin.sns.ui.item.HBRewardTimeLineItem";
            tmVar.c(c17989x79511098, c19807x593d1720, str4, null, null, hashCode, i18, i17, z17, z18, d17, true);
            str2 = "fillItem";
        } else {
            str = "com.tencent.mm.plugin.sns.ui.item.HBRewardTimeLineItem";
            if (nsVar.C) {
                baseViewHolder.T.setVisibility(0);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.tm tmVar2 = bsVar.f249577j;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17989x79511098 c17989x795110982 = baseViewHolder.T;
                java.lang.String str5 = nsVar.f251569h;
                int hashCode2 = this.f250782f.hashCode();
                boolean z19 = nsVar.f251577p;
                boolean z27 = this.f250785i;
                com.p314xaae8f345.mm.p2621x8fb0427b.s7 d18 = com.p314xaae8f345.mm.p2621x8fb0427b.s7.d();
                d18.f276846b = c19807x593d1720.f39015xc86e6609;
                str2 = "fillItem";
                tmVar2.c(c17989x795110982, c19807x593d1720, str5, null, null, hashCode2, i18, i17, z19, z27, d18, false);
            } else {
                str2 = "fillItem";
                if (kj4Var.D == 0) {
                    baseViewHolder.T.setVisibility(0);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.tm tmVar3 = bsVar.f249577j;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17989x79511098 c17989x795110983 = baseViewHolder.T;
                    java.lang.String str6 = nsVar.f251569h;
                    int hashCode3 = this.f250782f.hashCode();
                    boolean z28 = nsVar.f251577p;
                    boolean z29 = this.f250785i;
                    com.p314xaae8f345.mm.p2621x8fb0427b.s7 d19 = com.p314xaae8f345.mm.p2621x8fb0427b.s7.d();
                    d19.f276846b = c19807x593d1720.f39015xc86e6609;
                    tmVar3.c(c17989x795110983, c19807x593d1720, str6, null, null, hashCode3, i18, i17, z28, z29, d19, true);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MiroMsg.HBRewardTimeLineItem", "mediaPostInfo.hbStatus is " + kj4Var.D);
                }
            }
        }
        g(nsVar, 1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5
    public java.lang.String u() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "com.tencent.mm.plugin.sns.ui.item.HBRewardTimeLineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "com.tencent.mm.plugin.sns.ui.item.HBRewardTimeLineItem");
        return "HBRewardTimeLineItem";
    }
}
