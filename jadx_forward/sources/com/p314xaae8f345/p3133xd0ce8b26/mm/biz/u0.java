package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes2.dex */
public class u0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f300198d;

    /* renamed from: e, reason: collision with root package name */
    public int f300199e;

    /* renamed from: f, reason: collision with root package name */
    public int f300200f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f300201g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f300202h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f300203i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f300204m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f300205n = new boolean[8];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.u0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.u0 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.u0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.u0)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.u0 u0Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.u0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f300198d), java.lang.Integer.valueOf(u0Var.f300198d)) && n51.f.a(java.lang.Integer.valueOf(this.f300199e), java.lang.Integer.valueOf(u0Var.f300199e)) && n51.f.a(java.lang.Integer.valueOf(this.f300200f), java.lang.Integer.valueOf(u0Var.f300200f)) && n51.f.a(this.f300201g, u0Var.f300201g) && n51.f.a(this.f300202h, u0Var.f300202h) && n51.f.a(this.f300203i, u0Var.f300203i) && n51.f.a(this.f300204m, u0Var.f300204m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.u0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f300205n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f300198d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f300199e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f300200f);
            }
            java.lang.String str = this.f300201g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f300202h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f300203i;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f300204m;
            if (str4 != null && zArr[7]) {
                fVar.j(7, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f300198d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f300199e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f300200f);
            }
            java.lang.String str5 = this.f300201g;
            if (str5 != null && zArr[4]) {
                e17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f300202h;
            if (str6 != null && zArr[5]) {
                e17 += b36.f.j(5, str6);
            }
            java.lang.String str7 = this.f300203i;
            if (str7 != null && zArr[6]) {
                e17 += b36.f.j(6, str7);
            }
            java.lang.String str8 = this.f300204m;
            return (str8 == null || !zArr[7]) ? e17 : e17 + b36.f.j(7, str8);
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
                this.f300198d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f300199e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f300200f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f300201g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f300202h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f300203i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f300204m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
