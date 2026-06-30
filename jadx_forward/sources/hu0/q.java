package hu0;

/* loaded from: classes.dex */
public final class q implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f366583d;

    public q(android.widget.FrameLayout frameLayout) {
        this.f366583d = frameLayout;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        int i17;
        int i18;
        android.widget.FrameLayout frameLayout = this.f366583d;
        android.view.ViewTreeObserver viewTreeObserver = frameLayout.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
        int width = frameLayout.getWidth();
        int height = frameLayout.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        int i19 = (height * 9) / 16;
        if (i19 <= width) {
            i17 = (i19 / 9) * 9;
            i18 = (i17 * 16) / 9;
        } else {
            i17 = (width / 9) * 9;
            i18 = (i17 * 16) / 9;
        }
        if (i17 <= 0 || i18 <= 0) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams2 = layoutParams instanceof p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams ? (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return;
        }
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).width = i17;
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).height = i18;
        frameLayout.setLayoutParams(layoutParams2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.RenderUIC", "applyExact916Aspect: available=" + width + 'x' + height + ", exact=" + i17 + 'x' + i18 + ", ratio=" + (i17 / i18));
    }
}
