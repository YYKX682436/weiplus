package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b;

/* renamed from: com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel */
/* loaded from: classes8.dex */
public class C16991x15ced046 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046> f37756x681a0c0c = new ut3.a();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Boolean f237193d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f237194e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f237195f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Long f237196g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Boolean f237197h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16994x3ba8255 f237198i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f237199m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Boolean f237200n;

    public C16991x15ced046(java.lang.Boolean bool, java.lang.String str, java.lang.String str2, java.lang.Long l17, java.lang.Boolean bool2, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16994x3ba8255 c16994x3ba8255) {
        this.f237199m = new java.util.ArrayList();
        this.f237193d = bool;
        this.f237194e = str;
        this.f237195f = str2;
        this.f237196g = l17;
        this.f237197h = bool2;
        this.f237198i = c16994x3ba8255;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16994x3ba8255 a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16994x3ba8255 c16994x3ba8255 = this.f237198i;
        return c16994x3ba8255 == null ? new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16994x3ba8255() : c16994x3ba8255;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeValue(this.f237193d);
        parcel.writeString(this.f237194e);
        parcel.writeString(this.f237195f);
        parcel.writeValue(this.f237196g);
        parcel.writeValue(this.f237197h);
        parcel.writeParcelable(this.f237198i, i17);
        parcel.writeList(this.f237199m);
        parcel.writeValue(this.f237200n);
    }

    public C16991x15ced046(android.os.Parcel parcel) {
        this.f237199m = new java.util.ArrayList();
        this.f237193d = (java.lang.Boolean) parcel.readValue(java.lang.Boolean.class.getClassLoader());
        this.f237194e = parcel.readString();
        this.f237195f = parcel.readString();
        this.f237196g = (java.lang.Long) parcel.readValue(java.lang.Long.class.getClassLoader());
        this.f237197h = (java.lang.Boolean) parcel.readValue(java.lang.Boolean.class.getClassLoader());
        this.f237198i = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16994x3ba8255) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16994x3ba8255.class.getClassLoader());
        this.f237199m = parcel.readArrayList(java.util.ArrayList.class.getClassLoader());
        this.f237200n = (java.lang.Boolean) parcel.readValue(java.lang.Boolean.class.getClassLoader());
    }
}
