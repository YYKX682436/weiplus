package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211;

/* loaded from: classes4.dex */
public class h implements p44.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.i0 f244629a;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.i0 i0Var) {
        this.f244629a = i0Var;
    }

    @Override // p44.d0
    public void a(android.view.View view, p44.s sVar, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onItemClick", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$13");
        if (this.f244629a.E()) {
            ca4.z0.I0(new long[]{0, 40});
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPageEggCardHelper", "onItemClick, in previewMode, idx=" + i17);
            this.f244629a.M();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onItemClick", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$13");
            return;
        }
        java.lang.String P = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.i0.p(this.f244629a).P();
        if (P != null && P.equals(sVar.b())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPageEggCardHelper", "onItemClick, repeat click same card, idx=" + i17 + ", cardId=" + P);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onItemClick", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$13");
            return;
        }
        boolean g17 = sVar.g();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.q3 p17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.i0.p(this.f244629a);
        p17.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onItemClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardComp");
        if (g17) {
            p17.f244457u++;
        } else {
            p17.f244458v++;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingRandomPickCardComp", "onItemClick, isPicked=" + g17 + ", pickedClickNum=" + p17.f244457u + ", unPickedClickNum=" + p17.f244458v);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onItemClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardComp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPageEggCardHelper", "onItemClick, idx=" + i17 + ", isPicked=" + g17 + ", currentSelectCardId=" + P);
        if (g17) {
            java.lang.String b17 = sVar.b();
            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.i0.q(this.f244629a) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.i0.q(this.f244629a).R(1);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.i0 i0Var = this.f244629a;
            i0Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("selectLocalCard", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.b0 b0Var = i0Var.f244640g;
            if (b0Var == null || b17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPageEggCardHelper", "selectLocalCard, err param, cardId=" + b17);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCurrentShowCompInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                ab4.d0 d0Var = b0Var.f244292x;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrentShowCompInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                java.lang.String P2 = i0Var.C.P();
                if (d0Var == null || !b17.equals(d0Var.A) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(P2)) {
                    ca4.z0.I0(new long[]{0, 40});
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPageEggCardHelper", "maybe click same card, cardId=" + b17 + ", selectCardIdFromPickCardComp=" + P2);
                    java.lang.String b18 = p44.b0.b(i0Var.f244634a.A7().i(), b17);
                    if (i0Var.F() && i0Var.f244659z != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isHbCardExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                        boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.b0.X(b18) == 2;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isHbCardExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                        if (!z17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPageEggCardHelper", "selectLocalCard, no picked hbCard, show giveHb style");
                            b18 = i0Var.f244659z.c();
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.h0 h0Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.h0(b17, b18);
                    java.lang.String h07 = i0Var.f244640g.h0(h0Var.f244630a, h0Var.f244631b);
                    i0Var.f244641h = h0Var;
                    i0Var.S.removeCallbacksAndMessages(null);
                    i0Var.S.sendEmptyMessageDelayed(4, 150L);
                    android.view.View view2 = i0Var.f244639f;
                    if (view2 != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(java.lang.Float.valueOf(1.0f));
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "selectLocalCard", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "selectLocalCard", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    }
                    android.view.View S = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.b0.S(i0Var.f244640g.Z());
                    if (S != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                        arrayList2.add(java.lang.Float.valueOf(1.0f));
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(S, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "selectLocalCard", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        S.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                        yj0.a.f(S, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "selectLocalCard", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPageEggCardHelper", "selectLocalCard, cardInfo=" + h0Var + ", displayCardId=" + h07);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.q3 q3Var = i0Var.C;
                    if (q3Var != null) {
                        q3Var.S();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.q3 q3Var2 = i0Var.C;
                        q3Var2.getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSelectCardWithAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardComp");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2094xb73a0fae.p2096x4d037474.C17718xe7d637dc c17718xe7d637dc = q3Var2.f244456t;
                        if (c17718xe7d637dc != null) {
                            c17718xe7d637dc.m69355xb7362615(h07);
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSelectCardWithAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardComp");
                    }
                    i0Var.f244640g.c0();
                    i0Var.f244640g.l0(false, false, -1);
                    android.util.Pair w17 = i0Var.w();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.u3 u3Var = i0Var.H;
                    if (u3Var != null && w17 != null) {
                        u3Var.P((java.lang.Integer) w17.first, (java.lang.String) w17.second);
                    }
                    i0Var.f244640g.R();
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdLandingPageEggCardHelper", "selectLocalCard, same card, cardId=" + b17 + ", selectCardIdFromPickCardComp=" + P2);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("selectLocalCard", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46383xd637ed7f, 10);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("selectLocalCard", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46383xd637ed7f, 10);
        } else {
            ca4.z0.I0(new long[]{0, 40});
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.i0 i0Var2 = this.f244629a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$502", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            i0Var2.E = i17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$502", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.q3 p18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.i0.p(this.f244629a);
            int o17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.i0.o(this.f244629a);
            p18.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setClickIndex", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardComp");
            p18.f244459w = o17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setClickIndex", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardComp");
            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.i0.q(this.f244629a) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.i0.q(this.f244629a).R(0);
            }
            this.f244629a.J();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46383xd637ed7f, 9);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onItemClick", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$13");
    }
}
