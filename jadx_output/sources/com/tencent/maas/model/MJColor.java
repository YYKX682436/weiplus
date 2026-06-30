package com.tencent.maas.model;

/* loaded from: classes5.dex */
public class MJColor {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.maas.model.MJColor f48251e = new com.tencent.maas.model.MJColor(1.0f, 1.0f, 1.0f, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f48252a;

    /* renamed from: b, reason: collision with root package name */
    public final float f48253b;

    /* renamed from: c, reason: collision with root package name */
    public final float f48254c;

    /* renamed from: d, reason: collision with root package name */
    public final float f48255d;

    static {
        new com.tencent.maas.model.MJColor(0.0f, 0.0f, 0.0f, 1.0f);
    }

    public MJColor(float f17, float f18, float f19, float f27) {
        this.f48252a = f17;
        this.f48253b = f18;
        this.f48254c = f19;
        this.f48255d = f27;
    }

    public float getA() {
        return this.f48255d;
    }

    public float getB() {
        return this.f48254c;
    }

    public float getG() {
        return this.f48253b;
    }

    public float getR() {
        return this.f48252a;
    }
}
