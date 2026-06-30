package com.p314xaae8f345.mm.p2614xca6eae71;

/* loaded from: classes9.dex */
public class g1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f274792d;

    /* renamed from: e, reason: collision with root package name */
    public int f274793e;

    /* renamed from: f, reason: collision with root package name */
    public int f274794f;

    /* renamed from: g, reason: collision with root package name */
    public int f274795g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p2614xca6eae71.g1)) {
            return false;
        }
        com.p314xaae8f345.mm.p2614xca6eae71.g1 g1Var = (com.p314xaae8f345.mm.p2614xca6eae71.g1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f274792d), java.lang.Integer.valueOf(g1Var.f274792d)) && n51.f.a(java.lang.Integer.valueOf(this.f274793e), java.lang.Integer.valueOf(g1Var.f274793e)) && n51.f.a(java.lang.Integer.valueOf(this.f274794f), java.lang.Integer.valueOf(g1Var.f274794f)) && n51.f.a(java.lang.Integer.valueOf(this.f274795g), java.lang.Integer.valueOf(g1Var.f274795g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f274792d);
            fVar.e(2, this.f274793e);
            fVar.e(3, this.f274794f);
            fVar.e(4, this.f274795g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f274792d) + 0 + b36.f.e(2, this.f274793e) + b36.f.e(3, this.f274794f) + b36.f.e(4, this.f274795g);
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
        com.p314xaae8f345.mm.p2614xca6eae71.g1 g1Var = (com.p314xaae8f345.mm.p2614xca6eae71.g1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            g1Var.f274792d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            g1Var.f274793e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            g1Var.f274794f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        g1Var.f274795g = aVar2.g(intValue);
        return 0;
    }
}
