package com.tencent.mm.plugin.address.model;

/* loaded from: classes.dex */
public class RcptItem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.address.model.RcptItem> CREATOR = new q71.e0();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f74371d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f74372e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f74373f;

    /* renamed from: g, reason: collision with root package name */
    public final int f74374g;

    /* renamed from: h, reason: collision with root package name */
    public final int f74375h;

    public RcptItem(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f74371d = "";
        this.f74372e = "";
        this.f74373f = "";
        this.f74374g = -1;
        this.f74375h = 0;
        this.f74371d = str;
        this.f74372e = str2;
        this.f74373f = str3;
        if (str2 != null && str2.endsWith("0000000")) {
            this.f74374g = 0;
            return;
        }
        if (str2 != null && str2.endsWith("00000")) {
            this.f74374g = 1;
            this.f74375h = (str2.substring(0, 2) + "0000000").hashCode();
            return;
        }
        if (str2 != null && str2.endsWith("000")) {
            this.f74374g = 2;
            this.f74375h = (str2.substring(0, 4) + "00000").hashCode();
            return;
        }
        this.f74374g = 3;
        this.f74375h = (str2.substring(0, 6) + "000").hashCode();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f74371d);
        parcel.writeString(this.f74372e);
        parcel.writeString(this.f74373f);
        parcel.writeInt(this.f74374g);
        parcel.writeInt(this.f74375h);
    }

    public RcptItem(android.os.Parcel parcel) {
        this.f74371d = "";
        this.f74372e = "";
        this.f74373f = "";
        this.f74374g = -1;
        this.f74375h = 0;
        this.f74371d = parcel.readString();
        this.f74372e = parcel.readString();
        this.f74373f = parcel.readString();
        this.f74374g = parcel.readInt();
        this.f74375h = parcel.readInt();
    }
}
