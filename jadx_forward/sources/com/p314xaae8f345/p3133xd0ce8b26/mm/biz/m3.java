package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes2.dex */
public class m3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f299868d;

    /* renamed from: e, reason: collision with root package name */
    public int f299869e;

    /* renamed from: f, reason: collision with root package name */
    public int f299870f;

    /* renamed from: g, reason: collision with root package name */
    public int f299871g;

    /* renamed from: h, reason: collision with root package name */
    public int f299872h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f299873i = new boolean[6];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.m3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.m3 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.m3) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.m3)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.m3 m3Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.m3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f299868d), java.lang.Integer.valueOf(m3Var.f299868d)) && n51.f.a(java.lang.Integer.valueOf(this.f299869e), java.lang.Integer.valueOf(m3Var.f299869e)) && n51.f.a(java.lang.Integer.valueOf(this.f299870f), java.lang.Integer.valueOf(m3Var.f299870f)) && n51.f.a(java.lang.Integer.valueOf(this.f299871g), java.lang.Integer.valueOf(m3Var.f299871g)) && n51.f.a(java.lang.Integer.valueOf(this.f299872h), java.lang.Integer.valueOf(m3Var.f299872h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.m3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f299873i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f299868d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f299869e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f299870f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f299871g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f299872h);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f299868d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f299869e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f299870f);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f299871g);
            }
            return zArr[5] ? e17 + b36.f.e(5, this.f299872h) : e17;
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
            this.f299868d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f299869e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f299870f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f299871g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f299872h = aVar2.g(intValue);
        zArr[5] = true;
        return 0;
    }
}
