package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class q7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7 f195498d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f195499e;

    public q7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7 x7Var, int i17) {
        this.f195498d = x7Var;
        this.f195499e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.ArrayList arrayList3;
        this.f195498d.f196573t.f();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7 x7Var = this.f195498d;
        int i17 = this.f195499e;
        java.util.List list = ((mm2.o4) x7Var.P0(mm2.o4.class)).f410851o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-linkMicUserList>(...)");
        synchronized (list) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (true ^ ((km2.q) obj).f390710h) {
                    arrayList.add(obj);
                }
            }
        }
        java.util.List list2 = ((mm2.o4) x7Var.P0(mm2.o4.class)).f410851o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list2, "<get-linkMicUserList>(...)");
        synchronized (list2) {
            arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : list2) {
                if (((km2.q) obj2).f390710h) {
                    arrayList2.add(obj2);
                }
            }
        }
        java.util.List list3 = ((mm2.o4) x7Var.P0(mm2.o4.class)).f410860v;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list3, "<get-audienceLinkMicUserList>(...)");
        synchronized (list3) {
            arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj3 : list3) {
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((km2.q) obj3).f390722t, java.lang.Boolean.TRUE)) {
                    arrayList3.add(obj3);
                }
            }
        }
        int size = arrayList3.size();
        int size2 = ((mm2.o4) x7Var.P0(mm2.o4.class)).f410857s.size();
        if (i17 >= 0) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = x7Var.f196571r;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList4.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(c1163xf1deaba4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin", "smartScroll", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
            c1163xf1deaba4.c1(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin", "smartScroll", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
            return;
        }
        if (arrayList.isEmpty() && size == 0 && (!arrayList2.isEmpty() || size2 > 0)) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = x7Var.f196571r;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList5.add(1);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(c1163xf1deaba42, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin", "smartScroll", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
            c1163xf1deaba42.c1(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(c1163xf1deaba42, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin", "smartScroll", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
            return;
        }
        if ((!arrayList.isEmpty() || size > 0) && arrayList2.isEmpty() && size2 == 0) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = x7Var.f196571r;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(c1163xf1deaba43, arrayList6.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin", "smartScroll", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
            c1163xf1deaba43.c1(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(c1163xf1deaba43, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin", "smartScroll", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
    }
}
