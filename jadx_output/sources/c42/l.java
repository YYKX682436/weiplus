package c42;

@j95.b
/* loaded from: classes13.dex */
public class l extends i95.w implements c42.i {

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashMap f38383e;

    /* renamed from: d, reason: collision with root package name */
    public final x51.k0[] f38384d = {null};

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f38383e = hashMap;
        hashMap.put(1209385830, new c42.j());
        hashMap.put(-575865227, new c42.k());
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
    }

    public final void Ai() {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            int h17 = gm0.j1.a() ? gm0.j1.b().h() : gm0.m.i();
            boolean z18 = false;
            if (h17 != 0) {
                j62.e.g().getClass();
                com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("WxExptConfig");
                if (M != null) {
                    M.putInt("expt_uin", h17);
                    z18 = true;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginExpt", "save uin to mmkv uin[%d] save[%b] cost[%d]", java.lang.Integer.valueOf(h17), java.lang.Boolean.valueOf(z18), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        }
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginExpt", "Plugin expt onAccountInitialized [%d] [%d]", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(h62.d.vj().hashCode()));
        Ai();
        java.util.HashMap hashMap = k62.a.f304526a;
        k62.a.f304526a.clear();
        if (z65.c.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ExptServiceShell", "setup");
            k62.a.f304527b.alive();
        }
        i62.i iVar = i62.i.f288948a;
        bm5.f1.a();
        i62.i.f288952e.alive();
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            if (!com.tencent.mm.sdk.platformtools.o4.L().getBoolean("expt_set_expt_device_info", false)) {
                com.tencent.mm.sdk.platformtools.o4.L().putString("expt_manufacturer", android.os.Build.MANUFACTURER);
                com.tencent.mm.sdk.platformtools.o4.L().putString("expt_model", wo.w0.m());
                com.tencent.mm.sdk.platformtools.o4.L().putInt("expt_osapi", android.os.Build.VERSION.SDK_INT);
                com.tencent.mm.sdk.platformtools.o4.L().putBoolean("expt_set_expt_device_info", true);
                return;
            }
            java.lang.String string = com.tencent.mm.sdk.platformtools.o4.L().getString("expt_manufacturer", "");
            java.lang.String string2 = com.tencent.mm.sdk.platformtools.o4.L().getString("expt_model", "");
            int i17 = com.tencent.mm.sdk.platformtools.o4.L().getInt("expt_osapi", 0);
            java.lang.String str = android.os.Build.MANUFACTURER;
            java.lang.String m17 = wo.w0.m();
            int i18 = android.os.Build.VERSION.SDK_INT;
            boolean z17 = (com.tencent.mm.sdk.platformtools.t8.D0(str, string) && com.tencent.mm.sdk.platformtools.t8.D0(string2, m17) && i17 == i18) ? false : true;
            if (z17) {
                com.tencent.mm.sdk.platformtools.o4.L().putString("expt_manufacturer", str);
                com.tencent.mm.sdk.platformtools.o4.L().putString("expt_model", wo.w0.m());
                com.tencent.mm.sdk.platformtools.o4.L().putInt("expt_osapi", i18);
                new com.tencent.mm.autogen.events.SystemUpgradeFromExptEvent().e();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginExpt", "checkIsDeviceInfoChange [%b] manufacturer[%s] model[%s] osApi[%d] manufacturerFromMMKV[%s] modelFromMMKV[%s] osApiFromMMKV[%d]", java.lang.Boolean.valueOf(z17), str, m17, java.lang.Integer.valueOf(i18), string, string2, java.lang.Integer.valueOf(i17));
        }
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        boolean z17;
        super.onAccountReleased(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginExpt", "Plugin expt onAccountRelease [%d] [%d]", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(h62.d.vj().hashCode()));
        i62.i.f288952e.dead();
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            j62.e.g().getClass();
            com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("WxExptConfig");
            if (M != null) {
                M.putInt("expt_uin", 0);
                z17 = true;
            } else {
                z17 = false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginExpt", "reset uin to mmkv uin[%d] save[%b] cost[%d]", 0, java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        }
        synchronized (this.f38384d) {
            x51.k0 k0Var = this.f38384d[0];
            if (k0Var != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.PluginExpt", "[+] close db, dataDB: %s", k0Var);
                k0Var.W(hashCode());
                this.f38384d[0] = null;
            }
        }
        h62.d vj6 = h62.d.vj();
        synchronized (vj6.f279184d) {
            vj6.f279184d[0] = null;
            com.tencent.mars.xlog.Log.i("MicroMsg.ExptService", "closeDB, set exptStorage to null.");
        }
        synchronized (vj6.f279185e) {
            vj6.f279185e[0] = null;
            com.tencent.mars.xlog.Log.i("MicroMsg.ExptService", "closeDB, set exptKeyMapIdStorage to null.");
        }
        kotlinx.coroutines.z0.e(((d52.n) d52.d.a().f226531a).f226545b, null, 1, null);
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        super.onCreate(context);
        Ai();
        android.app.Application a17 = com.tencent.mm.sdk.platformtools.i.a();
        if (a17 != null) {
            a17.registerActivityLifecycleCallbacks(g62.b.wi());
        }
        try {
            a52.f.a(a17);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PluginExpt", th6, "[-] Unexpected exception.", new java.lang.Object[0]);
        }
        i62.i iVar = i62.i.f288948a;
        com.tencent.mm.ui.MMFragmentActivity.aMonitor = i62.d.f288942b;
    }

    public x51.k0 wi() {
        if (!gm0.j1.a()) {
            return null;
        }
        x51.k0[] k0VarArr = this.f38384d;
        if (k0VarArr[0] == null) {
            synchronized (k0VarArr) {
                if (this.f38384d[0] == null) {
                    this.f38384d[0] = x51.l0.a(hashCode(), gm0.j1.u().h() + "WxExpt.db", f38383e, true, true);
                }
            }
        }
        return this.f38384d[0];
    }
}
