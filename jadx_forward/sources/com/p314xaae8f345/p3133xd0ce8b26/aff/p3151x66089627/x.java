package com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627;

/* loaded from: classes9.dex */
public class x extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: r, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.x f298684r = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.x();

    /* renamed from: d, reason: collision with root package name */
    public long f298685d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f298686e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f298687f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f298688g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f298689h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f298690i = 0;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.u0 f298691m = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.u0();

    /* renamed from: n, reason: collision with root package name */
    public long f298692n = 0;

    /* renamed from: o, reason: collision with root package name */
    public long f298693o = 0;

    /* renamed from: p, reason: collision with root package name */
    public long f298694p = 0;

    /* renamed from: q, reason: collision with root package name */
    public long f298695q = 0;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.x)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.x xVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.x) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f298685d), java.lang.Long.valueOf(xVar.f298685d)) && n51.f.a(java.lang.Integer.valueOf(this.f298686e), java.lang.Integer.valueOf(xVar.f298686e)) && n51.f.a(java.lang.Integer.valueOf(this.f298687f), java.lang.Integer.valueOf(xVar.f298687f)) && n51.f.a(java.lang.Integer.valueOf(this.f298688g), java.lang.Integer.valueOf(xVar.f298688g)) && n51.f.a(java.lang.Integer.valueOf(this.f298689h), java.lang.Integer.valueOf(xVar.f298689h)) && n51.f.a(java.lang.Integer.valueOf(this.f298690i), java.lang.Integer.valueOf(xVar.f298690i)) && n51.f.a(this.f298691m, xVar.f298691m) && n51.f.a(java.lang.Long.valueOf(this.f298692n), java.lang.Long.valueOf(xVar.f298692n)) && n51.f.a(java.lang.Long.valueOf(this.f298693o), java.lang.Long.valueOf(xVar.f298693o)) && n51.f.a(java.lang.Long.valueOf(this.f298694p), java.lang.Long.valueOf(xVar.f298694p)) && n51.f.a(java.lang.Long.valueOf(this.f298695q), java.lang.Long.valueOf(xVar.f298695q));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.x();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f298685d);
            fVar.e(2, this.f298686e);
            fVar.e(3, this.f298687f);
            fVar.e(4, this.f298688g);
            fVar.e(5, this.f298689h);
            fVar.e(6, this.f298690i);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.u0 u0Var = this.f298691m;
            if (u0Var != null) {
                fVar.i(7, u0Var.mo75928xcd1e8d8());
                this.f298691m.mo75956x3d5d1f78(fVar);
            }
            fVar.h(8, this.f298692n);
            fVar.h(9, this.f298693o);
            fVar.h(10, this.f298694p);
            fVar.h(11, this.f298695q);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f298685d) + 0 + b36.f.e(2, this.f298686e) + b36.f.e(3, this.f298687f) + b36.f.e(4, this.f298688g) + b36.f.e(5, this.f298689h) + b36.f.e(6, this.f298690i);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.u0 u0Var2 = this.f298691m;
            if (u0Var2 != null) {
                h17 += b36.f.i(7, u0Var2.mo75928xcd1e8d8());
            }
            return h17 + b36.f.h(8, this.f298692n) + b36.f.h(9, this.f298693o) + b36.f.h(10, this.f298694p) + b36.f.h(11, this.f298695q);
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
                this.f298685d = aVar2.i(intValue);
                return 0;
            case 2:
                this.f298686e = aVar2.g(intValue);
                return 0;
            case 3:
                this.f298687f = aVar2.g(intValue);
                return 0;
            case 4:
                this.f298688g = aVar2.g(intValue);
                return 0;
            case 5:
                this.f298689h = aVar2.g(intValue);
                return 0;
            case 6:
                this.f298690i = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.u0 u0Var3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.u0();
                    if (bArr != null && bArr.length > 0) {
                        u0Var3.mo11468x92b714fd(bArr);
                    }
                    this.f298691m = u0Var3;
                }
                return 0;
            case 8:
                this.f298692n = aVar2.i(intValue);
                return 0;
            case 9:
                this.f298693o = aVar2.i(intValue);
                return 0;
            case 10:
                this.f298694p = aVar2.i(intValue);
                return 0;
            case 11:
                this.f298695q = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.x) super.mo11468x92b714fd(bArr);
    }
}
