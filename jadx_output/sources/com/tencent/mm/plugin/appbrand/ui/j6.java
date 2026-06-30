package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class j6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI f89804d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f89805e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI appBrandPreLoadingUI, java.lang.String str) {
        super(0);
        this.f89804d = appBrandPreLoadingUI;
        this.f89805e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI appBrandPreLoadingUI = this.f89804d;
        if (!appBrandPreLoadingUI.isDestroyed() && !appBrandPreLoadingUI.isFinishing()) {
            xg1.j b17 = xg1.h.f454370a.b(appBrandPreLoadingUI.f89384n);
            android.content.Intent intent = b17 != null ? b17.f454376b : null;
            if (intent == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandPreLoadingUI", "attach[" + this.f89805e + "]: onProgressLoadSuccess and get a null intent");
            } else {
                android.content.ComponentName component = intent.getComponent();
                java.lang.String className = component != null ? component.getClassName() : null;
                if (className == null) {
                    className = "null";
                }
                appBrandPreLoadingUI.f89392v = className;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onProgressLoadSuccess targetUiName:");
                sb6.append(appBrandPreLoadingUI.f89392v);
                sb6.append(", isForeground:");
                b06.d dVar = appBrandPreLoadingUI.f89383m;
                f06.v[] vVarArr = com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI.A;
                sb6.append(((java.lang.Boolean) ((b06.b) dVar).b(appBrandPreLoadingUI, vVarArr[0])).booleanValue());
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandPreLoadingUI", sb6.toString());
                if (((java.lang.Boolean) ((b06.b) dVar).b(appBrandPreLoadingUI, vVarArr[0])).booleanValue()) {
                    com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI appBrandPreLoadingUI2 = this.f89804d;
                    java.lang.Object clone = intent.clone();
                    kotlin.jvm.internal.o.e(clone, "null cannot be cast to non-null type android.content.Intent");
                    android.content.Intent intent2 = (android.content.Intent) clone;
                    intent2.setFlags(intent2.getFlags() & (-268435457));
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent2);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(appBrandPreLoadingUI2, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/AppBrandPreLoadingUI$attach$4", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    appBrandPreLoadingUI2.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(appBrandPreLoadingUI2, "com/tencent/mm/plugin/appbrand/ui/AppBrandPreLoadingUI$attach$4", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else {
                    appBrandPreLoadingUI.f89385o = intent;
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
