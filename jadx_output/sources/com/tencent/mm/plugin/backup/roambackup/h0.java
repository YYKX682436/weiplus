package com.tencent.mm.plugin.backup.roambackup;

/* loaded from: classes5.dex */
public final class h0 implements com.tencent.wechat.aff.affroam.j1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f92615a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f92616b;

    public h0(kotlin.jvm.internal.c0 c0Var, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f92615a = c0Var;
        this.f92616b = countDownLatch;
    }

    @Override // com.tencent.wechat.aff.affroam.j1
    public final void complete(int i17) {
        this.f92615a.f310112d = i17 == 0;
        this.f92616b.countDown();
    }
}
