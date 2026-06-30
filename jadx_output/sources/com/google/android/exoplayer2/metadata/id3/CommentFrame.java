package com.google.android.exoplayer2.metadata.id3;

/* loaded from: classes13.dex */
public final class CommentFrame extends com.google.android.exoplayer2.metadata.id3.Id3Frame {
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.id3.CommentFrame> CREATOR = new b9.e();

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f44127e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f44128f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f44129g;

    public CommentFrame(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super("COMM");
        this.f44127e = str;
        this.f44128f = str2;
        this.f44129g = str3;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.google.android.exoplayer2.metadata.id3.CommentFrame.class != obj.getClass()) {
            return false;
        }
        com.google.android.exoplayer2.metadata.id3.CommentFrame commentFrame = (com.google.android.exoplayer2.metadata.id3.CommentFrame) obj;
        return t9.d0.a(this.f44128f, commentFrame.f44128f) && t9.d0.a(this.f44127e, commentFrame.f44127e) && t9.d0.a(this.f44129g, commentFrame.f44129g);
    }

    public int hashCode() {
        java.lang.String str = this.f44127e;
        int hashCode = (com.tencent.mm.plugin.appbrand.jsapi.v5.CTRL_INDEX + (str != null ? str.hashCode() : 0)) * 31;
        java.lang.String str2 = this.f44128f;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        java.lang.String str3 = this.f44129g;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f44134d);
        parcel.writeString(this.f44127e);
        parcel.writeString(this.f44129g);
    }

    public CommentFrame(android.os.Parcel parcel) {
        super("COMM");
        this.f44127e = parcel.readString();
        this.f44128f = parcel.readString();
        this.f44129g = parcel.readString();
    }
}
