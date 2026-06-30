package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public final class NavigationBarConfig {
    public com.tencent.kinda.gen.DynamicColor mBackgroundColor;
    public java.lang.String mBarTitle;
    public com.tencent.kinda.gen.LeftBarButtonType mLeftBarButtonType;
    public com.tencent.kinda.gen.DynamicColor mLeftButtonColor;
    public com.tencent.kinda.gen.DynamicColor mRightButtonColor;
    public java.lang.String mRightButtonImage;
    public java.lang.String mRightButtonTitle;
    public com.tencent.kinda.gen.DynamicColor mTitleColor;
    public boolean mUseBlackStatusbar;

    public NavigationBarConfig() {
    }

    public NavigationBarConfig(com.tencent.kinda.gen.DynamicColor dynamicColor, boolean z17, java.lang.String str, com.tencent.kinda.gen.DynamicColor dynamicColor2, com.tencent.kinda.gen.LeftBarButtonType leftBarButtonType, com.tencent.kinda.gen.DynamicColor dynamicColor3, java.lang.String str2, java.lang.String str3, com.tencent.kinda.gen.DynamicColor dynamicColor4) {
        this.mBackgroundColor = dynamicColor;
        this.mUseBlackStatusbar = z17;
        this.mBarTitle = str;
        this.mTitleColor = dynamicColor2;
        this.mLeftBarButtonType = leftBarButtonType;
        this.mLeftButtonColor = dynamicColor3;
        this.mRightButtonTitle = str2;
        this.mRightButtonImage = str3;
        this.mRightButtonColor = dynamicColor4;
    }

    public com.tencent.kinda.gen.DynamicColor getBackgroundColor() {
        return this.mBackgroundColor;
    }

    public java.lang.String getBarTitle() {
        return this.mBarTitle;
    }

    public com.tencent.kinda.gen.LeftBarButtonType getLeftBarButtonType() {
        return this.mLeftBarButtonType;
    }

    public com.tencent.kinda.gen.DynamicColor getLeftButtonColor() {
        return this.mLeftButtonColor;
    }

    public com.tencent.kinda.gen.DynamicColor getRightButtonColor() {
        return this.mRightButtonColor;
    }

    public java.lang.String getRightButtonImage() {
        return this.mRightButtonImage;
    }

    public java.lang.String getRightButtonTitle() {
        return this.mRightButtonTitle;
    }

    public com.tencent.kinda.gen.DynamicColor getTitleColor() {
        return this.mTitleColor;
    }

    public boolean getUseBlackStatusbar() {
        return this.mUseBlackStatusbar;
    }

    public java.lang.String toString() {
        return "NavigationBarConfig{mBackgroundColor=" + this.mBackgroundColor + ",mUseBlackStatusbar=" + this.mUseBlackStatusbar + ",mBarTitle=" + this.mBarTitle + ",mTitleColor=" + this.mTitleColor + ",mLeftBarButtonType=" + this.mLeftBarButtonType + ",mLeftButtonColor=" + this.mLeftButtonColor + ",mRightButtonTitle=" + this.mRightButtonTitle + ",mRightButtonImage=" + this.mRightButtonImage + ",mRightButtonColor=" + this.mRightButtonColor + "}";
    }
}
