package com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5;

/* loaded from: classes5.dex */
public final class r1 extends ea5.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f129060a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f129061b;

    public r1(java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> atomicReference, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f129060a = atomicReference;
        this.f129061b = countDownLatch;
    }

    @Override // ea5.k, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.e
    /* renamed from: onCallBackFailAsync */
    public void mo13581xd73276fa(long j17, int i17, int i18, java.lang.String projectId, java.lang.String name, int i19, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.r type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(projectId, "projectId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        super.mo13581xd73276fa(j17, i17, i18, projectId, name, i19, type);
        java.util.concurrent.atomic.AtomicReference atomicReference = this.f129060a;
        java.lang.Object obj = atomicReference.get();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, bool)) {
            return;
        }
        java.util.concurrent.CountDownLatch countDownLatch = this.f129061b;
        if (i17 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.NativeDependLibHelper", "no need to update: " + name + ", " + i19);
            countDownLatch.countDown();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.NativeDependLibHelper", "download " + name + ": " + i19 + " fail, errno: " + i17 + ", errcode: " + i18);
        atomicReference.set(bool);
        while (countDownLatch.getCount() > 0) {
            countDownLatch.countDown();
        }
    }

    @Override // ea5.k, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.e
    /* renamed from: onCallBackSuccessAsync */
    public void mo13582x5e6271bd(long j17, java.lang.String projectId, java.lang.String name, int i17, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.r type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(projectId, "projectId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        super.mo13582x5e6271bd(j17, projectId, name, i17, type);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f129060a.get(), java.lang.Boolean.FALSE)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.NativeDependLibHelper", "download " + name + ": " + i17 + " successfully");
        this.f129061b.countDown();
    }
}
