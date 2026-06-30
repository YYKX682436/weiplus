package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5;

/* loaded from: classes2.dex */
public final class j2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l2 f207619d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f207620e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f207621f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f207622g;

    public j2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l2 l2Var, int i17, int i18, int i19) {
        this.f207619d = l2Var;
        this.f207620e = i17;
        this.f207621f = i18;
        this.f207622g = i19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l2 l2Var = this.f207619d;
        java.util.Iterator it = l2Var.f207653n.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.x1 x1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.x1) it.next();
            r45.rv0 rv0Var = new r45.rv0();
            rv0Var.set(1, x1Var.f207785a);
            rv0Var.set(2, x1Var.f207786b);
            linkedList.add(rv0Var);
        }
        l2Var.f207652m = null;
        l2Var.f207653n.clear();
        this.f207619d.Di(this.f207620e, this.f207621f, linkedList, this.f207622g, true);
    }
}
