package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes2.dex */
public class u2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.v2 f300211d;

    /* renamed from: e, reason: collision with root package name */
    public int f300212e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f300213f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f300214g = new boolean[4];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.u2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.u2 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.u2) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.u2)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.u2 u2Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.u2) fVar;
        return n51.f.a(this.f300211d, u2Var.f300211d) && n51.f.a(java.lang.Integer.valueOf(this.f300212e), java.lang.Integer.valueOf(u2Var.f300212e)) && n51.f.a(this.f300213f, u2Var.f300213f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.u2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f300214g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.v2 v2Var = this.f300211d;
            if (v2Var != null && zArr[1]) {
                fVar.i(1, v2Var.mo75928xcd1e8d8());
                this.f300211d.mo75956x3d5d1f78(fVar);
            }
            if (zArr[2]) {
                fVar.e(2, this.f300212e);
            }
            java.lang.String str = this.f300213f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.v2 v2Var2 = this.f300211d;
            if (v2Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, v2Var2.mo75928xcd1e8d8());
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f300212e);
            }
            java.lang.String str2 = this.f300213f;
            return (str2 == null || !zArr[3]) ? i18 : i18 + b36.f.j(3, str2);
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
        if (intValue != 1) {
            if (intValue == 2) {
                this.f300212e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            this.f300213f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.v2 v2Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.v2();
            if (bArr != null && bArr.length > 0) {
                v2Var3.mo11468x92b714fd(bArr);
            }
            this.f300211d = v2Var3;
        }
        zArr[1] = true;
        return 0;
    }
}
