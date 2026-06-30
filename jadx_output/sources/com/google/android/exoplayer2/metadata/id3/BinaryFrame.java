package com.google.android.exoplayer2.metadata.id3;

/* loaded from: classes13.dex */
public final class BinaryFrame extends com.google.android.exoplayer2.metadata.id3.Id3Frame {
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.id3.BinaryFrame> CREATOR = new b9.b();

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f44115e;

    public BinaryFrame(java.lang.String str, byte[] bArr) {
        super(str);
        this.f44115e = bArr;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.google.android.exoplayer2.metadata.id3.BinaryFrame.class != obj.getClass()) {
            return false;
        }
        com.google.android.exoplayer2.metadata.id3.BinaryFrame binaryFrame = (com.google.android.exoplayer2.metadata.id3.BinaryFrame) obj;
        return this.f44134d.equals(binaryFrame.f44134d) && java.util.Arrays.equals(this.f44115e, binaryFrame.f44115e);
    }

    public int hashCode() {
        return ((com.tencent.mm.plugin.appbrand.jsapi.v5.CTRL_INDEX + this.f44134d.hashCode()) * 31) + java.util.Arrays.hashCode(this.f44115e);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f44134d);
        parcel.writeByteArray(this.f44115e);
    }

    public BinaryFrame(android.os.Parcel parcel) {
        super(parcel.readString());
        this.f44115e = parcel.createByteArray();
    }
}
