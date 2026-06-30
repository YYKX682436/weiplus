package el2;

/* loaded from: classes3.dex */
public final class b0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.i0 f335282d;

    public b0(el2.i0 i0Var) {
        this.f335282d = i0Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        al2.g gVar = (al2.g) obj;
        r45.jg1 jg1Var = gVar.f87376e;
        el2.i0 i0Var = this.f335282d;
        if (jg1Var != null) {
            i0Var.f335343J = jg1Var;
        }
        int i17 = gVar.f87372a;
        java.lang.String str = gVar.f87377f;
        int i18 = gVar.f87373b;
        if (i18 == 1) {
            if (i17 != 0) {
                if (str == null || str.length() == 0) {
                    str = i0Var.f199716e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dgq);
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                db5.t7.m123883x26a183b(i0Var.f199716e, str, 0).show();
                i0Var.m0(true);
                return;
            }
            java.util.LinkedList linkedList = gVar.f87374c;
            if (linkedList != null) {
                bm2.v0 v0Var = i0Var.Q;
                v0Var.getClass();
                v0Var.f103895e = linkedList;
                v0Var.m8146xced61ae5();
            }
            i0Var.f335343J = gVar.f87376e;
            if (i0Var.P()) {
                if (linkedList != null && linkedList.size() == 0) {
                    android.view.View view = i0Var.N;
                    if (view != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/view/promote/FinderLiveAnchorPromoteView", "showOrHideEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/view/promote/FinderLiveAnchorPromoteView", "showOrHideEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = i0Var.R;
                    if (c22849x81a93d25 != null) {
                        c22849x81a93d25.setVisibility(8);
                    }
                } else {
                    android.view.View view2 = i0Var.N;
                    if (view2 != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                        arrayList2.add(8);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/view/promote/FinderLiveAnchorPromoteView", "showOrHideEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/plugin/view/promote/FinderLiveAnchorPromoteView", "showOrHideEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = i0Var.R;
                    if (c22849x81a93d252 != null) {
                        c22849x81a93d252.setVisibility(0);
                    }
                }
                r45.jg1 jg1Var2 = i0Var.f335343J;
                if (jg1Var2 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.gb gbVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.gb) ((jz5.n) i0Var.V).mo141623x754a37bb();
                    wt2.a aVar = i0Var.I;
                    if (aVar != null) {
                        gbVar.f0(aVar, jg1Var2, i0Var.Q.f103895e);
                        return;
                    } else {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
                        throw null;
                    }
                }
                return;
            }
            return;
        }
        r45.z42 z42Var = gVar.f87375d;
        if (i18 == 2) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.gb) ((jz5.n) i0Var.V).mo141623x754a37bb()).s(true);
            android.content.Context context = i0Var.f199716e;
            if (i17 != -200146) {
                if (i17 == 0) {
                    i0Var.k0().f0();
                    i0Var.m0(false);
                    i0Var.p0();
                    return;
                } else {
                    if (str == null || str.length() == 0) {
                        str = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.e8m);
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    db5.t7.m123883x26a183b(context, str, 0).show();
                    i0Var.m0(true);
                    return;
                }
            }
            if (z42Var != null && z42Var.m75939xb282bd08(1) == 7) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.c4 k07 = i0Var.k0();
                java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.e9l);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                k07.getClass();
                android.widget.TextView textView = k07.L;
                if (textView != null) {
                    textView.setText(string);
                }
                android.widget.TextView textView2 = k07.L;
                if (textView2 != null) {
                    textView2.setTextColor(k07.f199716e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23));
                }
                android.widget.TextView textView3 = k07.L;
                if (textView3 != null) {
                    textView3.setOnClickListener(null);
                }
                android.widget.TextView textView4 = k07.L;
                if (textView4 != null) {
                    textView4.setVisibility(0);
                }
            } else {
                db5.t7.m123883x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.e8t), 0).show();
            }
            i0Var.m0(true);
            return;
        }
        if (i18 != 3) {
            if (i18 != 4) {
                return;
            }
            if (i17 == 0) {
                if (z42Var != null && z42Var.m75933x41a8a7f2(3)) {
                    android.content.Context context2 = i0Var.f199716e;
                    db5.t7.i(context2, context2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e9j), com.p314xaae8f345.mm.R.raw.f79703xc84d169a);
                }
                el2.i0.n0(i0Var, false, 1, null);
                return;
            }
            if (str != null && str.length() != 0) {
                r2 = false;
            }
            if (r2) {
                str = i0Var.f199716e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dgq);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            db5.t7.m123883x26a183b(i0Var.f199716e, str, 0).show();
            return;
        }
        if (i17 != 0) {
            if (str != null && str.length() != 0) {
                r2 = false;
            }
            if (r2) {
                str = i0Var.f199716e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dgq);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            db5.t7.m123883x26a183b(i0Var.f199716e, str, 0).show();
            return;
        }
        if (z42Var != null) {
            bm2.v0 v0Var2 = i0Var.Q;
            v0Var2.getClass();
            java.util.LinkedList linkedList2 = v0Var2.f103895e;
            if (!(linkedList2 == null || linkedList2.isEmpty())) {
                java.util.LinkedList linkedList3 = v0Var2.f103895e;
                if (linkedList3 != null) {
                    java.util.Iterator it = linkedList3.iterator();
                    int i19 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i19 = -1;
                            break;
                        } else {
                            if (z42Var.m75942xfb822ef2(0) == ((r45.z42) it.next()).m75942xfb822ef2(0)) {
                                break;
                            } else {
                                i19++;
                            }
                        }
                    }
                    java.util.LinkedList linkedList4 = v0Var2.f103895e;
                    if (linkedList4 != null) {
                    }
                    v0Var2.m8155x27702c4(i19);
                }
                java.util.LinkedList linkedList5 = v0Var2.f103895e;
                if (linkedList5 != null) {
                    linkedList5.isEmpty();
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k7 l07 = i0Var.l0();
            l07.s(true);
            bm2.x5 x5Var = l07.Q;
            if (x5Var != null) {
                java.util.LinkedList linkedList6 = x5Var.f103965f;
                if (linkedList6 != null) {
                    linkedList6.clear();
                }
                x5Var.m8146xced61ae5();
            }
            i0Var.m0(false);
            i0Var.p0();
        }
    }
}
