package org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3;

/* renamed from: org.chromium.base.metrics.HistogramBucket */
/* loaded from: classes16.dex */
public class C29405xc3d0544e {

    /* renamed from: mCount */
    public final int f73534xbde49ca2;

    /* renamed from: mMax */
    public final long f73535x32b9b7;

    /* renamed from: mMin */
    public final int f73536x32baa5;

    public C29405xc3d0544e(int i17, long j17, int i18) {
        this.f73536x32baa5 = i17;
        this.f73535x32b9b7 = j17;
        this.f73534xbde49ca2 = i18;
    }

    /* renamed from: contains */
    public boolean m152903xde2d761f(int i17) {
        return i17 >= this.f73536x32baa5 && ((long) i17) < this.f73535x32b9b7;
    }
}
