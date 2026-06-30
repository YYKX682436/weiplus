package com.tencent.mm.plugin.brandservice.webprefetcher.debug;

/* loaded from: classes7.dex */
public abstract class b {
    public static final boolean a() {
        return com.tencent.mm.plugin.webview.core.s1.f181972a.a() && com.tencent.mm.plugin.webview.core.t1.a().getInt("debugPatchEnable", -1) == 1;
    }

    public static final java.lang.String b() {
        java.lang.String str = com.tencent.mm.pluginsdk.model.g4.b() ? com.tencent.mm.sdk.platformtools.w9.f193053a : com.tencent.mm.sdk.platformtools.w9.f193055c;
        kotlin.jvm.internal.o.d(str);
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) com.tencent.mm.ipcinvoker.f.b(str, new com.tencent.mm.ipcinvoker.type.IPCString("https://mp.weixin.qq.com/index/SetContainer"), com.tencent.mm.plugin.brandservice.webprefetcher.debug.a.f94603a);
        java.lang.String str2 = iPCString != null ? iPCString.f68406d : null;
        return str2 == null ? "" : str2;
    }

    public static final void c(java.util.HashMap headers, java.lang.String infoPrefix) {
        kotlin.jvm.internal.o.g(headers, "headers");
        kotlin.jvm.internal.o.g(infoPrefix, "infoPrefix");
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
    }
}
