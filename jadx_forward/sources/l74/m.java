package l74;

/* loaded from: classes4.dex */
public final class m extends i74.i {

    /* renamed from: q, reason: collision with root package name */
    public final l74.k f398432q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f398433r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f398434s;

    /* renamed from: t, reason: collision with root package name */
    public int f398435t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i timelineClickListener) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timelineClickListener, "timelineClickListener");
        this.f371030m = timelineClickListener;
        this.f371024d = context;
        this.f398432q = new l74.k(context, this.f371029i, this);
        this.f371033p = this.f371024d.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.a_c);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FeedbackVer2PromptManager", "init, windowWith = " + this.f371033p);
        if (this.f371024d instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18022x27bfedac) {
            i74.a aVar = this.f371029i;
            aVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSource", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            aVar.f370990c = 1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSource", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        }
    }

    private final void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("ensurePopupWindow", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
        if (this.f371025e == null) {
            this.f371025e = new m74.b(this.f371024d);
        }
        m74.b bVar = this.f371025e;
        bVar.setContentView(this.f398433r ? l74.p.a(this.f371024d) : l74.p.b(this.f371024d));
        bVar.setWidth(this.f371033p);
        bVar.setHeight(-2);
        bVar.setFocusable(true);
        bVar.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        bVar.setOnDismissListener(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("ensurePopupWindow", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
    }

    @Override // i74.i, i74.l
    public void b(android.view.View view, int i17, java.lang.Object obj) {
        java.lang.Object m143895xf1229813;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAction", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FeedbackVer2PromptManager", "onAction, actionId: " + i17);
        if (this.f398434s) {
            super.b(view, i17, obj);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAction", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
            return;
        }
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            if (i17 == 1) {
                s();
            } else if (i17 == 2) {
                i();
            } else if (i17 == 3) {
                j();
            } else if (i17 == 8) {
                t();
            } else if (i17 == 9) {
                r();
            }
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
            ca4.q.c("FeedbackVer2PromptManager", p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813));
        }
        p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAction", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
    }

    @Override // i74.i
    public void n(int i17) {
        android.view.View view;
        android.view.View view2;
        android.view.View view3;
        android.view.View view4;
        android.view.View view5;
        android.view.View view6;
        android.view.View view7;
        android.view.View view8;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showArrowByWindowPosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
        l74.k kVar = this.f398432q;
        kVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showArrowByWindowPosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2Displayer");
        boolean z17 = i17 >= 0;
        if (kVar.f398425f) {
            if (z17) {
                l74.o oVar = kVar.f398427h;
                if (oVar != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTopArrowIcon", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
                    view7 = oVar.f398446a;
                    if (view7 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("topArrowIcon");
                        throw null;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTopArrowIcon", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
                } else {
                    view7 = null;
                }
                if (view7 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    android.view.View view9 = view7;
                    yj0.a.d(view9, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view7.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view9, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                l74.o oVar2 = kVar.f398427h;
                if (oVar2 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBottomArrowIcon", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
                    view8 = oVar2.f398447b;
                    if (view8 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bottomArrowIcon");
                        throw null;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBottomArrowIcon", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
                } else {
                    view8 = null;
                }
                if (view8 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    android.view.View view10 = view8;
                    yj0.a.d(view10, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view8.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view10, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                l74.o oVar3 = kVar.f398427h;
                if (oVar3 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTopArrowIcon", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
                    view5 = oVar3.f398446a;
                    if (view5 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("topArrowIcon");
                        throw null;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTopArrowIcon", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
                } else {
                    view5 = null;
                }
                if (view5 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    android.view.View view11 = view5;
                    yj0.a.d(view11, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view11, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                l74.o oVar4 = kVar.f398427h;
                if (oVar4 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBottomArrowIcon", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
                    view6 = oVar4.f398447b;
                    if (view6 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bottomArrowIcon");
                        throw null;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBottomArrowIcon", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
                } else {
                    view6 = null;
                }
                if (view6 != null) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                    arrayList4.add(0);
                    java.util.Collections.reverse(arrayList4);
                    android.view.View view12 = view6;
                    yj0.a.d(view12, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view6.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(view12, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        } else if (z17) {
            l74.n nVar = kVar.f398428i;
            if (nVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTopArrowIcon", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$FeedbackViewHolder");
                view3 = nVar.f398436a;
                if (view3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("topArrowIcon");
                    throw null;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTopArrowIcon", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$FeedbackViewHolder");
            } else {
                view3 = null;
            }
            if (view3 != null) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                android.view.View view13 = view3;
                yj0.a.d(view13, arrayList5.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view13, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            l74.n nVar2 = kVar.f398428i;
            if (nVar2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBottomArrowIcon", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$FeedbackViewHolder");
                view4 = nVar2.f398437b;
                if (view4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bottomArrowIcon");
                    throw null;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBottomArrowIcon", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$FeedbackViewHolder");
            } else {
                view4 = null;
            }
            if (view4 != null) {
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
                arrayList6.add(8);
                java.util.Collections.reverse(arrayList6);
                android.view.View view14 = view4;
                yj0.a.d(view14, arrayList6.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(view14, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            l74.n nVar3 = kVar.f398428i;
            if (nVar3 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTopArrowIcon", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$FeedbackViewHolder");
                view = nVar3.f398436a;
                if (view == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("topArrowIcon");
                    throw null;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTopArrowIcon", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$FeedbackViewHolder");
            } else {
                view = null;
            }
            if (view != null) {
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal7 = zj0.c.f554818a;
                arrayList7.add(8);
                java.util.Collections.reverse(arrayList7);
                android.view.View view15 = view;
                yj0.a.d(view15, arrayList7.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(view15, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            l74.n nVar4 = kVar.f398428i;
            if (nVar4 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBottomArrowIcon", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$FeedbackViewHolder");
                view2 = nVar4.f398437b;
                if (view2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bottomArrowIcon");
                    throw null;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBottomArrowIcon", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$FeedbackViewHolder");
            } else {
                view2 = null;
            }
            if (view2 != null) {
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal8 = zj0.c.f554818a;
                arrayList8.add(0);
                java.util.Collections.reverse(arrayList8);
                android.view.View view16 = view2;
                yj0.a.d(view16, arrayList8.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                yj0.a.f(view16, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showArrowByWindowPosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2Displayer");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showArrowByWindowPosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
    }

    @Override // i74.i
    public boolean o(android.view.View rawAnchor, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 snsInfo) {
        int i17;
        i74.a aVar = this.f371029i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showFeedback", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rawAnchor, "rawAnchor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsInfo, "snsInfo");
        this.f398434s = false;
        this.f398435t = 0;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            ca4.j g17 = g(rawAnchor);
            if (g17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FeedbackVer2PromptManager", "the unlike tag is null. there is no data for showing window!");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showFeedback", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
                return false;
            }
            aVar.q(g17, snsInfo);
            this.f398433r = aVar.p();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FeedbackVer2PromptManager", "showFeedBack, isPersonalizedSwitchView: " + this.f398433r);
            boolean z17 = this.f398433r;
            boolean z18 = this.f371032o;
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1612, 178);
                a84.t0.a(aVar.b(z18, 1556));
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1612, 205);
                a84.t0.a(aVar.b(z18, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.q.f33913x366c91de));
            }
            this.f371027g = h(rawAnchor);
            e();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FeedbackVer2PromptManager", "showFeedback, windows.hash=" + this.f371025e.hashCode());
            if (this.f371025e.isShowing()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showFeedback", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
                return true;
            }
            this.f398432q.e(this.f371025e.getContentView());
            int c17 = c(this.f371027g, this.f371025e.getContentView());
            n(c17);
            m74.b bVar = this.f371025e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAnimationStyle", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
            if (c17 < 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAnimationStyle", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
                i17 = com.p314xaae8f345.mm.R.C30868x68b1db1.f576075pp;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAnimationStyle", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
                i17 = com.p314xaae8f345.mm.R.C30868x68b1db1.f576076pq;
            }
            bVar.setAnimationStyle(i17);
            this.f371025e.showAsDropDown(this.f371027g, 0, c17, 8388613);
            m74.b bVar2 = this.f371025e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDimAccount", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDimAccount", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
            bVar2.a(0.5f);
            if (this.f398433r) {
                u();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showFeedback", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
            return true;
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            java.lang.Object m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
                ca4.q.c("catching_tag", p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813));
            }
            p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showFeedback", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
            return false;
        }
    }

    @Override // i74.i, android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDismiss", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
        l74.k kVar = this.f398432q;
        kVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCurrentMode", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2Displayer");
        int i17 = kVar.f398423d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrentMode", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2Displayer");
        if (i17 != this.f398435t) {
            boolean z17 = this.f371032o;
            i74.a aVar = this.f371029i;
            if (i17 == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1612, 181);
                a84.t0.a(aVar.b(z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.p.f33911x366c91de));
            } else if (i17 == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1612, 180);
                a84.t0.a(aVar.b(z17, 1558));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FeedbackVer2PromptManager", "request set PersonalizedAdSwitch, mode: " + i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("requestChangeMode", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FeedbackVer2PromptManager", "request set PersonalizedAdSwitch, mode: " + i17);
            if (i17 == 1 || i17 == 2) {
                r45.x75 x75Var = new r45.x75();
                x75Var.f471380d = i17;
                x75Var.b().l();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("requestChangeMode", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
        }
        this.f371025e = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDismiss", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
    }

    public final void r() {
        s34.p0 p0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l lVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLikedAd", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
        d();
        android.content.Context context = this.f371024d;
        i74.a aVar = this.f371029i;
        aVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLikedAdsClickAction", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 e17 = aVar.e();
        if (e17 == null || (lVar = e17.f38173x6320bd96) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLikedAdsClickAction", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            p0Var = null;
        } else {
            p0Var = lVar.f247574c;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLikedAdsClickAction", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        }
        n74.x.a(context, p0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1612, 207);
        a84.t0.a(aVar.b(this.f371032o, 1562));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLikedAd", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
    }

    public final void s() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onNoInterestingClick", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
        if (this.f371025e == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onNoInterestingClick", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
            return;
        }
        android.view.View findViewById = android.view.LayoutInflater.from(this.f371024d).inflate(this.f371026f, (android.view.ViewGroup) null).findViewById(com.p314xaae8f345.mm.R.id.n2o);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById);
        pm0.v.B(findViewById);
        android.view.View contentView = this.f371025e.getContentView();
        android.view.ViewGroup viewGroup = contentView instanceof android.view.ViewGroup ? (android.view.ViewGroup) contentView : null;
        android.view.KeyEvent.Callback childAt = viewGroup != null ? viewGroup.getChildAt(0) : null;
        android.view.ViewGroup viewGroup2 = childAt instanceof android.view.ViewGroup ? (android.view.ViewGroup) childAt : null;
        if (viewGroup2 != null) {
            viewGroup2.removeViewAt(1);
            viewGroup2.addView(findViewById, 1);
        }
        this.f371025e.getContentView().requestLayout();
        this.f398434s = true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setNoInterestingUI", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        i74.d dVar = this.f371028h;
        dVar.e(findViewById);
        if (findViewById.findViewById(com.p314xaae8f345.mm.R.id.n2t) != null) {
            dVar.c(findViewById.findViewById(com.p314xaae8f345.mm.R.id.n2t));
        }
        if (findViewById.findViewById(com.p314xaae8f345.mm.R.id.n2v) != null) {
            android.view.View findViewById2 = findViewById.findViewById(com.p314xaae8f345.mm.R.id.n2v);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/FeedbackPromptManager", "setNoInterestingUI", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/sns/ad/timeline/feedback/FeedbackPromptManager", "setNoInterestingUI", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setNoInterestingUI", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onNoInterestingClick", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
    }

    public final void t() {
        s34.p0 p0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l lVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onReason", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
        d();
        android.content.Context context = this.f371024d;
        i74.a aVar = this.f371029i;
        aVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getReceivedReasonClickAction", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 e17 = aVar.e();
        if (e17 == null || (lVar = e17.f38173x6320bd96) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getReceivedReasonClickAction", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            p0Var = null;
        } else {
            p0Var = lVar.f247573b;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getReceivedReasonClickAction", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        }
        n74.x.a(context, p0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1612, 206);
        a84.t0.a(aVar.b(this.f371032o, 1561));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onReason", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
    }

    public final void u() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("requestStatusAndUpdate", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FeedbackVer2PromptManager", "requestStatusAndUpdate");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        r45.x75 x75Var = new r45.x75();
        x75Var.f471380d = 3;
        pq5.g l17 = x75Var.b().l();
        android.content.Context context = this.f371024d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        l17.f((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).h(new l74.l(this, currentTimeMillis));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("requestStatusAndUpdate", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
    }
}
