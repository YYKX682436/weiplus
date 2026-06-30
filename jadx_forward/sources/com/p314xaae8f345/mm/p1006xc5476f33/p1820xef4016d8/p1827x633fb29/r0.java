package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class r0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f227100d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f227101e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.r0)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.r0 r0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.r0) fVar;
        return n51.f.a(this.f227100d, r0Var.f227100d) && n51.f.a(this.f227101e, r0Var.f227101e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f227100d;
            if (str != null) {
                fVar.j(46, str);
            }
            java.lang.String str2 = this.f227101e;
            if (str2 != null) {
                fVar.j(47, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f227100d;
            int j17 = str3 != null ? 0 + b36.f.j(46, str3) : 0;
            java.lang.String str4 = this.f227101e;
            return str4 != null ? j17 + b36.f.j(47, str4) : j17;
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.r0 r0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.r0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 46) {
            r0Var.f227100d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 47) {
            return -1;
        }
        r0Var.f227101e = aVar2.k(intValue);
        return 0;
    }
}
