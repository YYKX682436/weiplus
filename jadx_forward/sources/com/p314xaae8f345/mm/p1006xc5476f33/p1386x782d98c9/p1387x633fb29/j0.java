package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes13.dex */
public class j0 extends u32.f1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.o0 f180461d;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.o0 o0Var) {
        this.f180461d = o0Var;
    }

    @Override // u32.g1
    public void o4(long j17, int i17, int i18, java.lang.String str) {
        java.util.LinkedList linkedList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.o0 o0Var = this.f180461d;
        java.lang.String f17 = a42.i.f(j17);
        if (i18 == 0) {
            o0Var.getClass();
            return;
        }
        synchronized (o0Var.f180545a) {
            linkedList = new java.util.LinkedList(o0Var.f180545a);
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.m0) it.next()).o1(f17, null, false);
        }
        linkedList.clear();
        java.util.Iterator it6 = ((java.util.HashMap) o0Var.f180546b).values().iterator();
        while (it6.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.m0) it6.next()).o1(f17, null, false);
        }
    }
}
