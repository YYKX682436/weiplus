package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes2.dex */
public class n3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: i, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.mm.biz.n3 f299908i = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.n3();

    /* renamed from: d, reason: collision with root package name */
    public int f299909d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f299910e;

    /* renamed from: f, reason: collision with root package name */
    public int f299911f;

    /* renamed from: g, reason: collision with root package name */
    public int f299912g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f299913h = new boolean[5];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.n3)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.n3 n3Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.n3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f299909d), java.lang.Integer.valueOf(n3Var.f299909d)) && n51.f.a(this.f299910e, n3Var.f299910e) && n51.f.a(java.lang.Integer.valueOf(this.f299911f), java.lang.Integer.valueOf(n3Var.f299911f)) && n51.f.a(java.lang.Integer.valueOf(this.f299912g), java.lang.Integer.valueOf(n3Var.f299912g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.n3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f299913h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f299909d);
            }
            java.lang.String str = this.f299910e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.e(3, this.f299911f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f299912g);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f299909d) : 0;
            java.lang.String str2 = this.f299910e;
            if (str2 != null && zArr[2]) {
                e17 += b36.f.j(2, str2);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f299911f);
            }
            return zArr[4] ? e17 + b36.f.e(4, this.f299912g) : e17;
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
            this.f299909d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f299910e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f299911f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f299912g = aVar2.g(intValue);
        zArr[4] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.n3) super.mo11468x92b714fd(bArr);
    }
}
