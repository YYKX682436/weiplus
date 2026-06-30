package ad4;

/* loaded from: classes4.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final ad4.w f3203a = new ad4.w();

    /* renamed from: b, reason: collision with root package name */
    public static android.view.animation.TranslateAnimation f3204b;

    /* renamed from: c, reason: collision with root package name */
    public static android.view.animation.TranslateAnimation f3205c;

    /* renamed from: d, reason: collision with root package name */
    public static android.widget.PopupWindow f3206d;

    /* renamed from: e, reason: collision with root package name */
    public static int f3207e;

    /* renamed from: f, reason: collision with root package name */
    public static int f3208f;

    public final void a(android.widget.LinearLayout linearLayout, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doWhileSendLiked", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        android.view.View findViewById = linearLayout.findViewById(com.tencent.mm.R.id.f482869qc);
        kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageView");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById;
        android.view.animation.ScaleAnimation scaleAnimation = new android.view.animation.ScaleAnimation(1.0f, 1.5f, 1.0f, 1.5f, 1, 0.5f, 1, 0.5f);
        android.view.animation.ScaleAnimation scaleAnimation2 = new android.view.animation.ScaleAnimation(1.5f, 1.0f, 1.5f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(100L);
        scaleAnimation.setRepeatCount(0);
        scaleAnimation.setFillAfter(true);
        scaleAnimation2.setDuration(100L);
        scaleAnimation2.setRepeatCount(0);
        scaleAnimation2.setFillAfter(true);
        weImageView.clearAnimation();
        weImageView.startAnimation(scaleAnimation);
        scaleAnimation.setAnimationListener(new ad4.o(weImageView, scaleAnimation2));
        scaleAnimation2.setAnimationListener(new ad4.p(linearLayout, snsInfo));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doWhileSendLiked", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
    }
}
