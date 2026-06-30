package c61;

/* loaded from: classes3.dex */
public final class y7 implements c61.dc {

    /* renamed from: b, reason: collision with root package name */
    public static final c61.y7 f120962b = new c61.y7();

    @Override // c61.dc
    public void a(android.view.View clickedRootView, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 contextActivity, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, ez2.a scene, yz5.p onAnimationEndCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickedRootView, "clickedRootView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextActivity, "contextActivity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onAnimationEndCallback, "onAnimationEndCallback");
        b(clickedRootView, contextActivity, new zy2.nc(feed.getFeedObject().m59299x6bf53a6c(), feed.getFeedObject().m59251x5db1b11(), feed.getFeedObject().m59276x6c285d75(), feed.getFeedObject().m59258xd0557130(), feed.g0(), feed.getFeedObject().m59273x80025a04(), null, null, 192, null), scene, onAnimationEndCallback);
    }

    @Override // c61.dc
    public void b(android.view.View view, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 contextActivity, zy2.nc feedData, ez2.a scene, yz5.p onAnimationEndCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextActivity, "contextActivity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedData, "feedData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onAnimationEndCallback, "onAnimationEndCallback");
        if (!((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Kk()) {
            d(view, contextActivity, feedData, scene, onAnimationEndCallback);
            return;
        }
        wd0.q1 q1Var = (wd0.q1) i95.n0.c(wd0.q1.class);
        c61.v7 v7Var = new c61.v7(view, contextActivity, feedData, scene, onAnimationEndCallback);
        ((vd0.j2) q1Var).getClass();
        v24.o0.h(contextActivity, 9007199254740992L, null, v7Var, 3);
    }

    public final void c(android.view.View view, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 contextActivity, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, ez2.a scene, yz5.p onAnimationEndCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextActivity, "contextActivity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onAnimationEndCallback, "onAnimationEndCallback");
        b(view, contextActivity, new zy2.nc(feed.getFeedObject().m59299x6bf53a6c(), feed.getFeedObject().m59251x5db1b11(), feed.getFeedObject().m59276x6c285d75(), feed.getFeedObject().m59258xd0557130(), feed.g0(), feed.getFeedObject().m59273x80025a04(), null, null, 192, null), scene, onAnimationEndCallback);
    }

    public final void d(android.view.View view, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, zy2.nc ncVar, ez2.a aVar, yz5.p pVar) {
        r45.ka4 ka4Var;
        r45.ka4 ka4Var2;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        r45.ka4 ka4Var3;
        r45.ma4 ma4Var;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveFluentAnimUti", "fluentLiveClick objectUserName: " + ncVar.f559028a);
        java.lang.String str = ncVar.f559028a;
        boolean z17 = str.length() > 0;
        r45.nw1 nw1Var = ncVar.f559031d;
        if (z17) {
            android.content.Context context = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, xy2.c.e(context))) {
                i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                c61.ub.Rf((c61.ub) c17, activityC0065xcd7aa112, ncVar.f559029b, ncVar.f559030c, nw1Var == null ? new r45.nw1() : nw1Var, null, null, null, null, ncVar.f559032e, null, null, 1776, null);
                return;
            }
        }
        ig2.e eVar = ig2.e.f372905a;
        if ((eVar.d() && !eVar.b(ncVar)) && !iq.b.m(activityC0065xcd7aa112, false, null)) {
            ((b92.g1) ((c61.ac) i95.n0.c(c61.ac.class))).getClass();
            if (dk2.r9.f315558a.c()) {
                android.view.KeyEvent.Callback findViewWithTag = view.findViewWithTag("nearby-live-preview-view-tag");
                ws5.f fVar = findViewWithTag instanceof ws5.f ? (ws5.f) findViewWithTag : null;
                if (fVar == null) {
                    android.view.ViewGroup viewGroup = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
                    java.lang.Object i17 = viewGroup != null ? hc2.f1.i(viewGroup, com.p314xaae8f345.mm.R.id.ua9, "nearby-live-preview-view-tag") : null;
                    fVar = i17 instanceof ws5.f ? (ws5.f) i17 : null;
                }
                android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.f568828o70);
                if (findViewById == null) {
                    findViewById = ncVar.f559034g;
                }
                android.view.View view2 = findViewById;
                boolean z18 = pm0.v.z(nw1Var != null ? (int) nw1Var.m75942xfb822ef2(32) : 0, 256);
                boolean z19 = fVar != null && fVar.mo58387xc00617a4();
                boolean z27 = nw1Var != null && nw1Var.m75939xb282bd08(2) == 1;
                boolean z28 = fVar != null && fVar.getF212288x();
                android.view.TextureView mo58382x3a06c52a = fVar != null ? fVar.mo58382x3a06c52a() : null;
                boolean z29 = (mo58382x3a06c52a != null ? mo58382x3a06c52a.getSurfaceTexture() : null) != null;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startSwitchOutFromSquare animation for feed:");
                long j17 = ncVar.f559029b;
                sb6.append(pm0.v.u(j17));
                sb6.append(" liveStatusOpen:");
                sb6.append(z27);
                sb6.append(" isPlaying:");
                sb6.append(z19);
                sb6.append(" isAudioMode");
                sb6.append(z18);
                sb6.append(" isFirstFrameRendered:");
                sb6.append(z28);
                sb6.append(" isSurfaceTextureAvailable:");
                sb6.append(z29);
                sb6.append("  liveView:");
                sb6.append(fVar);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveFluentAnimUti", sb6.toString());
                if (z19 && z28 && !z18 && z27 && z29) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveFluentAnimUti", "startSwitchOutFromSquare video animation for feed:" + pm0.v.u(j17) + " liveView:" + fVar);
                    if (fVar == null) {
                        pVar.mo149xb9724478(java.lang.Boolean.FALSE, null);
                        return;
                    }
                    c61.w7 w7Var = new c61.w7(pVar);
                    long j18 = ncVar.f559029b;
                    if (!((pg2.j0) i95.n0.c(pg2.j0.class)).wh()) {
                        ez2.g.f339435a = new ez2.e(ncVar.f559029b, ez2.f.f339431e, ez2.d.f339406i, aVar.ordinal(), -1L);
                        ig2.j jVar = new ig2.j(aVar, j18, nw1Var != null ? nw1Var.m75942xfb822ef2(0) : 0L, view, fVar.getF212290z(), fVar.getA(), fVar.getB(), (mn0.b0) fVar.e(), fVar.mo58382x3a06c52a(), false, false);
                        jVar.f372921m = view.findViewById(com.p314xaae8f345.mm.R.id.icp);
                        ig2.m.f372926a.i(activityC0065xcd7aa112, jVar).g(new c61.s7(w7Var));
                        return;
                    }
                    ez2.g.f339435a = new ez2.e(ncVar.f559029b, ez2.f.f339432f, ez2.d.f339404g, aVar.ordinal(), -1L);
                    java.lang.Object q17 = fVar.q();
                    nn0.c cVar = q17 instanceof nn0.c ? (nn0.c) q17 : null;
                    if (cVar == null) {
                        return;
                    }
                    int f212290z = fVar.getF212290z();
                    int a17 = fVar.getA();
                    android.graphics.Rect b17 = qg2.d.f444326a.b(f212290z, a17, false);
                    boolean g17 = fVar.g();
                    fVar.mo58404x360802();
                    ((pg2.j0) i95.n0.c(pg2.j0.class)).Ri(activityC0065xcd7aa112, j18, g17 ? fVar.mo58374x756ec046() : fVar.H(), b17, f212290z, a17, cVar, kz5.c1.i(new jz5.l("key_enter_type", 2), new jz5.l("key_enter_scene", aVar), new jz5.l("key_enter_square_preview_mode", java.lang.Integer.valueOf(g17 ? 1 : 0))), ncVar.f559035h, new c61.r7(cVar, w7Var));
                    return;
                }
                if (!z27 || view2 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveFluentAnimUti", "startSwitchOutFromSquare no animation for feed:" + pm0.v.u(j17) + " liveView:" + fVar);
                    pVar.mo149xb9724478(java.lang.Boolean.FALSE, null);
                    return;
                }
                c61.x7 x7Var = new c61.x7(pVar);
                long j19 = ncVar.f559029b;
                java.lang.String m75945x2fec8307 = nw1Var != null && nw1Var.m75939xb282bd08(42) == 1 ? "" : nw1Var != null ? nw1Var.m75945x2fec8307(3) : null;
                pg2.j0 j0Var = (pg2.j0) i95.n0.c(pg2.j0.class);
                if (j0Var.wh()) {
                    ez2.g.f339435a = new ez2.e(ncVar.f559029b, ez2.f.f339432f, ez2.d.f339406i, aVar.ordinal(), -1L);
                    android.graphics.Rect b18 = qg2.d.f444326a.b(view2.getWidth(), view2.getHeight(), false);
                    jz5.l[] lVarArr = new jz5.l[5];
                    lVarArr[0] = new jz5.l("key_enter_type", 1);
                    lVarArr[1] = new jz5.l("liveUrl", m75945x2fec8307);
                    if (nw1Var == null || (ma4Var = (r45.ma4) nw1Var.m75936x14adae67(23)) == null || (gVar2 = ma4Var.f461833m) == null) {
                        ka4Var3 = null;
                    } else {
                        r45.na4 na4Var = new r45.na4();
                        na4Var.mo11468x92b714fd(gVar2.g());
                        ka4Var3 = na4Var.f462730f;
                    }
                    lVarArr[2] = new jz5.l("liveSdkChannelParams", ka4Var3);
                    java.lang.String d17 = ko0.t.f391436a.d(m75945x2fec8307);
                    lVarArr[3] = new jz5.l("playerInfoData", new mn0.l0(d17 == null ? "" : d17, ncVar.f559033f, nw1Var != null ? nw1Var.m75942xfb822ef2(0) : 0L, ncVar.f559029b, android.os.SystemClock.elapsedRealtime(), ncVar.f559031d));
                    lVarArr[4] = new jz5.l("key_enter_scene", aVar);
                    j0Var.Ni(activityC0065xcd7aa112, j19, view2, b18, kz5.c1.i(lVarArr), new c61.t7(x7Var));
                    return;
                }
                ez2.g.f339435a = new ez2.e(ncVar.f559029b, ez2.f.f339431e, ez2.d.f339406i, aVar.ordinal(), -1L);
                long m75942xfb822ef2 = nw1Var != null ? nw1Var.m75942xfb822ef2(0) : 0L;
                android.view.ViewParent parent = view2.getParent();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) parent;
                java.lang.String str2 = m75945x2fec8307 == null ? "" : m75945x2fec8307;
                boolean z37 = !((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).hk(nw1Var);
                if (nw1Var != null) {
                    r45.ma4 ma4Var2 = (r45.ma4) nw1Var.m75936x14adae67(23);
                    if (ma4Var2 == null || (gVar = ma4Var2.f461833m) == null) {
                        ka4Var2 = null;
                    } else {
                        r45.na4 na4Var2 = new r45.na4();
                        na4Var2.mo11468x92b714fd(gVar.g());
                        ka4Var2 = na4Var2.f462730f;
                    }
                    ka4Var = ka4Var2;
                } else {
                    ka4Var = null;
                }
                java.lang.String d18 = ko0.t.f391436a.d(m75945x2fec8307);
                ig2.r i18 = ig2.m.f372926a.i(activityC0065xcd7aa112, new ig2.g(aVar, j19, m75942xfb822ef2, viewGroup2, view2, str2, z37, ka4Var, new mn0.l0(d18 == null ? "" : d18, ncVar.f559033f, nw1Var != null ? nw1Var.m75942xfb822ef2(0) : 0L, j19, android.os.SystemClock.elapsedRealtime(), ncVar.f559031d)));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveFluentAnimUti", "startSwitchOutFromSquare image animation for feed:".concat(pm0.v.u(j17)));
                i18.g(new c61.u7(x7Var));
                return;
            }
        }
        pVar.mo149xb9724478(java.lang.Boolean.FALSE, null);
    }
}
