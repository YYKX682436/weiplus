package l74;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f398420a;

    /* renamed from: b, reason: collision with root package name */
    public final i74.a f398421b;

    /* renamed from: c, reason: collision with root package name */
    public final i74.l f398422c;

    /* renamed from: d, reason: collision with root package name */
    public int f398423d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f398424e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f398425f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f398426g;

    /* renamed from: h, reason: collision with root package name */
    public l74.o f398427h;

    /* renamed from: i, reason: collision with root package name */
    public l74.n f398428i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f398429j;

    public k(android.content.Context mContext, i74.a aVar, i74.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mContext, "mContext");
        this.f398420a = mContext;
        this.f398421b = aVar;
        this.f398422c = lVar;
        this.f398429j = true;
    }

    public static final /* synthetic */ android.view.View a(l74.k kVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMContentView$p", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2Displayer");
        android.view.View view = kVar.f398424e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMContentView$p", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2Displayer");
        return view;
    }

    public static final /* synthetic */ i74.l b(l74.k kVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMFeedbackController$p", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2Displayer");
        i74.l lVar = kVar.f398422c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMFeedbackController$p", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2Displayer");
        return lVar;
    }

    public final void c(int i17) {
        java.lang.String str;
        l74.o oVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSwitchUIStatus", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2Displayer");
        this.f398423d = i17;
        l74.o oVar2 = this.f398427h;
        if (oVar2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPersonalizedTitleView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
            android.view.View view = oVar2.f398450e;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("personalizedTitleView");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPersonalizedTitleView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
            c44.a.n();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "setSwitchUIStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "setSwitchUIStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPersonalizedDesView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
            android.view.View view2 = oVar2.f398451f;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("personalizedDesView");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPersonalizedDesView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
            c44.a.n();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "setSwitchUIStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "setSwitchUIStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRandomTitleView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
            android.view.View view3 = oVar2.f398459n;
            if (view3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("randomTitleView");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRandomTitleView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
            c44.a.n();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "setSwitchUIStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "setSwitchUIStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRandomDescView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
            android.view.View view4 = oVar2.f398460o;
            if (view4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("randomDescView");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRandomDescView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
            c44.a.n();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "setSwitchUIStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "setSwitchUIStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPersonalizedTitleLoadingMask", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
            android.view.View view5 = oVar2.f398452g;
            if (view5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("personalizedTitleLoadingMask");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPersonalizedTitleLoadingMask", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
            c44.a.c();
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "setSwitchUIStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "setSwitchUIStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPersonalizedDescLoadingMask", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
            android.view.View view6 = oVar2.f398453h;
            if (view6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("personalizedDescLoadingMask");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPersonalizedDescLoadingMask", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
            c44.a.c();
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "setSwitchUIStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "setSwitchUIStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRandomTitleLoadingMask", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
            android.view.View view7 = oVar2.f398461p;
            if (view7 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("randomTitleLoadingMask");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRandomTitleLoadingMask", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
            c44.a.c();
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "setSwitchUIStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "setSwitchUIStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRandomDescLoadingMask", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
            android.view.View view8 = oVar2.f398462q;
            if (view8 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("randomDescLoadingMask");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRandomDescLoadingMask", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
            c44.a.c();
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(8);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "setSwitchUIStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "setSwitchUIStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.content.Context context = this.f398420a;
            if (1 == i17) {
                l74.o oVar3 = this.f398427h;
                if (oVar3 != null) {
                    oVar3.d().setBackgroundColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77744x91fa6289));
                    oVar3.c().setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d8v);
                    oVar3.h().setBackgroundColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77626xb498cd1b));
                    oVar3.g().setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d8u);
                    if (this.f398429j) {
                        android.view.View b17 = oVar3.b();
                        c44.a.n();
                        java.util.ArrayList arrayList9 = new java.util.ArrayList();
                        arrayList9.add(0);
                        java.util.Collections.reverse(arrayList9);
                        yj0.a.d(b17, arrayList9.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "setSwitchUIStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        b17.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                        yj0.a.f(b17, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "setSwitchUIStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        android.view.View f17 = oVar3.f();
                        c44.a.k();
                        java.util.ArrayList arrayList10 = new java.util.ArrayList();
                        arrayList10.add(4);
                        java.util.Collections.reverse(arrayList10);
                        yj0.a.d(f17, arrayList10.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "setSwitchUIStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        f17.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
                        yj0.a.f(f17, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "setSwitchUIStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            } else if (2 == i17 && (oVar = this.f398427h) != null) {
                oVar.h().setBackgroundColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77744x91fa6289, context.getTheme()));
                oVar.g().setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d8v);
                oVar.d().setBackgroundColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77626xb498cd1b, context.getTheme()));
                oVar.c().setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d8u);
                if (this.f398429j) {
                    android.view.View f18 = oVar.f();
                    c44.a.n();
                    java.util.ArrayList arrayList11 = new java.util.ArrayList();
                    arrayList11.add(0);
                    java.util.Collections.reverse(arrayList11);
                    yj0.a.d(f18, arrayList11.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "setSwitchUIStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    f18.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
                    yj0.a.f(f18, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "setSwitchUIStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View b18 = oVar.b();
                    c44.a.k();
                    java.util.ArrayList arrayList12 = new java.util.ArrayList();
                    arrayList12.add(4);
                    java.util.Collections.reverse(arrayList12);
                    yj0.a.d(b18, arrayList12.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "setSwitchUIStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    b18.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
                    yj0.a.f(b18, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "setSwitchUIStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            str = "setSwitchUIStatus";
        } else {
            str = "setSwitchUIStatus";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2Displayer");
    }

    public final void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateFeedbackViewUIStatus", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2Displayer");
        if (this.f398425f) {
            l74.o oVar = this.f398427h;
            if (oVar != null) {
                if (this.f398426g) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSpaceView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
                    android.view.View view = oVar.f398467v;
                    if (view == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("spaceView");
                        throw null;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSpaceView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "updateFeedbackViewUIStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "updateFeedbackViewUIStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View a17 = oVar.a();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(a17, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "updateFeedbackViewUIStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    a17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(a17, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "updateFeedbackViewUIStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSpaceView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
                    android.view.View view2 = oVar.f398467v;
                    if (view2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("spaceView");
                        throw null;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSpaceView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList3.add(0);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "updateFeedbackViewUIStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "updateFeedbackViewUIStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View a18 = oVar.a();
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(0);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(a18, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "updateFeedbackViewUIStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    a18.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(a18, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "updateFeedbackViewUIStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        } else {
            l74.n nVar = this.f398428i;
            if (nVar != null) {
                if (this.f398426g) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSpaceView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$FeedbackViewHolder");
                    android.view.View view3 = nVar.f398442g;
                    if (view3 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("spaceView");
                        throw null;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSpaceView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$FeedbackViewHolder");
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                    arrayList5.add(8);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(view3, arrayList5.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "updateFeedbackViewUIStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "updateFeedbackViewUIStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View a19 = nVar.a();
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    arrayList6.add(8);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(a19, arrayList6.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "updateFeedbackViewUIStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    a19.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(a19, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "updateFeedbackViewUIStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSpaceView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$FeedbackViewHolder");
                    android.view.View view4 = nVar.f398442g;
                    if (view4 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("spaceView");
                        throw null;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSpaceView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$FeedbackViewHolder");
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                    arrayList7.add(0);
                    java.util.Collections.reverse(arrayList7);
                    yj0.a.d(view4, arrayList7.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "updateFeedbackViewUIStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "updateFeedbackViewUIStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View a27 = nVar.a();
                    java.util.ArrayList arrayList8 = new java.util.ArrayList();
                    arrayList8.add(0);
                    java.util.Collections.reverse(arrayList8);
                    yj0.a.d(a27, arrayList8.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "updateFeedbackViewUIStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    a27.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                    yj0.a.f(a27, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "updateFeedbackViewUIStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateFeedbackViewUIStatus", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2Displayer");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r5 != true) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(android.view.View r31) {
        /*
            Method dump skipped, instructions count: 1479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l74.k.e(android.view.View):void");
    }
}
