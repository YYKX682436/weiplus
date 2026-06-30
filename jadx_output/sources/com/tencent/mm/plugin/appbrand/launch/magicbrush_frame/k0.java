package com.tencent.mm.plugin.appbrand.launch.magicbrush_frame;

/* loaded from: classes7.dex */
public final class k0 implements com.tencent.mm.plugin.appbrand.task.y1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.k0 f84302a = new com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.k0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentSkipListSet f84303b = new java.util.concurrent.ConcurrentSkipListSet(com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.j0.f84294d);

    public void a(java.lang.String appId, int i17) {
        kotlin.jvm.internal.o.g(appId, "appId");
        java.util.Iterator it = f84303b.iterator();
        kotlin.jvm.internal.o.f(it, "iterator(...)");
        while (it.hasNext()) {
            fj1.y yVar = (fj1.y) it.next();
            if (kotlin.jvm.internal.o.b(yVar.c(), appId) && yVar.f263147g == i17) {
                try {
                    yVar.b();
                } finally {
                    it.remove();
                }
            }
        }
    }
}
