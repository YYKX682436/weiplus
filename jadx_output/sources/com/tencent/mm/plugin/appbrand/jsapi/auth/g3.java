package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public class g3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.entity.o f79564d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask f79565e;

    public g3(com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask jsApiOperateWXData$OperateWXDataTask, com.tencent.mm.plugin.appbrand.jsapi.auth.entity.o oVar) {
        this.f79565e = jsApiOperateWXData$OperateWXDataTask;
        this.f79564d = oVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/jsapi/auth/JsApiOperateWXData$OperateWXDataTask$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask jsApiOperateWXData$OperateWXDataTask = this.f79565e;
        this.f79564d.a(jsApiOperateWXData$OperateWXDataTask.f79376f.H(jsApiOperateWXData$OperateWXDataTask.f79377g), jsApiOperateWXData$OperateWXDataTask.f79397y);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/jsapi/auth/JsApiOperateWXData$OperateWXDataTask$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
