package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2147x5f7cac22;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.interactionlabel.ShakeCoverAnimView */
/* loaded from: classes4.dex */
public class C17798x4367c7e7 extends android.view.ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f245119d;

    /* renamed from: e, reason: collision with root package name */
    public float f245120e;

    public C17798x4367c7e7(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLayout", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.ShakeCoverAnimView");
        int b17 = i65.a.b(getContext(), 32);
        if (this.f245119d == null) {
            android.view.View view = new android.view.View(getContext());
            this.f245119d = view;
            view.setLayoutParams(new android.view.ViewGroup.LayoutParams(b17, b17));
            this.f245119d.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b1a);
            addView(this.f245119d);
        }
        int measuredHeight = getMeasuredHeight();
        this.f245119d.layout(0, measuredHeight, b17 + 0, measuredHeight + b17);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        if (measuredWidth > 0 && measuredHeight2 > 0) {
            int i28 = b17 / 2;
            int i29 = measuredWidth - i28;
            int i37 = measuredHeight2 + i28;
            this.f245120e = ((float) ((java.lang.Math.sqrt((i29 * i29) + (i37 * i37)) * 2.0d) / b17)) + 0.5f;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLayout", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.ShakeCoverAnimView");
    }

    public C17798x4367c7e7(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
    }
}
