package com.tencent.matrix.lifecycle.owners;

/* loaded from: classes12.dex */
public final class l implements com.tencent.matrix.lifecycle.owners.a {
    public void a(java.lang.Object o17) {
        android.os.Handler handler;
        kotlin.jvm.internal.o.g(o17, "o");
        com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner overlayWindowLifecycleOwner = com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner.INSTANCE;
        handler = com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner.mainHandler;
        handler.post(new com.tencent.matrix.lifecycle.owners.k(this, o17));
    }

    public void b(java.lang.Object o17) {
        java.util.HashSet hashSet;
        java.util.HashSet hashSet2;
        kotlin.jvm.internal.o.g(o17, "o");
        com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner overlayWindowLifecycleOwner = com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner.INSTANCE;
        hashSet = com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner.overlayViews;
        hashSet.remove(o17);
        hashSet2 = com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner.overlayViews;
        if (hashSet2.isEmpty()) {
            overlayWindowLifecycleOwner.turnOff();
        }
    }
}
