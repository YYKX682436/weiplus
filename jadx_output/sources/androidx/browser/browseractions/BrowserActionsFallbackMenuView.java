package androidx.browser.browseractions;

/* loaded from: classes2.dex */
public class BrowserActionsFallbackMenuView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final int f9763d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9764e;

    public BrowserActionsFallbackMenuView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9763d = getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f480160q1);
        this.f9764e = getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f480159q0);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(getResources().getDisplayMetrics().widthPixels - (this.f9763d * 2), this.f9764e), 1073741824), i18);
    }
}
