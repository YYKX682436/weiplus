package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class n70 {

    /* renamed from: a, reason: collision with root package name */
    public final long f216798a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f216799b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f216800c;

    /* renamed from: e, reason: collision with root package name */
    public int f216802e;

    /* renamed from: h, reason: collision with root package name */
    public r45.by2 f216805h;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.o70 f216810m;

    /* renamed from: d, reason: collision with root package name */
    public long f216801d = 5000;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f216803f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f216804g = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f216806i = new java.util.ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public int f216807j = -1;

    /* renamed from: k, reason: collision with root package name */
    public java.util.List f216808k = new java.util.ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public java.util.List f216809l = new java.util.ArrayList();

    public n70(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.o70 o70Var, long j17) {
        this.f216810m = o70Var;
        this.f216798a = j17;
    }

    public final void a(java.util.List list, int i17, r45.ch7 ch7Var) {
        int size = list.size();
        while (i17 < size) {
            r45.dy2 dy2Var = (r45.dy2) list.get(i17);
            r45.by2 by2Var = new r45.by2();
            by2Var.set(0, java.lang.Long.valueOf(dy2Var.m75942xfb822ef2(0)));
            by2Var.set(1, java.lang.Long.valueOf(dy2Var.m75942xfb822ef2(1)));
            r45.cy2 cy2Var = new r45.cy2();
            cy2Var.set(0, java.lang.Integer.valueOf(ch7Var.f453094d));
            cy2Var.set(1, dy2Var.m75945x2fec8307(2));
            by2Var.m75941xfb821914(2).add(cy2Var);
            ((java.util.ArrayList) this.f216806i).add(by2Var);
            i17++;
        }
    }

    public final void b(long j17, boolean z17) {
        java.util.Iterator it = ((java.util.ArrayList) this.f216803f).iterator();
        while (it.hasNext()) {
            r45.yx2 yx2Var = (r45.yx2) it.next();
            if (j17 >= yx2Var.m75942xfb822ef2(2) && j17 < yx2Var.m75942xfb822ef2(3)) {
                long m75942xfb822ef2 = yx2Var.m75942xfb822ef2(3);
                long j18 = this.f216801d;
                if (j17 < m75942xfb822ef2 - j18 || z17) {
                    return;
                }
                b(j17 + j18, z17);
                return;
            }
        }
        this.f216800c = true;
        android.app.Activity context = this.f216810m.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        new db2.i(nyVar != null ? nyVar.V6() : null, j17, this.f216798a, this.f216802e, this.f216799b).l().q(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.m70(this));
    }

    public final int c(long j17) {
        int i17 = -1;
        int i18 = 0;
        for (java.lang.Object obj : this.f216806i) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.by2 by2Var = (r45.by2) obj;
            if (j17 >= by2Var.m75942xfb822ef2(0) && j17 < by2Var.m75942xfb822ef2(1)) {
                i17 = i18;
            }
            i18 = i19;
        }
        return i17;
    }

    public final int d(long j17, int i17, int i18) {
        if (i17 > i18) {
            return i17;
        }
        int i19 = (i17 + i18) / 2;
        r45.by2 by2Var = (r45.by2) ((java.util.ArrayList) this.f216804g).get(i19);
        return (by2Var.m75942xfb822ef2(0) > j17 || j17 >= by2Var.m75942xfb822ef2(1)) ? j17 < by2Var.m75942xfb822ef2(0) ? d(j17, i17, i19 - 1) : d(j17, i19 + 1, i18) : i19;
    }

    public final void e(r45.by2 by2Var) {
        r45.ch7 a17;
        java.lang.Object obj;
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.o70 o70Var = this.f216810m;
        if (by2Var == null || this.f216808k.size() == 0) {
            android.view.View view = o70Var.f216971f;
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSubtitleUIC$SubtitleInfo", "showSubtitle", "(Lcom/tencent/mm/protocal/protobuf/FinderSubtitleSentence;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSubtitleUIC$SubtitleInfo", "showSubtitle", "(Lcom/tencent/mm/protocal/protobuf/FinderSubtitleSentence;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        r45.ay2 ay2Var = (r45.ay2) kz5.n0.Z(this.f216808k);
        if (ay2Var == null || (a17 = r45.ch7.a(ay2Var.m75939xb282bd08(0))) == null) {
            return;
        }
        r45.ay2 ay2Var2 = (r45.ay2) kz5.n0.a0(this.f216808k, 1);
        java.lang.Object obj2 = null;
        r45.ch7 a18 = ay2Var2 != null ? r45.ch7.a(ay2Var2.m75939xb282bd08(0)) : null;
        java.util.LinkedList m75941xfb821914 = by2Var.m75941xfb821914(2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getSentence_by_language(...)");
        java.util.Iterator it = m75941xfb821914.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (r45.ch7.a(((r45.cy2) obj).m75939xb282bd08(0)) == a17) {
                    break;
                }
            }
        }
        r45.cy2 cy2Var = (r45.cy2) obj;
        if (cy2Var != null) {
            android.widget.TextView textView = o70Var.f216972g;
            if (textView != null) {
                textView.setText(cy2Var.m75945x2fec8307(1));
            }
            str = cy2Var.m75945x2fec8307(1);
            android.widget.TextView textView2 = o70Var.f216972g;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
        } else {
            str = null;
        }
        android.widget.TextView textView3 = o70Var.f216973h;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        if (a18 != null) {
            java.util.LinkedList m75941xfb8219142 = by2Var.m75941xfb821914(2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getSentence_by_language(...)");
            java.util.Iterator it6 = m75941xfb8219142.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                java.lang.Object next = it6.next();
                if (r45.ch7.a(((r45.cy2) next).m75939xb282bd08(0)) == a18) {
                    obj2 = next;
                    break;
                }
            }
            r45.cy2 cy2Var2 = (r45.cy2) obj2;
            if (cy2Var2 != null && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, cy2Var2.m75945x2fec8307(1))) {
                android.widget.TextView textView4 = o70Var.f216973h;
                if (textView4 != null) {
                    textView4.setText(cy2Var2.m75945x2fec8307(1));
                }
                android.widget.TextView textView5 = o70Var.f216973h;
                if (textView5 != null) {
                    textView5.setVisibility(0);
                }
            }
        }
        android.widget.TextView textView6 = o70Var.f216972g;
        if (!(textView6 != null && textView6.getVisibility() == 0)) {
            android.widget.TextView textView7 = o70Var.f216973h;
            if (!(textView7 != null && textView7.getVisibility() == 0)) {
                android.view.View view2 = o70Var.f216971f;
                if (view2 == null) {
                    return;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSubtitleUIC$SubtitleInfo", "showSubtitle", "(Lcom/tencent/mm/protocal/protobuf/FinderSubtitleSentence;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSubtitleUIC$SubtitleInfo", "showSubtitle", "(Lcom/tencent/mm/protocal/protobuf/FinderSubtitleSentence;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
        }
        android.view.View view3 = o70Var.f216971f;
        if (view3 == null) {
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSubtitleUIC$SubtitleInfo", "showSubtitle", "(Lcom/tencent/mm/protocal/protobuf/FinderSubtitleSentence;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSubtitleUIC$SubtitleInfo", "showSubtitle", "(Lcom/tencent/mm/protocal/protobuf/FinderSubtitleSentence;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final java.util.List f(r45.cy2 cy2Var, android.graphics.Paint paint) {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.o70 o70Var;
        r45.cy2 cy2Var2;
        java.lang.String str;
        long m75942xfb822ef2;
        int i17;
        int i18;
        java.lang.String str2;
        java.lang.String str3;
        int i19;
        java.lang.Integer num;
        int intValue;
        android.graphics.Paint paint2 = paint;
        java.lang.String m75945x2fec8307 = cy2Var.m75945x2fec8307(1);
        if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSubtitleUIC", "splitSentence data error, sentence or paint is null");
            return new java.util.ArrayList();
        }
        java.lang.String m75945x2fec83072 = cy2Var.m75945x2fec8307(1);
        java.util.LinkedList m75941xfb821914 = cy2Var.m75941xfb821914(2);
        java.lang.String str4 = "getWord(...)";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getWord(...)");
        java.util.List h17 = h(m75945x2fec83072, m75941xfb821914);
        java.lang.String m75945x2fec83073 = cy2Var.m75945x2fec8307(1);
        if (m75945x2fec83073 == null) {
            m75945x2fec83073 = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSubtitleUIC", "splitSentence sentence : ".concat(m75945x2fec83073));
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        while (true) {
            arrayList = (java.util.ArrayList) h17;
            int size = arrayList.size();
            o70Var = this.f216810m;
            if (i27 >= size || i28 >= m75945x2fec83073.length() || i28 < 0) {
                break;
            }
            java.lang.String substring = m75945x2fec83073.substring(i28);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
            int length = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.o70.O6(o70Var, substring, paint2, o70Var.f216970e).length() + i28;
            while (i27 < arrayList.size() && ((java.lang.Number) arrayList.get(i27)).intValue() <= length) {
                i27++;
            }
            if (i27 > 0) {
                java.lang.Integer num2 = (java.lang.Integer) kz5.n0.a0(h17, i27 - 1);
                i28 = num2 != null ? num2.intValue() : i28 + 1;
                i29++;
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int i37 = 0;
        while (i37 < i29) {
            int size2 = arrayList.size();
            java.util.ArrayList arrayList3 = new java.util.ArrayList(size2);
            for (int i38 = 0; i38 < size2; i38++) {
                arrayList3.add(new java.util.ArrayList());
            }
            int size3 = arrayList.size();
            int i39 = i37;
            while (i39 < size3) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                if (i37 == 0) {
                    int intValue2 = ((java.lang.Number) arrayList.get(i39)).intValue();
                    i17 = size3;
                    if (intValue2 < 0 || intValue2 > m75945x2fec83073.length()) {
                        str2 = str4;
                        i18 = i29;
                        i39++;
                        paint2 = paint;
                        size3 = i17;
                        i29 = i18;
                        str4 = str2;
                    } else {
                        java.lang.String substring2 = m75945x2fec83073.substring(0, intValue2);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
                        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.o70.O6(o70Var, substring2, paint2, o70Var.f216970e).length() == substring2.length()) {
                            arrayList4.add(java.lang.Integer.valueOf(i39));
                        }
                        str2 = str4;
                        i18 = i29;
                    }
                } else {
                    i17 = size3;
                    int intValue3 = ((java.lang.Number) arrayList.get(i39)).intValue();
                    i18 = i29;
                    float f17 = intValue3 / (i37 + 1);
                    int i47 = i37 - 1;
                    float f18 = Float.MAX_VALUE;
                    while (i47 < i39) {
                        java.util.List list = (java.util.List) kz5.n0.a0(arrayList2, i47);
                        if (list == null) {
                            i19 = intValue3;
                            str3 = str4;
                        } else {
                            str3 = str4;
                            if (list.size() == i37 && (num = (java.lang.Integer) kz5.n0.a0(h17, ((java.lang.Number) kz5.n0.i0(list)).intValue())) != null && (intValue = num.intValue()) <= intValue3 && intValue >= 0 && intValue3 <= m75945x2fec83073.length()) {
                                java.lang.String substring3 = m75945x2fec83073.substring(intValue, intValue3);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring3, "substring(...)");
                                if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.o70.O6(o70Var, substring3, paint2, o70Var.f216970e).length() >= substring3.length()) {
                                    java.util.List V0 = kz5.n0.V0(list);
                                    i19 = intValue3;
                                    ((java.util.ArrayList) V0).add(java.lang.Integer.valueOf(i39));
                                    java.util.Iterator it = list.iterator();
                                    float f19 = 0.0f;
                                    int i48 = 0;
                                    while (it.hasNext()) {
                                        java.util.Iterator it6 = it;
                                        int intValue4 = ((java.lang.Number) it.next()).intValue();
                                        if (intValue4 >= 0 && intValue4 < arrayList.size()) {
                                            int intValue5 = ((java.lang.Number) arrayList.get(intValue4)).intValue();
                                            f19 += java.lang.Math.abs((intValue5 - i48) - f17);
                                            i48 = intValue5;
                                        }
                                        it = it6;
                                    }
                                    if (f19 < f18) {
                                        arrayList4.clear();
                                        arrayList4.addAll(V0);
                                        f18 = f19;
                                    }
                                }
                            }
                            i19 = intValue3;
                        }
                        i47++;
                        paint2 = paint;
                        str4 = str3;
                        intValue3 = i19;
                    }
                    str2 = str4;
                }
                arrayList3.set(i39, arrayList4);
                i39++;
                paint2 = paint;
                size3 = i17;
                i29 = i18;
                str4 = str2;
            }
            i37++;
            paint2 = paint;
            arrayList2 = arrayList3;
        }
        java.lang.String str5 = str4;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.util.List list2 = (java.util.List) kz5.n0.k0(arrayList2);
        if (list2 != null) {
            java.util.Iterator it7 = list2.iterator();
            int i49 = 0;
            while (it7.hasNext()) {
                int intValue6 = ((java.lang.Number) it7.next()).intValue();
                java.lang.Integer num3 = (java.lang.Integer) kz5.n0.a0(h17, intValue6);
                int intValue7 = num3 != null ? num3.intValue() : i49;
                r45.dy2 dy2Var = new r45.dy2();
                if (arrayList5.isEmpty()) {
                    cy2Var2 = cy2Var;
                    java.util.LinkedList m75941xfb8219142 = cy2Var2.m75941xfb821914(2);
                    str = str5;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, str);
                    m75942xfb822ef2 = ((r45.dy2) kz5.n0.X(m75941xfb8219142)).m75942xfb822ef2(0);
                } else {
                    cy2Var2 = cy2Var;
                    str = str5;
                    m75942xfb822ef2 = ((r45.dy2) kz5.n0.i0(arrayList5)).m75942xfb822ef2(1);
                }
                dy2Var.set(0, java.lang.Long.valueOf(m75942xfb822ef2));
                java.util.LinkedList m75941xfb8219143 = cy2Var2.m75941xfb821914(2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219143, str);
                r45.dy2 dy2Var2 = (r45.dy2) kz5.n0.a0(m75941xfb8219143, intValue6);
                dy2Var.set(1, java.lang.Long.valueOf(dy2Var2 != null ? dy2Var2.m75942xfb822ef2(1) : 0L));
                if (i49 <= intValue7 && intValue7 <= m75945x2fec83073.length() && i49 >= 0) {
                    java.lang.String substring4 = m75945x2fec83073.substring(i49, intValue7);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring4, "substring(...)");
                    dy2Var.set(2, substring4);
                }
                arrayList5.add(dy2Var);
                i49 = intValue7;
                str5 = str;
            }
        }
        return arrayList5;
    }

    public final void g(r45.yx2 subtitle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subtitle, "subtitle");
        ((java.util.ArrayList) this.f216803f).add(subtitle);
        java.util.Iterator it = subtitle.m75941xfb821914(4).iterator();
        while (it.hasNext()) {
            r45.by2 by2Var = (r45.by2) it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(by2Var);
            long m75942xfb822ef2 = by2Var.m75942xfb822ef2(0);
            java.util.List list = this.f216804g;
            int d17 = d(m75942xfb822ef2, 0, ((java.util.ArrayList) list).size() - 1);
            r45.by2 by2Var2 = (r45.by2) kz5.n0.a0(list, d17);
            if (by2Var2 == null || by2Var.m75942xfb822ef2(0) != by2Var2.m75942xfb822ef2(0)) {
                ((java.util.ArrayList) list).add(d17, by2Var);
            } else {
                ((java.util.ArrayList) list).set(d17, by2Var);
            }
        }
    }

    public final java.util.List h(java.lang.String str, java.util.List list) {
        if ((str == null || str.length() == 0) || list.isEmpty()) {
            return new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            int i18 = i17 + 1;
            java.lang.String m75945x2fec8307 = ((r45.dy2) it.next()).m75945x2fec8307(2);
            if (m75945x2fec8307 != null) {
                int intValue = i17 > 0 ? ((java.lang.Number) arrayList.get(i17 - 1)).intValue() : 0;
                java.lang.String substring = str.substring(intValue);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                int L = r26.n0.L(substring, m75945x2fec8307, 0, false, 6, null);
                int i19 = L != -1 ? intValue + L : -1;
                if (i19 != -1) {
                    arrayList.add(java.lang.Integer.valueOf(i19 + m75945x2fec8307.length()));
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSubtitleUIC", "find position err, objectid : " + this.f216798a + ", text : " + str + ", str : " + m75945x2fec8307);
                }
            }
            i17 = i18;
        }
        return arrayList;
    }
}
