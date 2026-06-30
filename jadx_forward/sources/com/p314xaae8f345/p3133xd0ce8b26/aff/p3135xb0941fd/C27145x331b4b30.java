package com.p314xaae8f345.p3133xd0ce8b26.aff.p3135xb0941fd;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.wechat.aff.brand_service.ZIDL_eRuvSxNiKE */
/* loaded from: classes11.dex */
public class C27145x331b4b30 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f297574a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f297575b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f297576c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f297577d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: ZIDL_AI */
    private void m111140x1964d170(int i17) {
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("BrandServiceNativeNotifyBridgeKE", "onDataChangeEvent size: " + this.f297574a.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : this.f297574a.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("BrandServiceNativeNotifyBridgeKE", "onDataChangeEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            ((dw.a) ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3135xb0941fd.w) entry.getValue())).getClass();
            dw.f fVar = dw.f.f325603a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandEcsFlutterDigestHelper", "subscribeEvent: onDataChangeEvent");
            dw.f.f325605c.getClass();
            ((ku5.t0) ku5.t0.f394148d).h(new zv.q0(i17), "BizFlutterDigestHelper");
        }
    }

    /* renamed from: ZIDL_CI */
    private void m111141x1964d1ae(boolean z17) {
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("BrandServiceNativeNotifyBridgeKE", "onInitDoneEvent size: " + this.f297575b.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : this.f297575b.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("BrandServiceNativeNotifyBridgeKE", "onInitDoneEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            ((dw.c) ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3135xb0941fd.y) entry.getValue())).getClass();
            dw.f fVar = dw.f.f325603a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandEcsFlutterDigestHelper", "subscribeEvent: onInitDoneEvent");
            dw.f.f325605c.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandServiceNativeNotifyBridgeReceiver", "onInitDoneEvent dbInitDone=" + z17);
            yw.a3.f547805g = z17;
            if (z17) {
                yw.a3.f547804f = true;
                yw.a3.f547807i = true;
                if (yw.a3.f547808j) {
                    yw.a3.f547808j = false;
                    new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5204x3b05336c().e();
                }
            }
            if (z17) {
                if (zv.m0.f557583v == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandServiceMainCellExposeHelper", "do delayed expose nothing happened");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandServiceMainCellExposeHelper", "do delayed expose delayedExposePos " + zv.m0.f557582u + " delayedExposeDesc " + zv.m0.f557581t);
                    ((ku5.t0) ku5.t0.f394148d).q(zv.h0.f557510d);
                }
            }
        }
    }

    /* renamed from: ZIDL_EI */
    private void m111142x1964d1ec(int i17, int i18, int i19) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f297576c;
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("BrandServiceNativeNotifyBridgeKE", "onIDKeyEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("BrandServiceNativeNotifyBridgeKE", "onIDKeyEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            ((dw.d) ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3135xb0941fd.x) entry.getValue())).getClass();
            dw.f fVar = dw.f.f325603a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandEcsFlutterDigestHelper", "subscribeEvent: onIDKeyEvent");
            dw.f.f325605c.getClass();
            jx3.f.INSTANCE.w(i17, i18, i19);
        }
    }

    /* renamed from: ZIDL_GI */
    private void m111143x1964d22a(int i17, byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f297577d;
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("BrandServiceNativeNotifyBridgeKE", "onKVEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("BrandServiceNativeNotifyBridgeKE", "onKVEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3135xb0941fd.z zVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3135xb0941fd.z) entry.getValue();
            java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            ((dw.e) zVar).getClass();
            dw.f fVar = dw.f.f325603a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandEcsFlutterDigestHelper", "subscribeEvent: onKVEvent");
            dw.f.f325605c.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(i17, str);
        }
    }
}
