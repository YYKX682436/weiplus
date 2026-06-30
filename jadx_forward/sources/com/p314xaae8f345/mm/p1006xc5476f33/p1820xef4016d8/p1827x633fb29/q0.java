package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class q0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f227083d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f227084e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f227085f;

    /* renamed from: g, reason: collision with root package name */
    public int f227086g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f227087h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f227088i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.q0)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.q0 q0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.q0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f227083d), java.lang.Boolean.valueOf(q0Var.f227083d)) && n51.f.a(this.f227084e, q0Var.f227084e) && n51.f.a(this.f227085f, q0Var.f227085f) && n51.f.a(java.lang.Integer.valueOf(this.f227086g), java.lang.Integer.valueOf(q0Var.f227086g)) && n51.f.a(this.f227087h, q0Var.f227087h) && n51.f.a(this.f227088i, q0Var.f227088i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f227083d);
            java.lang.String str = this.f227084e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f227085f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f227086g);
            java.lang.String str3 = this.f227087h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f227088i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f227083d) + 0;
            java.lang.String str5 = this.f227084e;
            if (str5 != null) {
                a17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f227085f;
            if (str6 != null) {
                a17 += b36.f.j(3, str6);
            }
            int e17 = a17 + b36.f.e(4, this.f227086g);
            java.lang.String str7 = this.f227087h;
            if (str7 != null) {
                e17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f227088i;
            return str8 != null ? e17 + b36.f.j(6, str8) : e17;
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.q0 q0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.q0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                q0Var.f227083d = aVar2.c(intValue);
                return 0;
            case 2:
                q0Var.f227084e = aVar2.k(intValue);
                return 0;
            case 3:
                q0Var.f227085f = aVar2.k(intValue);
                return 0;
            case 4:
                q0Var.f227086g = aVar2.g(intValue);
                return 0;
            case 5:
                q0Var.f227087h = aVar2.k(intValue);
                return 0;
            case 6:
                q0Var.f227088i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
