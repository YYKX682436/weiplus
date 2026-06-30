package com.tencent.maas.moviecomposing;

/* loaded from: classes3.dex */
public class EqualizerPeakingFilterParams {

    /* renamed from: a, reason: collision with root package name */
    public final float f48374a;

    /* renamed from: b, reason: collision with root package name */
    public final float f48375b;

    /* renamed from: c, reason: collision with root package name */
    public final float f48376c;

    public EqualizerPeakingFilterParams() {
        this.f48374a = 32.0f;
        this.f48375b = 0.0f;
        this.f48376c = 1.41f;
    }

    public float getFc() {
        return this.f48374a;
    }

    public float getGain() {
        return this.f48375b;
    }

    public float getQ() {
        return this.f48376c;
    }

    public EqualizerPeakingFilterParams(float f17, float f18, float f19) {
        this.f48374a = 32.0f;
        this.f48375b = 0.0f;
        this.f48376c = 1.41f;
        this.f48374a = f17;
        this.f48375b = f18;
        this.f48376c = f19;
    }
}
