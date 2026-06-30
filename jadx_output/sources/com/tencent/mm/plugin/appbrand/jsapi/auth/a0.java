package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes11.dex */
public final class a0 implements com.tencent.mm.plugin.appbrand.jsapi.auth.w {
    public a0(kotlin.jvm.internal.i iVar) {
    }

    public final void a(java.lang.String str, com.tencent.mm.plugin.appbrand.jsapi.auth.b0 b0Var) {
        if (!(str == null || str.length() == 0)) {
            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            if (!com.tencent.mm.modelavatar.d1.Ai().o(str, false)) {
                ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                com.tencent.mm.modelavatar.m0 m0Var = new com.tencent.mm.modelavatar.m0();
                m0Var.a(str, new com.tencent.mm.plugin.appbrand.jsapi.auth.z(m0Var, b0Var, str));
                return;
            }
        }
        if (b0Var != null) {
            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.tencent.mm.modelavatar.z Ai = com.tencent.mm.modelavatar.d1.Ai();
            if (str == null) {
                str = "";
            }
            b0Var.a(Ai.j(str, false));
        }
    }
}
