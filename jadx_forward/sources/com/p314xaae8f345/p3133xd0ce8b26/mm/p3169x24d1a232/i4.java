package com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232;

/* loaded from: classes2.dex */
public class i4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f301044d;

    /* renamed from: e, reason: collision with root package name */
    public long f301045e;

    /* renamed from: f, reason: collision with root package name */
    public int f301046f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f301047g;

    /* renamed from: h, reason: collision with root package name */
    public int f301048h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f301049i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f301050m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f301051n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f301052o;

    /* renamed from: p, reason: collision with root package name */
    public long f301053p;

    /* renamed from: q, reason: collision with root package name */
    public int f301054q;

    /* renamed from: r, reason: collision with root package name */
    public int f301055r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.b3 f301056s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.m3 f301057t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.l2 f301058u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.c3 f301059v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean[] f301060w = new boolean[92];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.i4();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.i4 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.i4) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.i4)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.i4 i4Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.i4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f301044d), java.lang.Integer.valueOf(i4Var.f301044d)) && n51.f.a(java.lang.Long.valueOf(this.f301045e), java.lang.Long.valueOf(i4Var.f301045e)) && n51.f.a(java.lang.Integer.valueOf(this.f301046f), java.lang.Integer.valueOf(i4Var.f301046f)) && n51.f.a(this.f301047g, i4Var.f301047g) && n51.f.a(java.lang.Integer.valueOf(this.f301048h), java.lang.Integer.valueOf(i4Var.f301048h)) && n51.f.a(this.f301049i, i4Var.f301049i) && n51.f.a(this.f301050m, i4Var.f301050m) && n51.f.a(java.lang.Boolean.valueOf(this.f301051n), java.lang.Boolean.valueOf(i4Var.f301051n)) && n51.f.a(this.f301052o, i4Var.f301052o) && n51.f.a(java.lang.Long.valueOf(this.f301053p), java.lang.Long.valueOf(i4Var.f301053p)) && n51.f.a(java.lang.Integer.valueOf(this.f301054q), java.lang.Integer.valueOf(i4Var.f301054q)) && n51.f.a(java.lang.Integer.valueOf(this.f301055r), java.lang.Integer.valueOf(i4Var.f301055r)) && n51.f.a(this.f301056s, i4Var.f301056s) && n51.f.a(this.f301057t, i4Var.f301057t) && n51.f.a(this.f301058u, i4Var.f301058u) && n51.f.a(this.f301059v, i4Var.f301059v);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.i4();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f301060w;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f301044d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f301045e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f301046f);
            }
            java.lang.String str = this.f301047g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            if (zArr[5]) {
                fVar.e(5, this.f301048h);
            }
            java.lang.String str2 = this.f301049i;
            if (str2 != null && zArr[6]) {
                fVar.j(6, str2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f301050m;
            if (gVar != null && zArr[7]) {
                fVar.b(7, gVar);
            }
            if (zArr[8]) {
                fVar.a(8, this.f301051n);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f301052o;
            if (gVar2 != null && zArr[9]) {
                fVar.b(9, gVar2);
            }
            if (zArr[10]) {
                fVar.h(10, this.f301053p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f301054q);
            }
            if (zArr[31]) {
                fVar.e(31, this.f301055r);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.b3 b3Var = this.f301056s;
            if (b3Var != null && zArr[32]) {
                fVar.i(32, b3Var.mo75928xcd1e8d8());
                this.f301056s.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.m3 m3Var = this.f301057t;
            if (m3Var != null && zArr[61]) {
                fVar.i(61, m3Var.mo75928xcd1e8d8());
                this.f301057t.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.l2 l2Var = this.f301058u;
            if (l2Var != null && zArr[62]) {
                fVar.i(62, l2Var.mo75928xcd1e8d8());
                this.f301058u.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.c3 c3Var = this.f301059v;
            if (c3Var != null && zArr[91]) {
                fVar.i(91, c3Var.mo75928xcd1e8d8());
                this.f301059v.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? b36.f.e(1, this.f301044d) + 0 : 0;
            if (zArr[2]) {
                e17 += b36.f.h(2, this.f301045e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f301046f);
            }
            java.lang.String str3 = this.f301047g;
            if (str3 != null && zArr[4]) {
                e17 += b36.f.j(4, str3);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f301048h);
            }
            java.lang.String str4 = this.f301049i;
            if (str4 != null && zArr[6]) {
                e17 += b36.f.j(6, str4);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f301050m;
            if (gVar3 != null && zArr[7]) {
                e17 += b36.f.b(7, gVar3);
            }
            if (zArr[8]) {
                e17 += b36.f.a(8, this.f301051n);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f301052o;
            if (gVar4 != null && zArr[9]) {
                e17 += b36.f.b(9, gVar4);
            }
            if (zArr[10]) {
                e17 += b36.f.h(10, this.f301053p);
            }
            if (zArr[11]) {
                e17 += b36.f.e(11, this.f301054q);
            }
            if (zArr[31]) {
                e17 += b36.f.e(31, this.f301055r);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.b3 b3Var2 = this.f301056s;
            if (b3Var2 != null && zArr[32]) {
                e17 += b36.f.i(32, b3Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.m3 m3Var2 = this.f301057t;
            if (m3Var2 != null && zArr[61]) {
                e17 += b36.f.i(61, m3Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.l2 l2Var2 = this.f301058u;
            if (l2Var2 != null && zArr[62]) {
                e17 += b36.f.i(62, l2Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.c3 c3Var2 = this.f301059v;
            return (c3Var2 == null || !zArr[91]) ? e17 : e17 + b36.f.i(91, c3Var2.mo75928xcd1e8d8());
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
            this.f301055r = aVar2.g(intValue);
            zArr[31] = true;
            return 0;
        }
        if (intValue == 32) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.b3 b3Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.b3();
                if (bArr != null && bArr.length > 0) {
                    b3Var3.mo11468x92b714fd(bArr);
                }
                this.f301056s = b3Var3;
            }
            zArr[32] = true;
            return 0;
        }
        if (intValue == 61) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.m3 m3Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.m3();
                if (bArr2 != null && bArr2.length > 0) {
                    m3Var3.mo11468x92b714fd(bArr2);
                }
                this.f301057t = m3Var3;
            }
            zArr[61] = true;
            return 0;
        }
        if (intValue == 62) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i27 = 0; i27 < size3; i27++) {
                byte[] bArr3 = (byte[]) j19.get(i27);
                com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.l2 l2Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.l2();
                if (bArr3 != null && bArr3.length > 0) {
                    l2Var3.mo11468x92b714fd(bArr3);
                }
                this.f301058u = l2Var3;
            }
            zArr[62] = true;
            return 0;
        }
        if (intValue == 91) {
            java.util.LinkedList j27 = aVar2.j(intValue);
            int size4 = j27.size();
            for (int i28 = 0; i28 < size4; i28++) {
                byte[] bArr4 = (byte[]) j27.get(i28);
                com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.c3 c3Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.c3();
                if (bArr4 != null && bArr4.length > 0) {
                    c3Var3.mo11468x92b714fd(bArr4);
                }
                this.f301059v = c3Var3;
            }
            zArr[91] = true;
            return 0;
        }
        switch (intValue) {
            case 1:
                this.f301044d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f301045e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f301046f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f301047g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f301048h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f301049i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f301050m = aVar2.d(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f301051n = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f301052o = aVar2.d(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f301053p = aVar2.i(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f301054q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }
}
