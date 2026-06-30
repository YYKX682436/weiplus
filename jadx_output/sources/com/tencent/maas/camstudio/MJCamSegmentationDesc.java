package com.tencent.maas.camstudio;

/* loaded from: classes5.dex */
public class MJCamSegmentationDesc {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.camstudio.x0 f47898a;

    /* renamed from: b, reason: collision with root package name */
    public final float f47899b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.maas.instamovie.base.asset.MJAssetInfo f47900c;

    public MJCamSegmentationDesc(float f17) {
        this.f47898a = com.tencent.maas.camstudio.x0.BlurredContent;
        this.f47899b = f17;
        this.f47900c = null;
    }

    public com.tencent.maas.instamovie.base.asset.MJAssetInfo getAssetInfo() {
        return this.f47900c;
    }

    public int getBackgroundTypeValue() {
        return this.f47898a.f47997d;
    }

    public float getBlurIntensity() {
        return this.f47899b;
    }

    public MJCamSegmentationDesc(com.tencent.maas.instamovie.base.asset.MJAssetInfo mJAssetInfo) {
        this.f47898a = com.tencent.maas.camstudio.x0.Asset;
        this.f47899b = 3.0f;
        this.f47900c = mJAssetInfo;
    }

    public MJCamSegmentationDesc() {
        this.f47898a = com.tencent.maas.camstudio.x0.None;
        this.f47899b = 3.0f;
        this.f47900c = null;
    }
}
