package com.tencent.mm.feature.emoji;

/* loaded from: classes12.dex */
public final class j4 implements dr.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f66346a;

    public j4(java.util.concurrent.CountDownLatch countDownLatch) {
        this.f66346a = countDownLatch;
    }

    @Override // dr.q
    public void a(boolean z17) {
        this.f66346a.countDown();
    }
}
