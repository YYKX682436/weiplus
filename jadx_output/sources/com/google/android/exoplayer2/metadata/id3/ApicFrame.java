package com.google.android.exoplayer2.metadata.id3;

/* loaded from: classes13.dex */
public final class ApicFrame extends com.google.android.exoplayer2.metadata.id3.Id3Frame {
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.id3.ApicFrame> CREATOR = new b9.a();

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f44111e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f44112f;

    /* renamed from: g, reason: collision with root package name */
    public final int f44113g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f44114h;

    public ApicFrame(java.lang.String str, java.lang.String str2, int i17, byte[] bArr) {
        super("APIC");
        this.f44111e = str;
        this.f44112f = str2;
        this.f44113g = i17;
        this.f44114h = bArr;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.google.android.exoplayer2.metadata.id3.ApicFrame.class != obj.getClass()) {
            return false;
        }
        com.google.android.exoplayer2.metadata.id3.ApicFrame apicFrame = (com.google.android.exoplayer2.metadata.id3.ApicFrame) obj;
        return this.f44113g == apicFrame.f44113g && t9.d0.a(this.f44111e, apicFrame.f44111e) && t9.d0.a(this.f44112f, apicFrame.f44112f) && java.util.Arrays.equals(this.f44114h, apicFrame.f44114h);
    }

    public int hashCode() {
        int i17 = (com.tencent.mm.plugin.appbrand.jsapi.v5.CTRL_INDEX + this.f44113g) * 31;
        java.lang.String str = this.f44111e;
        int hashCode = (i17 + (str != null ? str.hashCode() : 0)) * 31;
        java.lang.String str2 = this.f44112f;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + java.util.Arrays.hashCode(this.f44114h);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f44111e);
        parcel.writeString(this.f44112f);
        parcel.writeInt(this.f44113g);
        parcel.writeByteArray(this.f44114h);
    }

    public ApicFrame(android.os.Parcel parcel) {
        super("APIC");
        this.f44111e = parcel.readString();
        this.f44112f = parcel.readString();
        this.f44113g = parcel.readInt();
        this.f44114h = parcel.createByteArray();
    }
}
