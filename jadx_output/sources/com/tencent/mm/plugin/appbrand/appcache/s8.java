package com.tencent.mm.plugin.appbrand.appcache;

@j95.b
/* loaded from: classes7.dex */
public class s8 extends i95.w {
    public final void Ai(java.lang.String str, com.tencent.mm.vfs.b7 b7Var) {
        com.tencent.mm.vfs.r6[] I;
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
        if (!r6Var.m() || !r6Var.y() || (I = r6Var.I(b7Var)) == null || I.length <= 0) {
            return;
        }
        for (com.tencent.mm.vfs.r6 r6Var2 : I) {
            com.tencent.mm.vfs.w6.f(r6Var2.u());
            com.tencent.mars.xlog.Log.i("WxaJsCacheStorage", "clear file:%s", r6Var2.getName());
        }
    }

    public void wi(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.appcache.q8 q8Var = new com.tencent.mm.plugin.appbrand.appcache.q8(this, str);
        Ai(com.tencent.mm.plugin.appbrand.jsruntime.u1.b(), q8Var);
        Ai(com.tencent.mm.plugin.appbrand.jsruntime.u1.d(), q8Var);
    }
}
