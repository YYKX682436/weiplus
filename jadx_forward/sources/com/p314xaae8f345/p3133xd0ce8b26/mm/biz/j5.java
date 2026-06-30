package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes2.dex */
public class j5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f299765d;

    /* renamed from: e, reason: collision with root package name */
    public int f299766e;

    /* renamed from: f, reason: collision with root package name */
    public int f299767f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f299768g = new boolean[4];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.j5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.j5 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.j5) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.j5)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.j5 j5Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.j5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f299765d), java.lang.Integer.valueOf(j5Var.f299765d)) && n51.f.a(java.lang.Integer.valueOf(this.f299766e), java.lang.Integer.valueOf(j5Var.f299766e)) && n51.f.a(java.lang.Integer.valueOf(this.f299767f), java.lang.Integer.valueOf(j5Var.f299767f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.j5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f299768g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f299765d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f299766e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f299767f);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f299765d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f299766e);
            }
            return zArr[3] ? e17 + b36.f.e(3, this.f299767f) : e17;
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
            this.f299765d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f299766e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f299767f = aVar2.g(intValue);
        zArr[3] = true;
        return 0;
    }
}
