package com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627;

/* loaded from: classes15.dex */
public class x0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: v, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.x0 f298696v = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.x0();

    /* renamed from: d, reason: collision with root package name */
    public boolean f298697d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f298698e;

    /* renamed from: f, reason: collision with root package name */
    public int f298699f;

    /* renamed from: g, reason: collision with root package name */
    public int f298700g;

    /* renamed from: h, reason: collision with root package name */
    public int f298701h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f298702i;

    /* renamed from: m, reason: collision with root package name */
    public int f298703m;

    /* renamed from: n, reason: collision with root package name */
    public int f298704n;

    /* renamed from: o, reason: collision with root package name */
    public int f298705o;

    /* renamed from: p, reason: collision with root package name */
    public int f298706p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f298707q;

    /* renamed from: r, reason: collision with root package name */
    public int f298708r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f298709s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f298710t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean[] f298711u = new boolean[15];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.x0)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.x0 x0Var = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.x0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f298697d), java.lang.Boolean.valueOf(x0Var.f298697d)) && n51.f.a(java.lang.Boolean.valueOf(this.f298698e), java.lang.Boolean.valueOf(x0Var.f298698e)) && n51.f.a(java.lang.Integer.valueOf(this.f298699f), java.lang.Integer.valueOf(x0Var.f298699f)) && n51.f.a(java.lang.Integer.valueOf(this.f298700g), java.lang.Integer.valueOf(x0Var.f298700g)) && n51.f.a(java.lang.Integer.valueOf(this.f298701h), java.lang.Integer.valueOf(x0Var.f298701h)) && n51.f.a(this.f298702i, x0Var.f298702i) && n51.f.a(java.lang.Integer.valueOf(this.f298703m), java.lang.Integer.valueOf(x0Var.f298703m)) && n51.f.a(java.lang.Integer.valueOf(this.f298704n), java.lang.Integer.valueOf(x0Var.f298704n)) && n51.f.a(java.lang.Integer.valueOf(this.f298705o), java.lang.Integer.valueOf(x0Var.f298705o)) && n51.f.a(java.lang.Integer.valueOf(this.f298706p), java.lang.Integer.valueOf(x0Var.f298706p)) && n51.f.a(this.f298707q, x0Var.f298707q) && n51.f.a(java.lang.Integer.valueOf(this.f298708r), java.lang.Integer.valueOf(x0Var.f298708r)) && n51.f.a(java.lang.Boolean.valueOf(this.f298709s), java.lang.Boolean.valueOf(x0Var.f298709s)) && n51.f.a(java.lang.Boolean.valueOf(this.f298710t), java.lang.Boolean.valueOf(x0Var.f298710t));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.x0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f298711u;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f298697d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f298698e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f298699f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f298700g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f298701h);
            }
            java.lang.String str = this.f298702i;
            if (str != null && zArr[6]) {
                fVar.j(6, str);
            }
            if (zArr[7]) {
                fVar.e(7, this.f298703m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f298704n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f298705o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f298706p);
            }
            java.lang.String str2 = this.f298707q;
            if (str2 != null && zArr[11]) {
                fVar.j(11, str2);
            }
            if (zArr[12]) {
                fVar.e(12, this.f298708r);
            }
            if (zArr[13]) {
                fVar.a(13, this.f298709s);
            }
            if (!zArr[14]) {
                return 0;
            }
            fVar.a(14, this.f298710t);
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f298697d) : 0;
            if (zArr[2]) {
                a17 += b36.f.a(2, this.f298698e);
            }
            if (zArr[3]) {
                a17 += b36.f.e(3, this.f298699f);
            }
            if (zArr[4]) {
                a17 += b36.f.e(4, this.f298700g);
            }
            if (zArr[5]) {
                a17 += b36.f.e(5, this.f298701h);
            }
            java.lang.String str3 = this.f298702i;
            if (str3 != null && zArr[6]) {
                a17 += b36.f.j(6, str3);
            }
            if (zArr[7]) {
                a17 += b36.f.e(7, this.f298703m);
            }
            if (zArr[8]) {
                a17 += b36.f.e(8, this.f298704n);
            }
            if (zArr[9]) {
                a17 += b36.f.e(9, this.f298705o);
            }
            if (zArr[10]) {
                a17 += b36.f.e(10, this.f298706p);
            }
            java.lang.String str4 = this.f298707q;
            if (str4 != null && zArr[11]) {
                a17 += b36.f.j(11, str4);
            }
            if (zArr[12]) {
                a17 += b36.f.e(12, this.f298708r);
            }
            if (zArr[13]) {
                a17 += b36.f.a(13, this.f298709s);
            }
            return zArr[14] ? a17 + b36.f.a(14, this.f298710t) : a17;
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
                this.f298697d = aVar2.c(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f298698e = aVar2.c(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f298699f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f298700g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f298701h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f298702i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f298703m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f298704n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f298705o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f298706p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f298707q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f298708r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f298709s = aVar2.c(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f298710t = aVar2.c(intValue);
                zArr[14] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.x0) super.mo11468x92b714fd(bArr);
    }
}
