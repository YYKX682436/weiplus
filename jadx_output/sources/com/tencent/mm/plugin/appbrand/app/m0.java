package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes7.dex */
public class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f75177d;

    public m0(yz5.l lVar) {
        this.f75177d = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f75177d.invoke("MMHandlerThread.postToMainThread");
    }
}
