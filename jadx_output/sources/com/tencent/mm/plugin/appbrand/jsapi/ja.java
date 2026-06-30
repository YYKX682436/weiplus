package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public class ja implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f81334a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.d0 f81335b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f81336c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.ka f81337d;

    public ja(com.tencent.mm.plugin.appbrand.jsapi.ka kaVar, android.app.Activity activity, com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, int i17) {
        this.f81337d = kaVar;
        this.f81334a = activity;
        this.f81335b = d0Var;
        this.f81336c = i17;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.appbrand.jsapi.ka kaVar = this.f81337d;
        if (i17 != kaVar.f81352g) {
            return false;
        }
        int i19 = this.f81336c;
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = this.f81335b;
        if (i18 == -1) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("key_mode", 1);
            j45.l.j(this.f81334a, "wallet", ".balance.ui.lqt.WalletLqtPlanAddUI", intent2, null);
            d0Var.a(i19, kaVar.o("ok"));
        } else {
            d0Var.a(i19, kaVar.o("fail"));
            if (!h45.y.c()) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14954, h45.y.f278968a, "openWCPayLQTDepositPlanAdd:fail");
            }
        }
        if (!h45.y.c()) {
            h45.y.f278968a = null;
        }
        return true;
    }
}
