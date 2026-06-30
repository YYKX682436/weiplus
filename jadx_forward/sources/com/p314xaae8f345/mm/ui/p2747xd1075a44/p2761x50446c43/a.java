package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43;

/* loaded from: classes11.dex */
public class a extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f293707d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f293708e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f293709f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a f293710g;

    public a(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a c22702xa9a9ae2a, int i17, int i18, boolean z17) {
        this.f293710g = c22702xa9a9ae2a;
        this.f293707d = i17;
        this.f293708e = i18;
        this.f293709f = z17;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        super.onAnimationCancel(animator);
        com.p314xaae8f345.mm.ui.yk.c("MicroMsg.PullDownListView", "onAnimationCancel ", new java.lang.Object[0]);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        int i17 = this.f293707d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a.f293679y1;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a c22702xa9a9ae2a = this.f293710g;
        com.p314xaae8f345.mm.ui.yk.c("MicroMsg.PullDownListView", "onAnimationEnd start:%s, openLimitPx():%s, closeLimitPx():%s", valueOf, java.lang.Integer.valueOf(c22702xa9a9ae2a.g()), java.lang.Integer.valueOf(c22702xa9a9ae2a.c()));
        c22702xa9a9ae2a.I = false;
        c22702xa9a9ae2a.K = false;
        c22702xa9a9ae2a.L = false;
        c22702xa9a9ae2a.M = false;
        if (c22702xa9a9ae2a.f293706z == null || i17 <= c22702xa9a9ae2a.g() || i17 >= c22702xa9a9ae2a.c()) {
            return;
        }
        if (!c22702xa9a9ae2a.f293680J) {
            c22702xa9a9ae2a.f293706z.mo14952xd2370609(this.f293709f);
        } else {
            c22702xa9a9ae2a.f293706z.mo14951x73fef619();
            android.view.View view = c22702xa9a9ae2a.F;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        int i17 = this.f293707d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a.f293679y1;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a c22702xa9a9ae2a = this.f293710g;
        com.p314xaae8f345.mm.ui.yk.c("MicroMsg.PullDownListView", "onAnimationStart start:%s, openLimitPx():%s, closeLimitPx():%s", valueOf, java.lang.Integer.valueOf(c22702xa9a9ae2a.g()), java.lang.Integer.valueOf(c22702xa9a9ae2a.c()));
        c22702xa9a9ae2a.K = true;
        if (this.f293708e == 0) {
            c22702xa9a9ae2a.f293680J = true;
        } else {
            c22702xa9a9ae2a.f293680J = false;
        }
        if (c22702xa9a9ae2a.f293706z == null || i17 <= c22702xa9a9ae2a.g() || i17 >= c22702xa9a9ae2a.c()) {
            return;
        }
        if (c22702xa9a9ae2a.f293680J) {
            c22702xa9a9ae2a.f293706z.mo14953x56608c14();
        } else {
            c22702xa9a9ae2a.f293706z.mo14954x3c9d44ae();
        }
    }
}
