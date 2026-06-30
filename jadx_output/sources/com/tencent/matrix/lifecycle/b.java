package com.tencent.matrix.lifecycle;

/* loaded from: classes12.dex */
public abstract class b {
    public static void a(com.tencent.matrix.lifecycle.IBackgroundStatefulOwner iBackgroundStatefulOwner, androidx.lifecycle.y lifecycleOwner, com.tencent.matrix.lifecycle.g callback) {
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.matrix.lifecycle.d dVar = new com.tencent.matrix.lifecycle.d(callback);
        callback.f52696a = dVar;
        iBackgroundStatefulOwner.observeWithLifecycle(lifecycleOwner, dVar);
    }

    public static void b(com.tencent.matrix.lifecycle.IBackgroundStatefulOwner iBackgroundStatefulOwner, com.tencent.matrix.lifecycle.g callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.matrix.lifecycle.c cVar = new com.tencent.matrix.lifecycle.c(callback);
        callback.f52696a = cVar;
        iBackgroundStatefulOwner.observeForever(cVar);
    }

    public static void c(com.tencent.matrix.lifecycle.IBackgroundStatefulOwner iBackgroundStatefulOwner, com.tencent.matrix.lifecycle.g callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.matrix.lifecycle.k kVar = callback.f52696a;
        if (kVar != null) {
            iBackgroundStatefulOwner.removeObserver(kVar);
        }
    }
}
