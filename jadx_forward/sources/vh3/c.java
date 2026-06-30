package vh3;

/* loaded from: classes14.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1872xc84b4196.C16525x59ce5768 f518576d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int[] f518577e;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1872xc84b4196.C16525x59ce5768 c16525x59ce5768, int[] iArr) {
        this.f518576d = c16525x59ce5768;
        this.f518577e = iArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jz5.f0 f0Var;
        a01.d surfaceViewSwitchHelper = this.f518576d.getSurfaceViewSwitchHelper();
        if (surfaceViewSwitchHelper != null) {
            int[] iArr = this.f518577e;
            int i17 = iArr[0];
            int i18 = iArr[1];
            android.view.View findViewWithTag = surfaceViewSwitchHelper.f81902a.findViewWithTag("MMSurfaceViewSwitchHelper.COVER_VIEW");
            if (findViewWithTag != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(surfaceViewSwitchHelper.b(), "onSurfaceViewSizeChange [" + i17 + " x " + i18 + "] captureBitmap:" + surfaceViewSwitchHelper.f81906e + '.');
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
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(surfaceViewSwitchHelper.b(), "onSurfaceViewSizeChange ignore captureBitmap:" + surfaceViewSwitchHelper.f81906e + '.');
            }
        }
    }
}
