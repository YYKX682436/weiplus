package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class i1 implements bi4.l1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.j1 f81296a;

    public i1(com.tencent.mm.plugin.appbrand.jsapi.j1 j1Var) {
        this.f81296a = j1Var;
    }

    @Override // bi4.l1
    public final void onFinishAction(int i17, java.lang.String str, pj4.r0 r0Var) {
        java.lang.String string;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiSetTextStatus", "setTextStatusWithCallback result = " + i17 + ", errMsg = " + str + ", info = " + r0Var);
        if (i17 == 0) {
            ft.e eVar = (ft.e) i95.n0.c(ft.e.class);
            string = this.f81296a.getString(com.tencent.mm.R.string.f490556yf);
            kotlin.jvm.internal.o.f(string, "access$getString(...)");
            eVar.m7(new com.tencent.mm.plugin.appbrand.ipc.AppBrandShowToastEvent(com.tencent.mm.R.raw.icons_outlined_done, string));
        }
    }
}
