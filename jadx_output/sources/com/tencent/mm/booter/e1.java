package com.tencent.mm.booter;

/* loaded from: classes10.dex */
public final class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f63327d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f63328e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f63329f;

    public e1(int i17, long j17, java.lang.String str) {
        this.f63327d = i17;
        this.f63328e = j17;
        this.f63329f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.booter.x1 x1Var = com.tencent.mm.booter.x1.f63592a;
        java.util.LinkedList d17 = x1Var.d();
        int i17 = this.f63327d;
        long j17 = this.f63328e;
        java.lang.String str = this.f63329f;
        synchronized (d17) {
            kz5.h0.B(x1Var.d(), new com.tencent.mm.booter.d1(i17, j17, str));
        }
    }
}
