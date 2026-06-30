package com.p314xaae8f345.mm.p965xc41bc71e.p967xc84c5534;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/msgsubscription/report/SubscribeMsgReporter$SubscribeMsgSettingReportInfo", "Landroid/os/Parcelable;", "CREATOR", "j31/d", "plugin-comm.api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.msgsubscription.report.SubscribeMsgReporter$SubscribeMsgSettingReportInfo */
/* loaded from: classes9.dex */
public final class C11163x161e898f implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final j31.d f32584x681a0c0c = new j31.d(null);

    /* renamed from: d, reason: collision with root package name */
    public int f153372d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f153373e;

    /* renamed from: f, reason: collision with root package name */
    public long f153374f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f153375g;

    /* renamed from: h, reason: collision with root package name */
    public int f153376h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f153377i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f153378m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f153379n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f153380o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f153381p;

    public C11163x161e898f() {
        this.f153373e = "";
        this.f153377i = new java.util.ArrayList();
        this.f153378m = new java.util.ArrayList();
        this.f153379n = new java.util.ArrayList();
        this.f153380o = new java.util.ArrayList();
        this.f153381p = new java.util.ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        dest.writeInt(this.f153372d);
        dest.writeString(this.f153373e);
        dest.writeLong(this.f153374f);
        dest.writeBoolean(this.f153375g);
        dest.writeInt(this.f153376h);
        dest.writeStringList(this.f153377i);
        dest.writeIntArray(kz5.n0.R0(this.f153378m));
        dest.writeStringList(this.f153379n);
        dest.writeIntArray(kz5.n0.R0(this.f153380o));
        dest.writeIntArray(kz5.n0.R0(this.f153381p));
    }

    public C11163x161e898f(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        this.f153373e = "";
        this.f153377i = new java.util.ArrayList();
        this.f153378m = new java.util.ArrayList();
        this.f153379n = new java.util.ArrayList();
        this.f153380o = new java.util.ArrayList();
        this.f153381p = new java.util.ArrayList();
        this.f153372d = parcel.readInt();
        java.lang.String readString = parcel.readString();
        this.f153373e = readString != null ? readString : "";
        this.f153374f = parcel.readLong();
        this.f153375g = parcel.readBoolean();
        this.f153376h = parcel.readInt();
        this.f153377i = new java.util.ArrayList();
        java.util.ArrayList<java.lang.String> createStringArrayList = parcel.createStringArrayList();
        this.f153377i = createStringArrayList == null ? new java.util.ArrayList<>() : createStringArrayList;
        int[] createIntArray = parcel.createIntArray();
        this.f153378m = createIntArray != null ? new java.util.ArrayList(kz5.v.e(createIntArray)) : new java.util.ArrayList();
        java.util.ArrayList<java.lang.String> createStringArrayList2 = parcel.createStringArrayList();
        this.f153379n = createStringArrayList2 == null ? new java.util.ArrayList<>() : createStringArrayList2;
        int[] createIntArray2 = parcel.createIntArray();
        this.f153380o = createIntArray2 != null ? new java.util.ArrayList(kz5.v.e(createIntArray2)) : new java.util.ArrayList();
        int[] createIntArray3 = parcel.createIntArray();
        this.f153381p = createIntArray3 != null ? new java.util.ArrayList(kz5.v.e(createIntArray3)) : new java.util.ArrayList();
    }
}
