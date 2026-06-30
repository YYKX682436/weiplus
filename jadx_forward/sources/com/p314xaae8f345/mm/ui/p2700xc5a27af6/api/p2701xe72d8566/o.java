package com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566;

/* loaded from: classes8.dex */
public final class o implements com.p314xaae8f345.mm.sdk.p2603x2137b148.f7 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.p f290068d;

    public o(com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.p pVar) {
        this.f290068d = pVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.p pVar = this.f290068d;
        for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) pVar.f290074a).entrySet()) {
            java.lang.String callbackProcess = (java.lang.String) entry.getKey();
            if (((java.lang.Number) entry.getValue()).intValue() > 0) {
                pVar.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callbackProcess, "callbackProcess");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotService", "IPCControllerImpl invokeCallback, callbackProcess: ".concat(callbackProcess));
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, str);
                bundle.putLong("dateAdded", j17);
                bundle.putBoolean("isPending", z17);
                com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(callbackProcess, bundle, com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.r.class, null);
            }
        }
    }
}
