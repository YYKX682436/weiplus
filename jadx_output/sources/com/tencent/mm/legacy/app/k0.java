package com.tencent.mm.legacy.app;

/* loaded from: classes12.dex */
public class k0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.legacy.app.WeChatSplashStartup f68504a;

    public k0(com.tencent.mm.legacy.app.WeChatSplashStartup weChatSplashStartup) {
        this.f68504a = weChatSplashStartup;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.util.ArrayList arrayList = com.tencent.mm.splash.j.f193660s.f193686a;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            long[] jArr = (long[]) it.next();
            com.tencent.mars.xlog.Log.i("MicroMsg.WeChatSplashStartup", "splash %s, %s, %s", java.lang.Long.valueOf(jArr[0]), java.lang.Long.valueOf(jArr[1]), java.lang.Long.valueOf(jArr[2]));
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(jArr[0], jArr[1], jArr[2], false);
        }
        java.util.ArrayList arrayList2 = com.tencent.mm.splash.j.f193660s.f193687b;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("processName", this.f68504a.f68487b);
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            java.lang.String str = (java.lang.String) it6.next();
            com.tencent.mars.xlog.Log.i("MicroMsg.WeChatSplashStartup", "splash message %s", str);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.i("NewSplash", str, hashMap);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WeChatSplashStartup", "report splash info %s %s", java.lang.Integer.valueOf(arrayList.size()), java.lang.Integer.valueOf(arrayList2.size()));
        return null;
    }
}
