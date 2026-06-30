package com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29;

/* renamed from: com.tencent.mm.plugin.facedetect.model.FaceDetectReportInfo */
/* loaded from: classes14.dex */
class C13515x46febba2 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.C13515x46febba2> f35508x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.c0();
    public final java.util.HashMap A;
    public final java.util.HashMap B;

    /* renamed from: d, reason: collision with root package name */
    public long f181485d;

    /* renamed from: e, reason: collision with root package name */
    public int f181486e;

    /* renamed from: f, reason: collision with root package name */
    public int f181487f;

    /* renamed from: g, reason: collision with root package name */
    public int f181488g;

    /* renamed from: h, reason: collision with root package name */
    public int f181489h;

    /* renamed from: i, reason: collision with root package name */
    public int f181490i;

    /* renamed from: m, reason: collision with root package name */
    public int f181491m;

    /* renamed from: n, reason: collision with root package name */
    public int f181492n;

    /* renamed from: o, reason: collision with root package name */
    public int f181493o;

    /* renamed from: p, reason: collision with root package name */
    public int f181494p;

    /* renamed from: q, reason: collision with root package name */
    public int f181495q;

    /* renamed from: r, reason: collision with root package name */
    public int f181496r;

    /* renamed from: s, reason: collision with root package name */
    public int f181497s;

    /* renamed from: t, reason: collision with root package name */
    public int f181498t;

    /* renamed from: u, reason: collision with root package name */
    public int f181499u;

    /* renamed from: v, reason: collision with root package name */
    public int f181500v;

    /* renamed from: w, reason: collision with root package name */
    public int f181501w;

    /* renamed from: x, reason: collision with root package name */
    public int f181502x;

    /* renamed from: y, reason: collision with root package name */
    public int f181503y;

    /* renamed from: z, reason: collision with root package name */
    public int f181504z;

    public C13515x46febba2() {
        this.f181485d = 0L;
        this.f181486e = 0;
        this.f181487f = 0;
        this.f181488g = 0;
        this.f181489h = 0;
        this.f181490i = 0;
        this.f181491m = 0;
        this.f181492n = 0;
        this.f181493o = 0;
        this.f181494p = 0;
        this.f181495q = 0;
        this.f181496r = 0;
        this.f181497s = 0;
        this.f181498t = 0;
        this.f181499u = 0;
        this.f181500v = 0;
        this.f181501w = 0;
        this.f181502x = 0;
        this.f181503y = 0;
        this.f181504z = 0;
        this.A = new java.util.HashMap();
        this.B = new java.util.HashMap();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m55230x9616526c() {
        return "detectOk: " + this.f181487f + ", motionOk: " + this.f181488g + ", noFace: " + this.f181489h + ", systemErr: " + this.f181486e + ", noLiveFace: " + this.f181490i + ", tooDark: " + this.f181491m + ", tooLight: " + this.f181492n + ", backLight: " + this.f181493o + ", tooSmall: " + this.f181494p + ", tooBig: " + this.f181495q + ", tooActive: " + this.f181496r + ", poseNotValid: " + this.f181497s + ", timeOut: " + this.f181498t + ", totalFrame: " + this.f181501w + ", verifyTime: " + this.f181502x + ", processTimePerFrame: " + this.f181504z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f181485d);
        parcel.writeInt(this.f181486e);
        parcel.writeInt(this.f181487f);
        parcel.writeInt(this.f181488g);
        parcel.writeInt(this.f181489h);
        parcel.writeInt(this.f181490i);
        parcel.writeInt(this.f181491m);
        parcel.writeInt(this.f181492n);
        parcel.writeInt(this.f181493o);
        parcel.writeInt(this.f181494p);
        parcel.writeInt(this.f181495q);
        parcel.writeInt(this.f181496r);
        parcel.writeInt(this.f181497s);
        parcel.writeInt(this.f181498t);
        parcel.writeInt(this.f181499u);
        parcel.writeInt(this.f181500v);
        parcel.writeInt(this.f181501w);
        parcel.writeInt(this.f181502x);
        parcel.writeInt(this.f181503y);
        parcel.writeInt(this.f181504z);
        parcel.writeMap(this.A);
        parcel.writeMap(this.B);
    }

    public C13515x46febba2(android.os.Parcel parcel) {
        this.f181485d = 0L;
        this.f181486e = 0;
        this.f181487f = 0;
        this.f181488g = 0;
        this.f181489h = 0;
        this.f181490i = 0;
        this.f181491m = 0;
        this.f181492n = 0;
        this.f181493o = 0;
        this.f181494p = 0;
        this.f181495q = 0;
        this.f181496r = 0;
        this.f181497s = 0;
        this.f181498t = 0;
        this.f181499u = 0;
        this.f181500v = 0;
        this.f181501w = 0;
        this.f181502x = 0;
        this.f181503y = 0;
        this.f181504z = 0;
        this.A = new java.util.HashMap();
        this.B = new java.util.HashMap();
        this.f181485d = parcel.readLong();
        this.f181486e = parcel.readInt();
        this.f181487f = parcel.readInt();
        this.f181488g = parcel.readInt();
        this.f181489h = parcel.readInt();
        this.f181490i = parcel.readInt();
        this.f181491m = parcel.readInt();
        this.f181492n = parcel.readInt();
        this.f181493o = parcel.readInt();
        this.f181494p = parcel.readInt();
        this.f181495q = parcel.readInt();
        this.f181496r = parcel.readInt();
        this.f181497s = parcel.readInt();
        this.f181498t = parcel.readInt();
        this.f181499u = parcel.readInt();
        this.f181500v = parcel.readInt();
        this.f181501w = parcel.readInt();
        this.f181502x = parcel.readInt();
        this.f181503y = parcel.readInt();
        this.f181504z = parcel.readInt();
        try {
            this.A = parcel.readHashMap(java.util.HashMap.class.getClassLoader());
            this.B = parcel.readHashMap(java.util.HashMap.class.getClassLoader());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FaceDetectReportInfo", e17, "", new java.lang.Object[0]);
        }
    }
}
