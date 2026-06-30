package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29;

/* renamed from: com.tencent.mm.plugin.address.model.RcptItem */
/* loaded from: classes.dex */
public class C11485x80cda4c8 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8> f33360x681a0c0c = new q71.e0();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f155904d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f155905e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f155906f;

    /* renamed from: g, reason: collision with root package name */
    public final int f155907g;

    /* renamed from: h, reason: collision with root package name */
    public final int f155908h;

    public C11485x80cda4c8(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f155904d = "";
        this.f155905e = "";
        this.f155906f = "";
        this.f155907g = -1;
        this.f155908h = 0;
        this.f155904d = str;
        this.f155905e = str2;
        this.f155906f = str3;
        if (str2 != null && str2.endsWith("0000000")) {
            this.f155907g = 0;
            return;
        }
        if (str2 != null && str2.endsWith("00000")) {
            this.f155907g = 1;
            this.f155908h = (str2.substring(0, 2) + "0000000").hashCode();
            return;
        }
        if (str2 != null && str2.endsWith("000")) {
            this.f155907g = 2;
            this.f155908h = (str2.substring(0, 4) + "00000").hashCode();
            return;
        }
        this.f155907g = 3;
        this.f155908h = (str2.substring(0, 6) + "000").hashCode();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f155904d);
        parcel.writeString(this.f155905e);
        parcel.writeString(this.f155906f);
        parcel.writeInt(this.f155907g);
        parcel.writeInt(this.f155908h);
    }

    public C11485x80cda4c8(android.os.Parcel parcel) {
        this.f155904d = "";
        this.f155905e = "";
        this.f155906f = "";
        this.f155907g = -1;
        this.f155908h = 0;
        this.f155904d = parcel.readString();
        this.f155905e = parcel.readString();
        this.f155906f = parcel.readString();
        this.f155907g = parcel.readInt();
        this.f155908h = parcel.readInt();
    }
}
