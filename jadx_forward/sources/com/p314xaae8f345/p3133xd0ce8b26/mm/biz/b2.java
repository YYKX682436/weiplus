package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes11.dex */
public class b2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f299438e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f299439f;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g2 f299441h;

    /* renamed from: i, reason: collision with root package name */
    public int f299442i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b5 f299443m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.d2 f299444n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.w3 f299445o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.e2 f299446p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.p1 f299447q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f299448r;

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f299437d = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f299440g = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public final boolean[] f299449s = new boolean[13];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b2)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b2 b2Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b2) fVar;
        return n51.f.a(this.f299437d, b2Var.f299437d) && n51.f.a(this.f299438e, b2Var.f299438e) && n51.f.a(this.f299439f, b2Var.f299439f) && n51.f.a(this.f299440g, b2Var.f299440g) && n51.f.a(this.f299441h, b2Var.f299441h) && n51.f.a(java.lang.Integer.valueOf(this.f299442i), java.lang.Integer.valueOf(b2Var.f299442i)) && n51.f.a(this.f299443m, b2Var.f299443m) && n51.f.a(this.f299444n, b2Var.f299444n) && n51.f.a(this.f299445o, b2Var.f299445o) && n51.f.a(this.f299446p, b2Var.f299446p) && n51.f.a(this.f299447q, b2Var.f299447q) && n51.f.a(this.f299448r, b2Var.f299448r);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f299449s;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.f299437d);
            java.lang.String str = this.f299438e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f299439f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            fVar.g(4, 1, this.f299440g);
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g2 g2Var = this.f299441h;
            if (g2Var != null && zArr[5]) {
                fVar.i(5, g2Var.mo75928xcd1e8d8());
                this.f299441h.mo75956x3d5d1f78(fVar);
            }
            if (zArr[6]) {
                fVar.e(6, this.f299442i);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b5 b5Var = this.f299443m;
            if (b5Var != null && zArr[7]) {
                fVar.e(7, b5Var.f299460d);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.d2 d2Var = this.f299444n;
            if (d2Var != null && zArr[8]) {
                fVar.i(8, d2Var.mo75928xcd1e8d8());
                this.f299444n.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.w3 w3Var = this.f299445o;
            if (w3Var != null && zArr[9]) {
                fVar.i(9, w3Var.mo75928xcd1e8d8());
                this.f299445o.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.e2 e2Var = this.f299446p;
            if (e2Var != null && zArr[10]) {
                fVar.i(10, e2Var.mo75928xcd1e8d8());
                this.f299446p.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.p1 p1Var = this.f299447q;
            if (p1Var != null && zArr[11]) {
                fVar.i(11, p1Var.mo75928xcd1e8d8());
                this.f299447q.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str3 = this.f299448r;
            if (str3 == null || !zArr[12]) {
                return 0;
            }
            fVar.j(12, str3);
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, this.f299437d) + 0;
            java.lang.String str4 = this.f299438e;
            if (str4 != null && zArr[2]) {
                g17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f299439f;
            if (str5 != null && zArr[3]) {
                g17 += b36.f.j(3, str5);
            }
            int g18 = g17 + b36.f.g(4, 1, this.f299440g);
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g2 g2Var2 = this.f299441h;
            if (g2Var2 != null && zArr[5]) {
                g18 += b36.f.i(5, g2Var2.mo75928xcd1e8d8());
            }
            if (zArr[6]) {
                g18 += b36.f.e(6, this.f299442i);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b5 b5Var2 = this.f299443m;
            if (b5Var2 != null && zArr[7]) {
                g18 += b36.f.e(7, b5Var2.f299460d);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.d2 d2Var2 = this.f299444n;
            if (d2Var2 != null && zArr[8]) {
                g18 += b36.f.i(8, d2Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.w3 w3Var2 = this.f299445o;
            if (w3Var2 != null && zArr[9]) {
                g18 += b36.f.i(9, w3Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.e2 e2Var2 = this.f299446p;
            if (e2Var2 != null && zArr[10]) {
                g18 += b36.f.i(10, e2Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.p1 p1Var2 = this.f299447q;
            if (p1Var2 != null && zArr[11]) {
                g18 += b36.f.i(11, p1Var2.mo75928xcd1e8d8());
            }
            java.lang.String str6 = this.f299448r;
            return (str6 == null || !zArr[12]) ? g18 : g18 + b36.f.j(12, str6);
        }
        if (i17 == 2) {
            this.f299437d.clear();
            this.f299440g.clear();
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.biz.f2 f2Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.f2();
                    if (bArr != null && bArr.length > 0) {
                        f2Var.mo11468x92b714fd(bArr);
                    }
                    this.f299437d.add(f2Var);
                }
                zArr[1] = true;
                return 0;
            case 2:
                this.f299438e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f299439f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f299440g.add(aVar2.k(intValue));
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g2 g2Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g2();
                    if (bArr2 != null && bArr2.length > 0) {
                        g2Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f299441h = g2Var3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                this.f299442i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                int g19 = aVar2.g(intValue);
                this.f299443m = g19 != 0 ? g19 != 1 ? g19 != 2 ? null : com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b5.PUBLISH_BIZ_TYPE_PHOTO : com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b5.PUBLISH_BIZ_TYPE_SUBSCRIBE : com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b5.PUBLISH_BIZ_TYPE_DEFAULT;
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.biz.d2 d2Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.d2();
                    if (bArr3 != null && bArr3.length > 0) {
                        d2Var3.mo11468x92b714fd(bArr3);
                    }
                    this.f299444n = d2Var3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.biz.w3 w3Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.w3();
                    if (bArr4 != null && bArr4.length > 0) {
                        w3Var3.mo11468x92b714fd(bArr4);
                    }
                    this.f299445o = w3Var3;
                }
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.biz.e2 e2Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.e2();
                    if (bArr5 != null && bArr5.length > 0) {
                        e2Var3.mo11468x92b714fd(bArr5);
                    }
                    this.f299446p = e2Var3;
                }
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j29.get(i37);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.biz.p1 p1Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.p1();
                    if (bArr6 != null && bArr6.length > 0) {
                        p1Var3.mo11468x92b714fd(bArr6);
                    }
                    this.f299447q = p1Var3;
                }
                zArr[11] = true;
                return 0;
            case 12:
                this.f299448r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b2) super.mo11468x92b714fd(bArr);
    }
}
