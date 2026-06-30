package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class hx implements android.view.View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        long j17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.C;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        if (currentTimeMillis - j17 < 500) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$2");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$002", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.C = currentTimeMillis;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$002", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        android.content.Context context = view.getContext();
        if (view.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i2) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i2 i2Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i2) view.getTag();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720 = i2Var.f250082a;
            int i17 = c19807x593d1720.f39014x86965dde.f451370e;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d17202 = i2Var.f250082a;
            if (i17 == 18) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("adUrlClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.O(i2Var);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("goVideoPlayerForAdurl", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(i2Var.f250083b);
                i64.o1 o1Var = i64.o1.AdUrl;
                i64.s1.a(o1Var, i64.n1.EnterCompleteVideo, k17, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.A);
                android.content.Intent intent = new android.content.Intent();
                r45.jj4 jj4Var = c19807x593d17202.f39014x86965dde.f451373h.size() > 0 ? (r45.jj4) c19807x593d17202.f39014x86965dde.f451373h.get(0) : null;
                intent.putExtra("KFromTimeLine", false);
                intent.putExtra("KStremVideoUrl", c19807x593d17202.f39014x86965dde.f451372g);
                intent.putExtra("KSta_SourceType", 2);
                intent.putExtra("KSta_Scene", o1Var.f370802d);
                intent.putExtra("KSta_FromUserName", c19807x593d17202.f39018xf3f56116);
                intent.putExtra("KSta_SnSId", c19807x593d17202.Id);
                if (jj4Var == null) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fakeid_");
                    sb6.append(jj4Var == null ? c19807x593d17202.Id : jj4Var.f459388d);
                    intent.putExtra("KMediaId", sb6.toString());
                } else {
                    intent.putExtra("KMediaId", jj4Var.f459388d);
                }
                r45.tf6 tf6Var = c19807x593d17202.f39042x624074fb;
                if (tf6Var != null) {
                    intent.putExtra("KMediaVideoTime", tf6Var.f467913e);
                    intent.putExtra("StreamWording", tf6Var.f467914f);
                    intent.putExtra("StremWebUrl", tf6Var.f467915g);
                    intent.putExtra("KMediaTitle", tf6Var.f467916h);
                    intent.putExtra("KStremVideoUrl", tf6Var.f467912d);
                    intent.putExtra("KThumUrl", tf6Var.f467917i);
                    intent.putExtra("KSta_StremVideoAduxInfo", tf6Var.f467918m);
                    intent.putExtra("KSta_StremVideoPublishId", tf6Var.f467919n);
                }
                intent.putExtra("KSta_SnsStatExtStr", c19807x593d17202.f39040xbd345fc4);
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_landing_page_new_stream_video, 1) > 0) {
                    j45.l.j(context, "sns", ".ui.SnsAdStreamVideoPlayUI", intent, null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimeLineClickEvent", "use new stream video play UI");
                } else {
                    j45.l.j(context, "sns", ".ui.VideoAdPlayerUI", intent, null);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("goVideoPlayerForAdurl", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adUrlClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$2");
                return;
            }
            r45.y97 y97Var = c19807x593d1720.f39045x33feb8ea;
            if (y97Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y97Var.f472431d)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("webSearchClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.O(i2Var);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("goToWebSearchVideoListUI", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                r45.y97 y97Var2 = c19807x593d17202.f39045x33feb8ea;
                if (y97Var2 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y97Var2.f472431d)) {
                    mf0.z zVar = (mf0.z) i95.n0.c(mf0.z.class);
                    ((sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class))).getClass();
                    java.lang.String optString = su4.o2.d("discoverRecommendEntry").optString("wording");
                    ((lf0.u) zVar).getClass();
                    r45.un6 q17 = pm4.w.q(y97Var2, 31, optString);
                    ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
                    su4.r2.r(context, q17);
                    ((lf0.u) ((mf0.d0) i95.n0.c(mf0.d0.class))).getClass();
                    java.lang.String str = c19807x593d17202.f39018xf3f56116;
                    java.lang.String str2 = c19807x593d17202.Id;
                    java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("isShareClick=1&relevant_vid=");
                    stringBuffer.append(y97Var2.f472431d);
                    stringBuffer.append("&relevant_pre_searchid=");
                    stringBuffer.append(y97Var2.f472433f);
                    stringBuffer.append("&relevant_shared_openid=");
                    stringBuffer.append(y97Var2.f472434g);
                    stringBuffer.append("&rec_category=");
                    long j18 = y97Var2.f472448x;
                    if (j18 > 0) {
                        stringBuffer.append(j18);
                    } else {
                        stringBuffer.append(y97Var2.f472435h);
                    }
                    stringBuffer.append("&source=");
                    stringBuffer.append(y97Var2.f472443s);
                    stringBuffer.append("&fromUser=");
                    stringBuffer.append(str);
                    stringBuffer.append("&fromScene=3&targetInfo=");
                    stringBuffer.append(str2);
                    stringBuffer.append("&expand=");
                    stringBuffer.append(y97Var2.f472432e);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryReportApiLogic", "reportTopStoryClickShareItem 15371 %s", stringBuffer.toString());
                    r45.lq5 lq5Var = new r45.lq5();
                    lq5Var.f461289t = stringBuffer.toString();
                    gm0.j1.d().g(new su4.a2(lq5Var));
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("goToWebSearchVideoListUI", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("webSearchClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$2");
                return;
            }
            int i18 = c19807x593d1720.f39014x86965dde.f451370e;
            if (i18 == 28 || i18 == 50 || i18 == 59) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.u(context, i2Var);
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$2");
                return;
            }
            if (i18 == 36) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.t(context, i2Var);
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$2");
                return;
            }
            if (i18 == 34 || i18 == 45 || i18 == 43) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.r(context, i2Var, view);
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$2");
                return;
            }
            if (i18 == 29) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.v(context, i2Var);
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$2");
                return;
            }
            if (i18 == 37) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.q(context, i2Var);
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$2");
                return;
            }
            if (i18 == 38) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.p(context, i2Var);
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$2");
                return;
            }
            if (i18 == 53) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.s(context, i2Var);
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$2");
                return;
            }
            if (i18 == 39) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.o(context, i2Var);
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$2");
                return;
            }
            if (i18 == 44) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.G(context, i2Var);
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$2");
                return;
            }
            if (i18 == 46 || i18 == 51) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.D(context, i2Var);
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$2");
                return;
            }
            if (i18 == 52) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.M(context, i2Var);
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$2");
                return;
            }
            if ((i18 == 47 || i18 == 48) && !je4.g.c(context, c19807x593d1720, true)) {
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$2");
                return;
            }
            int i19 = c19807x593d1720.f39014x86965dde.f451370e;
            if (i19 == 55) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.F(context, i2Var);
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$2");
                return;
            } else {
                if (i19 == 56) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.i(context, i2Var);
                    yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$2");
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.N(context, i2Var, view, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.B, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.a());
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$2");
    }
}
