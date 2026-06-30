package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes5.dex */
public final class r1 extends ea5.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f47527a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f47528b;

    public r1(java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> atomicReference, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f47527a = atomicReference;
        this.f47528b = countDownLatch;
    }

    @Override // ea5.k, com.tencent.wechat.aff.udr.e
    public void onCallBackFailAsync(long j17, int i17, int i18, java.lang.String projectId, java.lang.String name, int i19, com.tencent.wechat.aff.udr.r type) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(type, "type");
        super.onCallBackFailAsync(j17, i17, i18, projectId, name, i19, type);
        java.util.concurrent.atomic.AtomicReference atomicReference = this.f47527a;
        java.lang.Object obj = atomicReference.get();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (kotlin.jvm.internal.o.b(obj, bool)) {
            return;
        }
        java.util.concurrent.CountDownLatch countDownLatch = this.f47528b;
        if (i17 == 1) {
            com.tencent.mars.xlog.Log.i("Luggage.NativeDependLibHelper", "no need to update: " + name + ", " + i19);
            countDownLatch.countDown();
            return;
        }
        com.tencent.mars.xlog.Log.e("Luggage.NativeDependLibHelper", "download " + name + ": " + i19 + " fail, errno: " + i17 + ", errcode: " + i18);
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
        if (kotlin.jvm.internal.o.b(this.f47527a.get(), java.lang.Boolean.FALSE)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Luggage.NativeDependLibHelper", "download " + name + ": " + i17 + " successfully");
        this.f47528b.countDown();
    }
}
