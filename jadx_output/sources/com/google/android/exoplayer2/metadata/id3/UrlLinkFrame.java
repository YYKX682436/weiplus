package com.google.android.exoplayer2.metadata.id3;

/* loaded from: classes13.dex */
public final class UrlLinkFrame extends com.google.android.exoplayer2.metadata.id3.Id3Frame {
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.id3.UrlLinkFrame> CREATOR = new b9.l();

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f44139e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f44140f;

    public UrlLinkFrame(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(str);
        this.f44139e = str2;
        this.f44140f = str3;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.google.android.exoplayer2.metadata.id3.UrlLinkFrame.class != obj.getClass()) {
            return false;
        }
        com.google.android.exoplayer2.metadata.id3.UrlLinkFrame urlLinkFrame = (com.google.android.exoplayer2.metadata.id3.UrlLinkFrame) obj;
        return this.f44134d.equals(urlLinkFrame.f44134d) && t9.d0.a(this.f44139e, urlLinkFrame.f44139e) && t9.d0.a(this.f44140f, urlLinkFrame.f44140f);
    }

    public int hashCode() {
        int hashCode = (com.tencent.mm.plugin.appbrand.jsapi.v5.CTRL_INDEX + this.f44134d.hashCode()) * 31;
        java.lang.String str = this.f44139e;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        java.lang.String str2 = this.f44140f;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f44134d);
        parcel.writeString(this.f44139e);
        parcel.writeString(this.f44140f);
    }

    public UrlLinkFrame(android.os.Parcel parcel) {
        super(parcel.readString());
        this.f44139e = parcel.readString();
        this.f44140f = parcel.readString();
    }
}
