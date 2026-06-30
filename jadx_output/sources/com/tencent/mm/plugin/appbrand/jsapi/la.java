package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public class la implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f81368a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f81369b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f81370c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.d0 f81371d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f81372e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.na f81373f;

    public la(com.tencent.mm.plugin.appbrand.jsapi.na naVar, int i17, int i18, android.app.Activity activity, com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, int i19) {
        this.f81373f = naVar;
        this.f81368a = i17;
        this.f81369b = i18;
        this.f81370c = activity;
        this.f81371d = d0Var;
        this.f81372e = i19;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.appbrand.jsapi.na naVar = this.f81373f;
        if (i17 != naVar.f82382g) {
            return false;
        }
        int i19 = this.f81372e;
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = this.f81371d;
        if (i18 == -1) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("key_account_type", 1);
            int i27 = this.f81368a;
            android.app.Activity activity = this.f81370c;
            if (i27 == 1) {
                intent2.putExtra("show_open_toast", this.f81369b);
                j45.l.j(activity, "wallet", ".balance.ui.lqt.WalletLqtBalanceAutoTransferUI", intent2, null);
            } else {
                if (!((com.tencent.mm.ipcinvoker.type.IPCBoolean) com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193053a, new android.os.Bundle(), com.tencent.mm.plugin.appbrand.jsapi.ma.class)).f68400d) {
                    j45.l.j(activity, "wallet", ".balance.ui.lqt.WalletLqtDetailUI", intent2, null);
                }
            }
            d0Var.a(i19, naVar.o("ok"));
        } else {
            d0Var.a(i19, naVar.o("fail"));
            if (!h45.y.c()) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14954, h45.y.f278968a, "JsApiOpenWCPayLQTDetail:fail");
            }
        }
        if (!h45.y.c()) {
            h45.y.f278968a = null;
        }
        return true;
    }
}
