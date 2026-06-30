package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704;

/* loaded from: classes10.dex */
public final class g3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3 f211783d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 f211784e;

    public g3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3 q3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var) {
        this.f211783d = q3Var;
        this.f211784e = a5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.LinkedList linkedList;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 u07;
        jv2.c cVar;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/uniComments/UniCommentDrawerPresenter$onAttach$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = this.f211784e.l().getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE java.lang.String();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3 q3Var = this.f211783d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15269x718714b0 p17 = q3Var.p();
        android.text.Editable text = p17 != null ? p17.getText() : null;
        if (!(text == null || text.length() == 0)) {
            if (q3Var.f211904h == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
                throw null;
            }
            java.lang.CharSequence u08 = r26.n0.u0(text);
            if (!(u08 == null || u08.length() == 0)) {
                java.lang.String b17 = hc2.l.b(text.toString());
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15269x718714b0 p18 = q3Var.p();
                if (p18 != null) {
                    if (q3Var.f211904h == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
                        throw null;
                    }
                    linkedList = p18.u(r7.f376663f);
                } else {
                    linkedList = null;
                }
                if (linkedList != null) {
                    java.util.Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        hc2.l.b((java.lang.String) it.next());
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15269x718714b0 p19 = q3Var.p();
                java.lang.Object tag = p19 != null ? p19.getTag() : null;
                android.content.Context context = q3Var.f211900d;
                if (tag == null) {
                    ev2.h hVar = ev2.h.f338443c;
                    long c17 = c01.id.c();
                    iv2.b bVar = q3Var.f211904h;
                    if (bVar == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
                        throw null;
                    }
                    long j17 = bVar.f376663f;
                    java.lang.String username = hc2.t.c(context, i17);
                    java.lang.String b18 = hc2.t.b(context, i17);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15148xe5368540 c15148xe5368540 = q3Var.A;
                    int i18 = c15148xe5368540 != null ? c15148xe5368540.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON java.lang.String() : 0;
                    iv2.b bVar2 = q3Var.f211904h;
                    if (bVar2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
                        throw null;
                    }
                    hVar.getClass();
                    java.lang.String feedUsername = bVar.f376662e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedUsername, "feedUsername");
                    java.lang.String objectNonceId = bVar.f376664g;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objectNonceId, "objectNonceId");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
                    hVar.a(c17, feedUsername, j17, objectNonceId, b17, feedUsername, "", null, null, username, b18, i17, false, null, i18, linkedList, bVar2);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var = q3Var.f211906m;
                    if (a5Var != null && (m82555x4905e9fa = a5Var.s().m82555x4905e9fa()) != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList2.add(0);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(m82555x4905e9fa, arrayList2.toArray(), "com/tencent/mm/plugin/finder/uniComments/UniCommentDrawerPresenter", "onReply", "(I)V", "Undefined", "scrollToPosition", "(I)V");
                        m82555x4905e9fa.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(m82555x4905e9fa, "com/tencent/mm/plugin/finder/uniComments/UniCommentDrawerPresenter", "onReply", "(I)V", "Undefined", "scrollToPosition", "(I)V");
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var2 = q3Var.f211906m;
                    if (a5Var2 != null) {
                        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.r(a5Var2.s(), false, null, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.j3.f211808d, 3, null);
                    }
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15269x718714b0 p27 = q3Var.p();
                    java.lang.Object tag2 = p27 != null ? p27.getTag() : null;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.uniComments.storge.LocalUniCommentObject");
                    jv2.c cVar2 = (jv2.c) tag2;
                    if (cVar2.J0() == 0) {
                        u07 = cVar2.u0();
                    } else {
                        jv2.i s17 = q3Var.s(cVar2.J0());
                        u07 = (s17 == null || (cVar = s17.f383756d) == null) ? null : cVar.u0();
                    }
                    if (u07 != null) {
                        u07.m76122x33d095ac(u07.m76071x9ca513a0() + 1);
                        ev2.h hVar2 = ev2.h.f338443c;
                        long c18 = c01.id.c();
                        iv2.b bVar3 = q3Var.f211904h;
                        if (bVar3 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
                            throw null;
                        }
                        java.lang.String str = bVar3.f376662e;
                        long j18 = bVar3.f376663f;
                        java.lang.String str2 = bVar3.f376664g;
                        java.lang.String L0 = cVar2.L0();
                        java.lang.String D0 = cVar2.D0();
                        java.lang.Long valueOf = java.lang.Long.valueOf(cVar2.t0());
                        java.lang.String j19 = cVar2.j();
                        java.lang.String c19 = hc2.t.c(context, i17);
                        java.lang.String b19 = hc2.t.b(context, i17);
                        boolean P0 = cVar2.P0();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15148xe5368540 c15148xe53685402 = q3Var.A;
                        int i19 = c15148xe53685402 != null ? c15148xe53685402.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON java.lang.String() : 0;
                        iv2.b bVar4 = q3Var.f211904h;
                        if (bVar4 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
                            throw null;
                        }
                        hVar2.a(c18, str, j18, str2, b17, L0, D0, valueOf, j19, c19, b19, i17, P0, u07, i19, linkedList, bVar4);
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var3 = q3Var.f211906m;
                if (a5Var3 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15151xe87c41ea l17 = a5Var3.l();
                    int i27 = l17.footerMode;
                    if (i27 == 1) {
                        l17.j(true);
                    } else if (i27 == 2) {
                        l17.m(false);
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15269x718714b0 p28 = q3Var.p();
                if (p28 != null) {
                    p28.setText((java.lang.CharSequence) null);
                }
            }
            yj0.a.h(this, "com/tencent/mm/plugin/finder/uniComments/UniCommentDrawerPresenter$onAttach$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
        if (q3Var.f211911r) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var4 = q3Var.f211906m;
            if (a5Var4 != null) {
                a5Var4.h().u();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15148xe5368540 c15148xe53685403 = q3Var.A;
            if (c15148xe53685403 != null) {
                c15148xe53685403.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON java.lang.String();
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var5 = q3Var.f211906m;
            if (a5Var5 != null) {
                a5Var5.q().setVisibility(8);
                android.view.View r17 = a5Var5.r();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(r17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "hideAllTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                r17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(r17, "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "hideAllTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                a5Var5.p().setVisibility(8);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/uniComments/UniCommentDrawerPresenter$onAttach$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
