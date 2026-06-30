package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

/* loaded from: classes12.dex */
public final class j4 implements dr.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f147879a;

    public j4(java.util.concurrent.CountDownLatch countDownLatch) {
        this.f147879a = countDownLatch;
    }

    @Override // dr.q
    public void a(boolean z17) {
        this.f147879a.countDown();
    }
}
