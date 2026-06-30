package com.tencent.mm.plugin.appbrand.media.record;

/* loaded from: classes10.dex */
public class f implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        if (com.tencent.mm.plugin.appbrand.media.record.h.f85811c) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Record.AppBrandRecordClientService", "update device info done!");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.AppBrandRecordClientService", "to do update device info!");
        com.tencent.mm.plugin.appbrand.media.record.h.f85811c = true;
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, null, com.tencent.mm.plugin.appbrand.media.record.g.class);
        if (iPCString == null || (str = iPCString.f68406d) == null) {
            return;
        }
        wo.v1.a(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.AppBrandRecordClientService", "update device info success!");
    }
}
