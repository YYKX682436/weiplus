package com.tencent.mm.mj_template.sns.backgroundwork.ui;

/* loaded from: classes5.dex */
public final class MaasFakeVideoPlayUIC extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f69818d;

    /* renamed from: e, reason: collision with root package name */
    public az0.a0 f69819e;

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f69820f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f69821g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f69822h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f69823i;

    /* renamed from: m, reason: collision with root package name */
    public int f69824m;

    /* renamed from: n, reason: collision with root package name */
    public int f69825n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f69826o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f69827p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.maas.model.time.MJTime f69828q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.maas.instamovie.MJMoviePlayer.OnMediaTimeChange f69829r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f69830s;

    /* renamed from: t, reason: collision with root package name */
    public f25.m0 f69831t;

    /* renamed from: u, reason: collision with root package name */
    public final yz5.l f69832u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaasFakeVideoPlayUIC(final androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f69818d = "MicroMsg.Maas.FakeVideoPlayUIC#" + hashCode();
        oz5.i a17 = kotlinx.coroutines.t3.a(null, 1, null);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        this.f69820f = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) a17).plus(kotlinx.coroutines.internal.b0.f310484a));
        this.f69822h = "";
        this.f69823i = "";
        this.f69824m = -1;
        this.f69825n = -1;
        this.f69828q = com.tencent.maas.model.time.MJTime.ZeroTime;
        this.f69829r = new jz0.q(this);
        this.f69830s = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.VoipCallingStatusEvent>(activity) { // from class: com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC$voipCallEventListener$1
            {
                this.__eventId = 1965200980;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.VoipCallingStatusEvent voipCallingStatusEvent) {
                com.tencent.mm.autogen.events.VoipCallingStatusEvent event = voipCallingStatusEvent;
                kotlin.jvm.internal.o.g(event, "event");
                if (event.f54942g.f8161d != 11) {
                    return false;
                }
                com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC maasFakeVideoPlayUIC = this;
                com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC.P6(maasFakeVideoPlayUIC, maasFakeVideoPlayUIC.f69826o);
                return false;
            }
        };
        this.f69832u = new jz0.z(this, activity);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O6(com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC.O6(com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void P6(com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC maasFakeVideoPlayUIC, boolean z17) {
        az0.a0 a0Var = maasFakeVideoPlayUIC.f69819e;
        if (a0Var != null) {
            com.tencent.mars.xlog.Log.i(a0Var.f15311c, "updateMovieOption: originMuted=" + z17);
            a0Var.f15309a.changeMuteState(z17);
        }
    }

    public static void Q6(com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC maasFakeVideoPlayUIC, com.tencent.maas.model.time.MJTime ZeroTime, com.tencent.maas.model.time.MJTimeRange mJTimeRange, boolean z17, yz5.l lVar, int i17, java.lang.Object obj) {
        com.tencent.maas.model.time.MJTime endTime;
        com.tencent.maas.model.time.MJTime startTime;
        if ((i17 & 1) != 0) {
            ZeroTime = com.tencent.maas.model.time.MJTime.ZeroTime;
            kotlin.jvm.internal.o.f(ZeroTime, "ZeroTime");
        }
        com.tencent.maas.model.time.MJTime startTime2 = ZeroTime;
        java.lang.Double d17 = null;
        com.tencent.maas.model.time.MJTimeRange mJTimeRange2 = (i17 & 2) != 0 ? null : mJTimeRange;
        if ((i17 & 4) != 0) {
            z17 = maasFakeVideoPlayUIC.U6();
        }
        boolean z18 = z17;
        yz5.l lVar2 = (i17 & 8) != 0 ? null : lVar;
        maasFakeVideoPlayUIC.getClass();
        kotlin.jvm.internal.o.g(startTime2, "startTime");
        az0.a0 a0Var = maasFakeVideoPlayUIC.f69819e;
        if (a0Var != null) {
            if (!a0Var.a()) {
                a0Var = null;
            }
            if (a0Var != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tryStartPlay, audioEnable=");
                sb6.append(z18);
                sb6.append(", startTime:");
                sb6.append(startTime2.toSeconds());
                sb6.append(", timeRangeForPlay:[");
                sb6.append((mJTimeRange2 == null || (startTime = mJTimeRange2.getStartTime()) == null) ? null : java.lang.Double.valueOf(startTime.toSeconds()));
                sb6.append(',');
                if (mJTimeRange2 != null && (endTime = mJTimeRange2.getEndTime()) != null) {
                    d17 = java.lang.Double.valueOf(endTime.toSeconds());
                }
                sb6.append(d17);
                sb6.append("], playbackDuration:");
                sb6.append(a0Var.f15309a.getPlaybackDuration().toMilliseconds());
                com.tencent.mars.xlog.Log.i(a0Var.f15311c, sb6.toString());
                if (a0Var.a()) {
                    a0Var.f15313e = kotlinx.coroutines.l.d(a0Var.f15310b, null, null, new az0.v(lVar2, a0Var, startTime2, mJTimeRange2, z18, 1, null), 3, null);
                } else if (lVar2 != null) {
                    lVar2.invoke(java.lang.Boolean.FALSE);
                }
            }
        }
    }

    public final void R6() {
        az0.a0 a0Var = this.f69819e;
        if (a0Var != null) {
            kotlinx.coroutines.r2 d17 = kotlinx.coroutines.l.d(a0Var.f15310b, null, null, new az0.z(a0Var, null), 3, null);
            ((kotlinx.coroutines.c3) d17).p(new az0.x(a0Var));
            a0Var.f15314f = d17;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object S6(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof jz0.o
            if (r0 == 0) goto L13
            r0 = r6
            jz0.o r0 = (jz0.o) r0
            int r1 = r0.f302613g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f302613g = r1
            goto L18
        L13:
            jz0.o r0 = new jz0.o
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f302611e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f302613g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.f302610d
            com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC r0 = (com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L5d
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.Class<pp0.q0> r6 = pp0.q0.class
            i95.m r6 = i95.n0.c(r6)
            pp0.q0 r6 = (pp0.q0) r6
            androidx.appcompat.app.AppCompatActivity r2 = r5.getActivity()
            r0.f302610d = r5
            r0.f302613g = r3
            yy0.k8 r6 = (yy0.k8) r6
            r6.getClass()
            az0.i5 r6 = az0.i5.f15557a
            az0.o3 r3 = new az0.o3
            r4 = 0
            r3.<init>(r2, r4)
            java.lang.String r2 = "createRenderSurface"
            java.lang.Object r6 = r6.y(r2, r3, r0)
            if (r6 != r1) goto L5c
            return r1
        L5c:
            r0 = r5
        L5d:
            android.view.SurfaceView r6 = (android.view.SurfaceView) r6
            if (r6 == 0) goto L79
            r1 = 2131304155(0x7f091edb, float:1.8226445E38)
            android.view.View r1 = r0.findViewById(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r2 = 0
            r1.addView(r6, r2)
            az0.a0 r0 = r0.f69819e
            if (r0 == 0) goto L79
            com.tencent.maas.instamovie.MJMoviePlayer r0 = r0.f15309a
            if (r0 == 0) goto L79
            r0.setRenderView(r6)
        L79:
            jz5.f0 r6 = jz5.f0.f302826a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC.S6(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object T6(kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC.T6(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean U6() {
        f25.m0 m0Var = this.f69831t;
        if (m0Var != null) {
            kotlin.jvm.internal.o.d(m0Var);
            return ((g25.e) m0Var).f267980c;
        }
        f25.m0 m96 = ((f25.n0) i95.n0.c(f25.n0.class)).m9(f25.x.f259116c, null);
        this.f69831t = m96;
        boolean z17 = false;
        if (m96 != null && ((g25.e) m96).f267980c) {
            z17 = true;
        }
        return !z17;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        this.f69821g = getIntent().getBooleanExtra("intent_video_is_preview", false);
        this.f69824m = getIntent().getIntExtra("intent_video_sns_local_id", -1);
        this.f69826o = getIntent().getBooleanExtra("intent_video_is_mute_play", false);
        this.f69825n = getIntent().getIntExtra("intent_video_sns_create_time", -1);
        int intExtra = getIntent().getIntExtra("report_source", 300);
        com.tencent.mars.xlog.Log.i(this.f69818d, "initView >> " + this.f69822h + ", " + this.f69821g + ", " + this.f69824m + ", " + intExtra);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setReportScene: ");
        sb6.append(intExtra);
        sb6.append(", field: ");
        sb6.append(bz0.a.f36723b);
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasMovieSessionManager", sb6.toString());
        bz0.a.f36723b = intExtra;
        az0.i5.s(az0.i5.f15557a, false, null, false, 7, null);
        kotlinx.coroutines.l.d(this.f69820f, null, null, new jz0.n(this, null), 3, null);
        this.f69830s.alive();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i(this.f69818d, "onDestroy: ");
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasMovieSessionManager", "setReportScene: 0, field: " + bz0.a.f36723b);
        bz0.a.f36723b = 0;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        com.tencent.mars.xlog.Log.i(this.f69818d, "onPause: ");
        ku5.u0 u0Var = ku5.t0.f312615d;
        jz0.p pVar = new jz0.p(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(pVar, 500L, false);
        super.onPause();
        R6();
        this.f69830s.dead();
        f25.m0 m0Var = this.f69831t;
        if (m0Var != null) {
            ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
        }
        this.f69831t = null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onPostDestroyed() {
        super.onPostDestroyed();
        com.tencent.mars.xlog.Log.i(this.f69818d, "onPostDestroyed: ");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onPreDestroyed() {
        com.tencent.maas.instamovie.MJMoviePlayer mJMoviePlayer;
        super.onPreDestroyed();
        com.tencent.mars.xlog.Log.i(this.f69818d, "onPreDestroyed: ");
        az0.a0 a0Var = this.f69819e;
        if (a0Var != null && (mJMoviePlayer = a0Var.f15309a) != null) {
            mJMoviePlayer.setOnPlaybackMediaTimeDidChange(null);
        }
        az0.a0 a0Var2 = this.f69819e;
        if (a0Var2 != null) {
            com.tencent.mars.xlog.Log.i(a0Var2.f15311c, "release");
            az0.i5 i5Var = az0.i5.f15557a;
            kotlinx.coroutines.r2 r2Var = a0Var2.f15314f;
            com.tencent.maas.instamovie.MJMoviePlayer player = a0Var2.f15309a;
            kotlin.jvm.internal.o.g(player, "player");
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasManager", "releaseMJMoviePlayer[" + player.hashCode() + "]: ready");
            az0.i5.f15570n = kotlinx.coroutines.l.d(az0.i5.f15568l, null, null, new az0.x4(r2Var, player, null), 3, null);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasMovieSessionManager", "setReportScene: 0, field: " + bz0.a.f36723b);
        bz0.a.f36723b = 0;
        this.f69830s.dead();
        kotlinx.coroutines.l.d(this.f69820f, null, null, new jz0.x(this, null), 3, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        java.lang.String str = this.f69818d;
        com.tencent.mars.xlog.Log.i(str, "onResume: ");
        this.f69830s.alive();
        com.tencent.mars.xlog.Log.i(str, "resume play");
        kotlinx.coroutines.l.d(this.f69820f, null, null, new jz0.y(this, null), 3, null);
    }

    public final void t(java.lang.String str) {
        java.lang.String str2 = this.f69818d;
        com.tencent.mars.xlog.Log.e(str2, "onSdkError: " + str);
        if (getContext().isFinishing() || getContext().isDestroyed()) {
            com.tencent.mars.xlog.Log.i(str2, "onSdkError: skip toast, " + getContext().isFinishing() + ", " + getContext().isDestroyed());
            return;
        }
        android.app.Activity context = getContext();
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.b(com.tencent.mm.R.raw.icons_filled_info);
        e4Var.f211776c = getString(com.tencent.mm.R.string.k7w);
        e4Var.f211778e = false;
        e4Var.f211782i = new jy0.a(getContext(), jz0.r.f302616d);
        e4Var.c();
    }
}
