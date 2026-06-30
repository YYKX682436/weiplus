package com.tencent.maas.moviecomposing;

/* loaded from: classes5.dex */
public class VocalEnhancementParams {

    /* renamed from: a, reason: collision with root package name */
    public boolean f48435a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.maas.moviecomposing.h f48436b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.maas.moviecomposing.EqualizerPeakingFilterParams[] f48437c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.maas.base.Vec2[] f48438d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f48439e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.maas.moviecomposing.g f48440f;

    /* renamed from: g, reason: collision with root package name */
    public double f48441g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f48442h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f48443i;

    /* renamed from: j, reason: collision with root package name */
    public float f48444j;

    /* renamed from: k, reason: collision with root package name */
    public float f48445k;

    /* renamed from: l, reason: collision with root package name */
    public float f48446l;

    /* renamed from: m, reason: collision with root package name */
    public float f48447m;

    /* renamed from: n, reason: collision with root package name */
    public float f48448n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f48449o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f48450p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f48451q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.maas.moviecomposing.i f48452r;

    /* renamed from: s, reason: collision with root package name */
    public double f48453s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f48454t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f48455u;

    /* renamed from: v, reason: collision with root package name */
    public float f48456v;

    /* renamed from: w, reason: collision with root package name */
    public float f48457w;

    /* renamed from: x, reason: collision with root package name */
    public float f48458x;

    public VocalEnhancementParams() {
        this.f48435a = true;
        this.f48436b = com.tencent.maas.moviecomposing.h.Points;
        this.f48437c = new com.tencent.maas.moviecomposing.EqualizerPeakingFilterParams[0];
        this.f48438d = new com.tencent.maas.base.Vec2[0];
        this.f48439e = true;
        this.f48440f = com.tencent.maas.moviecomposing.g.NewPeak;
        this.f48441g = 0.0d;
        this.f48442h = false;
        this.f48443i = true;
        this.f48444j = -12.0f;
        this.f48445k = -40.0f;
        this.f48446l = 2.0f;
        this.f48447m = 0.2f;
        this.f48448n = 1.0f;
        this.f48449o = true;
        this.f48450p = false;
        this.f48451q = true;
        this.f48452r = com.tencent.maas.moviecomposing.i.EBUR128;
        this.f48453s = -18.0d;
        this.f48454t = true;
        this.f48455u = true;
        this.f48456v = -18.0f;
        this.f48457w = -40.0f;
        this.f48458x = -10.0f;
    }

    public boolean getAmplifierCanClip() {
        return this.f48442h;
    }

    public int getAmplifierType() {
        return this.f48440f.f48496d;
    }

    public double getAmplifierValue() {
        return this.f48441g;
    }

    public float getCompressorAttackTime() {
        return this.f48447m;
    }

    public float getCompressorNoiseFloorDB() {
        return this.f48445k;
    }

    public boolean getCompressorNormalize() {
        return this.f48449o;
    }

    public float getCompressorRatio() {
        return this.f48446l;
    }

    public float getCompressorReleaseTime() {
        return this.f48448n;
    }

    public float getCompressorThresholdDB() {
        return this.f48444j;
    }

    public boolean getCompressorUsePeak() {
        return this.f48450p;
    }

    public float getDefaultLoudness() {
        return this.f48456v;
    }

    public int getEqualizerCurveType() {
        return this.f48436b.f48501d;
    }

    public com.tencent.maas.moviecomposing.EqualizerPeakingFilterParams[] getEqualizerPeakingFiltersParams() {
        return this.f48437c;
    }

    public com.tencent.maas.base.Vec2[] getEqualizerPoints() {
        return this.f48438d;
    }

    public boolean getIsAmplifierEnabled() {
        return this.f48439e;
    }

    public boolean getIsCompressorEnabled() {
        return this.f48443i;
    }

    public boolean getIsDenoiserSSEnabled() {
        return this.f48454t;
    }

    public boolean getIsEqualizerEnabled() {
        return this.f48435a;
    }

    public boolean getIsLoudnessEQEnabled() {
        return this.f48455u;
    }

    public boolean getIsMatchLoudnessEnabled() {
        return this.f48451q;
    }

    public int getMatchLoudnessType() {
        return this.f48452r.f48505d;
    }

    public double getMatchLoudnessValue() {
        return this.f48453s;
    }

    public float getMaxLoudness() {
        return this.f48458x;
    }

    public float getMinLoudness() {
        return this.f48457w;
    }

    public VocalEnhancementParams(boolean z17, com.tencent.maas.moviecomposing.h hVar, com.tencent.maas.moviecomposing.EqualizerPeakingFilterParams[] equalizerPeakingFilterParamsArr, com.tencent.maas.base.Vec2[] vec2Arr, boolean z18, com.tencent.maas.moviecomposing.g gVar, double d17, boolean z19, boolean z27, float f17, float f18, float f19, float f27, float f28, boolean z28, boolean z29, boolean z37, com.tencent.maas.moviecomposing.i iVar, double d18, boolean z38, boolean z39, float f29, float f37, float f38) {
        this.f48435a = z17;
        this.f48436b = hVar;
        this.f48437c = equalizerPeakingFilterParamsArr;
        this.f48438d = vec2Arr;
        this.f48439e = z18;
        this.f48440f = gVar;
        this.f48441g = d17;
        this.f48442h = z19;
        this.f48443i = z27;
        this.f48444j = f17;
        this.f48445k = f18;
        this.f48446l = f19;
        this.f48447m = f27;
        this.f48448n = f28;
        this.f48449o = z28;
        this.f48450p = z29;
        this.f48451q = z37;
        this.f48452r = iVar;
        this.f48453s = d18;
        this.f48454t = z38;
        this.f48455u = z39;
        this.f48456v = f29;
        this.f48457w = f37;
        this.f48458x = f38;
    }
}
