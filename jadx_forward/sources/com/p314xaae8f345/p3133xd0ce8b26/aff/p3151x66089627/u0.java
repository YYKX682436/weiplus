package com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627;

/* loaded from: classes9.dex */
public class u0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f298672d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f298673e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f298674f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f298675g = 0;

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.u0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.u0 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.u0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.u0)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.u0 u0Var = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.u0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f298672d), java.lang.Integer.valueOf(u0Var.f298672d)) && n51.f.a(java.lang.Integer.valueOf(this.f298673e), java.lang.Integer.valueOf(u0Var.f298673e)) && n51.f.a(java.lang.Integer.valueOf(this.f298674f), java.lang.Integer.valueOf(u0Var.f298674f)) && n51.f.a(java.lang.Integer.valueOf(this.f298675g), java.lang.Integer.valueOf(u0Var.f298675g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.u0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f298672d);
            fVar.e(2, this.f298673e);
            fVar.e(3, this.f298674f);
            fVar.e(4, this.f298675g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f298672d) + 0 + b36.f.e(2, this.f298673e) + b36.f.e(3, this.f298674f) + b36.f.e(4, this.f298675g);
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
            this.f298672d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f298673e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f298674f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f298675g = aVar2.g(intValue);
        return 0;
    }
}
