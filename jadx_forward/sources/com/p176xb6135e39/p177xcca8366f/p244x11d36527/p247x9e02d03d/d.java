package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p247x9e02d03d;

/* loaded from: classes15.dex */
public class d extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public boolean f125909d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a f125910e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f125911f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f125912g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.p244x11d36527.p247x9e02d03d.C2685x7132985d f125913h;

    public d(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p247x9e02d03d.C2685x7132985d c2685x7132985d, p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a c0076xa566151a, int i17, boolean z17) {
        this.f125913h = c2685x7132985d;
        this.f125910e = c0076xa566151a;
        this.f125911f = i17;
        this.f125912g = z17;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f125909d = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        if (this.f125909d) {
            return;
        }
        int i17 = com.p176xb6135e39.p177xcca8366f.p244x11d36527.p247x9e02d03d.C2685x7132985d.B1;
        this.f125913h.y(this.f125910e, this.f125911f, this.f125912g);
    }
}
