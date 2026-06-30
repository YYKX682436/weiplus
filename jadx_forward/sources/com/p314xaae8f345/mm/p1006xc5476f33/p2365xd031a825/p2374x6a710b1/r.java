package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1;

/* loaded from: classes8.dex */
public final class r {
    public final void a(java.util.List messages, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.p eventType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(messages, "messages");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventType, "eventType");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = messages.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) next;
            if ((!f9Var.k2() || f9Var.j() == null || f9Var.Q0() == null) ? false : true) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.q(arrayList, this, eventType), "MessageReportor-report");
        }
    }
}
