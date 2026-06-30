package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes3.dex */
public final class u7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186214d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f186215e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f186216f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f186217g;

    public u7(java.lang.String str, long j17, int i17, int i18) {
        this.f186214d = str;
        this.f186215e = j17;
        this.f186216f = i17;
        this.f186217g = i18;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentRecommendLiveMicTopicConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedCommentRecommendLiveMicTopicConvert", "click recommend live mic topic action btn micTopic=" + this.f186214d + " feedId=" + this.f186215e);
        c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        long j17 = this.f186215e;
        java.lang.String str = this.f186214d;
        int i17 = this.f186216f;
        int i18 = this.f186217g;
        b92.d1 d1Var = (b92.d1) zbVar;
        d1Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCommonLiveService", "createLiveFromCommentMicTopic feedId=" + pm0.v.u(j17) + " micTopic=" + str + " commentCount=" + i17 + " commentScene=" + i18);
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) context : null;
        if (activityC21401x6ce6f73f == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderCommonLiveService", "createLiveFromCommentMicTopic: context not MMFragmentActivity, abort");
        } else {
            d1Var.qj(false, "feedid_comment_area_star_banner", j17, i17, i18);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 I0 = zl2.r4.f555483a.I0();
            boolean z17 = false;
            boolean z18 = I0.getBoolean("finder_comment_recommend_live_mic_topic_education_has_shown_v1", false);
            boolean booleanValue = ((java.lang.Boolean) ((lb2.j) ((jz5.n) ae2.in.F).mo141623x754a37bb()).r()).booleanValue();
            if (z18 && !booleanValue) {
                z17 = true;
            }
            boolean z19 = z17;
            com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f2 = activityC21401x6ce6f73f;
            b92.b1 b1Var = new b92.b1(d1Var, activityC21401x6ce6f73f, str, j17, i17, i18);
            if (z19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCommonLiveService", "createLiveFromCommentMicTopic: education already shown, start live directly");
                b1Var.mo152xb9724478();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCommonLiveService", "createLiveFromCommentMicTopic: show education sheet (forceShow=" + booleanValue + " hasShown=" + z18 + ')');
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.mc mcVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.mc(activityC21401x6ce6f73f2, str, null, new b92.a1(booleanValue, I0, d1Var, j17, i17, i18, b1Var));
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("show education sheet, micTopic=");
                sb6.append(mcVar.f200595b);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveCommentRecommendTopicEducationSheet", sb6.toString());
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3) ((jz5.n) mcVar.f200597d).mo141623x754a37bb()).i();
                d1Var.qj(true, "feedid_comment_area_star_go", j17, i17, i18);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentRecommendLiveMicTopicConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
