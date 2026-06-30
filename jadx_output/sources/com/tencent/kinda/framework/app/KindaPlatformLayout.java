package com.tencent.kinda.framework.app;

/* loaded from: classes9.dex */
public class KindaPlatformLayout extends android.widget.LinearLayout {
    public static java.lang.String TAG = "KindaPlatformLayout";
    private com.tencent.kinda.framework.app.TestMeasure measure;
    boolean needBlockAccessibility;

    public KindaPlatformLayout(android.content.Context context) {
        super(context);
        this.measure = new com.tencent.kinda.framework.app.TestMeasure();
        this.needBlockAccessibility = false;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (!this.needBlockAccessibility) {
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
        this.measure.valLayout += android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        super.onMeasure(i17, i18);
        this.measure.valMeasure += android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestSendAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (this.needBlockAccessibility) {
            return true;
        }
        return super.requestSendAccessibilityEvent(view, accessibilityEvent);
    }

    public void setBlockAccessibilityStatus(boolean z17) {
        com.tencent.mars.xlog.Log.i(TAG, "[setBlockAccessibilityStatus] set:  %s", java.lang.Boolean.valueOf(z17));
        this.needBlockAccessibility = z17;
        if (z17) {
            setImportantForAccessibility(4);
        } else {
            setImportantForAccessibility(1);
        }
    }

    public KindaPlatformLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.measure = new com.tencent.kinda.framework.app.TestMeasure();
        this.needBlockAccessibility = false;
    }

    public KindaPlatformLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.measure = new com.tencent.kinda.framework.app.TestMeasure();
        this.needBlockAccessibility = false;
    }
}
