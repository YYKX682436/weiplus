package com.p314xaae8f345.p3210x3857dc.sys;

/* loaded from: classes13.dex */
public class l implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3210x3857dc.sys.q f302095d;

    public l(com.p314xaae8f345.p3210x3857dc.sys.q qVar) {
        this.f302095d = qVar;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        by5.c4.f("SysWebFactory", "getCookieManager, not yet init, try create CookieManager");
        android.webkit.CookieManager.getInstance();
        return this.f302095d.h();
    }
}
