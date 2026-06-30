package com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29;

/* renamed from: com.tencent.mm.plugin.facedetect.model.FaceDetectReporter */
/* loaded from: classes14.dex */
public class C13516xe45e9481 implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public long f181506d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f181507e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.C13515x46febba2 f181508f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f181509g;

    /* renamed from: h, reason: collision with root package name */
    public final int f181510h;

    /* renamed from: i, reason: collision with root package name */
    public int f181511i;

    /* renamed from: m, reason: collision with root package name */
    public int f181512m;

    /* renamed from: n, reason: collision with root package name */
    public long f181513n;

    /* renamed from: o, reason: collision with root package name */
    public long f181514o;

    /* renamed from: p, reason: collision with root package name */
    public long f181515p;

    /* renamed from: q, reason: collision with root package name */
    public int f181516q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f181517r;

    /* renamed from: s, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.C13516xe45e9481 f181505s = new com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.C13516xe45e9481();

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.C13516xe45e9481> f35509x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.d0();

    public C13516xe45e9481(android.os.Parcel parcel) {
        this.f181506d = 0L;
        this.f181507e = false;
        this.f181508f = null;
        this.f181509g = "";
        this.f181510h = -1;
        this.f181511i = 0;
        this.f181512m = 0;
        this.f181513n = 0L;
        this.f181514o = -1L;
        this.f181515p = -1L;
        this.f181516q = 0;
        this.f181517r = false;
        this.f181506d = parcel.readLong();
        this.f181507e = parcel.readByte() != 0;
        this.f181508f = (com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.C13515x46febba2) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.C13515x46febba2.class.getClassLoader());
        this.f181509g = parcel.readString();
        this.f181510h = parcel.readInt();
        this.f181511i = parcel.readInt();
        this.f181512m = parcel.readInt();
        this.f181513n = parcel.readLong();
        this.f181514o = parcel.readLong();
        this.f181515p = parcel.readLong();
        this.f181516q = parcel.readInt();
        this.f181517r = parcel.readByte() != 0;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.C13516xe45e9481 a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.C13516xe45e9481 c13516xe45e9481;
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.C13516xe45e9481 c13516xe45e94812 = f181505s;
        if (c13516xe45e94812 != null) {
            return c13516xe45e94812;
        }
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.C13516xe45e9481.class) {
            if (f181505s == null) {
                f181505s = new com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.C13516xe45e9481();
            }
            c13516xe45e9481 = f181505s;
        }
        return c13516xe45e9481;
    }

    public static void d(long j17, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectReporter", "hy: report video: bioId: %d, errType: %d, errCode: %d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        jx3.f.INSTANCE.d(14121, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    public void b(java.lang.String str, int i17) {
        long j17 = this.f181514o;
        long j18 = -1;
        if (j17 != -1) {
            long j19 = this.f181515p;
            if (j19 != -1 && j19 >= j17) {
                j18 = j19 - j17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectReporter", "report face detect interface called result, sessionId: %d, functionName: %s, interfaceType: %d, businessType: %d, totalTime: %d, isSuccess: %b, appId: %s, faceDetectCount: %d", java.lang.Long.valueOf(this.f181513n), str, -1, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j18), java.lang.Boolean.valueOf(this.f181517r), this.f181509g, java.lang.Integer.valueOf(this.f181516q));
                jx3.f.INSTANCE.d(14560, java.lang.Long.valueOf(this.f181513n), str, -1, java.lang.Integer.valueOf(i17), this.f181509g, java.lang.Integer.valueOf(this.f181517r ? 1 : 0), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(this.f181516q));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceDetectReporter", "not set calledStartTime:%d or calledEndTime: %d, total time is not valid", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(this.f181515p));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectReporter", "report face detect interface called result, sessionId: %d, functionName: %s, interfaceType: %d, businessType: %d, totalTime: %d, isSuccess: %b, appId: %s, faceDetectCount: %d", java.lang.Long.valueOf(this.f181513n), str, -1, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j18), java.lang.Boolean.valueOf(this.f181517r), this.f181509g, java.lang.Integer.valueOf(this.f181516q));
        jx3.f.INSTANCE.d(14560, java.lang.Long.valueOf(this.f181513n), str, -1, java.lang.Integer.valueOf(i17), this.f181509g, java.lang.Integer.valueOf(this.f181517r ? 1 : 0), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(this.f181516q));
    }

    public void c(int i17, boolean z17, int i18, int i19, int i27) {
        int i28;
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.C13515x46febba2 c13515x46febba2 = this.f181508f;
        if (c13515x46febba2 == null || this.f181507e) {
            return;
        }
        c13515x46febba2.m55230x9616526c();
        this.f181507e = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.C13515x46febba2 c13515x46febba22 = this.f181508f;
        int i29 = 0;
        c13515x46febba22.f181502x = 0;
        int i37 = c13515x46febba22.f181501w;
        if (i37 != 0) {
            c13515x46febba22.f181504z = c13515x46febba22.f181503y / i37;
        }
        if (c13515x46febba22.A.containsKey(0) && this.f181508f.B.containsKey(0)) {
            i28 = (int) (((java.lang.Long) this.f181508f.B.get(0)).longValue() - ((java.lang.Long) this.f181508f.A.get(0)).longValue());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectReporter", "normalMotionTime : " + i28 + "  hashCode :" + hashCode());
        } else {
            i28 = 0;
        }
        if (this.f181508f.A.containsKey(4) && this.f181508f.B.containsKey(4)) {
            i29 = (int) (((java.lang.Long) this.f181508f.B.get(4)).longValue() - ((java.lang.Long) this.f181508f.A.get(4)).longValue());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectReporter", "readNumberMotionTime : " + i29 + "  hashCode :" + hashCode());
        }
        if (this.f181508f.A.containsKey(6) && this.f181508f.B.containsKey(6)) {
            i29 = (int) (((java.lang.Long) this.f181508f.B.get(6)).longValue() - ((java.lang.Long) this.f181508f.A.get(6)).longValue());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectReporter", "MOTION_REFLECTION : " + i29 + "  hashCode :" + hashCode());
        }
        hashCode();
        jx3.f.INSTANCE.d(14006, java.lang.Long.valueOf(this.f181506d), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(z17 ? 1 : 0), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(this.f181508f.f181487f), java.lang.Integer.valueOf(this.f181508f.f181488g), java.lang.Integer.valueOf(this.f181508f.f181489h), java.lang.Integer.valueOf(this.f181508f.f181486e), java.lang.Integer.valueOf(this.f181508f.f181490i), java.lang.Integer.valueOf(this.f181508f.f181491m), java.lang.Integer.valueOf(this.f181508f.f181492n), java.lang.Integer.valueOf(this.f181508f.f181493o), java.lang.Integer.valueOf(this.f181508f.f181494p), java.lang.Integer.valueOf(this.f181508f.f181495q), java.lang.Integer.valueOf(this.f181508f.f181496r), java.lang.Integer.valueOf(this.f181508f.f181497s), java.lang.Integer.valueOf(this.f181508f.f181498t), java.lang.Integer.valueOf(this.f181508f.f181502x), java.lang.Integer.valueOf(this.f181508f.f181499u), java.lang.Integer.valueOf(this.f181508f.f181500v), java.lang.Integer.valueOf(this.f181508f.f181504z), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29), this.f181509g, java.lang.Integer.valueOf(this.f181510h), java.lang.Integer.valueOf(this.f181511i), java.lang.Integer.valueOf(this.f181512m));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void e(int i17, long j17) {
        if (this.f181508f != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectReporter", "hashCode :" + hashCode() + " endTime:" + j17);
            this.f181508f.B.put(java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17));
        }
    }

    public void f(int i17, long j17) {
        if (this.f181508f != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectReporter", "hashCode :" + hashCode() + " startTime" + j17);
            this.f181508f.A.put(java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17));
        }
    }

    public void g(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.C13516xe45e9481 c13516xe45e9481) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
        this.f181508f = c13516xe45e9481.f181508f;
        this.f181507e = c13516xe45e9481.f181507e;
        this.f181506d = c13516xe45e9481.f181506d;
        this.f181511i = c13516xe45e9481.f181511i;
        this.f181512m = c13516xe45e9481.f181512m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.C13515x46febba2 c13515x46febba2 = this.f181508f;
        if (c13515x46febba2 != null) {
            c13515x46febba2.m55230x9616526c();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f181506d);
        parcel.writeByte(this.f181507e ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f181508f, i17);
        parcel.writeString(this.f181509g);
        parcel.writeInt(this.f181510h);
        parcel.writeInt(this.f181511i);
        parcel.writeInt(this.f181512m);
        parcel.writeLong(this.f181513n);
        parcel.writeLong(this.f181514o);
        parcel.writeLong(this.f181515p);
        parcel.writeInt(this.f181516q);
        parcel.writeByte(this.f181517r ? (byte) 1 : (byte) 0);
    }

    public C13516xe45e9481() {
        this.f181506d = 0L;
        this.f181507e = false;
        this.f181508f = null;
        this.f181509g = "";
        this.f181510h = -1;
        this.f181511i = 0;
        this.f181512m = 0;
        this.f181513n = 0L;
        this.f181514o = -1L;
        this.f181515p = -1L;
        this.f181516q = 0;
        this.f181517r = false;
    }
}
