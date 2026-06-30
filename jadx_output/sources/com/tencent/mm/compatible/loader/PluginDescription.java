package com.tencent.mm.compatible.loader;

/* loaded from: classes.dex */
public class PluginDescription implements android.os.Parcelable, java.io.Serializable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.compatible.loader.PluginDescription> CREATOR = new yo.c();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f64769d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f64770e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f64771f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f64772g;

    /* renamed from: h, reason: collision with root package name */
    public final int f64773h;

    /* renamed from: i, reason: collision with root package name */
    public final int f64774i;

    public PluginDescription(android.os.Parcel parcel) {
        java.lang.String readString = parcel.readString();
        readString.getClass();
        this.f64769d = readString;
        java.lang.String readString2 = parcel.readString();
        readString2.getClass();
        this.f64770e = readString2;
        java.lang.String readString3 = parcel.readString();
        readString3.getClass();
        this.f64771f = readString3;
        java.lang.String readString4 = parcel.readString();
        readString4.getClass();
        this.f64772g = readString4;
        this.f64773h = parcel.readInt();
        this.f64774i = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return java.lang.String.format("PluginDescription = [name=%s, url=%s, md5=%s, version=%s, size=%d, downloadType=%d]", this.f64769d, this.f64770e, this.f64771f, this.f64772g, java.lang.Integer.valueOf(this.f64773h), java.lang.Integer.valueOf(this.f64774i));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f64769d);
        parcel.writeString(this.f64770e);
        parcel.writeString(this.f64771f);
        parcel.writeString(this.f64772g);
        parcel.writeInt(this.f64773h);
        parcel.writeInt(this.f64774i);
    }
}
