package com.tencent.mm.modelstat;

/* loaded from: classes12.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public int f71553a = -2;

    /* renamed from: b, reason: collision with root package name */
    public int f71554b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f71555c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f71556d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f71557e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f71558f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f71559g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f71560h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f71561i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f71562j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f71563k = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f71564l = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f71565m = 0;

    /* renamed from: n, reason: collision with root package name */
    public long f71566n = 0;

    /* renamed from: o, reason: collision with root package name */
    public long f71567o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f71568p = 0;

    /* renamed from: q, reason: collision with root package name */
    public long f71569q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f71570r = 0;

    /* renamed from: s, reason: collision with root package name */
    public long f71571s = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f71572t = 0;

    /* renamed from: u, reason: collision with root package name */
    public long f71573u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f71574v = 0;

    /* renamed from: w, reason: collision with root package name */
    public long f71575w = 0;

    /* renamed from: x, reason: collision with root package name */
    public long f71576x = 0;

    /* renamed from: y, reason: collision with root package name */
    public long f71577y = 0;

    /* renamed from: z, reason: collision with root package name */
    public long f71578z = 0;
    public long A = 0;
    public long B = 0;
    public long C = 0;
    public long D = 0;
    public long E = 0;

    public void a(android.database.Cursor cursor) {
        this.f71554b = cursor.getInt(0);
        this.f71555c = cursor.getInt(1);
        this.f71556d = cursor.getInt(2);
        this.f71557e = cursor.getLong(3);
        this.f71558f = cursor.getInt(4);
        this.f71559g = cursor.getLong(5);
        this.f71560h = cursor.getInt(6);
        this.f71561i = cursor.getLong(7);
        this.f71562j = cursor.getInt(8);
        this.f71563k = cursor.getLong(9);
        this.f71564l = cursor.getLong(10);
        this.f71565m = cursor.getLong(11);
        this.f71566n = cursor.getLong(12);
        this.f71567o = cursor.getLong(13);
        this.f71568p = cursor.getInt(14);
        this.f71569q = cursor.getLong(15);
        this.f71570r = cursor.getInt(16);
        this.f71571s = cursor.getLong(17);
        this.f71572t = cursor.getInt(18);
        this.f71573u = cursor.getLong(19);
        this.f71574v = cursor.getInt(20);
        this.f71575w = cursor.getLong(21);
        this.f71576x = cursor.getLong(22);
        this.f71577y = cursor.getLong(23);
        this.f71578z = cursor.getLong(24);
        this.A = cursor.getLong(25);
        this.B = cursor.getLong(26);
        this.C = cursor.getLong(27);
        this.D = cursor.getLong(28);
        this.E = cursor.getLong(29);
    }

    public java.lang.String toString() {
        return java.lang.String.format("NetStatInfo:[mobile in=%dB/%dB/%dB, out=%dB/%dB/%dB][wifi in=%dB/%dB/%dB, out=%dB/%dB/%dB][text in=%d/%dB, out=%d/%dB][image in=%d/%dB, out=%d/%dB][voice in=%d/%dB, out=%d/%dB][video in=%d/%dB, out=%d/%dB]", java.lang.Long.valueOf(this.f71564l), java.lang.Long.valueOf(this.B), java.lang.Long.valueOf(this.f71566n), java.lang.Long.valueOf(this.f71576x), java.lang.Long.valueOf(this.D), java.lang.Long.valueOf(this.f71578z), java.lang.Long.valueOf(this.f71565m), java.lang.Long.valueOf(this.C), java.lang.Long.valueOf(this.f71567o), java.lang.Long.valueOf(this.f71577y), java.lang.Long.valueOf(this.E), java.lang.Long.valueOf(this.A), java.lang.Integer.valueOf(this.f71556d), java.lang.Long.valueOf(this.f71557e), java.lang.Integer.valueOf(this.f71568p), java.lang.Long.valueOf(this.f71569q), java.lang.Integer.valueOf(this.f71558f), java.lang.Long.valueOf(this.f71559g), java.lang.Integer.valueOf(this.f71570r), java.lang.Long.valueOf(this.f71571s), java.lang.Integer.valueOf(this.f71560h), java.lang.Long.valueOf(this.f71561i), java.lang.Integer.valueOf(this.f71572t), java.lang.Long.valueOf(this.f71573u), java.lang.Integer.valueOf(this.f71562j), java.lang.Long.valueOf(this.f71563k), java.lang.Integer.valueOf(this.f71574v), java.lang.Long.valueOf(this.f71575w));
    }
}
