package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class d9 extends ze.m implements com.tencent.mm.plugin.appbrand.service.l5 {
    static {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mm.plugin.appbrand.a9 a9Var = new com.tencent.mm.plugin.appbrand.a9();
            com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE.addLifecycleCallback(a9Var);
            com.tencent.matrix.lifecycle.supervisor.AppDeepBackgroundOwner.INSTANCE.addLifecycleCallback(a9Var);
            com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner.INSTANCE.addLifecycleCallback(a9Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9(android.content.Context context) {
        super(context instanceof com.tencent.mm.plugin.appbrand.ui.z6 ? (com.tencent.mm.plugin.appbrand.ui.z6) context : com.tencent.mm.plugin.appbrand.ui.z6.b(context), com.tencent.mm.plugin.appbrand.o6.class);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public void E() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.addAll(this.f84226m);
        linkedList.addAll(((java.util.HashMap) this.f84227n).values());
        java.util.Iterator it = linkedList.iterator();
        kotlin.jvm.internal.o.f(it, "traverseAll(...)");
        while (true) {
            boolean z17 = true;
            if (!it.hasNext()) {
                break;
            }
            ze.n nVar = (ze.n) it.next();
            kotlin.jvm.internal.o.d(nVar);
            if (com.tencent.mm.plugin.appbrand.f1.a(this, nVar) && nVar.J0() && !nVar.L0() && !nVar.S) {
                java.lang.Class[] EXCLUDE_PERSISTENT_RUNTIME_CLASS = com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC.D;
                kotlin.jvm.internal.o.f(EXCLUDE_PERSISTENT_RUNTIME_CLASS, "EXCLUDE_PERSISTENT_RUNTIME_CLASS");
                if (!kz5.z.G(EXCLUDE_PERSISTENT_RUNTIME_CLASS, nVar.getClass())) {
                    com.tencent.mm.plugin.appbrand.o6 o6Var = (com.tencent.mm.plugin.appbrand.o6) nVar;
                    android.view.ViewParent parent = o6Var.f74810s.getParent();
                    android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                    if (viewGroup != null) {
                        viewGroup.removeView(o6Var.f74810s);
                    }
                    p(nVar);
                    o6Var.g3(false);
                    o6Var.o3(o6Var.u0(), com.tencent.mm.plugin.appbrand.s8.Stash);
                    if (!com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE.isBackground() && !com.tencent.matrix.lifecycle.supervisor.AppDeepBackgroundOwner.INSTANCE.isBackground() && !com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner.INSTANCE.isBackground()) {
                        z17 = false;
                    }
                    if (z17 && com.tencent.mm.sdk.platformtools.x2.n()) {
                        o6Var.K2();
                    } else {
                        com.tencent.mm.plugin.appbrand.v1.c(o6Var);
                    }
                }
            }
        }
        com.tencent.mars.xlog.Log.i("Luggage.WXA.AppBrandRuntimeContainerViewImpl", "dispatchPause tid[%d], mDestroyed[%b]", java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), java.lang.Boolean.valueOf(this.f84222f));
        this.f84221e = false;
        this.f84222f = true;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        linkedList2.addAll(this.f84226m);
        linkedList2.addAll(((java.util.HashMap) this.f84227n).values());
        u();
        java.util.Iterator it6 = linkedList2.iterator();
        while (it6.hasNext()) {
            com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = (com.tencent.mm.plugin.appbrand.AppBrandRuntime) it6.next();
            appBrandRuntime.f74817x1 = false;
            r(appBrandRuntime);
        }
        com.tencent.mars.xlog.Log.i("Luggage.WXA.AppBrandRuntimeContainerViewImpl", "performDestroy done");
    }

    public void G(java.lang.String str, org.json.JSONObject jSONObject) {
        if (str == null) {
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.addAll(this.f84226m);
        linkedList.addAll(((java.util.HashMap) this.f84227n).values());
        java.util.Iterator it = linkedList.iterator();
        kotlin.jvm.internal.o.f(it, "traverseAll(...)");
        while (it.hasNext()) {
            ze.n nVar = (ze.n) it.next();
            nVar.I1(new com.tencent.mm.plugin.appbrand.b9(nVar, str, jSONObject));
        }
    }

    public void H(l81.b1 bundle) {
        kotlin.jvm.internal.o.g(bundle, "bundle");
        java.lang.String str = bundle.f317012a;
        bundle.f317012a = str != null ? r26.n0.u0(str).toString() : null;
        java.lang.String str2 = bundle.f317014b;
        java.lang.String obj = str2 != null ? r26.n0.u0(str2).toString() : null;
        bundle.f317014b = obj;
        com.tencent.mm.plugin.appbrand.launching.g5 g5Var = com.tencent.mm.plugin.appbrand.launching.g5.f84619a;
        if (g5Var.d(obj)) {
            bundle.f317016c = 1;
        }
        if (g5Var.e()) {
            bundle.f317016c = 2;
        }
        com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel g17 = g5Var.g(bundle);
        new com.tencent.mm.plugin.appbrand.launching.AppBrandPreInitTask(getContext(), g17, new com.tencent.mm.plugin.appbrand.c9(g17, this)).H(true).I();
    }

    @Override // com.tencent.mm.plugin.appbrand.service.l5
    public android.view.View getView() {
        return this;
    }

    @Override // com.tencent.mm.plugin.appbrand.hc
    public android.content.Context h() {
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.ui.AppBrandRuntimePersistentContextWrapper");
        return com.tencent.mm.plugin.appbrand.ui.z6.b(((com.tencent.mm.plugin.appbrand.ui.z6) context).getBaseContext());
    }

    @Override // android.view.View
    public java.lang.String toString() {
        android.content.Context a17 = q75.a.a(getContext());
        if (a17 == null) {
            a17 = getContext();
        }
        return "AppBrandRuntimeWidgetImpl@" + hashCode() + '(' + a17 + ')';
    }
}
