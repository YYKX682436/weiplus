package n3;

/* loaded from: classes14.dex */
public class c {

    /* renamed from: DEFAULT_DELEGATE */
    private static final android.view.View.AccessibilityDelegate f72894xc3a771e3 = new android.view.View.AccessibilityDelegate();

    /* renamed from: mBridge */
    private final android.view.View.AccessibilityDelegate f72895xfd1eca56;

    /* renamed from: mOriginalDelegate */
    private final android.view.View.AccessibilityDelegate f72896x6403503;

    public c() {
        this(f72894xc3a771e3);
    }

    /* renamed from: getActionList */
    public static java.util.List<o3.f> m148921x5c9e4fea(android.view.View view) {
        java.util.List<o3.f> list = (java.util.List) view.getTag(com.p314xaae8f345.mm.R.id.nwf);
        return list == null ? java.util.Collections.emptyList() : list;
    }

    /* renamed from: dispatchPopulateAccessibilityEvent */
    public boolean mo83645x94b6bc90(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return this.f72896x6403503.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: getAccessibilityNodeProvider */
    public o3.p mo7150x3c1c23cb(android.view.View view) {
        android.view.accessibility.AccessibilityNodeProvider a17 = n3.b.a(this.f72896x6403503, view);
        if (a17 != null) {
            return new o3.p(a17);
        }
        return null;
    }

    /* renamed from: getBridge */
    public android.view.View.AccessibilityDelegate m148922x12c9c67f() {
        return this.f72895xfd1eca56;
    }

    /* renamed from: onInitializeAccessibilityEvent */
    public void mo7239x9d5dd31b(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.f72896x6403503.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: onInitializeAccessibilityNodeInfo */
    public void mo7102x1bd2f9af(android.view.View view, o3.l lVar) {
        this.f72896x6403503.onInitializeAccessibilityNodeInfo(view, lVar.f424175a);
    }

    /* renamed from: onPopulateAccessibilityEvent */
    public void mo20440x6b5fe1b5(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.f72896x6403503.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: onRequestSendAccessibilityEvent */
    public boolean mo8238xde18d764(android.view.ViewGroup viewGroup, android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return this.f72896x6403503.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: performAccessibilityAction */
    public boolean mo7240xcdbe3403(android.view.View view, int i17, android.os.Bundle bundle) {
        boolean z17;
        java.lang.ref.WeakReference weakReference;
        boolean z18;
        java.util.List<o3.f> m148921x5c9e4fea = m148921x5c9e4fea(view);
        boolean z19 = false;
        int i18 = 0;
        while (true) {
            if (i18 >= m148921x5c9e4fea.size()) {
                break;
            }
            o3.f fVar = m148921x5c9e4fea.get(i18);
            if (((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) fVar.f424169a).getId() == i17) {
                o3.a0 a0Var = fVar.f424172d;
                if (a0Var != null) {
                    java.lang.Class cls = fVar.f424171c;
                    if (cls != null) {
                        try {
                            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(cls.getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]));
                            throw null;
                        } catch (java.lang.Exception unused) {
                            z17 = a0Var.a(view, null);
                        }
                    }
                    z17 = a0Var.a(view, null);
                }
            } else {
                i18++;
            }
        }
        z17 = false;
        if (!z17) {
            z17 = n3.b.b(this.f72896x6403503, view, i17, bundle);
        }
        if (z17 || i17 != com.p314xaae8f345.mm.R.id.f563882c4 || bundle == null) {
            return z17;
        }
        int i19 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        android.util.SparseArray sparseArray = (android.util.SparseArray) view.getTag(com.p314xaae8f345.mm.R.id.nwg);
        if (sparseArray != null && (weakReference = (java.lang.ref.WeakReference) sparseArray.get(i19)) != null) {
            android.text.style.ClickableSpan clickableSpan = (android.text.style.ClickableSpan) weakReference.get();
            if (clickableSpan != null) {
                java.lang.CharSequence text = view.createAccessibilityNodeInfo().getText();
                android.text.style.ClickableSpan[] clickableSpanArr = text instanceof android.text.Spanned ? (android.text.style.ClickableSpan[]) ((android.text.Spanned) text).getSpans(0, text.length(), android.text.style.ClickableSpan.class) : null;
                for (int i27 = 0; clickableSpanArr != null && i27 < clickableSpanArr.length; i27++) {
                    if (clickableSpan.equals(clickableSpanArr[i27])) {
                        z18 = true;
                        break;
                    }
                }
            }
            z18 = false;
            if (z18) {
                clickableSpan.onClick(view);
                z19 = true;
            }
        }
        return z19;
    }

    /* renamed from: sendAccessibilityEvent */
    public void mo83646xf64a1b94(android.view.View view, int i17) {
        this.f72896x6403503.sendAccessibilityEvent(view, i17);
    }

    /* renamed from: sendAccessibilityEventUnchecked */
    public void mo83647x80129dba(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.f72896x6403503.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public c(android.view.View.AccessibilityDelegate accessibilityDelegate) {
        this.f72896x6403503 = accessibilityDelegate;
        this.f72895xfd1eca56 = new n3.a(this);
    }
}
