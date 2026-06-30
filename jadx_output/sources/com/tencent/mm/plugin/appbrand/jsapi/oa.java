package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public class oa implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f82461a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.d0 f82462b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f82463c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.pa f82464d;

    public oa(com.tencent.mm.plugin.appbrand.jsapi.pa paVar, android.app.Activity activity, com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, int i17) {
        this.f82464d = paVar;
        this.f82461a = activity;
        this.f82462b = d0Var;
        this.f82463c = i17;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.appbrand.jsapi.pa paVar = this.f82464d;
        int hashCode = paVar.hashCode() & 65535;
        int i19 = this.f82463c;
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = this.f82462b;
        if (i17 != hashCode) {
            if (i17 == (paVar.hashCode() & 65534)) {
                return false;
            }
            if (i18 == -1) {
                d0Var.a(i19, paVar.o("ok"));
            } else {
                d0Var.a(i19, paVar.o("fail"));
            }
            return true;
        }
        if (i18 == -1) {
            j45.l.n(this.f82461a, "wallet", ".balance.ui.lqt.WalletLqtBeforeSaveUI", new android.content.Intent(), paVar.hashCode() & 65534);
            d0Var.a(i19, paVar.o("ok"));
        } else {
            d0Var.a(i19, paVar.o("fail"));
            if (!h45.y.c()) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14954, h45.y.f278968a, "JsApiOpenWCPayLQTSave:fail");
            }
        }
        if (!h45.y.c()) {
            h45.y.f278968a = null;
        }
        return true;
    }
}
