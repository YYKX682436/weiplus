package com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae;

/* loaded from: classes12.dex */
public class u implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p957x53236a1b.h1 f175331d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f175332e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f175333f;

    public u(com.p314xaae8f345.mm.p957x53236a1b.h1 h1Var, android.app.Activity activity, java.lang.Runnable runnable) {
        this.f175331d = h1Var;
        this.f175332e = activity;
        this.f175333f = runnable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (this.f175331d != m1Var) {
            return;
        }
        c01.d9.e().q(1200, this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXBizLogic", "dealWithHandleScanResult translateLink: errType = %d; errCode = %d; errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        android.app.Activity activity = this.f175332e;
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXBizLogic", "dealWithHandleScanResult: translate failed");
            com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.a(activity);
            return;
        }
        r45.zp6 zp6Var = (r45.zp6) ((com.p314xaae8f345.mm.p957x53236a1b.h1) m1Var).f152870e.f152244b.f152233a;
        java.lang.String str2 = zp6Var == null ? null : zp6Var.f473817f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXBizLogic", "dealWithHandleScanResult respUriStr=%s", str2);
        try {
            android.net.Uri parse = android.net.Uri.parse(str2);
            if (parse == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXBizLogic", "dealWithHandleScanResult: respUri null");
                com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.a(activity);
                return;
            }
            java.lang.String queryParameter = parse.getQueryParameter("result");
            if (queryParameter == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXBizLogic", "dealWithHandleScanResult: no result from TranslateLink resp");
                java.util.Objects.requireNonNull(activity);
                activity.runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.RunnableC12950x35bb4c(activity));
                return;
            }
            java.lang.String decode = java.net.URLDecoder.decode(queryParameter);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXBizLogic", "dealWithHandleScanResult: result=%s", decode);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5292x67f91197 c5292x67f91197 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5292x67f91197();
            am.r3 r3Var = c5292x67f91197.f135612g;
            r3Var.f89314b = activity;
            r3Var.f89313a = decode;
            r3Var.f89315c = 19;
            r3Var.f89319g = 3;
            r3Var.f89321i = 42;
            r3Var.f89320h = parse.getQueryParameter("appid");
            r3Var.f89324l = activity.getIntent().getBundleExtra("_stat_obj");
            c5292x67f91197.e();
            java.lang.Runnable runnable = this.f175333f;
            if (runnable != null) {
                runnable.run();
            }
            final p012xc85e97e9.p093xedfae76a.y yVar = activity instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) activity : com.p314xaae8f345.mm.app.a0.f134821d;
            new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5751x758c1063>(yVar) { // from class: com.tencent.mm.plugin.base.stub.WXBizLogic$1$1
                {
                    this.f39173x3fe91575 = 1280295539;
                }

                @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
                /* renamed from: callback */
                public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5751x758c1063 c5751x758c1063) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5751x758c1063 c5751x758c10632 = c5751x758c1063;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.u uVar = com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.u.this;
                    android.app.Activity activity2 = uVar.f175332e;
                    am.kl klVar = c5751x758c10632.f136072g;
                    if (activity2 != klVar.f88700b) {
                        return false;
                    }
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(klVar.f88701c);
                    am.kl klVar2 = c5751x758c10632.f136072g;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXBizLogic", "dealWithHandleScanResult: NotifyDealQBarStrResultEvent.callback(%d, %s)", valueOf, klVar2.f88702d);
                    int i19 = klVar2.f88701c;
                    if (i19 != 0 && i19 != 1 && i19 != 2 && i19 != 3) {
                        return false;
                    }
                    android.app.Activity activity3 = uVar.f175332e;
                    java.util.Objects.requireNonNull(activity3);
                    activity3.runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.RunnableC12950x35bb4c(activity3));
                    mo48814x2efc64();
                    return false;
                }
            }.mo48813x58998cd();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXBizLogic", "dealWithHandleScanResult: respUri parse exp=%s", e17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.a(activity);
        }
    }
}
