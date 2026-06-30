package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class s5 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f190506a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 f190507b;

    public s5(java.util.LinkedList linkedList, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var) {
        this.f190506a = linkedList;
        this.f190507b = a7Var;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        java.util.LinkedList linkedList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (!z17 || (linkedList = this.f190506a) == null) {
            return;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7.z(this.f190507b, (r45.my0) it.next(), false);
        }
    }
}
