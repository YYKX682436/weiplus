package com.p314xaae8f345.mm.p661xcdc6dad4.p663xbe953013;

/* renamed from: com.tencent.mm.compatible.loader.PluginDescription */
/* loaded from: classes.dex */
public class C10399x6ed48ea9 implements android.os.Parcelable, java.io.Serializable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p661xcdc6dad4.p663xbe953013.C10399x6ed48ea9> f27790x681a0c0c = new yo.c();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f146302d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f146303e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f146304f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f146305g;

    /* renamed from: h, reason: collision with root package name */
    public final int f146306h;

    /* renamed from: i, reason: collision with root package name */
    public final int f146307i;

    public C10399x6ed48ea9(android.os.Parcel parcel) {
        java.lang.String readString = parcel.readString();
        readString.getClass();
        this.f146302d = readString;
        java.lang.String readString2 = parcel.readString();
        readString2.getClass();
        this.f146303e = readString2;
        java.lang.String readString3 = parcel.readString();
        readString3.getClass();
        this.f146304f = readString3;
        java.lang.String readString4 = parcel.readString();
        readString4.getClass();
        this.f146305g = readString4;
        this.f146306h = parcel.readInt();
        this.f146307i = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m43584x9616526c() {
        return java.lang.String.format("PluginDescription = [name=%s, url=%s, md5=%s, version=%s, size=%d, downloadType=%d]", this.f146302d, this.f146303e, this.f146304f, this.f146305g, java.lang.Integer.valueOf(this.f146306h), java.lang.Integer.valueOf(this.f146307i));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f146302d);
        parcel.writeString(this.f146303e);
        parcel.writeString(this.f146304f);
        parcel.writeString(this.f146305g);
        parcel.writeInt(this.f146306h);
        parcel.writeInt(this.f146307i);
    }
}
