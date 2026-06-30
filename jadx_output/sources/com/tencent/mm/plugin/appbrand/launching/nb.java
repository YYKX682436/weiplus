package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public abstract class nb extends com.tencent.mm.plugin.appbrand.launching.hb {

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo f84814h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f84815i;

    /* renamed from: m, reason: collision with root package name */
    public final int f84816m;

    /* renamed from: n, reason: collision with root package name */
    public final int f84817n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.report.quality.QualitySession f84818o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.List f84819p = new java.util.LinkedList();

    public nb(java.lang.String str, int i17, int i18, java.lang.String str2, com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo wxaAttributes$WxaVersionInfo, com.tencent.mm.plugin.appbrand.report.quality.QualitySession qualitySession) {
        this.f84815i = str;
        this.f84816m = i17;
        this.f84817n = com.tencent.mm.plugin.appbrand.appcache.g0.b(i17) ? i18 : 0;
        this.f84814h = wxaAttributes$WxaVersionInfo;
        this.f84818o = qualitySession;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PrepareStepCheckAppidABTestPermissionInfo", "<init> hash:%d, appId:%s,versionType:%d", java.lang.Integer.valueOf(hashCode()), str, java.lang.Integer.valueOf(i17));
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        java.util.HashMap hashMap = new java.util.HashMap();
        com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo wxaAttributes$WxaVersionInfo = this.f84814h;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        qg1.o oVar = new qg1.o();
        oVar.f362785a = this.f84815i;
        oVar.f362786b = 1;
        oVar.f362787c = this.f84816m;
        linkedList.add(oVar);
        java.util.List list = wxaAttributes$WxaVersionInfo.f77457t;
        if (list != null && list.size() > 0) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                java.util.List<com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaPluginCodeInfo> list2 = ((com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaWidgetInfo) it.next()).f77477g;
                if (list2 != null && list2.size() > 0) {
                    for (com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaPluginCodeInfo wxaAttributes$WxaPluginCodeInfo : list2) {
                        qg1.o oVar2 = new qg1.o();
                        oVar2.f362785a = wxaAttributes$WxaPluginCodeInfo.f77433d;
                        oVar2.f362786b = 2;
                        oVar2.f362787c = !com.tencent.mm.sdk.platformtools.t8.K0(wxaAttributes$WxaPluginCodeInfo.f77440n) ? 1 : 0;
                        if (!linkedList.contains(oVar2)) {
                            linkedList.add(oVar2);
                        }
                    }
                }
            }
        }
        this.f84819p = linkedList;
        if (linkedList.size() <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PrepareStepCheckAppidABTestPermissionInfo", "call() todoChecAppidInfoList null, return, hash:%d", java.lang.Integer.valueOf(hashCode()));
            return null;
        }
        wg1.d.a(150, this.f84815i, this.f84816m, this.f84817n);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PrepareStepCheckAppidABTestPermissionInfo", "call() todoChecAppidInfoList size:%d", java.lang.Integer.valueOf(((java.util.LinkedList) this.f84819p).size()));
        com.tencent.mm.plugin.appbrand.launching.i9 Zi = com.tencent.mm.plugin.appbrand.app.r9.Zi();
        com.tencent.mm.plugin.appbrand.launching.o9 o9Var = (com.tencent.mm.plugin.appbrand.launching.o9) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.launching.o9.class);
        int i17 = this.f84817n;
        int i18 = this.f84816m;
        java.lang.String str = this.f84815i;
        boolean z17 = false;
        if (Zi == null || o9Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PrepareStepCheckAppidABTestPermissionInfo", "needSyncCheckAppidPermission storage null!");
            wg1.d.a(151, str, i18, i17);
        } else {
            java.util.List list3 = this.f84819p;
            if (list3 != null && ((java.util.LinkedList) list3).size() > 0) {
                for (qg1.o oVar3 : this.f84819p) {
                    java.lang.String str2 = oVar3.f362785a;
                    int i19 = oVar3.f362786b;
                    int i27 = oVar3.f362787c;
                    com.tencent.mars.xlog.Log.i("MicroMsg.LaunchWxaAppidABTestInfoStorage", "get, appId:%s , appType :%d, versionType: %d", str2, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
                    com.tencent.mm.plugin.appbrand.launching.n9 n9Var = new com.tencent.mm.plugin.appbrand.launching.n9();
                    n9Var.field_appId = str2;
                    n9Var.field_appType = i19;
                    n9Var.field_versionType = i27;
                    if (!o9Var.get(n9Var, new java.lang.String[0])) {
                        n9Var = null;
                    }
                    if (n9Var == null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PrepareStepCheckAppidABTestPermissionInfo", "needSyncCheckAppidPermission appidABTestInfoStorage not include appId:%s ,appType:%d!", str2, java.lang.Integer.valueOf(i19));
                        z17 = true;
                        break;
                    }
                    hashMap.put(qg1.k.s(str2, i19, i27), new com.tencent.mm.plugin.appbrand.permission.appidABTest.AppRuntimeAppidABTestPermissionBundle(n9Var.field_permissionBytes, n9Var.field_gameRewardsData));
                }
            }
            wg1.d.a(162, str, i18, i17);
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PrepareStepCheckAppidABTestPermissionInfo", "zbql:CgiWxaAppidABTestInfo async");
            lm5.d.f319601b.a(new qg1.j(new qg1.k(this.f84815i, this.f84816m, this.f84819p, false, this.f84818o, this)));
            return android.util.Pair.create(hashMap, java.lang.Boolean.FALSE);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PrepareStepCheckAppidABTestPermissionInfo", "zbql:CgiWxaAppidABTestInfo sync");
        com.tencent.mm.plugin.appbrand.launching.x2 x2Var = ((com.tencent.mm.plugin.appbrand.launching.c3) this).f84535q;
        if (x2Var.f85365h != null) {
            com.tencent.mm.ipcinvoker.r rVar = ((com.tencent.mm.plugin.appbrand.launching.j1) x2Var.f85365h).f84681d;
            if (rVar != null) {
                com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareResult appBrandPrepareTask$PrepareResult = new com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareResult();
                appBrandPrepareTask$PrepareResult.f84385d = com.tencent.mm.plugin.appbrand.launching.o1.EVENT_ON_SYNC_APPID_ABTEST_INFO_START;
                rVar.a(appBrandPrepareTask$PrepareResult);
            }
        } else {
            x2Var.f85388z1 = true;
        }
        qg1.k kVar = new qg1.k(this.f84815i, this.f84816m, this.f84819p, true, this.f84818o, this);
        kVar.f362774p = true;
        com.tencent.mm.modelbase.f a17 = com.tencent.mm.modelbase.l3.a(kVar);
        if (!th1.a.b(a17) || kVar.f362775q == null) {
            wg1.d.a(152, this.f84815i, this.f84816m, this.f84817n);
            if (a17 == null || a17.f70615a != 4) {
                wg1.d.a(154, this.f84815i, this.f84816m, this.f84817n);
            } else {
                wg1.d.a(com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_CLIP_EOS, this.f84815i, this.f84816m, this.f84817n);
            }
        } else {
            wg1.d.a(161, this.f84815i, this.f84816m, this.f84817n);
        }
        return android.util.Pair.create(kVar.f362775q, java.lang.Boolean.TRUE);
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.hb
    public java.lang.String f() {
        return "MicroMsg.AppBrand.PrepareStepCheckAppidABTestPermissionInfo";
    }
}
