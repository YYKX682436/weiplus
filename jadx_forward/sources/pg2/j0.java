package pg2;

@j95.b
/* loaded from: classes3.dex */
public final class j0 extends i95.w implements c50.s0 {

    /* renamed from: d, reason: collision with root package name */
    public long f435669d;

    public static final void Ai(pg2.j0 j0Var, ug5.v vVar, boolean z17) {
        j0Var.getClass();
        ug5.g gVar = vVar.f509191a;
        float f17 = (gVar.A * 1000.0f) / ((float) gVar.f509135p);
        android.view.Window window = gVar.f509121b;
        int a17 = window != null ? ug5.x.a(window) : 0;
        ug5.b action = vVar.f509191a.f509120a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        if (ug5.b.f509115e == action) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewFluentReporter", "return for exit");
            ez2.g.f339435a = null;
        } else {
            ez2.e eVar = ez2.g.f339435a;
            if (eVar != null) {
                eVar.h(z17, f17, a17);
            }
        }
    }

    public static void aj(pg2.j0 j0Var, ug5.v vVar, mn0.b0 b0Var, c50.e1 e1Var, yz5.a aVar, int i17, java.lang.Object obj) {
        com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf m46540x4ee17f0a;
        if ((i17 & 8) != 0) {
            aVar = null;
        }
        yz5.a aVar2 = aVar;
        j0Var.getClass();
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSurfaceViewService", "handlePlayerInPlaying==start");
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10851x9baaeea1 c10851x9baaeea1 = (com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10851x9baaeea1) vVar.f509193c;
        if (c10851x9baaeea1 == null || (m46540x4ee17f0a = c10851x9baaeea1.m46540x4ee17f0a()) == null) {
            return;
        }
        ((mn0.y) b0Var).O(m46540x4ee17f0a, new pg2.f0(e1Var, vVar, aVar2, elapsedRealtime));
    }

    public static final jz5.l wi(pg2.j0 j0Var, android.content.Context context, int i17, int i18) {
        j0Var.getClass();
        if (i17 <= 0 || i18 <= 0) {
            return new jz5.l(-1, -1);
        }
        boolean z17 = i17 >= i18;
        int i19 = com.p314xaae8f345.mm.ui.bl.b(context).x;
        int i27 = com.p314xaae8f345.mm.ui.bl.b(context).y;
        if (i19 < i27) {
            return new jz5.l(-1, java.lang.Integer.valueOf(z17 ? (i18 * i19) / i17 : -1));
        }
        return new jz5.l(java.lang.Integer.valueOf(z17 ? (i17 * i27) / i18 : -1), -1);
    }

    public java.lang.Object Bi(r45.nw1 nw1Var) {
        r45.ma4 ma4Var;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        if (nw1Var == null || (ma4Var = (r45.ma4) nw1Var.m75936x14adae67(23)) == null || (gVar = ma4Var.f461833m) == null) {
            return null;
        }
        r45.na4 na4Var = new r45.na4();
        na4Var.mo11468x92b714fd(gVar.g());
        return na4Var.f462730f;
    }

    public java.lang.Object Di(java.lang.String streamId, java.lang.String nickname, long j17, long j18, r45.nw1 nw1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(streamId, "streamId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickname, "nickname");
        return new mn0.l0(streamId, nickname, j17, j18, android.os.SystemClock.elapsedRealtime(), nw1Var);
    }

    public void Ni(android.app.Activity activity, long j17, android.view.View clickView, android.graphics.Rect targetRect, java.util.Map extraParams, yz5.p enterLiveCall) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickView, "clickView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetRect, "targetRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraParams, "extraParams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterLiveCall, "enterLiveCall");
        if (targetRect.isEmpty()) {
            targetRect.set(qg2.d.f444326a.b(clickView.getWidth(), clickView.getHeight(), false));
        }
        ug5.c cVar = new ug5.c(ug5.b.f509114d);
        cVar.f509117a.f509139t = -16777216;
        cVar.f509117a.f509129j.set(ug5.x.c(clickView, false, 1, null));
        cVar.i(targetRect);
        ug5.g gVar = cVar.f509117a;
        gVar.f509135p = 240L;
        gVar.f509137r = 3000L;
        gVar.f509144y = true;
        cVar.b(activity.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
        cVar.f509117a.f509121b = activity.getWindow();
        cVar.g(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14109x83bd09.class, false);
        cVar.f509117a.f509143x = false;
        cVar.f(new android.view.animation.LinearInterpolator());
        cVar.c("key_feed_id", java.lang.Long.valueOf(j17));
        cVar.d(extraParams);
        cVar.f509117a.f509123d = new pg2.r(clickView, targetRect);
        cVar.f509117a.f509124e = pg2.s.f435715d;
        cVar.f509117a.f509125f = new pg2.t(this, enterLiveCall, j17);
        cVar.a().g(activity);
    }

    public void Ri(android.app.Activity activity, long j17, android.view.View clickView, android.graphics.Rect targetRect, int i17, int i18, mn0.b0 player, java.util.Map extraParams, c50.e1 e1Var, yz5.q enterLiveCall) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickView, "clickView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetRect, "targetRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(player, "player");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraParams, "extraParams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterLiveCall, "enterLiveCall");
        Zi(e1Var, ug5.x.c(clickView, false, 1, null), targetRect, activity, j17, i17, i18, player, extraParams, enterLiveCall);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
    
        if (r5 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r45.p72 Ui(android.content.Context r5, long r6, long r8) {
        /*
            r4 = this;
            r45.p72 r0 = new r45.p72
            r0.<init>()
            java.lang.Class<n30.q> r1 = n30.q.class
            i95.m r1 = i95.n0.c(r1)
            n30.q r1 = (n30.q) r1
            m30.m r1 = (m30.m) r1
            r1.getClass()
            java.lang.String r1 = a52.a.f83117l
            if (r5 == 0) goto L1e
            boolean r2 = r5 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112
            if (r2 == 0) goto L1b
            goto L1c
        L1b:
            r5 = 0
        L1c:
            if (r5 != 0) goto L24
        L1e:
            com.tencent.mm.plugin.finder.assist.v1 r5 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v1.f184144a
            android.content.Context r5 = r5.b()
        L24:
            boolean r2 = r5 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112
            if (r2 == 0) goto L4f
            r2 = r5
            androidx.appcompat.app.AppCompatActivity r2 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) r2
            pf5.z r3 = pf5.z.f435481a
            pf5.v r2 = r3.a(r2)
            java.lang.Class<zy2.ra> r3 = zy2.ra.class
            pf5.c r2 = r2.c(r3)
            zy2.ra r2 = (zy2.ra) r2
            com.tencent.mm.plugin.finder.viewmodel.component.ny r2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) r2
            int r2 = r2.f216913n
            if (r2 != 0) goto L49
            boolean r3 = r5 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa
            if (r3 == 0) goto L49
            com.tencent.mm.plugin.finder.ui.MMFinderUI r5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) r5
            int r2 = r5.getD()
        L49:
            if (r2 == 0) goto L4f
            java.lang.String r1 = java.lang.String.valueOf(r2)
        L4f:
            r5 = 0
            r0.set(r5, r1)
            r1 = 3
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r0.set(r1, r6)
            r6 = 4
            java.lang.Long r7 = java.lang.Long.valueOf(r8)
            r0.set(r6, r7)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "SurfaceView_"
            r6.<init>(r7)
            long r7 = c01.id.c()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r7 = 1
            r0.set(r7, r6)
            r6 = 5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.set(r6, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pg2.j0.Ui(android.content.Context, long, long):r45.p72");
    }

    public final void Vi(co0.s sVar, qo0.c cVar, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSurfaceViewService", "[onChangeResolution] videoWidth=" + i17 + " videoHeight=" + i18);
        if (sVar != null) {
            sVar.U1 = i17;
        }
        if (sVar != null) {
            sVar.V1 = i18;
        }
        if (sVar != null) {
            sVar.X1 = (i17 * 1.0f) / i18;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("EVT_PARAM1", i17);
        bundle.putInt("EVT_PARAM2", i18);
        cVar.mo46557x60d69242(qo0.b.Q1, bundle);
    }

    public final void Zi(c50.e1 e1Var, android.graphics.Rect rect, android.graphics.Rect rect2, android.app.Activity activity, long j17, int i17, int i18, mn0.b0 b0Var, java.util.Map map, yz5.q qVar) {
        if (rect2.isEmpty()) {
            rect2.set(qg2.d.f444326a.b(i17, i18, false));
        }
        ug5.c cVar = new ug5.c(ug5.b.f509114d);
        cVar.f509117a.f509139t = e1Var != null ? e1Var.f120130a : -16777216;
        cVar.e(rect);
        cVar.i(rect2);
        long j18 = e1Var != null ? e1Var.f120131b : 240L;
        ug5.g gVar = cVar.f509117a;
        gVar.f509135p = j18;
        gVar.f509137r = 3000L;
        gVar.f509144y = false;
        cVar.f509117a.f509121b = activity != null ? activity.getWindow() : null;
        cVar.f509117a.f509122c = activity != null ? activity.getWindow() : null;
        cVar.g(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14109x83bd09.class, false);
        cVar.f(new android.view.animation.LinearInterpolator());
        cVar.c("key_feed_id", java.lang.Long.valueOf(j17));
        cVar.c("key_video_w", java.lang.Integer.valueOf(i17));
        cVar.c("key_video_h", java.lang.Integer.valueOf(i18));
        cVar.c("key_player", b0Var);
        cVar.d(map);
        cVar.f509117a.f509124e = pg2.b0.f435621d;
        cVar.f509117a.f509123d = new pg2.c0(map, j17);
        cVar.f509117a.f509125f = new pg2.e0(b0Var, e1Var, qVar, j17, this);
        cVar.a().g(activity);
    }

    public boolean wh() {
        ae2.b2 b2Var = ae2.b2.f84994a;
        return (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.b2.f85003e0).mo141623x754a37bb()).r()).intValue() != 1 || com.p314xaae8f345.mm.ui.bk.A() || com.p314xaae8f345.mm.ui.bk.Q()) ? false : true;
    }
}
