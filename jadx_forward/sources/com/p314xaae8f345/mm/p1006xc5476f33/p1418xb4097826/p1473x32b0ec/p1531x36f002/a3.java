package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002;

/* loaded from: classes2.dex */
public final class a3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.a3 f196976a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.a3();

    public static void e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.a3 a3Var, android.widget.TextView textView, java.util.LinkedList colorList, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.u2 gradientOrientation, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.t2 format, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            gradientOrientation = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.u2.f197249e;
        }
        if ((i17 & 4) != 0) {
            format = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.t2.f197241d;
        }
        a3Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(colorList, "colorList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gradientOrientation, "gradientOrientation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(format, "format");
        if (colorList.size() < 2) {
            textView.getPaint().setShader(null);
            java.lang.String str = (java.lang.String) kz5.n0.Z(colorList);
            if (str != null) {
                if (str.length() > 0) {
                    textView.setTextColor(zl2.q4.f555466a.O(str));
                    return;
                }
                return;
            }
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : colorList) {
            if (((java.lang.String) obj2).length() > 0) {
                arrayList.add(obj2);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            arrayList2.add(java.lang.Integer.valueOf(format == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.t2.f197241d ? zl2.q4.f555466a.O(str2) : hc2.l.l(str2)));
        }
        textView.getViewTreeObserver().addOnPreDrawListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.z2(textView, gradientOrientation, kz5.n0.R0(arrayList2)));
    }

    public final void a(android.view.ViewGroup viewGroup, r45.an1 it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        int m75939xb282bd08 = it.m75939xb282bd08(4);
        if (m75939xb282bd08 != 0) {
            if (m75939xb282bd08 != 1) {
                return;
            }
            d(viewGroup, it.m75945x2fec8307(3));
        } else {
            java.util.LinkedList m75941xfb821914 = it.m75941xfb821914(2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getBackground_color(...)");
            c(viewGroup, m75941xfb821914, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.u2.f197248d);
        }
    }

    public final void b(android.widget.ImageView imageView, r45.an1 it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageView, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.String m75945x2fec8307 = it.m75945x2fec8307(7);
        if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(imageView, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/util/SquareConvertUtil", "loadHighlightTagIcon", "(Landroid/widget/ImageView;Lcom/tencent/mm/protocal/protobuf/FinderLiveCardHighlightTag;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(imageView, "com/tencent/mm/plugin/finder/live/util/SquareConvertUtil", "loadHighlightTagIcon", "(Landroid/widget/ImageView;Lcom/tencent/mm/protocal/protobuf/FinderLiveCardHighlightTag;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(imageView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/util/SquareConvertUtil", "loadHighlightTagIcon", "(Landroid/widget/ImageView;Lcom/tencent/mm/protocal/protobuf/FinderLiveCardHighlightTag;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        imageView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(imageView, "com/tencent/mm/plugin/finder/live/util/SquareConvertUtil", "loadHighlightTagIcon", "(Landroid/widget/ImageView;Lcom/tencent/mm/protocal/protobuf/FinderLiveCardHighlightTag;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mn2.g1 g1Var = mn2.g1.f411508a;
        wo0.c a17 = g1Var.e().a(new mn2.q3(it.m75945x2fec8307(7), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.w2 w2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.w2(imageView, it);
        a17.getClass();
        a17.f529406d = w2Var;
        a17.g(g1Var.h(mn2.f1.f411498s));
        a17.f();
    }

    public final void c(android.view.View view, java.util.LinkedList colorList, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.u2 gradientOrientation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(colorList, "colorList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gradientOrientation, "gradientOrientation");
        if (colorList.size() < 2) {
            java.lang.String str = (java.lang.String) kz5.n0.Z(colorList);
            if (str != null) {
                if (str.length() > 0) {
                    view.setBackgroundColor(zl2.q4.f555466a.O(str));
                    return;
                }
                return;
            }
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : colorList) {
            if (((java.lang.String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(java.lang.Integer.valueOf(zl2.q4.f555466a.O((java.lang.String) it.next())));
        }
        view.setBackgroundDrawable(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.bd(gradientOrientation, kz5.n0.R0(arrayList2)));
    }

    public final void d(android.view.View view, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SquareConvertUtil", "load background img, url is null");
            return;
        }
        mn2.g1 g1Var = mn2.g1.f411508a;
        wo0.c a17 = g1Var.e().a(new mn2.q3(str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y2 y2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y2(view, str);
        a17.getClass();
        a17.f529406d = y2Var;
        a17.g(g1Var.h(mn2.f1.f411498s));
        a17.f();
    }
}
