package com.google.android.exoplayer2.metadata.scte35;

/* loaded from: classes15.dex */
public final class TimeSignalCommand extends com.google.android.exoplayer2.metadata.scte35.SpliceCommand {
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand> CREATOR = new c9.i();

    /* renamed from: d, reason: collision with root package name */
    public final long f44158d;

    /* renamed from: e, reason: collision with root package name */
    public final long f44159e;

    public TimeSignalCommand(long j17, long j18) {
        this.f44158d = j17;
        this.f44159e = j18;
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
        parcel.writeLong(this.f44158d);
        parcel.writeLong(this.f44159e);
    }
}
