package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes10.dex */
public final class ub0 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nc0 f217654d;

    public ub0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nc0 nc0Var) {
        this.f217654d = nc0Var;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.util.List m82898xfb7e5820;
        java.util.List list;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf;
        java.util.List m82898xfb7e58202;
        java.util.List m82898xfb7e58203;
        java.util.List m82898xfb7e58204;
        boolean z17;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2;
        java.util.List m82898xfb7e58205;
        java.util.List m82898xfb7e58206;
        boolean z18;
        java.util.List m82898xfb7e58207;
        ed0.s0 s0Var = (ed0.s0) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nc0 nc0Var = this.f217654d;
        nc0Var.Q6().e(true);
        int i17 = s0Var.f332760b;
        int i18 = 0;
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf3 = nc0Var.f216850o;
            if (c22848x6ddd90cf3 != null && (m82898xfb7e5820 = c22848x6ddd90cf3.m82898xfb7e5820()) != null) {
                m82898xfb7e5820.clear();
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf4 = nc0Var.f216850o;
            if (c22848x6ddd90cf4 != null) {
                c22848x6ddd90cf4.m8146xced61ae5();
            }
            nc0Var.Q6().E(false);
            android.view.View O6 = nc0Var.O6();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(O6, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC", "showInitView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            O6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(O6, "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC", "showInitView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View P6 = nc0Var.P6();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(P6, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC", "showInitView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            P6.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(P6, "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC", "showInitView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (i17 == 2) {
            android.view.View O62 = nc0Var.O6();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(O62, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC", "showLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            O62.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(O62, "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC", "showLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View P62 = nc0Var.P6();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(P62, arrayList4.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC", "showLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            P62.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(P62, "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC", "showLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (i17 != 4) {
            nc0Var.f216853r = false;
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf5 = nc0Var.f216850o;
            int size = (c22848x6ddd90cf5 == null || (m82898xfb7e58207 = c22848x6ddd90cf5.m82898xfb7e5820()) == null) ? 0 : m82898xfb7e58207.size();
            java.util.List<ox3.f> list2 = s0Var.f332759a;
            if (list2 != null) {
                for (ox3.f fVar : list2) {
                    com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf6 = nc0Var.f216850o;
                    if (c22848x6ddd90cf6 != null && (m82898xfb7e58206 = c22848x6ddd90cf6.m82898xfb7e5820()) != null) {
                        if (!m82898xfb7e58206.isEmpty()) {
                            java.util.Iterator it = m82898xfb7e58206.iterator();
                            while (it.hasNext()) {
                                if (((ox3.f) it.next()).mo2128x1ed62e84() == fVar.mo2128x1ed62e84()) {
                                    z18 = false;
                                    break;
                                }
                            }
                        }
                        z18 = true;
                        if (z18) {
                            z17 = true;
                            if (z17 && (c22848x6ddd90cf2 = nc0Var.f216850o) != null && (m82898xfb7e58205 = c22848x6ddd90cf2.m82898xfb7e5820()) != null) {
                                m82898xfb7e58205.add(fVar);
                            }
                        }
                    }
                    z17 = false;
                    if (z17) {
                        m82898xfb7e58205.add(fVar);
                    }
                }
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf7 = nc0Var.f216850o;
            if ((c22848x6ddd90cf7 == null || (m82898xfb7e58204 = c22848x6ddd90cf7.m82898xfb7e5820()) == null || !m82898xfb7e58204.isEmpty()) ? false : true) {
                android.view.View O63 = nc0Var.O6();
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(O63, arrayList5.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC", "showNoResultVIew", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                O63.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(O63, "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC", "showNoResultVIew", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View P63 = nc0Var.P6();
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.add(0);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(P63, arrayList6.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC", "showNoResultVIew", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                P63.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(P63, "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC", "showNoResultVIew", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View O64 = nc0Var.O6();
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                arrayList7.add(8);
                java.util.Collections.reverse(arrayList7);
                yj0.a.d(O64, arrayList7.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC", "showSearchResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                O64.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(O64, "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC", "showSearchResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View P64 = nc0Var.P6();
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                arrayList8.add(8);
                java.util.Collections.reverse(arrayList8);
                yj0.a.d(P64, arrayList8.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC", "showSearchResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                P64.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                yj0.a.f(P64, "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC", "showSearchResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v) ((dd0.m0) ((ed0.a1) i95.n0.c(ed0.a1.class))).Ai(nc0Var.m158354x19263085())).Q6() && size == 0) {
                    nc0Var.f216854s = 0;
                    com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf8 = nc0Var.f216850o;
                    ox3.f fVar2 = (c22848x6ddd90cf8 == null || (m82898xfb7e58203 = c22848x6ddd90cf8.m82898xfb7e5820()) == null) ? null : (ox3.f) kz5.n0.Z(m82898xfb7e58203);
                    if (fVar2 != null) {
                        ((ox3.g) fVar2).f431283e = true;
                    }
                }
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf9 = nc0Var.f216850o;
                if (c22848x6ddd90cf9 != null && (m82898xfb7e58202 = c22848x6ddd90cf9.m82898xfb7e5820()) != null) {
                    i18 = m82898xfb7e58202.size();
                }
                if (i18 > size && (c22848x6ddd90cf = nc0Var.f216850o) != null) {
                    c22848x6ddd90cf.m8153xd399a4d9(size, i18 - size);
                }
            }
        } else {
            nc0Var.Q6().f();
        }
        ((dd0.m0) ((ed0.a1) i95.n0.c(ed0.a1.class))).Di(nc0Var.m158354x19263085());
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf10 = nc0Var.f216850o;
        if (c22848x6ddd90cf10 == null || (list = c22848x6ddd90cf10.m82898xfb7e5820()) == null) {
            list = kz5.p0.f395529d;
        }
        ox3.f fVar3 = (ox3.f) kz5.n0.Z(list);
        if (fVar3 != null) {
            fVar3.mo2128x1ed62e84();
        }
        return jz5.f0.f384359a;
    }
}
