package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes9.dex */
public class s5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public double f300155d;

    /* renamed from: e, reason: collision with root package name */
    public double f300156e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f300157f;

    /* renamed from: g, reason: collision with root package name */
    public int f300158g;

    /* renamed from: h, reason: collision with root package name */
    public int f300159h;

    /* renamed from: i, reason: collision with root package name */
    public int f300160i;

    /* renamed from: m, reason: collision with root package name */
    public int f300161m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f300162n = new boolean[8];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.s5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.s5)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.s5 s5Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.s5) fVar;
        return n51.f.a(java.lang.Double.valueOf(this.f300155d), java.lang.Double.valueOf(s5Var.f300155d)) && n51.f.a(java.lang.Double.valueOf(this.f300156e), java.lang.Double.valueOf(s5Var.f300156e)) && n51.f.a(this.f300157f, s5Var.f300157f) && n51.f.a(java.lang.Integer.valueOf(this.f300158g), java.lang.Integer.valueOf(s5Var.f300158g)) && n51.f.a(java.lang.Integer.valueOf(this.f300159h), java.lang.Integer.valueOf(s5Var.f300159h)) && n51.f.a(java.lang.Integer.valueOf(this.f300160i), java.lang.Integer.valueOf(s5Var.f300160i)) && n51.f.a(java.lang.Integer.valueOf(this.f300161m), java.lang.Integer.valueOf(s5Var.f300161m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.s5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f300162n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.c(1, this.f300155d);
            }
            if (zArr[2]) {
                fVar.c(2, this.f300156e);
            }
            java.lang.String str = this.f300157f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            if (zArr[4]) {
                fVar.e(4, this.f300158g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f300159h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f300160i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f300161m);
            }
            return 0;
        }
        if (i17 == 1) {
            int c17 = zArr[1] ? 0 + b36.f.c(1, this.f300155d) : 0;
            if (zArr[2]) {
                c17 += b36.f.c(2, this.f300156e);
            }
            java.lang.String str2 = this.f300157f;
            if (str2 != null && zArr[3]) {
                c17 += b36.f.j(3, str2);
            }
            if (zArr[4]) {
                c17 += b36.f.e(4, this.f300158g);
            }
            if (zArr[5]) {
                c17 += b36.f.e(5, this.f300159h);
            }
            if (zArr[6]) {
                c17 += b36.f.e(6, this.f300160i);
            }
            return zArr[7] ? c17 + b36.f.e(7, this.f300161m) : c17;
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
        switch (intValue) {
            case 1:
                this.f300155d = aVar2.e(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f300156e = aVar2.e(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f300157f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f300158g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f300159h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f300160i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f300161m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.s5) super.mo11468x92b714fd(bArr);
    }
}
