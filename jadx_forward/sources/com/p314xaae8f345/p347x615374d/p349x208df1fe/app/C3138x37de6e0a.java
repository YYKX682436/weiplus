package com.p314xaae8f345.p347x615374d.p349x208df1fe.app;

/* renamed from: com.tencent.kinda.framework.app.KindaPlatformLayout */
/* loaded from: classes9.dex */
public class C3138x37de6e0a extends android.widget.LinearLayout {
    public static java.lang.String TAG = "KindaPlatformLayout";

    /* renamed from: measure */
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3161x83f0b84c f12049x37eda55e;

    /* renamed from: needBlockAccessibility */
    boolean f12050x4d3444f7;

    public C3138x37de6e0a(android.content.Context context) {
        super(context);
        this.f12049x37eda55e = new com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3161x83f0b84c();
        this.f12050x4d3444f7 = false;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (!this.f12050x4d3444f7) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        if (accessibilityEvent.getText() == null) {
            return true;
        }
        accessibilityEvent.getText().clear();
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        super.onLayout(z17, i17, i18, i19, i27);
        this.f12049x37eda55e.f12171x8c3e11ab += android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        super.onMeasure(i17, i18);
        this.f12049x37eda55e.f12172x35ed5efd += android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestSendAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (this.f12050x4d3444f7) {
            return true;
        }
        return super.requestSendAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: setBlockAccessibilityStatus */
    public void m25222x47e9bb95(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "[setBlockAccessibilityStatus] set:  %s", java.lang.Boolean.valueOf(z17));
        this.f12050x4d3444f7 = z17;
        if (z17) {
            setImportantForAccessibility(4);
        } else {
            setImportantForAccessibility(1);
        }
    }

    public C3138x37de6e0a(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12049x37eda55e = new com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3161x83f0b84c();
        this.f12050x4d3444f7 = false;
    }

    public C3138x37de6e0a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f12049x37eda55e = new com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3161x83f0b84c();
        this.f12050x4d3444f7 = false;
    }
}
