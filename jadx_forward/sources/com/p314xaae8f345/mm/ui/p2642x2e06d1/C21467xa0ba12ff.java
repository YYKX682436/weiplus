package com.p314xaae8f345.mm.ui.p2642x2e06d1;

/* renamed from: com.tencent.mm.ui.base.AuthorizeItemListView */
/* loaded from: classes4.dex */
public class C21467xa0ba12ff extends android.widget.ListView {

    /* renamed from: d, reason: collision with root package name */
    public int f278765d;

    public C21467xa0ba12ff(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i17, int i18) {
        if (this.f278765d <= 5) {
            super.onMeasure(i17, android.view.View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
        } else {
            super.onMeasure(i17, i18);
        }
    }

    public C21467xa0ba12ff(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
