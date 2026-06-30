package tn4;

/* loaded from: classes11.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f502365d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f502366e;

    public k(tn4.o oVar, boolean z17, boolean z18) {
        this.f502365d = z17;
        this.f502366e = z18;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f502366e;
        boolean z18 = this.f502365d;
        if (z18) {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1429L, 38L, 1L, false);
                ((wv.e0) ((xv.l0) i95.n0.c(xv.l0.class))).getClass();
                w73.f.h(261, 4);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Updater.PluginUpdater", "parse tabconfig failed: %s", e17.getMessage());
            }
        }
        org.json.JSONObject f17 = y73.p.f(c83.e.g(c83.e.i(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)));
        if (f17 == null) {
            return;
        }
        java.lang.String string = f17.getString("clientVersion");
        java.lang.String string2 = f17.getString("cdnUrl");
        java.lang.String string3 = f17.getString("fileMd5");
        int i17 = f17.getInt("fileSize");
        boolean z19 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_upgrade_force_stop_tinker_xpatch_update, 0) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.PluginUpdater", "checkMMdiffUpdatePatchPkgVersion, clientVersion = %s, cdnUrl = %s, fileMd5 = %s, fileSize = %s, onlyShowNewRedDot = %s, isForceStopTinkerXpatchMerge = %s.", string, string2, string3, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z19));
        if (z19) {
            return;
        }
        try {
            int i18 = f17.getInt("packageType");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string3) && i17 != 0) {
                int e18 = y73.p.e();
                int parseInt = java.lang.Integer.parseInt(string.substring(2), 16);
                int i19 = o45.wf.f424562g;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.PluginUpdater", "xKeyTargetApk = %s, mmdiffTargetVersion = %s, currentApkClientVersionCode = %s, hasManualUpdaterTabRedDot = %s, packageType = %s.", java.lang.Integer.valueOf(e18), java.lang.Integer.valueOf(parseInt), java.lang.Integer.valueOf(i19), java.lang.Boolean.valueOf(((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).nj()), java.lang.Integer.valueOf(i18));
                if (parseInt > i19 && parseInt >= e18) {
                    if (z17) {
                        ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).vj(parseInt);
                    }
                    if (z18) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1429L, 42L, 1L, false);
                        ((wv.e0) ((xv.l0) i95.n0.c(xv.l0.class))).getClass();
                        w73.f.h(264, 4);
                    }
                    if (i18 == 2) {
                        tn4.o oVar = (tn4.o) ((un4.e) i95.n0.c(un4.e.class));
                        oVar.getClass();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.PluginUpdater", "autoCheckUpdate %s", 5);
                        gm0.j1.d().g(new z73.g(oVar.hj(), oVar.ij(), z73.h.c(), true));
                    }
                    ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
                    bk0.a.g().r(262145, false);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1429L, 37L, 1L, false);
                }
            }
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Updater.PluginUpdater", "e = " + e19 + ", packageType = -1");
        }
    }
}
