package com.tencent.mm.plugin.appbrand.menu;

/* loaded from: classes7.dex */
public final class a0 extends nh1.a {
    public a0() {
        super(12);
    }

    @Override // nh1.a
    public void a(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, db5.g4 g4Var, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        java.lang.String str2 = n7Var.getRuntime().u0().f47278x;
        int i17 = n7Var.getRuntime().f74805p.f77281g;
        try {
            boolean m27 = ((com.tencent.mm.plugin.appbrand.appusage.z5) i95.n0.c(com.tencent.mm.plugin.appbrand.appusage.z5.class)).m2(str2, i17);
            g4Var.h(this.f337084a, m27 ? context.getString(com.tencent.mm.R.string.f490333s2) : context.getString(com.tencent.mm.R.string.f490329ry), m27 ? com.tencent.mm.R.raw.appbrand_menu_modify_collection_remove : com.tencent.mm.R.raw.appbrand_menu_modify_collection_add, 0);
            com.tencent.mm.plugin.appbrand.m6.a(str).f85714g = m27;
        } catch (java.lang.Exception e17) {
            g4Var.removeItem(this.f337084a);
            com.tencent.mars.xlog.Log.e("MicroMsg.MenuDelegate_ModifyCollection", "attachTo, query (%s %d) e = %s", str2, java.lang.Integer.valueOf(i17), e17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00fd  */
    @Override // nh1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(android.content.Context r19, com.tencent.mm.plugin.appbrand.page.v5 r20, java.lang.String r21, com.tencent.mm.plugin.appbrand.menu.u0 r22) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.menu.a0.c(android.content.Context, com.tencent.mm.plugin.appbrand.page.v5, java.lang.String, com.tencent.mm.plugin.appbrand.menu.u0):void");
    }
}
