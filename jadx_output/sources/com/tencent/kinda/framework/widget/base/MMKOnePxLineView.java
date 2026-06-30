package com.tencent.kinda.framework.widget.base;

/* loaded from: classes9.dex */
public class MMKOnePxLineView extends com.tencent.kinda.framework.widget.base.MMKView<android.widget.LinearLayout> implements com.tencent.kinda.gen.KOnePxLineView {
    private static final java.lang.String TAG = "MMKOnePxLineView";
    private android.view.View mOnePxView;
    private float mOnePxViewHeight;
    private float mOnePxViewWidth;

    private void updateOrientation() {
        this.mOnePxView.setLayoutParams(this.mOnePxViewWidth >= this.mOnePxViewHeight ? new android.widget.LinearLayout.LayoutParams(-1, 1) : new android.widget.LinearLayout.LayoutParams(1, -1));
    }

    @Override // com.tencent.kinda.framework.widget.base.MMKView, com.tencent.kinda.gen.KView
    public void setHeight(float f17) {
        super.setHeight(f17);
        this.mOnePxViewHeight = f17;
        updateOrientation();
    }

    @Override // com.tencent.kinda.framework.widget.base.MMKView, com.tencent.kinda.gen.KView
    public void setWidth(float f17) {
        super.setWidth(f17);
        this.mOnePxViewWidth = f17;
        updateOrientation();
    }

    @Override // com.tencent.kinda.framework.widget.base.MMKView
    public android.widget.LinearLayout createView(android.content.Context context) {
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        this.mOnePxView = new android.view.View(context);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, 1);
        this.mOnePxViewWidth = -1.0f;
        this.mOnePxViewHeight = 1.0f;
        linearLayout.addView(this.mOnePxView, layoutParams);
        return linearLayout;
    }
}
