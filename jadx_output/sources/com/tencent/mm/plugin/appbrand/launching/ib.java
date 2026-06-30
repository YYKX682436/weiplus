package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public enum ib {
    ;

    public static void a(int i17, com.tencent.mm.plugin.appbrand.launching.b7 b7Var) {
        b(com.tencent.mm.sdk.platformtools.x2.f193075e.getString(i17), b7Var);
    }

    public static void b(final java.lang.String str, com.tencent.mm.plugin.appbrand.launching.b7 b7Var) {
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.PrepareQuickAccess", "toast: %s, step:%s", str, b7Var.getClass().getName());
        if (b7Var.d()) {
            com.tencent.mm.sdk.platformtools.u3.h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.launching.ib$$a
                @Override // java.lang.Runnable
                public final void run() {
                    dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, str, 0).show();
                }
            });
        }
    }

    public static com.tencent.mm.plugin.appbrand.launching.ib valueOf(java.lang.String str) {
        android.support.v4.media.f.a(java.lang.Enum.valueOf(com.tencent.mm.plugin.appbrand.launching.ib.class, str));
        return null;
    }
}
