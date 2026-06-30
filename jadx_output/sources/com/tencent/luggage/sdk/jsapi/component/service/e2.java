package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public final class e2 extends ea5.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f47403a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.service.a2 f47404b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f47405c;

    public e2(java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> atomicReference, com.tencent.luggage.sdk.jsapi.component.service.a2 a2Var, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f47403a = atomicReference;
        this.f47404b = a2Var;
        this.f47405c = countDownLatch;
    }

    @Override // ea5.k, com.tencent.wechat.aff.udr.e
    public void onCallBackFailAsync(long j17, int i17, int i18, java.lang.String projectId, java.lang.String name, int i19, com.tencent.wechat.aff.udr.r type) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(type, "type");
        super.onCallBackFailAsync(j17, i17, i18, projectId, name, i19, type);
        java.util.concurrent.atomic.AtomicReference atomicReference = this.f47403a;
        java.lang.Object obj = atomicReference.get();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (kotlin.jvm.internal.o.b(obj, bool)) {
            return;
        }
        java.util.concurrent.CountDownLatch countDownLatch = this.f47405c;
        if (i17 == 1) {
            com.tencent.mars.xlog.Log.i("Luggage.WAUDRLogic", "no need to update: " + name + ", " + i19);
            countDownLatch.countDown();
            return;
        }
        com.tencent.mars.xlog.Log.e("Luggage.WAUDRLogic", "download " + name + ": " + i19 + " fail, errno: " + i17 + ", errcode: " + i18);
        atomicReference.set(bool);
        while (countDownLatch.getCount() > 0) {
            countDownLatch.countDown();
        }
    }

    @Override // ea5.k, com.tencent.wechat.aff.udr.e
    public void onCallBackSuccessAsync(long j17, java.lang.String projectId, java.lang.String name, int i17, com.tencent.wechat.aff.udr.r type) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(type, "type");
        super.onCallBackSuccessAsync(j17, projectId, name, i17, type);
        if (kotlin.jvm.internal.o.b(this.f47403a.get(), java.lang.Boolean.FALSE)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Luggage.WAUDRLogic", "download " + name + ": " + i17 + " successfully");
        com.tencent.luggage.sdk.jsapi.component.service.g2 g2Var = com.tencent.luggage.sdk.jsapi.component.service.h2.f47439a;
        com.tencent.luggage.sdk.jsapi.component.service.a2 info = this.f47404b;
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.wechat.aff.udr.x Ui = ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Ui("ilinkres_14beccb0", info.f47382a);
        java.lang.String path = Ui != null ? Ui.getPath() : null;
        if (path != null) {
            com.tencent.mars.xlog.Log.i("Luggage.WAUDRLogic", "save Path: ".concat(path));
            ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) com.tencent.luggage.sdk.jsapi.component.service.h2.f47440b).getValue()).putString(info.f47382a + info.f47383b, path);
        }
        this.f47405c.countDown();
    }
}
