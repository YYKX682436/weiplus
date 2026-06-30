package p012xc85e97e9.p020x8ff2b28.p021x7299c0d5;

/* renamed from: androidx.browser.browseractions.BrowserActionsFallbackMenuView */
/* loaded from: classes2.dex */
public class C0104x990d249b extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final int f91296d;

    /* renamed from: e, reason: collision with root package name */
    public final int f91297e;

    public C0104x990d249b(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f91296d = getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561693q1);
        this.f91297e = getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561692q0);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(getResources().getDisplayMetrics().widthPixels - (this.f91296d * 2), this.f91297e), 1073741824), i18);
    }
}
