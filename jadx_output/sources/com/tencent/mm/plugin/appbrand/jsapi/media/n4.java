package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes10.dex */
public class n4 implements ls0.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f81950a;

    public n4(java.util.concurrent.CountDownLatch countDownLatch) {
        this.f81950a = countDownLatch;
    }

    @Override // ls0.m
    public void b(java.lang.String str) {
        this.f81950a.countDown();
    }
}
