package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class ic implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.jc f84674d;

    public ic(com.tencent.mm.plugin.appbrand.launching.jc jcVar) {
        this.f84674d = jcVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/launching/ShowFallbackErrorReloadUITask$handleRequest$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.launching.jc jcVar = this.f84674d;
        jcVar.closeByHomeButton = true;
        jcVar.finishProcess(null);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/launching/ShowFallbackErrorReloadUITask$handleRequest$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
