package com.tencent.mm.app;

/* loaded from: classes12.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.s f53524d;

    public n(com.tencent.mm.app.s sVar) {
        this.f53524d = sVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.LinkedList linkedList;
        synchronized (this.f53524d.f53758e.f53777c.f53888m) {
            linkedList = new java.util.LinkedList(this.f53524d.f53758e.f53777c.f53888m);
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.app.y2) it.next()).b(this.f53524d.f53758e.f53777c.f53892q);
        }
    }
}
