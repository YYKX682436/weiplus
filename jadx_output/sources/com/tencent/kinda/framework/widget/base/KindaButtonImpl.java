package com.tencent.kinda.framework.widget.base;

/* loaded from: classes9.dex */
public class KindaButtonImpl extends android.widget.FrameLayout {
    private static final java.lang.String TAG = "KindaButtonImpl";
    private boolean mIsPressed;
    private android.widget.ImageView mKButtonImageView;
    private com.tencent.kinda.framework.widget.base.KindaTextViewImpl mKButtonTextView;
    public boolean noRecalcuate;

    public KindaButtonImpl(android.content.Context context) {
        super(context);
        this.noRecalcuate = true;
        init(context);
    }

    private void init(android.content.Context context) {
        this.mKButtonImageView = new android.widget.ImageView(context);
        this.mKButtonImageView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        this.mKButtonImageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        this.mKButtonImageView.setFocusable(false);
        this.mKButtonImageView.setImportantForAccessibility(2);
        addView(this.mKButtonImageView);
        com.tencent.kinda.framework.widget.base.KindaTextViewImpl kindaTextViewImpl = new com.tencent.kinda.framework.widget.base.KindaTextViewImpl(context);
        this.mKButtonTextView = kindaTextViewImpl;
        kindaTextViewImpl.setKindaButton(this);
        this.mKButtonTextView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        this.mKButtonTextView.setBackgroundResource(com.tencent.mm.R.color.a9e);
        this.mKButtonTextView.setGravity(17);
        this.mKButtonTextView.setFocusable(false);
        this.mKButtonTextView.setImportantForAccessibility(2);
        com.tencent.mm.wallet_core.e eVar = new com.tencent.mm.wallet_core.e();
        eVar.setViewType(com.tencent.kinda.gen.TraitsType.BUTTON);
        setAccessibilityDelegate(eVar);
        addView(this.mKButtonTextView);
        super.setId(com.tencent.kinda.framework.R.id.kinda_button_impl_wrapper);
    }

    public com.tencent.kinda.framework.widget.base.KindaTextViewImpl getKButtonTextView() {
        return this.mKButtonTextView;
    }

    public java.lang.CharSequence getText() {
        return this.mKButtonTextView.getText();
    }

    public int getTextColor() {
        return this.mKButtonTextView.getCurrentTextColor();
    }

    public float getTextSize() {
        return this.mKButtonTextView.getTextSize();
    }

    public boolean isKindaPressed() {
        return this.mIsPressed;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        int mode = android.view.View.MeasureSpec.getMode(i17);
        int mode2 = android.view.View.MeasureSpec.getMode(i18);
        android.view.View.MeasureSpec.getSize(i17);
        android.view.View.MeasureSpec.getSize(i18);
        if (!this.noRecalcuate) {
            this.noRecalcuate = true;
        } else if (getHeight() > 0 && getWidth() > 0) {
            if (mode == Integer.MIN_VALUE) {
                i17 = getWidth() + 1073741824;
            }
            if (mode2 == Integer.MIN_VALUE) {
                i18 = getHeight() + 1073741824;
            }
        }
        super.onMeasure(i17, i18);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (!isEnabled()) {
            return onTouchEvent;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mIsPressed = true;
        } else if (action == 1) {
            this.mIsPressed = false;
        }
        return onTouchEvent;
    }

    @Override // android.view.View
    public void setContentDescription(java.lang.CharSequence charSequence) {
        super.setContentDescription(charSequence);
    }

    @Override // android.view.View
    public void setId(int i17) {
        this.mKButtonTextView.setId(i17);
    }

    public void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        android.widget.ImageView imageView = this.mKButtonImageView;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
    }

    public void setNestEnabled(boolean z17) {
        this.mKButtonTextView.setEnabled(z17);
    }

    public void setText(java.lang.String str) {
        this.mKButtonTextView.setText(str);
        setContentDescription(str);
    }

    public void setTextColor(android.content.res.ColorStateList colorStateList) {
        this.mKButtonTextView.setTextColor(colorStateList);
    }

    public void setTextFont(android.graphics.Typeface typeface) {
        if (typeface != null) {
            this.mKButtonTextView.setTypeface(typeface);
            this.mKButtonTextView.requestLayout();
        }
    }

    public void setTextSize(int i17, float f17) {
        this.mKButtonTextView.setTextSize(i17, f17);
    }

    public KindaButtonImpl(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.noRecalcuate = true;
        init(context);
    }

    public KindaButtonImpl(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.noRecalcuate = true;
        init(context);
    }
}
