package com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f;

/* loaded from: classes2.dex */
public class e1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.d1 f297714d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.c1 f297715e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f297716f = new boolean[3];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.e1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.e1 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.e1) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.e1)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.e1 e1Var = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.e1) fVar;
        return n51.f.a(this.f297714d, e1Var.f297714d) && n51.f.a(this.f297715e, e1Var.f297715e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.e1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f297716f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.d1 d1Var = this.f297714d;
            if (d1Var != null && zArr[1]) {
                fVar.e(1, d1Var.f297684d);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.c1 c1Var = this.f297715e;
            if (c1Var != null && zArr[2]) {
                fVar.i(2, c1Var.mo75928xcd1e8d8());
                this.f297715e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.d1 d1Var2 = this.f297714d;
            if (d1Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, d1Var2.f297684d);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.c1 c1Var2 = this.f297715e;
            return (c1Var2 == null || !zArr[2]) ? i18 : i18 + b36.f.i(2, c1Var2.mo75928xcd1e8d8());
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
            int g17 = aVar2.g(intValue);
            this.f297714d = g17 != 0 ? g17 != 1 ? g17 != 2 ? g17 != 3 ? g17 != 99 ? null : com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.d1.MSG_TYPE_ERROR : com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.d1.MSG_TYPE_EOF : com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.d1.MSG_TYPE_START : com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.d1.MSG_TYPE_DATA : com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.d1.MSG_TYPE_INVALID;
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.c1 c1Var3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.c1();
            if (bArr != null && bArr.length > 0) {
                c1Var3.mo11468x92b714fd(bArr);
            }
            this.f297715e = c1Var3;
        }
        zArr[2] = true;
        return 0;
    }
}
