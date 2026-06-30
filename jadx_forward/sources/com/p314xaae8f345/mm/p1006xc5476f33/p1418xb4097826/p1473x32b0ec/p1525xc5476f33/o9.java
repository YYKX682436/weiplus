package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class o9 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l implements io0.a {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f195248p;

    /* renamed from: q, reason: collision with root package name */
    public final android.content.Context f195249q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10849x610a91e1 f195250r;

    /* renamed from: s, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f195251s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View f195252t;

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.g90 f195253u;

    /* renamed from: v, reason: collision with root package name */
    public int f195254v;

    /* renamed from: w, reason: collision with root package name */
    public int f195255w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f195256x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o9(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f195248p = statusMonitor;
        this.f195249q = root.getContext();
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.icy);
        ((com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10849x610a91e1) findViewById).m46529x742f459a(this);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "apply(...)");
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10849x610a91e1 c10849x610a91e1 = (com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10849x610a91e1) findViewById;
        this.f195250r = c10849x610a91e1;
        this.f195252t = root.getRootView().findViewById(com.p314xaae8f345.mm.R.id.ey8);
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.f566152ex3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f195253u = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.g90((android.view.ViewGroup) findViewById2, this);
        this.f195254v = 1;
        this.f195255w = -1;
        root.setPadding(0, 0, 0, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorPreviewPlugin", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c9 c9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c9(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.d9 d9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.d9(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.e9 e9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.e9(this);
        c10849x610a91e1.f150145n = c9Var;
        c10849x610a91e1.f150146o = d9Var;
        c10849x610a91e1.f150147p = e9Var;
        c10849x610a91e1.m46526xf9281a1f(this.f195254v == 1);
    }

    public static void D1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9 o9Var, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        ts0.c z19;
        ft0.d dVar;
        ms0.c cVar;
        hn0.f fVar;
        boolean z27 = (i17 & 1) != 0 ? false : z17;
        o9Var.getClass();
        boolean v27 = zl2.r4.f555483a.v2();
        vn0.c cVar2 = vn0.b.f519707a;
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10849x610a91e1 c10849x610a91e1 = o9Var.f195250r;
        if (v27) {
            in0.q B1 = o9Var.B1();
            if (B1 != null) {
                java.lang.String str = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).f148524o;
                lo0.b0 b0Var = ko0.c0.f391358a.b().f401529e;
                if (c10849x610a91e1 != null) {
                    if (!(str == null || str.length() == 0)) {
                        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = B1.X;
                        if (interfaceC26164x73fc6bc6 != null) {
                            interfaceC26164x73fc6bc6.mo100976x360802();
                        }
                        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc62 = B1.X;
                        if (interfaceC26164x73fc6bc62 != null) {
                            interfaceC26164x73fc6bc62.mo100933x41012807();
                        }
                        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 m101082x5f9ba979 = com.p314xaae8f345.p3006xb8ff1437.api.C26184x9df96dcd.m101082x5f9ba979(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                        B1.X = m101082x5f9ba979;
                        if (m101082x5f9ba979 != null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCore", "startPushLocalVideo path:" + str);
                            m101082x5f9ba979.mo100945x683d6267(str);
                            m101082x5f9ba979.mo100947xfd27780d(true);
                        }
                        B1.f502307u = c10849x610a91e1;
                        cVar2.a().getClass();
                        cVar2.d().getClass();
                        c10849x610a91e1.f(new tn0.d0(B1), new tn0.e0(B1));
                        go0.f0 f0Var = B1.f502304r;
                        f0Var.getClass();
                        f0Var.l(new go0.p(f0Var));
                        f0Var.l(new go0.b0(f0Var, b0Var));
                        f0Var.u(new tn0.i0(B1, str));
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiveCore", "startPushLocalVideo preiewView is null or path is nullOrEmpty");
            }
            o9Var.C1();
            return;
        }
        in0.q B12 = o9Var.B1();
        if (B12 != null && (fVar = B12.f502306t) != null) {
            ((hn0.p) fVar).i(dk2.ef.f314905a.F());
        }
        int A1 = o9Var.A1();
        if (z27) {
            in0.q B13 = o9Var.B1();
            if (B13 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l9 l9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l9(o9Var, A1);
                if (c10849x610a91e1 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiveCore", "startPreviewToRemote preiewView is null");
                } else {
                    go0.f0 f0Var2 = B13.f502304r;
                    f0Var2.getClass();
                    f0Var2.l(new go0.n(f0Var2));
                    java.lang.String debugText = "startPreview " + c10849x610a91e1;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(debugText, "debugText");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCore", debugText);
                    B13.f502307u = c10849x610a91e1;
                    cVar2.a().getClass();
                    cVar2.d().getClass();
                    c10849x610a91e1.f(new tn0.a0(B13), new tn0.b0(B13));
                    ts0.r rVar = B13.f502308v;
                    if (rVar != null && ((ts0.b) rVar).G()) {
                        xn0.b b17 = cVar2.b();
                        ts0.r rVar2 = B13.f502308v;
                        b17.f536943a = rVar2 != null ? rVar2.e() : 0;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCore", "start preview success");
                        l9Var.mo152xb9724478();
                        ts0.r rVar3 = B13.f502308v;
                        if (rVar3 == null || (z19 = rVar3.z()) == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCore", "cameraConfig null");
                            pm0.z.b(xy2.b.f539688b, "startPreviewToRemoteButCameraConfigNull", false, null, null, false, false, null, 124, null);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCore", "start preview remote systemRoate: " + A1);
                            ts0.c.f503078e = A1;
                            f0Var2.w(z19);
                            ts0.r rVar4 = B13.f502308v;
                            if ((rVar4 != null && rVar4.b() == 2) && A1 == 90 && (dVar = f0Var2.f355297m) != null && (cVar = dVar.f347995c) != null) {
                                cVar.r(0);
                            }
                            B13.f502310x = true;
                            f0Var2.mo8988x4ac79299(new tn0.c0(B13));
                        }
                    }
                }
            }
        } else {
            in0.q B14 = o9Var.B1();
            if (B14 != null) {
                B14.D0(c10849x610a91e1, ko0.c0.f391358a.b().f401529e, A1);
            }
            int x17 = o9Var.x1(A1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreAnchor", "preview cameraRotate: " + x17 + ", contextRotate: " + A1);
            in0.q B15 = o9Var.B1();
            if (B15 != null) {
                B15.y0(x17);
            }
            o9Var.C1();
        }
        o9Var.f446856d.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.m9(o9Var));
    }

    public static final void t1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9 o9Var) {
        android.view.View view = o9Var.f195252t;
        if (view != null && view.getVisibility() == 0) {
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorPreviewPlugin", "hideFrameScaleTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorPreviewPlugin", "hideFrameScaleTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            zl2.r4.f555483a.I0().putBoolean("FRAME_SCALE_TIPS_SHOW_KEY", false);
            p3325xe03a0797.p3326xc267989b.r2 r2Var = o9Var.f195251s;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
        }
    }

    public static final void u1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9 o9Var, int i17) {
        kn0.f fVar;
        o9Var.getClass();
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.z4 z4Var = ml2.z4.C1;
        cl0.g gVar = new cl0.g();
        gVar.o("type", i17);
        kn0.i iVar = ((mm2.e1) o9Var.P0(mm2.e1.class)).f410523t;
        gVar.o("camera_status", iVar != null && (fVar = iVar.f391093d) != null && fVar.f391063b ? 1 : 2);
        zy2.zb.y6(zbVar, z4Var, gVar.toString(), null, 4, null);
    }

    @Override // qo0.a
    public void A0(int i17, int i18, android.content.Intent intent) {
        java.util.ArrayList<java.lang.String> stringArrayListExtra;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.g90 g90Var = this.f195253u;
        if ((i17 == 1 || i17 == 3) && i18 == -1) {
            if (i17 == 3) {
                g90Var.i();
            }
            ((mm2.c1) P0(mm2.c1.class)).f410389o5 = intent != null ? intent.getStringExtra(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1) : null;
            ((mm2.c1) P0(mm2.c1.class)).f410397p5 = intent != null ? intent.getStringExtra("fileExt") : null;
            ((mm2.c1) P0(mm2.c1.class)).f410403q5 = 1;
            boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(((mm2.c1) P0(mm2.c1.class)).f410389o5);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreAnchor", "REQUEST_CODE_SELECT_FILE screenShareFilePath:" + ((mm2.c1) P0(mm2.c1.class)).f410389o5 + " exist:" + j17);
            java.lang.String str = ((mm2.c1) P0(mm2.c1.class)).f410389o5;
            if ((str == null || str.length() == 0) || !j17) {
                ((mm2.c1) P0(mm2.c1.class)).f410389o5 = null;
                ((mm2.c1) P0(mm2.c1.class)).f410403q5 = 0;
            } else {
                g90Var.l(((mm2.c1) P0(mm2.c1.class)).f410403q5);
                g90Var.j();
                y1(true);
                mm2.c1 c1Var = (mm2.c1) dk2.ef.f314905a.i(mm2.c1.class);
                g90Var.f(c1Var != null ? c1Var.l7() : false);
            }
        } else if ((i17 == 2 || i17 == 4) && i18 == -1) {
            if (i17 == 4) {
                g90Var.i();
            }
            ((mm2.c1) P0(mm2.c1.class)).f410389o5 = (intent == null || (stringArrayListExtra = intent.getStringArrayListExtra("CropImage_OutputPath_List")) == null) ? null : (java.lang.String) kz5.n0.Z(stringArrayListExtra);
            ((mm2.c1) P0(mm2.c1.class)).f410403q5 = 2;
            boolean j18 = com.p314xaae8f345.mm.vfs.w6.j(((mm2.c1) P0(mm2.c1.class)).f410389o5);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreAnchor", "REQUEST_CODE_SELECT_IMAGE screenShareFilePath:" + ((mm2.c1) P0(mm2.c1.class)).f410389o5 + " exist:" + j18);
            java.lang.String str2 = ((mm2.c1) P0(mm2.c1.class)).f410389o5;
            if ((str2 == null || str2.length() == 0) || !j18) {
                ((mm2.c1) P0(mm2.c1.class)).f410389o5 = null;
                ((mm2.c1) P0(mm2.c1.class)).f410403q5 = 0;
            } else {
                g90Var.l(((mm2.c1) P0(mm2.c1.class)).f410403q5);
                g90Var.j();
                mm2.c1 c1Var2 = (mm2.c1) dk2.ef.f314905a.i(mm2.c1.class);
                g90Var.f(c1Var2 != null ? c1Var2.l7() : false);
                y1(true);
            }
        } else if (i17 == 5 && i18 == -1) {
            java.lang.String stringExtra = intent != null ? intent.getStringExtra("finder_biz_live_article_url") : null;
            if (!(stringExtra == null || r26.n0.N(stringExtra))) {
                ((mm2.c1) P0(mm2.c1.class)).f410421t5 = stringExtra;
                ((mm2.c1) P0(mm2.c1.class)).f410403q5 = 3;
                g90Var.k(stringExtra);
            }
        }
        if (i18 == -1) {
            if (i17 == 5 || i17 == 2 || i17 == 4 || i17 == 1 || i17 == 3) {
                qo0.c.a(this.f195248p, qo0.b.R3, null, 2, null);
            }
        }
    }

    public final int A1() {
        int i17;
        android.content.Context context = this.f195249q;
        if (!(context instanceof android.app.Activity)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LiveCoreAnchor", "Context is not Activity, using default rotation");
            return 0;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "context");
        int rotation = ((android.app.Activity) context).getWindowManager().getDefaultDisplay().getRotation();
        if (rotation == 0) {
            return 0;
        }
        if (rotation == 1) {
            i17 = 90;
        } else if (rotation == 2) {
            i17 = 180;
        } else {
            if (rotation != 3) {
                return 0;
            }
            i17 = 270;
        }
        return i17;
    }

    public final in0.q B1() {
        return dk2.ef.f314905a.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // qo0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C0(java.util.LinkedHashMap r6) {
        /*
            r5 = this;
            java.lang.String r0 = "micUserMap"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
            int r0 = r6.size()
            r5.f195254v = r0
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L11
            r0 = r2
            goto L12
        L11:
            r0 = r1
        L12:
            com.tencent.mm.live.core.view.LivePreviewView r3 = r5.f195250r
            r3.m46526xf9281a1f(r0)
            java.lang.Class<mm2.o4> r0 = mm2.o4.class
            androidx.lifecycle.c1 r0 = r5.P0(r0)
            mm2.o4 r0 = (mm2.o4) r0
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData r0 = r0.A
            java.lang.Object r0 = r0.mo3195x754a37bb()
            xh2.c r0 = (xh2.c) r0
            if (r0 == 0) goto L2c
            int r0 = r0.f536066c
            goto L2d
        L2c:
            r0 = r1
        L2d:
            com.tencent.mm.plugin.finder.live.plugin.g90 r4 = r5.f195253u
            r4.g(r0, r6)
            r6 = 2
            r4 = 0
            if (r0 == r6) goto L45
            r6 = 3
            if (r0 == r6) goto L45
            r6 = 8
            if (r0 == r6) goto L45
            com.tencent.mm.live.core.trtc.TRTCVideoRatioLayout r6 = r3.getRenderRatioLayout()
            r6.setBackground(r4)
            goto L5d
        L45:
            com.tencent.mm.live.core.trtc.TRTCVideoRatioLayout r6 = r3.getRenderRatioLayout()
            android.view.ViewGroup r0 = r5.f446856d
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r3 = 2131101198(0x7f06060e, float:1.7814799E38)
            int r0 = r0.getColor(r3)
            r6.setBackgroundColor(r0)
        L5d:
            int r6 = r5.f195254v
            if (r6 <= r2) goto L7e
            in0.q r6 = r5.B1()
            if (r6 == 0) goto L70
            kn0.p r6 = r6.D
            if (r6 == 0) goto L70
            boolean r6 = r6.f391122i
            if (r6 != 0) goto L70
            r1 = r2
        L70:
            if (r1 == 0) goto L7e
            com.tencent.mm.plugin.finder.live.view.k0 r6 = r5.R0()
            android.widget.RelativeLayout r6 = r6.m57684x8cdefb94()
            r6.setBackground(r4)
            goto L8c
        L7e:
            com.tencent.mm.plugin.finder.live.view.k0 r6 = r5.R0()
            android.widget.RelativeLayout r6 = r6.m57684x8cdefb94()
            r0 = 2131100581(0x7f0603a5, float:1.7813547E38)
            r6.setBackgroundResource(r0)
        L8c:
            int r6 = r5.f195254v
            if (r6 != r2) goto L93
            r5.v1()
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9.C0(java.util.LinkedHashMap):void");
    }

    public final void C1() {
        hn0.f fVar;
        java.lang.Object obj;
        java.lang.String str;
        ko0.l0 l0Var = ko0.l0.f391411a;
        dk2.ug ugVar = dk2.ug.f315751a;
        l0Var.c(dk2.ug.f315752b);
        ugVar.c(l0Var.b());
        in0.q B1 = B1();
        if (B1 == null || (fVar = B1.f502306t) == null) {
            return;
        }
        lo0.k0 k0Var = l0Var.b().f401596d;
        if (k0Var.f401569b) {
            java.util.List<lo0.h0> list = k0Var.f401573f;
            java.util.Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((lo0.h0) obj).f401535f) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            lo0.h0 h0Var = (lo0.h0) obj;
            if (h0Var == null || (str = h0Var.f401533d) == null) {
                str = "";
            }
            hn0.p pVar = (hn0.p) fVar;
            pVar.b();
            pVar.f363933b.l(new hn0.n(pVar, k0Var.f401572e, str));
            for (lo0.h0 h0Var2 : list) {
                pVar.f(h0Var2.f401534e, h0Var2.f401539j);
            }
            if (h0Var != null) {
                hn0.f.a(fVar, h0Var.f401539j, false, false, 4, null);
            }
        }
    }

    public final void E1() {
        y1(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.g90 g90Var = this.f195253u;
        g90Var.f194184a.setVisibility(8);
        g90Var.f194186c.removeAllViews();
        tn0.w0 d17 = g90Var.d();
        if (d17 != null) {
            d17.K0(false, g90Var.f194188e, null, null);
        }
        tn0.w0 d18 = g90Var.d();
        if (d18 != null) {
            d18.b0(0, 0);
        }
        g90Var.i();
        if (zl2.r4.f555483a.x1()) {
            qo0.c cVar = g90Var.f194185b.f194858g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) cVar;
            tn0.w0 d19 = g90Var.d();
            cl0.g gVar = d19 != null ? ((in0.q) d19).T1 : null;
            tn0.w0 d27 = g90Var.d();
            org.json.JSONObject J2 = d27 != null ? d27.J() : null;
            tn0.w0 d28 = g90Var.d();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0.m57628x9aa6f4f1(k0Var, gVar, J2, d28 != null ? ((in0.q) d28).W0() : null, true, null, 16, null);
        }
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p833x36756d.C10844x4ce18327 c10844x4ce18327 = this.f195250r.renderRatioLayout;
        c10844x4ce18327.getClass();
        c10844x4ce18327.f150109o.d(false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // qo0.a
    public void I0() {
    }

    @Override // qo0.a
    public void J0() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kn0.p pVar;
        hn0.f fVar;
        kn0.p pVar2;
        int i17;
        kn0.p pVar3;
        kn0.p pVar4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        super.M0(status, bundle);
        boolean f76 = ((mm2.e1) P0(mm2.e1.class)).f7();
        int ordinal = status.ordinal();
        int i18 = 3;
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10849x610a91e1 c10849x610a91e1 = this.f195250r;
        boolean z17 = false;
        if (ordinal == 5 || ordinal == 6 || ordinal == 7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreAnchor", "#statusChange status=" + status + " isScreenCaseGameMode=" + f76);
            ((mm2.o4) P0(mm2.o4.class)).A.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.h9(this));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb44 = ((mm2.o4) P0(mm2.o4.class)).A;
            if (c14227x4262fb44 != null && c14227x4262fb44.mo3195x754a37bb() == null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.String str = ((mm2.e1) P0(mm2.e1.class)).f410520q.f461834n;
                if (str == null) {
                    str = "DEFAULT_ANCHOR_USER_ID";
                }
                arrayList.add(new jo0.a(str, new hn5.b(0.0f, 0.0f, 1.0f, 1.0f), false));
                android.graphics.Rect rect = new android.graphics.Rect(0, 0, com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x, com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y);
                in0.q B1 = B1();
                c10849x610a91e1.d(arrayList, rect, (B1 == null || (pVar = B1.D) == null || !pVar.f391122i) ? false : true);
            }
            r45.q12 q12Var = (r45.q12) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) P0(mm2.g1.class)).f410601f).mo144003x754a37bb();
            if ((q12Var != null && q12Var.m75939xb282bd08(0) == 3) || f76) {
                c10849x610a91e1.setVisibility(8);
                return;
            } else {
                c10849x610a91e1.setVisibility(0);
                K0(0);
                return;
            }
        }
        if (ordinal == 10) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreAnchor", "switchCamera");
            if (com.p314xaae8f345.mm.ui.fl.e()) {
                int A1 = A1();
                in0.q B12 = B1();
                if (B12 != null) {
                    B12.J0(A1, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.n9(this, A1));
                }
            } else {
                in0.q B13 = B1();
                if (B13 != null) {
                    if (((mm2.c1) P0(mm2.c1.class)).O7()) {
                        in0.q e17 = dk2.ef.f314905a.e();
                        if (e17 != null && !e17.W()) {
                            z17 = true;
                        }
                        if (z17) {
                            i18 = 1;
                        }
                    } else {
                        i18 = 0;
                    }
                    hn0.h.h(B13, i18, null, 2, null);
                }
            }
            in0.q B14 = B1();
            if (B14 != null && (fVar = B14.f502306t) != null) {
                ((hn0.p) fVar).j(dk2.ef.f314905a.G());
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveAnchorIDKeyStat", "markAnchorSwitchCameraWhileLiveOn");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1380L, 7L, 1L);
            return;
        }
        if (ordinal == 27) {
            if (!zl2.r4.f555483a.v2()) {
                in0.q B15 = B1();
                if (B15 != null) {
                    B15.H0();
                    return;
                }
                return;
            }
            in0.q B16 = B1();
            if (B16 != null) {
                com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = B16.X;
                if (interfaceC26164x73fc6bc6 != null) {
                    interfaceC26164x73fc6bc6.mo100976x360802();
                }
                com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc62 = B16.X;
                if (interfaceC26164x73fc6bc62 != null) {
                    interfaceC26164x73fc6bc62.mo100933x41012807();
                }
                B16.X = null;
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.g90 g90Var = this.f195253u;
        if (ordinal == 191) {
            boolean z18 = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", false) : false;
            boolean z19 = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_SWITCH_MODE_FROM_MINIWINDOW", false) : false;
            boolean f77 = ((mm2.e1) P0(mm2.e1.class)).f7();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreAnchor", "#checkAudioMode isAudioMode:" + z18 + ", fromMiniWindow:" + z19 + ", isScreenCaseGameMode=" + f77 + ", liveData.audioModeHolderBm:" + ((mm2.c1) P0(mm2.c1.class)).I4);
            in0.q B17 = B1();
            if (!((B17 == null || (pVar2 = B17.D) == null || pVar2.f391122i) ? false : true)) {
                in0.q B18 = B1();
                if (B18 != null) {
                    B18.f502307u = c10849x610a91e1;
                }
            } else if (z18) {
                in0.q B19 = B1();
                if (B19 != null) {
                    B19.f502307u = c10849x610a91e1;
                }
            } else if (f77) {
                in0.q B110 = B1();
                if (B110 != null) {
                    B110.H0();
                }
            } else {
                D1(this, z19, false, 2, null);
                com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p833x36756d.C10844x4ce18327 c10844x4ce18327 = c10849x610a91e1.renderRatioLayout;
                c10844x4ce18327.getClass();
                c10844x4ce18327.f150109o.d(false);
            }
            g90Var.f(z18);
            return;
        }
        if (ordinal != 200 && ordinal != 216) {
            if (ordinal != 248) {
                return;
            }
            boolean z27 = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_CO_LIVE_CAMERA_OPEN", true) : true;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FINDER_LIVE_CO_LIVE_CAMERA_TOGGLE: open=");
            sb6.append(z27);
            sb6.append(", liveCoreNull=");
            sb6.append(B1() == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreAnchor", sb6.toString());
            if (z27) {
                D1(this, false, false, 3, null);
                com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p833x36756d.C10844x4ce18327 c10844x4ce183272 = c10849x610a91e1.renderRatioLayout;
                c10844x4ce183272.getClass();
                c10844x4ce183272.f150109o.d(false);
                return;
            }
            if (B1() == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LiveCoreAnchor", "FINDER_LIVE_CO_LIVE_CAMERA_TOGGLE: liveCore is null, cannot stopPreview");
            }
            in0.q B111 = B1();
            if (B111 != null) {
                B111.H0();
                return;
            }
            return;
        }
        in0.q B112 = B1();
        boolean z28 = (B112 == null || (pVar4 = B112.D) == null || !pVar4.e()) ? false : true;
        boolean f78 = ((mm2.e1) P0(mm2.e1.class)).f7();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreAnchor", "#recoveryLive isAudioMode:" + z28 + " isScreenCaseGameMode=" + f78 + " liveData.audioModeHolderBm:" + ((mm2.c1) P0(mm2.c1.class)).I4);
        if (f78) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreAnchor", "#recoveryLive is screen record game. stop preview camera");
            in0.q B113 = B1();
            if (B113 != null) {
                B113.H0();
                return;
            }
            return;
        }
        if (z28) {
            in0.q B114 = B1();
            if (B114 != null) {
                B114.f502307u = c10849x610a91e1;
                return;
            }
            return;
        }
        D1(this, false, false, 2, null);
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p833x36756d.C10844x4ce18327 c10844x4ce183273 = c10849x610a91e1.renderRatioLayout;
        c10844x4ce183273.getClass();
        c10844x4ce183273.f150109o.d(false);
        in0.q B115 = B1();
        if (B115 != null && (pVar3 = B115.D) != null && pVar3.f391122i) {
            z17 = true;
        }
        if (!z17 || (i17 = ((mm2.c1) P0(mm2.c1.class)).f410403q5) == 0) {
            return;
        }
        g90Var.l(i17);
        g90Var.j();
        y1(true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        super.O0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreAnchor", "unMount");
    }

    @Override // io0.a
    /* renamed from: getSelfUserId */
    public java.lang.String mo56927xa888f8a8() {
        java.lang.String m86 = ((mm2.c1) P0(mm2.c1.class)).m8();
        return m86 == null ? "" : m86;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return false;
    }

    public final void v1() {
        java.lang.String str;
        kn0.p pVar;
        java.util.LinkedList linkedList;
        android.content.Context context = this.f195249q;
        int h17 = com.p314xaae8f345.mm.ui.bl.h(context);
        android.view.ViewGroup viewGroup = this.f446856d;
        float a17 = com.p314xaae8f345.mm.ui.zk.a(viewGroup.getContext(), 16);
        xh2.c cVar = (xh2.c) ((mm2.o4) P0(mm2.o4.class)).A.mo3195x754a37bb();
        boolean z17 = false;
        int i17 = cVar != null ? cVar.f536066c : 0;
        xh2.c cVar2 = (xh2.c) ((mm2.o4) P0(mm2.o4.class)).A.mo3195x754a37bb();
        int i18 = cVar2 != null ? cVar2.f536067d : 0;
        xh2.c cVar3 = (xh2.c) ((mm2.o4) P0(mm2.o4.class)).A.mo3195x754a37bb();
        int i19 = cVar3 != null ? cVar3.f536069f : 0;
        if (this.f195255w == -1) {
            this.f195255w = com.p314xaae8f345.mm.ui.bl.c(context);
        }
        boolean z18 = (i18 == 0 && i19 == 0) || i18 == 1 || i18 == 5;
        xh2.c cVar4 = (xh2.c) ((mm2.o4) P0(mm2.o4.class)).A.mo3195x754a37bb();
        if (((cVar4 == null || (linkedList = cVar4.f536064a) == null) ? 1 : linkedList.size()) == 1 && z18 && i17 == 0 && ((mm2.c1) P0(mm2.c1.class)).f410458z2 != 1) {
            zl2.r4 r4Var = zl2.r4.f555483a;
            zl2.r4.g(r4Var, "MicroMsg.LiveCoreAnchor", this.f446856d, false, false, this.f195255w, 8, null);
            str = "getContext(...)";
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l.b1(this, this.f446856d, "MicroMsg.LiveCoreAnchor", false, 4, null);
            w1(true, h17, a17);
            android.content.Context context2 = viewGroup.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, str);
            pf5.z zVar = pf5.z.f435481a;
            if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8 b8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8.class);
            b8Var.getClass();
            if (!r4Var.Y1(b8Var.m80379x76847179())) {
                if (b8Var.f198488z == -1) {
                    b8Var.f198488z = com.p314xaae8f345.mm.ui.bl.c(b8Var.m158354x19263085());
                }
                pm0.v.V(100L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.h6(b8Var));
            }
        } else {
            str = "getContext(...)";
            zl2.r4 r4Var2 = zl2.r4.f555483a;
            zl2.r4.g(r4Var2, "MicroMsg.LiveCoreAnchor", this.f446856d, true, false, this.f195255w, 8, null);
            in0.q B1 = B1();
            if (B1 != null && (pVar = B1.D) != null && !pVar.f391122i) {
                z17 = true;
            }
            w1(z17, h17, a17);
            android.content.Context context3 = viewGroup.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, str);
            pf5.z zVar2 = pf5.z.f435481a;
            if (!(context3 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8 b8Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context3).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8.class);
            b8Var2.getClass();
            if (r4Var2.Y1(b8Var2.m80379x76847179())) {
                pm0.v.V(100L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.i6(b8Var2));
            }
        }
        zl2.r4 r4Var3 = zl2.r4.f555483a;
        android.content.Context context4 = viewGroup.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context4, str);
        if (r4Var3.Y1(context4)) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 c22645x24069159 = viewGroup instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159) viewGroup : null;
            if (c22645x24069159 != null) {
                c22645x24069159.c(a17, a17, a17, a17);
            }
        }
        viewGroup.requestLayout();
    }

    public final void w1(boolean z17, int i17, float f17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 c22645x24069159;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.g90 g90Var = this.f195253u;
        if (z17) {
            android.view.ViewGroup.LayoutParams layoutParams = g90Var.f194184a.getLayoutParams();
            android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.topMargin = 0;
                layoutParams2.bottomMargin = 0;
            }
            android.view.ViewGroup viewGroup = g90Var.f194184a;
            c22645x24069159 = viewGroup instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159) viewGroup : null;
            if (c22645x24069159 != null) {
                c22645x24069159.c(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            }
            return;
        }
        android.view.ViewGroup viewGroup2 = this.f446856d;
        float f18 = com.p314xaae8f345.mm.ui.bl.b(viewGroup2.getContext()).y - (com.p314xaae8f345.mm.ui.bl.b(viewGroup2.getContext()).x * 1.7777778f);
        android.view.ViewGroup.LayoutParams layoutParams3 = g90Var.f194184a.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams4 = layoutParams3 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams3 : null;
        if (layoutParams4 != null) {
            zl2.r4 r4Var = zl2.r4.f555483a;
            android.content.Context context = g90Var.f194184a.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            if (r4Var.Y1(context)) {
                layoutParams4.topMargin = 0;
                layoutParams4.bottomMargin = 0;
            } else {
                layoutParams4.topMargin = i17;
                layoutParams4.bottomMargin = ((int) f18) - i17;
            }
        }
        android.view.ViewGroup viewGroup3 = g90Var.f194184a;
        c22645x24069159 = viewGroup3 instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159) viewGroup3 : null;
        if (c22645x24069159 != null) {
            c22645x24069159.c(f17, f17, f17, f17);
        }
    }

    public final int x1(int i17) {
        in0.q e17 = dk2.ef.f314905a.e();
        boolean z17 = false;
        if (e17 != null && !e17.W()) {
            z17 = true;
        }
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l.f197120a.a(i17, z17, ((mm2.c1) P0(mm2.c1.class)).O7());
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
    
        if (r4.e() == true) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y1(boolean r4) {
        /*
            r3 = this;
            java.lang.Class<com.tencent.mm.plugin.finder.live.plugin.fa> r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fa.class
            if (r4 == 0) goto L12
            com.tencent.mm.plugin.finder.live.plugin.l r4 = r3.X0(r0)
            com.tencent.mm.plugin.finder.live.plugin.fa r4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fa) r4
            if (r4 == 0) goto L33
            r0 = 8
            r4.K0(r0)
            goto L33
        L12:
            in0.q r4 = r3.B1()
            r1 = 0
            if (r4 == 0) goto L25
            kn0.p r4 = r4.D
            if (r4 == 0) goto L25
            boolean r4 = r4.e()
            r2 = 1
            if (r4 != r2) goto L25
            goto L26
        L25:
            r2 = r1
        L26:
            if (r2 == 0) goto L33
            com.tencent.mm.plugin.finder.live.plugin.l r4 = r3.X0(r0)
            com.tencent.mm.plugin.finder.live.plugin.fa r4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fa) r4
            if (r4 == 0) goto L33
            r4.K0(r1)
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9.y1(boolean):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
        super.z0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(this, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.k9(this, null), 3, null);
    }

    public final android.view.TextureView z1() {
        android.view.TextureView m46523x76530f60;
        kn0.p pVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getCameraView ");
        in0.q B1 = B1();
        boolean z17 = false;
        if (B1 != null && (pVar = B1.D) != null && pVar.f391122i) {
            z17 = true;
        }
        if (z17) {
            sb6.append("from screenShare");
            m46523x76530f60 = this.f195253u.f194188e;
        } else {
            sb6.append("from cameraView");
            m46523x76530f60 = this.f195250r.m46523x76530f60();
        }
        sb6.append(java.lang.String.valueOf(m46523x76530f60.hashCode()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreAnchor", sb6.toString());
        return m46523x76530f60;
    }
}
