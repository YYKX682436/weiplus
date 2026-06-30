package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes2.dex */
public class i5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f299725d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f299726e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f299727f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f299728g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f299729h;

    /* renamed from: i, reason: collision with root package name */
    public int f299730i;

    /* renamed from: m, reason: collision with root package name */
    public int f299731m;

    /* renamed from: n, reason: collision with root package name */
    public int f299732n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f299733o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f299734p;

    /* renamed from: q, reason: collision with root package name */
    public int f299735q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f299736r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f299737s;

    /* renamed from: t, reason: collision with root package name */
    public long f299738t;

    /* renamed from: u, reason: collision with root package name */
    public int f299739u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean[] f299740v = new boolean[16];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.i5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.i5 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.i5) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.i5)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.i5 i5Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.i5) fVar;
        return n51.f.a(this.f299725d, i5Var.f299725d) && n51.f.a(this.f299726e, i5Var.f299726e) && n51.f.a(this.f299727f, i5Var.f299727f) && n51.f.a(this.f299728g, i5Var.f299728g) && n51.f.a(this.f299729h, i5Var.f299729h) && n51.f.a(java.lang.Integer.valueOf(this.f299730i), java.lang.Integer.valueOf(i5Var.f299730i)) && n51.f.a(java.lang.Integer.valueOf(this.f299731m), java.lang.Integer.valueOf(i5Var.f299731m)) && n51.f.a(java.lang.Integer.valueOf(this.f299732n), java.lang.Integer.valueOf(i5Var.f299732n)) && n51.f.a(this.f299733o, i5Var.f299733o) && n51.f.a(this.f299734p, i5Var.f299734p) && n51.f.a(java.lang.Integer.valueOf(this.f299735q), java.lang.Integer.valueOf(i5Var.f299735q)) && n51.f.a(this.f299736r, i5Var.f299736r) && n51.f.a(this.f299737s, i5Var.f299737s) && n51.f.a(java.lang.Long.valueOf(this.f299738t), java.lang.Long.valueOf(i5Var.f299738t)) && n51.f.a(java.lang.Integer.valueOf(this.f299739u), java.lang.Integer.valueOf(i5Var.f299739u));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.i5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f299740v;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f299725d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f299726e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f299727f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f299728g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f299729h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            if (zArr[6]) {
                fVar.e(6, this.f299730i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f299731m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f299732n);
            }
            java.lang.String str6 = this.f299733o;
            if (str6 != null && zArr[9]) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f299734p;
            if (str7 != null && zArr[10]) {
                fVar.j(10, str7);
            }
            if (zArr[11]) {
                fVar.e(11, this.f299735q);
            }
            java.lang.String str8 = this.f299736r;
            if (str8 != null && zArr[12]) {
                fVar.j(12, str8);
            }
            java.lang.String str9 = this.f299737s;
            if (str9 != null && zArr[13]) {
                fVar.j(13, str9);
            }
            if (zArr[14]) {
                fVar.h(14, this.f299738t);
            }
            if (zArr[15]) {
                fVar.e(15, this.f299739u);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str10 = this.f299725d;
            if (str10 != null && zArr[1]) {
                i18 = b36.f.j(1, str10) + 0;
            }
            java.lang.String str11 = this.f299726e;
            if (str11 != null && zArr[2]) {
                i18 += b36.f.j(2, str11);
            }
            java.lang.String str12 = this.f299727f;
            if (str12 != null && zArr[3]) {
                i18 += b36.f.j(3, str12);
            }
            java.lang.String str13 = this.f299728g;
            if (str13 != null && zArr[4]) {
                i18 += b36.f.j(4, str13);
            }
            java.lang.String str14 = this.f299729h;
            if (str14 != null && zArr[5]) {
                i18 += b36.f.j(5, str14);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f299730i);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f299731m);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f299732n);
            }
            java.lang.String str15 = this.f299733o;
            if (str15 != null && zArr[9]) {
                i18 += b36.f.j(9, str15);
            }
            java.lang.String str16 = this.f299734p;
            if (str16 != null && zArr[10]) {
                i18 += b36.f.j(10, str16);
            }
            if (zArr[11]) {
                i18 += b36.f.e(11, this.f299735q);
            }
            java.lang.String str17 = this.f299736r;
            if (str17 != null && zArr[12]) {
                i18 += b36.f.j(12, str17);
            }
            java.lang.String str18 = this.f299737s;
            if (str18 != null && zArr[13]) {
                i18 += b36.f.j(13, str18);
            }
            if (zArr[14]) {
                i18 += b36.f.h(14, this.f299738t);
            }
            return zArr[15] ? i18 + b36.f.e(15, this.f299739u) : i18;
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
                this.f299725d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f299726e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f299727f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f299728g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f299729h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f299730i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f299731m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f299732n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f299733o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f299734p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f299735q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f299736r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f299737s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f299738t = aVar2.i(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f299739u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            default:
                return -1;
        }
    }
}
