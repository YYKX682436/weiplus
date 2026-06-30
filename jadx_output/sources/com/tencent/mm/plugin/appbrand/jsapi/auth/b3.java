package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public class b3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ui1.z f79414d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.f3 f79415e;

    public b3(com.tencent.mm.plugin.appbrand.jsapi.auth.f3 f3Var, ui1.z zVar) {
        this.f79415e = f3Var;
        this.f79414d = zVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/jsapi/auth/JsApiOperateWXData$OperateWXDataTask$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.jsapi.auth.f3 f3Var = this.f79415e;
        com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask jsApiOperateWXData$OperateWXDataTask = f3Var.f79538e;
        com.tencent.mm.plugin.appbrand.y yVar = jsApiOperateWXData$OperateWXDataTask.f79377g;
        this.f79414d.h(yVar, jsApiOperateWXData$OperateWXDataTask.M, (com.tencent.mm.plugin.appbrand.jsapi.r1) yVar.q(com.tencent.mm.plugin.appbrand.jsapi.r1.class)).r(f3Var.f79538e.f79377g);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/jsapi/auth/JsApiOperateWXData$OperateWXDataTask$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
