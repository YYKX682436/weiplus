package com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd;

/* loaded from: classes2.dex */
public class i1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.f1 f300500d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.g1 f300501e;

    /* renamed from: f, reason: collision with root package name */
    public int f300502f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f300503g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.h1 f300504h;

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.i1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.i1 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.i1) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.i1)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.i1 i1Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.i1) fVar;
        return n51.f.a(this.f300500d, i1Var.f300500d) && n51.f.a(this.f300501e, i1Var.f300501e) && n51.f.a(java.lang.Integer.valueOf(this.f300502f), java.lang.Integer.valueOf(i1Var.f300502f)) && n51.f.a(this.f300503g, i1Var.f300503g) && n51.f.a(this.f300504h, i1Var.f300504h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.i1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.f1 f1Var = this.f300500d;
            if (f1Var != null) {
                fVar.i(1, f1Var.mo75928xcd1e8d8());
                this.f300500d.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.g1 g1Var = this.f300501e;
            if (g1Var != null) {
                fVar.i(2, g1Var.mo75928xcd1e8d8());
                this.f300501e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f300502f);
            java.lang.String str = this.f300503g;
            if (str != null) {
                fVar.j(4, str);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.h1 h1Var = this.f300504h;
            if (h1Var != null) {
                fVar.i(5, h1Var.mo75928xcd1e8d8());
                this.f300504h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.f1 f1Var2 = this.f300500d;
            int i18 = f1Var2 != null ? 0 + b36.f.i(1, f1Var2.mo75928xcd1e8d8()) : 0;
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.g1 g1Var2 = this.f300501e;
            if (g1Var2 != null) {
                i18 += b36.f.i(2, g1Var2.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(3, this.f300502f);
            java.lang.String str2 = this.f300503g;
            if (str2 != null) {
                e17 += b36.f.j(4, str2);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.h1 h1Var2 = this.f300504h;
            return h1Var2 != null ? e17 + b36.f.i(5, h1Var2.mo75928xcd1e8d8()) : e17;
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
                com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.f1 f1Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.f1();
                if (bArr != null && bArr.length > 0) {
                    f1Var3.mo11468x92b714fd(bArr);
                }
                this.f300500d = f1Var3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.g1 g1Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.g1();
                if (bArr2 != null && bArr2.length > 0) {
                    g1Var3.mo11468x92b714fd(bArr2);
                }
                this.f300501e = g1Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            this.f300502f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            this.f300503g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.h1 h1Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.h1();
            if (bArr3 != null && bArr3.length > 0) {
                h1Var3.mo11468x92b714fd(bArr3);
            }
            this.f300504h = h1Var3;
        }
        return 0;
    }
}
