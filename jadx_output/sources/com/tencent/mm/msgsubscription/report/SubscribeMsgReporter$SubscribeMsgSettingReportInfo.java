package com.tencent.mm.msgsubscription.report;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/msgsubscription/report/SubscribeMsgReporter$SubscribeMsgSettingReportInfo", "Landroid/os/Parcelable;", "CREATOR", "j31/d", "plugin-comm.api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class SubscribeMsgReporter$SubscribeMsgSettingReportInfo implements android.os.Parcelable {
    public static final j31.d CREATOR = new j31.d(null);

    /* renamed from: d, reason: collision with root package name */
    public int f71839d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f71840e;

    /* renamed from: f, reason: collision with root package name */
    public long f71841f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f71842g;

    /* renamed from: h, reason: collision with root package name */
    public int f71843h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f71844i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f71845m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f71846n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f71847o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f71848p;

    public SubscribeMsgReporter$SubscribeMsgSettingReportInfo() {
        this.f71840e = "";
        this.f71844i = new java.util.ArrayList();
        this.f71845m = new java.util.ArrayList();
        this.f71846n = new java.util.ArrayList();
        this.f71847o = new java.util.ArrayList();
        this.f71848p = new java.util.ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeInt(this.f71839d);
        dest.writeString(this.f71840e);
        dest.writeLong(this.f71841f);
        dest.writeBoolean(this.f71842g);
        dest.writeInt(this.f71843h);
        dest.writeStringList(this.f71844i);
        dest.writeIntArray(kz5.n0.R0(this.f71845m));
        dest.writeStringList(this.f71846n);
        dest.writeIntArray(kz5.n0.R0(this.f71847o));
        dest.writeIntArray(kz5.n0.R0(this.f71848p));
    }

    public SubscribeMsgReporter$SubscribeMsgSettingReportInfo(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        this.f71840e = "";
        this.f71844i = new java.util.ArrayList();
        this.f71845m = new java.util.ArrayList();
        this.f71846n = new java.util.ArrayList();
        this.f71847o = new java.util.ArrayList();
        this.f71848p = new java.util.ArrayList();
        this.f71839d = parcel.readInt();
        java.lang.String readString = parcel.readString();
        this.f71840e = readString != null ? readString : "";
        this.f71841f = parcel.readLong();
        this.f71842g = parcel.readBoolean();
        this.f71843h = parcel.readInt();
        this.f71844i = new java.util.ArrayList();
        java.util.ArrayList<java.lang.String> createStringArrayList = parcel.createStringArrayList();
        this.f71844i = createStringArrayList == null ? new java.util.ArrayList<>() : createStringArrayList;
        int[] createIntArray = parcel.createIntArray();
        this.f71845m = createIntArray != null ? new java.util.ArrayList(kz5.v.e(createIntArray)) : new java.util.ArrayList();
        java.util.ArrayList<java.lang.String> createStringArrayList2 = parcel.createStringArrayList();
        this.f71846n = createStringArrayList2 == null ? new java.util.ArrayList<>() : createStringArrayList2;
        int[] createIntArray2 = parcel.createIntArray();
        this.f71847o = createIntArray2 != null ? new java.util.ArrayList(kz5.v.e(createIntArray2)) : new java.util.ArrayList();
        int[] createIntArray3 = parcel.createIntArray();
        this.f71848p = createIntArray3 != null ? new java.util.ArrayList(kz5.v.e(createIntArray3)) : new java.util.ArrayList();
    }
}
