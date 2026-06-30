package com.tencent.mm.plugin.base.stub;

/* loaded from: classes12.dex */
public class u implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelsimple.h1 f93798d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f93799e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f93800f;

    public u(com.tencent.mm.modelsimple.h1 h1Var, android.app.Activity activity, java.lang.Runnable runnable) {
        this.f93798d = h1Var;
        this.f93799e = activity;
        this.f93800f = runnable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (this.f93798d != m1Var) {
            return;
        }
        c01.d9.e().q(1200, this);
        com.tencent.mars.xlog.Log.i("MicroMsg.WXBizLogic", "dealWithHandleScanResult translateLink: errType = %d; errCode = %d; errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        android.app.Activity activity = this.f93799e;
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WXBizLogic", "dealWithHandleScanResult: translate failed");
            com.tencent.mm.plugin.base.stub.e0.a(activity);
            return;
        }
        r45.zp6 zp6Var = (r45.zp6) ((com.tencent.mm.modelsimple.h1) m1Var).f71337e.f70711b.f70700a;
        java.lang.String str2 = zp6Var == null ? null : zp6Var.f392284f;
        com.tencent.mars.xlog.Log.i("MicroMsg.WXBizLogic", "dealWithHandleScanResult respUriStr=%s", str2);
        try {
            android.net.Uri parse = android.net.Uri.parse(str2);
            if (parse == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WXBizLogic", "dealWithHandleScanResult: respUri null");
                com.tencent.mm.plugin.base.stub.e0.a(activity);
                return;
            }
            java.lang.String queryParameter = parse.getQueryParameter("result");
            if (queryParameter == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WXBizLogic", "dealWithHandleScanResult: no result from TranslateLink resp");
                java.util.Objects.requireNonNull(activity);
                activity.runOnUiThread(new com.tencent.mm.plugin.base.stub.u$$a(activity));
                return;
            }
            java.lang.String decode = java.net.URLDecoder.decode(queryParameter);
            com.tencent.mars.xlog.Log.i("MicroMsg.WXBizLogic", "dealWithHandleScanResult: result=%s", decode);
            com.tencent.mm.autogen.events.DealQBarStrEvent dealQBarStrEvent = new com.tencent.mm.autogen.events.DealQBarStrEvent();
            am.r3 r3Var = dealQBarStrEvent.f54079g;
            r3Var.f7781b = activity;
            r3Var.f7780a = decode;
            r3Var.f7782c = 19;
            r3Var.f7786g = 3;
            r3Var.f7788i = 42;
            r3Var.f7787h = parse.getQueryParameter("appid");
            r3Var.f7791l = activity.getIntent().getBundleExtra("_stat_obj");
            dealQBarStrEvent.e();
            java.lang.Runnable runnable = this.f93800f;
            if (runnable != null) {
                runnable.run();
            }
            final androidx.lifecycle.y yVar = activity instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) activity : com.tencent.mm.app.a0.f53288d;
            new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.NotifyDealQBarStrResultEvent>(yVar) { // from class: com.tencent.mm.plugin.base.stub.WXBizLogic$1$1
                {
                    this.__eventId = 1280295539;
                }

                @Override // com.tencent.mm.sdk.event.IListener
                public boolean callback(com.tencent.mm.autogen.events.NotifyDealQBarStrResultEvent notifyDealQBarStrResultEvent) {
                    com.tencent.mm.autogen.events.NotifyDealQBarStrResultEvent notifyDealQBarStrResultEvent2 = notifyDealQBarStrResultEvent;
                    com.tencent.mm.plugin.base.stub.u uVar = com.tencent.mm.plugin.base.stub.u.this;
                    android.app.Activity activity2 = uVar.f93799e;
                    am.kl klVar = notifyDealQBarStrResultEvent2.f54539g;
                    if (activity2 != klVar.f7167b) {
                        return false;
                    }
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(klVar.f7168c);
                    am.kl klVar2 = notifyDealQBarStrResultEvent2.f54539g;
                    com.tencent.mars.xlog.Log.i("MicroMsg.WXBizLogic", "dealWithHandleScanResult: NotifyDealQBarStrResultEvent.callback(%d, %s)", valueOf, klVar2.f7169d);
                    int i19 = klVar2.f7168c;
                    if (i19 != 0 && i19 != 1 && i19 != 2 && i19 != 3) {
                        return false;
                    }
                    android.app.Activity activity3 = uVar.f93799e;
                    java.util.Objects.requireNonNull(activity3);
                    activity3.runOnUiThread(new com.tencent.mm.plugin.base.stub.u$$a(activity3));
                    dead();
                    return false;
                }
            }.alive();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXBizLogic", "dealWithHandleScanResult: respUri parse exp=%s", e17);
            com.tencent.mm.plugin.base.stub.e0.a(activity);
        }
    }
}
