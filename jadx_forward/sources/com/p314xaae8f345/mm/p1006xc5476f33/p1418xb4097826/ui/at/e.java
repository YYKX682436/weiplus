package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at;

/* loaded from: classes.dex */
public final class e implements db5.o9 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.l f210413d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.l lVar) {
        this.f210413d = lVar;
    }

    @Override // db5.o9
    public final void Q0(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.l lVar = this.f210413d;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lVar.f210428z, str)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            lVar.f210428z = str;
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "🔍");
        jz5.g gVar = lVar.f210427y;
        if (b17) {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d c22847x422a813d = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d) ((jz5.n) gVar).mo141623x754a37bb();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c22847x422a813d, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/at/BaseFinderAtSomeoneDialog$initContentView$3", "onScollBarTouch", "(Ljava/lang/String;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            c22847x422a813d.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(c22847x422a813d, "com/tencent/mm/plugin/finder/ui/at/BaseFinderAtSomeoneDialog$initContentView$3", "onScollBarTouch", "(Ljava/lang/String;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            return;
        }
        java.util.Iterator it = lVar.R().f233598o.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.t tVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.t) next;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tVar.f210441n, str) && tVar.f210439i) {
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d c22847x422a813d2 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d) ((jz5.n) gVar).mo141623x754a37bb();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                arrayList2.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(c22847x422a813d2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/at/BaseFinderAtSomeoneDialog$initContentView$3", "onScollBarTouch", "(Ljava/lang/String;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                c22847x422a813d2.P(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue());
                yj0.a.f(c22847x422a813d2, "com/tencent/mm/plugin/finder/ui/at/BaseFinderAtSomeoneDialog$initContentView$3", "onScollBarTouch", "(Ljava/lang/String;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                return;
            }
            i17 = i18;
        }
    }
}
