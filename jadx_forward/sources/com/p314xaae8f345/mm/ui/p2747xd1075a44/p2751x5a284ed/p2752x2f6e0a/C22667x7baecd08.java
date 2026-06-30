package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a;

/* renamed from: com.tencent.mm.ui.widget.cedit.edit.CustomEditText */
/* loaded from: classes15.dex */
public class C22667x7baecd08 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 {
    public C22667x7baecd08(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0, com.p314xaae8f345.mm.R.C30868x68b1db1.f575857jz);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023, android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
        return com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.C22667x7baecd08.class.getName();
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023
    /* renamed from: getDefaultEditable */
    public boolean mo81599xbafd298f() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023
    /* renamed from: getDefaultMovementMethod */
    public il5.a mo81600xd12d2d5b() {
        return com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22670xdaff81c6.m81817x9cf0d20b();
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023
    /* renamed from: getFreezesText */
    public boolean mo81601x590e5ad3() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023
    public void n0(java.lang.CharSequence charSequence, android.widget.TextView.BufferType bufferType) {
        super.n0(charSequence, android.widget.TextView.BufferType.EDITABLE);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023
    /* renamed from: setEllipsize */
    public void mo81603xb86dec4b(android.text.TextUtils.TruncateAt truncateAt) {
        if (truncateAt == android.text.TextUtils.TruncateAt.MARQUEE) {
            throw new java.lang.IllegalArgumentException("EditText cannot use the ellipsize mode TextUtils.TruncateAt.MARQUEE");
        }
        super.mo81603xb86dec4b(truncateAt);
    }

    /* renamed from: setSelection */
    public void mo81549xf579a34a(int i17) {
        android.text.Selection.setSelection(mo81602xfb85ada3(), i17);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023
    public boolean u0() {
        return false;
    }

    public C22667x7baecd08(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023
    /* renamed from: getText */
    public android.text.Editable mo81602xfb85ada3() {
        java.lang.CharSequence mo81602xfb85ada3 = super.mo81602xfb85ada3();
        if (mo81602xfb85ada3 == null) {
            return null;
        }
        if (mo81602xfb85ada3 instanceof android.text.Editable) {
            return (android.text.Editable) super.mo81602xfb85ada3();
        }
        super.n0(mo81602xfb85ada3, android.widget.TextView.BufferType.EDITABLE);
        return (android.text.Editable) super.mo81602xfb85ada3();
    }
}
