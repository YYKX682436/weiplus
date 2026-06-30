package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes2.dex */
public class z3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f300365d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f300366e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f300367f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f300368g;

    /* renamed from: h, reason: collision with root package name */
    public int f300369h;

    /* renamed from: i, reason: collision with root package name */
    public int f300370i;

    /* renamed from: m, reason: collision with root package name */
    public int f300371m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f300372n = new boolean[8];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.z3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.z3 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.z3) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.z3)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.z3 z3Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.z3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f300365d), java.lang.Integer.valueOf(z3Var.f300365d)) && n51.f.a(this.f300366e, z3Var.f300366e) && n51.f.a(this.f300367f, z3Var.f300367f) && n51.f.a(this.f300368g, z3Var.f300368g) && n51.f.a(java.lang.Integer.valueOf(this.f300369h), java.lang.Integer.valueOf(z3Var.f300369h)) && n51.f.a(java.lang.Integer.valueOf(this.f300370i), java.lang.Integer.valueOf(z3Var.f300370i)) && n51.f.a(java.lang.Integer.valueOf(this.f300371m), java.lang.Integer.valueOf(z3Var.f300371m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.z3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f300372n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f300365d);
            }
            java.lang.String str = this.f300366e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f300367f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f300368g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            if (zArr[5]) {
                fVar.e(5, this.f300369h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f300370i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f300371m);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f300365d) : 0;
            java.lang.String str4 = this.f300366e;
            if (str4 != null && zArr[2]) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f300367f;
            if (str5 != null && zArr[3]) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f300368g;
            if (str6 != null && zArr[4]) {
                e17 += b36.f.j(4, str6);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f300369h);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f300370i);
            }
            return zArr[7] ? e17 + b36.f.e(7, this.f300371m) : e17;
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
                this.f300365d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f300366e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f300367f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f300368g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f300369h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f300370i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f300371m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
