package l44;

/* loaded from: classes4.dex */
public class s5 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f397879a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f397880b;

    /* renamed from: c, reason: collision with root package name */
    public android.animation.AnimatorSet f397881c;

    /* renamed from: d, reason: collision with root package name */
    public android.animation.AnimatorSet f397882d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f397883e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f397884f = false;

    /* renamed from: g, reason: collision with root package name */
    public l44.r5 f397885g;

    public s5(android.view.View view, java.lang.Object obj, android.content.Context context, boolean z17, int i17, int i18) {
        int i19;
        java.lang.Object obj2;
        android.animation.ObjectAnimator ofFloat;
        this.f397879a = view;
        this.f397880b = obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initAnimators", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRoateInAnim", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat((java.lang.Object) null, "alpha", 1.0f, 0.0f);
        ofFloat2.setDuration(0L);
        android.animation.ObjectAnimator ofFloat3 = z17 ? android.animation.ObjectAnimator.ofFloat((java.lang.Object) null, "rotationY", -180.0f, 0.0f) : android.animation.ObjectAnimator.ofFloat((java.lang.Object) null, "rotationY", 180.0f, 0.0f);
        long j17 = i17;
        ofFloat3.setDuration(j17);
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat((java.lang.Object) null, "alpha", 0.0f, 1.0f);
        ofFloat4.setDuration(0L);
        long j18 = i17 / 2;
        ofFloat4.setStartDelay(j18);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.play(ofFloat2).with(ofFloat3).with(ofFloat4);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRoateInAnim", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
        this.f397881c = animatorSet;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRoateOutAnim", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
        if (z17) {
            i19 = 2;
            obj2 = null;
            ofFloat = android.animation.ObjectAnimator.ofFloat((java.lang.Object) null, "rotationY", 0.0f, 180.0f);
        } else {
            i19 = 2;
            obj2 = null;
            ofFloat = android.animation.ObjectAnimator.ofFloat((java.lang.Object) null, "rotationY", 0.0f, -180.0f);
        }
        ofFloat.setDuration(j17);
        float[] fArr = new float[i19];
        // fill-array-data instruction
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat(obj2, "alpha", fArr);
        ofFloat5.setDuration(0L);
        ofFloat5.setStartDelay(j18);
        android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
        animatorSet2.play(ofFloat).with(ofFloat5);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRoateOutAnim", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
        this.f397882d = animatorSet2;
        this.f397881c.addListener(new l44.p5(this));
        this.f397882d.addListener(new l44.q5(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initAnimators", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCameraDistance", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
        float f17 = view.getContext().getResources().getDisplayMetrics().density * i18;
        view.setCameraDistance(f17);
        if (obj instanceof android.view.View) {
            ((android.view.View) obj).setCameraDistance(f17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCameraDistance", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
    }

    public static /* synthetic */ l44.r5 a(l44.s5 s5Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
        l44.r5 r5Var = s5Var.f397885g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
        return r5Var;
    }

    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startFlip", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
        if (!this.f397884f) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("flipCard", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
            boolean z17 = this.f397883e;
            android.view.View view = this.f397879a;
            java.lang.Object obj = this.f397880b;
            if (z17) {
                this.f397881c.setTarget(obj);
                this.f397882d.setTarget(view);
                this.f397881c.start();
                this.f397882d.start();
                this.f397883e = false;
            } else {
                this.f397881c.setTarget(view);
                this.f397882d.setTarget(obj);
                this.f397881c.start();
                this.f397882d.start();
                this.f397883e = true;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("flipCard", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startFlip", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
    }
}
