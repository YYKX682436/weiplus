package com.davemorrissey.labs.subscaleview.performance;

/* loaded from: classes15.dex */
public class ImageDecodeRecord {
    private static final java.lang.String TAG = "MicroMsg.ImageDecodeRecord";
    private int mPreviewLoadedTime = 0;
    private int mTileInitTime = 0;
    private int mTileDecodeTime = 0;
    private long mLastTaskTimeStamp = 0;
    private long mLastTileTimeStamp = 0;
    private long mMaxLoadDuration = 0;

    public void addPreviewLoadedTime(int i17) {
        this.mPreviewLoadedTime += i17;
    }

    public void addTileDecodeTime(int i17) {
        this.mTileDecodeTime += i17;
    }

    public void addTileInitTime(int i17) {
        this.mTileInitTime += i17;
    }

    public int getMainImageDecodeTime() {
        return this.mTileInitTime + this.mTileDecodeTime;
    }

    public long getMaxLoadDuration() {
        return this.mMaxLoadDuration;
    }

    public int getPreviewLoadedTime() {
        return this.mPreviewLoadedTime;
    }

    public int getTileDecodeTime() {
        return this.mTileDecodeTime;
    }

    public int getTileInitTime() {
        return this.mTileInitTime;
    }

    public void reset() {
        this.mPreviewLoadedTime = 0;
        this.mTileDecodeTime = 0;
    }

    public void setLastTaskTimeStamp() {
        this.mLastTaskTimeStamp = java.lang.System.currentTimeMillis();
    }

    public void setLastTileTimeStamp() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.mLastTileTimeStamp = currentTimeMillis;
        this.mMaxLoadDuration = java.lang.Math.max(this.mMaxLoadDuration, currentTimeMillis - this.mLastTaskTimeStamp);
    }
}
