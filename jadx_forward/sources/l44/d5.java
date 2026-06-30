package l44;

/* loaded from: classes4.dex */
public class d5 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f397620a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f397621b;

    /* renamed from: c, reason: collision with root package name */
    public android.animation.AnimatorSet f397622c;

    /* renamed from: d, reason: collision with root package name */
    public android.animation.AnimatorSet f397623d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f397624e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f397625f = false;

    public d5(android.view.View view, java.lang.Object obj, android.content.Context context, boolean z17, int i17, int i18) {
        int i19;
        java.lang.Object obj2;
        android.animation.ObjectAnimator ofFloat;
        this.f397620a = view;
        this.f397621b = obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initAnimators", "com.tencent.mm.plugin.sns.ad.helper.FlipCardAnimHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRoateInAnim", "com.tencent.mm.plugin.sns.ad.helper.FlipCardAnimHelper");
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat((java.lang.Object) null, "alpha", 1.0f, 0.0f);
        ofFloat2.setDuration(0L);
        android.animation.ObjectAnimator ofFloat3 = z17 ? android.animation.ObjectAnimator.ofFloat((java.lang.Object) null, "rotationY", -180.0f, 10.0f) : android.animation.ObjectAnimator.ofFloat((java.lang.Object) null, "rotationY", 180.0f, -10.0f);
        long j17 = i17;
        ofFloat3.setDuration(j17);
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat((java.lang.Object) null, "alpha", 0.0f, 1.0f);
        ofFloat4.setDuration(0L);
        long j18 = i17 / 2;
        ofFloat4.setStartDelay(j18);
        android.animation.ObjectAnimator ofFloat5 = z17 ? android.animation.ObjectAnimator.ofFloat((java.lang.Object) null, "rotationY", 10.0f, 0.0f) : android.animation.ObjectAnimator.ofFloat((java.lang.Object) null, "rotationY", -10.0f, 0.0f);
        ofFloat5.setDuration(j17);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.play(ofFloat2).with(ofFloat3).with(ofFloat4);
        animatorSet.play(ofFloat5).after(ofFloat3);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRoateInAnim", "com.tencent.mm.plugin.sns.ad.helper.FlipCardAnimHelper");
        this.f397622c = animatorSet;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRoateOutAnim", "com.tencent.mm.plugin.sns.ad.helper.FlipCardAnimHelper");
        if (z17) {
            i19 = 2;
            obj2 = null;
            ofFloat = android.animation.ObjectAnimator.ofFloat((java.lang.Object) null, "rotationY", 0.0f, 190.0f);
        } else {
            i19 = 2;
            obj2 = null;
            ofFloat = android.animation.ObjectAnimator.ofFloat((java.lang.Object) null, "rotationY", 0.0f, -190.0f);
        }
        ofFloat.setDuration(j17);
        float[] fArr = new float[i19];
        // fill-array-data instruction
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        android.animation.ObjectAnimator ofFloat6 = android.animation.ObjectAnimator.ofFloat(obj2, "alpha", fArr);
        ofFloat6.setDuration(0L);
        ofFloat6.setStartDelay(j18);
        android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
        animatorSet2.play(ofFloat).with(ofFloat6);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRoateOutAnim", "com.tencent.mm.plugin.sns.ad.helper.FlipCardAnimHelper");
        this.f397623d = animatorSet2;
        this.f397622c.addListener(new l44.b5(this));
        this.f397623d.addListener(new l44.c5(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initAnimators", "com.tencent.mm.plugin.sns.ad.helper.FlipCardAnimHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCameraDistance", "com.tencent.mm.plugin.sns.ad.helper.FlipCardAnimHelper");
        float f17 = view.getContext().getResources().getDisplayMetrics().density * i18;
        view.setCameraDistance(f17);
        if (obj instanceof android.view.View) {
            ((android.view.View) obj).setCameraDistance(f17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCameraDistance", "com.tencent.mm.plugin.sns.ad.helper.FlipCardAnimHelper");
    }

    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startFlip", "com.tencent.mm.plugin.sns.ad.helper.FlipCardAnimHelper");
        if (!this.f397625f) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("flipCard", "com.tencent.mm.plugin.sns.ad.helper.FlipCardAnimHelper");
            boolean z17 = this.f397624e;
            android.view.View view = this.f397620a;
            java.lang.Object obj = this.f397621b;
            if (z17) {
                this.f397622c.setTarget(obj);
                this.f397623d.setTarget(view);
                this.f397622c.start();
                this.f397623d.start();
                this.f397624e = false;
            } else {
                this.f397622c.setTarget(view);
                this.f397623d.setTarget(obj);
                this.f397622c.start();
                this.f397623d.start();
                this.f397624e = true;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("flipCard", "com.tencent.mm.plugin.sns.ad.helper.FlipCardAnimHelper");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startFlip", "com.tencent.mm.plugin.sns.ad.helper.FlipCardAnimHelper");
    }
}
