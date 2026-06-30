package com.google.android.exoplayer2.metadata.id3;

/* loaded from: classes13.dex */
public final class PrivFrame extends com.google.android.exoplayer2.metadata.id3.Id3Frame {
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.id3.PrivFrame> CREATOR = new b9.j();

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f44135e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f44136f;

    public PrivFrame(java.lang.String str, byte[] bArr) {
        super("PRIV");
        this.f44135e = str;
        this.f44136f = bArr;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.google.android.exoplayer2.metadata.id3.PrivFrame.class != obj.getClass()) {
            return false;
        }
        com.google.android.exoplayer2.metadata.id3.PrivFrame privFrame = (com.google.android.exoplayer2.metadata.id3.PrivFrame) obj;
        return t9.d0.a(this.f44135e, privFrame.f44135e) && java.util.Arrays.equals(this.f44136f, privFrame.f44136f);
    }

    public int hashCode() {
        java.lang.String str = this.f44135e;
        return ((com.tencent.mm.plugin.appbrand.jsapi.v5.CTRL_INDEX + (str != null ? str.hashCode() : 0)) * 31) + java.util.Arrays.hashCode(this.f44136f);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f44135e);
        parcel.writeByteArray(this.f44136f);
    }

    public PrivFrame(android.os.Parcel parcel) {
        super("PRIV");
        this.f44135e = parcel.readString();
        this.f44136f = parcel.createByteArray();
    }
}
