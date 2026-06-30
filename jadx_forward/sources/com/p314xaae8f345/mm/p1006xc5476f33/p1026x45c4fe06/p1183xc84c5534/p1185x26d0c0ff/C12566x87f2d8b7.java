package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff;

/* renamed from: com.tencent.mm.plugin.appbrand.report.quality.QualitySession */
/* loaded from: classes7.dex */
public class C12566x87f2d8b7 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7> f35157x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.o1();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f169667d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f169668e;

    /* renamed from: f, reason: collision with root package name */
    public final int f169669f;

    /* renamed from: g, reason: collision with root package name */
    public final int f169670g;

    /* renamed from: h, reason: collision with root package name */
    public final int f169671h;

    /* renamed from: i, reason: collision with root package name */
    public final int f169672i;

    /* renamed from: m, reason: collision with root package name */
    public long f169673m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f169674n;

    /* renamed from: o, reason: collision with root package name */
    public final long f169675o;

    public C12566x87f2d8b7(java.lang.String str, com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1 c3897xbc286aa1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559, long j17) {
        this.f169673m = 0L;
        this.f169674n = false;
        this.f169667d = str;
        this.f169668e = c3897xbc286aa1.f158811d;
        int i17 = c3897xbc286aa1.f158814g;
        if (i17 == 0) {
            this.f169669f = 1;
        } else if (i17 == 1) {
            this.f169669f = 2;
        } else if (i17 == 2) {
            this.f169669f = 3;
        }
        int i18 = c3897xbc286aa1.f128817z + 1000;
        this.f169670g = i18;
        int i19 = c12559xbdae8559.f169323f;
        this.f169671h = i19;
        int i27 = c3897xbc286aa1.L;
        this.f169672i = i27;
        this.f169675o = j17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.QualitySession", "primary <init> instanceId[%s] apptype[%d] scene[%d] appversion[%d] wxProcessColdStartTimestamp[%d]", str, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Long.valueOf(j17));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f169667d);
        parcel.writeString(this.f169668e);
        parcel.writeInt(this.f169669f);
        parcel.writeInt(this.f169670g);
        parcel.writeInt(this.f169671h);
        parcel.writeInt(this.f169672i);
        parcel.writeLong(this.f169673m);
        parcel.writeByte(this.f169674n ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f169675o);
    }

    public C12566x87f2d8b7(java.lang.String str, java.lang.String str2, int i17, k91.v5 v5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559, long j17) {
        this.f169673m = 0L;
        this.f169674n = false;
        this.f169667d = str;
        this.f169668e = str2;
        if (i17 == 0) {
            this.f169669f = 1;
            this.f169672i = v5Var.w0().f158977d;
        } else if (i17 == 1) {
            this.f169669f = 2;
            this.f169672i = 0;
        } else if (i17 == 2) {
            this.f169669f = 3;
            this.f169672i = 0;
        }
        int i18 = v5Var.u0().f387162d;
        this.f169670g = i18;
        int i19 = c12559xbdae8559.f169323f;
        this.f169671h = i19;
        this.f169675o = j17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.QualitySession", "primary <init> instanceId[%s] apptype[%d] scene[%d] appversion[%d] wxProcessColdStartTimestamp[%d]", str, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(this.f169672i), java.lang.Long.valueOf(j17));
    }

    public C12566x87f2d8b7(android.os.Parcel parcel) {
        this.f169673m = 0L;
        this.f169674n = false;
        java.lang.String readString = parcel.readString();
        this.f169667d = readString;
        this.f169668e = parcel.readString();
        this.f169669f = parcel.readInt();
        int readInt = parcel.readInt();
        this.f169670g = readInt;
        int readInt2 = parcel.readInt();
        this.f169671h = readInt2;
        int readInt3 = parcel.readInt();
        this.f169672i = readInt3;
        this.f169673m = parcel.readLong();
        this.f169674n = parcel.readByte() > 0;
        long readLong = parcel.readLong();
        this.f169675o = readLong;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.QualitySession", "secondary <init> instanceId[%s] apptype[%d] scene[%d] appversion[%d] UIReadyT[%d] isNewUser[%b] wxProcessColdStartTimestamp[%d]", readString, java.lang.Integer.valueOf(readInt), java.lang.Integer.valueOf(readInt2), java.lang.Integer.valueOf(readInt3), java.lang.Long.valueOf(this.f169673m), java.lang.Boolean.valueOf(this.f169674n), java.lang.Long.valueOf(readLong));
    }
}
