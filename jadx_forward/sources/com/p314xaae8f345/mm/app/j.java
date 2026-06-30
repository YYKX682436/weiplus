package com.p314xaae8f345.mm.app;

/* loaded from: classes12.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f134994d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.app.w f134995e;

    public j(com.p314xaae8f345.mm.app.w wVar, java.lang.String str) {
        this.f134995e = wVar;
        this.f134994d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.LinkedList linkedList;
        synchronized (this.f134995e.f135420i) {
            linkedList = new java.util.LinkedList(this.f134995e.f135420i);
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.app.t2) it.next()).mo8889x3be51a90(this.f134994d);
        }
        fs.g.b(com.p314xaae8f345.mm.app.a3.class, new com.p314xaae8f345.mm.app.i(this));
    }
}
