package wn2;

@j95.b
/* loaded from: classes8.dex */
public final class f extends i95.w implements zy2.sb {

    /* renamed from: d, reason: collision with root package name */
    public int f529053d;

    /* renamed from: e, reason: collision with root package name */
    public r45.sd4 f529054e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.i0 f529055f;

    public f() {
        new r45.sd4();
        this.f529054e = new r45.sd4();
    }

    public void Ai(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.i0 i0Var = this.f529055f;
        if (i0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MegaVideo.TopStoryMegaVideoUICProxy", "enterFinderLongVideoShareUI");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.j jVar = i0Var.f202472h;
            if (jVar != null) {
                jVar.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.i.f202463f);
            }
        }
    }

    public int Bi() {
        if (wi()) {
            return Di();
        }
        return 0;
    }

    public final int Di() {
        boolean z17;
        int i17 = ((ey2.g1) pf5.u.f435469a.e(c61.l7.class).a(ey2.g1.class)).f338910f;
        boolean z18 = false;
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            z17 = false;
        }
        if (z17 || z65.c.a()) {
            z18 = true;
        } else {
            kb2.b bVar = kb2.b.f387758a;
        }
        if (z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MegaVideo.TopStoryMegaVideoService", "get longVideoSwitchInProcess=" + i17 + ", longVideoSwitchInTabLifecycle=" + this.f529053d);
        }
        return i17;
    }

    public void Ni(android.os.Bundle bundle) {
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.i0 i0Var = this.f529055f;
        if (i0Var != null) {
            i0Var.b(true);
            vn2.u0.f519920a.m("Finder.MegaVideo.TopStoryMegaVideoUICProxy", "onCreate");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.j jVar = i0Var.f202472h;
            if (jVar != null) {
                jVar.mo58227x3e5a77bb(bundle);
            }
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.MegaVideo.TopStoryMegaVideoService", "setup but megaVideoUIC=" + this.f529055f);
        }
    }

    public final void Ri(r45.sd4 sd4Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("modify longVideoInfoInTabLifecycle from ");
        r45.td4 td4Var = (r45.td4) this.f529054e.m75936x14adae67(0);
        sb6.append(td4Var != null ? td4Var.m75945x2fec8307(0) : null);
        sb6.append(" to ");
        r45.td4 td4Var2 = (r45.td4) sd4Var.m75936x14adae67(0);
        sb6.append(td4Var2 != null ? td4Var2.m75945x2fec8307(0) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MegaVideo.TopStoryMegaVideoService", sb6.toString());
        this.f529054e = sd4Var;
    }

    public final void Ui(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MegaVideo.TopStoryMegaVideoService", "modify longVideoSwitchInTabLifecycle from " + this.f529053d + " to " + i17);
        this.f529053d = i17;
    }

    @Override // pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
    }

    @Override // pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        return false;
    }

    @Override // pf5.g
    /* renamed from: onBeforeFinish */
    public void mo2275x62f76871(android.content.Intent intent) {
    }

    @Override // pf5.g
    /* renamed from: onConfigurationChanged */
    public void mo2276x50e1c15d(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
    }

    @Override // pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
    }

    @Override // pf5.g
    /* renamed from: onCreateBefore */
    public void mo2277xb2f1ab1a(android.os.Bundle bundle) {
    }

    @Override // pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        Ui(0);
        Ri(new r45.sd4());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.i0 i0Var = this.f529055f;
        if (i0Var != null) {
            i0Var.mo451xac79a11b();
        }
        this.f529055f = null;
    }

    @Override // pf5.g
    /* renamed from: onKeyDown */
    public boolean mo2278x1f03f0c2(int i17, android.view.KeyEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        return false;
    }

    @Override // pf5.g
    /* renamed from: onKeyUp */
    public boolean mo2279xafd962bb(int i17, android.view.KeyEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        return false;
    }

    @Override // pf5.g
    /* renamed from: onNewIntent */
    public void mo2280xc944513d(android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.i0 i0Var = this.f529055f;
        if (i0Var != null) {
            i0Var.mo2280xc944513d(intent);
        }
    }

    @Override // pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.i0 i0Var = this.f529055f;
        if (i0Var != null) {
            i0Var.mo2281xb01dfb57();
        }
    }

    @Override // pf5.g
    /* renamed from: onRequestPermissionsResult */
    public void mo2282x953457f1(int i17, java.lang.String[] permissions, int[] grantResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
    }

    @Override // pf5.g
    /* renamed from: onRestoreInstanceState */
    public void mo2283xb949e58d(android.os.Bundle bundle) {
    }

    @Override // pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.i0 i0Var = this.f529055f;
        if (i0Var != null) {
            i0Var.mo2284x57429eec();
        }
    }

    @Override // pf5.g
    /* renamed from: onSaveInstanceState */
    public void mo2285xa71a2260(android.os.Bundle bundle) {
    }

    @Override // pf5.g
    /* renamed from: onStart */
    public void mo2286xb05099c3() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.i0 i0Var = this.f529055f;
        if (i0Var != null) {
            i0Var.mo2286xb05099c3();
        }
    }

    @Override // pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.i0 i0Var = this.f529055f;
        if (i0Var != null) {
            i0Var.mo2287xc39f8281();
        }
    }

    public boolean wi() {
        int Di = Di();
        return Di == 1 || Di == 2;
    }
}
