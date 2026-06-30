package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

@j95.b(m140513x1e06fd29 = {com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11577xd02dca59.class})
/* loaded from: classes7.dex */
public final class t2 extends i95.w implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k6 {
    public void Ai(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.j6 j6Var) {
        if (!(str2 == null || str2.length() == 0)) {
            str = str2;
        }
        if (!(str == null || str.length() == 0)) {
            ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Di(str, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.w0(str, j6Var, i17, str3, context));
        } else if (j6Var != null) {
            j6Var.mo52612x57429edc(-1, "Invalid username");
        }
    }

    public boolean Bi() {
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.j0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.j0.class)) == null) {
            return false;
        }
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.e4.g();
    }

    public void wi(android.content.Context context, int i17, boolean z17) {
        if (!z17) {
            z17 = ek1.a.c();
        }
        android.content.Context context2 = context == null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a : context;
        android.content.Intent intent = new android.content.Intent(context2, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12645x113db0da.class);
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        android.content.Intent addFlags = intent.putExtra("extra_start_activity_click_timestamp_ms", java.lang.System.currentTimeMillis()).putExtra("extra_enter_scene", i17).putExtra("extra_show_recommend", z17).addFlags(context instanceof android.app.Activity ? 0 : 268435456);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(addFlags);
        java.util.Collections.reverse(arrayList);
        android.content.Context context3 = context2;
        yj0.a.d(context3, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/app/ExportUILauncher", "openLauncherUI", "(Landroid/content/Context;IZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context3, "com/tencent/mm/plugin/appbrand/app/ExportUILauncher", "openLauncherUI", "(Landroid/content/Context;IZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
