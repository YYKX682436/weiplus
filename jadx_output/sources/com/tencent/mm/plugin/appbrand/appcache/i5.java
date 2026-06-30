package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public class i5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f75590d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.j5 f75591e;

    public i5(com.tencent.mm.plugin.appbrand.appcache.j5 j5Var, yz5.a aVar) {
        this.f75591e = j5Var;
        this.f75590d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f75590d.invoke();
        java.lang.Runnable runnable = this.f75591e.f75610d;
        if (runnable != null) {
            runnable.run();
        }
    }
}
