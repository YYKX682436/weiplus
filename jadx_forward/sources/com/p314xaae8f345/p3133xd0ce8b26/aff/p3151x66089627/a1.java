package com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627;

/* loaded from: classes12.dex */
public class a1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f298480d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f298481e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f298482f = 0;

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.a1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.a1 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.a1) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.a1)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.a1 a1Var = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.a1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f298480d), java.lang.Integer.valueOf(a1Var.f298480d)) && n51.f.a(java.lang.Integer.valueOf(this.f298481e), java.lang.Integer.valueOf(a1Var.f298481e)) && n51.f.a(java.lang.Integer.valueOf(this.f298482f), java.lang.Integer.valueOf(a1Var.f298482f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.a1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f298480d);
            fVar.e(2, this.f298481e);
            fVar.e(3, this.f298482f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f298480d) + 0 + b36.f.e(2, this.f298481e) + b36.f.e(3, this.f298482f);
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
            this.f298480d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f298481e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f298482f = aVar2.g(intValue);
        return 0;
    }
}
