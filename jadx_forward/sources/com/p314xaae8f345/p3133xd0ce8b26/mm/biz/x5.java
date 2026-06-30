package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes2.dex */
public class x5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f300315d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f300316e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f300317f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.w5 f300318g;

    /* renamed from: h, reason: collision with root package name */
    public int f300319h;

    /* renamed from: i, reason: collision with root package name */
    public int f300320i;

    /* renamed from: m, reason: collision with root package name */
    public int f300321m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.u5 f300322n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.v5 f300323o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f300324p = new boolean[10];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.x5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.x5 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.x5) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.x5)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.x5 x5Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.x5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f300315d), java.lang.Integer.valueOf(x5Var.f300315d)) && n51.f.a(this.f300316e, x5Var.f300316e) && n51.f.a(this.f300317f, x5Var.f300317f) && n51.f.a(this.f300318g, x5Var.f300318g) && n51.f.a(java.lang.Integer.valueOf(this.f300319h), java.lang.Integer.valueOf(x5Var.f300319h)) && n51.f.a(java.lang.Integer.valueOf(this.f300320i), java.lang.Integer.valueOf(x5Var.f300320i)) && n51.f.a(java.lang.Integer.valueOf(this.f300321m), java.lang.Integer.valueOf(x5Var.f300321m)) && n51.f.a(this.f300322n, x5Var.f300322n) && n51.f.a(this.f300323o, x5Var.f300323o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.x5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f300324p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f300315d);
            }
            java.lang.String str = this.f300316e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f300317f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.w5 w5Var = this.f300318g;
            if (w5Var != null && zArr[4]) {
                fVar.i(4, w5Var.mo75928xcd1e8d8());
                this.f300318g.mo75956x3d5d1f78(fVar);
            }
            if (zArr[5]) {
                fVar.e(5, this.f300319h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f300320i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f300321m);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.u5 u5Var = this.f300322n;
            if (u5Var != null && zArr[8]) {
                fVar.i(8, u5Var.mo75928xcd1e8d8());
                this.f300322n.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.v5 v5Var = this.f300323o;
            if (v5Var != null && zArr[9]) {
                fVar.i(9, v5Var.mo75928xcd1e8d8());
                this.f300323o.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f300315d) : 0;
            java.lang.String str3 = this.f300316e;
            if (str3 != null && zArr[2]) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f300317f;
            if (str4 != null && zArr[3]) {
                e17 += b36.f.j(3, str4);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.w5 w5Var2 = this.f300318g;
            if (w5Var2 != null && zArr[4]) {
                e17 += b36.f.i(4, w5Var2.mo75928xcd1e8d8());
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f300319h);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f300320i);
            }
            if (zArr[7]) {
                e17 += b36.f.e(7, this.f300321m);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.u5 u5Var2 = this.f300322n;
            if (u5Var2 != null && zArr[8]) {
                e17 += b36.f.i(8, u5Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.v5 v5Var2 = this.f300323o;
            return (v5Var2 == null || !zArr[9]) ? e17 : e17 + b36.f.i(9, v5Var2.mo75928xcd1e8d8());
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
                this.f300315d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f300316e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f300317f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.biz.w5 w5Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.w5();
                    if (bArr != null && bArr.length > 0) {
                        w5Var3.mo11468x92b714fd(bArr);
                    }
                    this.f300318g = w5Var3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f300319h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f300320i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f300321m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.biz.u5 u5Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.u5();
                    if (bArr2 != null && bArr2.length > 0) {
                        u5Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f300322n = u5Var3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.biz.v5 v5Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.v5();
                    if (bArr3 != null && bArr3.length > 0) {
                        v5Var3.mo11468x92b714fd(bArr3);
                    }
                    this.f300323o = v5Var3;
                }
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}
