package com.tencent.mm.plugin.appbrand.debugger;

/* loaded from: classes7.dex */
public class q1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.debugger.n1 f77824d;

    public q1(com.tencent.mm.plugin.appbrand.debugger.n1 n1Var) {
        this.f77824d = n1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.debugger.n1 n1Var;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        synchronized (this.f77824d.f77806b.f77619u) {
            linkedList.addAll(this.f77824d.f77813i);
            this.f77824d.f77813i.clear();
            n1Var = this.f77824d;
            n1Var.f77811g = false;
        }
        synchronized (n1Var) {
            n1Var.h(linkedList, true, false);
        }
    }
}
