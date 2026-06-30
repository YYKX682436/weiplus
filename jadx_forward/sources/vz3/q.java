package vz3;

/* loaded from: classes15.dex */
public final class q implements tz3.a {

    /* renamed from: a, reason: collision with root package name */
    public long f523229a;

    /* renamed from: b, reason: collision with root package name */
    public int f523230b;

    /* renamed from: c, reason: collision with root package name */
    public vz3.a f523231c;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.h f523233e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f523234f;

    /* renamed from: g, reason: collision with root package name */
    public tz3.c f523235g;

    /* renamed from: h, reason: collision with root package name */
    public long f523236h;

    /* renamed from: i, reason: collision with root package name */
    public sz3.a1 f523237i;

    /* renamed from: j, reason: collision with root package name */
    public sz3.x0 f523238j;

    /* renamed from: k, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.m0 f523239k;

    /* renamed from: d, reason: collision with root package name */
    public vz3.b f523232d = vz3.b.f523202d;

    /* renamed from: l, reason: collision with root package name */
    public final vz3.p f523240l = new vz3.p(this);

    public static final void n(vz3.q qVar) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var;
        qVar.getClass();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.h hVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.h();
        wz3.e.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1259, com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10095xfbb5a33d);
        sz3.y a17 = sz3.y.f495688e.a();
        hVar.f298571d = a17.f495689a;
        boolean[] zArr = hVar.f298580p;
        zArr[1] = true;
        hVar.f298572e = a17.f495690b;
        zArr[2] = true;
        hVar.f298573f = !bz3.h.f118313g;
        zArr[3] = true;
        e04.j2 j2Var = e04.j2.f327520a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1 d1Var = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.f240376a;
        int i17 = bz3.h.f118314h;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.f240384i;
        if (o4Var2 != null) {
            i17 = o4Var2.getInt("scan_config_server_detect_frame_count", i17);
        }
        if (e04.j2.f327522c && (o4Var = e04.j2.f327521b) != null) {
            i17 = o4Var.getInt("scan_product_server_detect_frame_count", i17);
        }
        hVar.f298574g = i17;
        zArr[4] = true;
        hVar.f298575h = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.f(true);
        zArr[5] = true;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doInitFFE modelPath: ");
        sb6.append(zArr[1] ? hVar.f298571d : "");
        sb6.append(", scanClsModelPath: ");
        sb6.append(zArr[2] ? hVar.f298572e : "");
        sb6.append(", enableServerDetect: ");
        sb6.append(hVar.f298573f);
        sb6.append(", serverDetectFrameCount: ");
        sb6.append(hVar.f298574g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffScanGoodsQueue", sb6.toString());
        qVar.f523233e = hVar;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.t0.f298666b.b(qVar.f523233e, new vz3.f(java.lang.System.currentTimeMillis(), qVar));
    }

    @Override // tz3.a
    public void a() {
    }

    @Override // tz3.a
    public void b(int i17) {
    }

    @Override // tz3.a
    public void c(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffScanGoodsQueue", "addProduct trackId: " + i17);
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.t0.f298666b.a(i17, vz3.c.f523207a);
    }

    @Override // tz3.a
    public void d(int i17, int i18, int i19, int i27) {
        this.f523231c = new vz3.a(i17, i18, i19, i27);
    }

    @Override // tz3.a
    public void e(int i17, sz3.a1 requestInfo, sz3.x0 serverRecognizeResult, android.graphics.RectF rectF, byte[] bArr, int i18, int i19, tz3.c cVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestInfo, "requestInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(serverRecognizeResult, "serverRecognizeResult");
        if (bArr == null) {
            if (cVar != null) {
                cVar.b(null);
                return;
            }
            return;
        }
        sz3.d0 d0Var = sz3.d0.f495524a;
        if (sz3.d0.f495532i) {
            if (sz3.d0.f495533j) {
                d0Var.c(new sz3.a0(bArr, rectF, i17, i18, i19, serverRecognizeResult, cVar, requestInfo));
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanGoodsNoModelDetectManager", "decodeFullImage is not working");
                return;
            }
        }
        if (this.f523236h != 0) {
            this.f523237i = requestInfo;
            this.f523238j = serverRecognizeResult;
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(bArr.length);
            allocateDirect.put(bArr);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.t0 t0Var = com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.t0.f298666b;
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.p pVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.p();
            pVar.f298647d = rectF != null ? rectF.left : 0.0f;
            boolean[] zArr = pVar.f298651h;
            zArr[1] = true;
            pVar.f298648e = rectF != null ? rectF.top : 0.0f;
            zArr[2] = true;
            pVar.f298649f = rectF != null ? rectF.width() : 0.0f;
            pVar.f298651h[3] = true;
            pVar.f298650g = rectF != null ? rectF.height() : 0.0f;
            pVar.f298651h[4] = true;
            t0Var.c(allocateDirect, i18, i19, pVar, new vz3.d(cVar));
        }
    }

    @Override // tz3.a
    public void f(com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.n data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (this.f523236h != 0) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.t0.f298666b.g(data);
        }
    }

    @Override // tz3.a
    public void g(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffScanGoodsQueue", "startGoodsSession sessionId: " + j17 + ", initStatus: " + this.f523232d);
        this.f523229a = 0L;
        this.f523230b = 0;
        this.f523236h = j17;
        vz3.b bVar = this.f523232d;
        if (bVar == vz3.b.f523202d) {
            mo126481x316510();
            this.f523234f = true;
            return;
        }
        if (bVar == vz3.b.f523203e) {
            this.f523234f = true;
            return;
        }
        this.f523234f = false;
        this.f523239k = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.m0(this.f523240l);
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.t0 t0Var = com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.t0.f298666b;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.q qVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.q();
        qVar.f298652d = j17;
        qVar.f298654f[1] = true;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.i iVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.i();
        iVar.f298583d = bz3.h.f118312f;
        boolean[] zArr = iVar.f298586g;
        zArr[1] = true;
        iVar.f298584e = false;
        zArr[2] = true;
        iVar.f298585f = false;
        zArr[3] = true;
        qVar.f298653e = iVar;
        qVar.f298654f[2] = true;
        t0Var.f(qVar, this.f523239k);
        sz3.k0 k0Var = sz3.k0.f495572a;
        ((ku5.t0) ku5.t0.f394148d).h(sz3.i0.f495561d, "MicroMsg.ScanGoodsSensorDetectManager");
    }

    @Override // tz3.a
    public void h(tz3.c callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f523235g = callback;
    }

    @Override // tz3.a
    public void i(byte[] yuvData, tz3.b callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(yuvData, "yuvData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        vz3.a aVar = this.f523231c;
        if (aVar == null) {
            ((sz3.p0) callback).a(false, null, 0, 0);
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(yuvData.length);
        allocateDirect.put(yuvData);
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.t0 t0Var = com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.t0.f298666b;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.m mVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.m();
        mVar.f298633d = aVar.f523198a;
        boolean[] zArr = mVar.f298636g;
        zArr[1] = true;
        mVar.f298634e = aVar.f523199b;
        zArr[2] = true;
        mVar.f298635f = et5.h.g(aVar.f523200c);
        zArr[3] = true;
        t0Var.e(allocateDirect, mVar, aVar.f523201d, new vz3.l(currentTimeMillis, callback));
    }

    @Override // tz3.a
    /* renamed from: init */
    public void mo126481x316510() {
        vz3.b bVar = this.f523232d;
        vz3.b bVar2 = vz3.b.f523203e;
        if (bVar == bVar2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AffScanGoodsQueue", "initing and ignore");
            return;
        }
        this.f523232d = bVar2;
        vz3.k kVar = new vz3.k(this);
        java.lang.Boolean bool = et5.a.f338204b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffScanGoodsQueue", "init soLoaded: " + bool + ", initStatus: " + this.f523232d);
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, bool2)) {
            kVar.mo146xb9724478(bool2);
            return;
        }
        if (bool == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.FALSE)) {
            ((ku5.t0) ku5.t0.f394148d).h(new vz3.m(new vz3.i(kVar, this)), "MicroMsg.AffScanGoodsQueue");
        }
    }

    @Override // tz3.a
    public void j() {
    }

    @Override // tz3.a
    public void k(com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.y yVar, tz3.d dVar) {
        if (yVar == null || dVar == null) {
            return;
        }
        sz3.d0 d0Var = sz3.d0.f495524a;
        if (sz3.d0.f495532i) {
            if (!sz3.d0.f495533j) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanGoodsNoModelDetectManager", "addDecodeTask is not working");
                return;
            }
            if (sz3.d0.f495531h == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanGoodsNoModelDetectManager", "addDecodeTask sessionId invalid");
                return;
            }
            byte[] bArr = dVar.f504863a;
            if (!(bArr != null && bArr.length > 0)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanGoodsNoModelDetectManager", "addDecodeTask previewData is empty");
                return;
            }
            int i17 = sz3.d0.f495535l;
            if (i17 < sz3.d0.f495525b) {
                sz3.d0.f495535l = i17 + 1;
                return;
            }
            sz3.d0.f495535l = 0;
            sz3.d0.f495527d++;
            if (!sz3.k0.f495572a.a()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanGoodsNoModelDetectManager", "addDecodeTask is not stable");
                return;
            }
            byte[] previewData = dVar.f504863a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(previewData, "previewData");
            dz3.f fVar = new dz3.f();
            fVar.f326644b = previewData;
            fVar.f326643a = java.lang.System.currentTimeMillis();
            sz3.d0.f495537n = fVar;
            d0Var.a(yVar, dVar, true);
        }
    }

    @Override // tz3.a
    public void l(long j17) {
        if (this.f523236h == j17) {
            sz3.k0 k0Var = sz3.k0.f495572a;
            ((ku5.t0) ku5.t0.f394148d).h(sz3.j0.f495569d, "MicroMsg.ScanGoodsSensorDetectManager");
            sz3.d0 d0Var = sz3.d0.f495524a;
            long j18 = this.f523236h;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanGoodsNoModelDetectManager", "stopGoodsSession sessionId: " + j18);
            if (sz3.d0.f495531h == j18) {
                sz3.d0.f495535l = 0;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.o(false);
            this.f523236h = 0L;
            if (this.f523230b > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffScanGoodsQueue", "stopGoodsSession totalCost: " + this.f523229a + ", avg: " + (this.f523229a / this.f523230b));
            }
            this.f523239k = null;
        }
    }

    @Override // tz3.a
    public void m() {
    }

    @Override // tz3.a
    /* renamed from: release */
    public void mo126482x41012807() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffScanGoodsQueue", "releaseFFE initStatus: " + this.f523232d);
        this.f523232d = vz3.b.f523202d;
        this.f523237i = null;
        this.f523238j = null;
        this.f523235g = null;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.t0.f298666b.d();
        sz3.d0 d0Var = sz3.d0.f495524a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanGoodsNoModelDetectManager", "release");
        d0Var.c(sz3.c0.f495506d);
        sz3.d0.f495533j = false;
        sz3.d0.f495535l = 0;
        sz3.d0.f495536m = null;
        if (sz3.d0.f495527d == 0 || sz3.d0.f495528e == 0) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.c cVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.c(0);
        cVar.f240365i = ((int) ((sz3.d0.f495529f * 100.0f) / sz3.d0.f495528e)) + "_" + ((int) ((sz3.d0.f495528e * 100.0f) / sz3.d0.f495527d)) + "_" + sz3.d0.f495527d + "_" + sz3.d0.f495528e + "_" + sz3.d0.f495529f;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d.a(140, cVar);
        sz3.d0.f495527d = 0;
        sz3.d0.f495528e = 0;
        sz3.d0.f495529f = 0;
    }
}
