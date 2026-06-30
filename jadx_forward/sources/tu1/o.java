package tu1;

/* loaded from: classes13.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public pu1.b f503643a;

    /* renamed from: b, reason: collision with root package name */
    public android.media.projection.MediaProjection f503644b;

    /* renamed from: c, reason: collision with root package name */
    public android.hardware.display.VirtualDisplay f503645c;

    /* renamed from: d, reason: collision with root package name */
    public int f503646d;

    /* renamed from: e, reason: collision with root package name */
    public android.content.Intent f503647e;

    /* renamed from: f, reason: collision with root package name */
    public ru1.t f503648f;

    /* renamed from: g, reason: collision with root package name */
    public ru1.u f503649g;

    /* renamed from: h, reason: collision with root package name */
    public vu1.h f503650h;

    /* renamed from: i, reason: collision with root package name */
    public android.os.HandlerThread f503651i;

    /* renamed from: j, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f503652j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f503653k;

    /* renamed from: l, reason: collision with root package name */
    public long f503654l = -1;

    /* renamed from: m, reason: collision with root package name */
    public long f503655m = -1;

    /* renamed from: n, reason: collision with root package name */
    public long f503656n = -1;

    /* renamed from: o, reason: collision with root package name */
    public long f503657o = -1;

    /* renamed from: p, reason: collision with root package name */
    public bv1.b f503658p;

    /* renamed from: q, reason: collision with root package name */
    public wu1.c f503659q;

    /* renamed from: r, reason: collision with root package name */
    public xu1.c f503660r;

    /* renamed from: s, reason: collision with root package name */
    public yz5.l f503661s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f503662t;

    public static final void c(tu1.o oVar, int i17, java.lang.String address, int i18, wu1.a callback) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenCastManager", "realExecuteTcpConnect " + i17 + " connecting " + address + ':' + i18);
        wu1.c cVar = oVar.f503659q;
        if (cVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(address, "address");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ScreenRecord.Main", "try connect to server " + address + ':' + i18);
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, null, null, new wu1.b(address, i18, cVar, callback, null), 3, null);
        }
    }

    public final void a(android.content.Context context, pu1.b bVar) {
        this.f503650h = new vu1.h(bVar.f337845b, bVar.f337846c, bVar.f337848e);
        android.content.Intent intent = this.f503647e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(intent);
        int i17 = this.f503646d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenCastManager", "createMediaProjection");
        java.lang.Object systemService = context.getSystemService("media_projection");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.media.projection.MediaProjectionManager");
        android.media.projection.MediaProjection mediaProjection = ((android.media.projection.MediaProjectionManager) systemService).getMediaProjection(i17, intent);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mediaProjection);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenCastManager", "createVirtualDisplay");
        mediaProjection.registerCallback(new tu1.g(this), null);
        android.hardware.display.VirtualDisplay createVirtualDisplay = mediaProjection.createVirtualDisplay("MicroMsg.ScreenCastManager", bVar.f337845b, bVar.f337846c, (int) i65.a.g(context), 16, null, null, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(createVirtualDisplay);
        this.f503645c = createVirtualDisplay;
        this.f503644b = mediaProjection;
        vu1.h hVar = this.f503650h;
        if (hVar != null) {
            hVar.b(new tu1.f(this, bVar, context));
        }
    }

    public final void b() {
        java.util.List list;
        java.lang.Integer num;
        java.util.List list2;
        pu1.b bVar = this.f503643a;
        int i17 = 0;
        if (!((bVar == null || (list2 = bVar.f439953q) == null || !(list2.isEmpty() ^ true)) ? false : true)) {
            this.f503660r = xu1.c.f538728i;
            ((ku5.t0) ku5.t0.f394148d).B(new tu1.i(this));
            return;
        }
        this.f503662t = true;
        pu1.b bVar2 = this.f503643a;
        if (bVar2 == null || (list = bVar2.f439953q) == null) {
            return;
        }
        if (bVar2 != null && (num = bVar2.f439951o) != null) {
            i17 = num.intValue();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        int i18 = f0Var.f391649d;
        c(this, i18, (java.lang.String) list.get(i18), i17, new tu1.l(f0Var, this, list, i17));
    }

    public final void d() {
        int i17;
        int i18;
        boolean fj6;
        boolean fj7;
        this.f503662t = false;
        ((ku5.t0) ku5.t0.f394148d).B(tu1.n.f503642d);
        java.lang.Long valueOf = java.lang.Long.valueOf(this.f503654l);
        if (!(valueOf.longValue() != -1)) {
            valueOf = null;
        }
        if (valueOf != null) {
            int longValue = (int) valueOf.longValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CastReportHelper", "markVideoRenderFirstFrameCost " + longValue);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.m(1634, 25, 26, longValue, true);
        }
        java.lang.Long valueOf2 = java.lang.Long.valueOf(this.f503655m);
        if (!(valueOf2.longValue() != -1)) {
            valueOf2 = null;
        }
        if (valueOf2 != null) {
            valueOf2.longValue();
            int i19 = (int) this.f503655m;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CastReportHelper", "markVideoEncodeFrameCostAvg " + i19);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.m(1634, 22, 23, i19, true);
        }
        bv1.b bVar = this.f503658p;
        if (bVar != null) {
            bVar.f106246c = false;
            if (bVar.f106244a > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BatteryUtils", "sum avgBattery=￥avgAverageBattery} microAmpere and avg avgBattery= " + bVar.f106244a + ' ');
                long j17 = bVar.f106244a;
                long j18 = j17 / ((long) 1000);
                int i27 = (int) j17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CastReportHelper", "markBatteryCost " + i27);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.m(1634, 28, 29, i27, true);
            }
            i17 = (int) bVar.f106244a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = bVar.f106245b;
            if (n3Var != null) {
                n3Var.mo50302x6b17ad39(null);
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var2 = bVar.f106245b;
            if (n3Var2 != null) {
                n3Var2.m77787xbe88f509();
            }
        } else {
            i17 = 0;
        }
        java.lang.Long valueOf3 = java.lang.Long.valueOf(this.f503657o);
        if (!(valueOf3.longValue() != -1)) {
            valueOf3 = null;
        }
        if (valueOf3 != null) {
            long longValue2 = valueOf3.longValue();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            i18 = (int) (android.os.SystemClock.elapsedRealtime() - longValue2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CastReportHelper", "markRecordingCost " + i18);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.m(1634, 31, 32, i18, true);
        } else {
            i18 = 0;
        }
        pu1.b bVar2 = this.f503643a;
        if (bVar2 != null) {
            int i28 = bVar2.f337847d;
            int i29 = bVar2.f337846c;
            int i37 = bVar2.f337845b;
            int i38 = bVar2.f337848e;
            wo.o oVar = wo.v1.f529366m;
            int i39 = oVar.f529299x;
            int i47 = 2;
            if (i39 != -1) {
                fj6 = i39 != 1 ? i39 != 2 ? ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_finder_screec_cast_pc_use_opengl_render, true) : false : true;
            } else {
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_finder_screec_cast_pc_use_opengl_render, true);
            }
            int i48 = fj6 ? 1 : 2;
            int i49 = oVar.f529298w;
            if (i49 != -1) {
                fj7 = i49 != 1 ? i49 != 2 ? ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_finder_screec_cast_pc_use_async_codec, true) : false : true;
            } else {
                java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                fj7 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_finder_screec_cast_pc_use_async_codec, true);
            }
            int i57 = fj7 ? 1 : 2;
            int i58 = (int) this.f503654l;
            int i59 = i17;
            int i66 = (int) this.f503655m;
            int i67 = (int) this.f503656n;
            xu1.c cVar = this.f503660r;
            int i68 = cVar == null ? -1 : tu1.a.f503621a[cVar.ordinal()];
            if (i68 == 1) {
                i47 = 1;
            } else if (i68 != 2) {
                i47 = 3;
                if (i68 != 3) {
                    i47 = 4;
                    if (i68 != 4) {
                        i47 = 5;
                        if (i68 != 5) {
                            i47 = 0;
                        }
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CastReportHelper", "doScreenCastPcKvReport is bitrate: " + i28 + ",videoHeight : " + i29 + ",videoWidth : " + i37 + ",videoFrameRate: " + i38 + ",times: " + i18 + ",batteryCost : " + i59 + ",encodeStrategy : " + i48 + ",renderStrategy : " + i57 + ",firstFrameRenderCost: " + i58 + ",firstFrameEncodeCost: " + i66 + ",avgFrameRenderCost: " + i67 + ' ');
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.r(22393, true, true, java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(i38), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i59), java.lang.Integer.valueOf(i48), java.lang.Integer.valueOf(i57), java.lang.Integer.valueOf(i58), java.lang.Integer.valueOf(i66), java.lang.Integer.valueOf(i67), java.lang.Integer.valueOf(i47));
        }
        wu1.c cVar2 = this.f503659q;
        if (cVar2 != null) {
            cVar2.a();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var3 = this.f503652j;
        if (n3Var3 != null) {
            n3Var3.mo50302x6b17ad39(null);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var4 = this.f503652j;
        if (n3Var4 != null) {
            n3Var4.m77787xbe88f509();
        }
        this.f503652j = null;
        android.os.HandlerThread handlerThread = this.f503651i;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        ru1.u uVar = this.f503649g;
        if (uVar != null) {
            uVar.mo163034xad07d6f3();
        }
        ru1.t tVar = this.f503648f;
        if (tVar != null) {
            tVar.c();
        }
        vu1.h hVar = this.f503650h;
        if (hVar != null) {
            int i69 = (int) hVar.f521736o;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CastReportHelper", "markVideoRenderFrameCostAvg " + i69);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.m(1634, 16, 17, i69, true);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var5 = hVar.f521727f;
            n3Var5.mo50302x6b17ad39(null);
            n3Var5.m77787xbe88f509();
            android.os.HandlerThread handlerThread2 = hVar.f521728g;
            if (handlerThread2 != null) {
                handlerThread2.quitSafely();
            }
            os0.c cVar3 = hVar.f521730i;
            if (cVar3 != null) {
                cVar3.n();
            }
            vu1.b bVar3 = hVar.f521729h;
            if (bVar3 != null) {
                android.view.Surface surface = bVar3.f521714e;
                if (surface != null) {
                    surface.release();
                }
                android.view.Surface surface2 = bVar3.f521713d;
                if (surface2 != null) {
                    surface2.release();
                }
                bVar3.f521713d = null;
                android.media.ImageReader imageReader = bVar3.f521712c;
                if (imageReader != null) {
                    imageReader.close();
                }
                bVar3.f521712c = null;
            }
            rs0.h hVar2 = hVar.f521733l;
            if (hVar2 != null) {
                rs0.i.f480829a.u(hVar2);
            }
            android.view.Surface surface3 = hVar.f521732k;
            if (surface3 != null) {
                surface3.release();
            }
            android.graphics.SurfaceTexture surfaceTexture = hVar.f521731j;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = hVar.f521738q;
            b4Var.mo50302x6b17ad39(null);
            b4Var.d();
            b4Var.m77787xbe88f509();
            android.view.Surface surface4 = hVar.f521725d;
            if (surface4 != null) {
                surface4.release();
            }
        }
        android.media.projection.MediaProjection mediaProjection = this.f503644b;
        if (mediaProjection != null) {
            mediaProjection.stop();
        }
        android.hardware.display.VirtualDisplay virtualDisplay = this.f503645c;
        if (virtualDisplay != null) {
            virtualDisplay.release();
        }
        this.f503653k = false;
        this.f503660r = null;
    }
}
