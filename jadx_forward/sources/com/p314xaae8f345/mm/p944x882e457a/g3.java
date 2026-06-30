package com.p314xaae8f345.mm.p944x882e457a;

/* loaded from: classes7.dex */
public final class g3 implements im5.a, com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.e3 f152173d;

    public g3(com.p314xaae8f345.mm.p944x882e457a.e3 e3Var) {
        this.f152173d = e3Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p944x882e457a.e3 e3Var = this.f152173d;
        if (e3Var != null) {
            return e3Var.mo1034xf5bc2045(i17, i18, str, oVar, m1Var);
        }
        return -100000;
    }

    @Override // im5.a
    /* renamed from: dead */
    public void mo10668x2efc64() {
        this.f152173d = null;
    }
}
