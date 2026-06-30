package com.tencent.mm.app;

/* loaded from: classes4.dex */
public class q7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f53742d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f53743e;

    public q7(int i17, boolean z17) {
        this.f53742d = i17;
        this.f53743e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        c01.d9.e().g(new com.tencent.mm.modelsimple.o0(this.f53742d, this.f53743e));
    }
}
