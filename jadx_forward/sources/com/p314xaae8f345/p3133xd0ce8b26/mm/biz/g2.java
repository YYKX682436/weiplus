package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes4.dex */
public class g2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f299604d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f299605e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f299606f;

    /* renamed from: g, reason: collision with root package name */
    public float f299607g;

    /* renamed from: h, reason: collision with root package name */
    public float f299608h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f299609i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f299610m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f299611n = new boolean[8];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g2 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g2) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g2)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g2 g2Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g2) fVar;
        return n51.f.a(this.f299604d, g2Var.f299604d) && n51.f.a(this.f299605e, g2Var.f299605e) && n51.f.a(this.f299606f, g2Var.f299606f) && n51.f.a(java.lang.Float.valueOf(this.f299607g), java.lang.Float.valueOf(g2Var.f299607g)) && n51.f.a(java.lang.Float.valueOf(this.f299608h), java.lang.Float.valueOf(g2Var.f299608h)) && n51.f.a(this.f299609i, g2Var.f299609i) && n51.f.a(this.f299610m, g2Var.f299610m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f299611n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f299604d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f299605e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f299606f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.d(4, this.f299607g);
            }
            if (zArr[5]) {
                fVar.d(5, this.f299608h);
            }
            java.lang.String str4 = this.f299609i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f299610m;
            if (str5 != null && zArr[7]) {
                fVar.j(7, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f299604d;
            if (str6 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str6);
            }
            java.lang.String str7 = this.f299605e;
            if (str7 != null && zArr[2]) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f299606f;
            if (str8 != null && zArr[3]) {
                i18 += b36.f.j(3, str8);
            }
            if (zArr[4]) {
                i18 += b36.f.d(4, this.f299607g);
            }
            if (zArr[5]) {
                i18 += b36.f.d(5, this.f299608h);
            }
            java.lang.String str9 = this.f299609i;
            if (str9 != null && zArr[6]) {
                i18 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f299610m;
            return (str10 == null || !zArr[7]) ? i18 : i18 + b36.f.j(7, str10);
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
                this.f299604d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f299605e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f299606f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f299607g = aVar2.f(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f299608h = aVar2.f(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f299609i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f299610m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
