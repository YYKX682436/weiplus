package com.tencent.kinda.framework.widget.base;

/* loaded from: classes9.dex */
class KindaTextViewImpl extends android.widget.TextView {
    private static final java.lang.String TAG = "KindaButtonImpl";
    private boolean hasLastPressed;
    private com.tencent.kinda.framework.widget.base.KindaButtonImpl mKindaButton;

    public KindaTextViewImpl(android.content.Context context) {
        super(context);
        this.hasLastPressed = false;
        init();
    }

    private void init() {
        setMaxLines(2);
        setEllipsize(android.text.TextUtils.TruncateAt.END);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        if (this.mKindaButton.isEnabled() || this.mKindaButton.isKindaPressed() || this.hasLastPressed) {
            super.drawableStateChanged();
            this.hasLastPressed = this.mKindaButton.isKindaPressed();
        }
    }

    public void setKindaButton(com.tencent.kinda.framework.widget.base.KindaButtonImpl kindaButtonImpl) {
        this.mKindaButton = kindaButtonImpl;
    }

    public KindaTextViewImpl(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.hasLastPressed = false;
        init();
    }

    public KindaTextViewImpl(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.hasLastPressed = false;
        init();
    }
}
