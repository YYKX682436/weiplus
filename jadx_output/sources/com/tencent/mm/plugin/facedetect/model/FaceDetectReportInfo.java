package com.tencent.mm.plugin.facedetect.model;

/* loaded from: classes14.dex */
class FaceDetectReportInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.facedetect.model.FaceDetectReportInfo> CREATOR = new com.tencent.mm.plugin.facedetect.model.c0();
    public final java.util.HashMap A;
    public final java.util.HashMap B;

    /* renamed from: d, reason: collision with root package name */
    public long f99952d;

    /* renamed from: e, reason: collision with root package name */
    public int f99953e;

    /* renamed from: f, reason: collision with root package name */
    public int f99954f;

    /* renamed from: g, reason: collision with root package name */
    public int f99955g;

    /* renamed from: h, reason: collision with root package name */
    public int f99956h;

    /* renamed from: i, reason: collision with root package name */
    public int f99957i;

    /* renamed from: m, reason: collision with root package name */
    public int f99958m;

    /* renamed from: n, reason: collision with root package name */
    public int f99959n;

    /* renamed from: o, reason: collision with root package name */
    public int f99960o;

    /* renamed from: p, reason: collision with root package name */
    public int f99961p;

    /* renamed from: q, reason: collision with root package name */
    public int f99962q;

    /* renamed from: r, reason: collision with root package name */
    public int f99963r;

    /* renamed from: s, reason: collision with root package name */
    public int f99964s;

    /* renamed from: t, reason: collision with root package name */
    public int f99965t;

    /* renamed from: u, reason: collision with root package name */
    public int f99966u;

    /* renamed from: v, reason: collision with root package name */
    public int f99967v;

    /* renamed from: w, reason: collision with root package name */
    public int f99968w;

    /* renamed from: x, reason: collision with root package name */
    public int f99969x;

    /* renamed from: y, reason: collision with root package name */
    public int f99970y;

    /* renamed from: z, reason: collision with root package name */
    public int f99971z;

    public FaceDetectReportInfo() {
        this.f99952d = 0L;
        this.f99953e = 0;
        this.f99954f = 0;
        this.f99955g = 0;
        this.f99956h = 0;
        this.f99957i = 0;
        this.f99958m = 0;
        this.f99959n = 0;
        this.f99960o = 0;
        this.f99961p = 0;
        this.f99962q = 0;
        this.f99963r = 0;
        this.f99964s = 0;
        this.f99965t = 0;
        this.f99966u = 0;
        this.f99967v = 0;
        this.f99968w = 0;
        this.f99969x = 0;
        this.f99970y = 0;
        this.f99971z = 0;
        this.A = new java.util.HashMap();
        this.B = new java.util.HashMap();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "detectOk: " + this.f99954f + ", motionOk: " + this.f99955g + ", noFace: " + this.f99956h + ", systemErr: " + this.f99953e + ", noLiveFace: " + this.f99957i + ", tooDark: " + this.f99958m + ", tooLight: " + this.f99959n + ", backLight: " + this.f99960o + ", tooSmall: " + this.f99961p + ", tooBig: " + this.f99962q + ", tooActive: " + this.f99963r + ", poseNotValid: " + this.f99964s + ", timeOut: " + this.f99965t + ", totalFrame: " + this.f99968w + ", verifyTime: " + this.f99969x + ", processTimePerFrame: " + this.f99971z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f99952d);
        parcel.writeInt(this.f99953e);
        parcel.writeInt(this.f99954f);
        parcel.writeInt(this.f99955g);
        parcel.writeInt(this.f99956h);
        parcel.writeInt(this.f99957i);
        parcel.writeInt(this.f99958m);
        parcel.writeInt(this.f99959n);
        parcel.writeInt(this.f99960o);
        parcel.writeInt(this.f99961p);
        parcel.writeInt(this.f99962q);
        parcel.writeInt(this.f99963r);
        parcel.writeInt(this.f99964s);
        parcel.writeInt(this.f99965t);
        parcel.writeInt(this.f99966u);
        parcel.writeInt(this.f99967v);
        parcel.writeInt(this.f99968w);
        parcel.writeInt(this.f99969x);
        parcel.writeInt(this.f99970y);
        parcel.writeInt(this.f99971z);
        parcel.writeMap(this.A);
        parcel.writeMap(this.B);
    }

    public FaceDetectReportInfo(android.os.Parcel parcel) {
        this.f99952d = 0L;
        this.f99953e = 0;
        this.f99954f = 0;
        this.f99955g = 0;
        this.f99956h = 0;
        this.f99957i = 0;
        this.f99958m = 0;
        this.f99959n = 0;
        this.f99960o = 0;
        this.f99961p = 0;
        this.f99962q = 0;
        this.f99963r = 0;
        this.f99964s = 0;
        this.f99965t = 0;
        this.f99966u = 0;
        this.f99967v = 0;
        this.f99968w = 0;
        this.f99969x = 0;
        this.f99970y = 0;
        this.f99971z = 0;
        this.A = new java.util.HashMap();
        this.B = new java.util.HashMap();
        this.f99952d = parcel.readLong();
        this.f99953e = parcel.readInt();
        this.f99954f = parcel.readInt();
        this.f99955g = parcel.readInt();
        this.f99956h = parcel.readInt();
        this.f99957i = parcel.readInt();
        this.f99958m = parcel.readInt();
        this.f99959n = parcel.readInt();
        this.f99960o = parcel.readInt();
        this.f99961p = parcel.readInt();
        this.f99962q = parcel.readInt();
        this.f99963r = parcel.readInt();
        this.f99964s = parcel.readInt();
        this.f99965t = parcel.readInt();
        this.f99966u = parcel.readInt();
        this.f99967v = parcel.readInt();
        this.f99968w = parcel.readInt();
        this.f99969x = parcel.readInt();
        this.f99970y = parcel.readInt();
        this.f99971z = parcel.readInt();
        try {
            this.A = parcel.readHashMap(java.util.HashMap.class.getClassLoader());
            this.B = parcel.readHashMap(java.util.HashMap.class.getClassLoader());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FaceDetectReportInfo", e17, "", new java.lang.Object[0]);
        }
    }
}
