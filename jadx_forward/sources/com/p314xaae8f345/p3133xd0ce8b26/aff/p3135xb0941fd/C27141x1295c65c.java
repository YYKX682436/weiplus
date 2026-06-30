package com.p314xaae8f345.p3133xd0ce8b26.aff.p3135xb0941fd;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.wechat.aff.brand_service.ZIDL_eRuvB8TjKE */
/* loaded from: classes11.dex */
public class C27141x1295c65c {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f297569a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f297570b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: ZIDL_AI */
    private void m111118x1964d170(int i17, byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f297569a;
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("BrandServiceManagerBridgeKE", "onRecV3DataChangeEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("BrandServiceManagerBridgeKE", "onRecV3DataChangeEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3135xb0941fd.p pVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3135xb0941fd.p) entry.getValue();
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.o0 o0Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.o0) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.o0.f300641o, bArr);
            ((dw.b) pVar).getClass();
            dw.f fVar = dw.f.f325603a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandEcsFlutterDigestHelper", "subscribeEvent: onDataChangeEventV3, eventType -> " + i17 + " recInfo isWaterfallFlow -> " + o0Var.f300649n);
            if (i17 == 2 && o0Var.f300649n) {
                ((nq1.d) ((oq1.l) i95.n0.c(oq1.l.class))).Bi(oq1.b.f428862z);
            }
            if (i17 == 7) {
                ((zv.e2) ((bw.k) i95.n0.c(bw.k.class))).f557484i = true;
                dw.f.f325603a.a();
            }
        }
    }

    /* renamed from: ZIDL_EBI */
    private void m111119x13356b04(boolean z17, byte[] bArr, byte[] bArr2) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f297570b;
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("BrandServiceManagerBridgeKE", "onCreationCenterInfoChangeEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("BrandServiceManagerBridgeKE", "onCreationCenterInfoChangeEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(entry.getValue());
            new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            throw null;
        }
    }
}
