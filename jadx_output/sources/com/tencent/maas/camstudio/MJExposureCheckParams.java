package com.tencent.maas.camstudio;

/* loaded from: classes5.dex */
public class MJExposureCheckParams {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f47914a;

    /* renamed from: b, reason: collision with root package name */
    public final int f47915b;

    /* renamed from: c, reason: collision with root package name */
    public final int f47916c;

    /* renamed from: d, reason: collision with root package name */
    public final float f47917d;

    public MJExposureCheckParams(boolean z17, int i17, int i18, float f17) {
        this.f47914a = z17;
        this.f47915b = i17;
        this.f47916c = i18;
        this.f47917d = f17;
    }

    public float getDarkThreshold() {
        return this.f47917d;
    }

    public int getFrameCheckNum() {
        return this.f47915b;
    }

    public int getFrameInterval() {
        return this.f47916c;
    }

    public boolean getIsEnabled() {
        return this.f47914a;
    }
}
