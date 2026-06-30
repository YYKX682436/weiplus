package wu3;

/* loaded from: classes15.dex */
public class p1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17047xc20d96b0 f531328d;

    public p1(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17047xc20d96b0 c17047xc20d96b0) {
        this.f531328d = c17047xc20d96b0;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17047xc20d96b0 c17047xc20d96b0 = this.f531328d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRecordButton", "startTransition, isDown: %s", java.lang.Boolean.valueOf(c17047xc20d96b0.f237579q));
        if (c17047xc20d96b0.f237579q) {
            c17047xc20d96b0.f237575m = true;
            android.view.ViewPropertyAnimator viewPropertyAnimator = c17047xc20d96b0.f237576n;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                c17047xc20d96b0.f237576n = null;
            }
            android.view.ViewPropertyAnimator animate = c17047xc20d96b0.f237571f.animate();
            float f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17047xc20d96b0.C;
            android.view.ViewPropertyAnimator scaleY = animate.scaleX(f17).scaleY(f17);
            c17047xc20d96b0.f237576n = scaleY;
            scaleY.setDuration(150L).start();
            if (c17047xc20d96b0.f237581s != c17047xc20d96b0.f237580r) {
                android.animation.ValueAnimator valueAnimator = c17047xc20d96b0.f237577o;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                android.animation.ObjectAnimator ofArgb = android.animation.ObjectAnimator.ofArgb(c17047xc20d96b0.f237583u, "color", c17047xc20d96b0.f237580r, c17047xc20d96b0.f237581s);
                c17047xc20d96b0.f237577o = ofArgb;
                ofArgb.setDuration(150L);
                c17047xc20d96b0.f237577o.start();
            }
        }
    }
}
