package com.p314xaae8f345.mm.ui.p2747xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B%\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/ui/widget/PrefixEditText;", "Lcom/tencent/mm/ui/widget/MMEditText;", "", com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, "Ljz5/f0;", "setTextWithNoTextWatcher", "Landroid/text/SpannableString;", "setTextSpanWithNoTextWatcher", "", ya.b.f77479x42930b2, "setSelection", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.widget.PrefixEditText */
/* loaded from: classes5.dex */
public final class C22635x3d684329 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 {
    public final java.lang.String G;

    public C22635x3d684329(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.G = "";
    }

    /* renamed from: setTextSpanWithNoTextWatcher */
    private final void m81411xd8cb7c8f(android.text.SpannableString spannableString) {
    }

    /* renamed from: setTextWithNoTextWatcher */
    private final void m81412x4c5ce739(java.lang.String str) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017, fl5.i
    /* renamed from: getRealEditText */
    public fl5.i mo61840xc52e48b() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017, android.widget.TextView
    public void onSelectionChanged(int i17, int i18) {
        java.lang.String str = this.G;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            int length = str.length();
            int i19 = i17 < length ? length : i17;
            if (i18 >= length) {
                length = i18;
            }
            if (i17 != i19 || i18 != length) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PrefixEditText", "onSelectionChanged : " + i17 + "--" + i18 + " pos:" + i19 + "--" + length);
                try {
                    super.setSelection(i19, length);
                } catch (java.lang.IndexOutOfBoundsException unused) {
                }
            }
        }
        super.onSelectionChanged(i17, i18);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017, android.widget.EditText, fl5.i
    /* renamed from: setSelection */
    public void mo81549xf579a34a(int i17) {
        try {
            super.mo81549xf579a34a(i17);
        } catch (java.lang.IndexOutOfBoundsException unused) {
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017, android.widget.EditText
    public void setSelection(int i17, int i18) {
        try {
            super.setSelection(i17, i18);
        } catch (java.lang.IndexOutOfBoundsException unused) {
        }
    }

    public C22635x3d684329(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.G = "";
    }
}
