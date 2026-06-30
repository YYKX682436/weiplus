package com.tencent.mm.plugin.base.stub;

/* loaded from: classes7.dex */
public class y implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f93818a;

    public y(java.util.concurrent.CountDownLatch countDownLatch) {
        this.f93818a = countDownLatch;
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.e("MicroMsg.WXBizLogic", "onInterrupt error");
        this.f93818a.countDown();
    }
}
