package com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627;

/* loaded from: classes15.dex */
public class d1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f298518d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f298519e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f298520f = "";

    /* renamed from: g, reason: collision with root package name */
    public long f298521g = 0;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.u0 f298522h = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.u0();

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.c1 f298523i = com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.c1.UNKNOWN;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.r f298524m = com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.r.NONE;

    /* renamed from: n, reason: collision with root package name */
    public boolean f298525n = false;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.f1 f298526o = com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.f1.DEFAULT;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.a1 f298527p = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.a1();

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.d1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.d1)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.d1 d1Var = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.d1) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f298518d), java.lang.Long.valueOf(d1Var.f298518d)) && n51.f.a(this.f298519e, d1Var.f298519e) && n51.f.a(this.f298520f, d1Var.f298520f) && n51.f.a(java.lang.Long.valueOf(this.f298521g), java.lang.Long.valueOf(d1Var.f298521g)) && n51.f.a(this.f298522h, d1Var.f298522h) && n51.f.a(this.f298523i, d1Var.f298523i) && n51.f.a(this.f298524m, d1Var.f298524m) && n51.f.a(java.lang.Boolean.valueOf(this.f298525n), java.lang.Boolean.valueOf(d1Var.f298525n)) && n51.f.a(this.f298526o, d1Var.f298526o) && n51.f.a(this.f298527p, d1Var.f298527p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.d1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f298518d);
            java.lang.String str = this.f298519e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f298520f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.h(4, this.f298521g);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.u0 u0Var = this.f298522h;
            if (u0Var != null) {
                fVar.i(5, u0Var.mo75928xcd1e8d8());
                this.f298522h.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.c1 c1Var = this.f298523i;
            if (c1Var != null) {
                fVar.e(6, c1Var.f298515d);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.r rVar = this.f298524m;
            if (rVar != null) {
                fVar.e(7, rVar.f298659d);
            }
            fVar.a(8, this.f298525n);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.f1 f1Var = this.f298526o;
            if (f1Var != null) {
                fVar.e(9, f1Var.f298546d);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.a1 a1Var = this.f298527p;
            if (a1Var != null) {
                fVar.i(10, a1Var.mo75928xcd1e8d8());
                this.f298527p.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f298518d) + 0;
            java.lang.String str3 = this.f298519e;
            if (str3 != null) {
                h17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f298520f;
            if (str4 != null) {
                h17 += b36.f.j(3, str4);
            }
            int h18 = h17 + b36.f.h(4, this.f298521g);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.u0 u0Var2 = this.f298522h;
            if (u0Var2 != null) {
                h18 += b36.f.i(5, u0Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.c1 c1Var2 = this.f298523i;
            if (c1Var2 != null) {
                h18 += b36.f.e(6, c1Var2.f298515d);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.r rVar2 = this.f298524m;
            if (rVar2 != null) {
                h18 += b36.f.e(7, rVar2.f298659d);
            }
            int a17 = h18 + b36.f.a(8, this.f298525n);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.f1 f1Var2 = this.f298526o;
            if (f1Var2 != null) {
                a17 += b36.f.e(9, f1Var2.f298546d);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.a1 a1Var2 = this.f298527p;
            return a1Var2 != null ? a17 + b36.f.i(10, a1Var2.mo75928xcd1e8d8()) : a17;
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
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.c1 c1Var3 = null;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.f1 f1Var3 = null;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.r rVar3 = null;
        switch (intValue) {
            case 1:
                this.f298518d = aVar2.i(intValue);
                return 0;
            case 2:
                this.f298519e = aVar2.k(intValue);
                return 0;
            case 3:
                this.f298520f = aVar2.k(intValue);
                return 0;
            case 4:
                this.f298521g = aVar2.i(intValue);
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.u0 u0Var3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.u0();
                    if (bArr != null && bArr.length > 0) {
                        u0Var3.mo11468x92b714fd(bArr);
                    }
                    this.f298522h = u0Var3;
                }
                return 0;
            case 6:
                int g17 = aVar2.g(intValue);
                if (g17 == 0) {
                    c1Var3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.c1.UNKNOWN;
                } else if (g17 == 1) {
                    c1Var3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.c1.SCAN;
                } else if (g17 == 2) {
                    c1Var3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.c1.SCAN_MERGE;
                } else if (g17 == 3) {
                    c1Var3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.c1.SCAN_GALLERY;
                } else if (g17 == 4) {
                    c1Var3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.c1.LONG_PRESS_IMAGE;
                }
                this.f298523i = c1Var3;
                return 0;
            case 7:
                int g18 = aVar2.g(intValue);
                if (g18 == -1) {
                    rVar3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.r.NONE;
                } else if (g18 == 1) {
                    rVar3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.r.SUCCESS;
                } else if (g18 == 2) {
                    rVar3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.r.NOT_SUPPORT;
                }
                this.f298524m = rVar3;
                return 0;
            case 8:
                this.f298525n = aVar2.c(intValue);
                return 0;
            case 9:
                switch (aVar2.g(intValue)) {
                    case 1:
                        f1Var3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.f1.DEFAULT;
                        break;
                    case 2:
                        f1Var3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.f1.DECODE_SUCCESS;
                        break;
                    case 3:
                        f1Var3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.f1.SWITCH_TRANSLATE_TAB;
                        break;
                    case 4:
                        f1Var3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.f1.SWITCH_GOODS_TAB;
                        break;
                    case 5:
                        f1Var3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.f1.CLICK_GALLERY;
                        break;
                    case 6:
                        f1Var3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.f1.CLICK_MY_QRCODE;
                        break;
                    case 7:
                        f1Var3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.f1.SHOW_PRODUCT_RESULT;
                        break;
                }
                this.f298526o = f1Var3;
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.a1 a1Var3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.a1();
                    if (bArr2 != null && bArr2.length > 0) {
                        a1Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f298527p = a1Var3;
                }
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.d1) super.mo11468x92b714fd(bArr);
    }
}
