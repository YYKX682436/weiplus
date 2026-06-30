package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes2.dex */
public class f3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f299574d;

    /* renamed from: e, reason: collision with root package name */
    public int f299575e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f299576f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f299577g;

    /* renamed from: h, reason: collision with root package name */
    public int f299578h;

    /* renamed from: i, reason: collision with root package name */
    public long f299579i;

    /* renamed from: m, reason: collision with root package name */
    public int f299580m;

    /* renamed from: n, reason: collision with root package name */
    public int f299581n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f299582o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f299583p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f299584q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f299585r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f299586s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean[] f299587t = new boolean[14];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.f3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.f3 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.f3) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.f3)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.f3 f3Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.f3) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f299574d), java.lang.Long.valueOf(f3Var.f299574d)) && n51.f.a(java.lang.Integer.valueOf(this.f299575e), java.lang.Integer.valueOf(f3Var.f299575e)) && n51.f.a(this.f299576f, f3Var.f299576f) && n51.f.a(this.f299577g, f3Var.f299577g) && n51.f.a(java.lang.Integer.valueOf(this.f299578h), java.lang.Integer.valueOf(f3Var.f299578h)) && n51.f.a(java.lang.Long.valueOf(this.f299579i), java.lang.Long.valueOf(f3Var.f299579i)) && n51.f.a(java.lang.Integer.valueOf(this.f299580m), java.lang.Integer.valueOf(f3Var.f299580m)) && n51.f.a(java.lang.Integer.valueOf(this.f299581n), java.lang.Integer.valueOf(f3Var.f299581n)) && n51.f.a(this.f299582o, f3Var.f299582o) && n51.f.a(this.f299583p, f3Var.f299583p) && n51.f.a(this.f299584q, f3Var.f299584q) && n51.f.a(this.f299585r, f3Var.f299585r) && n51.f.a(this.f299586s, f3Var.f299586s);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.f3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f299587t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f299574d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f299575e);
            }
            java.lang.String str = this.f299576f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f299577g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[5]) {
                fVar.e(5, this.f299578h);
            }
            if (zArr[6]) {
                fVar.h(6, this.f299579i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f299580m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f299581n);
            }
            java.lang.String str3 = this.f299582o;
            if (str3 != null && zArr[9]) {
                fVar.j(9, str3);
            }
            java.lang.String str4 = this.f299583p;
            if (str4 != null && zArr[10]) {
                fVar.j(10, str4);
            }
            java.lang.String str5 = this.f299584q;
            if (str5 != null && zArr[11]) {
                fVar.j(11, str5);
            }
            java.lang.String str6 = this.f299585r;
            if (str6 != null && zArr[12]) {
                fVar.j(12, str6);
            }
            java.lang.String str7 = this.f299586s;
            if (str7 != null && zArr[13]) {
                fVar.j(13, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f299574d) : 0;
            if (zArr[2]) {
                h17 += b36.f.e(2, this.f299575e);
            }
            java.lang.String str8 = this.f299576f;
            if (str8 != null && zArr[3]) {
                h17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f299577g;
            if (str9 != null && zArr[4]) {
                h17 += b36.f.j(4, str9);
            }
            if (zArr[5]) {
                h17 += b36.f.e(5, this.f299578h);
            }
            if (zArr[6]) {
                h17 += b36.f.h(6, this.f299579i);
            }
            if (zArr[7]) {
                h17 += b36.f.e(7, this.f299580m);
            }
            if (zArr[8]) {
                h17 += b36.f.e(8, this.f299581n);
            }
            java.lang.String str10 = this.f299582o;
            if (str10 != null && zArr[9]) {
                h17 += b36.f.j(9, str10);
            }
            java.lang.String str11 = this.f299583p;
            if (str11 != null && zArr[10]) {
                h17 += b36.f.j(10, str11);
            }
            java.lang.String str12 = this.f299584q;
            if (str12 != null && zArr[11]) {
                h17 += b36.f.j(11, str12);
            }
            java.lang.String str13 = this.f299585r;
            if (str13 != null && zArr[12]) {
                h17 += b36.f.j(12, str13);
            }
            java.lang.String str14 = this.f299586s;
            return (str14 == null || !zArr[13]) ? h17 : h17 + b36.f.j(13, str14);
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
                this.f299574d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f299575e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f299576f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f299577g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f299578h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f299579i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f299580m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f299581n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f299582o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f299583p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f299584q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f299585r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f299586s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            default:
                return -1;
        }
    }
}
