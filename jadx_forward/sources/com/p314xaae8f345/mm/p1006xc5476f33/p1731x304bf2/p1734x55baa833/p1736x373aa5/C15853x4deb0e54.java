package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.FixAspectRatioAndTopCropImageView */
/* loaded from: classes4.dex */
public class C15853x4deb0e54 extends com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1740x373aa5.C15869xcd5a00e2 {
    public C15853x4deb0e54(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        setScaleType(android.widget.ImageView.ScaleType.MATRIX);
    }

    @Override // android.widget.ImageView
    public boolean setFrame(int i17, int i18, int i19, int i27) {
        float f17;
        float f18;
        if (getDrawable() == null) {
            return super.setFrame(i17, i18, i19, i27);
        }
        android.graphics.Matrix imageMatrix = getImageMatrix();
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int intrinsicWidth = getDrawable().getIntrinsicWidth();
        int intrinsicHeight = getDrawable().getIntrinsicHeight();
        if (intrinsicWidth * height > intrinsicHeight * width) {
            f17 = height;
            f18 = intrinsicHeight;
        } else {
            f17 = width;
            f18 = intrinsicWidth;
        }
        float f19 = f17 / f18;
        imageMatrix.setScale(f19, f19);
        setImageMatrix(imageMatrix);
        return super.setFrame(i17, i18, i19, i27);
    }

    public C15853x4deb0e54(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        setScaleType(android.widget.ImageView.ScaleType.MATRIX);
    }
}
