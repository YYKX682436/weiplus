package com.p314xaae8f345.mm.ui;

/* renamed from: com.tencent.mm.ui.LayoutListenerView */
/* loaded from: classes14.dex */
public class C21390x7d9495e3 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f278397d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.f9 f278398e;

    public C21390x7d9495e3(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f278397d = new byte[0];
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        synchronized (this.f278397d) {
            this.f278398e = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        synchronized (this.f278397d) {
        }
        super.onLayout(z17, i17, i18, i19, i27);
        synchronized (this.f278397d) {
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        synchronized (this.f278397d) {
            com.p314xaae8f345.mm.ui.f9 f9Var = this.f278398e;
            if (f9Var != null) {
                com.p314xaae8f345.mm.ui.ab abVar = (com.p314xaae8f345.mm.ui.ab) f9Var;
                com.p314xaae8f345.mm.ui.ga gaVar = abVar.f278662b;
                if (!((gaVar.x().getWindow().getAttributes().flags & 1024) != 0) && i17 != 0 && i18 != 0 && i19 != 0 && i27 != 0 && i17 == i19) {
                    int i28 = abVar.f278661a;
                    if (i18 > i27 && i18 - i27 > i28) {
                        gaVar.f290188l0 = 2;
                        gaVar.i0();
                    } else if (i27 > i18 && i27 - i18 > i28) {
                        gaVar.f290188l0 = 1;
                        gaVar.i0();
                    }
                }
            }
        }
    }

    /* renamed from: setOnLayoutListener */
    public void m78462x7ea3fe3f(com.p314xaae8f345.mm.ui.d9 d9Var) {
        synchronized (this.f278397d) {
        }
    }

    /* renamed from: setOnPreLayoutListener */
    public void m78463x2de767a0(com.p314xaae8f345.mm.ui.e9 e9Var) {
        synchronized (this.f278397d) {
        }
    }

    /* renamed from: setOnResizedListener */
    public void m78464xdb69d6e3(com.p314xaae8f345.mm.ui.f9 f9Var) {
        synchronized (this.f278397d) {
            this.f278398e = f9Var;
        }
    }

    public C21390x7d9495e3(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f278397d = new byte[0];
    }
}
