package el2;

/* loaded from: classes3.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.i0 f335273d;

    public a(el2.i0 i0Var) {
        this.f335273d = i0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.LinkedList m75941xfb821914;
        java.util.ArrayList arrayList;
        java.lang.Object obj;
        r45.j94 j94Var;
        yg2.b bVar;
        java.lang.String m76197x6c03c64c;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(view);
        java.lang.Object[] array = arrayList2.toArray();
        arrayList2.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/view/promote/FinderLiveAnchorPromoteView$addItemWidget$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        el2.i0 i0Var = this.f335273d;
        r45.jg1 jg1Var = i0Var.f335343J;
        if (jg1Var != null && (m75941xfb821914 = jg1Var.m75941xfb821914(2)) != null) {
            java.util.Iterator it = m75941xfb821914.iterator();
            while (true) {
                arrayList = null;
                if (it.hasNext()) {
                    obj = it.next();
                    if (((r45.a52) obj).m75939xb282bd08(0) == 1) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            r45.a52 a52Var = (r45.a52) obj;
            if (a52Var != null) {
                com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = a52Var.m75934xbce7f2f(5);
                if (m75934xbce7f2f != null) {
                    j94Var = new r45.j94();
                    try {
                        j94Var.mo11468x92b714fd(m75934xbce7f2f.g());
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                    }
                } else {
                    j94Var = null;
                }
                if ((j94Var != null ? j94Var.m75939xb282bd08(0) : 0) > 0) {
                    ya2.g gVar = ya2.h.f542017a;
                    gk2.e eVar = dk2.ef.I;
                    ya2.b2 b17 = gVar.b(eVar != null ? ((mm2.c1) eVar.a(mm2.c1.class)).f410385o : null);
                    if (b17 != null) {
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa i17 = ya2.d.i(b17);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k7 l07 = i0Var.l0();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.gb gbVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.gb) ((jz5.n) i0Var.V).mo141623x754a37bb();
                        java.util.LinkedList linkedList = i0Var.Q.f103895e;
                        if (linkedList != null) {
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            for (java.lang.Object obj2 : linkedList) {
                                if (((r45.z42) obj2).m75939xb282bd08(1) == 1) {
                                    arrayList3.add(obj2);
                                }
                            }
                            java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(arrayList3, 10));
                            java.util.Iterator it6 = arrayList3.iterator();
                            while (it6.hasNext()) {
                                r45.z42 z42Var = (r45.z42) it6.next();
                                r45.h32 h32Var = new r45.h32();
                                com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f2 = z42Var.m75934xbce7f2f(2);
                                byte[] g17 = m75934xbce7f2f2 != null ? m75934xbce7f2f2.g() : null;
                                if (g17 != null) {
                                    try {
                                        h32Var.mo11468x92b714fd(g17);
                                    } catch (java.lang.Exception e18) {
                                        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e18);
                                    }
                                }
                                java.lang.String m75945x2fec8307 = h32Var.m75945x2fec8307(4);
                                if (m75945x2fec8307 == null) {
                                    m75945x2fec8307 = "";
                                }
                                arrayList4.add(m75945x2fec8307);
                            }
                            arrayList = arrayList4;
                        }
                        el2.h hVar = new el2.h(i0Var);
                        l07.getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.W(l07, gbVar, false, 0, 6, null);
                        l07.f197974J = i17;
                        l07.P = hVar;
                        l07.K = arrayList;
                        com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x22587864 = l07.S;
                        if (c22851x22587864 != null) {
                            c22851x22587864.E(false);
                        }
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = l07.f197974J;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k7.e0(l07, true, null, (c19782x23db1cfa == null || (m76197x6c03c64c = c19782x23db1cfa.m76197x6c03c64c()) == null) ? "" : m76197x6c03c64c, 0, 2, null);
                        android.view.View view2 = l07.M;
                        if (view2 != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
                            int i18 = ((k0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.v1) || (k0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.a2) || (l07.f199716e instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13964x5ac9d6b8)) ? 0 : 8;
                            java.util.ArrayList arrayList5 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                            arrayList5.add(java.lang.Integer.valueOf(i18));
                            java.util.Collections.reverse(arrayList5);
                            yj0.a.d(view2, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveMultiNoticeWidget", "show", "(Lcom/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheetPage;Lcom/tencent/mm/protocal/protobuf/FinderContact;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view2.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/view/FinderLiveMultiNoticeWidget", "show", "(Lcom/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheetPage;Lcom/tencent/mm/protocal/protobuf/FinderContact;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    }
                } else {
                    ya2.b2 b18 = ya2.h.f542017a.b(xy2.c.e(i0Var.f199716e));
                    if (b18 != null) {
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa i19 = ya2.d.i(b18);
                        gk2.e eVar2 = dk2.ef.I;
                        if (eVar2 != null && (bVar = eVar2.f354008i) != null) {
                            p3325xe03a0797.p3326xc267989b.l.d(bVar, null, null, new el2.k(i0Var, i19, null), 3, null);
                        }
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/view/promote/FinderLiveAnchorPromoteView$addItemWidget$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
