package rp1;

/* loaded from: classes14.dex */
public class j1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f479966d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f479967e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f479968f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f479969g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout.LayoutParams f479970h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f479971i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f479972m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 f479973n;

    public j1(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 c12929x567537a0, boolean z17, boolean z18, int i17, int i18, android.widget.LinearLayout.LayoutParams layoutParams, boolean z19, boolean z27) {
        this.f479973n = c12929x567537a0;
        this.f479966d = z17;
        this.f479967e = z18;
        this.f479968f = i17;
        this.f479969g = i18;
        this.f479970h = layoutParams;
        this.f479971i = z19;
        this.f479972m = z27;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        super.onAnimationEnd(animator);
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 c12929x567537a0 = this.f479973n;
        c12929x567537a0.Z1 = true;
        boolean z17 = c12929x567537a0.Y1;
        boolean z18 = this.f479966d;
        if (z17) {
            c12929x567537a0.X1 = z18 ? c12929x567537a0.W1 : 1.0f;
            if (z18) {
                c12929x567537a0.setVisibility(8);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12925xf55305ed c12925xf55305ed = c12929x567537a0.L;
                if (c12925xf55305ed != null) {
                    c12925xf55305ed.b();
                }
            }
        }
        c12929x567537a0.F0(this.f479967e, z18, this.f479968f, this.f479969g);
        int i17 = c12929x567537a0.f175096x1 ? 8388611 : 8388613;
        android.widget.LinearLayout.LayoutParams layoutParams = this.f479970h;
        layoutParams.gravity = i17;
        c12929x567537a0.f175089t.setLayoutParams(layoutParams);
        android.view.WindowManager.LayoutParams layoutParams2 = (android.view.WindowManager.LayoutParams) c12929x567537a0.getLayoutParams();
        this.f479973n.f0(layoutParams2.x, layoutParams2.y, true, false, this.f479971i);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        super.onAnimationStart(animator);
        this.f479973n.f175092v.getVisibility();
        if (this.f479966d) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 c12929x567537a0 = this.f479973n;
            c12929x567537a0.D0(c12929x567537a0.f175096x1);
        }
        if (this.f479972m && !this.f479966d && this.f479973n.W() && this.f479973n.getVisibility() != 0) {
            super/*android.view.View*/.setAlpha(1.0f);
            ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: rp1.j1$$a
                @Override // java.lang.Runnable
                public final void run() {
                    super/*android.view.View*/.setVisibility(0);
                }
            });
        }
        if (this.f479972m) {
            this.f479973n.Z1 = true;
        }
    }
}
