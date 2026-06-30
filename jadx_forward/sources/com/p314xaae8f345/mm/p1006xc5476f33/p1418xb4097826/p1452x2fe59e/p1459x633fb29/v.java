package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class v {
    public v(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(r45.j51 j51Var, android.content.Context context, long j17, java.lang.String tag) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(j51Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        long m75942xfb822ef2 = j51Var.m75942xfb822ef2(13);
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_FEED_COMMENT_OPTION_LONG_SYNC, java.lang.Long.valueOf(m75942xfb822ef2));
        java.util.List<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87> m75941xfb821914 = j51Var.m75941xfb821914(12);
        if (m75941xfb821914 == null) {
            m75941xfb821914 = kz5.p0.f395529d;
        }
        int i17 = 0;
        for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b87 : m75941xfb821914) {
            if (i17 != c19781xd1c47b87.m76062x928789b6() && (!arrayList2.isEmpty())) {
                arrayList.add(arrayList2);
                arrayList2.clear();
            }
            int m76062x928789b6 = c19781xd1c47b87.m76062x928789b6();
            if (m76062x928789b6 == 1) {
                arrayList.add(kz5.b0.c(c19781xd1c47b87));
            } else if (m76062x928789b6 == 2) {
                if ((2 & m75942xfb822ef2) != 0) {
                    arrayList2.add(c19781xd1c47b87);
                } else {
                    arrayList.add(kz5.b0.c(c19781xd1c47b87));
                }
            }
            i17 = c19781xd1c47b87.m76062x928789b6();
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(arrayList2);
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (((java.util.List) obj).size() == 1) {
                arrayList3.add(obj);
            }
        }
        java.util.LinkedList linkedList = new java.util.LinkedList(kz5.d0.r(arrayList3));
        if (!linkedList.isEmpty()) {
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.t(context, tag, j17, linkedList));
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList) {
            java.util.List list = (java.util.List) obj2;
            int size = list.size();
            if (size >= 5) {
                if (!list.isEmpty()) {
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87) it.next()).m76062x928789b6() == 2) {
                            z17 = true;
                            break;
                        }
                    }
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(tag, "multiImageCommentDescList comments size = " + size);
            }
            z17 = false;
            if (z17) {
                arrayList4.add(obj2);
            }
        }
        if (!arrayList4.isEmpty()) {
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.u(j51Var, context, tag, j17, arrayList4));
        }
    }
}
