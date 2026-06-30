package com.p314xaae8f345.mm.ui.p2642x2e06d1;

/* renamed from: com.tencent.mm.ui.base.CustomScrollView */
/* loaded from: classes9.dex */
public class C21469xdaa23983 extends android.widget.ScrollView {

    /* renamed from: d, reason: collision with root package name */
    public db5.i f278767d;

    public C21469xdaa23983(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public void onScrollChanged(int i17, int i18, int i19, int i27) {
        super.onScrollChanged(i17, i18, i19, i27);
        db5.i iVar = this.f278767d;
        if (iVar != null) {
            iVar.a(this, i17, i18, i19, i27);
        }
    }

    /* renamed from: setOnScrollChangeListener */
    public void m78870x945a8432(db5.i iVar) {
        this.f278767d = iVar;
    }

    public C21469xdaa23983(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
