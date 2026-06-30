package com.tencent.mm.plugin.facedetect.model;

/* loaded from: classes14.dex */
public class FaceDetectReporter implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public long f99973d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f99974e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.facedetect.model.FaceDetectReportInfo f99975f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f99976g;

    /* renamed from: h, reason: collision with root package name */
    public final int f99977h;

    /* renamed from: i, reason: collision with root package name */
    public int f99978i;

    /* renamed from: m, reason: collision with root package name */
    public int f99979m;

    /* renamed from: n, reason: collision with root package name */
    public long f99980n;

    /* renamed from: o, reason: collision with root package name */
    public long f99981o;

    /* renamed from: p, reason: collision with root package name */
    public long f99982p;

    /* renamed from: q, reason: collision with root package name */
    public int f99983q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f99984r;

    /* renamed from: s, reason: collision with root package name */
    public static com.tencent.mm.plugin.facedetect.model.FaceDetectReporter f99972s = new com.tencent.mm.plugin.facedetect.model.FaceDetectReporter();
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.facedetect.model.FaceDetectReporter> CREATOR = new com.tencent.mm.plugin.facedetect.model.d0();

    public FaceDetectReporter(android.os.Parcel parcel) {
        this.f99973d = 0L;
        this.f99974e = false;
        this.f99975f = null;
        this.f99976g = "";
        this.f99977h = -1;
        this.f99978i = 0;
        this.f99979m = 0;
        this.f99980n = 0L;
        this.f99981o = -1L;
        this.f99982p = -1L;
        this.f99983q = 0;
        this.f99984r = false;
        this.f99973d = parcel.readLong();
        this.f99974e = parcel.readByte() != 0;
        this.f99975f = (com.tencent.mm.plugin.facedetect.model.FaceDetectReportInfo) parcel.readParcelable(com.tencent.mm.plugin.facedetect.model.FaceDetectReportInfo.class.getClassLoader());
        this.f99976g = parcel.readString();
        this.f99977h = parcel.readInt();
        this.f99978i = parcel.readInt();
        this.f99979m = parcel.readInt();
        this.f99980n = parcel.readLong();
        this.f99981o = parcel.readLong();
        this.f99982p = parcel.readLong();
        this.f99983q = parcel.readInt();
        this.f99984r = parcel.readByte() != 0;
    }

    public static com.tencent.mm.plugin.facedetect.model.FaceDetectReporter a() {
        com.tencent.mm.plugin.facedetect.model.FaceDetectReporter faceDetectReporter;
        com.tencent.mm.plugin.facedetect.model.FaceDetectReporter faceDetectReporter2 = f99972s;
        if (faceDetectReporter2 != null) {
            return faceDetectReporter2;
        }
        synchronized (com.tencent.mm.plugin.facedetect.model.FaceDetectReporter.class) {
            if (f99972s == null) {
                f99972s = new com.tencent.mm.plugin.facedetect.model.FaceDetectReporter();
            }
            faceDetectReporter = f99972s;
        }
        return faceDetectReporter;
    }

    public static void d(long j17, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectReporter", "hy: report video: bioId: %d, errType: %d, errCode: %d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        jx3.f.INSTANCE.d(14121, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    public void b(java.lang.String str, int i17) {
        long j17 = this.f99981o;
        long j18 = -1;
        if (j17 != -1) {
            long j19 = this.f99982p;
            if (j19 != -1 && j19 >= j17) {
                j18 = j19 - j17;
                com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectReporter", "report face detect interface called result, sessionId: %d, functionName: %s, interfaceType: %d, businessType: %d, totalTime: %d, isSuccess: %b, appId: %s, faceDetectCount: %d", java.lang.Long.valueOf(this.f99980n), str, -1, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j18), java.lang.Boolean.valueOf(this.f99984r), this.f99976g, java.lang.Integer.valueOf(this.f99983q));
                jx3.f.INSTANCE.d(14560, java.lang.Long.valueOf(this.f99980n), str, -1, java.lang.Integer.valueOf(i17), this.f99976g, java.lang.Integer.valueOf(this.f99984r ? 1 : 0), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(this.f99983q));
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.FaceDetectReporter", "not set calledStartTime:%d or calledEndTime: %d, total time is not valid", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(this.f99982p));
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectReporter", "report face detect interface called result, sessionId: %d, functionName: %s, interfaceType: %d, businessType: %d, totalTime: %d, isSuccess: %b, appId: %s, faceDetectCount: %d", java.lang.Long.valueOf(this.f99980n), str, -1, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j18), java.lang.Boolean.valueOf(this.f99984r), this.f99976g, java.lang.Integer.valueOf(this.f99983q));
        jx3.f.INSTANCE.d(14560, java.lang.Long.valueOf(this.f99980n), str, -1, java.lang.Integer.valueOf(i17), this.f99976g, java.lang.Integer.valueOf(this.f99984r ? 1 : 0), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(this.f99983q));
    }

    public void c(int i17, boolean z17, int i18, int i19, int i27) {
        int i28;
        com.tencent.mm.plugin.facedetect.model.FaceDetectReportInfo faceDetectReportInfo = this.f99975f;
        if (faceDetectReportInfo == null || this.f99974e) {
            return;
        }
        faceDetectReportInfo.toString();
        this.f99974e = true;
        com.tencent.mm.plugin.facedetect.model.FaceDetectReportInfo faceDetectReportInfo2 = this.f99975f;
        int i29 = 0;
        faceDetectReportInfo2.f99969x = 0;
        int i37 = faceDetectReportInfo2.f99968w;
        if (i37 != 0) {
            faceDetectReportInfo2.f99971z = faceDetectReportInfo2.f99970y / i37;
        }
        if (faceDetectReportInfo2.A.containsKey(0) && this.f99975f.B.containsKey(0)) {
            i28 = (int) (((java.lang.Long) this.f99975f.B.get(0)).longValue() - ((java.lang.Long) this.f99975f.A.get(0)).longValue());
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectReporter", "normalMotionTime : " + i28 + "  hashCode :" + hashCode());
        } else {
            i28 = 0;
        }
        if (this.f99975f.A.containsKey(4) && this.f99975f.B.containsKey(4)) {
            i29 = (int) (((java.lang.Long) this.f99975f.B.get(4)).longValue() - ((java.lang.Long) this.f99975f.A.get(4)).longValue());
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectReporter", "readNumberMotionTime : " + i29 + "  hashCode :" + hashCode());
        }
        if (this.f99975f.A.containsKey(6) && this.f99975f.B.containsKey(6)) {
            i29 = (int) (((java.lang.Long) this.f99975f.B.get(6)).longValue() - ((java.lang.Long) this.f99975f.A.get(6)).longValue());
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectReporter", "MOTION_REFLECTION : " + i29 + "  hashCode :" + hashCode());
        }
        hashCode();
        jx3.f.INSTANCE.d(14006, java.lang.Long.valueOf(this.f99973d), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(z17 ? 1 : 0), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(this.f99975f.f99954f), java.lang.Integer.valueOf(this.f99975f.f99955g), java.lang.Integer.valueOf(this.f99975f.f99956h), java.lang.Integer.valueOf(this.f99975f.f99953e), java.lang.Integer.valueOf(this.f99975f.f99957i), java.lang.Integer.valueOf(this.f99975f.f99958m), java.lang.Integer.valueOf(this.f99975f.f99959n), java.lang.Integer.valueOf(this.f99975f.f99960o), java.lang.Integer.valueOf(this.f99975f.f99961p), java.lang.Integer.valueOf(this.f99975f.f99962q), java.lang.Integer.valueOf(this.f99975f.f99963r), java.lang.Integer.valueOf(this.f99975f.f99964s), java.lang.Integer.valueOf(this.f99975f.f99965t), java.lang.Integer.valueOf(this.f99975f.f99969x), java.lang.Integer.valueOf(this.f99975f.f99966u), java.lang.Integer.valueOf(this.f99975f.f99967v), java.lang.Integer.valueOf(this.f99975f.f99971z), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29), this.f99976g, java.lang.Integer.valueOf(this.f99977h), java.lang.Integer.valueOf(this.f99978i), java.lang.Integer.valueOf(this.f99979m));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void e(int i17, long j17) {
        if (this.f99975f != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectReporter", "hashCode :" + hashCode() + " endTime:" + j17);
            this.f99975f.B.put(java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17));
        }
    }

    public void f(int i17, long j17) {
        if (this.f99975f != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectReporter", "hashCode :" + hashCode() + " startTime" + j17);
            this.f99975f.A.put(java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17));
        }
    }

    public void g(com.tencent.mm.plugin.facedetect.model.FaceDetectReporter faceDetectReporter) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mm.sdk.platformtools.z3.b(true);
        this.f99975f = faceDetectReporter.f99975f;
        this.f99974e = faceDetectReporter.f99974e;
        this.f99973d = faceDetectReporter.f99973d;
        this.f99978i = faceDetectReporter.f99978i;
        this.f99979m = faceDetectReporter.f99979m;
        com.tencent.mm.plugin.facedetect.model.FaceDetectReportInfo faceDetectReportInfo = this.f99975f;
        if (faceDetectReportInfo != null) {
            faceDetectReportInfo.toString();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f99973d);
        parcel.writeByte(this.f99974e ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f99975f, i17);
        parcel.writeString(this.f99976g);
        parcel.writeInt(this.f99977h);
        parcel.writeInt(this.f99978i);
        parcel.writeInt(this.f99979m);
        parcel.writeLong(this.f99980n);
        parcel.writeLong(this.f99981o);
        parcel.writeLong(this.f99982p);
        parcel.writeInt(this.f99983q);
        parcel.writeByte(this.f99984r ? (byte) 1 : (byte) 0);
    }

    public FaceDetectReporter() {
        this.f99973d = 0L;
        this.f99974e = false;
        this.f99975f = null;
        this.f99976g = "";
        this.f99977h = -1;
        this.f99978i = 0;
        this.f99979m = 0;
        this.f99980n = 0L;
        this.f99981o = -1L;
        this.f99982p = -1L;
        this.f99983q = 0;
        this.f99984r = false;
    }
}
