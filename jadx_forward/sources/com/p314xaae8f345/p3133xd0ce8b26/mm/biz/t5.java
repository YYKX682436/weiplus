package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes4.dex */
public class t5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f300181d;

    /* renamed from: e, reason: collision with root package name */
    public long f300182e;

    /* renamed from: f, reason: collision with root package name */
    public int f300183f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f300184g;

    /* renamed from: h, reason: collision with root package name */
    public int f300185h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f300186i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f300187m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f300188n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f300189o;

    /* renamed from: p, reason: collision with root package name */
    public long f300190p;

    /* renamed from: q, reason: collision with root package name */
    public int f300191q;

    /* renamed from: r, reason: collision with root package name */
    public int f300192r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.i4 f300193s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.u4 f300194t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.j3 f300195u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.j4 f300196v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean[] f300197w = new boolean[92];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.t5();
    }

    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.u4 b() {
        return this.f300197w[61] ? this.f300194t : new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.u4();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.t5 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.t5) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.t5)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.t5 t5Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.t5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f300181d), java.lang.Integer.valueOf(t5Var.f300181d)) && n51.f.a(java.lang.Long.valueOf(this.f300182e), java.lang.Long.valueOf(t5Var.f300182e)) && n51.f.a(java.lang.Integer.valueOf(this.f300183f), java.lang.Integer.valueOf(t5Var.f300183f)) && n51.f.a(this.f300184g, t5Var.f300184g) && n51.f.a(java.lang.Integer.valueOf(this.f300185h), java.lang.Integer.valueOf(t5Var.f300185h)) && n51.f.a(this.f300186i, t5Var.f300186i) && n51.f.a(this.f300187m, t5Var.f300187m) && n51.f.a(java.lang.Boolean.valueOf(this.f300188n), java.lang.Boolean.valueOf(t5Var.f300188n)) && n51.f.a(this.f300189o, t5Var.f300189o) && n51.f.a(java.lang.Long.valueOf(this.f300190p), java.lang.Long.valueOf(t5Var.f300190p)) && n51.f.a(java.lang.Integer.valueOf(this.f300191q), java.lang.Integer.valueOf(t5Var.f300191q)) && n51.f.a(java.lang.Integer.valueOf(this.f300192r), java.lang.Integer.valueOf(t5Var.f300192r)) && n51.f.a(this.f300193s, t5Var.f300193s) && n51.f.a(this.f300194t, t5Var.f300194t) && n51.f.a(this.f300195u, t5Var.f300195u) && n51.f.a(this.f300196v, t5Var.f300196v);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.t5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f300197w;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f300181d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f300182e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f300183f);
            }
            java.lang.String str = this.f300184g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            if (zArr[5]) {
                fVar.e(5, this.f300185h);
            }
            java.lang.String str2 = this.f300186i;
            if (str2 != null && zArr[6]) {
                fVar.j(6, str2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f300187m;
            if (gVar != null && zArr[7]) {
                fVar.b(7, gVar);
            }
            if (zArr[8]) {
                fVar.a(8, this.f300188n);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f300189o;
            if (gVar2 != null && zArr[9]) {
                fVar.b(9, gVar2);
            }
            if (zArr[10]) {
                fVar.h(10, this.f300190p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f300191q);
            }
            if (zArr[31]) {
                fVar.e(31, this.f300192r);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.i4 i4Var = this.f300193s;
            if (i4Var != null && zArr[32]) {
                fVar.i(32, i4Var.mo75928xcd1e8d8());
                this.f300193s.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.u4 u4Var = this.f300194t;
            if (u4Var != null && zArr[61]) {
                fVar.i(61, u4Var.mo75928xcd1e8d8());
                this.f300194t.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.j3 j3Var = this.f300195u;
            if (j3Var != null && zArr[62]) {
                fVar.i(62, j3Var.mo75928xcd1e8d8());
                this.f300195u.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.j4 j4Var = this.f300196v;
            if (j4Var != null && zArr[91]) {
                fVar.i(91, j4Var.mo75928xcd1e8d8());
                this.f300196v.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? b36.f.e(1, this.f300181d) + 0 : 0;
            if (zArr[2]) {
                e17 += b36.f.h(2, this.f300182e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f300183f);
            }
            java.lang.String str3 = this.f300184g;
            if (str3 != null && zArr[4]) {
                e17 += b36.f.j(4, str3);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f300185h);
            }
            java.lang.String str4 = this.f300186i;
            if (str4 != null && zArr[6]) {
                e17 += b36.f.j(6, str4);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f300187m;
            if (gVar3 != null && zArr[7]) {
                e17 += b36.f.b(7, gVar3);
            }
            if (zArr[8]) {
                e17 += b36.f.a(8, this.f300188n);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f300189o;
            if (gVar4 != null && zArr[9]) {
                e17 += b36.f.b(9, gVar4);
            }
            if (zArr[10]) {
                e17 += b36.f.h(10, this.f300190p);
            }
            if (zArr[11]) {
                e17 += b36.f.e(11, this.f300191q);
            }
            if (zArr[31]) {
                e17 += b36.f.e(31, this.f300192r);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.i4 i4Var2 = this.f300193s;
            if (i4Var2 != null && zArr[32]) {
                e17 += b36.f.i(32, i4Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.u4 u4Var2 = this.f300194t;
            if (u4Var2 != null && zArr[61]) {
                e17 += b36.f.i(61, u4Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.j3 j3Var2 = this.f300195u;
            if (j3Var2 != null && zArr[62]) {
                e17 += b36.f.i(62, j3Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.j4 j4Var2 = this.f300196v;
            return (j4Var2 == null || !zArr[91]) ? e17 : e17 + b36.f.i(91, j4Var2.mo75928xcd1e8d8());
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
        if (intValue == 31) {
            this.f300192r = aVar2.g(intValue);
            zArr[31] = true;
            return 0;
        }
        if (intValue == 32) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                com.p314xaae8f345.p3133xd0ce8b26.mm.biz.i4 i4Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.i4();
                if (bArr != null && bArr.length > 0) {
                    i4Var3.mo11468x92b714fd(bArr);
                }
                this.f300193s = i4Var3;
            }
            zArr[32] = true;
            return 0;
        }
        if (intValue == 61) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                com.p314xaae8f345.p3133xd0ce8b26.mm.biz.u4 u4Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.u4();
                if (bArr2 != null && bArr2.length > 0) {
                    u4Var3.mo11468x92b714fd(bArr2);
                }
                this.f300194t = u4Var3;
            }
            zArr[61] = true;
            return 0;
        }
        if (intValue == 62) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i27 = 0; i27 < size3; i27++) {
                byte[] bArr3 = (byte[]) j19.get(i27);
                com.p314xaae8f345.p3133xd0ce8b26.mm.biz.j3 j3Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.j3();
                if (bArr3 != null && bArr3.length > 0) {
                    j3Var3.mo11468x92b714fd(bArr3);
                }
                this.f300195u = j3Var3;
            }
            zArr[62] = true;
            return 0;
        }
        if (intValue == 91) {
            java.util.LinkedList j27 = aVar2.j(intValue);
            int size4 = j27.size();
            for (int i28 = 0; i28 < size4; i28++) {
                byte[] bArr4 = (byte[]) j27.get(i28);
                com.p314xaae8f345.p3133xd0ce8b26.mm.biz.j4 j4Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.j4();
                if (bArr4 != null && bArr4.length > 0) {
                    j4Var3.mo11468x92b714fd(bArr4);
                }
                this.f300196v = j4Var3;
            }
            zArr[91] = true;
            return 0;
        }
        switch (intValue) {
            case 1:
                this.f300181d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f300182e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f300183f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f300184g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f300185h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f300186i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f300187m = aVar2.d(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f300188n = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f300189o = aVar2.d(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f300190p = aVar2.i(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f300191q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }
}
