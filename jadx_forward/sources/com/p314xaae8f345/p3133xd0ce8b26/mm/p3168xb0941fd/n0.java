package com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd;

/* loaded from: classes4.dex */
public class n0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f300613d;

    /* renamed from: e, reason: collision with root package name */
    public int f300614e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.m0 f300615f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f300616g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f300617h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f300618i;

    /* renamed from: m, reason: collision with root package name */
    public int f300619m;

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.n0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.n0 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.n0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.n0)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.n0 n0Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.n0) fVar;
        return n51.f.a(this.f300613d, n0Var.f300613d) && n51.f.a(java.lang.Integer.valueOf(this.f300614e), java.lang.Integer.valueOf(n0Var.f300614e)) && n51.f.a(this.f300615f, n0Var.f300615f) && n51.f.a(this.f300616g, n0Var.f300616g) && n51.f.a(this.f300617h, n0Var.f300617h) && n51.f.a(java.lang.Boolean.valueOf(this.f300618i), java.lang.Boolean.valueOf(n0Var.f300618i)) && n51.f.a(java.lang.Integer.valueOf(this.f300619m), java.lang.Integer.valueOf(n0Var.f300619m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.n0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f300613d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f300614e);
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.m0 m0Var = this.f300615f;
            if (m0Var != null) {
                fVar.i(3, m0Var.mo75928xcd1e8d8());
                this.f300615f.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f300616g;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            java.lang.String str2 = this.f300617h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.a(7, this.f300618i);
            fVar.e(8, this.f300619m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f300613d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f300614e);
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.m0 m0Var2 = this.f300615f;
            if (m0Var2 != null) {
                j17 += b36.f.i(3, m0Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f300616g;
            if (gVar2 != null) {
                j17 += b36.f.b(4, gVar2);
            }
            java.lang.String str4 = this.f300617h;
            if (str4 != null) {
                j17 += b36.f.j(5, str4);
            }
            return j17 + b36.f.a(7, this.f300618i) + b36.f.e(8, this.f300619m);
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
                this.f300613d = aVar2.k(intValue);
                return 0;
            case 2:
                this.f300614e = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.m0 m0Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.m0();
                    if (bArr != null && bArr.length > 0) {
                        m0Var3.mo11468x92b714fd(bArr);
                    }
                    this.f300615f = m0Var3;
                }
                return 0;
            case 4:
                this.f300616g = aVar2.d(intValue);
                return 0;
            case 5:
                this.f300617h = aVar2.k(intValue);
                return 0;
            case 6:
            default:
                return -1;
            case 7:
                this.f300618i = aVar2.c(intValue);
                return 0;
            case 8:
                this.f300619m = aVar2.g(intValue);
                return 0;
        }
    }
}
