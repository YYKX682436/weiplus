package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e;

/* loaded from: classes8.dex */
public final class i0 implements pf5.g {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f202468d;

    /* renamed from: e, reason: collision with root package name */
    public final int f202469e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f202470f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f202471g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.j f202472h;

    /* renamed from: i, reason: collision with root package name */
    public r45.vs2 f202473i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f202474m;

    /* renamed from: n, reason: collision with root package name */
    public vn2.q f202475n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f202476o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f202477p;

    public i0(android.app.Activity activity, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f202468d = activity;
        this.f202469e = i17;
        this.f202471g = "";
        this.f202474m = "";
        if (!vn2.u0.f519921b) {
            if (((a03.h0) ((n40.o) i95.n0.c(n40.o.class))).f81959n != null) {
                java.lang.String str = ((a03.h0) ((n40.o) i95.n0.c(n40.o.class))).f81962q;
                this.f202471g = str == null ? "" : str;
            }
        }
        if (this.f202471g.length() == 0) {
            java.lang.String uuid = java.util.UUID.randomUUID().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
            this.f202471g = "47-2-281-".concat(r26.i0.t(uuid, "-", "", false));
        }
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).Bi(this.f202471g);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.h0 h0Var = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.O7).mo141623x754a37bb()).r()).intValue() == 1 ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.h0.f202461d : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = activity instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        if (nyVar != null) {
            nyVar.k7(281, 2, h0Var);
        }
        pf5.z zVar = pf5.z.f435481a;
        if (!(activity instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        zy2.ra raVar = (zy2.ra) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity).c(zy2.ra.class);
        java.lang.String str2 = this.f202471g;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) raVar).f216915p = str2;
        if (i17 == 1 || i17 == 2) {
            if (vn2.u0.f519921b) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.z0 z0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.z0(activity, str2);
                android.view.View h17 = ((xn2.f1) ((jz5.n) z0Var.f202574e).mo141623x754a37bb()).h();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h17, "<get-root>(...)");
                this.f202470f = h17;
                this.f202472h = z0Var;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.w0 w0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.w0(activity, str2);
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) w0Var.f202559d).mo141623x754a37bb();
                n40.o oVar = (n40.o) i95.n0.c(n40.o.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup);
                a03.h0 h0Var2 = (a03.h0) oVar;
                h0Var2.getClass();
                android.app.Activity context = w0Var.f202556a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                java.lang.String contextId = w0Var.f202557b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextId, "contextId");
                ((qk.t6) ((jz5.n) h0Var2.f81963r).mo141623x754a37bb()).b();
                p3325xe03a0797.p3326xc267989b.l.d(h0Var2.f81958m, null, p3325xe03a0797.p3326xc267989b.a1.UNDISPATCHED, new a03.d0(h0Var2, context, contextId, null), 1, null);
                this.f202470f = viewGroup;
                this.f202472h = w0Var;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(this.f202472h, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.megavideo.topstory.flow.IRequest");
        }
        this.f202475n = new vn2.q(this.f202471g);
    }

    public final int a(android.app.Activity activity) {
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 m81203x2b036519;
        int hashCode = activity.hashCode();
        if (!(activity instanceof com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37)) {
            return hashCode;
        }
        try {
            com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = activity instanceof com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 ? (com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37) activity : null;
            return (abstractActivityC22579xbed01a37 == null || (m81203x2b036519 = abstractActivityC22579xbed01a37.m81203x2b036519()) == null) ? hashCode : m81203x2b036519.m7479x8cdac1b();
        } catch (jz5.e0 unused) {
            return hashCode;
        }
    }

    public final void b(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MegaVideo.TopStoryMegaVideoUICProxy", "isCreate from " + this.f202477p + " to " + z17);
        this.f202477p = z17;
    }

    @Override // pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        vn2.u0.f519920a.m("Finder.MegaVideo.TopStoryMegaVideoUICProxy", "onDestroy");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.j jVar = this.f202472h;
        if (jVar != null) {
            jVar.mo58228xac79a11b();
        }
        this.f202472h = null;
        android.view.View view = this.f202470f;
        android.view.ViewParent parent = view != null ? view.getParent() : null;
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this.f202470f);
        }
        this.f202470f = null;
        this.f202475n = null;
    }

    @Override // pf5.g
    /* renamed from: onNewIntent */
    public void mo2280xc944513d(android.content.Intent intent) {
        vn2.u0.f519920a.m("Finder.MegaVideo.TopStoryMegaVideoUICProxy", "onNewIntent intent=" + intent);
    }

    @Override // pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        vn2.q qVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.j jVar = this.f202472h;
        java.lang.Boolean valueOf = jVar != null ? java.lang.Boolean.valueOf(jVar.mo58229xb01dfb57()) : null;
        vn2.u0.f519920a.m("Finder.MegaVideo.TopStoryMegaVideoUICProxy", "onPause sessionExit=" + valueOf);
        vn2.q qVar2 = this.f202475n;
        if (qVar2 != null) {
            qVar2.c();
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, java.lang.Boolean.TRUE) || (qVar = this.f202475n) == null) {
            return;
        }
        qVar.f();
    }

    @Override // pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        vn2.q qVar;
        vn2.u0.f519920a.m("Finder.MegaVideo.TopStoryMegaVideoUICProxy", "onResume isCreated=" + this.f202477p);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.j jVar = this.f202472h;
        java.lang.Boolean valueOf = jVar != null ? java.lang.Boolean.valueOf(jVar.e(this.f202477p)) : null;
        if (this.f202476o && !this.f202477p) {
            vn2.q qVar2 = this.f202475n;
            if (qVar2 != null) {
                qVar2.b();
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, java.lang.Boolean.TRUE) && (qVar = this.f202475n) != null) {
                qVar.e();
            }
        }
        b(false);
    }

    @Override // pf5.g
    /* renamed from: onStart */
    public void mo2286xb05099c3() {
        vn2.u0.f519920a.m("Finder.MegaVideo.TopStoryMegaVideoUICProxy", "onStart");
        vn2.q qVar = this.f202475n;
        if (qVar != null) {
            qVar.f519894g = "TopStoryHomeUI";
        }
        android.app.Activity activity = this.f202468d;
        if (qVar != null) {
            qVar.f519895h = a(activity);
        }
        vn2.q qVar2 = this.f202475n;
        if (qVar2 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            qVar2.d("onStart ".concat(activity.getClass().getName()));
            qVar2.f519890c = activity;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.j jVar = this.f202472h;
        if (jVar != null) {
            jVar.mo58230xb05099c3();
        }
    }

    @Override // pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
        vn2.u0.f519920a.m("Finder.MegaVideo.TopStoryMegaVideoUICProxy", "onStop");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.j jVar = this.f202472h;
        if (jVar != null) {
            jVar.mo58231xc39f8281();
        }
        vn2.q qVar = this.f202475n;
        if (qVar != null) {
            qVar.a(this.f202468d);
        }
    }
}
