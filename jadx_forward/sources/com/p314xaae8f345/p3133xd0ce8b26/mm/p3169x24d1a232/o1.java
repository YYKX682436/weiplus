package com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232;

/* loaded from: classes2.dex */
public class o1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f301225d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.w0 f301226e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.d2 f301227f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f301228g = new boolean[4];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.o1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.o1 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.o1) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.o1)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.o1 o1Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.o1) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f301225d), java.lang.Boolean.valueOf(o1Var.f301225d)) && n51.f.a(this.f301226e, o1Var.f301226e) && n51.f.a(this.f301227f, o1Var.f301227f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.o1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f301228g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f301225d);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.w0 w0Var = this.f301226e;
            if (w0Var != null && zArr[2]) {
                fVar.i(2, w0Var.mo75928xcd1e8d8());
                this.f301226e.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.d2 d2Var = this.f301227f;
            if (d2Var != null && zArr[3]) {
                fVar.i(3, d2Var.mo75928xcd1e8d8());
                this.f301227f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f301225d) : 0;
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.w0 w0Var2 = this.f301226e;
            if (w0Var2 != null && zArr[2]) {
                a17 += b36.f.i(2, w0Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.d2 d2Var2 = this.f301227f;
            return (d2Var2 == null || !zArr[3]) ? a17 : a17 + b36.f.i(3, d2Var2.mo75928xcd1e8d8());
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
            this.f301225d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.w0 w0Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.w0();
                if (bArr != null && bArr.length > 0) {
                    w0Var3.mo11468x92b714fd(bArr);
                }
                this.f301226e = w0Var3;
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
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.d2 d2Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.d2();
            if (bArr2 != null && bArr2.length > 0) {
                d2Var3.mo11468x92b714fd(bArr2);
            }
            this.f301227f = d2Var3;
        }
        zArr[3] = true;
        return 0;
    }
}
