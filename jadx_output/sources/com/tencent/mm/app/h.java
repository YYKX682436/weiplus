package com.tencent.mm.app;

/* loaded from: classes12.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f53434d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.w f53435e;

    public h(com.tencent.mm.app.w wVar, java.lang.String str) {
        this.f53435e = wVar;
        this.f53434d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.LinkedList linkedList;
        synchronized (this.f53435e.f53887i) {
            linkedList = new java.util.LinkedList(this.f53435e.f53887i);
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.app.t2) it.next()).onAppForeground(this.f53434d);
        }
        fs.g.b(com.tencent.mm.app.a3.class, new com.tencent.mm.app.g(this));
    }
}
