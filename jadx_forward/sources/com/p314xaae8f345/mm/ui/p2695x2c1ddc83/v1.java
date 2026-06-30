package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes.dex */
public final class v1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f289713d;

    public v1(java.util.List list) {
        this.f289713d = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Iterator it = this.f289713d.iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
    }
}
