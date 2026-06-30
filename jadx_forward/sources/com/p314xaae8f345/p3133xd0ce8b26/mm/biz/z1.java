package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes2.dex */
public class z1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f300358d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.e1 f300359e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.z2 f300360f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f300361g = new boolean[4];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.z1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.z1 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.z1) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.z1)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.z1 z1Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.z1) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f300358d), java.lang.Boolean.valueOf(z1Var.f300358d)) && n51.f.a(this.f300359e, z1Var.f300359e) && n51.f.a(this.f300360f, z1Var.f300360f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.z1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f300361g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f300358d);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.e1 e1Var = this.f300359e;
            if (e1Var != null && zArr[2]) {
                fVar.i(2, e1Var.mo75928xcd1e8d8());
                this.f300359e.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.z2 z2Var = this.f300360f;
            if (z2Var != null && zArr[3]) {
                fVar.i(3, z2Var.mo75928xcd1e8d8());
                this.f300360f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f300358d) : 0;
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.e1 e1Var2 = this.f300359e;
            if (e1Var2 != null && zArr[2]) {
                a17 += b36.f.i(2, e1Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.z2 z2Var2 = this.f300360f;
            return (z2Var2 == null || !zArr[3]) ? a17 : a17 + b36.f.i(3, z2Var2.mo75928xcd1e8d8());
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
            this.f300358d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                com.p314xaae8f345.p3133xd0ce8b26.mm.biz.e1 e1Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.e1();
                if (bArr != null && bArr.length > 0) {
                    e1Var3.mo11468x92b714fd(bArr);
                }
                this.f300359e = e1Var3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.z2 z2Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.z2();
            if (bArr2 != null && bArr2.length > 0) {
                z2Var3.mo11468x92b714fd(bArr2);
            }
            this.f300360f = z2Var3;
        }
        zArr[3] = true;
        return 0;
    }
}
