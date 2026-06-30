package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71;

/* loaded from: classes8.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedDeque f269444a = new java.util.concurrent.ConcurrentLinkedDeque();

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.b key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        int i17 = key.f269296d;
        g0Var.mo68477x336bdfd8(1147L, i17, 1L, false);
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = this.f269444a;
        java.util.ArrayList<java.lang.Long> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : concurrentLinkedDeque) {
            java.lang.Long l17 = (java.lang.Long) obj;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l17);
            if (l17.longValue() > 0) {
                arrayList.add(obj);
            }
        }
        for (java.lang.Long l18 : arrayList) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l18);
            g0Var2.mo68477x336bdfd8(l18.longValue(), i17, 1L, false);
        }
    }
}
