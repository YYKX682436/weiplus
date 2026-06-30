package com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220;

/* loaded from: classes15.dex */
public class u2 implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.q2 f226438d;

    public u2(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.q2 q2Var) {
        this.f226438d = q2Var;
    }

    @Override // i11.c
    /* renamed from: onGetLocation */
    public boolean mo630x9b865cc(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        if (!z17) {
            return false;
        }
        double d27 = f18;
        if (d27 == 0.0d && f17 == 0.0d) {
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.q2 q2Var = this.f226438d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 c16279x64cea23 = q2Var.f226265h;
        double d28 = c16279x64cea23.f226119e;
        double d29 = c16279x64cea23.f226120f;
        c16279x64cea23.f226119e = d27;
        double d37 = f17;
        c16279x64cea23.f226120f = d37;
        u60.h hVar = new u60.h(d27, d37);
        hVar.f506406f = c16279x64cea23.f226118d;
        ((i11.g) q2Var.f226268n).b(hVar, q2Var.f226278x);
        q2Var.G = new android.location.Location("");
        q2Var.G.setLongitude(q2Var.f226265h.f226120f);
        q2Var.G.setLatitude(q2Var.f226265h.f226119e);
        this.f226438d.E(d37, d27, i17, d17);
        return true;
    }
}
