package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes5.dex */
public class c implements bl.c {
    @Override // bl.c
    public void loadLibrary(java.lang.String str) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        fp.d0.n(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCommonBinding", "hy: test loading %s using %d ms", str, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }
}
