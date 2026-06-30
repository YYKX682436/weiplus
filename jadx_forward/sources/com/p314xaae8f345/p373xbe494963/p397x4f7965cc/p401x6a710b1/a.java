package com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1;

/* loaded from: classes13.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList<java.lang.Runnable> f128324a = new java.util.LinkedList<>();

    public final void a() {
        java.util.LinkedList linkedList;
        synchronized (this.f128324a) {
            if (this.f128324a.isEmpty()) {
                linkedList = null;
            } else {
                linkedList = new java.util.LinkedList(this.f128324a);
                this.f128324a.clear();
            }
        }
        while (linkedList != null && !linkedList.isEmpty()) {
            ((java.lang.Runnable) linkedList.removeFirst()).run();
        }
    }
}
