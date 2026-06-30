package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* loaded from: classes10.dex */
public class o1 implements qk.y7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.a2 f230912a;

    public o1(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.a2 a2Var) {
        this.f230912a = a2Var;
    }

    @Override // qk.y7
    public void a(qk.g6 g6Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightVideoEditor", "photoEditor [onSelectedFeature] features:%s", g6Var.name());
        if (g6Var == qk.g6.CROP_VIDEO) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.a2.a(this.f230912a, true);
        }
    }

    @Override // qk.y7
    public void b(qk.g6 g6Var, int i17, java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightVideoEditor", "photoEditor [onSelectedDetailFeature] features:%s index:%s", g6Var.name(), java.lang.Integer.valueOf(i17));
    }

    @Override // qk.y7
    public void c(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.a2 a2Var = this.f230912a;
        if (z17) {
            a2Var.f230807j.mo26063x7b383410();
        } else {
            a2Var.f230807j.mo53060x36654fab(a2Var.f230806i);
        }
    }
}
