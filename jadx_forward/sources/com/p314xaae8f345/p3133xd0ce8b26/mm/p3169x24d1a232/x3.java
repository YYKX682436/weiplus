package com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232;

/* loaded from: classes2.dex */
public class x3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f301493d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f301494e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f301495f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f301496g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f301497h;

    /* renamed from: i, reason: collision with root package name */
    public int f301498i;

    /* renamed from: m, reason: collision with root package name */
    public int f301499m;

    /* renamed from: n, reason: collision with root package name */
    public int f301500n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f301501o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f301502p;

    /* renamed from: q, reason: collision with root package name */
    public int f301503q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f301504r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f301505s;

    /* renamed from: t, reason: collision with root package name */
    public long f301506t;

    /* renamed from: u, reason: collision with root package name */
    public int f301507u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean[] f301508v = new boolean[16];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.x3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.x3 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.x3) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.x3)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.x3 x3Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.x3) fVar;
        return n51.f.a(this.f301493d, x3Var.f301493d) && n51.f.a(this.f301494e, x3Var.f301494e) && n51.f.a(this.f301495f, x3Var.f301495f) && n51.f.a(this.f301496g, x3Var.f301496g) && n51.f.a(this.f301497h, x3Var.f301497h) && n51.f.a(java.lang.Integer.valueOf(this.f301498i), java.lang.Integer.valueOf(x3Var.f301498i)) && n51.f.a(java.lang.Integer.valueOf(this.f301499m), java.lang.Integer.valueOf(x3Var.f301499m)) && n51.f.a(java.lang.Integer.valueOf(this.f301500n), java.lang.Integer.valueOf(x3Var.f301500n)) && n51.f.a(this.f301501o, x3Var.f301501o) && n51.f.a(this.f301502p, x3Var.f301502p) && n51.f.a(java.lang.Integer.valueOf(this.f301503q), java.lang.Integer.valueOf(x3Var.f301503q)) && n51.f.a(this.f301504r, x3Var.f301504r) && n51.f.a(this.f301505s, x3Var.f301505s) && n51.f.a(java.lang.Long.valueOf(this.f301506t), java.lang.Long.valueOf(x3Var.f301506t)) && n51.f.a(java.lang.Integer.valueOf(this.f301507u), java.lang.Integer.valueOf(x3Var.f301507u));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.x3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f301508v;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f301493d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f301494e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f301495f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f301496g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f301497h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            if (zArr[6]) {
                fVar.e(6, this.f301498i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f301499m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f301500n);
            }
            java.lang.String str6 = this.f301501o;
            if (str6 != null && zArr[9]) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f301502p;
            if (str7 != null && zArr[10]) {
                fVar.j(10, str7);
            }
            if (zArr[11]) {
                fVar.e(11, this.f301503q);
            }
            java.lang.String str8 = this.f301504r;
            if (str8 != null && zArr[12]) {
                fVar.j(12, str8);
            }
            java.lang.String str9 = this.f301505s;
            if (str9 != null && zArr[13]) {
                fVar.j(13, str9);
            }
            if (zArr[14]) {
                fVar.h(14, this.f301506t);
            }
            if (zArr[15]) {
                fVar.e(15, this.f301507u);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str10 = this.f301493d;
            if (str10 != null && zArr[1]) {
                i18 = b36.f.j(1, str10) + 0;
            }
            java.lang.String str11 = this.f301494e;
            if (str11 != null && zArr[2]) {
                i18 += b36.f.j(2, str11);
            }
            java.lang.String str12 = this.f301495f;
            if (str12 != null && zArr[3]) {
                i18 += b36.f.j(3, str12);
            }
            java.lang.String str13 = this.f301496g;
            if (str13 != null && zArr[4]) {
                i18 += b36.f.j(4, str13);
            }
            java.lang.String str14 = this.f301497h;
            if (str14 != null && zArr[5]) {
                i18 += b36.f.j(5, str14);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f301498i);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f301499m);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f301500n);
            }
            java.lang.String str15 = this.f301501o;
            if (str15 != null && zArr[9]) {
                i18 += b36.f.j(9, str15);
            }
            java.lang.String str16 = this.f301502p;
            if (str16 != null && zArr[10]) {
                i18 += b36.f.j(10, str16);
            }
            if (zArr[11]) {
                i18 += b36.f.e(11, this.f301503q);
            }
            java.lang.String str17 = this.f301504r;
            if (str17 != null && zArr[12]) {
                i18 += b36.f.j(12, str17);
            }
            java.lang.String str18 = this.f301505s;
            if (str18 != null && zArr[13]) {
                i18 += b36.f.j(13, str18);
            }
            if (zArr[14]) {
                i18 += b36.f.h(14, this.f301506t);
            }
            return zArr[15] ? i18 + b36.f.e(15, this.f301507u) : i18;
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
                this.f301493d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f301494e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f301495f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f301496g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f301497h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f301498i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f301499m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f301500n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f301501o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f301502p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f301503q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f301504r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f301505s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f301506t = aVar2.i(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f301507u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            default:
                return -1;
        }
    }
}
