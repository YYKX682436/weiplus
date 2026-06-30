package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* renamed from: com.tencent.mm.plugin.textstatus.ui.MaxHeightLinearLayout */
/* loaded from: classes4.dex */
public class C18613xd703c9da extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public int f254988d;

    /* renamed from: e, reason: collision with root package name */
    public int f254989e;

    public C18613xd703c9da(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f254989e = -1;
        android.content.res.TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, zh4.o.f554518b, 0, 0);
        try {
            int integer = obtainStyledAttributes.getInteger(0, -1);
            this.f254988d = integer;
            if (integer != -1) {
                this.f254989e = i65.a.b(getContext(), this.f254988d);
            } else {
                this.f254989e = -1;
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, android.view.View.MeasureSpec.makeMeasureSpec(this.f254989e, Integer.MIN_VALUE));
    }

    /* renamed from: setMaxHeightDp */
    public void m71786xb4b70bd5(int i17) {
        this.f254988d = i17;
        if (i17 != -1) {
            this.f254989e = i65.a.b(getContext(), this.f254988d);
        } else {
            this.f254989e = -1;
        }
        invalidate();
    }

    /* renamed from: setMaxHeightPx */
    public void m71787xb4b70d51(int i17) {
        this.f254989e = i17;
        invalidate();
    }

    public C18613xd703c9da(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f254989e = -1;
    }
}
