package com.p314xaae8f345.mm.app;

/* loaded from: classes12.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f134967d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.app.w f134968e;

    public h(com.p314xaae8f345.mm.app.w wVar, java.lang.String str) {
        this.f134968e = wVar;
        this.f134967d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.LinkedList linkedList;
        synchronized (this.f134968e.f135420i) {
            linkedList = new java.util.LinkedList(this.f134968e.f135420i);
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.app.t2) it.next()).mo8890x1952ea5(this.f134967d);
        }
        fs.g.b(com.p314xaae8f345.mm.app.a3.class, new com.p314xaae8f345.mm.app.g(this));
    }
}
