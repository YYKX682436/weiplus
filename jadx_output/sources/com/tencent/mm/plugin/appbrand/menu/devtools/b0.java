package com.tencent.mm.plugin.appbrand.menu.devtools;

/* loaded from: classes.dex */
public final class b0 implements nh1.b {
    @Override // nh1.b
    public void a(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.page.n7 pageView = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pageView, "pageView");
        android.view.LayoutInflater.from(context);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, false);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        new java.util.ArrayList();
        com.tencent.mm.plugin.appbrand.menu.devtools.x xVar = com.tencent.mm.plugin.appbrand.menu.devtools.x.f85940d;
        com.tencent.mm.plugin.appbrand.menu.devtools.z zVar = new com.tencent.mm.plugin.appbrand.menu.devtools.z(this, context);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            db5.h4 h4Var = (db5.h4) ((android.view.MenuItem) it.next());
            h4Var.f228381y = null;
            h4Var.f228382z = null;
        }
        arrayList.clear();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        db5.h4 h4Var2 = new db5.h4(context, 0, 0);
        h4Var2.f228376t = com.tencent.mm.R.string.f490036du0;
        arrayList2.add(h4Var2);
        db5.h4 h4Var3 = new db5.h4(context, 1, 0);
        h4Var3.f228376t = com.tencent.mm.R.string.n7w;
        arrayList2.add(h4Var3);
        if (arrayList2.size() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMSubMenuHelper", "show, menu empty");
            return;
        }
        k0Var.f211872n = xVar;
        k0Var.f211881s = zVar;
        k0Var.f211854d = null;
        k0Var.G = null;
        k0Var.v();
    }

    @Override // nh1.b
    public java.lang.String b(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.page.n7 pageView = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pageView, "pageView");
        java.lang.String string = context.getString(com.tencent.mm.R.string.n87);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // nh1.b
    public boolean c(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.page.n7 pageView = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pageView, "pageView");
        int i17 = hx5.c.f285706a;
        if (!ix5.h.f295631b.e()) {
            return false;
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        return z65.c.a();
    }
}
