package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes2.dex */
public class v4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f300241d;

    /* renamed from: e, reason: collision with root package name */
    public int f300242e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f300243f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f300244g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f300245h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f300246i;

    /* renamed from: m, reason: collision with root package name */
    public int f300247m;

    /* renamed from: n, reason: collision with root package name */
    public int f300248n;

    /* renamed from: o, reason: collision with root package name */
    public int f300249o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f300250p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f300251q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f300252r;

    /* renamed from: s, reason: collision with root package name */
    public int f300253s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean[] f300254t = new boolean[14];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.v4();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.v4 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.v4) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.v4)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.v4 v4Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.v4) fVar;
        return n51.f.a(this.f300241d, v4Var.f300241d) && n51.f.a(java.lang.Integer.valueOf(this.f300242e), java.lang.Integer.valueOf(v4Var.f300242e)) && n51.f.a(this.f300243f, v4Var.f300243f) && n51.f.a(this.f300244g, v4Var.f300244g) && n51.f.a(this.f300245h, v4Var.f300245h) && n51.f.a(this.f300246i, v4Var.f300246i) && n51.f.a(java.lang.Integer.valueOf(this.f300247m), java.lang.Integer.valueOf(v4Var.f300247m)) && n51.f.a(java.lang.Integer.valueOf(this.f300248n), java.lang.Integer.valueOf(v4Var.f300248n)) && n51.f.a(java.lang.Integer.valueOf(this.f300249o), java.lang.Integer.valueOf(v4Var.f300249o)) && n51.f.a(this.f300250p, v4Var.f300250p) && n51.f.a(this.f300251q, v4Var.f300251q) && n51.f.a(this.f300252r, v4Var.f300252r) && n51.f.a(java.lang.Integer.valueOf(this.f300253s), java.lang.Integer.valueOf(v4Var.f300253s));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.v4();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f300254t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f300241d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f300242e);
            }
            java.lang.String str2 = this.f300243f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f300244g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f300245h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f300246i;
            if (str5 != null && zArr[6]) {
                fVar.j(6, str5);
            }
            if (zArr[7]) {
                fVar.e(7, this.f300247m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f300248n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f300249o);
            }
            java.lang.String str6 = this.f300250p;
            if (str6 != null && zArr[10]) {
                fVar.j(10, str6);
            }
            java.lang.String str7 = this.f300251q;
            if (str7 != null && zArr[11]) {
                fVar.j(11, str7);
            }
            java.lang.String str8 = this.f300252r;
            if (str8 != null && zArr[12]) {
                fVar.j(12, str8);
            }
            if (!zArr[13]) {
                return 0;
            }
            fVar.e(13, this.f300253s);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f300241d;
            int j17 = (str9 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str9);
            if (zArr[2]) {
                j17 += b36.f.e(2, this.f300242e);
            }
            java.lang.String str10 = this.f300243f;
            if (str10 != null && zArr[3]) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f300244g;
            if (str11 != null && zArr[4]) {
                j17 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f300245h;
            if (str12 != null && zArr[5]) {
                j17 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f300246i;
            if (str13 != null && zArr[6]) {
                j17 += b36.f.j(6, str13);
            }
            if (zArr[7]) {
                j17 += b36.f.e(7, this.f300247m);
            }
            if (zArr[8]) {
                j17 += b36.f.e(8, this.f300248n);
            }
            if (zArr[9]) {
                j17 += b36.f.e(9, this.f300249o);
            }
            java.lang.String str14 = this.f300250p;
            if (str14 != null && zArr[10]) {
                j17 += b36.f.j(10, str14);
            }
            java.lang.String str15 = this.f300251q;
            if (str15 != null && zArr[11]) {
                j17 += b36.f.j(11, str15);
            }
            java.lang.String str16 = this.f300252r;
            if (str16 != null && zArr[12]) {
                j17 += b36.f.j(12, str16);
            }
            return zArr[13] ? j17 + b36.f.e(13, this.f300253s) : j17;
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
                this.f300241d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f300242e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f300243f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f300244g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f300245h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f300246i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f300247m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f300248n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f300249o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f300250p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f300251q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f300252r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f300253s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            default:
                return -1;
        }
    }
}
