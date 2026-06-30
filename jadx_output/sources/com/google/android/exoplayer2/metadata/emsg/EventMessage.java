package com.google.android.exoplayer2.metadata.emsg;

/* loaded from: classes13.dex */
public final class EventMessage implements com.google.android.exoplayer2.metadata.Metadata.Entry {
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.emsg.EventMessage> CREATOR = new a9.a();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f44105d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f44106e;

    /* renamed from: f, reason: collision with root package name */
    public final long f44107f;

    /* renamed from: g, reason: collision with root package name */
    public final long f44108g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f44109h;

    /* renamed from: i, reason: collision with root package name */
    public int f44110i;

    public EventMessage(java.lang.String str, java.lang.String str2, long j17, long j18, byte[] bArr) {
        this.f44105d = str;
        this.f44106e = str2;
        this.f44107f = j17;
        this.f44108g = j18;
        this.f44109h = bArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.google.android.exoplayer2.metadata.emsg.EventMessage.class != obj.getClass()) {
            return false;
        }
        com.google.android.exoplayer2.metadata.emsg.EventMessage eventMessage = (com.google.android.exoplayer2.metadata.emsg.EventMessage) obj;
        return this.f44107f == eventMessage.f44107f && this.f44108g == eventMessage.f44108g && t9.d0.a(this.f44105d, eventMessage.f44105d) && t9.d0.a(this.f44106e, eventMessage.f44106e) && java.util.Arrays.equals(this.f44109h, eventMessage.f44109h);
    }

    public int hashCode() {
        if (this.f44110i == 0) {
            java.lang.String str = this.f44105d;
            int hashCode = (com.tencent.mm.plugin.appbrand.jsapi.v5.CTRL_INDEX + (str != null ? str.hashCode() : 0)) * 31;
            java.lang.String str2 = this.f44106e;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j17 = this.f44107f;
            int i17 = (hashCode2 + ((int) (j17 ^ (j17 >>> 32)))) * 31;
            long j18 = this.f44108g;
            this.f44110i = ((i17 + ((int) (j18 ^ (j18 >>> 32)))) * 31) + java.util.Arrays.hashCode(this.f44109h);
        }
        return this.f44110i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f44105d);
        parcel.writeString(this.f44106e);
        parcel.writeLong(this.f44107f);
        parcel.writeLong(this.f44108g);
        parcel.writeByteArray(this.f44109h);
    }

    public EventMessage(android.os.Parcel parcel) {
        this.f44105d = parcel.readString();
        this.f44106e = parcel.readString();
        this.f44107f = parcel.readLong();
        this.f44108g = parcel.readLong();
        this.f44109h = parcel.createByteArray();
    }
}
