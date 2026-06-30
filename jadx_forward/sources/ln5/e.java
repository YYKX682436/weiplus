package ln5;

/* loaded from: classes15.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 f401459d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f401460e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f401461f;

    public e(com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x22587864, int i17, boolean z17) {
        this.f401459d = c22851x22587864;
        this.f401460e = i17;
        this.f401461f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener;
        android.animation.ValueAnimator valueAnimator;
        com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x22587864 = this.f401459d;
        if (!c22851x22587864.m82914x4c6bcf83().f411733j || this.f401460e >= 0) {
            animatorUpdateListener = null;
        } else {
            on5.b contentPlugin = c22851x22587864.getContentPlugin();
            animatorUpdateListener = contentPlugin != null ? contentPlugin.a(c22851x22587864.m82913x4b20af2f().f411742b) : null;
            if (animatorUpdateListener != null) {
                animatorUpdateListener.onAnimationUpdate(android.animation.ValueAnimator.ofInt(0, 0));
            }
        }
        boolean z17 = this.f401461f;
        ln5.d dVar = new ln5.d(c22851x22587864, z17);
        if (c22851x22587864.m82913x4b20af2f().f411742b > 0) {
            valueAnimator = c22851x22587864.b(0);
        } else {
            if (animatorUpdateListener != null || c22851x22587864.m82913x4b20af2f().f411742b == 0) {
                c22851x22587864.A.b();
                c22851x22587864.s(0, false);
                c22851x22587864.f295271h.e(sn5.b.f491690p);
            } else if (!z17 || !c22851x22587864.m82914x4c6bcf83().f411731h) {
                valueAnimator = c22851x22587864.b(0);
            } else if (c22851x22587864.m82913x4b20af2f().f411742b >= (-c22851x22587864.m82917x1ebfd733().f411764a)) {
                c22851x22587864.f295271h.c(sn5.b.f491690p);
            } else {
                valueAnimator = c22851x22587864.b(-c22851x22587864.m82917x1ebfd733().f411764a);
            }
            valueAnimator = null;
        }
        if (valueAnimator != null) {
            valueAnimator.addListener(dVar);
        } else {
            dVar.b(null);
        }
    }
}
