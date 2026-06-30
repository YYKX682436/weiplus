package com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.api;

/* renamed from: com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter */
/* loaded from: classes10.dex */
public class C13384x547d8141 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.api.C13384x547d8141> f35459x681a0c0c = new o22.a();
    public java.lang.String A;
    public int B;
    public int C;
    public java.lang.String D;
    public int E = 2;
    public int F = 9;
    public int G;

    /* renamed from: d, reason: collision with root package name */
    public long f180116d;

    /* renamed from: e, reason: collision with root package name */
    public long f180117e;

    /* renamed from: f, reason: collision with root package name */
    public long f180118f;

    /* renamed from: g, reason: collision with root package name */
    public long f180119g;

    /* renamed from: h, reason: collision with root package name */
    public final long f180120h;

    /* renamed from: i, reason: collision with root package name */
    public final long f180121i;

    /* renamed from: m, reason: collision with root package name */
    public final long f180122m;

    /* renamed from: n, reason: collision with root package name */
    public long f180123n;

    /* renamed from: o, reason: collision with root package name */
    public long f180124o;

    /* renamed from: p, reason: collision with root package name */
    public long f180125p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f180126q;

    /* renamed from: r, reason: collision with root package name */
    public int f180127r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f180128s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f180129t;

    /* renamed from: u, reason: collision with root package name */
    public int f180130u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f180131v;

    /* renamed from: w, reason: collision with root package name */
    public final int f180132w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f180133x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f180134y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f180135z;

    public C13384x547d8141() {
    }

    public static void b(int i17, long j17, long j18, long j19, long j27, long j28, long j29, int i18, int i19, int i27) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15982, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j27), java.lang.Long.valueOf(j28), java.lang.Long.valueOf(j29), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
    }

    public static void c(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(852L, i17, i18);
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
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15982, 27, java.lang.Long.valueOf(this.f180116d), 0, 0, 0, 0, 0, 0, 0, java.lang.Integer.valueOf(this.G), str, 0, 0, 0, str2, java.lang.Integer.valueOf(this.E));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final void e(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15982, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(this.f180116d), 0, 0, 0, 0, 0, 0, 0, java.lang.Integer.valueOf(this.G), this.A, java.lang.Integer.valueOf(this.B), 0, java.lang.Integer.valueOf(this.C), this.D, java.lang.Integer.valueOf(this.E), java.lang.Integer.valueOf(this.F));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f180116d);
        parcel.writeLong(this.f180117e);
        parcel.writeLong(this.f180118f);
        parcel.writeLong(this.f180119g);
        parcel.writeLong(this.f180120h);
        parcel.writeLong(this.f180121i);
        parcel.writeLong(this.f180122m);
        parcel.writeLong(this.f180123n);
        parcel.writeLong(this.f180124o);
        parcel.writeLong(this.f180125p);
        parcel.writeInt(this.f180127r);
        parcel.writeByte(this.f180128s ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f180129t ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f180130u);
        parcel.writeByte(this.f180131v ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f180132w);
        parcel.writeString(this.f180126q);
        parcel.writeString(this.f180133x);
    }

    public C13384x547d8141(android.os.Parcel parcel) {
        this.f180116d = parcel.readLong();
        this.f180117e = parcel.readLong();
        this.f180118f = parcel.readLong();
        this.f180119g = parcel.readLong();
        this.f180120h = parcel.readLong();
        this.f180121i = parcel.readLong();
        this.f180122m = parcel.readLong();
        this.f180123n = parcel.readLong();
        this.f180124o = parcel.readLong();
        this.f180125p = parcel.readLong();
        this.f180127r = parcel.readInt();
        this.f180128s = parcel.readByte() != 0;
        this.f180129t = parcel.readByte() != 0;
        this.f180130u = parcel.readInt();
        this.f180131v = parcel.readByte() != 0;
        this.f180132w = parcel.readInt();
        this.f180126q = parcel.readString();
        this.f180133x = parcel.readString();
    }
}
