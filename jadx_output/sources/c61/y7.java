package c61;

/* loaded from: classes3.dex */
public final class y7 implements c61.dc {

    /* renamed from: b, reason: collision with root package name */
    public static final c61.y7 f39429b = new c61.y7();

    @Override // c61.dc
    public void a(android.view.View clickedRootView, androidx.appcompat.app.AppCompatActivity contextActivity, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, ez2.a scene, yz5.p onAnimationEndCallback) {
        kotlin.jvm.internal.o.g(clickedRootView, "clickedRootView");
        kotlin.jvm.internal.o.g(contextActivity, "contextActivity");
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(onAnimationEndCallback, "onAnimationEndCallback");
        b(clickedRootView, contextActivity, new zy2.nc(feed.getFeedObject().getUserName(), feed.getFeedObject().getId(), feed.getFeedObject().getObjectNonceId(), feed.getFeedObject().getLiveInfo(), feed.g0(), feed.getFeedObject().getNickName(), null, null, 192, null), scene, onAnimationEndCallback);
    }

    @Override // c61.dc
    public void b(android.view.View view, androidx.appcompat.app.AppCompatActivity contextActivity, zy2.nc feedData, ez2.a scene, yz5.p onAnimationEndCallback) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(contextActivity, "contextActivity");
        kotlin.jvm.internal.o.g(feedData, "feedData");
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(onAnimationEndCallback, "onAnimationEndCallback");
        if (!((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Kk()) {
            d(view, contextActivity, feedData, scene, onAnimationEndCallback);
            return;
        }
        wd0.q1 q1Var = (wd0.q1) i95.n0.c(wd0.q1.class);
        c61.v7 v7Var = new c61.v7(view, contextActivity, feedData, scene, onAnimationEndCallback);
        ((vd0.j2) q1Var).getClass();
        v24.o0.h(contextActivity, 9007199254740992L, null, v7Var, 3);
    }

    public final void c(android.view.View view, androidx.appcompat.app.AppCompatActivity contextActivity, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, ez2.a scene, yz5.p onAnimationEndCallback) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(contextActivity, "contextActivity");
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(onAnimationEndCallback, "onAnimationEndCallback");
        b(view, contextActivity, new zy2.nc(feed.getFeedObject().getUserName(), feed.getFeedObject().getId(), feed.getFeedObject().getObjectNonceId(), feed.getFeedObject().getLiveInfo(), feed.g0(), feed.getFeedObject().getNickName(), null, null, 192, null), scene, onAnimationEndCallback);
    }

    public final void d(android.view.View view, androidx.appcompat.app.AppCompatActivity appCompatActivity, zy2.nc ncVar, ez2.a aVar, yz5.p pVar) {
        r45.ka4 ka4Var;
        r45.ka4 ka4Var2;
        com.tencent.mm.protobuf.g gVar;
        r45.ka4 ka4Var3;
        r45.ma4 ma4Var;
        com.tencent.mm.protobuf.g gVar2;
        com.tencent.mars.xlog.Log.i("FinderLiveFluentAnimUti", "fluentLiveClick objectUserName: " + ncVar.f477495a);
        java.lang.String str = ncVar.f477495a;
        boolean z17 = str.length() > 0;
        r45.nw1 nw1Var = ncVar.f477498d;
        if (z17) {
            android.content.Context context = view.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            if (com.tencent.mm.sdk.platformtools.t8.D0(str, xy2.c.e(context))) {
                i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                c61.ub.Rf((c61.ub) c17, appCompatActivity, ncVar.f477496b, ncVar.f477497c, nw1Var == null ? new r45.nw1() : nw1Var, null, null, null, null, ncVar.f477499e, null, null, 1776, null);
                return;
            }
        }
        ig2.e eVar = ig2.e.f291372a;
        if ((eVar.d() && !eVar.b(ncVar)) && !iq.b.m(appCompatActivity, false, null)) {
            ((b92.g1) ((c61.ac) i95.n0.c(c61.ac.class))).getClass();
            if (dk2.r9.f234025a.c()) {
                android.view.KeyEvent.Callback findViewWithTag = view.findViewWithTag("nearby-live-preview-view-tag");
                ws5.f fVar = findViewWithTag instanceof ws5.f ? (ws5.f) findViewWithTag : null;
                if (fVar == null) {
                    android.view.ViewGroup viewGroup = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
                    java.lang.Object i17 = viewGroup != null ? hc2.f1.i(viewGroup, com.tencent.mm.R.id.ua9, "nearby-live-preview-view-tag") : null;
                    fVar = i17 instanceof ws5.f ? (ws5.f) i17 : null;
                }
                android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.f487295o70);
                if (findViewById == null) {
                    findViewById = ncVar.f477501g;
                }
                android.view.View view2 = findViewById;
                boolean z18 = pm0.v.z(nw1Var != null ? (int) nw1Var.getLong(32) : 0, 256);
                boolean z19 = fVar != null && fVar.isPlaying();
                boolean z27 = nw1Var != null && nw1Var.getInteger(2) == 1;
                boolean z28 = fVar != null && fVar.getF130755x();
                android.view.TextureView textureView = fVar != null ? fVar.getTextureView() : null;
                boolean z29 = (textureView != null ? textureView.getSurfaceTexture() : null) != null;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startSwitchOutFromSquare animation for feed:");
                long j17 = ncVar.f477496b;
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
                com.tencent.mars.xlog.Log.i("FinderLiveFluentAnimUti", sb6.toString());
                if (z19 && z28 && !z18 && z27 && z29) {
                    com.tencent.mars.xlog.Log.w("FinderLiveFluentAnimUti", "startSwitchOutFromSquare video animation for feed:" + pm0.v.u(j17) + " liveView:" + fVar);
                    if (fVar == null) {
                        pVar.invoke(java.lang.Boolean.FALSE, null);
                        return;
                    }
                    c61.w7 w7Var = new c61.w7(pVar);
                    long j18 = ncVar.f477496b;
                    if (!((pg2.j0) i95.n0.c(pg2.j0.class)).wh()) {
                        ez2.g.f257902a = new ez2.e(ncVar.f477496b, ez2.f.f257898e, ez2.d.f257873i, aVar.ordinal(), -1L);
                        ig2.j jVar = new ig2.j(aVar, j18, nw1Var != null ? nw1Var.getLong(0) : 0L, view, fVar.getF130757z(), fVar.getA(), fVar.getB(), (mn0.b0) fVar.e(), fVar.getTextureView(), false, false);
                        jVar.f291388m = view.findViewById(com.tencent.mm.R.id.icp);
                        ig2.m.f291393a.i(appCompatActivity, jVar).g(new c61.s7(w7Var));
                        return;
                    }
                    ez2.g.f257902a = new ez2.e(ncVar.f477496b, ez2.f.f257899f, ez2.d.f257871g, aVar.ordinal(), -1L);
                    java.lang.Object q17 = fVar.q();
                    nn0.c cVar = q17 instanceof nn0.c ? (nn0.c) q17 : null;
                    if (cVar == null) {
                        return;
                    }
                    int f130757z = fVar.getF130757z();
                    int a17 = fVar.getA();
                    android.graphics.Rect b17 = qg2.d.f362793a.b(f130757z, a17, false);
                    boolean g17 = fVar.g();
                    fVar.stop();
                    ((pg2.j0) i95.n0.c(pg2.j0.class)).Ri(appCompatActivity, j18, g17 ? fVar.getCoverView() : fVar.H(), b17, f130757z, a17, cVar, kz5.c1.i(new jz5.l("key_enter_type", 2), new jz5.l("key_enter_scene", aVar), new jz5.l("key_enter_square_preview_mode", java.lang.Integer.valueOf(g17 ? 1 : 0))), ncVar.f477502h, new c61.r7(cVar, w7Var));
                    return;
                }
                if (!z27 || view2 == null) {
                    com.tencent.mars.xlog.Log.w("FinderLiveFluentAnimUti", "startSwitchOutFromSquare no animation for feed:" + pm0.v.u(j17) + " liveView:" + fVar);
                    pVar.invoke(java.lang.Boolean.FALSE, null);
                    return;
                }
                c61.x7 x7Var = new c61.x7(pVar);
                long j19 = ncVar.f477496b;
                java.lang.String string = nw1Var != null && nw1Var.getInteger(42) == 1 ? "" : nw1Var != null ? nw1Var.getString(3) : null;
                pg2.j0 j0Var = (pg2.j0) i95.n0.c(pg2.j0.class);
                if (j0Var.wh()) {
                    ez2.g.f257902a = new ez2.e(ncVar.f477496b, ez2.f.f257899f, ez2.d.f257873i, aVar.ordinal(), -1L);
                    android.graphics.Rect b18 = qg2.d.f362793a.b(view2.getWidth(), view2.getHeight(), false);
                    jz5.l[] lVarArr = new jz5.l[5];
                    lVarArr[0] = new jz5.l("key_enter_type", 1);
                    lVarArr[1] = new jz5.l("liveUrl", string);
                    if (nw1Var == null || (ma4Var = (r45.ma4) nw1Var.getCustom(23)) == null || (gVar2 = ma4Var.f380300m) == null) {
                        ka4Var3 = null;
                    } else {
                        r45.na4 na4Var = new r45.na4();
                        na4Var.parseFrom(gVar2.g());
                        ka4Var3 = na4Var.f381197f;
                    }
                    lVarArr[2] = new jz5.l("liveSdkChannelParams", ka4Var3);
                    java.lang.String d17 = ko0.t.f309903a.d(string);
                    lVarArr[3] = new jz5.l("playerInfoData", new mn0.l0(d17 == null ? "" : d17, ncVar.f477500f, nw1Var != null ? nw1Var.getLong(0) : 0L, ncVar.f477496b, android.os.SystemClock.elapsedRealtime(), ncVar.f477498d));
                    lVarArr[4] = new jz5.l("key_enter_scene", aVar);
                    j0Var.Ni(appCompatActivity, j19, view2, b18, kz5.c1.i(lVarArr), new c61.t7(x7Var));
                    return;
                }
                ez2.g.f257902a = new ez2.e(ncVar.f477496b, ez2.f.f257898e, ez2.d.f257873i, aVar.ordinal(), -1L);
                long j27 = nw1Var != null ? nw1Var.getLong(0) : 0L;
                android.view.ViewParent parent = view2.getParent();
                kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) parent;
                java.lang.String str2 = string == null ? "" : string;
                boolean z37 = !((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).hk(nw1Var);
                if (nw1Var != null) {
                    r45.ma4 ma4Var2 = (r45.ma4) nw1Var.getCustom(23);
                    if (ma4Var2 == null || (gVar = ma4Var2.f380300m) == null) {
                        ka4Var2 = null;
                    } else {
                        r45.na4 na4Var2 = new r45.na4();
                        na4Var2.parseFrom(gVar.g());
                        ka4Var2 = na4Var2.f381197f;
                    }
                    ka4Var = ka4Var2;
                } else {
                    ka4Var = null;
                }
                java.lang.String d18 = ko0.t.f309903a.d(string);
                ig2.r i18 = ig2.m.f291393a.i(appCompatActivity, new ig2.g(aVar, j19, j27, viewGroup2, view2, str2, z37, ka4Var, new mn0.l0(d18 == null ? "" : d18, ncVar.f477500f, nw1Var != null ? nw1Var.getLong(0) : 0L, j19, android.os.SystemClock.elapsedRealtime(), ncVar.f477498d)));
                com.tencent.mars.xlog.Log.w("FinderLiveFluentAnimUti", "startSwitchOutFromSquare image animation for feed:".concat(pm0.v.u(j17)));
                i18.g(new c61.u7(x7Var));
                return;
            }
        }
        pVar.invoke(java.lang.Boolean.FALSE, null);
    }
}
