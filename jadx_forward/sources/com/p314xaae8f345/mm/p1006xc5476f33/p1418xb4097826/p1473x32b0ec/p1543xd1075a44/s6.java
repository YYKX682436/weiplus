package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class s6 extends xt2.m6 implements jf2.i {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f201257d;

    /* renamed from: e, reason: collision with root package name */
    public final qo0.c f201258e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f201259f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f201260g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f201261h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f201262i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f201263m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f201264n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f201265o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f201266p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f201267q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f201268r;

    public s6(android.view.ViewGroup root, qo0.c statusMonitor, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        this.f201257d = root;
        this.f201258e = statusMonitor;
        this.f201259f = basePlugin;
        this.f201260g = "Finder.FinderLiveAnchorMicEntranceWidget";
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.f566074ek2);
        this.f201261h = findViewById;
        this.f201262i = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.f566077ek5);
        android.widget.ImageView imageView = (android.widget.ImageView) root.findViewById(com.p314xaae8f345.mm.R.id.f566073ek1);
        this.f201263m = imageView;
        this.f201264n = root.findViewById(com.p314xaae8f345.mm.R.id.f566076ek4);
        this.f201265o = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.f566075ek3);
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.i2z);
        this.f201266p = findViewById2;
        this.f201267q = "anchorlive.bottom.connectmic";
        this.f201268r = "";
        android.graphics.drawable.Drawable drawable = root.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f79176x608e1841);
        com.p314xaae8f345.mm.ui.uk.f(drawable, root.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
        imageView.setImageDrawable(drawable);
        findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.r6(this));
        ll2.e eVar = ll2.e.f400666a;
        java.lang.Object context = root.getContext();
        ll2.e.l(eVar, context instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) context : null, "anchorlive.bottom.connectmic", findViewById2, null, null, 24, null);
    }

    @Override // jf2.h
    public void b() {
        this.f201257d.setVisibility(0);
    }

    @Override // xt2.m6
    public android.view.View f() {
        return this.f201261h;
    }

    @Override // jf2.h
    public void g() {
        this.f201257d.setVisibility(8);
    }

    @Override // xt2.m6
    public android.view.ViewGroup h() {
        return this.f201257d;
    }

    @Override // jf2.h
    public boolean i() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f201259f;
        boolean F1 = zl2.r4.F1(lVar.S0());
        android.view.ViewGroup viewGroup = this.f201257d;
        if (F1) {
            n(8);
        } else {
            mm2.e1 e1Var = (mm2.e1) dk2.ef.f314905a.i(mm2.e1.class);
            boolean z17 = e1Var != null && e1Var.f7();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f201260g, "#checkVisible isScreenCastGameMode=" + z17);
            if (z17) {
                n(8);
            } else {
                if (sn0.b.f491497e2 != null) {
                    viewGroup.setVisibility(8);
                } else if (zl2.r4.f555483a.N1(lVar.S0()) || !((((mm2.o4) lVar.P0(mm2.o4.class)).k7() || ((java.lang.Boolean) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.o4) lVar.P0(mm2.o4.class)).H).mo144003x754a37bb()).booleanValue()) && !((mm2.c1) lVar.P0(mm2.c1.class)).L9() && ((mm2.c1) lVar.P0(mm2.c1.class)).a8())) {
                    viewGroup.setVisibility(8);
                } else {
                    if (viewGroup.getVisibility() != 0) {
                        i95.m c17 = i95.n0.c(ml2.j0.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                        zy2.zb.I8((zy2.zb) c17, ml2.u1.f409634y, null, null, null, null, null, false, 126, null);
                        i95.m c18 = i95.n0.c(ml2.j0.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                        zy2.zb.I8((zy2.zb) c18, ml2.u1.Q, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f409449f), null, null, null, null, false, 124, null);
                        ((ml2.j0) i95.n0.c(ml2.j0.class)).Vj(ml2.q2.B1, "", -1, -1);
                    }
                    if (((mm2.c1) lVar.P0(mm2.c1.class)).f410311a5) {
                        viewGroup.setVisibility(8);
                    } else {
                        viewGroup.setVisibility(0);
                    }
                }
            }
        }
        return viewGroup.getVisibility() == 0;
    }

    @Override // xt2.m6
    public android.widget.ImageView j() {
        android.widget.ImageView linkMicIcon = this.f201263m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkMicIcon, "linkMicIcon");
        return linkMicIcon;
    }

    public final void k() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f201259f;
        java.util.List list = ((mm2.o4) lVar.P0(mm2.o4.class)).f410851o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-linkMicUserList>(...)");
        boolean m17 = m(list);
        android.widget.ImageView imageView = this.f201263m;
        android.view.View view = this.f201261h;
        android.view.ViewGroup viewGroup = this.f201257d;
        if (!m17 && !((mm2.o4) lVar.P0(mm2.o4.class)).D && ((mm2.o4) lVar.P0(mm2.o4.class)).Z == null) {
            java.util.List list2 = ((mm2.o4) lVar.P0(mm2.o4.class)).f410860v;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list2, "<get-audienceLinkMicUserList>(...)");
            if (!m(list2)) {
                java.util.List list3 = ((mm2.o4) lVar.P0(mm2.o4.class)).f410857s;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list3, "<get-anchorPkMicUserList>(...)");
                if (!m(list3)) {
                    android.graphics.drawable.Drawable drawable = viewGroup.getContext().getResources().getDrawable(l());
                    com.p314xaae8f345.mm.ui.uk.f(drawable, viewGroup.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
                    imageView.setImageDrawable(drawable);
                    view.setBackground(viewGroup.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a6z));
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c4 c4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c4) lVar.X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c4.class);
                    if (c4Var != null) {
                        int i17 = c4Var.f194147r;
                        if (view != null) {
                            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.qf0(view, i17));
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
        android.graphics.drawable.Drawable drawable2 = viewGroup.getContext().getResources().getDrawable(l());
        com.p314xaae8f345.mm.ui.uk.f(drawable2, viewGroup.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96));
        imageView.setImageDrawable(drawable2);
        view.setBackground(viewGroup.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563295a70));
    }

    public final int l() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f201259f;
        if (((mm2.e1) lVar.P0(mm2.e1.class)).b7()) {
            return com.p314xaae8f345.mm.R.raw.f79554x87a331d;
        }
        if (((mm2.e1) lVar.P0(mm2.e1.class)).Z6()) {
            return com.p314xaae8f345.mm.R.raw.f78735xb0feab21;
        }
        dk2.u4 u4Var = ((mm2.o4) lVar.P0(mm2.o4.class)).Z;
        return u4Var != null ? (u4Var.k() || u4Var.g()) ? com.p314xaae8f345.mm.R.raw.f79972x53b89329 : com.p314xaae8f345.mm.R.raw.f79176x608e1841 : com.p314xaae8f345.mm.R.raw.f79176x608e1841;
    }

    public final boolean m(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            km2.q qVar = (km2.q) obj;
            if (true ^ (qVar.A > 0 && c01.id.c() > qVar.A)) {
                arrayList.add(obj);
            }
        }
        return !arrayList.isEmpty();
    }

    public final void n(int i17) {
        boolean N1 = zl2.r4.f555483a.N1(this.f201259f.S0());
        android.view.ViewGroup viewGroup = this.f201257d;
        if (!N1) {
            viewGroup.setVisibility(i17);
        } else {
            viewGroup.setVisibility(8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f201260g, "setVisible return for isDisableLinkMic");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0207  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o() {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.s6.o():void");
    }

    @Override // jf2.h
    /* renamed from: type */
    public int mo58036x368f3a() {
        return 10;
    }
}
