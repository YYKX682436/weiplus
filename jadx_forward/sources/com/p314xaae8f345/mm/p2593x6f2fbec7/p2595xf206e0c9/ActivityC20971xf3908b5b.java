package com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9;

/* renamed from: com.tencent.mm.sandbox.updater.AppInstallerUI */
/* loaded from: classes11.dex */
public class ActivityC20971xf3908b5b extends com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0 {

    /* renamed from: n, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20971xf3908b5b f273842n;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f273845g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f273846h;

    /* renamed from: i, reason: collision with root package name */
    public int f273847i;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f273843e = null;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f273844f = null;

    /* renamed from: m, reason: collision with root package name */
    public final android.content.DialogInterface.OnClickListener f273848m = new s65.b(this);

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        q65.d.a(hashCode(), this);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf.m78472x26f04c88(this);
        com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20972xfb8eac1c activityC20972xfb8eac1c = com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20972xfb8eac1c.f273849m;
        if (activityC20972xfb8eac1c != null && !activityC20972xfb8eac1c.isFinishing()) {
            finish();
            return;
        }
        com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20971xf3908b5b activityC20971xf3908b5b = f273842n;
        if (activityC20971xf3908b5b != null && !activityC20971xf3908b5b.isFinishing() && f273842n != this) {
            finish();
            return;
        }
        f273842n = this;
        java.lang.String a17 = s65.o0.a();
        this.f273845g = a17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17) || com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.l.c(this.f273845g, false) == null) {
            finish();
            return;
        }
        this.f273846h = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) com.p314xaae8f345.mm.sdk.p2603x2137b148.SharedPreferencesC20998x2b0514dd.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "update_config_prefs", 4)).getString("update_downloaded_pack_desc_key", null);
        this.f273847i = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) com.p314xaae8f345.mm.sdk.p2603x2137b148.SharedPreferencesC20998x2b0514dd.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "update_config_prefs", 4)).getInt("update_downloaded_pack_download_mode", 0);
        setContentView(com.p314xaae8f345.mm.R.C30864xbddafb2a.a8u);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar.f293242a = of5.b.a(this).getString(com.p314xaae8f345.mm.R.C30867xcad56011.fdx);
        aVar.A = true;
        aVar.G = new s65.a(this);
        aVar.f293262s = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573678fe0, this.f273846h);
        aVar.f293265v = of5.b.a(this).getString(com.p314xaae8f345.mm.R.C30867xcad56011.g1e);
        aVar.E = this.f273848m;
        aVar.Z = false;
        aVar.f293266w = of5.b.a(this).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574949k33);
        aVar.F = null;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(this, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        this.f273843e = j0Var;
        j0Var.setCanceledOnTouchOutside(false);
        this.f273843e.show();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(405L, 71L, 1L, true);
        if (this.f273847i == 2) {
            int i17 = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) com.p314xaae8f345.mm.sdk.p2603x2137b148.SharedPreferencesC20998x2b0514dd.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "update_config_prefs", 4)).getInt("update_downloaded_cancel_times", 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdateUtil", "getIgnoreDownloadedPackTimes times %s", java.lang.Integer.valueOf(i17));
            s65.o0.g(this, 2, i17 + 1);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = this.f273843e;
        if (j0Var != null && j0Var.isShowing()) {
            this.f273843e.dismiss();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var2 = this.f273844f;
        if (j0Var2 != null && j0Var2.isShowing()) {
            this.f273844f.dismiss();
        }
        if (f273842n == this) {
            f273842n = null;
        }
        q65.d.b(hashCode(), this);
        super.onDestroy();
    }
}
