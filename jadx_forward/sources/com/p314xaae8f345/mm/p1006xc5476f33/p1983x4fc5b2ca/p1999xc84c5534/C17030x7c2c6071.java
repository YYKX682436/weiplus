package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1999xc84c5534;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/report/SnsCameraEditorReportItem;", "Landroid/os/Parcelable;", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.recordvideo.report.SnsCameraEditorReportItem */
/* loaded from: classes4.dex */
public final class C17030x7c2c6071 implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public int f237400d;

    /* renamed from: e, reason: collision with root package name */
    public int f237401e;

    /* renamed from: f, reason: collision with root package name */
    public int f237402f;

    /* renamed from: g, reason: collision with root package name */
    public int f237403g;

    /* renamed from: h, reason: collision with root package name */
    public int f237404h;

    /* renamed from: i, reason: collision with root package name */
    public int f237405i;

    /* renamed from: m, reason: collision with root package name */
    public int f237406m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f237407n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f237408o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f237409p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f237410q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f237411r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f237412s;

    /* renamed from: t, reason: collision with root package name */
    public int f237413t;

    /* renamed from: u, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1999xc84c5534.C17030x7c2c6071 f237399u = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1999xc84c5534.C17030x7c2c6071(0, 0, 0, 0, 0, 0, 0, "", "", "", "", "", "", 0);

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1999xc84c5534.C17030x7c2c6071> f37777x681a0c0c = new nu3.j();

    public C17030x7c2c6071(int i17, int i18, int i19, int i27, int i28, int i29, int i37, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i38) {
        this.f237400d = i17;
        this.f237401e = i18;
        this.f237402f = i19;
        this.f237403g = i27;
        this.f237404h = i28;
        this.f237405i = i29;
        this.f237406m = i37;
        this.f237407n = str;
        this.f237408o = str2;
        this.f237409p = str3;
        this.f237410q = str4;
        this.f237411r = str5;
        this.f237412s = str6;
        this.f237413t = i38;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m68056x9616526c() {
        return "SnsCameraEditorReportItem(initCount=" + this.f237400d + ", picUse=" + this.f237401e + ", isFromCamera=" + this.f237402f + ", isFromEditor=" + this.f237403g + ", picSource=" + this.f237404h + ", contentType=" + this.f237405i + ", isOriginalPic=" + this.f237406m + ", cameraEnterSessionID='" + this.f237407n + "', cameraSessionID='" + this.f237408o + "', editSessionID='" + this.f237409p + "', originMediaInfo='" + this.f237410q + "', editMediaInfo='" + this.f237411r + "', sendMediaInfo='" + this.f237412s + "')";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeInt(this.f237400d);
        parcel.writeInt(this.f237401e);
        parcel.writeInt(this.f237402f);
        parcel.writeInt(this.f237403g);
        parcel.writeInt(this.f237404h);
        parcel.writeInt(this.f237405i);
        parcel.writeInt(this.f237406m);
        parcel.writeString(this.f237407n);
        parcel.writeString(this.f237408o);
        parcel.writeString(this.f237409p);
        parcel.writeString(this.f237410q);
        parcel.writeString(this.f237411r);
        parcel.writeString(this.f237412s);
        parcel.writeInt(this.f237413t);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C17030x7c2c6071(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1999xc84c5534.C17030x7c2c6071 src) {
        this(src.f237400d, src.f237401e, src.f237402f, src.f237403g, src.f237404h, src.f237405i, src.f237406m, src.f237407n, src.f237408o, src.f237409p, src.f237410q, src.f237411r, src.f237412s, src.f237413t);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(src, "src");
    }
}
