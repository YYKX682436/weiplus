package com.tencent.mm.plugin.appbrand.task;

/* loaded from: classes7.dex */
public abstract class c {
    public static void a(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandCheckOnlineStatusTask", "invoke appId:%s", str);
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(""), com.tencent.mm.plugin.appbrand.task.b.class, new com.tencent.mm.plugin.appbrand.task.a(str));
    }
}
