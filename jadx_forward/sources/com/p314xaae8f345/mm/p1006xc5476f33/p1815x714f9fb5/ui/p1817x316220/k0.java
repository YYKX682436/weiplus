package com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220;

/* loaded from: classes15.dex */
public class k0 implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.p0 f226370d;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.p0 p0Var) {
        this.f226370d = p0Var;
    }

    @Override // i11.c
    /* renamed from: onGetLocation */
    public boolean mo630x9b865cc(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        if (!z17) {
            return false;
        }
        if (d17 >= 4.0d) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.p0 p0Var = this.f226370d;
            za3.i1 i1Var = p0Var.X;
            if (!i1Var.f552484i) {
                i1Var.f552489n = false;
                i1Var.d(true);
                p0Var.T.setSelected(false);
            }
        }
        return true;
    }
}
