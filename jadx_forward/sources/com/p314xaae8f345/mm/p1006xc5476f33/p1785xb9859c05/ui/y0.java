package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes8.dex */
public class y0 implements com.p314xaae8f345.mm.ui.p2740x696c9db.b9 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16130xc9e2940f f224614d;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16130xc9e2940f activityC16130xc9e2940f) {
        this.f224614d = activityC16130xc9e2940f;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void H0() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void P4(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16130xc9e2940f activityC16130xc9e2940f = this.f224614d;
        activityC16130xc9e2940f.f224091p = str;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = activityC16130xc9e2940f.f224098w;
        java.lang.Runnable runnable = activityC16130xc9e2940f.f224096u;
        n3Var.mo50300x3fa464aa(runnable);
        n3Var.mo50297x7c4d7ca2(runnable, 200L);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        activityC16130xc9e2940f.f224087i.setVisibility(8);
        activityC16130xc9e2940f.f224084f.setVisibility(0);
        activityC16130xc9e2940f.f224088m.setVisibility(8);
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void V5() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12767, 1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16130xc9e2940f activityC16130xc9e2940f = this.f224614d;
        activityC16130xc9e2940f.f224087i.setVisibility(0);
        activityC16130xc9e2940f.f224084f.setVisibility(8);
        activityC16130xc9e2940f.f224088m.setVisibility(8);
        activityC16130xc9e2940f.f224097v = false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void Z2() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16130xc9e2940f activityC16130xc9e2940f = this.f224614d;
        activityC16130xc9e2940f.f224091p = "";
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = activityC16130xc9e2940f.f224098w;
        java.lang.Runnable runnable = activityC16130xc9e2940f.f224096u;
        n3Var.mo50300x3fa464aa(runnable);
        n3Var.mo50297x7c4d7ca2(runnable, 200L);
        activityC16130xc9e2940f.f224097v = true;
        activityC16130xc9e2940f.f224085g.notifyDataSetChanged();
        activityC16130xc9e2940f.f224087i.setVisibility(8);
        activityC16130xc9e2940f.f224084f.setVisibility(0);
        activityC16130xc9e2940f.f224088m.setVisibility(0);
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public boolean n5(java.lang.String str) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void v() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16130xc9e2940f activityC16130xc9e2940f = this.f224614d;
        activityC16130xc9e2940f.f224087i.setVisibility(0);
        activityC16130xc9e2940f.f224084f.setVisibility(8);
        activityC16130xc9e2940f.f224088m.setVisibility(8);
    }
}
