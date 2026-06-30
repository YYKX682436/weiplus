package com.p314xaae8f345.mm.ui.p2747xd1075a44;

/* renamed from: com.tencent.mm.ui.widget.MMBoundedRelativeLayout */
/* loaded from: classes3.dex */
public class C22616x6b787753 extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public int f292836d;

    /* renamed from: e, reason: collision with root package name */
    public int f292837e;

    public C22616x6b787753(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f292836d = context.obtainStyledAttributes(attributeSet, wm0.a.f528718c).getDimensionPixelSize(1, 0);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        int size = android.view.View.MeasureSpec.getSize(i17);
        int i19 = this.f292836d;
        if (i19 > 0 && i19 < size) {
            i17 = android.view.View.MeasureSpec.makeMeasureSpec(this.f292836d, android.view.View.MeasureSpec.getMode(i17));
        }
        int size2 = android.view.View.MeasureSpec.getSize(i18);
        int i27 = this.f292837e;
        if (i27 > 0 && i27 < size2) {
            i18 = android.view.View.MeasureSpec.makeMeasureSpec(this.f292837e, android.view.View.MeasureSpec.getMode(i18));
        }
        super.onMeasure(i17, i18);
    }

    /* renamed from: setMaxHeight */
    public void m81315x25bfb969(int i17) {
        this.f292837e = i17;
        requestLayout();
    }

    /* renamed from: setMaxWidth */
    public void m81316x8e6ff544(int i17) {
        this.f292836d = i17;
        requestLayout();
    }

    public C22616x6b787753(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f292836d = context.obtainStyledAttributes(attributeSet, wm0.a.f528718c).getDimensionPixelSize(1, 0);
    }
}
