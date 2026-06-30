package com.tencent.mm.plugin.appbrand.jsapi.coverview;

/* loaded from: classes13.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.coverview.h f80683d;

    public g(com.tencent.mm.plugin.appbrand.jsapi.coverview.h hVar) {
        this.f80683d = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.coverview.h hVar = this.f80683d;
        float f17 = hVar.f80688e;
        if (f17 >= 0.5f) {
            hVar.f80687d.u(f17);
            hVar.f80687d.h();
        }
    }
}
