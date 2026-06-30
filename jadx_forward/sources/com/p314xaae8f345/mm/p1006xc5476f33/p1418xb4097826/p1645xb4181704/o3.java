package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704;

/* loaded from: classes10.dex */
public final class o3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3 f211878a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f211879b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f211880c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fp0.r f211881d;

    public o3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3 q3Var, boolean z17, long j17, fp0.r rVar) {
        this.f211878a = q3Var;
        this.f211879b = z17;
        this.f211880c = j17;
        this.f211881d = rVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var;
        java.lang.String str;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        java.lang.String str2;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa2;
        int i17;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa3;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa4;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df193;
        jz5.l lVar = (jz5.l) obj;
        boolean booleanValue = ((java.lang.Boolean) lVar.f384366d).booleanValue();
        java.util.List list = (java.util.List) lVar.f384367e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3 q3Var = this.f211878a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var2 = q3Var.f211906m;
        if (a5Var2 != null) {
            a5Var2.p().setVisibility(8);
            a5Var2.r().setOnClickListener(null);
        }
        boolean z17 = this.f211879b;
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var3 = q3Var.f211906m;
            if (a5Var3 != null) {
                a5Var3.s().P(list != null ? list.size() : 0);
            }
        } else if (!q3Var.f211910q && (a5Var = q3Var.f211906m) != null) {
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.I(a5Var.s(), null, 1, null);
        }
        if (z17 && !q3Var.f211909p) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var4 = q3Var.f211906m;
            if (a5Var4 != null) {
                a5Var4.g(false);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var5 = q3Var.f211906m;
            if (a5Var5 != null) {
                a5Var5.h().l(true);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.p4 p4Var = q3Var.f211902f;
        java.lang.String str3 = "MicroMsg.MusicUni.DrawerPresenter";
        if (list == null || list.size() <= 0) {
            str = "MicroMsg.MusicUni.DrawerPresenter";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "refresh header title...");
            q3Var.z();
            if (z17) {
                p4Var.f211893a.clear();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var6 = q3Var.f211906m;
                if (a5Var6 != null && (m82555x4905e9fa = a5Var6.s().m82555x4905e9fa()) != null && (mo7946xf939df19 = m82555x4905e9fa.mo7946xf939df19()) != null) {
                    mo7946xf939df19.m8146xced61ae5();
                }
                if (booleanValue) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var7 = q3Var.f211906m;
                    if (a5Var7 != null) {
                        a5Var7.p().setVisibility(0);
                        android.view.View view = a5Var7.f211728n;
                        if (view == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
                            throw null;
                        }
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(8);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        if (a5Var7.h().getCloseComment()) {
                            a5Var7.q().setVisibility(8);
                        } else {
                            a5Var7.q().setVisibility(0);
                        }
                        android.view.View r17 = a5Var7.r();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(8);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(r17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        r17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(r17, "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var8 = q3Var.f211906m;
                    if (a5Var8 != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.n3 n3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.n3(q3Var);
                        a5Var8.p().setVisibility(0);
                        android.view.View view2 = a5Var8.f211728n;
                        if (view2 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
                            throw null;
                        }
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                        arrayList3.add(8);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        a5Var8.q().setVisibility(8);
                        android.view.View r18 = a5Var8.r();
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        arrayList4.add(0);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(r18, arrayList4.toArray(), "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        r18.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                        yj0.a.f(r18, "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        a5Var8.r().setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.z4(n3Var));
                    }
                }
            }
        } else {
            if (q3Var.f211913t == 0) {
                p4Var.f211893a.clear();
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    p4Var.a((jv2.i) it.next(), true);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var9 = q3Var.f211906m;
                if (a5Var9 != null && (m82555x4905e9fa4 = a5Var9.s().m82555x4905e9fa()) != null && (mo7946xf939df193 = m82555x4905e9fa4.mo7946xf939df19()) != null) {
                    mo7946xf939df193.m8146xced61ae5();
                }
            } else {
                int f17 = p4Var.f();
                p4Var.b(list, true, false);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var10 = q3Var.f211906m;
                if (a5Var10 != null && (m82555x4905e9fa3 = a5Var10.s().m82555x4905e9fa()) != null && (mo7946xf939df192 = m82555x4905e9fa3.mo7946xf939df19()) != null) {
                    mo7946xf939df192.m8153xd399a4d9(0, p4Var.f() - f17);
                }
                if (z17) {
                    java.util.ArrayList arrayList5 = p4Var.f211893a;
                    java.util.Iterator it6 = arrayList5.iterator();
                    int i18 = 0;
                    while (true) {
                        if (!it6.hasNext()) {
                            str2 = str3;
                            i18 = -1;
                            break;
                        }
                        str2 = str3;
                        if (((jv2.i) it6.next()).mo2128x1ed62e84() == q3Var.f211913t) {
                            break;
                        }
                        i18++;
                        str3 = str2;
                    }
                    if (i18 >= 0) {
                        jv2.i iVar = (jv2.i) arrayList5.get(i18);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var11 = q3Var.f211906m;
                        if (a5Var11 != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15151xe87c41ea l17 = a5Var11.l();
                            java.lang.String b17 = hc2.t.b(q3Var.f211900d, q3Var.f211905i);
                            i95.m c17 = i95.n0.c(c61.yb.class);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                            l17.g(b17, c61.yb.md((c61.yb) c17, iVar.f383756d.L0(), iVar.f383756d.D0(), false, 4, null), iVar.f383756d);
                        }
                        if (iVar.f383756d.J0() != 0) {
                            long J0 = iVar.f383756d.J0();
                            if (J0 != 0) {
                                java.util.Iterator it7 = arrayList5.iterator();
                                int i19 = 0;
                                while (it7.hasNext()) {
                                    if (((jv2.i) it7.next()).f383756d.t0() == J0) {
                                        i17 = i19;
                                        break;
                                    }
                                    i19++;
                                }
                            }
                            i17 = -1;
                            if (i17 >= 0) {
                                i18 = i17;
                            }
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var12 = q3Var.f211906m;
                        java.lang.Object layoutManager = (a5Var12 == null || (m82555x4905e9fa2 = a5Var12.s().m82555x4905e9fa()) == null) ? null : m82555x4905e9fa2.getLayoutManager();
                        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
                        if (c1162x665295de != null) {
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                            arrayList6.add(0);
                            arrayList6.add(java.lang.Integer.valueOf(i18));
                            java.util.Collections.reverse(arrayList6);
                            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de2 = c1162x665295de;
                            yj0.a.d(c1162x665295de2, arrayList6.toArray(), "com/tencent/mm/plugin/finder/uniComments/UniCommentDrawerPresenter$refreshData$1$4", "call", "(Lkotlin/Pair;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                            c1162x665295de.P(((java.lang.Integer) arrayList6.get(0)).intValue(), ((java.lang.Integer) arrayList6.get(1)).intValue());
                            yj0.a.f(c1162x665295de2, "com/tencent/mm/plugin/finder/uniComments/UniCommentDrawerPresenter$refreshData$1$4", "call", "(Lkotlin/Pair;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                        }
                    }
                    str = str2;
                }
            }
            str2 = "MicroMsg.MusicUni.DrawerPresenter";
            str = str2;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[refreshData] Cost=");
        sb6.append(java.lang.System.currentTimeMillis() - this.f211880c);
        sb6.append("ms, succ:");
        sb6.append(list != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        this.f211881d.b(fp0.u.f346823f);
        return jz5.f0.f384359a;
    }
}
