package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/tencent/mm/plugin/finder/replay/FinderLiveReplayViewCallback;", "Lws2/q;", "Ltd2/c;", "Lcom/tencent/mm/ui/MMActivity;", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100, "Lws2/p;", "presenter", "<init>", "(Lcom/tencent/mm/ui/MMActivity;Lws2/p;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.replay.FinderLiveReplayViewCallback */
/* loaded from: classes3.dex */
public final class C14931xe48fc583 implements ws2.q, td2.c {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f206411d;

    /* renamed from: e, reason: collision with root package name */
    public final ws2.p f206412e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.o6 f206413f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f206414g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14343x44b0b6f6 f206415h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14329x76e637f1 f206416i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f206417m;

    /* renamed from: n, reason: collision with root package name */
    public final ws2.v1 f206418n;

    /* renamed from: o, reason: collision with root package name */
    public zs2.b f206419o;

    public C14931xe48fc583(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, ws2.p presenter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
        this.f206411d = activity;
        this.f206412e = presenter;
        this.f206413f = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.o6();
        android.view.View findViewById = activity.findViewById(com.p314xaae8f345.mm.R.id.fka);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f206414g = (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) findViewById;
        android.view.View findViewById2 = activity.findViewById(com.p314xaae8f345.mm.R.id.fk_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14343x44b0b6f6 c14343x44b0b6f6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14343x44b0b6f6) findViewById2;
        this.f206415h = c14343x44b0b6f6;
        this.f206417m = jz5.h.b(new ws2.u1(this));
        this.f206418n = new ws2.v1(c14343x44b0b6f6, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) pf5.z.f435481a.a(activity).c(zy2.ra.class))).V6());
    }

    @Override // fs2.c
    /* renamed from: getActivity */
    public com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f mo978x19263085() {
        return this.f206411d;
    }

    @Override // td2.c
    /* renamed from: onCreate */
    public void mo55613x3e5a77bb(p012xc85e97e9.p093xedfae76a.y var1) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(var1, "var1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayViewCallback", "[LiveLifecycle]onCreate " + this);
        zs2.b bVar = new zs2.b(new dp1.u(this.f206411d));
        this.f206419o = bVar;
        bVar.b(34, "LiveReplayFloatBall");
    }

    @Override // td2.c
    /* renamed from: onDestroy */
    public void mo55614xac79a11b(p012xc85e97e9.p093xedfae76a.y var1) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(var1, "var1");
        ws2.u0 u0Var = ws2.k1.f530599r;
        ct2.j jVar = (ct2.j) u0Var.a().e(ct2.j.class);
        java.lang.Boolean valueOf = jVar != null ? java.lang.Boolean.valueOf(jVar.f303811v) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayViewCallback", "[LiveLifecycle]onDestroy " + this + ",manualClose:" + valueOf + '!');
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, java.lang.Boolean.TRUE)) {
            ws2.k1 a17 = u0Var.a();
            ct2.j jVar2 = (ct2.j) u0Var.a().e(ct2.j.class);
            a17.l(7, jVar2 != null ? jVar2.O6() : 0L, true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14929x59565fb6 c14929x59565fb6 = this.f206418n.f530682a;
        if (c14929x59565fb6 != null) {
            c14929x59565fb6.mo46559xed5f7500();
        }
        zs2.b bVar = this.f206419o;
        if (bVar != null) {
            bVar.o0();
        }
    }

    @Override // td2.c
    /* renamed from: onPause */
    public void mo55615xb01dfb57(p012xc85e97e9.p093xedfae76a.y var1) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(var1, "var1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayViewCallback", "[LiveLifecycle]onPause " + this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14929x59565fb6 c14929x59565fb6 = this.f206418n.f530682a;
        if (c14929x59565fb6 != null) {
            c14929x59565fb6.mo46552x65825f6();
        }
    }

    @Override // td2.c
    /* renamed from: onResume */
    public void mo55616x57429eec(p012xc85e97e9.p093xedfae76a.y var1) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(var1, "var1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayViewCallback", "[LiveLifecycle]onResume " + this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14929x59565fb6 c14929x59565fb6 = this.f206418n.f530682a;
        if (c14929x59565fb6 != null) {
            c14929x59565fb6.mo46554xc84dc82d();
        }
    }

    @Override // td2.c
    /* renamed from: onStart */
    public void mo55617xb05099c3(p012xc85e97e9.p093xedfae76a.y var1) {
        at2.u1 u1Var;
        android.view.ViewGroup viewGroup;
        dt2.a0 a0Var;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.e1 e1Var;
        cw2.wa f206430p;
        mn2.j4 j4Var;
        r45.mb4 e17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(var1, "var1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[LiveLifecycle]onStart ");
        sb6.append(this);
        sb6.append(", needMiniWindow:");
        ws2.u0 u0Var = ws2.k1.f530599r;
        mm2.c1 c1Var = (mm2.c1) u0Var.a().e(mm2.c1.class);
        sb6.append(c1Var != null ? java.lang.Boolean.valueOf(c1Var.O1) : null);
        sb6.append(",manualClose:");
        ct2.j jVar = (ct2.j) u0Var.a().e(ct2.j.class);
        sb6.append(jVar != null ? java.lang.Boolean.valueOf(jVar.f303811v) : null);
        sb6.append(",manualMinimum:");
        ct2.j jVar2 = (ct2.j) u0Var.a().e(ct2.j.class);
        sb6.append(jVar2 != null ? java.lang.Boolean.valueOf(jVar2.f303812w) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayViewCallback", sb6.toString());
        zs2.b bVar = this.f206419o;
        if (bVar != null) {
            bVar.p0();
        }
        qp1.h0.a(true, false, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayViewCallback", "tryHideFloatBallWhenEnterPage hideFloatBall");
        ws2.k1 a17 = u0Var.a();
        dt2.b0 b0Var = a17.f530606e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14929x59565fb6 c14929x59565fb6 = b0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14929x59565fb6 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14929x59565fb6) b0Var : null;
        if (c14929x59565fb6 != null && (u1Var = (at2.u1) c14929x59565fb6.mo57682x2a5e9229(at2.u1.class)) != null && (viewGroup = u1Var.f446856d) != null && (a0Var = a17.f530616o) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 c14932xfc4acec9 = a0Var.f324691a;
            android.util.Size size = (c14932xfc4acec9 == null || (f206430p = c14932xfc4acec9.getF206430p()) == null || (j4Var = f206430p.f305631e) == null || (e17 = j4Var.e()) == null) ? new android.util.Size(0, 0) : bu2.z.g(e17);
            mm2.c1 c1Var2 = (mm2.c1) a17.e(mm2.c1.class);
            if (!(c1Var2 != null && c1Var2.L9()) || size.getWidth() < size.getHeight() || size.getHeight() <= 0) {
                ct2.j jVar3 = (ct2.j) a17.e(ct2.j.class);
                if (!(jVar3 != null && jVar3.f303805p)) {
                    e1Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.COVER;
                    a0Var.c(viewGroup, size, e1Var, false);
                }
            }
            e1Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.CONTAIN;
            a0Var.c(viewGroup, size, e1Var, false);
        }
        mm2.c1 c1Var3 = (mm2.c1) u0Var.a().e(mm2.c1.class);
        if (c1Var3 != null) {
            c1Var3.O1 = true;
        }
        ct2.j jVar4 = (ct2.j) u0Var.a().e(ct2.j.class);
        if (jVar4 != null) {
            jVar4.X6(false);
        }
        ct2.j jVar5 = (ct2.j) u0Var.a().e(ct2.j.class);
        if (jVar5 != null) {
            jVar5.Y6(false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14929x59565fb6 c14929x59565fb62 = this.f206418n.f530682a;
        if (c14929x59565fb62 != null) {
            c14929x59565fb62.mo46556x68ac462();
        }
    }

    @Override // td2.c
    /* renamed from: onStop */
    public void mo55618xc39f8281(p012xc85e97e9.p093xedfae76a.y var1) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(var1, "var1");
        ws2.u0 u0Var = ws2.k1.f530599r;
        mm2.c1 c1Var = (mm2.c1) u0Var.a().e(mm2.c1.class);
        java.lang.Boolean valueOf = c1Var != null ? java.lang.Boolean.valueOf(c1Var.O1) : null;
        ct2.j jVar = (ct2.j) u0Var.a().e(ct2.j.class);
        java.lang.Boolean valueOf2 = jVar != null ? java.lang.Boolean.valueOf(jVar.f303811v) : null;
        ct2.j jVar2 = (ct2.j) u0Var.a().e(ct2.j.class);
        java.lang.Boolean valueOf3 = jVar2 != null ? java.lang.Boolean.valueOf(jVar2.f303812w) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayViewCallback", "[LiveLifecycle]onStop " + this + ", needMiniView:" + valueOf + ", manualClose:" + valueOf2 + ",manualMinumum:" + valueOf3 + ",lifecycleOwner:" + var1);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf3, bool) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf2, bool) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, bool)) {
            zs2.b bVar = this.f206419o;
            if (bVar != null) {
                bVar.t0(false);
            }
        } else {
            zs2.b bVar2 = this.f206419o;
            if (bVar2 != null) {
                bVar2.t0(true);
            }
        }
        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf2, bool2) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, bool2)) {
            ws2.k1 a17 = u0Var.a();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("PARAM_LIVE_MINI_WINDOW_GENERATE_TYPE", 3);
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = this.f206411d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            boolean Ui = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(context);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayService", "tryToStartReplayMiniUI isFloatWindowOpAllowed:" + Ui);
            if (Ui) {
                a17.r(intent);
            } else {
                p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, p3325xe03a0797.p3326xc267989b.q1.f392102b, null, new ws2.a1(context, a17, intent, null), 2, null);
            }
        }
        qp1.h0.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14929x59565fb6 c14929x59565fb6 = this.f206418n.f530682a;
        if (c14929x59565fb6 != null) {
            c14929x59565fb6.mo46558x360802();
        }
    }
}
