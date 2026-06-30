package iy2;

/* loaded from: classes13.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15488x2a0085b4 f377432d;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15488x2a0085b4 c15488x2a0085b4) {
        this.f377432d = c15488x2a0085b4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        iy2.b bVar = this.f377432d.C;
        if (bVar != null) {
            bVar.f377413s = 4;
            android.animation.ValueAnimator valueAnimator = bVar.f377414t;
            valueAnimator.cancel();
            valueAnimator.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
            valueAnimator.setDuration(1000L);
            valueAnimator.setRepeatCount(-1);
            valueAnimator.start();
        }
    }
}
