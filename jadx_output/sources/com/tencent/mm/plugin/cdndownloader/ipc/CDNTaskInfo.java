package com.tencent.mm.plugin.cdndownloader.ipc;

/* loaded from: classes8.dex */
public class CDNTaskInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo> CREATOR = new jv1.a();

    /* renamed from: d, reason: collision with root package name */
    public boolean f95498d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f95499e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f95500f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f95501g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f95502h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f95503i;

    /* renamed from: m, reason: collision with root package name */
    public int f95504m;

    /* renamed from: n, reason: collision with root package name */
    public int f95505n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f95506o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f95507p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f95508q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f95509r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f95510s;

    public CDNTaskInfo(android.os.Parcel parcel, jv1.a aVar) {
        this.f95498d = parcel.readByte() == 1;
        this.f95499e = parcel.readString();
        this.f95500f = parcel.readString();
        this.f95501g = parcel.readString();
        this.f95502h = parcel.readString();
        this.f95503i = parcel.readString();
        this.f95504m = parcel.readInt();
        this.f95505n = parcel.readInt();
        this.f95506o = parcel.readByte() == 1;
        this.f95508q = parcel.readByte() == 1;
        this.f95509r = parcel.readString();
        this.f95510s = parcel.readByte() == 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        return obj == this || (obj != null && (obj instanceof com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo) && ((com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo) obj).f95499e.equals(this.f95499e));
    }

    public int hashCode() {
        return this.f95499e.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeByte(this.f95498d ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f95499e);
        parcel.writeString(this.f95500f);
        parcel.writeString(this.f95501g);
        parcel.writeString(this.f95502h);
        parcel.writeString(this.f95503i);
        parcel.writeInt(this.f95504m);
        parcel.writeInt(this.f95505n);
        parcel.writeByte(this.f95506o ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f95508q ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f95509r);
        parcel.writeByte(this.f95510s ? (byte) 1 : (byte) 0);
    }

    public CDNTaskInfo(java.lang.String str) {
        this.f95499e = str;
    }
}
