package com.tencent.mm.plugin.appbrand.task;

/* loaded from: classes7.dex */
public final class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f89115d;

    public p0(yz5.l lVar) {
        this.f89115d = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f89115d.invoke("timeout");
    }
}
