package com.google.android.exoplayer2.metadata.id3;

/* loaded from: classes13.dex */
public final class GeobFrame extends com.google.android.exoplayer2.metadata.id3.Id3Frame {
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.id3.GeobFrame> CREATOR = new b9.f();

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f44130e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f44131f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f44132g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f44133h;

    public GeobFrame(java.lang.String str, java.lang.String str2, java.lang.String str3, byte[] bArr) {
        super("GEOB");
        this.f44130e = str;
        this.f44131f = str2;
        this.f44132g = str3;
        this.f44133h = bArr;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.google.android.exoplayer2.metadata.id3.GeobFrame.class != obj.getClass()) {
            return false;
        }
        com.google.android.exoplayer2.metadata.id3.GeobFrame geobFrame = (com.google.android.exoplayer2.metadata.id3.GeobFrame) obj;
        return t9.d0.a(this.f44130e, geobFrame.f44130e) && t9.d0.a(this.f44131f, geobFrame.f44131f) && t9.d0.a(this.f44132g, geobFrame.f44132g) && java.util.Arrays.equals(this.f44133h, geobFrame.f44133h);
    }

    public int hashCode() {
        java.lang.String str = this.f44130e;
        int hashCode = (com.tencent.mm.plugin.appbrand.jsapi.v5.CTRL_INDEX + (str != null ? str.hashCode() : 0)) * 31;
        java.lang.String str2 = this.f44131f;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        java.lang.String str3 = this.f44132g;
        return ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + java.util.Arrays.hashCode(this.f44133h);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f44130e);
        parcel.writeString(this.f44131f);
        parcel.writeString(this.f44132g);
        parcel.writeByteArray(this.f44133h);
    }

    public GeobFrame(android.os.Parcel parcel) {
        super("GEOB");
        this.f44130e = parcel.readString();
        this.f44131f = parcel.readString();
        this.f44132g = parcel.readString();
        this.f44133h = parcel.createByteArray();
    }
}
