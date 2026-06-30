package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class f30 extends xt2.m6 implements android.view.View.OnClickListener, jf2.o, jf2.l, jf2.m {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f199839d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f199840e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f199841f;

    public f30(android.view.ViewGroup root, qo0.c statusMonitor, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        this.f199839d = root;
        this.f199840e = basePlugin;
        this.f199841f = "Finder.FinderLiveVisitorLuckyMoneyEntranceWidget";
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(root, "finder_live_link_red_packet");
        if (statusMonitor.mo11219xd0598cf8() == 0) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(root, 8, 25561);
        }
        root.setOnClickListener(this);
    }

    @Override // jf2.l
    public void F(int i17) {
        l();
    }

    @Override // jf2.o
    public void b() {
        android.view.ViewGroup viewGroup = this.f199839d;
        if (viewGroup.getVisibility() != 0) {
            l();
        }
        viewGroup.setVisibility(0);
    }

    @Override // jf2.l
    public jz5.l d() {
        return new jz5.l(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f80159xcdecc851), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.dsi));
    }

    @Override // jf2.m
    public void e(int i17) {
        k();
    }

    @Override // xt2.m6
    public android.view.View f() {
        return null;
    }

    @Override // jf2.o
    public void g() {
        this.f199839d.setVisibility(8);
    }

    @Override // xt2.m6
    public android.view.ViewGroup h() {
        return this.f199839d;
    }

    @Override // jf2.o
    public boolean i() {
        java.lang.Object obj;
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f199841f, "setVisible return for isTeenMode");
            return false;
        }
        java.util.List list = ((mm2.o4) this.f199840e.P0(mm2.o4.class)).f410860v;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-audienceLinkMicUserList>(...)");
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(((km2.q) obj).f390703a, ((mm2.c1) this.f199840e.P0(mm2.c1.class)).m8())) {
                    break;
                }
            }
        }
        return obj != null && ((mm2.c1) this.f199840e.P0(mm2.c1.class)).o7() && ((mm2.c1) this.f199840e.P0(mm2.c1.class)).I7().m75939xb282bd08(2) == 1;
    }

    @Override // xt2.m6
    public android.widget.ImageView j() {
        android.view.View findViewById = this.f199839d.findViewById(com.p314xaae8f345.mm.R.id.vnt);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        return (android.widget.ImageView) findViewById;
    }

    public final void k() {
        java.lang.Object obj;
        dk2.xf W0;
        r45.xn1 xn1Var;
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) m17).intValue();
        if (intValue == 0 || intValue == 1) {
            java.util.List list = ((mm2.o4) this.f199840e.P0(mm2.o4.class)).f410860v;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-audienceLinkMicUserList>(...)");
            synchronized (list) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(((km2.q) obj).f390703a, ((mm2.c1) this.f199840e.P0(mm2.c1.class)).m8())) {
                            break;
                        }
                    }
                }
            }
            km2.q qVar = (km2.q) obj;
            if ((qVar == null || (xn1Var = qVar.f390720r) == null || !km2.o.a(xn1Var)) ? false : true) {
                db5.t7.m123883x26a183b(this.f199839d.getContext(), this.f199839d.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mkx), 0).show();
                return;
            } else if ((this.f199839d.getContext() instanceof android.app.Activity) && (W0 = this.f199840e.W0()) != null) {
                android.content.Context context = this.f199839d.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                ((dk2.r4) W0).V((android.app.Activity) context);
            }
        } else {
            db5.t7.m123883x26a183b(this.f199839d.getContext(), this.f199839d.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dsn), 0).show();
        }
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.S, null, null, null, null, null, false, 126, null);
    }

    public final void l() {
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.I8((zy2.zb) c17, ml2.u1.S, null, null, null, null, null, false, 126, null);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorLuckyMoneyEntranceWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.tpx) {
            k();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorLuckyMoneyEntranceWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // jf2.o
    /* renamed from: type */
    public int mo57989x368f3a() {
        return 7;
    }
}
