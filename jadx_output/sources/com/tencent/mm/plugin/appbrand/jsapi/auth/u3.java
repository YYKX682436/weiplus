package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class u3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ui1.z f79750d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f79751e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.c4 f79752f;

    public u3(ui1.z zVar, com.tencent.mm.plugin.appbrand.y yVar, com.tencent.mm.plugin.appbrand.jsapi.auth.c4 c4Var) {
        this.f79750d = zVar;
        this.f79751e = yVar;
        this.f79752f = c4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/jsapi/auth/JsApiOperateWXData2$ActionUserPrompt$perform$2$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.i7 i7Var = this.f79752f.f79426e.f381026r;
        kotlin.jvm.internal.o.d(i7Var);
        java.lang.String str = i7Var.f376774e;
        com.tencent.mm.plugin.appbrand.y yVar = this.f79751e;
        this.f79750d.h(yVar, str, (com.tencent.mm.plugin.appbrand.jsapi.r1) yVar.q(com.tencent.mm.plugin.appbrand.jsapi.r1.class)).r(yVar);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/jsapi/auth/JsApiOperateWXData2$ActionUserPrompt$perform$2$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
