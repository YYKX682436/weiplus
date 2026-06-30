package com.tencent.mm.plugin.appbrand.game.preload;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f78202a;

    static {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString;
        java.lang.String str;
        if (com.tencent.mm.sdk.platformtools.t8.K0(com.tencent.mm.plugin.appbrand.game.preload.e.f78203a)) {
            try {
                iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d, com.tencent.mm.plugin.appbrand.game.preload.d.class);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WAGameLoadingImgPathRetriever", "retrieve ipc ex = %s", e17);
                iPCString = null;
            }
            if (iPCString == null) {
                java.lang.String D = lp0.b.D();
                if (!D.endsWith("/")) {
                    D = D.concat("/");
                }
                str = D + "appbrand/loadingurl";
            } else {
                str = iPCString.f68406d;
                com.tencent.mm.plugin.appbrand.game.preload.e.f78203a = str;
            }
        } else {
            str = com.tencent.mm.plugin.appbrand.game.preload.e.f78203a;
        }
        f78202a = str;
    }
}
