package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public class o4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicInteger f75699d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.p4 f75700e;

    public o4(com.tencent.mm.plugin.appbrand.appcache.p4 p4Var, java.util.concurrent.atomic.AtomicInteger atomicInteger, int i17) {
        this.f75700e = p4Var;
        this.f75699d = atomicInteger;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.appcache.f8.a(true, new com.tencent.mm.plugin.appbrand.appcache.n4(this));
    }
}
