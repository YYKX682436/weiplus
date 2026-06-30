package j84;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f379713a;

    /* renamed from: b, reason: collision with root package name */
    public final int f379714b;

    /* renamed from: c, reason: collision with root package name */
    public android.animation.ValueAnimator f379715c;

    /* renamed from: d, reason: collision with root package name */
    public android.animation.ValueAnimator f379716d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f379717e;

    /* renamed from: f, reason: collision with root package name */
    public float f379718f;

    /* renamed from: g, reason: collision with root package name */
    public float f379719g;

    /* renamed from: h, reason: collision with root package name */
    public float f379720h;

    /* renamed from: i, reason: collision with root package name */
    public j84.a f379721i;

    /* renamed from: j, reason: collision with root package name */
    public yz5.l f379722j;

    /* renamed from: k, reason: collision with root package name */
    public yz5.a f379723k;

    /* renamed from: l, reason: collision with root package name */
    public yz5.l f379724l;

    public f(int i17, int i18) {
        this.f379713a = i17;
        this.f379714b = i18;
    }

    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("cancelAllAnimations", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager");
        android.animation.ValueAnimator valueAnimator = this.f379715c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f379715c = null;
        android.animation.ValueAnimator valueAnimator2 = this.f379716d;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.f379716d = null;
        this.f379717e = false;
        this.f379721i = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cancelAllAnimations", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager");
    }
}
