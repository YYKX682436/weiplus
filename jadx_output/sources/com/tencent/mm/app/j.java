package com.tencent.mm.app;

/* loaded from: classes12.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f53461d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.w f53462e;

    public j(com.tencent.mm.app.w wVar, java.lang.String str) {
        this.f53462e = wVar;
        this.f53461d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.LinkedList linkedList;
        synchronized (this.f53462e.f53887i) {
            linkedList = new java.util.LinkedList(this.f53462e.f53887i);
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.app.t2) it.next()).onAppBackground(this.f53461d);
        }
        fs.g.b(com.tencent.mm.app.a3.class, new com.tencent.mm.app.i(this));
    }
}
