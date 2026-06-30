package com.tencent.mm.plugin.appbrand.menu.devtools;

/* loaded from: classes7.dex */
public class p implements nh1.b {
    @Override // nh1.b
    public void a(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        java.lang.String string;
        com.tencent.mm.sdk.platformtools.o4 o4Var = k91.d1.f305561a;
        if (com.tencent.mm.sdk.platformtools.t8.K0(o4Var.getString("V8DebugFlags", ""))) {
            o4Var.putString("V8DebugFlags", "--prof_cpp");
            string = context.getString(com.tencent.mm.R.string.f490093kp);
        } else {
            o4Var.remove("V8DebugFlags");
            string = context.getString(com.tencent.mm.R.string.f490092ko);
        }
        com.tencent.mm.plugin.appbrand.app.r0.b((com.tencent.mm.plugin.appbrand.ui.AppBrandUI) context, string);
    }

    @Override // nh1.b
    public java.lang.String b(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        return (com.tencent.mm.sdk.platformtools.t8.K0(k91.d1.f305561a.getString("V8DebugFlags", "")) ? context.getString(com.tencent.mm.R.string.f490114lb) : context.getString(com.tencent.mm.R.string.f490112l9)).toString();
    }

    @Override // nh1.b
    public /* bridge */ /* synthetic */ boolean c(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        return false;
    }
}
