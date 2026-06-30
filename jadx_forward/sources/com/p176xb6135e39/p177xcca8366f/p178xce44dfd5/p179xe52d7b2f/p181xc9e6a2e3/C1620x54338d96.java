package com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.p181xc9e6a2e3;

/* renamed from: com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand */
/* loaded from: classes15.dex */
public final class C1620x54338d96 extends com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.p181xc9e6a2e3.AbstractC1616xa2fa5d0f {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.p181xc9e6a2e3.C1620x54338d96> f5322x681a0c0c = new c9.i();

    /* renamed from: d, reason: collision with root package name */
    public final long f125691d;

    /* renamed from: e, reason: collision with root package name */
    public final long f125692e;

    public C1620x54338d96(long j17, long j18) {
        this.f125691d = j17;
        this.f125692e = j18;
    }

    public static long a(t9.p pVar, long j17) {
        long m17 = pVar.m();
        if ((128 & m17) != 0) {
            return 8589934591L & ((((m17 & 1) << 32) | pVar.n()) + j17);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f125691d);
        parcel.writeLong(this.f125692e);
    }
}
