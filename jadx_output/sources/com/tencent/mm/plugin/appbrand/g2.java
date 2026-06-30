package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class g2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.h2 f78185d;

    public g2(com.tencent.mm.plugin.appbrand.h2 h2Var) {
        this.f78185d = h2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f78185d.f78259d.T = true;
        this.f78185d.f78259d.m1();
        java.util.LinkedList linkedList = new java.util.LinkedList(this.f78185d.f78259d.G);
        this.f78185d.f78259d.G.clear();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.appbrand.e3) it.next()).a();
        }
    }
}
