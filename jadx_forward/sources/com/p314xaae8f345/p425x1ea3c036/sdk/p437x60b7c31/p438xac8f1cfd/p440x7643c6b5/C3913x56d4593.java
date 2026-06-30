package com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5;

/* renamed from: com.tencent.luggage.sdk.jsapi.component.service.a0$$b */
/* loaded from: classes7.dex */
public final /* synthetic */ class C3913x56d4593 implements android.webkit.ValueCallback {
    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(java.lang.Object obj) {
        com.p314xaae8f345.p425x1ea3c036.p447x80def495.wxa.C3955x2d990bfe c3955x2d990bfe = (com.p314xaae8f345.p425x1ea3c036.p447x80def495.wxa.C3955x2d990bfe) ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.z) obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppServiceSkylineExtensionImpl", "dispatchDestroy " + c3955x2d990bfe.hashCode());
        c3955x2d990bfe.f129245h = true;
        com.p314xaae8f345.p2936x80def495.C25587x226dda3 c25587x226dda3 = c3955x2d990bfe.f129241d;
        com.p314xaae8f345.p2936x80def495.C25578x50634e8f.i("SkylinePreloader", "destroySkylineRuntime skylineRuntime:" + c25587x226dda3 + " preloadSkylineRuntime:" + df.c1.f310970c);
        if (c25587x226dda3 == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c25587x226dda3, df.c1.f310970c)) {
            return;
        }
        com.p314xaae8f345.p2936x80def495.C25578x50634e8f.i("SkylinePreloader", "reset");
        df.c1.f310970c = null;
        df.c1.f310971d = false;
        df.c1.f310972e = 0;
    }
}
