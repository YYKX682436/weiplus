package com.google.android.exoplayer2.metadata.scte35;

/* loaded from: classes13.dex */
public final class PrivateCommand extends com.google.android.exoplayer2.metadata.scte35.SpliceCommand {
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.scte35.PrivateCommand> CREATOR = new c9.a();

    /* renamed from: d, reason: collision with root package name */
    public final long f44141d;

    /* renamed from: e, reason: collision with root package name */
    public final long f44142e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f44143f;

    public PrivateCommand(long j17, byte[] bArr, long j18) {
        this.f44141d = j18;
        this.f44142e = j17;
        this.f44143f = bArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f44141d);
        parcel.writeLong(this.f44142e);
        byte[] bArr = this.f44143f;
        parcel.writeInt(bArr.length);
        parcel.writeByteArray(bArr);
    }

    public PrivateCommand(android.os.Parcel parcel, c9.a aVar) {
        this.f44141d = parcel.readLong();
        this.f44142e = parcel.readLong();
        byte[] bArr = new byte[parcel.readInt()];
        this.f44143f = bArr;
        parcel.readByteArray(bArr);
    }
}
