package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes3.dex */
public final class u7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f104681d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f104682e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f104683f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f104684g;

    public u7(java.lang.String str, long j17, int i17, int i18) {
        this.f104681d = str;
        this.f104682e = j17;
        this.f104683f = i17;
        this.f104684g = i18;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentRecommendLiveMicTopicConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("FinderFeedCommentRecommendLiveMicTopicConvert", "click recommend live mic topic action btn micTopic=" + this.f104681d + " feedId=" + this.f104682e);
        c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        long j17 = this.f104682e;
        java.lang.String str = this.f104681d;
        int i17 = this.f104683f;
        int i18 = this.f104684g;
        b92.d1 d1Var = (b92.d1) zbVar;
        d1Var.getClass();
        com.tencent.mars.xlog.Log.i("FinderCommonLiveService", "createLiveFromCommentMicTopic feedId=" + pm0.v.u(j17) + " micTopic=" + str + " commentCount=" + i17 + " commentScene=" + i18);
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.ui.MMFragmentActivity) context : null;
        if (mMFragmentActivity == null) {
            com.tencent.mars.xlog.Log.w("FinderCommonLiveService", "createLiveFromCommentMicTopic: context not MMFragmentActivity, abort");
        } else {
            d1Var.qj(false, "feedid_comment_area_star_banner", j17, i17, i18);
            com.tencent.mm.sdk.platformtools.o4 I0 = zl2.r4.f473950a.I0();
            boolean z17 = false;
            boolean z18 = I0.getBoolean("finder_comment_recommend_live_mic_topic_education_has_shown_v1", false);
            boolean booleanValue = ((java.lang.Boolean) ((lb2.j) ((jz5.n) ae2.in.F).getValue()).r()).booleanValue();
            if (z18 && !booleanValue) {
                z17 = true;
            }
            boolean z19 = z17;
            com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity2 = mMFragmentActivity;
            b92.b1 b1Var = new b92.b1(d1Var, mMFragmentActivity, str, j17, i17, i18);
            if (z19) {
                com.tencent.mars.xlog.Log.i("FinderCommonLiveService", "createLiveFromCommentMicTopic: education already shown, start live directly");
                b1Var.invoke();
            } else {
                com.tencent.mars.xlog.Log.i("FinderCommonLiveService", "createLiveFromCommentMicTopic: show education sheet (forceShow=" + booleanValue + " hasShown=" + z18 + ')');
                com.tencent.mm.plugin.finder.live.widget.mc mcVar = new com.tencent.mm.plugin.finder.live.widget.mc(mMFragmentActivity2, str, null, new b92.a1(booleanValue, I0, d1Var, j17, i17, i18, b1Var));
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("show education sheet, micTopic=");
                sb6.append(mcVar.f119062b);
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveCommentRecommendTopicEducationSheet", sb6.toString());
                ((com.tencent.mm.plugin.finder.view.e3) ((jz5.n) mcVar.f119064d).getValue()).i();
                d1Var.qj(true, "feedid_comment_area_star_go", j17, i17, i18);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentRecommendLiveMicTopicConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
