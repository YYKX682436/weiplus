package com.google.android.exoplayer2.metadata.id3;

/* loaded from: classes13.dex */
public final class TextInformationFrame extends com.google.android.exoplayer2.metadata.id3.Id3Frame {
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.id3.TextInformationFrame> CREATOR = new b9.k();

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f44137e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f44138f;

    public TextInformationFrame(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(str);
        this.f44137e = str2;
        this.f44138f = str3;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.google.android.exoplayer2.metadata.id3.TextInformationFrame.class != obj.getClass()) {
            return false;
        }
        com.google.android.exoplayer2.metadata.id3.TextInformationFrame textInformationFrame = (com.google.android.exoplayer2.metadata.id3.TextInformationFrame) obj;
        return this.f44134d.equals(textInformationFrame.f44134d) && t9.d0.a(this.f44137e, textInformationFrame.f44137e) && t9.d0.a(this.f44138f, textInformationFrame.f44138f);
    }

    public int hashCode() {
        int hashCode = (com.tencent.mm.plugin.appbrand.jsapi.v5.CTRL_INDEX + this.f44134d.hashCode()) * 31;
        java.lang.String str = this.f44137e;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        java.lang.String str2 = this.f44138f;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f44134d);
        parcel.writeString(this.f44137e);
        parcel.writeString(this.f44138f);
    }

    public TextInformationFrame(android.os.Parcel parcel) {
        super(parcel.readString());
        this.f44137e = parcel.readString();
        this.f44138f = parcel.readString();
    }
}
