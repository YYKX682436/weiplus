package com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34;

/* loaded from: classes2.dex */
public class o extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: s, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.o f298244s = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.o();

    /* renamed from: d, reason: collision with root package name */
    public int f298245d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f298246e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f298247f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.p f298248g;

    /* renamed from: h, reason: collision with root package name */
    public int f298249h;

    /* renamed from: i, reason: collision with root package name */
    public int f298250i;

    /* renamed from: m, reason: collision with root package name */
    public int f298251m;

    /* renamed from: n, reason: collision with root package name */
    public int f298252n;

    /* renamed from: o, reason: collision with root package name */
    public int f298253o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f298254p;

    /* renamed from: q, reason: collision with root package name */
    public int f298255q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f298256r = new boolean[12];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.o)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.o oVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.o) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f298245d), java.lang.Integer.valueOf(oVar.f298245d)) && n51.f.a(this.f298246e, oVar.f298246e) && n51.f.a(this.f298247f, oVar.f298247f) && n51.f.a(this.f298248g, oVar.f298248g) && n51.f.a(java.lang.Integer.valueOf(this.f298249h), java.lang.Integer.valueOf(oVar.f298249h)) && n51.f.a(java.lang.Integer.valueOf(this.f298250i), java.lang.Integer.valueOf(oVar.f298250i)) && n51.f.a(java.lang.Integer.valueOf(this.f298251m), java.lang.Integer.valueOf(oVar.f298251m)) && n51.f.a(java.lang.Integer.valueOf(this.f298252n), java.lang.Integer.valueOf(oVar.f298252n)) && n51.f.a(java.lang.Integer.valueOf(this.f298253o), java.lang.Integer.valueOf(oVar.f298253o)) && n51.f.a(this.f298254p, oVar.f298254p) && n51.f.a(java.lang.Integer.valueOf(this.f298255q), java.lang.Integer.valueOf(oVar.f298255q));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.o();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f298256r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f298245d);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f298246e;
            if (gVar != null && zArr[2]) {
                fVar.b(2, gVar);
            }
            java.lang.String str = this.f298247f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.p pVar = this.f298248g;
            if (pVar != null && zArr[4]) {
                fVar.i(4, pVar.mo75928xcd1e8d8());
                this.f298248g.mo75956x3d5d1f78(fVar);
            }
            if (zArr[5]) {
                fVar.e(5, this.f298249h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f298250i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f298251m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f298252n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f298253o);
            }
            java.lang.String str2 = this.f298254p;
            if (str2 != null && zArr[10]) {
                fVar.j(10, str2);
            }
            if (zArr[11]) {
                fVar.e(11, this.f298255q);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f298245d) : 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f298246e;
            if (gVar2 != null && zArr[2]) {
                e17 += b36.f.b(2, gVar2);
            }
            java.lang.String str3 = this.f298247f;
            if (str3 != null && zArr[3]) {
                e17 += b36.f.j(3, str3);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.p pVar2 = this.f298248g;
            if (pVar2 != null && zArr[4]) {
                e17 += b36.f.i(4, pVar2.mo75928xcd1e8d8());
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f298249h);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f298250i);
            }
            if (zArr[7]) {
                e17 += b36.f.e(7, this.f298251m);
            }
            if (zArr[8]) {
                e17 += b36.f.e(8, this.f298252n);
            }
            if (zArr[9]) {
                e17 += b36.f.e(9, this.f298253o);
            }
            java.lang.String str4 = this.f298254p;
            if (str4 != null && zArr[10]) {
                e17 += b36.f.j(10, str4);
            }
            return zArr[11] ? e17 + b36.f.e(11, this.f298255q) : e17;
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
                this.f298245d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f298246e = aVar2.d(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f298247f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.p pVar3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.p();
                    if (bArr != null && bArr.length > 0) {
                        pVar3.mo11468x92b714fd(bArr);
                    }
                    this.f298248g = pVar3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f298249h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f298250i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f298251m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f298252n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f298253o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f298254p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f298255q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.o) super.mo11468x92b714fd(bArr);
    }
}
