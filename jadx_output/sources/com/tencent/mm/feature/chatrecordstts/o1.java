package com.tencent.mm.feature.chatrecordstts;

/* loaded from: classes11.dex */
public final class o1 implements d90.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e90.e f65513a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f65514b;

    public o1(e90.e eVar, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f65513a = eVar;
        this.f65514b = countDownLatch;
    }

    @Override // d90.j
    public void a(java.util.ArrayList contentList) {
        kotlin.jvm.internal.o.g(contentList, "contentList");
        ((cf5.b) this.f65513a).a(contentList);
    }

    @Override // d90.j
    public void b() {
        this.f65514b.countDown();
    }
}
