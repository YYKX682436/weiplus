package com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f;

/* loaded from: classes8.dex */
public class w1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f298053d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.v1 f298054e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f298055f = new boolean[3];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.w1();
    }

    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.v1 b() {
        return this.f298055f[2] ? this.f298054e : new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.v1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.w1 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.w1) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.w1)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.w1 w1Var = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.w1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f298053d), java.lang.Integer.valueOf(w1Var.f298053d)) && n51.f.a(this.f298054e, w1Var.f298054e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.w1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f298055f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f298053d);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.v1 v1Var = this.f298054e;
            if (v1Var != null && zArr[2]) {
                fVar.i(2, v1Var.mo75928xcd1e8d8());
                this.f298054e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f298053d) : 0;
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.v1 v1Var2 = this.f298054e;
            return (v1Var2 == null || !zArr[2]) ? e17 : e17 + b36.f.i(2, v1Var2.mo75928xcd1e8d8());
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
            this.f298053d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.v1 v1Var3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.v1();
            if (bArr != null && bArr.length > 0) {
                v1Var3.mo11468x92b714fd(bArr);
            }
            this.f298054e = v1Var3;
        }
        zArr[2] = true;
        return 0;
    }
}
