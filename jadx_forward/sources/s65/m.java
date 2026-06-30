package s65;

/* loaded from: classes11.dex */
public class m implements s65.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20972xfb8eac1c f485025a;

    public m(com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20972xfb8eac1c activityC20972xfb8eac1c) {
        this.f485025a = activityC20972xfb8eac1c;
    }

    @Override // s65.n0
    public void a(int i17, int i18) {
        int i19 = (int) (i17 <= 0 ? 0L : (i18 * 100) / i17);
        com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20972xfb8eac1c activityC20972xfb8eac1c = this.f485025a;
        if (i19 == 100) {
            activityC20972xfb8eac1c.f273851f.setText(activityC20972xfb8eac1c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k3b));
            return;
        }
        activityC20972xfb8eac1c.f273851f.setText(activityC20972xfb8eac1c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k3_) + i19 + "%");
    }

    @Override // s65.n0
    public void b() {
        com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20972xfb8eac1c activityC20972xfb8eac1c = this.f485025a;
        if (activityC20972xfb8eac1c.isFinishing()) {
            return;
        }
        activityC20972xfb8eac1c.f273851f.setText(com.p314xaae8f345.mm.R.C30867xcad56011.k3_);
        activityC20972xfb8eac1c.f273851f.setEnabled(false);
    }

    @Override // s65.n0
    public void c(java.lang.String str) {
        com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20972xfb8eac1c activityC20972xfb8eac1c = this.f485025a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = activityC20972xfb8eac1c.f273850e;
        if (j0Var != null) {
            j0Var.dismiss();
        }
        if (activityC20972xfb8eac1c.isFinishing() || str == null) {
            return;
        }
        activityC20972xfb8eac1c.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.mo68477x336bdfd8(405L, 70L, 1L, true);
        if (activityC20972xfb8eac1c.f273852g.f485080u) {
            g0Var.mo68477x336bdfd8(614L, 50L, 1L, false);
        }
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new s65.s(activityC20972xfb8eac1c, str), 300L);
        activityC20972xfb8eac1c.f273851f.setEnabled(false);
    }

    @Override // s65.n0
    public void f() {
        com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20972xfb8eac1c activityC20972xfb8eac1c = this.f485025a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = activityC20972xfb8eac1c.f273850e;
        if (j0Var != null) {
            j0Var.dismiss();
        }
        if (activityC20972xfb8eac1c.isFinishing()) {
            return;
        }
        activityC20972xfb8eac1c.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(405L, 66L, 1L, true);
        db5.e1.G(activityC20972xfb8eac1c, activityC20972xfb8eac1c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k3f), activityC20972xfb8eac1c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), true, new s65.v(activityC20972xfb8eac1c)).setOnCancelListener(new s65.h(activityC20972xfb8eac1c));
    }

    @Override // s65.n0
    public void h(com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.l lVar) {
        com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20972xfb8eac1c activityC20972xfb8eac1c = this.f485025a;
        if (activityC20972xfb8eac1c.isFinishing()) {
            return;
        }
        if (!(lVar instanceof s65.g0)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(405L, 69L, 1L, true);
            db5.e1.n(activityC20972xfb8eac1c, com.p314xaae8f345.mm.R.C30867xcad56011.k38, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, new s65.f(this), new s65.g(this));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.mo68477x336bdfd8(405L, 67L, 1L, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppUpdaterUI", "download package from cdn error. switch to webserver");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = activityC20972xfb8eac1c.f273850e;
        if (j0Var != null) {
            j0Var.t(activityC20972xfb8eac1c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fdz, activityC20972xfb8eac1c.f273852g.f485068i, activityC20972xfb8eac1c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k37), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(activityC20972xfb8eac1c.f273852g.f485071l)));
        }
        if (activityC20972xfb8eac1c.f273852g.f485075p) {
            g0Var.mo68477x336bdfd8(405L, 68L, 1L, true);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 G = db5.e1.G(activityC20972xfb8eac1c, activityC20972xfb8eac1c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fdy, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(activityC20972xfb8eac1c.f273852g.f485071l)), activityC20972xfb8eac1c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), true, new s65.t(activityC20972xfb8eac1c, lVar));
            G.setOnCancelListener(new s65.u(activityC20972xfb8eac1c));
            G.setCanceledOnTouchOutside(false);
        }
    }

    @Override // s65.n0
    public void i() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppUpdaterUI", "no sdcard.");
        com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20972xfb8eac1c activityC20972xfb8eac1c = this.f485025a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = activityC20972xfb8eac1c.f273850e;
        if (j0Var != null) {
            j0Var.dismiss();
        }
        if (activityC20972xfb8eac1c.isFinishing()) {
            return;
        }
        com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20972xfb8eac1c.P6(activityC20972xfb8eac1c);
    }
}
