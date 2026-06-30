package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public final class kg extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final yz5.p f251164e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f251165f;

    public kg(yz5.p onOpenCommentInputFooter, yz5.l onJumpToProfileWithUserName, yz5.l onShowSelfCommentAlert) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onOpenCommentInputFooter, "onOpenCommentInputFooter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onJumpToProfileWithUserName, "onJumpToProfileWithUserName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onShowSelfCommentAlert, "onShowSelfCommentAlert");
        this.f251164e = onOpenCommentInputFooter;
        this.f251165f = onShowSelfCommentAlert;
    }

    @Override // in5.r
    public int e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.eoz;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ei item = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ei) cVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindCommentSnsInfoFlipData", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) holder.p(com.p314xaae8f345.mm.R.id.swf);
        frameLayout.removeAllViews();
        frameLayout.addView(item.c());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindCommentSnsInfoFlipData", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindCommentNickNameText", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.vi_);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 b17 = item.b();
        r45.e86 a17 = item.a();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCommentNickNameWithSnsInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        java.lang.String e17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.t2.e(a17);
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.t2.k(b17, a17.f454659d)) {
            e17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.t2.d(b17.m70354x74235b3e(), java.lang.String.valueOf(e17));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCommentNickNameWithSnsInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        textView.setText(e17);
        textView.setOnClickListener(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ig.f250144d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindCommentNickNameText", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindCommentContentText", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18021xd4495324 c18021xd4495324 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18021xd4495324) holder.p(com.p314xaae8f345.mm.R.id.ols);
        com.p314xaae8f345.mm.p2614xca6eae71.x1 Di = com.p314xaae8f345.mm.p2614xca6eae71.x1.Di();
        java.lang.String str = item.a().f454663h;
        if (str == null) {
            str = "";
        }
        c18021xd4495324.m70703xbe1e2a40(Di.Ri(str, true));
        c18021xd4495324.m81346x9bd24cae(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.fg(this, item));
        c18021xd4495324.m81347xb8b053db(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.gg(this, item));
        c18021xd4495324.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.hg(this, holder, item));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindCommentContentText", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindCommentReplyToNameText", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.via);
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.vib);
        android.widget.TextView textView4 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.vi_);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 b18 = item.b();
        r45.e86 a18 = item.a();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getReplyCommentNickNameWithSnsInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 f07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.pj()).f0(a18.f454667o);
        java.lang.String g27 = f07 == null ? a18.f454667o : f07.g2();
        if (b18 != null && b18.m70377x3172ed() && a18.f454667o.equals(b18.m70374x6bf53a6c())) {
            g27 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.t2.d(b18.m70354x74235b3e(), g27);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getReplyCommentNickNameWithSnsInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        if (g27 != null) {
            if (g27.length() > 0) {
                textView2.setVisibility(0);
                textView3.setVisibility(0);
                textView3.setText(g27);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView4);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetToWrapWidth", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
                android.view.ViewGroup.LayoutParams layoutParams = textView4.getLayoutParams();
                if (layoutParams != null) {
                    c44.a.o();
                    layoutParams.width = -2;
                    textView4.setLayoutParams(layoutParams);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetToWrapWidth", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetToWrapWidth", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
                android.view.ViewGroup.LayoutParams layoutParams2 = textView3.getLayoutParams();
                if (layoutParams2 != null) {
                    c44.a.o();
                    layoutParams2.width = -2;
                    textView3.setLayoutParams(layoutParams2);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetToWrapWidth", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
                java.lang.Object parent = textView4.getParent();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.View");
                android.view.View view = (android.view.View) parent;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("applyFoldingLogic", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
                view.post(new ad4.a0(view, textView4, textView3, textView2));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("applyFoldingLogic", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
                textView3.setOnClickListener(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.jg.f251045d);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindCommentReplyToNameText", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
            }
        }
        textView2.setVisibility(8);
        textView3.setVisibility(8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView4);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetToWrapWidth", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
        android.view.ViewGroup.LayoutParams layoutParams3 = textView4.getLayoutParams();
        if (layoutParams3 != null) {
            c44.a.o();
            layoutParams3.width = -2;
            textView4.setLayoutParams(layoutParams3);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetToWrapWidth", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
        textView3.setOnClickListener(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.jg.f251045d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindCommentReplyToNameText", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreateViewHolder", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.v8a);
        if (linearLayout != null) {
            com.p314xaae8f345.mm.ui.a4.e(linearLayout, true, false, 2, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreateViewHolder", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
    }

    @Override // in5.r
    public void k(in5.s0 holder) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onViewDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onViewDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onViewRecycled", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onViewRecycled", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
    }

    public final void n(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ei item, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportCmtBigPicExpandEvent", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        ta4.t tVar = new ta4.t();
        tVar.c(item.b());
        tVar.b(item.a());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsScene", "com.tencent.mm.plugin.sns.ui.SnsFeedComment");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsScene", "com.tencent.mm.plugin.sns.ui.SnsFeedComment");
        tVar.d(item.f249779i);
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportCmtBigPicUnfoldEvent", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
            java.util.Map t17 = kz5.c1.t(tVar.e());
            t17.put("view_id", "cmt_big_pic_unfold");
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            if (rVar != null) {
                tVar.a();
                ((cy1.a) rVar).Ej("view_clk", t17, 36244);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportCmtBigPicUnfoldEvent", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportCmtBigPicFoldEvent", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
            java.util.Map t18 = kz5.c1.t(tVar.e());
            t18.put("view_id", "cmt_big_pic_fold");
            dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
            if (rVar2 != null) {
                tVar.a();
                ((cy1.a) rVar2).Ej("view_clk", t18, 36244);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportCmtBigPicFoldEvent", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportCmtBigPicExpandEvent", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
    }
}
