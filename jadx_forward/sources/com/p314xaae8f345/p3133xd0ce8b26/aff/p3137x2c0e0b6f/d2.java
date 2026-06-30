package com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f;

/* loaded from: classes2.dex */
public class d2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.c2 f297685d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.z1 f297686e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f297687f = new boolean[3];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.d2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.d2 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.d2) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.d2)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.d2 d2Var = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.d2) fVar;
        return n51.f.a(this.f297685d, d2Var.f297685d) && n51.f.a(this.f297686e, d2Var.f297686e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.d2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f297687f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.c2 c2Var = this.f297685d;
            if (c2Var != null && zArr[1]) {
                fVar.i(1, c2Var.mo75928xcd1e8d8());
                this.f297685d.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.z1 z1Var = this.f297686e;
            if (z1Var != null && zArr[2]) {
                fVar.i(2, z1Var.mo75928xcd1e8d8());
                this.f297686e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.c2 c2Var2 = this.f297685d;
            if (c2Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, c2Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.z1 z1Var2 = this.f297686e;
            return (z1Var2 == null || !zArr[2]) ? i18 : i18 + b36.f.i(2, z1Var2.mo75928xcd1e8d8());
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
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.c2 c2Var3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.c2();
                if (bArr != null && bArr.length > 0) {
                    c2Var3.mo11468x92b714fd(bArr);
                }
                this.f297685d = c2Var3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.z1 z1Var3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.z1();
            if (bArr2 != null && bArr2.length > 0) {
                z1Var3.mo11468x92b714fd(bArr2);
            }
            this.f297686e = z1Var3;
        }
        zArr[2] = true;
        return 0;
    }
}
