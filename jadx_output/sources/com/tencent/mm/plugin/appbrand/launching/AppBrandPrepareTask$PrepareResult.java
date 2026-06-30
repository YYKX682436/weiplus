package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
final class AppBrandPrepareTask$PrepareResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareResult> CREATOR = new com.tencent.mm.plugin.appbrand.launching.q1();

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.launching.o1 f84385d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorAction f84386e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC f84387f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle f84388g;

    /* renamed from: h, reason: collision with root package name */
    public int f84389h;

    /* renamed from: i, reason: collision with root package name */
    public long f84390i;

    /* renamed from: m, reason: collision with root package name */
    public int f84391m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f84392n;

    public AppBrandPrepareTask$PrepareResult() {
        this.f84391m = 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPrepareTask", "writeToParcel event[%s]", this.f84385d);
        com.tencent.mm.plugin.appbrand.launching.o1 o1Var = this.f84385d;
        parcel.writeInt(o1Var != null ? o1Var.ordinal() + 1 : -1);
        parcel.writeParcelable(this.f84386e, i17);
        parcel.writeParcelable(this.f84387f, i17);
        parcel.writeInt(this.f84389h);
        parcel.writeLong(this.f84390i);
        parcel.writeParcelable(this.f84388g, i17);
        parcel.writeInt(this.f84391m);
        parcel.writeString(this.f84392n);
    }

    public AppBrandPrepareTask$PrepareResult(android.os.Parcel parcel) {
        com.tencent.mm.plugin.appbrand.launching.o1 o1Var;
        int i17 = 0;
        this.f84391m = 0;
        int readInt = parcel.readInt();
        com.tencent.mm.plugin.appbrand.launching.o1[] values = com.tencent.mm.plugin.appbrand.launching.o1.values();
        int length = values.length;
        while (true) {
            if (i17 >= length) {
                o1Var = null;
                break;
            }
            o1Var = values[i17];
            if (readInt == o1Var.ordinal() + 1) {
                break;
            } else {
                i17++;
            }
        }
        this.f84385d = o1Var;
        this.f84386e = (com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorAction) parcel.readParcelable(com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorAction.class.getClassLoader());
        this.f84387f = (com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC) parcel.readParcelable(com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC.class.getClassLoader());
        this.f84389h = parcel.readInt();
        this.f84390i = parcel.readLong();
        this.f84388g = (com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle) parcel.readParcelable(com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle.class.getClassLoader());
        this.f84391m = parcel.readInt();
        this.f84392n = parcel.readString();
    }
}
