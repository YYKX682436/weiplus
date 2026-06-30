package com.tencent.maas.moviecomposing;

/* loaded from: classes5.dex */
public class VocalAdjustmentParams {

    /* renamed from: a, reason: collision with root package name */
    public final float f48429a;

    /* renamed from: b, reason: collision with root package name */
    public final float f48430b;

    /* renamed from: c, reason: collision with root package name */
    public final float f48431c;

    /* renamed from: d, reason: collision with root package name */
    public final float f48432d;

    /* renamed from: e, reason: collision with root package name */
    public final float f48433e;

    /* renamed from: f, reason: collision with root package name */
    public final float f48434f;

    public VocalAdjustmentParams() {
        this.f48429a = -18.0f;
        this.f48430b = 1.0f;
        this.f48431c = -18.0f;
        this.f48432d = -40.0f;
        this.f48433e = -10.0f;
        this.f48434f = 15.0f;
    }

    public float getDefaultLoudness() {
        return this.f48431c;
    }

    public float getDuration() {
        return this.f48430b;
    }

    public float getLoudness() {
        return this.f48429a;
    }

    public float getLoudnessDeltaLimit() {
        return this.f48434f;
    }

    public float getMaxLoudness() {
        return this.f48433e;
    }

    public float getMinLoudness() {
        return this.f48432d;
    }

    public VocalAdjustmentParams(float f17, float f18, float f19, float f27, float f28, float f29) {
        this.f48429a = -18.0f;
        this.f48430b = 1.0f;
        this.f48431c = -18.0f;
        this.f48432d = -40.0f;
        this.f48433e = -10.0f;
        this.f48434f = 15.0f;
        this.f48429a = f17;
        this.f48430b = f18;
        this.f48431c = f19;
        this.f48432d = f27;
        this.f48433e = f28;
        this.f48434f = f29;
    }
}
