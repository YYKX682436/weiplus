package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class c1 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i {
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var, int i17, android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k4 k4Var) {
        super(i17, activity, k4Var);
        this.Y = l1Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i
    public void A(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLikeClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var = this.Y;
        l1Var.f251242j.p();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder) view.getTag();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(baseViewHolder.f250801f);
        if (k17 != null && !k17.m70398x507e494d()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
            boolean z17 = l1Var.f251238f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
            if (!z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineClickListener", "onLikeClick snsInfo:%s falg:%d", ca4.z0.t0(k17.f68891x29d1292e), java.lang.Integer.valueOf(baseViewHolder.f250803g));
                new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.a1(this, k17, view, baseViewHolder), 0);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLikeClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
                return;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLikeClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i
    public void B() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onNotifyData", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs bsVar = this.Y.f251242j;
        if (bsVar != null) {
            bsVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onNotifyChanged", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            bsVar.f249568a.w3("");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onNotifyChanged", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onNotifyData", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i
    public void C(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onOpenIMTagClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var = this.Y;
        l1Var.f251254v.a();
        l1Var.f251250r.d();
        l1Var.f251251s.f();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.m7 m7Var = l1Var.f251253u;
        m7Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setIsFullScreen", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
        m7Var.f251429h = true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setIsFullScreen", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
        if (l1Var.k() == 0) {
            l1Var.f251253u.b(view, false, false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onOpenIMTagClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i
    public void D(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onOpenIMUnlikeClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
        this.Y.f251253u.c();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onOpenIMUnlikeClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i
    public void E(java.lang.Object obj) {
        long j17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPhotoClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
        android.view.View view = (android.view.View) obj;
        java.lang.Object tag = view.getTag();
        boolean z17 = tag instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var = this.Y;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oj ojVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oj) tag;
            i64.b1 b1Var = l1Var.f251235c;
            if (b1Var != null) {
                j17 = b1Var.h(ojVar.f251635a, 6);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kj kjVar = l1Var.f251246n;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l7 l7Var = l1Var.f251236d;
                kjVar.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
                kjVar.e(view, 1, 0, l7Var, j17, false, 0);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPhotoClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
            }
        }
        j17 = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kj kjVar2 = l1Var.f251246n;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l7 l7Var2 = l1Var.f251236d;
        kjVar2.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
        kjVar2.e(view, 1, 0, l7Var2, j17, false, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPhotoClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i
    public void F(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUnLickClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
        this.Y.f251251s.g();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUnLickClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i
    public void G(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUnLikeFinish", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var = this.Y;
        l1Var.f251251s.f();
        if (view.getTag() != null) {
            ca4.j jVar = (ca4.j) view.getTag();
            l1Var.f251235c.o(jVar.f121486b, jVar.f121487c, jVar.f121488d, 1);
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(jVar.f121487c);
                if (k17 != null && k17.m70377x3172ed()) {
                    ca4.c0.b(2, jVar.f121488d, k17.m70346x10413e67(), k17.m70354x74235b3e());
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TimelineClickListener", "reportAdFeedBackDel: info is null or not ad");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUnLikeFinish", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
                return;
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TimelineClickListener", "reportAdFeedBackDel: " + th6.toString());
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUnLikeFinish", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i
    public void H(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUnLikeFinishError", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
        this.Y.f251251s.f();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUnLikeFinishError", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i
    public void I(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUnLikeHelperClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var = this.Y;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ay ayVar = l1Var.f251254v;
        if (ayVar != null) {
            ayVar.a();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.vx vxVar = l1Var.f251250r;
        if (vxVar != null) {
            vxVar.d();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.m7 m7Var = l1Var.f251253u;
        if (m7Var != null) {
            m7Var.c();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.j jVar = l1Var.f251251s;
        if (jVar != null) {
            jVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setIsFullScreen", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
            jVar.f251001j = true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setIsFullScreen", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
            l1Var.f251251s.b(view);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUnLikeHelperClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i
    public void z(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCommentClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var = this.Y;
        l1Var.f251242j.p();
        try {
            baseViewHolder = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder) view.getTag();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TimelineClickListener", "In BaseTimeLine, do onCommentClick and exp is " + th6.toString());
        }
        if (l1Var.f251242j.g() == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCommentClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
            return;
        }
        l1Var.f251242j.g().a1();
        new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17 = l1Var.f251242j.c(baseViewHolder.f250795c);
        if (!c17.m70419x7b953cf2()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCommentClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k7.f245900a.b(c17, 1);
        m21.w.d(741);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.e(c17);
        ca4.z0.T(c17);
        c17.m70377x3172ed();
        c17.m70375x338a8cc7();
        c17.m70374x6bf53a6c();
        if (!c17.m70377x3172ed() || (c17.m70371x485d7().f39014x86965dde.f451374i & 8) == 0) {
            l1Var.i(baseViewHolder, c17, new r45.e86());
        } else {
            l1Var.h(baseViewHolder, c17, new r45.e86());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCommentClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
    }
}
