package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes.dex */
public final class nd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.ui.nd f89891d = new com.tencent.mm.plugin.appbrand.ui.nd();

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.plugin.appbrand.ui.w9.f90314a;
        java.util.Iterator it = com.tencent.mm.plugin.appbrand.ui.w9.f90314a.entrySet().iterator();
        while (it.hasNext()) {
            ((yz5.a) ((java.util.Map.Entry) it.next()).getValue()).invoke();
        }
    }
}
