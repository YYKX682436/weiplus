package com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627;

/* loaded from: classes4.dex */
public class e1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: f, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.e1 f298534f = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.e1();

    /* renamed from: d, reason: collision with root package name */
    public float f298535d = 0.0f;

    /* renamed from: e, reason: collision with root package name */
    public boolean f298536e = false;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.e1)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.e1 e1Var = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.e1) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f298535d), java.lang.Float.valueOf(e1Var.f298535d)) && n51.f.a(java.lang.Boolean.valueOf(this.f298536e), java.lang.Boolean.valueOf(e1Var.f298536e));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.e1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.d(1, this.f298535d);
            fVar.a(2, this.f298536e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.d(1, this.f298535d) + 0 + b36.f.a(2, this.f298536e);
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
            this.f298535d = aVar2.f(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f298536e = aVar2.c(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.e1) super.mo11468x92b714fd(bArr);
    }
}
