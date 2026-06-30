package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b;

/* loaded from: classes5.dex */
public final class h0 implements com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.j1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f174148a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f174149b;

    public h0(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f174148a = c0Var;
        this.f174149b = countDownLatch;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.j1
    /* renamed from: complete */
    public final void mo53948xdc453139(int i17) {
        this.f174148a.f391645d = i17 == 0;
        this.f174149b.countDown();
    }
}
