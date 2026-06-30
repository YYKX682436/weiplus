package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class a80 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f193362p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f193363q;

    /* renamed from: r, reason: collision with root package name */
    public final int f193364r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.Button f193365s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.TextView f193366t;

    /* renamed from: u, reason: collision with root package name */
    public final az2.f f193367u;

    /* renamed from: v, reason: collision with root package name */
    public int f193368v;

    /* renamed from: w, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f193369w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a80(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        az2.f fVar = null;
        this.f193362p = statusMonitor;
        this.f193363q = "Finder.FinderLiveReadyPlugin";
        this.f193364r = 3;
        android.widget.Button button = (android.widget.Button) root.findViewById(com.p314xaae8f345.mm.R.id.fjs);
        this.f193365s = button;
        this.f193366t = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.fjt);
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) root.findViewById(com.p314xaae8f345.mm.R.id.f7v);
        if (progressBar != null) {
            fVar = new az2.f();
            fVar.f97661c = 1000L;
            az2.r rVar = new az2.r();
            rVar.f97684b = progressBar;
            fVar.f97660b = rVar;
        }
        this.f193367u = fVar;
        this.f193368v = 3;
        this.f193369w = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.z70(this), true);
        button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w70(this));
        if (fVar != null) {
            fVar.b();
        }
    }

    @Override // qo0.a
    public boolean B0() {
        if (this.f446856d.getVisibility() != 0) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f193363q, "cancel live by click back.");
        t1();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void K0(int i17) {
        super.K0(i17);
        if (i17 == 4 || i17 == 8) {
            w1();
            this.f193369w.d();
            v1();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        super.M0(status, bundle);
        int ordinal = status.ordinal();
        if (ordinal != 5) {
            if (ordinal == 6) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c(this.f193363q, "ILiveStatusLiveStatusREADY", new java.lang.Object[0]);
                K0(0);
                android.widget.Button button = this.f193365s;
                button.setVisibility(0);
                zl2.r4 r4Var = zl2.r4.f555483a;
                android.content.Context context = button.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                if (!r4Var.Y1(context)) {
                    android.view.ViewGroup.LayoutParams layoutParams = button.getLayoutParams();
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                    if (marginLayoutParams != null) {
                        int i17 = marginLayoutParams.bottomMargin;
                        int c17 = com.p314xaae8f345.mm.ui.bl.c(button.getContext());
                        if (i17 < c17) {
                            i17 = c17;
                        }
                        marginLayoutParams.bottomMargin = i17;
                    }
                    button.setLayoutParams(marginLayoutParams);
                }
                this.f193369w.c(0L, 1000L);
                az2.f fVar = this.f193367u;
                if (fVar != null) {
                    fVar.b();
                    return;
                }
                return;
            }
            if (ordinal != 7 && ordinal != 27) {
                if (ordinal != 58) {
                    return;
                }
                dk2.xf W0 = W0();
                if (W0 != null) {
                    dk2.xf.f(W0, 0, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.y70(this), 1, null);
                }
                ((mm2.c1) S0().a(mm2.c1.class)).D5 = false;
                return;
            }
        }
        K0(8);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        super.O0();
        w1();
        this.f193369w.d();
        v1();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return false;
    }

    public final void t1() {
        r45.f50 f50Var;
        java.lang.String str = this.f193363q;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[cancelLive]");
        gk2.e eVar = dk2.ef.I;
        if (eVar != null) {
            mm2.n0 n0Var = (mm2.n0) eVar.a(mm2.n0.class);
            if (n0Var.O6() && (f50Var = (r45.f50) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.l2) n0Var.f410798g).mo144003x754a37bb()) != null) {
                android.content.Context context = this.f446856d.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                if (n0Var.P6(xy2.c.e(context))) {
                    long j17 = f50Var.f455546d;
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = f50Var.f455550h;
                    java.lang.String m76197x6c03c64c = c19782x23db1cfa != null ? c19782x23db1cfa.m76197x6c03c64c() : null;
                    if (j17 == 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "notifyCoLiveCancelLiveCreatingIfNeeded: invalid invitationId, skip");
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "notifyCoLiveCancelLiveCreatingIfNeeded: invitationId=" + j17);
                        re2.e1.f475938a.a(j17, 5, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : m76197x6c03c64c, (r18 & 16) != 0 ? null : null, (r18 & 32) != 0 ? null : new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jp0(this, j17));
                    }
                }
            }
        }
        w1();
        this.f193369w.d();
        v1();
        boolean Y6 = ((mm2.e1) P0(mm2.e1.class)).Y6();
        qo0.c cVar = this.f193362p;
        if (Y6) {
            u1();
            dk2.xf W0 = W0();
            if (W0 != null) {
                dk2.xf.f(W0, 0, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x70(this), 1, null);
            }
            qo0.c.a(cVar, qo0.b.f446929p, null, 2, null);
            return;
        }
        qo0.c.a(cVar, qo0.b.f446896i, null, 2, null);
        qo0.c.a(cVar, qo0.b.F1, null, 2, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8 p8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.f183993a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.r8 r8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184088a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.c(p8Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.C.f184073b, null, false, true, 6, null);
        ((mm2.e1) P0(mm2.e1.class)).m7(new r45.nw1());
        if (cVar.mo11219xd0598cf8() == 1) {
            u1();
        }
    }

    public final void u1() {
        org.json.JSONObject jSONObject;
        int i17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1541x2eefaa.p1542xbba4bfc0.C14387x51481731) P0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1541x2eefaa.p1542xbba4bfc0.C14387x51481731.class)).f198580h;
        long j17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1541x2eefaa.p1542xbba4bfc0.C14387x51481731) P0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1541x2eefaa.p1542xbba4bfc0.C14387x51481731.class)).f198581i;
        if (i17 == 0 || j17 == 0) {
            jSONObject = null;
        } else {
            jSONObject = new org.json.JSONObject();
            jSONObject.put("entrance_type", i17);
            jSONObject.put("entrance_id", j17);
            mm2.g1 g1Var = (mm2.g1) P0(mm2.g1.class);
            java.lang.Integer num = g1Var.f410615w;
            java.lang.Long l17 = g1Var.f410616x;
            java.lang.String str = g1Var.f410617y;
            if (num != null && l17 != null && str != null) {
                long longValue = l17.longValue();
                jSONObject.put("strategy_id", num.intValue());
                jSONObject.put("guide_live_id", longValue);
                jSONObject.put("guide_finderusername", str);
            }
        }
        if (jSONObject != null) {
            jSONObject.put("display_mode", ((r45.aa0) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.e1) P0(mm2.e1.class)).E).mo144003x754a37bb()).f451401d);
        }
        if (((mm2.e1) P0(mm2.e1.class)).Y6() && jSONObject != null) {
            jSONObject.put("pull_source", ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1541x2eefaa.p1542xbba4bfc0.C14387x51481731) P0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1541x2eefaa.p1542xbba4bfc0.C14387x51481731.class)).f198582m);
        }
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.c1 c1Var = ml2.c1.f408858e;
        zy2.zb.j5(zbVar, 11L, jSONObject != null ? jSONObject.toString() : null, null, 4, null);
        ((ml2.j0) i95.n0.c(ml2.j0.class)).Yj(ml2.w1.f409710g);
    }

    public void v1() {
        android.widget.TextView textView = this.f193366t;
        textView.setScaleX(1.0f);
        textView.setScaleY(1.0f);
        this.f193368v = this.f193364r;
        az2.f fVar = this.f193367u;
        if (fVar != null) {
            fVar.b();
        }
    }

    public final void w1() {
        yg2.c m57685x35ecf0b4;
        android.view.ViewGroup viewGroup = this.f446856d;
        android.content.Context context = viewGroup.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        if (((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).m78542x6d20d943()) {
            return;
        }
        android.content.Context context2 = viewGroup.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        if (((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2).isFinishing()) {
            return;
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var = ((mm2.c1) S0().a(mm2.c1.class)).F5;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = ((mm2.c1) S0().a(mm2.c1.class)).G5;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).k(bool);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c(this.f193363q, "isReadyPluginCountDownOk resetData", new java.lang.Object[0]);
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.c1) S0().a(mm2.c1.class)).E5).k(new jz5.l(bool, null));
        dk2.ef efVar = dk2.ef.f314905a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
        if (k0Var == null || (m57685x35ecf0b4 = k0Var.m57685x35ecf0b4()) == null) {
            return;
        }
        p3325xe03a0797.p3326xc267989b.z0.c(m57685x35ecf0b4, null);
    }
}
