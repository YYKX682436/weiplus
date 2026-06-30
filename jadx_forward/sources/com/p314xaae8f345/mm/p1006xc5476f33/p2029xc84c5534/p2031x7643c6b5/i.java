package com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5;

/* loaded from: classes8.dex */
public class i extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f239809d;

    /* renamed from: e, reason: collision with root package name */
    public int f239810e;

    /* renamed from: f, reason: collision with root package name */
    public int f239811f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f239812g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f239813h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.i)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.i iVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.i) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f239809d), java.lang.Integer.valueOf(iVar.f239809d)) && n51.f.a(java.lang.Integer.valueOf(this.f239810e), java.lang.Integer.valueOf(iVar.f239810e)) && n51.f.a(java.lang.Integer.valueOf(this.f239811f), java.lang.Integer.valueOf(iVar.f239811f)) && n51.f.a(java.lang.Boolean.valueOf(this.f239812g), java.lang.Boolean.valueOf(iVar.f239812g)) && n51.f.a(java.lang.Boolean.valueOf(this.f239813h), java.lang.Boolean.valueOf(iVar.f239813h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f239809d);
            fVar.e(2, this.f239810e);
            fVar.e(3, this.f239811f);
            fVar.a(4, this.f239812g);
            fVar.a(5, this.f239813h);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f239809d) + 0 + b36.f.e(2, this.f239810e) + b36.f.e(3, this.f239811f) + b36.f.a(4, this.f239812g) + b36.f.a(5, this.f239813h);
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
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.i iVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.i) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            iVar.f239809d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            iVar.f239810e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            iVar.f239811f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            iVar.f239812g = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        iVar.f239813h = aVar2.c(intValue);
        return 0;
    }
}
