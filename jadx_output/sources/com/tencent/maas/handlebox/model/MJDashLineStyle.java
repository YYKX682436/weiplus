package com.tencent.maas.handlebox.model;

/* loaded from: classes5.dex */
public class MJDashLineStyle {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f48013a;

    /* renamed from: b, reason: collision with root package name */
    public final float f48014b;

    public MJDashLineStyle(float[] fArr, float f17) {
        this.f48013a = fArr;
        this.f48014b = f17;
    }

    public float[] getIntervals() {
        return this.f48013a;
    }

    public float getPhase() {
        return this.f48014b;
    }
}
