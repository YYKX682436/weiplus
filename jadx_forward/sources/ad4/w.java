package ad4;

/* loaded from: classes4.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final ad4.w f84736a = new ad4.w();

    /* renamed from: b, reason: collision with root package name */
    public static android.view.animation.TranslateAnimation f84737b;

    /* renamed from: c, reason: collision with root package name */
    public static android.view.animation.TranslateAnimation f84738c;

    /* renamed from: d, reason: collision with root package name */
    public static android.widget.PopupWindow f84739d;

    /* renamed from: e, reason: collision with root package name */
    public static int f84740e;

    /* renamed from: f, reason: collision with root package name */
    public static int f84741f;

    public final void a(android.widget.LinearLayout linearLayout, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doWhileSendLiked", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        android.view.View findViewById = linearLayout.findViewById(com.p314xaae8f345.mm.R.id.f564402qc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageView");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById;
        android.view.animation.ScaleAnimation scaleAnimation = new android.view.animation.ScaleAnimation(1.0f, 1.5f, 1.0f, 1.5f, 1, 0.5f, 1, 0.5f);
        android.view.animation.ScaleAnimation scaleAnimation2 = new android.view.animation.ScaleAnimation(1.5f, 1.0f, 1.5f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(100L);
        scaleAnimation.setRepeatCount(0);
        scaleAnimation.setFillAfter(true);
        scaleAnimation2.setDuration(100L);
        scaleAnimation2.setRepeatCount(0);
        scaleAnimation2.setFillAfter(true);
        c22699x3dcdb352.clearAnimation();
        c22699x3dcdb352.startAnimation(scaleAnimation);
        scaleAnimation.setAnimationListener(new ad4.o(c22699x3dcdb352, scaleAnimation2));
        scaleAnimation2.setAnimationListener(new ad4.p(linearLayout, c17933xe8d1b226));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doWhileSendLiked", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
    }
}
