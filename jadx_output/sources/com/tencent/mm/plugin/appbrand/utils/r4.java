package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes5.dex */
public final class r4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f90547d;

    public r4(yz5.l lVar) {
        this.f90547d = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f90547d.invoke("timeout");
    }
}
