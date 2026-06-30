package sj5;

/* loaded from: classes10.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2734x9d861347.p2735x4fe3eeaf.C22478xb6499b94 f490453d;

    public g(com.p314xaae8f345.mm.ui.p2734x9d861347.p2735x4fe3eeaf.C22478xb6499b94 c22478xb6499b94) {
        this.f490453d = c22478xb6499b94;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2734x9d861347.p2735x4fe3eeaf.C22478xb6499b94 c22478xb6499b94 = this.f490453d;
        if (c22478xb6499b94.isDragging || c22478xb6499b94.getVisibility() == 8) {
            return;
        }
        c22478xb6499b94.animate().cancel();
        c22478xb6499b94.animate().withStartAction(new sj5.e(c22478xb6499b94)).alpha(0.0f).setDuration(100L).setInterpolator(new android.view.animation.LinearInterpolator()).withEndAction(new sj5.f(c22478xb6499b94)).start();
    }
}
