package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class o6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f227050d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f227051e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f227052f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f227053g;

    /* renamed from: h, reason: collision with root package name */
    public int f227054h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f227055i;

    /* renamed from: m, reason: collision with root package name */
    public int f227056m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o6)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o6 o6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f227050d), java.lang.Integer.valueOf(o6Var.f227050d)) && n51.f.a(this.f227051e, o6Var.f227051e) && n51.f.a(this.f227052f, o6Var.f227052f) && n51.f.a(this.f227053g, o6Var.f227053g) && n51.f.a(java.lang.Integer.valueOf(this.f227054h), java.lang.Integer.valueOf(o6Var.f227054h)) && n51.f.a(this.f227055i, o6Var.f227055i) && n51.f.a(java.lang.Integer.valueOf(this.f227056m), java.lang.Integer.valueOf(o6Var.f227056m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f227050d);
            java.lang.String str = this.f227051e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f227052f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f227053g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f227054h);
            java.lang.String str4 = this.f227055i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f227056m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f227050d) + 0;
            java.lang.String str5 = this.f227051e;
            if (str5 != null) {
                e17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f227052f;
            if (str6 != null) {
                e17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f227053g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            int e18 = e17 + b36.f.e(5, this.f227054h);
            java.lang.String str8 = this.f227055i;
            if (str8 != null) {
                e18 += b36.f.j(6, str8);
            }
            return e18 + b36.f.e(7, this.f227056m);
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o6 o6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                o6Var.f227050d = aVar2.g(intValue);
                return 0;
            case 2:
                o6Var.f227051e = aVar2.k(intValue);
                return 0;
            case 3:
                o6Var.f227052f = aVar2.k(intValue);
                return 0;
            case 4:
                o6Var.f227053g = aVar2.k(intValue);
                return 0;
            case 5:
                o6Var.f227054h = aVar2.g(intValue);
                return 0;
            case 6:
                o6Var.f227055i = aVar2.k(intValue);
                return 0;
            case 7:
                o6Var.f227056m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
