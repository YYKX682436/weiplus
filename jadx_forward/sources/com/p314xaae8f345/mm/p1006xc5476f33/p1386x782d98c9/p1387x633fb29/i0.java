package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes13.dex */
public class i0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.o0 f180452a;

    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.o0 o0Var) {
        this.f180452a = o0Var;
    }

    public void a(long j17, int i17, int i18, int i19, long j18) {
        java.util.LinkedList linkedList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.o0 o0Var = this.f180452a;
        java.lang.String f17 = a42.i.f(j17);
        synchronized (o0Var.f180545a) {
            linkedList = new java.util.LinkedList(o0Var.f180545a);
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.m0) it.next()).V0(f17, i18, j18);
        }
        linkedList.clear();
        java.util.Iterator it6 = ((java.util.HashMap) o0Var.f180546b).values().iterator();
        while (it6.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.m0) it6.next()).V0(f17, i18, j18);
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5373x646bb207 c5373x646bb207 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5373x646bb207();
        c5373x646bb207.f135706g.getClass();
        c5373x646bb207.f135706g.getClass();
        c5373x646bb207.f135706g.getClass();
        c5373x646bb207.b(android.os.Looper.getMainLooper());
    }
}
