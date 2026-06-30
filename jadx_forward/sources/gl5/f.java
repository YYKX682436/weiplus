package gl5;

/* loaded from: classes15.dex */
public class f implements android.text.TextWatcher, android.text.SpanWatcher {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.CharSequence f354504d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 f354505e;

    public f(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, gl5.a aVar) {
        this.f354505e = viewTreeObserverOnPreDrawListenerC22668xe0605023;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023 = this.f354505e;
        java.util.ArrayList arrayList = viewTreeObserverOnPreDrawListenerC22668xe0605023.f293111J;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                ((android.text.TextWatcher) arrayList.get(i17)).afterTextChanged(editable);
            }
        }
        if (android.text.method.MetaKeyKeyListener.getMetaState(editable, 2048) != 0) {
            jl5.c.b(viewTreeObserverOnPreDrawListenerC22668xe0605023, editable);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        java.lang.CharSequence charSequence2;
        boolean g17 = la5.b.f399133a.g(true);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023 = this.f354505e;
        if (g17 && (charSequence2 = viewTreeObserverOnPreDrawListenerC22668xe0605023.C) != null) {
            this.f354504d = charSequence2.toString();
        }
        float[] fArr = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023.f293104o2;
        viewTreeObserverOnPreDrawListenerC22668xe0605023.i0(charSequence, i17, i18, i19);
    }

    @Override // android.text.SpanWatcher
    public void onSpanAdded(android.text.Spannable spannable, java.lang.Object obj, int i17, int i18) {
        this.f354505e.s0(spannable, obj, -1, i17, -1, i18);
    }

    @Override // android.text.SpanWatcher
    public void onSpanChanged(android.text.Spannable spannable, java.lang.Object obj, int i17, int i18, int i19, int i27) {
        this.f354505e.s0(spannable, obj, i17, i19, i18, i27);
    }

    @Override // android.text.SpanWatcher
    public void onSpanRemoved(android.text.Spannable spannable, java.lang.Object obj, int i17, int i18) {
        this.f354505e.s0(spannable, obj, i17, -1, i18, -1);
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023 = this.f354505e;
        viewTreeObserverOnPreDrawListenerC22668xe0605023.getClass();
        float[] fArr = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023.f293104o2;
        gl5.e0 e0Var = viewTreeObserverOnPreDrawListenerC22668xe0605023.f293122g2;
        gl5.s sVar = e0Var == null ? null : e0Var.f354486k;
        if (sVar == null || sVar.f354623c == 0) {
            viewTreeObserverOnPreDrawListenerC22668xe0605023.w0();
        }
        if (sVar != null) {
            sVar.f354626f = true;
            int i27 = sVar.f354627g;
            if (i27 < 0) {
                sVar.f354627g = i17;
                sVar.f354628h = i17 + i18;
            } else {
                sVar.f354627g = java.lang.Math.min(i27, i17);
                sVar.f354628h = java.lang.Math.max(sVar.f354628h, (i17 + i18) - sVar.f354629i);
            }
            sVar.f354629i += i19 - i18;
        }
        viewTreeObserverOnPreDrawListenerC22668xe0605023.j0(charSequence, i17, i18, i19);
        if (la5.b.f399133a.g(true)) {
            if (viewTreeObserverOnPreDrawListenerC22668xe0605023.isFocused() || (viewTreeObserverOnPreDrawListenerC22668xe0605023.isSelected() && viewTreeObserverOnPreDrawListenerC22668xe0605023.isShown())) {
                java.lang.CharSequence charSequence2 = this.f354504d;
                android.view.accessibility.AccessibilityEvent obtain = android.view.accessibility.AccessibilityEvent.obtain(16);
                obtain.setFromIndex(i17);
                obtain.setRemovedCount(i18);
                obtain.setAddedCount(i19);
                obtain.setBeforeText(charSequence2);
                viewTreeObserverOnPreDrawListenerC22668xe0605023.sendAccessibilityEventUnchecked(obtain);
                this.f354504d = null;
            }
        }
    }
}
