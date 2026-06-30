package cj5;

/* loaded from: classes.dex */
public final class d3 implements db5.o9 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.h3 f123635d;

    public d3(cj5.h3 h3Var) {
        this.f123635d = h3Var;
    }

    @Override // db5.o9
    public void Q0(java.lang.String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 35) {
                if (hashCode != 8593) {
                    if (hashCode == 9734 && str.equals("☆")) {
                        a(32, false);
                        return;
                    }
                } else if (str.equals("↑")) {
                    a(0, true);
                    return;
                }
            } else if (str.equals("#")) {
                a(123, false);
                return;
            }
            char[] charArray = str.toCharArray();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(charArray, "toCharArray(...)");
            java.lang.Character R = kz5.z.R(charArray, 0);
            if (R != null) {
                a(R.charValue(), false);
            }
        }
    }

    public final void a(int i17, boolean z17) {
        java.util.ArrayList arrayList;
        cj5.h3 h3Var = this.f123635d;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 h17 = h3Var.V6().h();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h17, "getSearchContactRv(...)");
        xm3.t0 b17 = xm3.u0.b(h17);
        int a07 = b17 != null ? b17.a0() : 0;
        if (z17) {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 h18 = h3Var.V6().h();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h18, "getSearchContactRv(...)");
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d c17 = xm3.u0.c(h18);
            if (c17 != null) {
                int U6 = cj5.h3.U6(h3Var);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(java.lang.Integer.valueOf(U6));
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(c17, arrayList2.toArray(), "com/tencent/mm/ui/mvvm/uic/base/SelectContactScrollBarUIC$SearchScrollBarTouchListener", "scrollToShowHead", "(IZ)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                c17.P(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue());
                yj0.a.f(c17, "com/tencent/mm/ui/mvvm/uic/base/SelectContactScrollBarUIC$SearchScrollBarTouchListener", "scrollToShowHead", "(IZ)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 h19 = h3Var.V6().h();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h19, "getSearchContactRv(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe a17 = xm3.u0.a(h19);
        if (a17 == null || (arrayList = a17.f233598o) == null) {
            return;
        }
        int i18 = 0;
        for (java.lang.Object obj : arrayList) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            ri5.j jVar = (ri5.j) obj;
            if (jVar.f477646h.a() == i17 && jVar.f477651o) {
                h3Var.V6().k().f1();
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 h27 = h3Var.V6().h();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h27, "getSearchContactRv(...)");
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d c18 = xm3.u0.c(h27);
                if (c18 != null) {
                    int i27 = i18 + a07;
                    int U62 = cj5.h3.U6(h3Var);
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList3.add(java.lang.Integer.valueOf(U62));
                    arrayList3.add(java.lang.Integer.valueOf(i27));
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(c18, arrayList3.toArray(), "com/tencent/mm/ui/mvvm/uic/base/SelectContactScrollBarUIC$SearchScrollBarTouchListener", "scrollToShowHead", "(IZ)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    c18.P(((java.lang.Integer) arrayList3.get(0)).intValue(), ((java.lang.Integer) arrayList3.get(1)).intValue());
                    yj0.a.f(c18, "com/tencent/mm/ui/mvvm/uic/base/SelectContactScrollBarUIC$SearchScrollBarTouchListener", "scrollToShowHead", "(IZ)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    return;
                }
                return;
            }
            i18 = i19;
        }
    }
}
