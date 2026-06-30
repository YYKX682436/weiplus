package com.tencent.mm.plugin.appbrand.report.quality;

/* loaded from: classes7.dex */
public class QualitySession implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.report.quality.QualitySession> CREATOR = new com.tencent.mm.plugin.appbrand.report.quality.o1();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f88134d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f88135e;

    /* renamed from: f, reason: collision with root package name */
    public final int f88136f;

    /* renamed from: g, reason: collision with root package name */
    public final int f88137g;

    /* renamed from: h, reason: collision with root package name */
    public final int f88138h;

    /* renamed from: i, reason: collision with root package name */
    public final int f88139i;

    /* renamed from: m, reason: collision with root package name */
    public long f88140m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f88141n;

    /* renamed from: o, reason: collision with root package name */
    public final long f88142o;

    public QualitySession(java.lang.String str, com.tencent.luggage.sdk.config.AppBrandInitConfigLU appBrandInitConfigLU, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject, long j17) {
        this.f88140m = 0L;
        this.f88141n = false;
        this.f88134d = str;
        this.f88135e = appBrandInitConfigLU.f77278d;
        int i17 = appBrandInitConfigLU.f77281g;
        if (i17 == 0) {
            this.f88136f = 1;
        } else if (i17 == 1) {
            this.f88136f = 2;
        } else if (i17 == 2) {
            this.f88136f = 3;
        }
        int i18 = appBrandInitConfigLU.f47284z + 1000;
        this.f88137g = i18;
        int i19 = appBrandStatObject.f87790f;
        this.f88138h = i19;
        int i27 = appBrandInitConfigLU.L;
        this.f88139i = i27;
        this.f88142o = j17;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.QualitySession", "primary <init> instanceId[%s] apptype[%d] scene[%d] appversion[%d] wxProcessColdStartTimestamp[%d]", str, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Long.valueOf(j17));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f88134d);
        parcel.writeString(this.f88135e);
        parcel.writeInt(this.f88136f);
        parcel.writeInt(this.f88137g);
        parcel.writeInt(this.f88138h);
        parcel.writeInt(this.f88139i);
        parcel.writeLong(this.f88140m);
        parcel.writeByte(this.f88141n ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f88142o);
    }

    public QualitySession(java.lang.String str, java.lang.String str2, int i17, k91.v5 v5Var, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject, long j17) {
        this.f88140m = 0L;
        this.f88141n = false;
        this.f88134d = str;
        this.f88135e = str2;
        if (i17 == 0) {
            this.f88136f = 1;
            this.f88139i = v5Var.w0().f77444d;
        } else if (i17 == 1) {
            this.f88136f = 2;
            this.f88139i = 0;
        } else if (i17 == 2) {
            this.f88136f = 3;
            this.f88139i = 0;
        }
        int i18 = v5Var.u0().f305629d;
        this.f88137g = i18;
        int i19 = appBrandStatObject.f87790f;
        this.f88138h = i19;
        this.f88142o = j17;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.QualitySession", "primary <init> instanceId[%s] apptype[%d] scene[%d] appversion[%d] wxProcessColdStartTimestamp[%d]", str, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(this.f88139i), java.lang.Long.valueOf(j17));
    }

    public QualitySession(android.os.Parcel parcel) {
        this.f88140m = 0L;
        this.f88141n = false;
        java.lang.String readString = parcel.readString();
        this.f88134d = readString;
        this.f88135e = parcel.readString();
        this.f88136f = parcel.readInt();
        int readInt = parcel.readInt();
        this.f88137g = readInt;
        int readInt2 = parcel.readInt();
        this.f88138h = readInt2;
        int readInt3 = parcel.readInt();
        this.f88139i = readInt3;
        this.f88140m = parcel.readLong();
        this.f88141n = parcel.readByte() > 0;
        long readLong = parcel.readLong();
        this.f88142o = readLong;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.QualitySession", "secondary <init> instanceId[%s] apptype[%d] scene[%d] appversion[%d] UIReadyT[%d] isNewUser[%b] wxProcessColdStartTimestamp[%d]", readString, java.lang.Integer.valueOf(readInt), java.lang.Integer.valueOf(readInt2), java.lang.Integer.valueOf(readInt3), java.lang.Long.valueOf(this.f88140m), java.lang.Boolean.valueOf(this.f88141n), java.lang.Long.valueOf(readLong));
    }
}
