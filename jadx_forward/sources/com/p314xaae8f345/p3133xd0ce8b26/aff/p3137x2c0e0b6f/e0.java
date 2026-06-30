package com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f;

/* loaded from: classes4.dex */
public class e0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: p, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.e0 f297704p = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.e0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f297705d;

    /* renamed from: e, reason: collision with root package name */
    public long f297706e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f297707f;

    /* renamed from: g, reason: collision with root package name */
    public long f297708g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f297709h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f297710i;

    /* renamed from: m, reason: collision with root package name */
    public long f297711m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f297712n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f297713o = new boolean[9];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.e0 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.e0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.e0)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.e0 e0Var = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.e0) fVar;
        return n51.f.a(this.f297705d, e0Var.f297705d) && n51.f.a(java.lang.Long.valueOf(this.f297706e), java.lang.Long.valueOf(e0Var.f297706e)) && n51.f.a(this.f297707f, e0Var.f297707f) && n51.f.a(java.lang.Long.valueOf(this.f297708g), java.lang.Long.valueOf(e0Var.f297708g)) && n51.f.a(this.f297709h, e0Var.f297709h) && n51.f.a(this.f297710i, e0Var.f297710i) && n51.f.a(java.lang.Long.valueOf(this.f297711m), java.lang.Long.valueOf(e0Var.f297711m)) && n51.f.a(java.lang.Boolean.valueOf(this.f297712n), java.lang.Boolean.valueOf(e0Var.f297712n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.e0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f297713o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f297705d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.h(2, this.f297706e);
            }
            java.lang.String str2 = this.f297707f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.h(4, this.f297708g);
            }
            java.lang.String str3 = this.f297709h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f297710i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            if (zArr[7]) {
                fVar.h(7, this.f297711m);
            }
            if (zArr[8]) {
                fVar.a(8, this.f297712n);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f297705d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f297706e);
            }
            java.lang.String str6 = this.f297707f;
            if (str6 != null && zArr[3]) {
                i18 += b36.f.j(3, str6);
            }
            if (zArr[4]) {
                i18 += b36.f.h(4, this.f297708g);
            }
            java.lang.String str7 = this.f297709h;
            if (str7 != null && zArr[5]) {
                i18 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f297710i;
            if (str8 != null && zArr[6]) {
                i18 += b36.f.j(6, str8);
            }
            if (zArr[7]) {
                i18 += b36.f.h(7, this.f297711m);
            }
            return zArr[8] ? i18 + b36.f.a(8, this.f297712n) : i18;
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
                this.f297705d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f297706e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f297707f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f297708g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f297709h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f297710i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f297711m = aVar2.i(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f297712n = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
