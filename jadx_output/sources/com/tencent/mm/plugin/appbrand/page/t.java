package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class t extends com.tencent.mm.plugin.appbrand.page.td {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class[] f87102a = {al1.b.class, al1.n.class, zl1.t.class, com.tencent.mm.plugin.appbrand.widget.tabbar.AppBrandTabBarItem.class};

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Class[] f87103b = {mi1.h.class, al1.l.class, com.tencent.mm.plugin.appbrand.ui.c9.class};

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.page.s f87104c = new com.tencent.mm.plugin.appbrand.page.s();

    @Override // com.tencent.mm.plugin.appbrand.page.ud
    public android.view.View a(android.content.Context context, java.lang.Class clazz) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(clazz, "clazz");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.System.currentTimeMillis();
        android.view.View a17 = this.f87104c.a(clazz, b(context, clazz));
        if (a17 == null) {
            a17 = super.a(b(context, clazz), clazz);
        }
        java.lang.System.currentTimeMillis();
        return a17;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.ud
    public android.content.Context b(android.content.Context originalContext, java.lang.Class clazz) {
        android.content.Context a17;
        kotlin.jvm.internal.o.g(originalContext, "originalContext");
        kotlin.jvm.internal.o.g(clazz, "clazz");
        if (kotlin.jvm.internal.o.b(mi1.i.class, clazz)) {
            com.tencent.mm.plugin.appbrand.ui.ed edVar = (com.tencent.mm.plugin.appbrand.ui.ed) com.tencent.mm.plugin.appbrand.ui.ed.f89692e.get();
            edVar.setTheme(com.tencent.mm.plugin.appbrand.ui.ja.a(false));
            return edVar;
        }
        java.lang.ThreadLocal threadLocal = com.tencent.mm.plugin.appbrand.ui.s5.f90201a;
        boolean booleanValue = com.tencent.mm.sdk.platformtools.x2.n() ? false : ((java.lang.Boolean) com.tencent.mm.plugin.appbrand.ui.s5.f90201a.get()).booleanValue();
        java.lang.Class[] clsArr = this.f87102a;
        if (booleanValue) {
            if (c(clsArr, clazz)) {
                a17 = com.tencent.mm.plugin.appbrand.page.u.b(originalContext, false);
            }
            a17 = originalContext;
        } else if (com.tencent.mm.sdk.platformtools.x2.n()) {
            if (c(clsArr, clazz)) {
                a17 = com.tencent.mm.plugin.appbrand.page.u.a(originalContext);
            }
            a17 = originalContext;
        } else {
            if (c(clsArr, clazz)) {
                a17 = com.tencent.mm.plugin.appbrand.page.u.a(originalContext);
            }
            a17 = originalContext;
        }
        if (c(this.f87103b, clazz)) {
            a17 = com.tencent.mm.plugin.appbrand.page.u.a(a17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDecorWidgetFactoryWC", "getFactoryContextForWidget: clazz [%s] adapted density [%f] original density [%f]", clazz.getCanonicalName(), java.lang.Float.valueOf(a17.getResources().getDisplayMetrics().density), java.lang.Float.valueOf(originalContext.getResources().getDisplayMetrics().density));
        return a17;
    }

    public final boolean c(java.lang.Object[] objArr, java.lang.Object obj) {
        for (java.lang.Object obj2 : objArr) {
            if (kotlin.jvm.internal.o.b(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public final void d(java.lang.Class clazz) {
        kotlin.jvm.internal.o.g(clazz, "clazz");
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.view.View a17 = super.a(b(context, clazz), clazz);
        if (a17 == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.page.s sVar = this.f87104c;
        sVar.getClass();
        java.util.HashMap hashMap = sVar.f87069a;
        if (((java.util.LinkedList) hashMap.get(clazz)) == null) {
            hashMap.put(clazz, new java.util.LinkedList());
        }
        java.lang.Object obj = hashMap.get(clazz);
        kotlin.jvm.internal.o.d(obj);
        ((java.util.LinkedList) obj).addLast(a17);
    }
}
