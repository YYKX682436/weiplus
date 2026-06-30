package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df;

/* loaded from: classes8.dex */
public final class d1 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f256489d;

    /* renamed from: e, reason: collision with root package name */
    public int f256490e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f256489d = "TopStoryLongVideoUIC";
    }

    public final void T6(android.widget.FrameLayout curLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(curLayout, "curLayout");
        wn2.f fVar = (wn2.f) ((zy2.sb) i95.n0.c(zy2.sb.class));
        fVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.i0 i0Var = fVar.f529055f;
        if (i0Var != null) {
            curLayout.setBackgroundColor(curLayout.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77698x3cb0744, null));
            android.view.View view = i0Var.f202470f;
            if (view == null) {
                vn2.u0.f519920a.m("Finder.MegaVideo.TopStoryMegaVideoUICProxy", "handleAddLongVideoView curLayout:" + curLayout.hashCode() + " longVideoView is null!");
                return;
            }
            android.view.ViewParent parent = view.getParent();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(parent, curLayout)) {
                vn2.u0.f519920a.m("Finder.MegaVideo.TopStoryMegaVideoUICProxy", "handleAddLongVideoView parent is ok, do nothing");
                return;
            }
            if (parent != null) {
                android.view.View view2 = i0Var.f202470f;
                java.lang.Object parent2 = view2 != null ? view2.getParent() : null;
                android.view.ViewGroup viewGroup = parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null;
                if (viewGroup != null) {
                    viewGroup.removeView(i0Var.f202470f);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MegaVideo.TopStoryMegaVideoUICProxy", "handleAddLongVideoView remove longvideo from oldParent");
            }
            curLayout.addView(i0Var.f202470f, new android.widget.FrameLayout.LayoutParams(-1, -1));
            vn2.u0.f519920a.m("Finder.MegaVideo.TopStoryMegaVideoUICProxy", "handleAddLongVideoView add longvideo view");
        }
    }

    public final void U6(int i17) {
        if (i17 != this.f256490e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f256489d, "initPageEnterType from " + this.f256490e + " to " + i17 + '!');
        }
        this.f256490e = i17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        ((zy2.sb) i95.n0.c(zy2.sb.class)).getClass();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        ((zy2.sb) i95.n0.c(zy2.sb.class)).getClass();
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBeforeFinish */
    public void mo2275x62f76871(android.content.Intent intent) {
        ((zy2.sb) i95.n0.c(zy2.sb.class)).getClass();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onBeforeFinishAfterTransition */
    public void mo72291x8d1ceba0() {
        ((zy2.sb) i95.n0.c(zy2.sb.class)).getClass();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onClickDialogSpaceOnHalfScreenMode */
    public boolean mo10662xe0085496() {
        ((zy2.sb) i95.n0.c(zy2.sb.class)).getClass();
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onConfigurationChanged */
    public void mo2276x50e1c15d(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        ((wn2.f) ((zy2.sb) i95.n0.c(zy2.sb.class))).getClass();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        ((wn2.f) ((zy2.sb) i95.n0.c(zy2.sb.class))).Ni(bundle);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        ((zy2.sb) i95.n0.c(zy2.sb.class)).getClass();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateBefore */
    public void mo2277xb2f1ab1a(android.os.Bundle bundle) {
        boolean z17;
        boolean z18;
        zy2.sb sbVar = (zy2.sb) i95.n0.c(zy2.sb.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = m158354x19263085();
        wn2.f fVar = (wn2.f) sbVar;
        fVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        boolean z19 = true;
        vn2.u0.f519921b = !vn2.u0.f519920a.k();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        jz5.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.D7;
        vn2.u0.f519922c = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).intValue();
        ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209588z7).mo141623x754a37bb()).l();
        ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).l();
        vn2.u0.f519923d = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.E7).mo141623x754a37bb()).r()).intValue() == 1;
        vn2.u0.f519924e = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.J7).mo141623x754a37bb()).r()).intValue() == 1;
        fVar.Ui(fVar.Di());
        r45.sd4 sd4Var = ((ey2.g1) pf5.u.f435469a.e(c61.l7.class).a(ey2.g1.class)).f338911g;
        if (((java.lang.Boolean) t70Var.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            z17 = false;
        }
        if (z17 || z65.c.a()) {
            z18 = true;
        } else {
            kb2.b bVar = kb2.b.f387758a;
            z18 = false;
        }
        if (z18) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("get longVideoInfoInPorcess=");
            r45.td4 td4Var = (r45.td4) sd4Var.m75936x14adae67(0);
            sb6.append(td4Var != null ? td4Var.m75945x2fec8307(0) : null);
            sb6.append(", longVideoInfoInTabLifecycle=");
            r45.td4 td4Var2 = (r45.td4) fVar.f529054e.m75936x14adae67(0);
            sb6.append(td4Var2 != null ? td4Var2.m75945x2fec8307(0) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MegaVideo.TopStoryMegaVideoService", sb6.toString());
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sd4Var, "<this>");
        r45.sd4 sd4Var2 = new r45.sd4();
        r45.td4 td4Var3 = new r45.td4();
        r45.td4 td4Var4 = (r45.td4) sd4Var.m75936x14adae67(0);
        td4Var3.set(0, td4Var4 != null ? td4Var4.m75945x2fec8307(0) : null);
        r45.td4 td4Var5 = (r45.td4) sd4Var.m75936x14adae67(0);
        td4Var3.set(1, td4Var5 != null ? td4Var5.m75945x2fec8307(1) : null);
        r45.td4 td4Var6 = (r45.td4) sd4Var.m75936x14adae67(0);
        td4Var3.set(2, td4Var6 != null ? td4Var6.m75945x2fec8307(2) : null);
        sd4Var2.set(0, td4Var3);
        fVar.Ri(sd4Var2);
        int i17 = fVar.f529053d;
        if (i17 != 1 && i17 != 2) {
            z19 = false;
        }
        if (z19) {
            fVar.f529055f = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.i0(context, i17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MegaVideo.TopStoryMegaVideoService", "init but switch disable!");
        }
        ((zy2.sb) i95.n0.c(zy2.sb.class)).getClass();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        ((wn2.f) ((zy2.sb) i95.n0.c(zy2.sb.class))).mo451xac79a11b();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onFinished */
    public void mo13982x7cf2e371() {
        ((zy2.sb) i95.n0.c(zy2.sb.class)).getClass();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onInterceptFinish */
    public boolean mo63118xdd2ad016() {
        ((zy2.sb) i95.n0.c(zy2.sb.class)).getClass();
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onKeyDown */
    public boolean mo2278x1f03f0c2(int i17, android.view.KeyEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        ((wn2.f) ((zy2.sb) i95.n0.c(zy2.sb.class))).getClass();
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onKeyUp */
    public boolean mo2279xafd962bb(int i17, android.view.KeyEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        ((wn2.f) ((zy2.sb) i95.n0.c(zy2.sb.class))).getClass();
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onNewIntent */
    public void mo2280xc944513d(android.content.Intent intent) {
        ((wn2.f) ((zy2.sb) i95.n0.c(zy2.sb.class))).mo2280xc944513d(intent);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        ((wn2.f) ((zy2.sb) i95.n0.c(zy2.sb.class))).mo2281xb01dfb57();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onPostDestroyed */
    public void mo47481x6449b5ba() {
        ((zy2.sb) i95.n0.c(zy2.sb.class)).getClass();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onPreDestroyed */
    public void mo47482x6fa9d635() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.i0 i0Var = ((wn2.f) ((zy2.sb) i95.n0.c(zy2.sb.class))).f529055f;
        if (i0Var != null) {
            android.app.Activity context = i0Var.f202468d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            if (context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) {
                nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
            } else {
                nyVar = null;
            }
            if (nyVar != null) {
                nyVar.mo47482x6fa9d635();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onRequestPermissionsResult */
    public void mo2282x953457f1(int i17, java.lang.String[] permissions, int[] grantResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
        ((wn2.f) ((zy2.sb) i95.n0.c(zy2.sb.class))).mo2282x953457f1(i17, permissions, grantResults);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onRestoreInstanceState */
    public void mo2283xb949e58d(android.os.Bundle bundle) {
        ((zy2.sb) i95.n0.c(zy2.sb.class)).getClass();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        ((wn2.f) ((zy2.sb) i95.n0.c(zy2.sb.class))).mo2284x57429eec();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onSaveInstanceState */
    public void mo2285xa71a2260(android.os.Bundle bundle) {
        ((zy2.sb) i95.n0.c(zy2.sb.class)).getClass();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStart */
    public void mo2286xb05099c3() {
        ((wn2.f) ((zy2.sb) i95.n0.c(zy2.sb.class))).mo2286xb05099c3();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onStartActivityForResult */
    public void mo14640xb30cf874(android.content.Intent intent, int i17, android.os.Bundle bundle) {
        ((zy2.sb) i95.n0.c(zy2.sb.class)).getClass();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
        ((wn2.f) ((zy2.sb) i95.n0.c(zy2.sb.class))).mo2287xc39f8281();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onUserVisibleFocused */
    public void mo58275xd317978f() {
        super.mo58275xd317978f();
        ((zy2.sb) i95.n0.c(zy2.sb.class)).getClass();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onUserVisibleUnFocused */
    public void mo58437xaa858cb6() {
        super.mo58437xaa858cb6();
        ((zy2.sb) i95.n0.c(zy2.sb.class)).getClass();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onViewCreated */
    public void mo47092x594b1124(android.view.View contentView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentView, "contentView");
        ((wn2.f) ((zy2.sb) i95.n0.c(zy2.sb.class))).getClass();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onWindowFocusChanged */
    public void mo14961xa4ec7b0b(boolean z17) {
        ((zy2.sb) i95.n0.c(zy2.sb.class)).getClass();
    }
}
