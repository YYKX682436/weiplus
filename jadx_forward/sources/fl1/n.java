package fl1;

/* loaded from: classes7.dex */
public final class n implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f345342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fl1.o f345343e;

    public n(double d17, fl1.o oVar) {
        this.f345342d = d17;
        this.f345343e = oVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.view.View m8007x6a486239;
        double d17 = this.f345342d;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            fl1.o oVar = this.f345343e;
            if (d17 <= 0.0d) {
                oVar.f345360r.m52925x25bfb969(i17);
                oVar.f345360r.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                return;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = oVar.f345360r.getLayoutManager();
            int dimensionPixelSize = (layoutManager == null || (m8007x6a486239 = layoutManager.m8007x6a486239(i18)) == null) ? oVar.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561654om) : m8007x6a486239.getMeasuredHeight();
            if (d17 < 1.0d) {
                dimensionPixelSize = (int) (dimensionPixelSize * d17);
            }
            i17 += dimensionPixelSize;
            d17 -= 1.0d;
            i18++;
        }
    }
}
