package com.tencent.liteav.videobase.utils;

/* loaded from: classes13.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList<java.lang.Runnable> f46791a = new java.util.LinkedList<>();

    public final void a() {
        java.util.LinkedList linkedList;
        synchronized (this.f46791a) {
            if (this.f46791a.isEmpty()) {
                linkedList = null;
            } else {
                linkedList = new java.util.LinkedList(this.f46791a);
                this.f46791a.clear();
            }
        }
        while (linkedList != null && !linkedList.isEmpty()) {
            ((java.lang.Runnable) linkedList.removeFirst()).run();
        }
    }
}
