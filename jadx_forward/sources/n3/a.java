package n3;

/* loaded from: classes14.dex */
public final class a extends android.view.View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final n3.c f415854a;

    public a(n3.c cVar) {
        this.f415854a = cVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public boolean dispatchPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return this.f415854a.mo83645x94b6bc90(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(android.view.View view) {
        o3.p mo7150x3c1c23cb = this.f415854a.mo7150x3c1c23cb(view);
        if (mo7150x3c1c23cb != null) {
            return (android.view.accessibility.AccessibilityNodeProvider) mo7150x3c1c23cb.f424179a;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.f415854a.mo7239x9d5dd31b(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        java.lang.Object tag;
        java.lang.Object tag2;
        java.lang.Object tag3;
        int i17;
        o3.l lVar = new o3.l(accessibilityNodeInfo);
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        int i18 = android.os.Build.VERSION.SDK_INT;
        int i19 = 0;
        if (i18 >= 28) {
            tag = java.lang.Boolean.valueOf(n3.e1.d(view));
        } else {
            tag = view.getTag(com.p314xaae8f345.mm.R.id.f568752nx5);
            if (!java.lang.Boolean.class.isInstance(tag)) {
                tag = null;
            }
        }
        java.lang.Boolean bool = (java.lang.Boolean) tag;
        lVar.s(bool != null && bool.booleanValue());
        if (i18 >= 28) {
            tag2 = java.lang.Boolean.valueOf(n3.e1.c(view));
        } else {
            tag2 = view.getTag(com.p314xaae8f345.mm.R.id.nwh);
            if (!java.lang.Boolean.class.isInstance(tag2)) {
                tag2 = null;
            }
        }
        java.lang.Boolean bool2 = (java.lang.Boolean) tag2;
        boolean z17 = bool2 != null && bool2.booleanValue();
        if (i18 >= 28) {
            accessibilityNodeInfo.setHeading(z17);
        } else {
            lVar.j(2, z17);
        }
        java.lang.CharSequence g17 = n3.l1.g(view);
        if (i18 >= 28) {
            accessibilityNodeInfo.setPaneTitle(g17);
        } else {
            o3.g.c(accessibilityNodeInfo).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", g17);
        }
        if (i18 >= 30) {
            tag3 = n3.g1.b(view);
        } else {
            tag3 = view.getTag(com.p314xaae8f345.mm.R.id.nx6);
            if (!java.lang.CharSequence.class.isInstance(tag3)) {
                tag3 = null;
            }
        }
        lVar.u((java.lang.CharSequence) tag3);
        this.f415854a.mo7102x1bd2f9af(view, lVar);
        java.lang.CharSequence text = accessibilityNodeInfo.getText();
        if (i18 < 26) {
            o3.g.c(accessibilityNodeInfo).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            o3.g.c(accessibilityNodeInfo).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            o3.g.c(accessibilityNodeInfo).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            o3.g.c(accessibilityNodeInfo).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            android.util.SparseArray sparseArray = (android.util.SparseArray) view.getTag(com.p314xaae8f345.mm.R.id.nwg);
            if (sparseArray != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (int i27 = 0; i27 < sparseArray.size(); i27++) {
                    if (((java.lang.ref.WeakReference) sparseArray.valueAt(i27)).get() == null) {
                        arrayList.add(java.lang.Integer.valueOf(i27));
                    }
                }
                for (int i28 = 0; i28 < arrayList.size(); i28++) {
                    sparseArray.remove(((java.lang.Integer) arrayList.get(i28)).intValue());
                }
            }
            android.text.style.ClickableSpan[] clickableSpanArr = text instanceof android.text.Spanned ? (android.text.style.ClickableSpan[]) ((android.text.Spanned) text).getSpans(0, text.length(), android.text.style.ClickableSpan.class) : null;
            if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                o3.g.c(lVar.f424175a).putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", com.p314xaae8f345.mm.R.id.f563882c4);
                android.util.SparseArray sparseArray2 = (android.util.SparseArray) view.getTag(com.p314xaae8f345.mm.R.id.nwg);
                if (sparseArray2 == null) {
                    sparseArray2 = new android.util.SparseArray();
                    view.setTag(com.p314xaae8f345.mm.R.id.nwg, sparseArray2);
                }
                int i29 = 0;
                while (i29 < clickableSpanArr.length) {
                    android.text.style.ClickableSpan clickableSpan = clickableSpanArr[i29];
                    int i37 = i19;
                    while (true) {
                        if (i37 >= sparseArray2.size()) {
                            i17 = o3.l.f424174d;
                            o3.l.f424174d = i17 + 1;
                            break;
                        } else {
                            if (clickableSpan.equals((android.text.style.ClickableSpan) ((java.lang.ref.WeakReference) sparseArray2.valueAt(i37)).get())) {
                                i17 = sparseArray2.keyAt(i37);
                                break;
                            }
                            i37++;
                        }
                    }
                    sparseArray2.put(i17, new java.lang.ref.WeakReference(clickableSpanArr[i29]));
                    android.text.style.ClickableSpan clickableSpan2 = clickableSpanArr[i29];
                    android.text.Spanned spanned = (android.text.Spanned) text;
                    lVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(java.lang.Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    lVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(java.lang.Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    lVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(java.lang.Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    lVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(java.lang.Integer.valueOf(i17));
                    i29++;
                    i19 = 0;
                }
            }
        }
        java.util.List<o3.f> m148921x5c9e4fea = n3.c.m148921x5c9e4fea(view);
        for (int i38 = 0; i38 < m148921x5c9e4fea.size(); i38++) {
            lVar.b(m148921x5c9e4fea.get(i38));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.f415854a.mo20440x6b5fe1b5(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public boolean onRequestSendAccessibilityEvent(android.view.ViewGroup viewGroup, android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return this.f415854a.mo8238xde18d764(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public boolean performAccessibilityAction(android.view.View view, int i17, android.os.Bundle bundle) {
        return this.f415854a.mo7240xcdbe3403(view, i17, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public void sendAccessibilityEvent(android.view.View view, int i17) {
        this.f415854a.mo83646xf64a1b94(view, i17);
    }

    @Override // android.view.View.AccessibilityDelegate
    public void sendAccessibilityEventUnchecked(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.f415854a.mo83647x80129dba(view, accessibilityEvent);
    }
}
