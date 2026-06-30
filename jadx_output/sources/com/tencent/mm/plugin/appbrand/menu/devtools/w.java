package com.tencent.mm.plugin.appbrand.menu.devtools;

/* loaded from: classes7.dex */
public final class w implements nh1.b {
    public static final void d(com.tencent.mm.plugin.appbrand.menu.devtools.w wVar, android.content.Context context, com.tencent.mm.plugin.appbrand.page.n7 n7Var, int i17, java.lang.String str) {
        wVar.getClass();
        com.tencent.mm.sdk.platformtools.o4 o4Var = k91.d1.f305561a;
        k91.d1.f305561a.putInt(str + "_FrameCaptureMode", i17);
        d75.b.g(new com.tencent.mm.plugin.appbrand.menu.devtools.r(context, n7Var));
    }

    @Override // nh1.b
    public void a(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        ce.g gVar;
        int i17;
        com.tencent.mm.plugin.appbrand.page.n7 pageView = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pageView, "pageView");
        if (str == null) {
            return;
        }
        com.tencent.mm.sdk.platformtools.o4 o4Var = k91.d1.f305561a;
        int i18 = k91.d1.f305561a.getInt(str.concat("_FrameCaptureMode"), 0);
        boolean c17 = com.tencent.mm.plugin.appbrand.AppBrandRuntimeWCAccessible.c(pageView);
        if (i18 == 0) {
            android.view.LayoutInflater.from(context);
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, false);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            new java.util.ArrayList();
            com.tencent.mm.plugin.appbrand.menu.devtools.s sVar = new com.tencent.mm.plugin.appbrand.menu.devtools.s(c17);
            com.tencent.mm.plugin.appbrand.menu.devtools.t tVar = new com.tencent.mm.plugin.appbrand.menu.devtools.t(this, context, pageView, str);
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                db5.h4 h4Var = (db5.h4) ((android.view.MenuItem) it.next());
                h4Var.f228381y = null;
                h4Var.f228382z = null;
            }
            arrayList.clear();
            db5.g4 g4Var = new db5.g4(context);
            sVar.onCreateMMMenu(g4Var);
            if (g4Var.z()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MMSubMenuHelper", "show, menu empty");
                return;
            }
            k0Var.f211872n = sVar;
            k0Var.f211881s = tVar;
            k0Var.f211854d = null;
            k0Var.G = null;
            k0Var.v();
            return;
        }
        ae.r rVar = (ae.r) pageView.U1().z1(ae.r.class);
        if (rVar == null || (gVar = (ce.g) pageView.B1(ce.g.class)) == null) {
            return;
        }
        if (c17) {
            com.tencent.magicbrush.ui.MagicBrushView magicBrushView = ((ce.o) gVar).f40686g;
            if (magicBrushView == null) {
                return;
            } else {
                i17 = magicBrushView.getCanvasId();
            }
        } else {
            i17 = 0;
        }
        int h17 = rVar.h();
        android.view.LayoutInflater.from(context);
        com.tencent.mm.ui.widget.dialog.k0 k0Var2 = new com.tencent.mm.ui.widget.dialog.k0(context, 1, false);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        new java.util.ArrayList();
        com.tencent.mm.plugin.appbrand.menu.devtools.u uVar = new com.tencent.mm.plugin.appbrand.menu.devtools.u(c17, h17);
        com.tencent.mm.plugin.appbrand.menu.devtools.v vVar = new com.tencent.mm.plugin.appbrand.menu.devtools.v(this, context, pageView, str, rVar, gVar, i17);
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            db5.h4 h4Var2 = (db5.h4) ((android.view.MenuItem) it6.next());
            h4Var2.f228381y = null;
            h4Var2.f228382z = null;
        }
        arrayList2.clear();
        db5.g4 g4Var2 = new db5.g4(context);
        uVar.onCreateMMMenu(g4Var2);
        if (g4Var2.z()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMSubMenuHelper", "show, menu empty");
            return;
        }
        k0Var2.f211872n = uVar;
        k0Var2.f211881s = vVar;
        k0Var2.f211854d = null;
        k0Var2.G = null;
        k0Var2.v();
    }

    @Override // nh1.b
    public java.lang.String b(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.page.n7 pageView = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pageView, "pageView");
        return "Frame Capture";
    }

    @Override // nh1.b
    public boolean c(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.page.n7 pageView = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pageView, "pageView");
        int i17 = com.tencent.magicbrush.MBRuntime.f48576j;
        return false;
    }
}
