package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class y3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.h4 f79796d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f79797e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.entity.o f79798f;

    public y3(com.tencent.mm.plugin.appbrand.jsapi.auth.h4 h4Var, com.tencent.mm.plugin.appbrand.y yVar, com.tencent.mm.plugin.appbrand.jsapi.auth.entity.o oVar) {
        this.f79796d = h4Var;
        this.f79797e = yVar;
        this.f79798f = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/jsapi/auth/JsApiOperateWXData2$ActionUserPrompt$perform$2$1$4$presenter$1$enableAddNewAvatarListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.jsapi.auth.h4 h4Var = this.f79796d;
        android.app.Activity H = h4Var.f79570d.H(this.f79797e);
        if (H == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/jsapi/auth/JsApiOperateWXData2$ActionUserPrompt$perform$2$1$4$presenter$1$enableAddNewAvatarListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.String appId = h4Var.f79571e.f81013b.getAppId();
        kotlin.jvm.internal.o.f(appId, "getAppId(...)");
        this.f79798f.a(H, appId);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/jsapi/auth/JsApiOperateWXData2$ActionUserPrompt$perform$2$1$4$presenter$1$enableAddNewAvatarListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
