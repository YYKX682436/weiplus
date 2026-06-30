package com.tencent.map.lib.models;

/* loaded from: classes13.dex */
public class IntersectionOverlayInfo {
    protected android.graphics.Rect mBounds;
    protected byte[] mData;
    protected java.lang.String mDayStyleFilePath;
    protected int mDistance;
    protected boolean mIsDarkMode;
    protected java.lang.String mNightStyleFilePath;
    protected boolean mVisibility = true;
    protected boolean mRoundedCorner = false;

    public void enableDarkMode(boolean z17) {
        this.mIsDarkMode = z17;
    }

    public void enableRoundedCorner(boolean z17) {
        this.mRoundedCorner = z17;
    }

    public void setBounds(android.graphics.Rect rect) {
        this.mBounds = rect;
    }

    public void setData(byte[] bArr) {
        this.mData = bArr;
    }

    public void setDistance(int i17) {
        this.mDistance = i17;
    }

    public void setVisibility(boolean z17) {
        this.mVisibility = z17;
    }
}
