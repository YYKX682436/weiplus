package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes5.dex */
public final class o2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f84842d;

    public o2(kotlinx.coroutines.q qVar) {
        this.f84842d = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kotlinx.coroutines.q qVar = this.f84842d;
        if (((kotlinx.coroutines.r) qVar).n()) {
            ((kotlinx.coroutines.r) qVar).d(new java.util.concurrent.TimeoutException());
        }
    }
}
