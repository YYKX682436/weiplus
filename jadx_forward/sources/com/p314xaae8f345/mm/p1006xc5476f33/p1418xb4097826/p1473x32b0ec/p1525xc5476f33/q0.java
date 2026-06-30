package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class q0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public final android.view.ViewGroup f195473p;

    /* renamed from: q, reason: collision with root package name */
    public long f195474q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.FrameLayout f195475r;

    /* renamed from: s, reason: collision with root package name */
    public final ml2.u f195476s;

    /* renamed from: t, reason: collision with root package name */
    public yz5.a f195477t;

    /* renamed from: u, reason: collision with root package name */
    public final yz5.p f195478u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(android.view.ViewGroup rootView, qo0.c statusMonitor) {
        super(rootView, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f195473p = rootView;
        this.f195474q = -1L;
        this.f195475r = (android.widget.FrameLayout) rootView.findViewById(com.p314xaae8f345.mm.R.id.i4p);
        this.f195476s = new ml2.u();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveAdVideoSlice", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
        K0(8);
        this.f195478u = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.h0(this);
    }

    public static void w1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.q0 q0Var, java.lang.String str, boolean z17, int i17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0 ob0Var;
        q0Var.getClass();
        mm2.f fVar = mm2.f.f410550h;
        q0Var.A1(fVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveAdVideoPlugin", "loadStartupVideo come complete.");
        q0Var.K0(8);
        mm2.w wVar = (mm2.w) q0Var.P0(mm2.w.class);
        mm2.f fVar2 = (mm2.f) wVar.f411036o.mo3195x754a37bb();
        if (fVar2 == mm2.f.f410549g || fVar2 == fVar) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveAdVideoSlice", "stopLivingVideoPlayer state:" + fVar2);
            wVar.R6();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LiveAdVideoSlice", "stopLivingVideoPlayer return for invalid state:" + fVar2);
        }
        android.widget.FrameLayout frameLayout = q0Var.f195475r;
        frameLayout.removeAllViews();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w0 w0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w0) q0Var.X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w0.class);
        if (w0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAdVideoTimerPlugin", "hideProgressTimerTv");
            w0Var.f196368q.setVisibility(8);
            if (w0Var.f196369r.getVisibility() == 8) {
                w0Var.K0(8);
            }
        }
        if (!dk2.ef.f314905a.z() && (ob0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0) q0Var.X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0.class)) != null) {
            ob0Var.E1(false);
        }
        frameLayout.setOnTouchListener(null);
    }

    public final void A1(mm2.f fVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAdVideoPlugin", "setAdVideoState value:" + fVar);
        ((mm2.w) P0(mm2.w.class)).f411036o.mo523x53d8522f(fVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        super.M0(status, bundle);
        int ordinal = status.ordinal();
        if (ordinal == 7) {
            dk2.ef.f314925k.e(16, new r45.bd2(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.n0(this, r45.cd2.class), true);
            if (((mm2.w) P0(mm2.w.class)).P6()) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(this, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p0(this, null), 3, null);
            return;
        }
        ml2.u uVar = this.f195476s;
        if (ordinal == 82) {
            uVar.getClass();
            uVar.f409561b = c01.id.c();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", 1);
            jSONObject.put("advertise_type", 3);
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderAdVideoReporter", "reportStartupVideoEnter json: " + jSONObject);
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.r0.hj((ml2.r0) c17, ml2.b4.D1, t17, 0L, null, null, null, null, null, 252, null);
            return;
        }
        if (ordinal == 123) {
            if (!(((mm2.w6) P0(mm2.w6.class)).f411051f.size() > 0) || ((mm2.w) P0(mm2.w.class)).P6()) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(this, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o0(this, null), 3, null);
            return;
        }
        switch (ordinal) {
            case 20:
                if (uVar.f409561b == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderAdVideoReporter", "reportBannerExit return for bannerEnter:" + uVar.f409561b);
                    return;
                }
                long c18 = c01.id.c() - uVar.f409561b;
                uVar.f409561b = 0L;
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put("type", 2);
                jSONObject3.put("advertise_type", 3);
                jSONObject3.put("watch_duration", c18);
                java.lang.String jSONObject4 = jSONObject3.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
                java.lang.String t18 = r26.i0.t(jSONObject4, ",", ";", false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderAdVideoReporter", "reportStartupVideoExit json: " + jSONObject3);
                i95.m c19 = i95.n0.c(ml2.r0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
                ml2.r0.hj((ml2.r0) c19, ml2.b4.D1, t18, 0L, null, null, null, null, null, 252, null);
                return;
            case 21:
                ((mm2.w) P0(mm2.w.class)).f411033i = mm2.i.f410660e;
                if (((mm2.w) P0(mm2.w.class)).f411037p != null) {
                    this.f195475r.removeAllViews();
                    return;
                }
                return;
            case 22:
                ((mm2.w) P0(mm2.w.class)).f411033i = mm2.i.f410661f;
                return;
            default:
                return;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        super.O0();
        K0(8);
        if (((mm2.w) P0(mm2.w.class)).P6()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAdVideoPlugin", "unMount handleStartupVideoStop");
            x1(((mm2.w) P0(mm2.w.class)).f411035n, false);
        }
        this.f195475r.removeAllViews();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return false;
    }

    public final boolean t1() {
        if (u1() != mm2.f.f410549g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveAdVideoPlugin", "checkResumeVideoView return for state:" + u1());
            return false;
        }
        mm2.h hVar = ((mm2.w) P0(mm2.w.class)).f411037p;
        if (hVar == null) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAdVideoPlugin", "reUsePlayerView view" + hVar);
        android.view.ViewParent parent = hVar.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAdVideoPlugin", "reUsePlayerView remove view:" + hVar);
            viewGroup.removeAllViews();
        }
        yz5.p pVar = this.f195478u;
        hVar.m147954x887cd1cb(pVar);
        hVar.m147949xed92507e(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.i0(this));
        hVar.m147948x6d4d6833(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.j0(this));
        hVar.m147953xfc7b4f0e(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.k0(this));
        hVar.m147952x1aa44e73(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l0(this));
        K0(0);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        android.widget.FrameLayout frameLayout = this.f195475r;
        frameLayout.addView(hVar, layoutParams);
        frameLayout.requestLayout();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.h0) pVar).mo149xb9724478(java.lang.Integer.valueOf(((mm2.w) P0(mm2.w.class)).f411038q), java.lang.Integer.valueOf(((mm2.w) P0(mm2.w.class)).f411039r));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w0 w0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w0) X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w0.class);
        if (w0Var != null) {
            android.animation.ValueAnimator valueAnimator = w0Var.f196373v;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            w0Var.t1();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w0 w0Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w0) X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w0.class);
        if (w0Var2 != null) {
            android.animation.ValueAnimator valueAnimator2 = w0Var2.f196373v;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            w0Var2.t1();
        }
        return true;
    }

    public final mm2.f u1() {
        mm2.f fVar = (mm2.f) ((mm2.w) P0(mm2.w.class)).f411036o.mo3195x754a37bb();
        return fVar == null ? mm2.f.f410546d : fVar;
    }

    public final mm2.h v1() {
        mm2.h hVar = ((mm2.w) P0(mm2.w.class)).f411037p;
        if (hVar instanceof mm2.h) {
            return hVar;
        }
        return null;
    }

    public final void x1(java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0 ob0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0) X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0.class);
        if (ob0Var != null) {
            ob0Var.E1(false);
        }
        mm2.f fVar = mm2.f.f410548f;
        A1(fVar);
        yz5.a aVar = this.f195477t;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        this.f195477t = null;
        K0(8);
        ig2.r f17 = ig2.m.f372926a.f(V0().f390662d.f150082s);
        if (f17 != null) {
            f17.h();
        }
        mm2.w wVar = (mm2.w) P0(mm2.w.class);
        mm2.f fVar2 = (mm2.f) wVar.f411036o.mo3195x754a37bb();
        if (fVar2 == mm2.f.f410547e || fVar2 == mm2.f.f410551i || fVar2 == fVar) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveAdVideoSlice", "stopStartupVideoPlayer state:" + fVar2);
            wVar.R6();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LiveAdVideoSlice", "stopStartupVideoPlayer return for invalid state:" + fVar2);
        }
        android.widget.FrameLayout frameLayout = this.f195475r;
        frameLayout.removeAllViews();
        frameLayout.setOnTouchListener(null);
    }

    public final void y1(r45.ce2 ce2Var) {
        if (ce2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveAdVideoPlugin", "loadLiveBg return for loadVideo:" + ce2Var);
            return;
        }
        java.lang.String m75945x2fec8307 = ce2Var.m75945x2fec8307(4);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        if (m75945x2fec8307.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveAdVideoPlugin", "loadLiveBg return for url:".concat(m75945x2fec8307));
            return;
        }
        android.widget.ImageView imageView = (android.widget.ImageView) this.f195473p.findViewById(com.p314xaae8f345.mm.R.id.i4q);
        mn2.g1 g1Var = mn2.g1.f411508a;
        vo0.d e17 = g1Var.e();
        mn2.q3 q3Var = new mn2.q3(m75945x2fec8307, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
        e17.c(q3Var, imageView, g1Var.h(mn2.f1.f411486d));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
        super.z0();
        ((mm2.w) P0(mm2.w.class)).f411030f.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.m0(this));
        ((mm2.w) P0(mm2.w.class)).f411036o.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.f0(this));
        ((mm2.w) P0(mm2.w.class)).f411034m.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.g0(this));
    }

    public final boolean z1(r45.ce2 ce2Var, long j17, yz5.a aVar) {
        kn0.p pVar;
        if (ce2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveAdVideoPlugin", "loadVideo return for loadVideo:" + ce2Var);
            return false;
        }
        tn0.w0 w0Var = dk2.ef.f314911d;
        if ((w0Var == null || (pVar = w0Var.D) == null || pVar.i()) ? false : true) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveAdVideoPlugin", "loadVideo return for liveState nor normal mode");
            return false;
        }
        java.lang.String m75945x2fec8307 = ce2Var.m75945x2fec8307(3);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        if (m75945x2fec8307.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveAdVideoPlugin", "loadVideo return for url:".concat(m75945x2fec8307));
            return false;
        }
        nk2.l.f419554a.b(nk2.a.f419486f);
        mm2.w wVar = (mm2.w) P0(mm2.w.class);
        java.lang.String m75945x2fec83072 = ce2Var.m75945x2fec8307(0);
        wVar.f411035n = m75945x2fec83072 != null ? m75945x2fec83072 : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAdVideoPlugin", "loadVideo start play startPositionMs:" + j17 + " duration:" + ce2Var.m75942xfb822ef2(2) + " url:" + m75945x2fec8307);
        K0(0);
        if (v1() == null) {
            mm2.w wVar2 = (mm2.w) P0(mm2.w.class);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            wVar2.f411037p = new mm2.h(context);
        }
        mm2.h v17 = v1();
        if (v17 != null) {
            v17.B = java.lang.System.currentTimeMillis();
            v17.m66744x2a55bdd7().b(false);
        }
        mm2.h v18 = v1();
        if (v18 != null) {
            return v18.u(ce2Var, j17, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c0(this, aVar));
        }
        return false;
    }
}
