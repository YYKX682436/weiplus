package sp2;

/* loaded from: classes2.dex */
public final class b0 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: n, reason: collision with root package name */
    public static r45.h81 f492510n;

    /* renamed from: d, reason: collision with root package name */
    public qp2.z f492511d;

    /* renamed from: e, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f492512e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f492513f;

    /* renamed from: g, reason: collision with root package name */
    public int f492514g;

    /* renamed from: h, reason: collision with root package name */
    public p012xc85e97e9.p093xedfae76a.k0 f492515h;

    /* renamed from: i, reason: collision with root package name */
    public long f492516i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f492517m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f492512e = p3325xe03a0797.p3326xc267989b.z0.b();
        this.f492517m = "";
    }

    public final void O6(ll2.a aVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveEntranceFragmentUICMoreIcon", "[checkLivePersonCenterRedDotReport] lastExposePersonalCenterTipsId=" + this.f492517m);
        ll2.e eVar = ll2.e.f400666a;
        ll2.b[] bVarArr = ll2.b.f400661d;
        this.f492517m = eVar.n(java.lang.String.valueOf(13), "LivePersonalCenter", aVar.f400660d, this.f492517m);
    }

    public final void P6(r45.dk2 dk2Var, boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkShowMode flags: ");
        sb6.append(dk2Var != null ? java.lang.Integer.valueOf(dk2Var.m75939xb282bd08(11)) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveEntranceFragmentUICMoreIcon", sb6.toString());
        if (pm0.v.z(dk2Var != null ? dk2Var.m75939xb282bd08(11) : 0, 1)) {
            android.view.View mo144222x4ff8c0f0 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.b1h);
            mo144222x4ff8c0f0.setContentDescription(m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571349ck));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(mo144222x4ff8c0f0, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon", "showSearchEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo144222x4ff8c0f0.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(mo144222x4ff8c0f0, "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon", "showSearchEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.b1i);
            if (c22699x3dcdb352 != null) {
                if (c22699x3dcdb352.getVisibility() == 8) {
                    S6("main_page_search", true);
                }
                c22699x3dcdb352.setVisibility(0);
                c22699x3dcdb352.setOnClickListener(new sp2.a0(this));
                c22699x3dcdb352.setContentDescription(c22699x3dcdb352.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jzr));
                su4.f1 f1Var = (su4.f1) i95.n0.c(su4.f1.class);
                if (f1Var != null) {
                    android.content.Context context = c22699x3dcdb352.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    ((sg0.h3) f1Var).Ai(125, context);
                }
            }
        } else {
            android.view.View mo144222x4ff8c0f02 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.b1i);
            if (mo144222x4ff8c0f02 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(mo144222x4ff8c0f02, arrayList2.toArray(), "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon", "checkShowMode", "(Lcom/tencent/mm/protocal/protobuf/FinderNavLiveStreamResponse;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                mo144222x4ff8c0f02.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(mo144222x4ff8c0f02, "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon", "checkShowMode", "(Lcom/tencent/mm/protocal/protobuf/FinderNavLiveStreamResponse;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (z17) {
                android.app.Activity context2 = m80379x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
                pf5.z zVar = pf5.z.f435481a;
                if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((sp2.b0) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(sp2.b0.class)).T6(f492510n);
            } else {
                android.app.Activity context3 = m80379x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context3, "context");
                pf5.z zVar2 = pf5.z.f435481a;
                if (!(context3 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                sp2.b0 b0Var = (sp2.b0) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context3).a(sp2.b0.class);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = b0Var.m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar2.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
                rq2.s sVar = rq2.s.f480412a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNearbyLiveLoadingReporter", "tickTabCgiStart");
                rq2.s.f480420i = c01.id.c();
                b0Var.f492511d = new qp2.z(V6, 9, null, null, null, null, 60, null);
                gm0.j1.d().a(4210, b0Var);
                gm0.j1.d().g(b0Var.f492511d);
            }
        }
        if (pm0.v.z(dk2Var != null ? dk2Var.m75939xb282bd08(11) : 0, 2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveEntranceFragmentUICMoreIcon", "checkPreloadPersonalCenterPage");
            this.f492514g = hashCode();
            p3325xe03a0797.p3326xc267989b.l.d(v65.m.b(m158354x19263085()), null, null, new sp2.t(this, null), 3, null);
        }
    }

    public final void Q6(int i17, android.content.Context ctx, r45.dd2 dd2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctx, "ctx");
        pf5.z zVar = pf5.z.f435481a;
        if (!(ctx instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        java.lang.String m75945x2fec8307 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) ctx).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6().m75945x2fec8307(1);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        ip2.a.f375152h = 2;
        uc.n nVar = (uc.n) i95.n0.c(uc.n.class);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_request_scene", 9);
        if (dd2Var != null) {
            intent.putExtra("nearby_live_target_square_page_params_key", dd2Var.mo14344x5f01b1f6());
            nq2.d dVar = nq2.d.f420513a;
            android.content.Intent m158359x1e885992 = m158359x1e885992();
            if (m158359x1e885992 == null) {
                m158359x1e885992 = new android.content.Intent();
            }
            int m75939xb282bd08 = dd2Var.m75939xb282bd08(0);
            java.lang.String m75945x2fec83072 = dd2Var.m75945x2fec8307(1);
            if (m75945x2fec83072 == null) {
                m75945x2fec83072 = "";
            }
            dVar.l(m158359x1e885992, m75939xb282bd08, i17, m75945x2fec83072);
        }
        intent.putExtra("key_context_id", m75945x2fec8307);
        intent.putExtra("enter_from_type", 1);
        ((v40.s) nVar).Ai(ctx, intent);
        android.app.Activity activity = ctx instanceof android.app.Activity ? (android.app.Activity) ctx : null;
        if (activity != null) {
            pf5.z zVar2 = pf5.z.f435481a;
            boolean z17 = activity instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112;
            if (!z17) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity;
            r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar2.a(activityC0065xcd7aa112).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
            if (!z17) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            p012xc85e97e9.p093xedfae76a.c1 a17 = zVar2.a(activityC0065xcd7aa112).a(rq2.w.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            ((rq2.w) a17).Q6(V6.m75945x2fec8307(1), "main_page_recmd_more", "");
        }
        S6("main_page_more_button", false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R6(r45.dd2 r22) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sp2.b0.R6(r45.dd2):void");
    }

    public final void S6(java.lang.String eid, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eid, "eid");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        if (m158354x19263085 != null) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
            p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(m158354x19263085).a(rq2.w.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            rq2.w wVar = (rq2.w) a17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveEntranceFragmentUICMoreIcon", "optionIconReport: " + z17);
            if (z17) {
                wVar.P6("", V6.m75945x2fec8307(1), eid, "");
            } else {
                wVar.Q6(V6.m75945x2fec8307(1), eid, "");
            }
        }
    }

    public final void T6(r45.h81 h81Var) {
        java.util.LinkedList m75941xfb821914 = h81Var != null ? h81Var.m75941xfb821914(9) : null;
        int m75939xb282bd08 = m75941xfb821914 == null || m75941xfb821914.isEmpty() ? 18 : h81Var != null ? h81Var.m75939xb282bd08(4) : 0;
        if (h81Var != null) {
            h81Var.m75941xfb821914(9);
        }
        android.view.View mo144222x4ff8c0f0 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.b1h);
        mo144222x4ff8c0f0.setContentDescription(m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571349ck));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mo144222x4ff8c0f0, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon", "renderTagView", "(ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo144222x4ff8c0f0.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(mo144222x4ff8c0f0, "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon", "renderTagView", "(ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo144222x4ff8c0f0.setOnClickListener(new sp2.z(this, m75939xb282bd08));
        S6("main_page_more_button", true);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(mo144222x4ff8c0f0, arrayList2.toArray(), "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon", "renderTagView$startShow$renderDefault", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo144222x4ff8c0f0.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(mo144222x4ff8c0f0, "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon", "renderTagView$startShow$renderDefault", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        gm0.j1.d().q(4210, this);
        qp2.z zVar = this.f492511d;
        if (zVar != null) {
            if (!(!zVar.m48006xc9602be3())) {
                zVar = null;
            }
            if (zVar != null) {
                gm0.j1.d().d(zVar);
            }
        }
        p3325xe03a0797.p3326xc267989b.z0.e(this.f492512e, null, 1, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        su4.f1 f1Var;
        mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.b1h);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.b1i);
        if (c22699x3dcdb352 == null || c22699x3dcdb352.getVisibility() != 0 || (f1Var = (su4.f1) i95.n0.c(su4.f1.class)) == null) {
            return;
        }
        ((sg0.h3) f1Var).Ai(125, m80379x76847179());
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        gm0.j1.d().q(4210, this);
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.mm.p944x882e457a.o oVar = ((qp2.z) scene).f447361h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oVar);
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLiveTabsResponse");
            f492510n = (r45.h81) fVar;
            pm0.v.X(new sp2.w(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
        super.mo2287xc39f8281();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onUserVisibleFocused */
    public void mo58275xd317978f() {
        super.mo58275xd317978f();
        sp2.y yVar = new sp2.y(this);
        pm0.v.y(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.O, m158354x19263085(), yVar);
        this.f492515h = yVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onUserVisibleUnFocused */
    public void mo58437xaa858cb6() {
        super.mo58275xd317978f();
        p012xc85e97e9.p093xedfae76a.k0 k0Var = this.f492515h;
        if (k0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.O.mo522xb5bdeb7a(k0Var);
            this.f492515h = null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onViewCreated */
    public void mo47092x594b1124(android.view.View contentView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentView, "contentView");
        super.mo47092x594b1124(contentView);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) contentView.findViewById(com.p314xaae8f345.mm.R.id.ico);
        this.f492513f = c22699x3dcdb352;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setContentDescription(contentView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9w));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f492513f;
        if (c22699x3dcdb3522 != null) {
            c22699x3dcdb3522.setOnClickListener(new sp2.x(this));
        }
        android.view.View findViewById = contentView.findViewById(com.p314xaae8f345.mm.R.id.fnn);
        android.view.GestureDetector gestureDetector = new android.view.GestureDetector(m80379x76847179(), new sp2.v(this));
        gestureDetector.setIsLongpressEnabled(false);
        findViewById.setOnTouchListener(new sp2.u(gestureDetector));
    }
}
