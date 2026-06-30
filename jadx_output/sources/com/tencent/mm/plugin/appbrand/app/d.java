package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.app.d f75045a = new com.tencent.mm.plugin.appbrand.app.d();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.LinkedList f75046b = new java.util.LinkedList();

    public final void a() {
        java.util.Iterator it = f75046b.iterator();
        kotlin.jvm.internal.o.f(it, "iterator(...)");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            kotlin.jvm.internal.o.f(next, "next(...)");
            cf.a aVar = (cf.a) next;
            if (aVar.f40818d) {
                android.app.Activity activity = (android.app.Activity) aVar.f40816b.get();
                if (activity != null) {
                    activity.finish();
                    com.tencent.mars.xlog.Log.i("ActivityCrossProcessManager", "finishActivityAfterLaunchUICreate " + activity + ' ');
                }
                it.remove();
            }
        }
    }

    public final void b(com.tencent.luggage.sdk.wxa_ktx.PopActivityRecord popActivityRecord) {
        kotlin.jvm.internal.o.g(popActivityRecord, "popActivityRecord");
        java.util.Iterator it = f75046b.iterator();
        kotlin.jvm.internal.o.f(it, "iterator(...)");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            kotlin.jvm.internal.o.f(next, "next(...)");
            cf.a aVar = (cf.a) next;
            if (aVar.f40817c == popActivityRecord.f47702d && aVar.f40815a > popActivityRecord.f47703e) {
                android.app.Activity activity = (android.app.Activity) aVar.f40816b.get();
                if (activity != null) {
                    activity.finish();
                    com.tencent.mars.xlog.Log.i("ActivityCrossProcessManager", "popActivityAfterCreateTime " + activity + ' ');
                }
                it.remove();
            }
        }
    }
}
