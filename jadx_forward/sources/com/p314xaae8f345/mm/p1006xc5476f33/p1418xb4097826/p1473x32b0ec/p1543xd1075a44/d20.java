package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class d20 extends xt2.m implements jf2.o, jf2.l, jf2.m {

    /* renamed from: o, reason: collision with root package name */
    public final android.view.ViewGroup f199575o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.ImageView f199576p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f199577q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f199578r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f199579s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d20(android.view.ViewGroup root, qo0.c statusMonitor, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin) {
        super(root, statusMonitor, basePlugin);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        this.f199575o = root;
        this.f199579s = true;
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.f0o);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById;
        this.f199576p = imageView;
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.f2j);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f199577q = findViewById2;
        imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(root.getContext(), com.p314xaae8f345.mm.R.raw.f79175x4357406f, root.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230)));
        dy1.a.i(root, "finder_live_room_gift_icon");
        dy1.a.l(root, 8, 25561);
        root.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.a20(this));
        s();
    }

    @Override // jf2.l
    public void F(int i17) {
        w();
    }

    public final void a(boolean z17) {
        this.f199579s = z17;
        boolean r17 = r(z17);
        android.view.ViewGroup viewGroup = this.f199575o;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f538410f;
        if (r17 && !((mm2.e1) lVar.P0(mm2.e1.class)).A) {
            ((mm2.e1) lVar.P0(mm2.e1.class)).A = true;
            dk2.xf j17 = dk2.ef.f314905a.j(lVar.R0());
            if (j17 != null) {
                android.content.Context context = viewGroup.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                dk2.r4 r4Var = (dk2.r4) j17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4Var.f315542d, "[WeCoin] initEngine");
                js4.i iVar = (js4.i) gm0.j1.s(js4.i.class);
                dk2.t2 t2Var = new dk2.t2(r4Var, null, null);
                ((ms4.z) iVar).getClass();
                ms4.j0.f412579e.b(context, t2Var);
            }
        }
        if (viewGroup.getVisibility() != 0) {
            if (this.f199578r) {
                dk2.ef.f314925k.f(17);
                this.f199578r = false;
                return;
            }
            return;
        }
        if (this.f199578r) {
            return;
        }
        je2.w wVar = (je2.w) lVar.P0(je2.w.class);
        dk2.tb tbVar = dk2.ef.f314925k;
        tbVar.f(17);
        r45.uc2 uc2Var = new r45.uc2();
        uc2Var.set(0, wVar.f380815i);
        tbVar.e(17, uc2Var, new je2.v(wVar, r45.vc2.class), false);
        this.f199578r = true;
    }

    @Override // jf2.o
    public void b() {
        android.view.ViewGroup viewGroup = this.f199575o;
        if (viewGroup.getVisibility() != 0) {
            w();
        }
        viewGroup.setVisibility(0);
    }

    @Override // jf2.l
    public jz5.l d() {
        return new jz5.l(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79189xc83534ef), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.mip));
    }

    @Override // jf2.m
    public void e(int i17) {
        t();
    }

    @Override // xt2.m6
    public android.view.View f() {
        return this.f199575o.findViewById(com.p314xaae8f345.mm.R.id.ezy);
    }

    @Override // jf2.o
    public void g() {
        this.f199575o.setVisibility(8);
    }

    @Override // xt2.m6
    public android.view.ViewGroup h() {
        return this.f199575o;
    }

    @Override // jf2.o
    public boolean i() {
        return r(this.f199579s);
    }

    @Override // xt2.m6
    public android.widget.ImageView j() {
        return this.f199576p;
    }

    @Override // xt2.m
    public java.lang.String k() {
        return "";
    }

    @Override // xt2.m
    public java.lang.String l() {
        return "FinderLiveVisitorGiftWidget";
    }

    @Override // xt2.m
    public com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b m() {
        android.view.View findViewById = this.f199575o.findViewById(com.p314xaae8f345.mm.R.id.f566198f34);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        return (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) findViewById;
    }

    public final boolean r(boolean z17) {
        if (!((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
            m92.b I1 = g92.a.I1(g92.b.f351302e, false, 1, null);
            if (!(I1 != null && I1.v0())) {
                if (!z17 || zl2.r4.f555483a.P1(this.f538410f.S0()) || ((mm2.c1) this.f538410f.P0(mm2.c1.class)).T) {
                    return false;
                }
                return !(((mm2.n0) this.f538410f.P0(mm2.n0.class)).f410806r) && ((mm2.c1) this.f538410f.P0(mm2.c1.class)).m7() && ((mm2.c1) this.f538410f.P0(mm2.c1.class)).a8();
            }
        }
        this.f199575o.setVisibility(8);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderLiveVisitorGiftWidget", "setVisible return for isTeenMode or accountLimit");
        return false;
    }

    public final void s() {
        boolean o17 = gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_NEED_SHOW_PKG_REDDOT_BOOLEAN_SYNC, false);
        android.view.View view = this.f199577q;
        int i17 = o17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGiftWidget", "checkPkgRedDot", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGiftWidget", "checkPkgRedDot", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void t() {
        xu2.u uVar;
        xu2.v vVar;
        r45.yx1 Q6;
        java.lang.Object obj;
        km2.q qVar;
        ae2.in inVar = ae2.in.f85221a;
        jz5.g gVar = ae2.in.f85238b6;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).intValue() != -1) {
            int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).intValue();
            if (intValue == 1) {
                zl2.r4 r4Var = zl2.r4.f555483a;
                android.content.Context context = this.f199575o.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                if (r4Var.v(context, "FinderLiveLegalPromot1", com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.b20.f199346d)) {
                    return;
                }
            } else if (intValue == 2) {
                zl2.r4 r4Var2 = zl2.r4.f555483a;
                android.content.Context context2 = this.f199575o.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                if (r4Var2.v(context2, "FinderLiveLegalPromot2", com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c20.f199479d)) {
                    return;
                }
            }
        }
        qo0.c cVar = this.f538409e;
        qo0.b bVar = qo0.b.S1;
        android.os.Bundle bundle = new android.os.Bundle();
        if (((mm2.e1) this.f538410f.P0(mm2.e1.class)).b7() && (Q6 = ((om2.g) this.f538410f.P0(om2.g.class)).Q6()) != null && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(Q6.f473002r, ((mm2.c1) this.f538410f.P0(mm2.c1.class)).m8())) {
            java.lang.String str = Q6.f473002r;
            if (str == null) {
                str = "";
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, ((mm2.o4) this.f538410f.P0(mm2.o4.class)).a7().f390703a)) {
                qVar = ((mm2.o4) this.f538410f.P0(mm2.o4.class)).a7();
            } else {
                java.util.List list = ((mm2.o4) this.f538410f.P0(mm2.o4.class)).f410860v;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-audienceLinkMicUserList>(...)");
                synchronized (list) {
                    java.util.Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it.next();
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((km2.q) obj).f390703a, str)) {
                                break;
                            }
                        }
                    }
                }
                qVar = (km2.q) obj;
            }
            if (qVar != null) {
                bundle.putString("PARAM_FINDER_LIVE_LINK_USERNAME", qVar.f390705c);
                bundle.putString("PARAM_FINDER_LIVE_LINK_NICKNAME", qVar.f390706d);
                bundle.putString("PARAM_FINDER_LIVE_LINK_AVATAR", qVar.f390704b);
            }
        }
        cVar.mo46557x60d69242(bVar, bundle);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.f409514r, null, null, null, null, null, false, 126, null);
        if (!((mm2.c1) this.f538410f.P0(mm2.c1.class)).M7() || (uVar = (xu2.u) this.f538410f.X0(xu2.u.class)) == null || (vVar = uVar.f538765r) == null) {
            return;
        }
        vVar.a();
        vVar.c(2017);
    }

    @Override // jf2.o
    /* renamed from: type */
    public int mo57989x368f3a() {
        return 15;
    }

    public final void w() {
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.I8((zy2.zb) c17, ml2.u1.f409630x, null, null, null, null, null, false, 126, null);
        boolean z17 = ((ml2.r0) i95.n0.c(ml2.r0.class)).O1;
        android.view.ViewGroup viewGroup = this.f199575o;
        if (!z17) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_exp", viewGroup, null, 25561);
        }
        ((ml2.r0) i95.n0.c(ml2.r0.class)).Wj(ml2.h5.f409063n, "", viewGroup.getVisibility());
    }
}
