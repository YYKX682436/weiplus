package c42;

@j95.b
/* loaded from: classes13.dex */
public class l extends i95.w implements c42.i {

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashMap f119916e;

    /* renamed from: d, reason: collision with root package name */
    public final x51.k0[] f119917d = {null};

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f119916e = hashMap;
        hashMap.put(1209385830, new c42.j());
        hashMap.put(-575865227, new c42.k());
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
    }

    public final void Ai() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            int h17 = gm0.j1.a() ? gm0.j1.b().h() : gm0.m.i();
            boolean z18 = false;
            if (h17 != 0) {
                j62.e.g().getClass();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("WxExptConfig");
                if (M != null) {
                    M.putInt("expt_uin", h17);
                    z18 = true;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginExpt", "save uin to mmkv uin[%d] save[%b] cost[%d]", java.lang.Integer.valueOf(h17), java.lang.Boolean.valueOf(z18), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        }
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        super.mo204xfac946a6(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginExpt", "Plugin expt onAccountInitialized [%d] [%d]", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(h62.d.vj().hashCode()));
        Ai();
        java.util.HashMap hashMap = k62.a.f386059a;
        k62.a.f386059a.clear();
        if (z65.c.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExptServiceShell", "setup");
            k62.a.f386060b.mo48813x58998cd();
        }
        i62.i iVar = i62.i.f370481a;
        bm5.f1.a();
        i62.i.f370485e.m43071x58998cd();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getBoolean("expt_set_expt_device_info", false)) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putString("expt_manufacturer", android.os.Build.MANUFACTURER);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putString("expt_model", wo.w0.m());
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putInt("expt_osapi", android.os.Build.VERSION.SDK_INT);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putBoolean("expt_set_expt_device_info", true);
                return;
            }
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getString("expt_manufacturer", "");
            java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getString("expt_model", "");
            int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getInt("expt_osapi", 0);
            java.lang.String str = android.os.Build.MANUFACTURER;
            java.lang.String m17 = wo.w0.m();
            int i18 = android.os.Build.VERSION.SDK_INT;
            boolean z17 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, string) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(string2, m17) && i17 == i18) ? false : true;
            if (z17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putString("expt_manufacturer", str);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putString("expt_model", wo.w0.m());
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putInt("expt_osapi", i18);
                new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6148xb97faa8c().e();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginExpt", "checkIsDeviceInfoChange [%b] manufacturer[%s] model[%s] osApi[%d] manufacturerFromMMKV[%s] modelFromMMKV[%s] osApiFromMMKV[%d]", java.lang.Boolean.valueOf(z17), str, m17, java.lang.Integer.valueOf(i18), string, string2, java.lang.Integer.valueOf(i17));
        }
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        boolean z17;
        super.mo836xb8969aab(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginExpt", "Plugin expt onAccountRelease [%d] [%d]", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(h62.d.vj().hashCode()));
        i62.i.f370485e.m43072x2efc64();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            j62.e.g().getClass();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("WxExptConfig");
            if (M != null) {
                M.putInt("expt_uin", 0);
                z17 = true;
            } else {
                z17 = false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginExpt", "reset uin to mmkv uin[%d] save[%b] cost[%d]", 0, java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        }
        synchronized (this.f119917d) {
            x51.k0 k0Var = this.f119917d[0];
            if (k0Var != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginExpt", "[+] close db, dataDB: %s", k0Var);
                k0Var.W(hashCode());
                this.f119917d[0] = null;
            }
        }
        h62.d vj6 = h62.d.vj();
        synchronized (vj6.f360717d) {
            vj6.f360717d[0] = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExptService", "closeDB, set exptStorage to null.");
        }
        synchronized (vj6.f360718e) {
            vj6.f360718e[0] = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExptService", "closeDB, set exptKeyMapIdStorage to null.");
        }
        p3325xe03a0797.p3326xc267989b.z0.e(((d52.n) d52.d.a().f308064a).f308078b, null, 1, null);
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        super.mo8845x3e5a77bb(context);
        Ai();
        android.app.Application a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.i.a();
        if (a17 != null) {
            a17.registerActivityLifecycleCallbacks(g62.b.wi());
        }
        try {
            a52.f.a(a17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PluginExpt", th6, "[-] Unexpected exception.", new java.lang.Object[0]);
        }
        i62.i iVar = i62.i.f370481a;
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f.f39356x93b55b9 = i62.d.f370475b;
    }

    public x51.k0 wi() {
        if (!gm0.j1.a()) {
            return null;
        }
        x51.k0[] k0VarArr = this.f119917d;
        if (k0VarArr[0] == null) {
            synchronized (k0VarArr) {
                if (this.f119917d[0] == null) {
                    this.f119917d[0] = x51.l0.a(hashCode(), gm0.j1.u().h() + "WxExpt.db", f119916e, true, true);
                }
            }
        }
        return this.f119917d[0];
    }
}
