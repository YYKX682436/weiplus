package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036;

/* loaded from: classes8.dex */
public class u implements dp1.x {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 f264156d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Intent f264157e;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var) {
        android.content.Intent intent = new android.content.Intent();
        this.f264157e = intent;
        this.f264156d = e0Var;
        intent.putExtras(e0Var.f488190n);
    }

    @Override // dp1.x
    public android.view.ViewGroup a() {
        return d() ? (android.view.ViewGroup) mo50327x19263085().getWindow().getDecorView() : (android.view.ViewGroup) this.f264156d.f488187h.getParent();
    }

    @Override // dp1.x
    public int b() {
        return d() ? -1 : 0;
    }

    @Override // dp1.x
    public boolean c() {
        return true;
    }

    public final boolean d() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("useActivityEnv: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var = this.f264156d;
        sb6.append(((sd.u) e0Var.f488145f).f488186a.f488196d.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageFloatBallPageAdapter", sb6.toString());
        return ((sd.u) e0Var.f488145f).f488186a.f488196d.size() <= 1;
    }

    @Override // dp1.x
    public boolean f() {
        return false;
    }

    @Override // dp1.x
    public void g(dp1.v vVar) {
    }

    @Override // dp1.x
    /* renamed from: getActivity */
    public android.app.Activity mo50327x19263085() {
        return (android.app.Activity) this.f264156d.f488143d;
    }

    @Override // dp1.x
    /* renamed from: getBitmap */
    public android.graphics.Bitmap mo50328x12501425() {
        return uj5.g.c(mo50329xc2a54588());
    }

    @Override // dp1.x
    /* renamed from: getContentView */
    public android.view.View mo50329xc2a54588() {
        if (!d()) {
            return ((me.p3333x31613f.p3334x38f758b.lib.C29141x858f5ab) this.f264156d.f488187h).m147195xb42a7cc();
        }
        if (((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) mo50327x19263085()).m78735x28280f95() != null) {
            return ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) mo50327x19263085()).m78735x28280f95().m81444x1eccc7b7();
        }
        return null;
    }

    @Override // dp1.x
    /* renamed from: getIntent */
    public android.content.Intent mo54480x1e885992() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var = this.f264156d;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e0Var.t());
        android.content.Intent intent = this.f264157e;
        if (!K0) {
            intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, e0Var.t());
        }
        return intent;
    }

    @Override // dp1.x
    /* renamed from: getMaskView */
    public android.view.View mo50330x8c409d27() {
        return mo50329xc2a54588();
    }

    @Override // dp1.x
    public boolean h() {
        return false;
    }

    @Override // dp1.x
    public boolean i() {
        return false;
    }

    @Override // dp1.x
    public void j(dp1.w wVar) {
        if (d()) {
            db5.f.c(mo50327x19263085(), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.t(this, wVar));
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.z) wVar).a(true);
        }
    }

    @Override // dp1.x
    public boolean k() {
        return false;
    }

    @Override // dp1.x
    public void l(int i17) {
    }

    @Override // dp1.x
    public android.graphics.Bitmap n() {
        return null;
    }

    @Override // dp1.x
    public int o() {
        if (a() != null) {
            return a().getHeight();
        }
        return 0;
    }

    @Override // dp1.x
    public boolean p() {
        return false;
    }

    @Override // dp1.x
    public void q(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var = this.f264156d;
        if (((sd.u) e0Var.f488145f).f488186a.f(false)) {
            return;
        }
        android.app.Activity activity = (android.app.Activity) e0Var.f488143d;
        if (z17) {
            activity.getIntent().putExtra("MMActivity.OverrideExitAnimation", com.p314xaae8f345.mm.R.C30854x2dc211.f559381d6);
            activity.getIntent().putExtra("MMActivity.OverrideEnterAnimation", com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
        } else {
            activity.getIntent().putExtra("MMActivity.OverrideExitAnimation", 0);
            activity.getIntent().putExtra("MMActivity.OverrideEnterAnimation", 0);
        }
        activity.finish();
    }

    @Override // dp1.x
    public boolean r() {
        return true;
    }

    @Override // dp1.x
    public android.view.View s() {
        return null;
    }

    @Override // dp1.x
    public boolean t() {
        ((ov.p0) ((pv.j0) i95.n0.c(pv.j0.class))).getClass();
        return (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2553xb81dc63e.C20566xca5347a5()) == 0) && this.f264156d.f488187h != null;
    }

    @Override // dp1.x
    public android.view.View u() {
        return null;
    }

    @Override // dp1.x
    public int v() {
        if (a() != null) {
            return a().getWidth();
        }
        return 0;
    }
}
