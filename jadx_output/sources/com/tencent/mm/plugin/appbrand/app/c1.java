package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes7.dex */
public class c1 implements com.tencent.mars.cdn.CronetLogic.IGetHostIps {

    /* renamed from: a, reason: collision with root package name */
    public static com.tencent.mm.plugin.appbrand.app.c1 f75029a;

    @Override // com.tencent.mars.cdn.CronetLogic.IGetHostIps
    public java.lang.String[] getNewDnsIps(java.lang.String str) {
        android.os.Bundle bundle = (android.os.Bundle) com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(str), com.tencent.mm.plugin.appbrand.app.d1.class);
        if (bundle == null) {
            return null;
        }
        return bundle.getStringArray("NEW_DNS_IP");
    }
}
