package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public class c3 implements com.tencent.mm.plugin.appbrand.jsapi.auth.entity.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ui1.z f79424a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.f3 f79425b;

    public c3(com.tencent.mm.plugin.appbrand.jsapi.auth.f3 f3Var, ui1.z zVar) {
        this.f79425b = f3Var;
        this.f79424a = zVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.entity.n
    public void a(com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m mVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiOperateWXData", "[onCreateUserActionUpdate] action=" + mVar);
        this.f79425b.f79538e.f79391u = mVar.f79518d;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.entity.n
    public void b(java.util.List list) {
        this.f79424a.setSelectListItem(list);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.entity.n
    public void c(boolean z17, boolean z18, java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.appbrand.jsapi.auth.entity.o oVar) {
        com.tencent.mm.plugin.appbrand.jsapi.auth.f3 f3Var = this.f79425b;
        ui1.z zVar = this.f79424a;
        if (!z17 && !z18) {
            zVar.setFunctionButtonText(str2);
            zVar.setFunctionButtonTextColor(f3Var.f79538e.f79377g.getF147807d().getResources().getColor(com.tencent.mm.R.color.f479308vo));
            com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask jsApiOperateWXData$OperateWXDataTask = f3Var.f79538e;
            jsApiOperateWXData$OperateWXDataTask.getClass();
            zVar.setFunctionButtonOnClickListener(new com.tencent.mm.plugin.appbrand.jsapi.auth.g3(jsApiOperateWXData$OperateWXDataTask, oVar));
            return;
        }
        if (z17) {
            zVar.setFunctionButtonText("");
        } else {
            zVar.setFunctionButtonText(str);
            zVar.setFunctionButtonTextColor(f3Var.f79538e.f79377g.getF147807d().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_3));
        }
        com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask jsApiOperateWXData$OperateWXDataTask2 = f3Var.f79538e;
        com.tencent.mm.sdk.platformtools.o4 o4Var = com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask.f79374z1;
        jsApiOperateWXData$OperateWXDataTask2.getClass();
        zVar.setFunctionButtonOnClickListener(null);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.entity.n
    public java.lang.String getAppId() {
        return this.f79425b.f79538e.f79397y;
    }
}
