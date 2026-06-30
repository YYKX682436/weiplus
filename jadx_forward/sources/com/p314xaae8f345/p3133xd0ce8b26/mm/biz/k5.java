package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes2.dex */
public class k5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h5 f299784d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.i5 f299785e;

    /* renamed from: f, reason: collision with root package name */
    public int f299786f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f299787g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.j5 f299788h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f299789i = new boolean[6];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.k5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.k5 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.k5) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.k5)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.k5 k5Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.k5) fVar;
        return n51.f.a(this.f299784d, k5Var.f299784d) && n51.f.a(this.f299785e, k5Var.f299785e) && n51.f.a(java.lang.Integer.valueOf(this.f299786f), java.lang.Integer.valueOf(k5Var.f299786f)) && n51.f.a(this.f299787g, k5Var.f299787g) && n51.f.a(this.f299788h, k5Var.f299788h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.k5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f299789i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h5 h5Var = this.f299784d;
            if (h5Var != null && zArr[1]) {
                fVar.i(1, h5Var.mo75928xcd1e8d8());
                this.f299784d.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.i5 i5Var = this.f299785e;
            if (i5Var != null && zArr[2]) {
                fVar.i(2, i5Var.mo75928xcd1e8d8());
                this.f299785e.mo75956x3d5d1f78(fVar);
            }
            if (zArr[3]) {
                fVar.e(3, this.f299786f);
            }
            java.lang.String str = this.f299787g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.j5 j5Var = this.f299788h;
            if (j5Var != null && zArr[5]) {
                fVar.i(5, j5Var.mo75928xcd1e8d8());
                this.f299788h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h5 h5Var2 = this.f299784d;
            if (h5Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, h5Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.i5 i5Var2 = this.f299785e;
            if (i5Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, i5Var2.mo75928xcd1e8d8());
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f299786f);
            }
            java.lang.String str2 = this.f299787g;
            if (str2 != null && zArr[4]) {
                i18 += b36.f.j(4, str2);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.j5 j5Var2 = this.f299788h;
            return (j5Var2 == null || !zArr[5]) ? i18 : i18 + b36.f.i(5, j5Var2.mo75928xcd1e8d8());
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
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h5 h5Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h5();
                if (bArr != null && bArr.length > 0) {
                    h5Var3.mo11468x92b714fd(bArr);
                }
                this.f299784d = h5Var3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                com.p314xaae8f345.p3133xd0ce8b26.mm.biz.i5 i5Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.i5();
                if (bArr2 != null && bArr2.length > 0) {
                    i5Var3.mo11468x92b714fd(bArr2);
                }
                this.f299785e = i5Var3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f299786f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f299787g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.j5 j5Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.j5();
            if (bArr3 != null && bArr3.length > 0) {
                j5Var3.mo11468x92b714fd(bArr3);
            }
            this.f299788h = j5Var3;
        }
        zArr[5] = true;
        return 0;
    }
}
