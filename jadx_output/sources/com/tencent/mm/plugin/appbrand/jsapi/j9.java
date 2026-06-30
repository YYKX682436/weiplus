package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public class j9 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f81331a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f81332b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.k9 f81333c;

    public j9(com.tencent.mm.plugin.appbrand.jsapi.k9 k9Var, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17) {
        this.f81333c = k9Var;
        this.f81331a = e9Var;
        this.f81332b = i17;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.appbrand.jsapi.k9 k9Var = this.f81333c;
        if (i17 != k9Var.f81351g) {
            return false;
        }
        int i19 = this.f81332b;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f81331a;
        if (i18 == -1) {
            e9Var.a(i19, k9Var.o("ok"));
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenCard", "view card result is ok!");
            return true;
        }
        if (i18 == 0) {
            e9Var.a(i19, k9Var.o("cancel"));
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenCard", "view card result is cancel!");
            return true;
        }
        e9Var.a(i19, k9Var.o("fail"));
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenCard", "view card result is fail!");
        return true;
    }
}
