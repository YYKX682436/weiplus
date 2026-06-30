package mk4;

/* loaded from: classes14.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2281xc84b4196.C18686x59ce5768 f408677d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int[] f408678e;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2281xc84b4196.C18686x59ce5768 c18686x59ce5768, int[] iArr) {
        this.f408677d = c18686x59ce5768;
        this.f408678e = iArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jz5.f0 f0Var;
        mk4.h surfaceViewSwitchHelper = this.f408677d.getSurfaceViewSwitchHelper();
        if (surfaceViewSwitchHelper != null) {
            int[] iArr = this.f408678e;
            int i17 = iArr[0];
            int i18 = iArr[1];
            android.view.View findViewWithTag = surfaceViewSwitchHelper.f408687a.findViewWithTag("MMSurfaceViewSwitchHelper.COVER_VIEW");
            if (findViewWithTag != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(surfaceViewSwitchHelper.d(), "onSurfaceViewSizeChange [" + i17 + " x " + i18 + "] captureBitmap:" + surfaceViewSwitchHelper.f408691e + '.');
                android.view.ViewGroup.LayoutParams layoutParams = findViewWithTag.getLayoutParams();
                layoutParams.width = i17;
                layoutParams.height = i18;
                findViewWithTag.setLayoutParams(layoutParams);
                findViewWithTag.requestLayout();
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(surfaceViewSwitchHelper.d(), "onSurfaceViewSizeChange ignore captureBitmap:" + surfaceViewSwitchHelper.f408691e + '.');
            }
        }
    }
}
