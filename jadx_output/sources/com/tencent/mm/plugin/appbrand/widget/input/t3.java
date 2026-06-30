package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public final class t3 extends android.widget.FrameLayout implements com.tencent.mm.plugin.appbrand.widget.input.n3 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f91662d;

    public t3(android.content.Context context) {
        super(context);
        this.f91662d = false;
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488147ih, this);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.n3
    public void a(boolean z17) {
        boolean z18 = z17 != this.f91662d;
        this.f91662d = z17;
        if (!z18 || isInLayout()) {
            return;
        }
        requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        if (this.f91662d || !isShown()) {
            int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 1073741824);
            i18 = android.view.View.MeasureSpec.makeMeasureSpec(0, 1073741824);
            i17 = makeMeasureSpec;
        }
        super.onMeasure(i17, i18);
    }
}
