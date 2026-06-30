package com.google.android.exoplayer2.video;

/* loaded from: classes13.dex */
public final class ColorInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.video.ColorInfo> CREATOR = new u9.b();

    /* renamed from: d, reason: collision with root package name */
    public final int f44163d;

    /* renamed from: e, reason: collision with root package name */
    public final int f44164e;

    /* renamed from: f, reason: collision with root package name */
    public final int f44165f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f44166g;

    /* renamed from: h, reason: collision with root package name */
    public int f44167h;

    public ColorInfo(int i17, int i18, int i19, byte[] bArr) {
        this.f44163d = i17;
        this.f44164e = i18;
        this.f44165f = i19;
        this.f44166g = bArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && com.google.android.exoplayer2.video.ColorInfo.class == obj.getClass()) {
            com.google.android.exoplayer2.video.ColorInfo colorInfo = (com.google.android.exoplayer2.video.ColorInfo) obj;
            if (this.f44163d == colorInfo.f44163d && this.f44164e == colorInfo.f44164e && this.f44165f == colorInfo.f44165f && java.util.Arrays.equals(this.f44166g, colorInfo.f44166g)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f44167h == 0) {
            this.f44167h = ((((((com.tencent.mm.plugin.appbrand.jsapi.v5.CTRL_INDEX + this.f44163d) * 31) + this.f44164e) * 31) + this.f44165f) * 31) + java.util.Arrays.hashCode(this.f44166g);
        }
        return this.f44167h;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ColorInfo(");
        sb6.append(this.f44163d);
        sb6.append(", ");
        sb6.append(this.f44164e);
        sb6.append(", ");
        sb6.append(this.f44165f);
        sb6.append(", ");
        sb6.append(this.f44166g != null);
        sb6.append(")");
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f44163d);
        parcel.writeInt(this.f44164e);
        parcel.writeInt(this.f44165f);
        byte[] bArr = this.f44166g;
        parcel.writeInt(bArr != null ? 1 : 0);
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    public ColorInfo(android.os.Parcel parcel) {
        this.f44163d = parcel.readInt();
        this.f44164e = parcel.readInt();
        this.f44165f = parcel.readInt();
        this.f44166g = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }
}
