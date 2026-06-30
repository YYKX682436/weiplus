package gp2;

/* loaded from: classes10.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gp2.l0 f355746d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(gp2.l0 l0Var) {
        super(1);
        this.f355746d = l0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17;
        int intValue = ((java.lang.Number) obj).intValue();
        gp2.l0 l0Var = this.f355746d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(l0Var.t(), "invokeOnTouchMoveCallback pos:" + intValue);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = l0Var.f355776b;
        if (c1163xf1deaba4 != null) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4.getLayoutManager();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager");
            android.view.View mo7935xa188593e = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15416x1f1f78b7) layoutManager).mo7935xa188593e(intValue);
            if (mo7935xa188593e != null) {
                if (l0Var.f355778d && !l0Var.B) {
                    in5.c cVar = (in5.c) l0Var.f355777c.get(intValue - l0Var.s());
                    if (cVar instanceof so2.h1) {
                        r45.nw1 m76794xd0557130 = ((so2.h1) cVar).getFeedObject().getFeedObject().m76794xd0557130();
                        z17 = !(m76794xd0557130 != null && m76794xd0557130.m75939xb282bd08(2) == 1);
                    } else {
                        z17 = false;
                    }
                    if (!z17) {
                        android.view.KeyEvent.Callback findViewWithTag = mo7935xa188593e.findViewWithTag("nearby-live-preview-view-tag");
                        ws5.f fVar = findViewWithTag instanceof ws5.f ? (ws5.f) findViewWithTag : null;
                        if ((fVar != null ? fVar.getF212277m() : true) && !iq.b.p()) {
                            gp2.w0 w0Var = new gp2.w0(mo7935xa188593e, intValue, l0Var.A(intValue));
                            android.view.View view = w0Var.f355873b;
                            if (view != null) {
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                                arrayList.add(0);
                                java.util.Collections.reverse(arrayList);
                                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                                yj0.a.f(view, "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                            boolean z18 = w0Var.f355872a;
                            android.view.View view2 = w0Var.f355874c;
                            android.view.View view3 = w0Var.f355877f;
                            if (z18) {
                                if (view2 != null) {
                                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                                    arrayList2.add(0);
                                    java.util.Collections.reverse(arrayList2);
                                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                }
                                android.view.View view4 = w0Var.f355875d;
                                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                                arrayList3.add(0);
                                java.util.Collections.reverse(arrayList3);
                                yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                                yj0.a.f(view4, "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                boolean a17 = w0Var.a();
                                android.view.View view5 = w0Var.f355876e;
                                if (a17) {
                                    if (view5 != null) {
                                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                                        arrayList4.add(0);
                                        java.util.Collections.reverse(arrayList4);
                                        yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                                        yj0.a.f(view5, "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    }
                                } else if (view5 != null) {
                                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                                    arrayList5.add(8);
                                    java.util.Collections.reverse(arrayList5);
                                    yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                                    yj0.a.f(view5, "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                }
                                if (view3 != null) {
                                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                                    arrayList6.add(8);
                                    java.util.Collections.reverse(arrayList6);
                                    yj0.a.d(view3, arrayList6.toArray(), "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view3.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                                    yj0.a.f(view3, "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                }
                            } else {
                                if (view3 != null) {
                                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                                    java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                                    arrayList7.add(0);
                                    java.util.Collections.reverse(arrayList7);
                                    yj0.a.d(view3, arrayList7.toArray(), "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view3.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                                    yj0.a.f(view3, "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                }
                                android.view.View view6 = w0Var.f355878g;
                                if (view6 != null) {
                                    java.util.ArrayList arrayList8 = new java.util.ArrayList();
                                    java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
                                    arrayList8.add(0);
                                    java.util.Collections.reverse(arrayList8);
                                    yj0.a.d(view6, arrayList8.toArray(), "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view6.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                                    yj0.a.f(view6, "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                }
                                boolean a18 = w0Var.a();
                                android.view.View view7 = w0Var.f355879h;
                                if (a18) {
                                    if (view7 != null) {
                                        java.util.ArrayList arrayList9 = new java.util.ArrayList();
                                        java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
                                        arrayList9.add(0);
                                        java.util.Collections.reverse(arrayList9);
                                        yj0.a.d(view7, arrayList9.toArray(), "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        view7.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                                        yj0.a.f(view7, "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    }
                                } else if (view7 != null) {
                                    java.util.ArrayList arrayList10 = new java.util.ArrayList();
                                    java.lang.ThreadLocal threadLocal7 = zj0.c.f554818a;
                                    arrayList10.add(8);
                                    java.util.Collections.reverse(arrayList10);
                                    yj0.a.d(view7, arrayList10.toArray(), "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view7.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
                                    yj0.a.f(view7, "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                }
                                if (view2 != null) {
                                    java.util.ArrayList arrayList11 = new java.util.ArrayList();
                                    java.lang.ThreadLocal threadLocal8 = zj0.c.f554818a;
                                    arrayList11.add(8);
                                    java.util.Collections.reverse(arrayList11);
                                    yj0.a.d(view2, arrayList11.toArray(), "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view2.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
                                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                }
                            }
                        }
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
