package com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic;

/* loaded from: classes10.dex */
public final class c0 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v0 f239903d;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v0 v0Var) {
        this.f239903d = v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        android.view.View view;
        java.util.List m82898xfb7e5820;
        java.util.List<ox3.a> m82898xfb7e58202;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf;
        java.util.List m82898xfb7e58203;
        java.util.List m82898xfb7e58204;
        java.util.List m82898xfb7e58205;
        java.util.List m82898xfb7e58206;
        px3.b bVar = (px3.b) obj;
        if (bVar instanceof px3.a) {
            px3.a aVar = (px3.a) bVar;
            int i17 = aVar.f440468b;
            com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v0 v0Var = this.f239903d;
            if (i17 != 1) {
                java.util.List<ox3.a> list = aVar.f440467a;
                if (i17 != 4) {
                    if (i17 != 5) {
                        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = v0Var.f240051m;
                        int size = (c22848x6ddd90cf2 == null || (m82898xfb7e58206 = c22848x6ddd90cf2.m82898xfb7e5820()) == null) ? 0 : m82898xfb7e58206.size();
                        if (list != null) {
                            for (ox3.a aVar2 : list) {
                                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf3 = v0Var.f240051m;
                                ox3.a aVar3 = null;
                                if (c22848x6ddd90cf3 != null && (m82898xfb7e58205 = c22848x6ddd90cf3.m82898xfb7e5820()) != null) {
                                    java.util.Iterator it = m82898xfb7e58205.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        java.lang.Object next = it.next();
                                        if (((ox3.a) next).mo2128x1ed62e84() == aVar2.mo2128x1ed62e84()) {
                                            aVar3 = next;
                                            break;
                                        }
                                    }
                                    aVar3 = aVar3;
                                }
                                if (aVar3 == null) {
                                    com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf4 = v0Var.f240051m;
                                    if (c22848x6ddd90cf4 != null && (m82898xfb7e58204 = c22848x6ddd90cf4.m82898xfb7e5820()) != null) {
                                        m82898xfb7e58204.add(aVar2);
                                    }
                                } else {
                                    aVar3.f431255e = false;
                                    com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf5 = v0Var.f240051m;
                                    if (c22848x6ddd90cf5 != null) {
                                        c22848x6ddd90cf5.d0(aVar3.mo2128x1ed62e84(), java.lang.Boolean.FALSE);
                                    }
                                }
                            }
                        }
                        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf6 = v0Var.f240051m;
                        if (((c22848x6ddd90cf6 == null || (m82898xfb7e58203 = c22848x6ddd90cf6.m82898xfb7e5820()) == null || !(m82898xfb7e58203.isEmpty() ^ true)) ? false : true) && (c22848x6ddd90cf = v0Var.f240051m) != null) {
                            c22848x6ddd90cf.m8151xc67946d3(size, list != null ? list.size() : 0);
                        }
                    } else if (list != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.addAll(list);
                        v0Var.P6(arrayList);
                        java.util.Iterator it6 = arrayList.iterator();
                        while (it6.hasNext()) {
                            ox3.a aVar4 = (ox3.a) it6.next();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "current member  data must be init from cache " + aVar4.f431254d.f497121d + " and " + aVar4.f431254d);
                        }
                        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf7 = v0Var.f240051m;
                        if (c22848x6ddd90cf7 != null) {
                            c22848x6ddd90cf7.m8146xced61ae5();
                        }
                    }
                } else if (list != null) {
                    for (ox3.a aVar5 : list) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "current member  data must be delete " + aVar5.f431254d.f497121d + " and " + aVar5.f431254d);
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf8 = v0Var.f240051m;
                        if (c22848x6ddd90cf8 != null && (m82898xfb7e58202 = c22848x6ddd90cf8.m82898xfb7e5820()) != null) {
                            for (ox3.a aVar6 : m82898xfb7e58202) {
                                if (aVar6.mo2128x1ed62e84() != aVar5.mo2128x1ed62e84()) {
                                    arrayList2.add(aVar6);
                                } else if (aVar6.f431255e) {
                                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = v0Var.m158354x19263085();
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.z1) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.z1.class)).O6();
                                }
                            }
                        }
                        v0Var.P6(arrayList2);
                        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf9 = v0Var.f240051m;
                        if (c22848x6ddd90cf9 != null) {
                            c22848x6ddd90cf9.e0(aVar5.mo2128x1ed62e84());
                        }
                    }
                }
            } else {
                v0Var.P6(new java.util.ArrayList());
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf10 = v0Var.f240051m;
            boolean z17 = (c22848x6ddd90cf10 == null || (m82898xfb7e5820 = c22848x6ddd90cf10.m82898xfb7e5820()) == null || !m82898xfb7e5820.isEmpty()) ? false : true;
            jz5.g gVar = v0Var.f240050i;
            jz5.g gVar2 = v0Var.f240047f;
            jz5.g gVar3 = v0Var.f240048g;
            if (z17) {
                view = (android.view.View) ((jz5.n) gVar2).mo141623x754a37bb();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/ringtone/uic/RingtoneExclusiveMainUIC", "refreshAddUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/ringtone/uic/RingtoneExclusiveMainUIC", "refreshAddUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view2 = (android.view.View) ((jz5.n) gVar3).mo141623x754a37bb();
                if (view2 != null) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(8);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/ringtone/uic/RingtoneExclusiveMainUIC", "refreshAddUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/ringtone/uic/RingtoneExclusiveMainUIC", "refreshAddUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View view3 = (android.view.View) ((jz5.n) gVar).mo141623x754a37bb();
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view3, arrayList5.toArray(), "com/tencent/mm/plugin/ringtone/uic/RingtoneExclusiveMainUIC", "refreshAddUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/ringtone/uic/RingtoneExclusiveMainUIC", "refreshAddUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                view = (android.view.View) ((jz5.n) gVar3).mo141623x754a37bb();
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList6.add(0);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(view, arrayList6.toArray(), "com/tencent/mm/plugin/ringtone/uic/RingtoneExclusiveMainUIC", "refreshAddUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/ringtone/uic/RingtoneExclusiveMainUIC", "refreshAddUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view4 = (android.view.View) ((jz5.n) gVar2).mo141623x754a37bb();
                if (view4 != null) {
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    arrayList7.add(8);
                    java.util.Collections.reverse(arrayList7);
                    yj0.a.d(view4, arrayList7.toArray(), "com/tencent/mm/plugin/ringtone/uic/RingtoneExclusiveMainUIC", "refreshAddUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/ringtone/uic/RingtoneExclusiveMainUIC", "refreshAddUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View view5 = (android.view.View) ((jz5.n) gVar).mo141623x754a37bb();
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                arrayList8.add(0);
                java.util.Collections.reverse(arrayList8);
                yj0.a.d(view5, arrayList8.toArray(), "com/tencent/mm/plugin/ringtone/uic/RingtoneExclusiveMainUIC", "refreshAddUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/ringtone/uic/RingtoneExclusiveMainUIC", "refreshAddUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            view.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.s0(v0Var));
            android.graphics.Rect rect = new android.graphics.Rect();
            view.getHitRect(rect);
            rect.right += 100;
            rect.bottom += 100;
            java.lang.Object parent = view.getParent();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.View");
            ((android.view.View) parent).setTouchDelegate(new android.view.TouchDelegate(rect, view));
        }
        return jz5.f0.f384359a;
    }
}
