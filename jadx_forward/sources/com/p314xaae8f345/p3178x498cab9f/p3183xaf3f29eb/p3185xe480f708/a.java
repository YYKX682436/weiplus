package com.p314xaae8f345.p3178x498cab9f.p3183xaf3f29eb.p3185xe480f708;

/* loaded from: classes7.dex */
public class a extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f301602d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f301603e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f301604f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f301605g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f301606h;

    /* renamed from: i, reason: collision with root package name */
    public long f301607i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f301608m;

    /* renamed from: n, reason: collision with root package name */
    public int f301609n;

    /* renamed from: o, reason: collision with root package name */
    public int f301610o;

    /* renamed from: p, reason: collision with root package name */
    public float f301611p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f301612q;

    /* renamed from: r, reason: collision with root package name */
    public float f301613r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f301614s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f301615t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f301616u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean[] f301617v = new boolean[16];

    static {
        new com.p314xaae8f345.p3178x498cab9f.p3183xaf3f29eb.p3185xe480f708.a();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3178x498cab9f.p3183xaf3f29eb.p3185xe480f708.a)) {
            return false;
        }
        com.p314xaae8f345.p3178x498cab9f.p3183xaf3f29eb.p3185xe480f708.a aVar = (com.p314xaae8f345.p3178x498cab9f.p3183xaf3f29eb.p3185xe480f708.a) fVar;
        return n51.f.a(this.f301602d, aVar.f301602d) && n51.f.a(this.f301603e, aVar.f301603e) && n51.f.a(this.f301604f, aVar.f301604f) && n51.f.a(this.f301605g, aVar.f301605g) && n51.f.a(this.f301606h, aVar.f301606h) && n51.f.a(java.lang.Long.valueOf(this.f301607i), java.lang.Long.valueOf(aVar.f301607i)) && n51.f.a(this.f301608m, aVar.f301608m) && n51.f.a(java.lang.Integer.valueOf(this.f301609n), java.lang.Integer.valueOf(aVar.f301609n)) && n51.f.a(java.lang.Integer.valueOf(this.f301610o), java.lang.Integer.valueOf(aVar.f301610o)) && n51.f.a(java.lang.Float.valueOf(this.f301611p), java.lang.Float.valueOf(aVar.f301611p)) && n51.f.a(this.f301612q, aVar.f301612q) && n51.f.a(java.lang.Float.valueOf(this.f301613r), java.lang.Float.valueOf(aVar.f301613r)) && n51.f.a(this.f301614s, aVar.f301614s) && n51.f.a(java.lang.Boolean.valueOf(this.f301615t), java.lang.Boolean.valueOf(aVar.f301615t)) && n51.f.a(java.lang.Boolean.valueOf(this.f301616u), java.lang.Boolean.valueOf(aVar.f301616u));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3178x498cab9f.p3183xaf3f29eb.p3185xe480f708.a();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f301617v;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f301602d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f301603e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f301604f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f301605g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f301606h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            if (zArr[6]) {
                fVar.h(6, this.f301607i);
            }
            java.lang.String str6 = this.f301608m;
            if (str6 != null && zArr[7]) {
                fVar.j(7, str6);
            }
            if (zArr[8]) {
                fVar.e(8, this.f301609n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f301610o);
            }
            if (zArr[10]) {
                fVar.d(10, this.f301611p);
            }
            java.lang.String str7 = this.f301612q;
            if (str7 != null && zArr[11]) {
                fVar.j(11, str7);
            }
            if (zArr[12]) {
                fVar.d(12, this.f301613r);
            }
            java.lang.String str8 = this.f301614s;
            if (str8 != null && zArr[13]) {
                fVar.j(13, str8);
            }
            if (zArr[14]) {
                fVar.a(14, this.f301615t);
            }
            if (zArr[15]) {
                fVar.a(15, this.f301616u);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f301602d;
            if (str9 != null && zArr[1]) {
                i18 = b36.f.j(1, str9) + 0;
            }
            java.lang.String str10 = this.f301603e;
            if (str10 != null && zArr[2]) {
                i18 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f301604f;
            if (str11 != null && zArr[3]) {
                i18 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f301605g;
            if (str12 != null && zArr[4]) {
                i18 += b36.f.j(4, str12);
            }
            java.lang.String str13 = this.f301606h;
            if (str13 != null && zArr[5]) {
                i18 += b36.f.j(5, str13);
            }
            if (zArr[6]) {
                i18 += b36.f.h(6, this.f301607i);
            }
            java.lang.String str14 = this.f301608m;
            if (str14 != null && zArr[7]) {
                i18 += b36.f.j(7, str14);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f301609n);
            }
            if (zArr[9]) {
                i18 += b36.f.e(9, this.f301610o);
            }
            if (zArr[10]) {
                i18 += b36.f.d(10, this.f301611p);
            }
            java.lang.String str15 = this.f301612q;
            if (str15 != null && zArr[11]) {
                i18 += b36.f.j(11, str15);
            }
            if (zArr[12]) {
                i18 += b36.f.d(12, this.f301613r);
            }
            java.lang.String str16 = this.f301614s;
            if (str16 != null && zArr[13]) {
                i18 += b36.f.j(13, str16);
            }
            if (zArr[14]) {
                i18 += b36.f.a(14, this.f301615t);
            }
            return zArr[15] ? i18 + b36.f.a(15, this.f301616u) : i18;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                this.f301602d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f301603e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f301604f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f301605g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f301606h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f301607i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f301608m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f301609n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f301610o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f301611p = aVar2.f(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f301612q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f301613r = aVar2.f(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f301614s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f301615t = aVar2.c(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f301616u = aVar2.c(intValue);
                zArr[15] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3178x498cab9f.p3183xaf3f29eb.p3185xe480f708.a) super.mo11468x92b714fd(bArr);
    }
}
