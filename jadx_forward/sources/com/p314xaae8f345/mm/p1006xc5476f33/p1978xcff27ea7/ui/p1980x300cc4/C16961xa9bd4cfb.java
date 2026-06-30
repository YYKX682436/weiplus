package com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.p1980x300cc4;

/* renamed from: com.tencent.mm.plugin.recharge.ui.form.InstantAutoCompleteTextView */
/* loaded from: classes9.dex */
public class C16961xa9bd4cfb extends android.widget.AutoCompleteTextView {

    /* renamed from: d, reason: collision with root package name */
    public boolean f236693d;

    public C16961xa9bd4cfb(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        if (android.os.Build.VERSION.SDK_INT < 35 || !com.p314xaae8f345.mm.ui.b4.b(getContext())) {
            return;
        }
        setLocalePreferredLineHeightForMinimumUsed(false);
    }

    @Override // android.widget.AutoCompleteTextView
    public void dismissDropDown() {
        super.dismissDropDown();
    }

    @Override // android.widget.AutoCompleteTextView
    public boolean enoughToFilter() {
        return this.f236693d || super.enoughToFilter();
    }

    /* renamed from: setShowAlways */
    public void m67841x2bec6d6e(boolean z17) {
        this.f236693d = z17;
    }

    public C16961xa9bd4cfb(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        if (android.os.Build.VERSION.SDK_INT < 35 || !com.p314xaae8f345.mm.ui.b4.b(getContext())) {
            return;
        }
        setLocalePreferredLineHeightForMinimumUsed(false);
    }
}
