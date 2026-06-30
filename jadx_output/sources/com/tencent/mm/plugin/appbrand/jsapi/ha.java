package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public class ha implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f81284a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.d0 f81285b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f81286c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.ia f81287d;

    public ha(com.tencent.mm.plugin.appbrand.jsapi.ia iaVar, android.app.Activity activity, com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, int i17) {
        this.f81287d = iaVar;
        this.f81284a = activity;
        this.f81285b = d0Var;
        this.f81286c = i17;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.appbrand.jsapi.ia iaVar = this.f81287d;
        if (i17 != iaVar.f81312g) {
            return false;
        }
        int i19 = this.f81286c;
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = this.f81285b;
        if (i18 == -1) {
            new android.content.Intent().putExtra("key_mode", 1);
            j45.l.h(this.f81284a, "wallet", ".balance.ui.lqt.WalletLqtPlanBeforeHomeUI");
            d0Var.a(i19, iaVar.o("ok"));
        } else {
            d0Var.a(i19, iaVar.o("fail"));
            if (!h45.y.c()) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14954, h45.y.f278968a, "openWCPayLQTDepositPlan:fail");
            }
        }
        if (!h45.y.c()) {
            h45.y.f278968a = null;
        }
        return true;
    }
}
