package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes11.dex */
public class f2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f299558d;

    /* renamed from: e, reason: collision with root package name */
    public int f299559e;

    /* renamed from: f, reason: collision with root package name */
    public int f299560f;

    /* renamed from: g, reason: collision with root package name */
    public int f299561g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f299562h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f299563i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f299564m;

    /* renamed from: n, reason: collision with root package name */
    public float f299565n;

    /* renamed from: o, reason: collision with root package name */
    public float f299566o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f299567p;

    /* renamed from: q, reason: collision with root package name */
    public int f299568q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f299569r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f299570s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f299571t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f299572u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean[] f299573v = new boolean[16];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.f2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.f2 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.f2) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.f2)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.f2 f2Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.f2) fVar;
        return n51.f.a(this.f299558d, f2Var.f299558d) && n51.f.a(java.lang.Integer.valueOf(this.f299559e), java.lang.Integer.valueOf(f2Var.f299559e)) && n51.f.a(java.lang.Integer.valueOf(this.f299560f), java.lang.Integer.valueOf(f2Var.f299560f)) && n51.f.a(java.lang.Integer.valueOf(this.f299561g), java.lang.Integer.valueOf(f2Var.f299561g)) && n51.f.a(this.f299562h, f2Var.f299562h) && n51.f.a(java.lang.Boolean.valueOf(this.f299563i), java.lang.Boolean.valueOf(f2Var.f299563i)) && n51.f.a(this.f299564m, f2Var.f299564m) && n51.f.a(java.lang.Float.valueOf(this.f299565n), java.lang.Float.valueOf(f2Var.f299565n)) && n51.f.a(java.lang.Float.valueOf(this.f299566o), java.lang.Float.valueOf(f2Var.f299566o)) && n51.f.a(java.lang.Boolean.valueOf(this.f299567p), java.lang.Boolean.valueOf(f2Var.f299567p)) && n51.f.a(java.lang.Integer.valueOf(this.f299568q), java.lang.Integer.valueOf(f2Var.f299568q)) && n51.f.a(this.f299569r, f2Var.f299569r) && n51.f.a(this.f299570s, f2Var.f299570s) && n51.f.a(this.f299571t, f2Var.f299571t) && n51.f.a(this.f299572u, f2Var.f299572u);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.f2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f299573v;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f299558d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f299559e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f299560f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f299561g);
            }
            java.lang.String str2 = this.f299562h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            if (zArr[6]) {
                fVar.a(6, this.f299563i);
            }
            java.lang.String str3 = this.f299564m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            if (zArr[8]) {
                fVar.d(8, this.f299565n);
            }
            if (zArr[9]) {
                fVar.d(9, this.f299566o);
            }
            if (zArr[10]) {
                fVar.a(10, this.f299567p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f299568q);
            }
            java.lang.String str4 = this.f299569r;
            if (str4 != null && zArr[12]) {
                fVar.j(12, str4);
            }
            java.lang.String str5 = this.f299570s;
            if (str5 != null && zArr[13]) {
                fVar.j(13, str5);
            }
            java.lang.String str6 = this.f299571t;
            if (str6 != null && zArr[14]) {
                fVar.j(14, str6);
            }
            java.lang.String str7 = this.f299572u;
            if (str7 != null && zArr[15]) {
                fVar.j(15, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f299558d;
            if (str8 != null && zArr[1]) {
                i18 = b36.f.j(1, str8) + 0;
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f299559e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f299560f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f299561g);
            }
            java.lang.String str9 = this.f299562h;
            if (str9 != null && zArr[5]) {
                i18 += b36.f.j(5, str9);
            }
            if (zArr[6]) {
                i18 += b36.f.a(6, this.f299563i);
            }
            java.lang.String str10 = this.f299564m;
            if (str10 != null && zArr[7]) {
                i18 += b36.f.j(7, str10);
            }
            if (zArr[8]) {
                i18 += b36.f.d(8, this.f299565n);
            }
            if (zArr[9]) {
                i18 += b36.f.d(9, this.f299566o);
            }
            if (zArr[10]) {
                i18 += b36.f.a(10, this.f299567p);
            }
            if (zArr[11]) {
                i18 += b36.f.e(11, this.f299568q);
            }
            java.lang.String str11 = this.f299569r;
            if (str11 != null && zArr[12]) {
                i18 += b36.f.j(12, str11);
            }
            java.lang.String str12 = this.f299570s;
            if (str12 != null && zArr[13]) {
                i18 += b36.f.j(13, str12);
            }
            java.lang.String str13 = this.f299571t;
            if (str13 != null && zArr[14]) {
                i18 += b36.f.j(14, str13);
            }
            java.lang.String str14 = this.f299572u;
            return (str14 == null || !zArr[15]) ? i18 : i18 + b36.f.j(15, str14);
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
                this.f299558d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f299559e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f299560f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f299561g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f299562h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f299563i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f299564m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f299565n = aVar2.f(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f299566o = aVar2.f(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f299567p = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f299568q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f299569r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f299570s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f299571t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f299572u = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            default:
                return -1;
        }
    }
}
