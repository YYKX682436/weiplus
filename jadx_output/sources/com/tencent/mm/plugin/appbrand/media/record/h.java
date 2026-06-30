package com.tencent.mm.plugin.appbrand.media.record;

/* loaded from: classes15.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f85809a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.ArrayList f85810b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public static boolean f85811c = false;

    public static void a(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.media.record.l lVar;
        com.tencent.mm.sdk.event.IListener iListener;
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.AppBrandRecordClientService", "onDestroy destroyAppId:%s", str);
        java.util.ArrayList arrayList = f85810b;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            if (str2.equalsIgnoreCase(str) && (iListener = (com.tencent.mm.sdk.event.IListener) ((java.util.HashMap) f85809a).remove(str2)) != null) {
                iListener.dead();
            }
        }
        arrayList.remove(str);
        com.tencent.mm.plugin.appbrand.media.record.a0 g17 = com.tencent.mm.plugin.appbrand.media.record.a0.g();
        com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam recordParam = g17.f85782d;
        java.lang.String str3 = (recordParam == null || com.tencent.mm.sdk.platformtools.t8.K0(recordParam.f85844p)) ? "" : g17.f85782d.f85844p;
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordMgr", "destroy currentAppId:%s, appId:%s", str3, str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str3) || !str.equalsIgnoreCase(str3)) {
            return;
        }
        com.tencent.mm.plugin.appbrand.media.record.z zVar = g17.f85783e;
        if (zVar == com.tencent.mm.plugin.appbrand.media.record.z.START || zVar == com.tencent.mm.plugin.appbrand.media.record.z.RESUME || zVar == com.tencent.mm.plugin.appbrand.media.record.z.ERROR) {
            g17.m();
        }
        if (g17.f85794p) {
            com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam recordParam2 = g17.f85782d;
            if (recordParam2 != null && (lVar = recordParam2.f85846r) != null) {
                com.tencent.mm.plugin.appbrand.media.record.i0 i0Var = (com.tencent.mm.plugin.appbrand.media.record.i0) lVar;
                i0Var.f85812a = null;
                if (i0Var.f85816e) {
                    i0Var.f85816e = false;
                    if (i0Var.f85815d == null) {
                        i0Var.f85815d = new com.tencent.mm.plugin.appbrand.media.record.AudioRecordVoIPInterruptListener$StopInterruptEventListenTask();
                    }
                    i0Var.f85815d.s();
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Record.AudioRecordVoIPInterruptListener", "not start listen");
                }
            }
            g17.f85794p = false;
        }
    }
}
