package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421;

/* loaded from: classes7.dex */
public class q1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.n1 f159357d;

    public q1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.n1 n1Var) {
        this.f159357d = n1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.n1 n1Var;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        synchronized (this.f159357d.f159339b.f159152u) {
            linkedList.addAll(this.f159357d.f159346i);
            this.f159357d.f159346i.clear();
            n1Var = this.f159357d;
            n1Var.f159344g = false;
        }
        synchronized (n1Var) {
            n1Var.h(linkedList, true, false);
        }
    }
}
