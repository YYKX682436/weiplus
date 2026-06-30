package mx0;

/* loaded from: classes5.dex */
public final class q2 implements mx0.x {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f413766d;

    /* renamed from: e, reason: collision with root package name */
    public final mx0.r1 f413767e;

    /* renamed from: f, reason: collision with root package name */
    public final mx0.z f413768f;

    /* renamed from: g, reason: collision with root package name */
    public final yx0.b8 f413769g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f413770h;

    /* renamed from: i, reason: collision with root package name */
    public int f413771i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f413772m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f413773n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f413774o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f413775p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f413776q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f413777r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f413778s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f413779t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 f413780u;

    public q2(android.view.ViewGroup parent, mx0.r1 micMutePlugin, mx0.z controller, yx0.b8 templateCorePlugin, wx0.g1 subtitlePlugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micMutePlugin, "micMutePlugin");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateCorePlugin, "templateCorePlugin");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subtitlePlugin, "subtitlePlugin");
        this.f413766d = parent;
        this.f413767e = micMutePlugin;
        this.f413768f = controller;
        this.f413769g = templateCorePlugin;
        this.f413772m = jz5.h.b(new mx0.l2(this));
        this.f413773n = jz5.h.b(new mx0.j2(this));
        this.f413774o = jz5.h.b(new mx0.o2(this));
        this.f413775p = jz5.h.b(new mx0.i2(this));
        this.f413776q = jz5.h.b(new mx0.p2(this));
        jz5.g b17 = jz5.h.b(new mx0.z1(this));
        this.f413777r = b17;
        this.f413778s = jz5.h.b(new mx0.h2(this));
        this.f413779t = jz5.h.b(new mx0.k2(this));
        c().setSelected(true);
        e().setOnClickListener(new mx0.x1(this));
        java.lang.Object mo141623x754a37bb = ((jz5.n) b17).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((android.view.View) mo141623x754a37bb).setOnClickListener(new mx0.y1(this));
    }

    public static final void a(mx0.q2 q2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a, java.lang.String str) {
        q2Var.getClass();
        c16997xb0aa383a.f237248i = str;
        boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(str);
        c16997xb0aa383a.f237249m = j17;
        if (j17) {
            i95.m c17 = i95.n0.c(m40.k0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ((c61.p7) ((m40.k0) c17)).fj(str);
        }
    }

    public void b() {
        e().setEnabled(false);
        if (this.f413771i != 0) {
            return;
        }
        e().animate().cancel();
        e().animate().alpha(0.8f).setDuration(300L).start();
    }

    public final android.widget.TextView c() {
        java.lang.Object mo141623x754a37bb = this.f413773n.mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.widget.TextView) mo141623x754a37bb;
    }

    public final mx0.k3 d() {
        return (mx0.k3) ((jz5.n) this.f413779t).mo141623x754a37bb();
    }

    public final android.view.View e() {
        java.lang.Object mo141623x754a37bb = this.f413772m.mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    public final void f(boolean z17) {
        if (this.f413770h == z17) {
            return;
        }
        this.f413770h = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.e0 e0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.e0) ((com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10976xccdd83a4) d().o().e()).b(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.e0.class);
        if (e0Var != null) {
            e0Var.E(z17);
        }
        jz5.g gVar = this.f413778s;
        jz5.g gVar2 = this.f413775p;
        jz5.g gVar3 = this.f413777r;
        jz5.g gVar4 = this.f413776q;
        jz5.g gVar5 = this.f413774o;
        mx0.r1 r1Var = this.f413767e;
        if (z17) {
            r1Var.mo9067x901b6914(0);
            java.lang.Object mo141623x754a37bb = ((jz5.n) gVar5).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
            android.view.View view = (android.view.View) mo141623x754a37bb;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/MusicEntranceV2Plugin", "onHaveMusicChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/shoot_composing/MusicEntranceV2Plugin", "onHaveMusicChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.lang.Object mo141623x754a37bb2 = ((jz5.n) gVar4).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
            android.view.View view2 = (android.view.View) mo141623x754a37bb2;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/MusicEntranceV2Plugin", "onHaveMusicChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/shoot_composing/MusicEntranceV2Plugin", "onHaveMusicChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.lang.Object mo141623x754a37bb3 = ((jz5.n) gVar3).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb3, "getValue(...)");
            android.view.View view3 = (android.view.View) mo141623x754a37bb3;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/MusicEntranceV2Plugin", "onHaveMusicChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/mj_publisher/finder/shoot_composing/MusicEntranceV2Plugin", "onHaveMusicChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.lang.Object mo141623x754a37bb4 = ((jz5.n) gVar2).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb4, "getValue(...)");
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) mo141623x754a37bb4).setVisibility(8);
            java.lang.Object mo141623x754a37bb5 = ((jz5.n) gVar).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb5, "getValue(...)");
            android.view.View view4 = (android.view.View) mo141623x754a37bb5;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/MusicEntranceV2Plugin", "onHaveMusicChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/mj_publisher/finder/shoot_composing/MusicEntranceV2Plugin", "onHaveMusicChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        r1Var.mo9067x901b6914(8);
        java.lang.Object mo141623x754a37bb6 = ((jz5.n) gVar5).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb6, "getValue(...)");
        android.view.View view5 = (android.view.View) mo141623x754a37bb6;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/MusicEntranceV2Plugin", "onHaveMusicChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/mj_publisher/finder/shoot_composing/MusicEntranceV2Plugin", "onHaveMusicChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.Object mo141623x754a37bb7 = ((jz5.n) gVar4).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb7, "getValue(...)");
        android.view.View view6 = (android.view.View) mo141623x754a37bb7;
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(8);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/MusicEntranceV2Plugin", "onHaveMusicChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(view6, "com/tencent/mm/mj_publisher/finder/shoot_composing/MusicEntranceV2Plugin", "onHaveMusicChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.Object mo141623x754a37bb8 = ((jz5.n) gVar3).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb8, "getValue(...)");
        android.view.View view7 = (android.view.View) mo141623x754a37bb8;
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        arrayList7.add(8);
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/MusicEntranceV2Plugin", "onHaveMusicChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
        yj0.a.f(view7, "com/tencent/mm/mj_publisher/finder/shoot_composing/MusicEntranceV2Plugin", "onHaveMusicChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.Object mo141623x754a37bb9 = ((jz5.n) gVar2).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb9, "getValue(...)");
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) mo141623x754a37bb9).setVisibility(0);
        java.lang.Object mo141623x754a37bb10 = ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb10, "getValue(...)");
        android.view.View view8 = (android.view.View) mo141623x754a37bb10;
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        arrayList8.add(0);
        java.util.Collections.reverse(arrayList8);
        yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/MusicEntranceV2Plugin", "onHaveMusicChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
        yj0.a.f(view8, "com/tencent/mm/mj_publisher/finder/shoot_composing/MusicEntranceV2Plugin", "onHaveMusicChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void g(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.f d17;
        c().setText(i65.a.r(this.f413766d.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.lng));
        c().requestFocus();
        f(false);
        if (!z17 || (d17 = ((com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10976xccdd83a4) d().o().e()).d()) == null) {
            return;
        }
        d17.t(null, false);
    }

    @Override // yt3.r2
    /* renamed from: onBackPress */
    public boolean mo9064x4ceae47d() {
        mx0.k3 d17 = d();
        if (!d17.f303887d || !d17.f303887d) {
            return false;
        }
        d17.g().mo68201x76500a7f(false);
        return true;
    }

    @Override // yt3.r2
    /* renamed from: onPause */
    public void mo11000xb01dfb57() {
        mx0.k3 d17 = d();
        if (d17.f303887d) {
            ev0.t.c(d17.f303886c, false, null, 3, null);
        }
    }

    @Override // yt3.r2
    /* renamed from: onResume */
    public void mo11001x57429eec() {
        mx0.k3 d17 = d();
        if (d17.f303887d) {
            d17.f303886c.d();
        }
    }

    @Override // yt3.r2
    /* renamed from: release */
    public void mo9065x41012807() {
        d().e();
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        if (this.f413771i == i17) {
            return;
        }
        this.f413771i = i17;
        if (i17 == 0) {
            sa5.d.c(e(), 0.0f, 0L, null, 7, null);
        } else {
            sa5.d.d(e(), 0, 0L, null, 7, null);
        }
    }

    @Override // yt3.r2
    public void t(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configProvider, "configProvider");
        this.f413780u = configProvider;
    }
}
