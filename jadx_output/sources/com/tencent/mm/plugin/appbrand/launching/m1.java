package com.tencent.mm.plugin.appbrand.launching;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class m1 implements com.tencent.mm.ipcinvoker.j {
    private m1() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.ipcinvoker.r rVar2;
        com.tencent.mm.ipcinvoker.r rVar3;
        com.tencent.mm.ipcinvoker.r rVar4;
        com.tencent.mm.ipcinvoker.r rVar5;
        com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareParams appBrandPrepareTask$PrepareParams = (com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareParams) obj;
        if (appBrandPrepareTask$PrepareParams == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandPrepareTask", "PrepareCall invoke NULL input");
            if (rVar != null) {
                com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareResult appBrandPrepareTask$PrepareResult = new com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareResult();
                appBrandPrepareTask$PrepareResult.f84385d = com.tencent.mm.plugin.appbrand.launching.o1.EVENT_PREPARE_DONE;
                appBrandPrepareTask$PrepareResult.f84387f = null;
                appBrandPrepareTask$PrepareResult.f84386e = null;
                appBrandPrepareTask$PrepareResult.f84388g = null;
                rVar.a(appBrandPrepareTask$PrepareResult);
                return;
            }
            return;
        }
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = appBrandPrepareTask$PrepareParams.f84382f;
        java.lang.String str = appBrandInitConfigWC.f47278x;
        java.lang.String str2 = appBrandInitConfigWC.f77278d;
        int i17 = appBrandInitConfigWC.f77281g;
        int i18 = appBrandPrepareTask$PrepareParams.f84383g.f87790f;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPrepareTask", "PrepareCall#invoke username[%s] appId[%s]", str, str2);
        com.tencent.mm.plugin.appbrand.launching.j1 j1Var = new com.tencent.mm.plugin.appbrand.launching.j1(this, rVar, str2, appBrandPrepareTask$PrepareParams, i17, str);
        com.tencent.mm.plugin.appbrand.launching.x2 k17 = com.tencent.mm.plugin.appbrand.launching.x2.k(appBrandPrepareTask$PrepareParams.f84382f.f47277w, true);
        if (k17 == null) {
            com.tencent.mm.plugin.appbrand.launching.x2 x2Var = new com.tencent.mm.plugin.appbrand.launching.x2(appBrandPrepareTask$PrepareParams.f84380d, appBrandPrepareTask$PrepareParams.f84382f, appBrandPrepareTask$PrepareParams.f84383g, appBrandPrepareTask$PrepareParams.f84384h);
            com.tencent.mm.plugin.appbrand.launching.l1 l1Var = new com.tencent.mm.plugin.appbrand.launching.l1(this, str, str2, rVar, x2Var, i17, i18, appBrandPrepareTask$PrepareParams);
            if (gm0.j1.i().f273208a.f273299d) {
                l1Var.b();
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPrepareTask", "prepareCall kernel startup not done yet, wait for it, username[%s] appId[%s]", str, str2);
                gm0.z1 z1Var = gm0.j1.i().f273208a;
                z1Var.a(z1Var.f273302g, l1Var);
            }
            k17 = x2Var;
        } else {
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC2 = appBrandPrepareTask$PrepareParams.f84382f;
            com.tencent.mm.plugin.appbrand.c6.b(22, str2, appBrandInitConfigWC2.L, i17, appBrandInitConfigWC2.f47284z);
            long j17 = k17.f85370o;
            if (j17 > 0 && rVar != null) {
                com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareResult appBrandPrepareTask$PrepareResult2 = new com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareResult();
                appBrandPrepareTask$PrepareResult2.f84385d = com.tencent.mm.plugin.appbrand.launching.o1.EVENT_NEED_DOWNLOAD;
                appBrandPrepareTask$PrepareResult2.f84390i = j17;
                rVar.a(appBrandPrepareTask$PrepareResult2);
            }
        }
        k17.f85365h = j1Var;
        if (k17.A1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "setCallback, username[%s] appId[%s], invoke onFallbackBackupWxaAttrsRequested", k17.f85374q, k17.f85375r);
            j1Var.b();
            return;
        }
        if (k17.B1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "setCallback, username[%s], appId[%s], invoke notifyAppRestartOnLaunchRequested", k17.f85374q, k17.f85375r);
            j1Var.C();
            return;
        }
        if (k17.f85366i && k17.f85369n != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "[applaunch][ILaunchWxaAppInfoNotify] setResultCallback already done %s %d, errorAction=%s, sessionId:%s, instanceId:%s", k17.f85375r, java.lang.Integer.valueOf(k17.f85376s), k17.f85369n.a(1), k17.f85384y, k17.f85361d);
            k17.i(k17.f85369n);
            k17.e("setCallback");
            k17.c("setCallback");
        }
        if (k17.f85386y1 && (rVar5 = ((com.tencent.mm.plugin.appbrand.launching.j1) k17.f85365h).f84681d) != null) {
            com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareResult appBrandPrepareTask$PrepareResult3 = new com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareResult();
            appBrandPrepareTask$PrepareResult3.f84385d = com.tencent.mm.plugin.appbrand.launching.o1.EVENT_ON_SYNC_JSAPIINFO_START;
            rVar5.a(appBrandPrepareTask$PrepareResult3);
        }
        if (k17.f85388z1 && (rVar4 = ((com.tencent.mm.plugin.appbrand.launching.j1) k17.f85365h).f84681d) != null) {
            com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareResult appBrandPrepareTask$PrepareResult4 = new com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareResult();
            appBrandPrepareTask$PrepareResult4.f84385d = com.tencent.mm.plugin.appbrand.launching.o1.EVENT_ON_SYNC_APPID_ABTEST_INFO_START;
            rVar4.a(appBrandPrepareTask$PrepareResult4);
        }
        if (k17.f85368m && k17.f85365h != null && (rVar3 = ((com.tencent.mm.plugin.appbrand.launching.j1) k17.f85365h).f84681d) != null) {
            com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareResult appBrandPrepareTask$PrepareResult5 = new com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareResult();
            appBrandPrepareTask$PrepareResult5.f84389h = 100;
            appBrandPrepareTask$PrepareResult5.f84385d = com.tencent.mm.plugin.appbrand.launching.o1.EVENT_DOWNLOAD_PROGRESS;
            rVar3.a(appBrandPrepareTask$PrepareResult5);
        }
        if (k17.f85367l1 != null && k17.f85367l1.booleanValue() && (rVar2 = ((com.tencent.mm.plugin.appbrand.launching.j1) k17.f85365h).f84681d) != null) {
            com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareResult appBrandPrepareTask$PrepareResult6 = new com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareResult();
            appBrandPrepareTask$PrepareResult6.f84385d = com.tencent.mm.plugin.appbrand.launching.o1.EVENT_ON_SYNC_LAUNCH_START;
            rVar2.a(appBrandPrepareTask$PrepareResult6);
        }
        k17.f();
    }
}
