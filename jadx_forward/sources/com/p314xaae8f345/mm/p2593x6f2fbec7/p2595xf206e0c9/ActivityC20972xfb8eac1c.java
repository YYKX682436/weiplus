package com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9;

/* renamed from: com.tencent.mm.sandbox.updater.AppUpdaterUI */
/* loaded from: classes11.dex */
public class ActivityC20972xfb8eac1c extends com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0 {

    /* renamed from: m, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20972xfb8eac1c f273849m;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f273851f;

    /* renamed from: g, reason: collision with root package name */
    public s65.x0 f273852g;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f273850e = null;

    /* renamed from: h, reason: collision with root package name */
    public final s65.n0 f273853h = new s65.m(this);

    /* renamed from: i, reason: collision with root package name */
    public final android.content.DialogInterface.OnClickListener f273854i = new s65.r(this);

    public static void O6(com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20972xfb8eac1c activityC20972xfb8eac1c, int i17) {
        activityC20972xfb8eac1c.f273852g.k();
        activityC20972xfb8eac1c.f273852g.l(i17, true);
        activityC20972xfb8eac1c.R6();
    }

    public static void P6(com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20972xfb8eac1c activityC20972xfb8eac1c) {
        activityC20972xfb8eac1c.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(405L, 65L, 1L, true);
        db5.e1.G(activityC20972xfb8eac1c, activityC20972xfb8eac1c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k3c), activityC20972xfb8eac1c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), true, new s65.i(activityC20972xfb8eac1c)).setOnCancelListener(new s65.j(activityC20972xfb8eac1c));
    }

    public static void Q6(com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20972xfb8eac1c activityC20972xfb8eac1c, int i17) {
        activityC20972xfb8eac1c.getClass();
        s65.o0.h(activityC20972xfb8eac1c, i17);
    }

    public final void R6() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = this.f273850e;
        if (j0Var != null && j0Var.isShowing()) {
            this.f273850e.dismiss();
        }
        finish();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String[] strArr;
        super.onCreate(bundle);
        q65.d.a(hashCode(), this);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf.m78472x26f04c88(this);
        com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20971xf3908b5b activityC20971xf3908b5b = com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20971xf3908b5b.f273842n;
        if (activityC20971xf3908b5b != null && !activityC20971xf3908b5b.isFinishing()) {
            finish();
            return;
        }
        com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20972xfb8eac1c activityC20972xfb8eac1c = f273849m;
        if (activityC20972xfb8eac1c != null && !activityC20972xfb8eac1c.isFinishing() && f273849m != this) {
            finish();
            return;
        }
        f273849m = this;
        setContentView(com.p314xaae8f345.mm.R.C30864xbddafb2a.a8u);
        s65.x0 x0Var = s65.w0.f485058a;
        this.f273852g = x0Var;
        if (!x0Var.o(getIntent())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppUpdaterUI", "updaterManager.handleCommand return false");
            R6();
            return;
        }
        s65.x0 x0Var2 = this.f273852g;
        if (x0Var2.f485063d == 999 && (strArr = x0Var2.f485072m) != null && strArr.length > 0) {
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new s65.p(this), 100L);
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar.f293242a = of5.b.a(this).getString(com.p314xaae8f345.mm.R.C30867xcad56011.fdx);
        aVar.A = true;
        aVar.G = new s65.q(this);
        s65.x0 x0Var3 = this.f273852g;
        java.lang.String string = (!x0Var3.f485075p || x0Var3.f485074o == null) ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.fdz, x0Var3.f485068i, getString(com.p314xaae8f345.mm.R.C30867xcad56011.k37), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(this.f273852g.f485071l)) : getString(com.p314xaae8f345.mm.R.C30867xcad56011.fdz, x0Var3.f485068i, getString(com.p314xaae8f345.mm.R.C30867xcad56011.k3a), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(this.f273852g.f485074o.f510038e));
        int i17 = this.f273852g.f485063d != 1 ? com.p314xaae8f345.mm.R.C30867xcad56011.f574949k33 : com.p314xaae8f345.mm.R.C30867xcad56011.f574952k36;
        aVar.f293262s = string;
        aVar.f293265v = of5.b.a(this).getString(com.p314xaae8f345.mm.R.C30867xcad56011.k3e);
        aVar.E = this.f273854i;
        aVar.Z = false;
        aVar.f293266w = of5.b.a(this).getString(i17);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(this, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        this.f273850e = j0Var;
        j0Var.setCanceledOnTouchOutside(false);
        this.f273851f = this.f273850e.f(-1);
        this.f273850e.getClass();
        this.f273850e.show();
        if (this.f273852g.f485077r == 1) {
            s65.o0.g(this, 5, 0);
        }
        if (this.f273852g.f485080u) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(614L, 60L, 1L, false);
        }
        s65.x0 x0Var4 = this.f273852g;
        s65.n0 n0Var = this.f273853h;
        if (n0Var == null) {
            x0Var4.getClass();
            return;
        }
        java.util.ArrayList arrayList = x0Var4.f485061b;
        if (arrayList.contains(n0Var)) {
            return;
        }
        arrayList.add(n0Var);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        q65.d.b(hashCode(), this);
        s65.x0 x0Var = this.f273852g;
        if (x0Var != null) {
            x0Var.f485061b.remove(this.f273853h);
        }
        if (f273849m == this) {
            f273849m = null;
        }
        super.onDestroy();
    }
}
