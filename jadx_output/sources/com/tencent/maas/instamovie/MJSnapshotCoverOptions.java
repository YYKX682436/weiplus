package com.tencent.maas.instamovie;

/* loaded from: classes5.dex */
public class MJSnapshotCoverOptions {

    /* renamed from: a, reason: collision with root package name */
    public final int f48167a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.maas.model.time.MJTime f48168b;

    /* renamed from: c, reason: collision with root package name */
    public final float f48169c;

    /* renamed from: d, reason: collision with root package name */
    public final float f48170d;

    public float getClarityThreshold() {
        return this.f48170d;
    }

    public float getDarknessRatioThreshold() {
        return this.f48169c;
    }

    public com.tencent.maas.model.time.MJTime getMaxDuration() {
        return this.f48168b;
    }

    public int getSnapshotSampleRate() {
        return this.f48167a;
    }

    public java.lang.String toString() {
        return "MJSnapshotCoverOptions{snapshotSampleRate=" + this.f48167a + ", maxDuration=" + this.f48168b + ", darknessRatioThreshold=" + this.f48169c + ", clarityThreshold=" + this.f48170d + '}';
    }

    private MJSnapshotCoverOptions(com.tencent.maas.instamovie.f fVar) {
        fVar.getClass();
        this.f48167a = 2;
        this.f48168b = fVar.f48190a;
        this.f48169c = fVar.f48191b;
        this.f48170d = fVar.f48192c;
    }
}
