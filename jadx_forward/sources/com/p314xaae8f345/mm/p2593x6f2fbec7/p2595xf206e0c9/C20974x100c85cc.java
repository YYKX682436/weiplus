package com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9;

/* renamed from: com.tencent.mm.sandbox.updater.UpdaterService */
/* loaded from: classes11.dex */
public class C20974x100c85cc extends com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5 {

    /* renamed from: p, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.C20974x100c85cc f273864p = null;

    /* renamed from: q, reason: collision with root package name */
    public static long f273865q = 1800000;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f273866i = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public boolean f273867m = false;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f273868n = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new s65.y0(this), true);

    /* renamed from: o, reason: collision with root package name */
    public s65.a1 f273869o = null;

    @Override // com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5
    public java.lang.String b() {
        return "MicroMsg.XWeb.MM.UpdaterService";
    }

    @Override // com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5
    public android.os.IBinder c(android.content.Intent intent) {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5
    public void d() {
        super.d();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XWeb.MM.UpdaterService", "onCreate");
        q65.d.a(hashCode(), this);
        f273864p = this;
        java.util.Map map = this.f273866i;
        ((java.util.HashMap) map).put(0, s65.w0.f485058a);
        s65.d1 d1Var = s65.c1.f484971a;
        ((java.util.HashMap) map).put(4, d1Var);
        ((java.util.HashMap) map).put(5, d1Var);
        ((java.util.HashMap) map).put(6, d1Var);
        ((java.util.HashMap) map).put(7, d1Var);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf.m78472x26f04c88(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f273868n;
        long j17 = f273865q;
        b4Var.c(j17, j17);
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction(io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28751x907cc752.f71926x1a5a11be);
        s65.a1 a1Var = new s65.a1();
        this.f273869o = a1Var;
        this.f274739f.registerReceiver(a1Var, intentFilter);
    }

    @Override // com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5
    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XWeb.MM.UpdaterService", "onDestroy");
        this.f273868n.d();
        s65.a1 a1Var = this.f273869o;
        if (a1Var != null) {
            try {
                this.f274739f.unregisterReceiver(a1Var);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.XWeb.MM.UpdaterService", "unregisterReceiver(UpdaterService.ConnectivityReceiver) exception = %s", e17.getMessage());
            }
        }
        if (this.f273867m) {
            this.f274739f.stopForeground(true);
        }
        java.util.HashMap hashMap = (java.util.HashMap) this.f273866i;
        java.util.Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((s65.w) it.next()).mo163944xac79a11b();
        }
        hashMap.clear();
        f273864p = null;
        q65.d.b(hashCode(), this);
        super.e();
    }

    @Override // com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5
    public void f(android.content.Intent intent, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XWeb.MM.UpdaterService", "onStart intent = %s", intent);
        j(intent);
    }

    @Override // com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5
    public int g(android.content.Intent intent, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XWeb.MM.UpdaterService", "onStartCommand intent = %s", intent);
        if (intent != null && intent.getBooleanExtra("intent_extra_run_in_foreground", false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XWeb.MM.UpdaterService", "runServiceInForground");
            android.app.PendingIntent service = android.app.PendingIntent.getService(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 0, new android.content.Intent(), fp.g0.a(0));
            z2.k0 k0Var = new z2.k0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "reminder_channel_id");
            k0Var.m("updater service running forground");
            k0Var.D.when = java.lang.System.currentTimeMillis();
            k0Var.f("Updater Service");
            k0Var.e("updater service running forground");
            k0Var.f550996g = service;
            this.f274739f.startForeground(0, k0Var.b());
            this.f273867m = true;
        }
        j(intent);
        return 2;
    }

    public final boolean i() {
        java.util.Map map = this.f273866i;
        if (((java.util.HashMap) map).size() > 0) {
            java.util.Iterator it = ((java.util.HashMap) map).values().iterator();
            while (it.hasNext()) {
                if (((s65.w) it.next()).d()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XWeb.MM.UpdaterService", "checkAndTryStopSelf, dont stop, some download mgr still busy");
                    return false;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XWeb.MM.UpdaterService", "checkAndTryStopSelf, UpdaterService killed self");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new s65.z0(this), com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
        return true;
    }

    public final void j(android.content.Intent intent) {
        if (intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("intent_extra_download_type", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XWeb.MM.UpdaterService", "handleCommand, downloadType = %d", java.lang.Integer.valueOf(intExtra));
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sandbox_pss_opt_v2, 1) == 1) {
            if (intExtra == 1 || intExtra == 4 || intExtra == 7) {
                f273865q = 300000L;
            } else {
                f273865q = 1800000L;
            }
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f273868n;
        b4Var.d();
        long j17 = f273865q;
        b4Var.c(j17, j17);
        f273865q = 1800000L;
        s65.w wVar = (s65.w) ((java.util.HashMap) this.f273866i).get(java.lang.Integer.valueOf(intExtra));
        if (wVar != null) {
            boolean e17 = wVar.e(intent);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XWeb.MM.UpdaterService", "handleCommand ret = %b", java.lang.Boolean.valueOf(e17));
            if (e17) {
                return;
            }
            i();
        }
    }
}
