package com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5;

/* renamed from: com.tencent.luggage.sdk.jsapi.component.service.n$$d */
/* loaded from: classes7.dex */
public final /* synthetic */ class C3928x328cb6 implements android.webkit.ValueCallback {
    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(java.lang.Object obj) {
        com.p314xaae8f345.p425x1ea3c036.p447x80def495.wxa.C3955x2d990bfe c3955x2d990bfe = (com.p314xaae8f345.p425x1ea3c036.p447x80def495.wxa.C3955x2d990bfe) ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.z) obj);
        c3955x2d990bfe.f129243f = true;
        synchronized (c3955x2d990bfe.f129246i) {
            while (!c3955x2d990bfe.f129246i.isEmpty()) {
                java.lang.Runnable runnable = (java.lang.Runnable) c3955x2d990bfe.f129246i.pollFirst();
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }
}
