package com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9;

/* loaded from: classes11.dex */
public final class o1 implements d90.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e90.e f147046a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f147047b;

    public o1(e90.e eVar, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f147046a = eVar;
        this.f147047b = countDownLatch;
    }

    @Override // d90.j
    public void a(java.util.ArrayList contentList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentList, "contentList");
        ((cf5.b) this.f147046a).a(contentList);
    }

    @Override // d90.j
    public void b() {
        this.f147047b.countDown();
    }
}
