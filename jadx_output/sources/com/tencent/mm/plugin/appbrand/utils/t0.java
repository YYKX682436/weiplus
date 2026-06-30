package com.tencent.mm.plugin.appbrand.utils;

@j95.b
/* loaded from: classes7.dex */
public class t0 extends i95.w implements bg1.v {
    public java.lang.String wi(java.lang.String str, int i17) {
        java.lang.Boolean Bi = ((p60.u) ((p60.x) i95.n0.c(p60.x.class))).Bi(str, i17);
        kotlin.jvm.internal.o.f(Bi, "isGameLiving(...)");
        if (Bi.booleanValue()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandVoipHelper", "canJoinVOIP: is game living");
            return com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492316g11);
        }
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d, com.tencent.mm.plugin.appbrand.utils.g1.class);
        if (iPCString != null) {
            return iPCString.f68406d;
        }
        return null;
    }
}
