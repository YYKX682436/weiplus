package com.p314xaae8f345.mm.app;

/* loaded from: classes12.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.app.s f135057d;

    public n(com.p314xaae8f345.mm.app.s sVar) {
        this.f135057d = sVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.LinkedList linkedList;
        synchronized (this.f135057d.f135291e.f135310c.f135421m) {
            linkedList = new java.util.LinkedList(this.f135057d.f135291e.f135310c.f135421m);
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.app.y2) it.next()).b(this.f135057d.f135291e.f135310c.f135425q);
        }
    }
}
