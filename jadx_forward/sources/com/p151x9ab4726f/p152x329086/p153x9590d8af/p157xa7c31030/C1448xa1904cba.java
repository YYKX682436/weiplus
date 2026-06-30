package com.p151x9ab4726f.p152x329086.p153x9590d8af.p157xa7c31030;

/* renamed from: com.davemorrissey.labs.subscaleview.performance.ImageDecodeRecord */
/* loaded from: classes15.dex */
public class C1448xa1904cba {
    private static final java.lang.String TAG = "MicroMsg.ImageDecodeRecord";

    /* renamed from: mPreviewLoadedTime */
    private int f4489x84d3996d = 0;

    /* renamed from: mTileInitTime */
    private int f4491xc7b765d8 = 0;

    /* renamed from: mTileDecodeTime */
    private int f4490x5ee1e8f6 = 0;

    /* renamed from: mLastTaskTimeStamp */
    private long f4486x7695110e = 0;

    /* renamed from: mLastTileTimeStamp */
    private long f4487xe828b205 = 0;

    /* renamed from: mMaxLoadDuration */
    private long f4488x542363f1 = 0;

    /* renamed from: addPreviewLoadedTime */
    public void m15513xb6930fb9(int i17) {
        this.f4489x84d3996d += i17;
    }

    /* renamed from: addTileDecodeTime */
    public void m15514xe382f62a(int i17) {
        this.f4490x5ee1e8f6 += i17;
    }

    /* renamed from: addTileInitTime */
    public void m15515xabe2300c(int i17) {
        this.f4491xc7b765d8 += i17;
    }

    /* renamed from: getMainImageDecodeTime */
    public int m15516x977ac767() {
        return this.f4491xc7b765d8 + this.f4490x5ee1e8f6;
    }

    /* renamed from: getMaxLoadDuration */
    public long m15517x68d705e8() {
        return this.f4488x542363f1;
    }

    /* renamed from: getPreviewLoadedTime */
    public int m15518x3b2699a4() {
        return this.f4489x84d3996d;
    }

    /* renamed from: getTileDecodeTime */
    public int m15519x46c6ac1f() {
        return this.f4490x5ee1e8f6;
    }

    /* renamed from: getTileInitTime */
    public int m15520x9114df41() {
        return this.f4491xc7b765d8;
    }

    /* renamed from: reset */
    public void m15521x6761d4f() {
        this.f4489x84d3996d = 0;
        this.f4490x5ee1e8f6 = 0;
    }

    /* renamed from: setLastTaskTimeStamp */
    public void m15522x87e1db9() {
        this.f4486x7695110e = java.lang.System.currentTimeMillis();
    }

    /* renamed from: setLastTileTimeStamp */
    public void m15523x7a11beb0() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f4487xe828b205 = currentTimeMillis;
        this.f4488x542363f1 = java.lang.Math.max(this.f4488x542363f1, currentTimeMillis - this.f4486x7695110e);
    }
}
