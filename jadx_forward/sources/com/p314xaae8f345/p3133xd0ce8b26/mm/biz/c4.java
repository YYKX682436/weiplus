package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes2.dex */
public class c4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f299471d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f299472e;

    /* renamed from: f, reason: collision with root package name */
    public int f299473f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f299474g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f299475h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f299476i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f299477m;

    /* renamed from: n, reason: collision with root package name */
    public int f299478n;

    /* renamed from: o, reason: collision with root package name */
    public int f299479o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.a4 f299480p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b4 f299481q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f299482r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean[] f299483s = new boolean[13];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.c4();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.c4 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.c4) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.c4)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.c4 c4Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.c4) fVar;
        return n51.f.a(this.f299471d, c4Var.f299471d) && n51.f.a(this.f299472e, c4Var.f299472e) && n51.f.a(java.lang.Integer.valueOf(this.f299473f), java.lang.Integer.valueOf(c4Var.f299473f)) && n51.f.a(this.f299474g, c4Var.f299474g) && n51.f.a(this.f299475h, c4Var.f299475h) && n51.f.a(this.f299476i, c4Var.f299476i) && n51.f.a(this.f299477m, c4Var.f299477m) && n51.f.a(java.lang.Integer.valueOf(this.f299478n), java.lang.Integer.valueOf(c4Var.f299478n)) && n51.f.a(java.lang.Integer.valueOf(this.f299479o), java.lang.Integer.valueOf(c4Var.f299479o)) && n51.f.a(this.f299480p, c4Var.f299480p) && n51.f.a(this.f299481q, c4Var.f299481q) && n51.f.a(this.f299482r, c4Var.f299482r);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.c4();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f299483s;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f299471d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f299472e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.e(3, this.f299473f);
            }
            java.lang.String str3 = this.f299474g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f299475h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f299476i;
            if (str5 != null && zArr[6]) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f299477m;
            if (str6 != null && zArr[7]) {
                fVar.j(7, str6);
            }
            if (zArr[8]) {
                fVar.e(8, this.f299478n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f299479o);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.a4 a4Var = this.f299480p;
            if (a4Var != null && zArr[10]) {
                fVar.i(10, a4Var.mo75928xcd1e8d8());
                this.f299480p.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b4 b4Var = this.f299481q;
            if (b4Var != null && zArr[11]) {
                fVar.i(11, b4Var.mo75928xcd1e8d8());
                this.f299481q.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str7 = this.f299482r;
            if (str7 == null || !zArr[12]) {
                return 0;
            }
            fVar.j(12, str7);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f299471d;
            int j17 = (str8 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str8);
            java.lang.String str9 = this.f299472e;
            if (str9 != null && zArr[2]) {
                j17 += b36.f.j(2, str9);
            }
            if (zArr[3]) {
                j17 += b36.f.e(3, this.f299473f);
            }
            java.lang.String str10 = this.f299474g;
            if (str10 != null && zArr[4]) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f299475h;
            if (str11 != null && zArr[5]) {
                j17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f299476i;
            if (str12 != null && zArr[6]) {
                j17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f299477m;
            if (str13 != null && zArr[7]) {
                j17 += b36.f.j(7, str13);
            }
            if (zArr[8]) {
                j17 += b36.f.e(8, this.f299478n);
            }
            if (zArr[9]) {
                j17 += b36.f.e(9, this.f299479o);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.a4 a4Var2 = this.f299480p;
            if (a4Var2 != null && zArr[10]) {
                j17 += b36.f.i(10, a4Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b4 b4Var2 = this.f299481q;
            if (b4Var2 != null && zArr[11]) {
                j17 += b36.f.i(11, b4Var2.mo75928xcd1e8d8());
            }
            java.lang.String str14 = this.f299482r;
            return (str14 == null || !zArr[12]) ? j17 : j17 + b36.f.j(12, str14);
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
                this.f299471d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f299472e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f299473f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f299474g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f299475h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f299476i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f299477m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f299478n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f299479o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.biz.a4 a4Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.a4();
                    if (bArr != null && bArr.length > 0) {
                        a4Var3.mo11468x92b714fd(bArr);
                    }
                    this.f299480p = a4Var3;
                }
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b4 b4Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b4();
                    if (bArr2 != null && bArr2.length > 0) {
                        b4Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f299481q = b4Var3;
                }
                zArr[11] = true;
                return 0;
            case 12:
                this.f299482r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            default:
                return -1;
        }
    }
}
