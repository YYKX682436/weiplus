package com.tencent.mm.plugin.emojicapture.api;

/* loaded from: classes10.dex */
public class EmojiCaptureReporter implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter> CREATOR = new o22.a();
    public java.lang.String A;
    public int B;
    public int C;
    public java.lang.String D;
    public int E = 2;
    public int F = 9;
    public int G;

    /* renamed from: d, reason: collision with root package name */
    public long f98583d;

    /* renamed from: e, reason: collision with root package name */
    public long f98584e;

    /* renamed from: f, reason: collision with root package name */
    public long f98585f;

    /* renamed from: g, reason: collision with root package name */
    public long f98586g;

    /* renamed from: h, reason: collision with root package name */
    public final long f98587h;

    /* renamed from: i, reason: collision with root package name */
    public final long f98588i;

    /* renamed from: m, reason: collision with root package name */
    public final long f98589m;

    /* renamed from: n, reason: collision with root package name */
    public long f98590n;

    /* renamed from: o, reason: collision with root package name */
    public long f98591o;

    /* renamed from: p, reason: collision with root package name */
    public long f98592p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f98593q;

    /* renamed from: r, reason: collision with root package name */
    public int f98594r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f98595s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f98596t;

    /* renamed from: u, reason: collision with root package name */
    public int f98597u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f98598v;

    /* renamed from: w, reason: collision with root package name */
    public final int f98599w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f98600x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f98601y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f98602z;

    public EmojiCaptureReporter() {
    }

    public static void b(int i17, long j17, long j18, long j19, long j27, long j28, long j29, int i18, int i19, int i27) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15982, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j27), java.lang.Long.valueOf(j28), java.lang.Long.valueOf(j29), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
    }

    public static void c(int i17, int i18) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(852L, i17, i18);
    }

    public static void d(long j17, int i17, int i18) {
        b(21, j17, 0L, 0L, 0L, 0L, 0L, i17, 0, i18);
        if (i17 == 1) {
            c(5, 1);
            return;
        }
        if (i17 == 3) {
            c(21, 1);
        } else if (i17 == 4) {
            c(29, 1);
        } else {
            if (i17 != 5) {
                return;
            }
            c(30, 1);
        }
    }

    public static void f(long j17, int i17, int i18) {
        b(22, j17, 0L, 0L, 0L, 0L, 0L, 0, i17, i18);
        switch (i17) {
            case 1:
                c(7, 1);
                return;
            case 2:
                c(6, 1);
                return;
            case 3:
                c(8, 1);
                return;
            case 4:
                c(28, 1);
                return;
            case 5:
                c(22, 1);
                return;
            case 6:
                c(24, 1);
                return;
            case 7:
                c(25, 1);
                return;
            case 8:
                c(26, 1);
                return;
            case 9:
                c(27, 1);
                return;
            default:
                return;
        }
    }

    public void a(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15982, 27, java.lang.Long.valueOf(this.f98583d), 0, 0, 0, 0, 0, 0, 0, java.lang.Integer.valueOf(this.G), str, 0, 0, 0, str2, java.lang.Integer.valueOf(this.E));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final void e(int i17) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15982, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(this.f98583d), 0, 0, 0, 0, 0, 0, 0, java.lang.Integer.valueOf(this.G), this.A, java.lang.Integer.valueOf(this.B), 0, java.lang.Integer.valueOf(this.C), this.D, java.lang.Integer.valueOf(this.E), java.lang.Integer.valueOf(this.F));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f98583d);
        parcel.writeLong(this.f98584e);
        parcel.writeLong(this.f98585f);
        parcel.writeLong(this.f98586g);
        parcel.writeLong(this.f98587h);
        parcel.writeLong(this.f98588i);
        parcel.writeLong(this.f98589m);
        parcel.writeLong(this.f98590n);
        parcel.writeLong(this.f98591o);
        parcel.writeLong(this.f98592p);
        parcel.writeInt(this.f98594r);
        parcel.writeByte(this.f98595s ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f98596t ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f98597u);
        parcel.writeByte(this.f98598v ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f98599w);
        parcel.writeString(this.f98593q);
        parcel.writeString(this.f98600x);
    }

    public EmojiCaptureReporter(android.os.Parcel parcel) {
        this.f98583d = parcel.readLong();
        this.f98584e = parcel.readLong();
        this.f98585f = parcel.readLong();
        this.f98586g = parcel.readLong();
        this.f98587h = parcel.readLong();
        this.f98588i = parcel.readLong();
        this.f98589m = parcel.readLong();
        this.f98590n = parcel.readLong();
        this.f98591o = parcel.readLong();
        this.f98592p = parcel.readLong();
        this.f98594r = parcel.readInt();
        this.f98595s = parcel.readByte() != 0;
        this.f98596t = parcel.readByte() != 0;
        this.f98597u = parcel.readInt();
        this.f98598v = parcel.readByte() != 0;
        this.f98599w = parcel.readInt();
        this.f98593q = parcel.readString();
        this.f98600x = parcel.readString();
    }
}
