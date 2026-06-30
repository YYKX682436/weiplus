package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public class ya implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.d0 f83940a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f83941b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.za f83942c;

    public ya(com.tencent.mm.plugin.appbrand.jsapi.za zaVar, com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, int i17) {
        this.f83942c = zaVar;
        this.f83940a = d0Var;
        this.f83941b = i17;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPhoneBindCardEntry", "on Activity result: %s", java.lang.Integer.valueOf(i18));
        com.tencent.mm.plugin.appbrand.jsapi.za zaVar = this.f83942c;
        if (i17 != zaVar.f83953g) {
            return false;
        }
        int i19 = this.f83941b;
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = this.f83940a;
        if (i18 == -1) {
            d0Var.a(i19, zaVar.o("ok"));
        } else if (i18 == 0) {
            d0Var.a(i19, zaVar.o("cancel"));
        } else {
            d0Var.a(i19, zaVar.o("fail"));
            if (!h45.y.c()) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14954, h45.y.f278968a, "phoneBindCardEntry:fail");
            }
        }
        if (h45.y.c()) {
            return true;
        }
        h45.y.f278968a = null;
        return true;
    }
}
