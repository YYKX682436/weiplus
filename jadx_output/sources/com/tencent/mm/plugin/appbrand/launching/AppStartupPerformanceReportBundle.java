package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public class AppStartupPerformanceReportBundle implements android.os.Parcelable, com.tencent.mm.plugin.appbrand.jsapi.g0 {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle> CREATOR = new com.tencent.mm.plugin.appbrand.launching.j3();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f84406d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f84407e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f84408f;

    /* renamed from: g, reason: collision with root package name */
    public long f84409g;

    /* renamed from: h, reason: collision with root package name */
    public long f84410h;

    /* renamed from: i, reason: collision with root package name */
    public long f84411i;

    /* renamed from: m, reason: collision with root package name */
    public long f84412m;

    /* renamed from: n, reason: collision with root package name */
    public long f84413n;

    /* renamed from: o, reason: collision with root package name */
    public long f84414o;

    /* renamed from: p, reason: collision with root package name */
    public long f84415p;

    /* renamed from: q, reason: collision with root package name */
    public long f84416q;

    /* renamed from: r, reason: collision with root package name */
    public long f84417r;

    /* renamed from: s, reason: collision with root package name */
    public long f84418s;

    /* renamed from: t, reason: collision with root package name */
    public int f84419t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f84420u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f84421v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f84422w;

    public AppStartupPerformanceReportBundle(java.lang.String str) {
        this.f84406d = str;
        this.f84407e = new java.util.LinkedList();
        this.f84408f = new java.util.LinkedList();
    }

    public boolean a() {
        java.util.List<com.tencent.mm.plugin.appbrand.report.model.kv_14609> list = this.f84408f;
        if (list == null) {
            return false;
        }
        for (com.tencent.mm.plugin.appbrand.report.model.kv_14609 kv_14609Var : list) {
            if (kv_14609Var != null) {
                if (kv_14609Var.f88039t > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f84406d);
        java.util.List list = this.f84407e;
        if (com.tencent.mm.sdk.platformtools.t8.L0(list)) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(list.size());
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                parcel.writeString(((com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemGetDownloadCGIStruct) it.next()).m());
            }
        }
        parcel.writeTypedList(this.f84408f);
        parcel.writeByte(this.f84420u ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f84409g);
        parcel.writeLong(this.f84410h);
        parcel.writeLong(this.f84411i);
        parcel.writeLong(this.f84412m);
        parcel.writeLong(this.f84413n);
        parcel.writeLong(this.f84414o);
        parcel.writeByte(this.f84421v ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f84422w ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f84415p);
        parcel.writeLong(this.f84416q);
        parcel.writeInt(this.f84419t);
    }

    public AppStartupPerformanceReportBundle(android.os.Parcel parcel, com.tencent.mm.plugin.appbrand.launching.j3 j3Var) {
        this.f84406d = parcel.readString();
        this.f84407e = new java.util.LinkedList();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            for (int i17 = 0; i17 < readInt; i17++) {
                ((java.util.LinkedList) this.f84407e).add(new com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemGetDownloadCGIStruct(parcel.readString()));
            }
        }
        this.f84408f = parcel.createTypedArrayList(com.tencent.mm.plugin.appbrand.report.model.kv_14609.CREATOR);
        this.f84420u = parcel.readByte() > 0;
        this.f84409g = parcel.readLong();
        this.f84410h = parcel.readLong();
        this.f84411i = parcel.readLong();
        this.f84412m = parcel.readLong();
        this.f84413n = parcel.readLong();
        this.f84414o = parcel.readLong();
        this.f84421v = parcel.readByte() > 0;
        this.f84422w = parcel.readByte() > 0;
        this.f84415p = parcel.readLong();
        this.f84416q = parcel.readLong();
        this.f84419t = parcel.readInt();
    }
}
