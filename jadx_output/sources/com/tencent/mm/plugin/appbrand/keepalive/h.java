package com.tencent.mm.plugin.appbrand.keepalive;

/* JADX INFO: Access modifiers changed from: package-private */
@mk0.a
/* loaded from: classes13.dex */
public final class h implements com.tencent.mm.ipcinvoker.j {
    private h() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.appbrand.keepalive.d dVar;
        boolean z17;
        java.lang.Class<?> cls;
        com.tencent.mm.plugin.appbrand.keepalive.e eVar = com.tencent.mm.plugin.appbrand.keepalive.e.f84088b;
        java.lang.String iPCString = ((com.tencent.mm.ipcinvoker.type.IPCString) obj).toString();
        eVar.getClass();
        if (!android.text.TextUtils.isEmpty(iPCString)) {
            synchronized (eVar.f84089a) {
                dVar = (com.tencent.mm.plugin.appbrand.keepalive.d) eVar.f84089a.get(iPCString);
                if (dVar == null) {
                    dVar = new com.tencent.mm.plugin.appbrand.keepalive.d(iPCString);
                    eVar.f84089a.put(iPCString, dVar);
                }
            }
            synchronized (dVar) {
                dVar.f84085a++;
                z17 = dVar.f84085a == 1;
            }
            if (z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandKeepAliveMMSavior.KeepAliveServiceConnector", "bindKeepAliveService, processName:%s", dVar.f84086b);
                java.lang.String str = dVar.f84086b;
                java.lang.Class<?> cls2 = null;
                try {
                    try {
                        if (android.text.TextUtils.isEmpty(str)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandKeepAliveMMSavior.KeepAliveServiceConnector", "bindKeepAliveService, processName:%s, service:%s, bindRet:%b", str, null, java.lang.Boolean.FALSE);
                        } else {
                            str = str.replaceFirst(java.util.regex.Pattern.quote(com.tencent.mm.sdk.platformtools.x2.f193072b), "");
                            cls = (java.lang.Class) com.tencent.mm.plugin.appbrand.keepalive.d.f84084d.get(str);
                            if (cls == null) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandKeepAliveMMSavior.KeepAliveServiceConnector", "bindKeepAliveService, processName:%s, service:%s, bindRet:%b", str, cls, java.lang.Boolean.FALSE);
                            } else {
                                try {
                                    android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                                    android.content.Intent intent = new android.content.Intent();
                                    intent.setClass(context, cls);
                                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandKeepAliveMMSavior.KeepAliveServiceConnector", "bindKeepAliveService, processName:%s, service:%s, bindRet:%b", str, cls, java.lang.Boolean.valueOf(context.bindService(intent, dVar.f84087c, 1)));
                                } catch (java.lang.Exception e17) {
                                    e = e17;
                                    cls2 = cls;
                                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandKeepAliveMMSavior.KeepAliveServiceConnector", "bindKeepAliveService, processName:%s, service:%s, exception:%s", str, cls2, e);
                                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandKeepAliveMMSavior.KeepAliveServiceConnector", "bindKeepAliveService, processName:%s, service:%s, bindRet:%b", str, cls2, java.lang.Boolean.FALSE);
                                    rVar.a(com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d);
                                } catch (java.lang.Throwable th6) {
                                    th = th6;
                                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandKeepAliveMMSavior.KeepAliveServiceConnector", "bindKeepAliveService, processName:%s, service:%s, bindRet:%b", str, cls, java.lang.Boolean.FALSE);
                                    throw th;
                                }
                            }
                        }
                    } catch (java.lang.Exception e18) {
                        e = e18;
                    }
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    cls = cls2;
                }
            }
        }
        try {
            rVar.a(com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d);
        } catch (java.lang.SecurityException unused) {
        }
    }
}
