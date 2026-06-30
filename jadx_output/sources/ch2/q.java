package ch2;

/* loaded from: classes10.dex */
public final class q extends if2.b implements mf2.c, bh2.b, tn0.x0 {

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f41437m;

    /* renamed from: n, reason: collision with root package name */
    public kotlinx.coroutines.y0 f41438n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f41439o;

    /* renamed from: p, reason: collision with root package name */
    public long f41440p;

    /* renamed from: q, reason: collision with root package name */
    public int f41441q;

    /* renamed from: r, reason: collision with root package name */
    public long f41442r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f41443s;

    /* renamed from: t, reason: collision with root package name */
    public kotlinx.coroutines.r2 f41444t;

    /* renamed from: u, reason: collision with root package name */
    public kotlinx.coroutines.r2 f41445u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f41437m = jz5.h.b(new ch2.p(this));
        this.f41441q = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z6(ch2.q r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ch2.q.Z6(ch2.q, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // mf2.c
    public void M2(xh2.b micInfoData) {
        kotlin.jvm.internal.o.g(micInfoData, "micInfoData");
        if (zl2.r4.f473950a.w1()) {
            return;
        }
        r45.q12 q12Var = ((mm2.e1) business(mm2.e1.class)).f328989s;
        int i17 = micInfoData.f454528g;
        if (q12Var != null) {
            q12Var.set(1, java.lang.Integer.valueOf(i17));
        }
        int i18 = micInfoData.f454527f;
        if (i18 == 0) {
            return;
        }
        if (i18 == 2 && i17 == 8) {
            c7();
        } else {
            f7("onMicInfoChanged");
        }
    }

    @Override // bh2.b
    public void a0(java.lang.String songUniqueId, int i17) {
        android.view.View view;
        el2.r2 r2Var;
        kotlin.jvm.internal.o.g(songUniqueId, "songUniqueId");
        android.content.Context O6 = O6();
        android.app.Activity activity = O6 instanceof android.app.Activity ? (android.app.Activity) O6 : null;
        if (activity == null) {
            return;
        }
        r45.gw1 gw1Var = ((om2.l) business(om2.l.class)).f346344i;
        if (e7()) {
            com.tencent.mm.plugin.finder.live.plugin.ag0 ag0Var = (com.tencent.mm.plugin.finder.live.plugin.ag0) R6(com.tencent.mm.plugin.finder.live.plugin.ag0.class);
            if (ag0Var != null && (r2Var = ag0Var.I) != null) {
                view = r2Var.f253899d;
            }
            view = null;
        } else {
            df2.ox oxVar = (df2.ox) controller(df2.ox.class);
            if (oxVar != null) {
                view = oxVar.f231013n;
            }
            view = null;
        }
        com.tencent.mm.plugin.finder.live.view.ub ubVar = this.f291099e;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = ubVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) ubVar : null;
        if (gw1Var == null || view == null || k0Var == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveKTVController", "checkKTVGuideShareShow limit: " + gw1Var.getInteger(4) + " title: " + gw1Var.getString(2));
        java.lang.String string = gw1Var.getString(2);
        boolean z17 = false;
        if (string != null) {
            if (string.length() == 0) {
                z17 = true;
            }
        }
        if (z17) {
            return;
        }
        com.tencent.mm.plugin.finder.live.widget.rc rcVar = new com.tencent.mm.plugin.finder.live.widget.rc(activity);
        rcVar.f119629k = com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT;
        java.lang.String string2 = gw1Var.getString(2);
        if (string2 == null) {
            string2 = "";
        }
        rcVar.f119626h = string2;
        rcVar.f119628j = e7() ? com.tencent.mm.plugin.finder.live.widget.sc.f119750e : com.tencent.mm.plugin.finder.live.widget.sc.f119749d;
        rcVar.f119630l = true;
        rcVar.f119627i = "KTVGuideShareShow";
        rcVar.f119623e = new ch2.a(this);
        new com.tencent.mm.plugin.finder.live.widget.yc(rcVar).b(view, k0Var.getViewScope());
    }

    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x019b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a7(long r28, r45.vl1 r30) {
        /*
            Method dump skipped, instructions count: 1163
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ch2.q.a7(long, r45.vl1):void");
    }

    @Override // mf2.c
    public void b(boolean z17) {
        kn0.p pVar;
        if (((mm2.e1) business(mm2.e1.class)).b7()) {
            tn0.w0 Q6 = Q6();
            boolean z18 = false;
            if (Q6 != null && (pVar = Q6.D) != null && !pVar.i()) {
                z18 = true;
            }
            if (z18) {
                b7().f(z17);
            }
        }
    }

    public final mh2.u1 b7() {
        return (mh2.u1) ((jz5.n) this.f41437m).getValue();
    }

    public final void c7() {
        tn0.w0 Q6;
        vn0.e eVar;
        tn0.w0 Q62;
        if (this.f41439o) {
            return;
        }
        this.f41439o = true;
        com.tencent.mars.xlog.Log.i("FinderLiveKTVController", "initKTVRoomLive");
        ch2.o2 o2Var = (ch2.o2) controller(ch2.o2.class);
        if (o2Var != null) {
            com.tencent.mars.xlog.Log.i("FinderLiveKTVSingController", "onKTVInit");
            com.tencent.trtc.TRTCCloudDef.TRTCSpeedTestParams tRTCSpeedTestParams = new com.tencent.trtc.TRTCCloudDef.TRTCSpeedTestParams();
            tRTCSpeedTestParams.sdkAppId = o2Var.i7().f328987q.f380294d;
            tRTCSpeedTestParams.userId = o2Var.i7().f328987q.f380295e;
            tRTCSpeedTestParams.userSig = x51.j1.b(o2Var.i7().f328987q.f380298h);
            tRTCSpeedTestParams.expectedUpBandwidth = 1000;
            tRTCSpeedTestParams.expectedDownBandwidth = 10;
            tRTCSpeedTestParams.scene = 3;
            com.tencent.mars.xlog.Log.i("FinderLiveKTVSingController", "startSpeedTest result: " + com.tencent.trtc.TRTCCloud.sharedInstance(o2Var.O6()).startSpeedTest(tRTCSpeedTestParams));
            com.tencent.trtc.TRTCCloud.sharedInstance(o2Var.O6()).addListener(new ch2.k2(o2Var));
            tn0.w0 Q63 = o2Var.Q6();
            if (Q63 != null) {
                Q63.x((ch2.g0) ((jz5.n) o2Var.E).getValue());
            }
            kotlinx.coroutines.r2 r2Var = o2Var.f41419J;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            com.tencent.mm.plugin.finder.live.util.y.d(o2Var, null, null, new ch2.d1(o2Var, null), 3, null);
            kotlinx.coroutines.r2 r2Var2 = o2Var.K;
            if (r2Var2 != null) {
                kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
            }
            com.tencent.mm.plugin.finder.live.util.y.d(o2Var, null, null, new ch2.a1(o2Var, null), 3, null);
            kotlinx.coroutines.r2 r2Var3 = o2Var.F;
            if (r2Var3 != null) {
                kotlinx.coroutines.p2.a(r2Var3, null, 1, null);
            }
            com.tencent.mm.plugin.finder.live.util.y.d(o2Var, null, null, new ch2.u0(o2Var, null), 3, null);
            kotlinx.coroutines.r2 r2Var4 = o2Var.L;
            if (r2Var4 != null) {
                kotlinx.coroutines.p2.a(r2Var4, null, 1, null);
            }
            com.tencent.mm.plugin.finder.live.util.y.d(o2Var, null, null, new ch2.g1(o2Var, null), 3, null);
            kotlinx.coroutines.r2 r2Var5 = o2Var.M;
            if (r2Var5 != null) {
                kotlinx.coroutines.p2.a(r2Var5, null, 1, null);
            }
            com.tencent.mm.plugin.finder.live.util.y.d(o2Var, null, null, new ch2.r0(o2Var, null), 3, null);
            kotlinx.coroutines.r2 r2Var6 = o2Var.N;
            if (r2Var6 != null) {
                kotlinx.coroutines.p2.a(r2Var6, null, 1, null);
            }
            com.tencent.mm.plugin.finder.live.util.y.d(o2Var, null, null, new ch2.x0(o2Var, null), 3, null);
            dk2.tb tbVar = dk2.ef.f233392k;
            tbVar.f(37);
            r45.gc2 g76 = o2Var.g7();
            com.tencent.mars.xlog.Log.i("FinderLiveKTVSingController", "startKTVSync");
            tbVar.e(37, g76, new ch2.x1(o2Var, r45.hc2.class), true);
            if (o2Var.w7() && (Q62 = o2Var.Q6()) != null) {
                Q62.C(true);
            }
        }
        zl2.r4 r4Var = zl2.r4.f473950a;
        if (!r4Var.x1() && !((mm2.c1) business(mm2.c1.class)).a8()) {
            com.tencent.mars.xlog.Log.i("FinderLiveKTVController", "checkLoadKTVBackground visitor, live not start");
        } else if (com.tencent.mm.plugin.finder.live.util.d2.f115478c.size() != 0) {
            com.tencent.mars.xlog.Log.i("FinderLiveKTVController", "checkLoadKTVBackground had data");
        } else if (((mm2.e1) business(mm2.e1.class)).b7()) {
            com.tencent.mm.plugin.finder.live.util.y.o(this, kotlinx.coroutines.q1.f310570c, null, new ch2.b(this, null), 2, null);
        } else {
            com.tencent.mars.xlog.Log.i("FinderLiveKTVController", "checkLoadKTVBackground no ktv room");
        }
        if (!r4Var.w1()) {
            com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new ch2.h(this, null), 3, null);
        }
        if (((om2.l) business(om2.l.class)).Q6() == 3) {
            vn0.b.f438174a.a().f455406d = 1;
            if (!d7() || (Q6 = Q6()) == null || (eVar = Q6.f420764m) == null) {
                return;
            }
            eVar.h(1);
        }
    }

    public final boolean d7() {
        if (zl2.r4.f473950a.x1()) {
            return true;
        }
        tn0.w0 Q6 = Q6();
        return Q6 != null && Q6.X();
    }

    public final boolean e7() {
        if (((mm2.c1) business(mm2.c1.class)).T) {
            return false;
        }
        mm2.n0 n0Var = (mm2.n0) business(mm2.n0.class);
        return !(n0Var != null && n0Var.f329273r);
    }

    public final void f7(java.lang.String scene) {
        tn0.w0 Q6;
        vn0.e eVar;
        if (this.f41439o) {
            com.tencent.mars.xlog.Log.i("FinderLiveKTVController", "unInitKTVRoomLive");
            this.f41439o = false;
            kotlinx.coroutines.r2 r2Var = this.f41444t;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            ch2.o2 o2Var = (ch2.o2) controller(ch2.o2.class);
            if (o2Var != null) {
                kotlin.jvm.internal.o.g(scene, "scene");
                com.tencent.mars.xlog.Log.i("FinderLiveKTVSingController", "onKTVUnInit scene: ".concat(scene));
                kotlinx.coroutines.r2 r2Var2 = o2Var.F;
                if (r2Var2 != null) {
                    kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
                }
                kotlinx.coroutines.r2 r2Var3 = o2Var.f41419J;
                if (r2Var3 != null) {
                    kotlinx.coroutines.p2.a(r2Var3, null, 1, null);
                }
                kotlinx.coroutines.r2 r2Var4 = o2Var.K;
                if (r2Var4 != null) {
                    kotlinx.coroutines.p2.a(r2Var4, null, 1, null);
                }
                kotlinx.coroutines.r2 r2Var5 = o2Var.L;
                if (r2Var5 != null) {
                    kotlinx.coroutines.p2.a(r2Var5, null, 1, null);
                }
                kotlinx.coroutines.r2 r2Var6 = o2Var.M;
                if (r2Var6 != null) {
                    kotlinx.coroutines.p2.a(r2Var6, null, 1, null);
                }
                kotlinx.coroutines.r2 r2Var7 = o2Var.N;
                if (r2Var7 != null) {
                    kotlinx.coroutines.p2.a(r2Var7, null, 1, null);
                }
                o2Var.C7();
                tn0.w0 Q62 = o2Var.Q6();
                if (Q62 != null) {
                    ch2.g0 listener = (ch2.g0) ((jz5.n) o2Var.E).getValue();
                    kotlin.jvm.internal.o.g(listener, "listener");
                    Q62.f420779x1.remove(listener);
                }
                o2Var.d7(scene);
                dk2.ef.f233392k.f(37);
                if (o2Var.w7()) {
                    tn0.w0 Q63 = o2Var.Q6();
                    if (Q63 != null) {
                        Q63.C(false);
                    }
                    tn0.w0 Q64 = o2Var.Q6();
                    if (Q64 != null) {
                        android.graphics.drawable.Drawable drawable = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDrawable(com.tencent.mm.R.raw.mic_user_leave);
                        kotlin.jvm.internal.o.f(drawable, "getDrawable(...)");
                        Q64.N0(pm0.v.o(drawable, com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH, 1280, android.graphics.Bitmap.Config.ARGB_8888), 5);
                    }
                }
                o2Var.f41433z.d();
                com.tencent.mars.xlog.Log.i("FinderLiveKTVSingController", "stopTRTCSEITimer");
                o2Var.y7(o2Var.q7().f346314u, false);
            }
            if (((om2.l) business(om2.l.class)).Q6() == 3) {
                vn0.b.f438174a.a().f455406d = 0;
                if (!d7() || (Q6 = Q6()) == null || (eVar = Q6.f420764m) == null) {
                    return;
                }
                eVar.h(0);
            }
        }
    }

    @Override // tn0.x0
    public void h3(java.util.ArrayList userList) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(userList, "userList");
        if (((mm2.e1) business(mm2.e1.class)).b7()) {
            java.util.Iterator it = userList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (kotlin.jvm.internal.o.b(((com.tencent.mm.live.core.core.model.UserVolumeInfo) obj).f68557d, ((mm2.c1) business(mm2.c1.class)).m8())) {
                        break;
                    }
                }
            }
            com.tencent.mm.live.core.core.model.UserVolumeInfo userVolumeInfo = (com.tencent.mm.live.core.core.model.UserVolumeInfo) obj;
            if (userVolumeInfo != null) {
                if ((((mm2.c1) business(mm2.c1.class)).O4 || ((mm2.o4) business(mm2.o4.class)).C7()) && userVolumeInfo.f68559f > 0) {
                    kotlinx.coroutines.r2 r2Var = this.f41445u;
                    boolean z17 = false;
                    if (r2Var != null && r2Var.a()) {
                        z17 = true;
                    }
                    if (z17) {
                        return;
                    }
                    kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                    this.f41445u = com.tencent.mm.plugin.finder.live.util.y.o(this, kotlinx.coroutines.internal.b0.f310484a, null, new ch2.k(this, null), 2, null);
                }
            }
        }
    }

    @Override // mf2.c
    public void j2() {
        r45.x84 x84Var;
        r45.ia4 ia4Var;
        java.lang.String str;
        xh2.g Q6;
        kn0.p pVar;
        if (((mm2.e1) business(mm2.e1.class)).b7()) {
            tn0.w0 Q62 = Q6();
            boolean z17 = false;
            if (Q62 != null && (pVar = Q62.D) != null && !pVar.i()) {
                z17 = true;
            }
            if (!z17 || (x84Var = ((om2.g) business(om2.g.class)).f346309p) == null || (ia4Var = x84Var.f389870i) == null || (str = ia4Var.f376871f) == null || (Q6 = ((mm2.y2) business(mm2.y2.class)).Q6(str, zl2.r4.f473950a.w1())) == null) {
                return;
            }
            b7().f(!Q6.f454546a);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onFloatMode() {
        fo0.n O;
        com.tencent.mm.live.core.mini.AbsLiveMiniView absLiveMiniView;
        super.onFloatMode();
        if (((mm2.e1) business(mm2.e1.class)).b7()) {
            tn0.w0 Q6 = Q6();
            if (Q6 != null) {
                Q6.f420774u = null;
            }
            tn0.w0 Q62 = Q6();
            android.view.ViewGroup viewGroup = (Q62 == null || (O = Q62.O()) == null || (absLiveMiniView = O.f264824h) == null) ? null : (android.view.ViewGroup) absLiveMiniView.findViewById(com.tencent.mm.R.id.f485464rt3);
            if (((mm2.e1) business(mm2.e1.class)).b7() && viewGroup != null) {
                oz5.i a17 = kotlinx.coroutines.t3.a(null, 1, null);
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                this.f41438n = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) a17).plus(kotlinx.coroutines.internal.b0.f310484a));
                android.view.View view = b7().f326292b;
                kotlin.jvm.internal.o.d(view);
                android.view.ViewParent parent = view.getParent();
                android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                if (viewGroup2 != null) {
                    android.view.View view2 = b7().f326292b;
                    kotlin.jvm.internal.o.d(view2);
                    viewGroup2.removeView(view2);
                }
                android.view.View view3 = b7().f326292b;
                kotlin.jvm.internal.o.d(view3);
                viewGroup.addView(view3, new android.view.ViewGroup.LayoutParams(-1, -1));
                kotlinx.coroutines.y0 y0Var = this.f41438n;
                if (y0Var != null) {
                    kotlinx.coroutines.l.d(y0Var, null, null, new ch2.m(this, null), 3, null);
                }
            }
        }
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        f7("onLiveDeactivate");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveMsg(r45.r71 r71Var) {
        super.onLiveMsg(r71Var);
        com.tencent.mars.xlog.Log.i("FinderLiveKTVController", "onLiveMsg");
        if (r71Var != null) {
            r45.up1 up1Var = (r45.up1) r71Var.getCustom(32);
            a7(up1Var != null ? up1Var.getLong(0) : 0L, (r45.vl1) r71Var.getCustom(45));
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        tn0.w0 Q6;
        vn0.e eVar;
        super.onLiveStart(hc1Var);
        vn0.c cVar = vn0.b.f438174a;
        cVar.a().f455406d = 0;
        om2.l lVar = (om2.l) business(om2.l.class);
        lVar.getClass();
        com.tencent.mars.xlog.Log.i("LiveKTVSlice", "onLiveStart");
        yg2.b bVar = lVar.f328963d.f272475i;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(bVar, kotlinx.coroutines.internal.b0.f310484a, null, new om2.k(lVar, null), 2, null);
        om2.l lVar2 = (om2.l) business(om2.l.class);
        boolean z17 = pm0.v.z(hc1Var != null ? hc1Var.getInteger(12) : 0, 16);
        lVar2.f346343h = z17;
        com.tencent.mars.xlog.Log.i("LiveKTVSlice", "set enableShowKTVMemberPanel " + z17);
        if (((mm2.e1) business(mm2.e1.class)).b7()) {
            c7();
            com.tencent.mars.xlog.Log.i("FinderLiveKTVController", "onLiveStart");
            if (hc1Var != null) {
                r45.up1 up1Var = (r45.up1) hc1Var.getCustom(68);
                long j17 = up1Var != null ? up1Var.getLong(0) : 0L;
                r45.ic1 ic1Var = (r45.ic1) hc1Var.getCustom(85);
                a7(j17, ic1Var != null ? (r45.vl1) ic1Var.getCustom(15) : null);
            }
        }
        if (((mm2.e1) business(mm2.e1.class)).g7() && ((om2.l) business(om2.l.class)).Q6() == 2) {
            cVar.a().f455406d = 1;
            if (!d7() || (Q6 = Q6()) == null || (eVar = Q6.f420764m) == null) {
                return;
            }
            eVar.h(1);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onNormalMode() {
        kotlinx.coroutines.y0 y0Var;
        super.onNormalMode();
        if (((mm2.e1) business(mm2.e1.class)).b7() && (y0Var = this.f41438n) != null) {
            kotlinx.coroutines.z0.c(y0Var, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        android.content.Intent intent;
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        com.tencent.mars.xlog.Log.i("FinderLiveKTVController", "onViewMount");
        android.content.Context context = pluginLayout.getContext();
        jz5.f0 f0Var = null;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity == null || (intent = activity.getIntent()) == null) {
            return;
        }
        long longExtra = intent.getLongExtra("CURRENT_FEED_ID", 0L);
        com.tencent.mars.xlog.Log.i("FinderLiveKTVController", "feedId: " + longExtra);
        if (longExtra != 0) {
            me2.d dVar = !me2.c.f325921a.a(longExtra) ? null : (me2.d) me2.c.f325923c.remove(java.lang.Long.valueOf(longExtra));
            r45.xn1 xn1Var = dVar != null ? dVar.f325927b : null;
            r45.x84 x84Var = dVar != null ? dVar.f325926a : null;
            if (xn1Var != null && x84Var != null) {
                com.tencent.mars.xlog.Log.i("FinderLiveKTVController", "ktvSeiData: " + pm0.b0.g(x84Var));
                mm2.e1 e1Var = (mm2.e1) business(mm2.e1.class);
                r45.q12 q12Var = new r45.q12();
                q12Var.set(0, 2);
                q12Var.set(1, 8);
                e1Var.n7(q12Var);
                c7();
                ch2.o2 o2Var = (ch2.o2) controller(ch2.o2.class);
                if (o2Var != null) {
                    r45.ia4 ia4Var = x84Var.f389870i;
                    if (ia4Var != null) {
                        com.tencent.mars.xlog.Log.i("FinderLiveKTVSingController", "handleSEIKTVInfoWhenJump sing_state: " + ia4Var.f376874i);
                        o2Var.u7(ia4Var, xn1Var, x84Var);
                    }
                    f0Var = jz5.f0.f302826a;
                }
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.i("FinderLiveKTVController", "ktvChannelData is null");
            }
        }
    }

    @Override // tn0.x0
    public void q1(int i17, int i18, java.lang.String str) {
        om2.e eVar;
        kotlinx.coroutines.flow.j2 j2Var;
        hn2.d dVar;
        vn0.e eVar2;
        tn0.w0 Q6 = Q6();
        int c17 = (Q6 == null || (eVar2 = Q6.f420764m) == null) ? -1 : eVar2.c();
        com.tencent.mars.xlog.Log.i("FinderLiveKTVController", "onSwitchRole currentRole: " + i17 + " audioRouteType: " + c17);
        sf2.d3 d3Var = (sf2.d3) getStore().controller(sf2.d3.class);
        if (d3Var != null) {
            if (i17 != 20 || (dVar = d3Var.f407106p) == null) {
                d3Var.f407106p = null;
                d3Var.f407107q = null;
            } else {
                java.lang.Integer num = d3Var.f407107q;
                if (num != null) {
                    com.tencent.mm.plugin.finder.live.util.y.d(this, null, null, new ch2.j(d3Var, dVar, num.intValue(), null), 3, null);
                }
            }
        }
        if (c17 == -1 || (eVar = (om2.e) business(om2.e.class)) == null || (j2Var = eVar.f346298q) == null) {
            return;
        }
        ((kotlinx.coroutines.flow.h3) j2Var).k(java.lang.Integer.valueOf(c17));
    }
}
