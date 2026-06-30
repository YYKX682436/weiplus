package vo4;

/* loaded from: classes10.dex */
public final class x extends vo4.b {

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.SurfaceTexture f520229p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.Surface f520230q;

    /* renamed from: r, reason: collision with root package name */
    public ph3.k f520231r;

    /* renamed from: s, reason: collision with root package name */
    public long f520232s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.Object f520233t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.Object f520234u;

    /* renamed from: v, reason: collision with root package name */
    public volatile boolean f520235v;

    /* renamed from: w, reason: collision with root package name */
    public volatile boolean f520236w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f520237x;

    /* renamed from: y, reason: collision with root package name */
    public final ph3.d f520238y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(int i17, int i18, int i19, com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p1 material, boolean z17) {
        super(i17, i18, i19, material, z17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(material, "material");
        this.f520233t = new java.lang.Object();
        this.f520234u = new java.lang.Object();
        this.f520238y = new vo4.w(this);
    }

    @Override // vo4.b
    public void a(boolean z17) {
        ph3.k kVar;
        if (this.f520139e != z17 && (kVar = this.f520231r) != null) {
            kVar.mo158544x764d819b(z17);
        }
        this.f520139e = z17;
    }

    @Override // vo4.b
    public void b(long j17, boolean z17) {
        this.f520235v = true;
        ph3.k kVar = this.f520231r;
        if ((kVar == null || kVar.n()) ? false : true) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogVideoPlayer", hashCode() + " playing start now");
            g();
        }
        if (z17) {
            try {
                android.graphics.SurfaceTexture surfaceTexture = this.f520229p;
                if (surfaceTexture != null) {
                    surfaceTexture.updateTexImage();
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VLogVideoPlayer", e17, hashCode() + " updateTexImage error", new java.lang.Object[0]);
            }
        }
    }

    @Override // vo4.b
    public void c() {
        boolean z17;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p0 p0Var = this.f520138d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(p0Var.f257243c) || !com.p314xaae8f345.mm.vfs.w6.j(p0Var.f257243c)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VLogVideoPlayer", hashCode() + " prepare file not exist or is null");
        }
        this.f520149o = true;
        vo4.a a17 = vo4.k.f520182a.a(p0Var.f257243c);
        if (a17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogVideoPlayer", "prepare get info from cache");
            this.f520146l = a17.f520130c;
            this.f520140f = a17.f520128a;
            this.f520141g = a17.f520129b;
            this.f520142h = a17.f520131d;
            this.f520143i = a17.f520132e;
            this.f520144j = a17.f520133f;
            this.f520145k = a17.f520134g;
            z17 = true;
        } else {
            z17 = false;
        }
        java.lang.String str4 = "null cannot be cast to non-null type com.tencent.mm.plugin.vlog.model.VideoMaterial";
        java.lang.String str5 = ", videoStartTime = ";
        java.lang.String str6 = ", endTime = ";
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogVideoPlayer", "prepare finish get from cache");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(hashCode());
            sb6.append(" prepare video, rotate = ");
            sb6.append(this.f520146l);
            sb6.append(", width = ");
            sb6.append(this.f520140f);
            sb6.append(", height = ");
            sb6.append(this.f520141g);
            sb6.append(", startTime = ");
            sb6.append(p0Var.f257241a);
            sb6.append(", endTime = ");
            sb6.append(p0Var.f257242b);
            sb6.append(", videoStartTime = ");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(p0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.vlog.model.VideoMaterial");
            sb6.append(((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p1) p0Var).f257244d);
            sb6.append(", videoEndTime = ");
            sb6.append(((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p1) p0Var).f257245e);
            sb6.append(", cost:");
            sb6.append(android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
            sb6.append("ms");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogVideoPlayer", sb6.toString());
            return;
        }
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.VLogVideoPlayer", hashCode() + " start prepare " + p0Var.f257243c, new java.lang.Object[0]);
            this.f520146l = -1;
            long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
            android.media.MediaExtractor mediaExtractor = new android.media.MediaExtractor();
            mediaExtractor.setDataSource(p0Var.f257243c);
            int trackCount = mediaExtractor.getTrackCount();
            int i17 = 0;
            while (true) {
                if (i17 >= trackCount) {
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                    break;
                }
                int i18 = trackCount;
                android.media.MediaFormat trackFormat = mediaExtractor.getTrackFormat(i17);
                str = str4;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(trackFormat, "getTrackFormat(...)");
                java.lang.String string = trackFormat.getString("mime");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                str2 = str5;
                str3 = str6;
                if (r26.i0.y(string, "video", false)) {
                    this.f520140f = trackFormat.getInteger("width");
                    this.f520141g = trackFormat.getInteger("height");
                    if (fp.h.c(23) && trackFormat.containsKey("rotation-degrees")) {
                        this.f520146l = trackFormat.getInteger("rotation-degrees");
                    }
                } else {
                    i17++;
                    trackCount = i18;
                    str4 = str;
                    str5 = str2;
                    str6 = str3;
                }
            }
            mediaExtractor.release();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogVideoPlayer", hashCode() + " prepare video get width/height cost:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime2) + "ms, try-get rotate:" + this.f520146l);
            if (this.f520146l < 0) {
                long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime();
                this.f520146l = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69179x9787f6ed(p0Var.f257243c);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogVideoPlayer", hashCode() + " prepare video get rotate cost:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime3) + "ms");
            }
            int i19 = this.f520146l;
            if (i19 == 90) {
                this.f520146l = 1;
            } else if (i19 == 180) {
                this.f520146l = 2;
            } else if (i19 == 270) {
                this.f520146l = 3;
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(hashCode());
            sb7.append(" prepare video, rotate = ");
            sb7.append(this.f520146l);
            sb7.append(", width = ");
            sb7.append(this.f520140f);
            sb7.append(", height = ");
            sb7.append(this.f520141g);
            sb7.append(", startTime = ");
            sb7.append(p0Var.f257241a);
            sb7.append(str3);
            sb7.append(p0Var.f257242b);
            sb7.append(str2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(p0Var, str);
            sb7.append(((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p1) p0Var).f257244d);
            sb7.append(", videoEndTime = ");
            sb7.append(((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p1) p0Var).f257245e);
            sb7.append(", cost:");
            sb7.append(android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
            sb7.append("ms");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogVideoPlayer", sb7.toString());
            vo4.k.b(vo4.k.f520182a, p0Var.f257243c, this.f520140f, this.f520141g, this.f520146l, 0, 0, 0, 0, 240, null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VLogVideoPlayer", e17, hashCode() + " prepare error", new java.lang.Object[0]);
        }
    }

    @Override // vo4.b
    public void d(long j17) {
        int i17;
        boolean z17;
        if (this.f520148n) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogVideoPlayer", "play already ready");
            return;
        }
        boolean z18 = true;
        this.f520148n = true;
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogVideoPlayer", "%d play set video path [%s], texture:" + this.f520135a + ", seekTime:" + j17 + ", rotate:" + this.f520146l, java.lang.Integer.valueOf(hashCode()), this.f520138d.f257243c);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f520138d.f257243c) || !com.p314xaae8f345.mm.vfs.w6.j(this.f520138d.f257243c)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VLogVideoPlayer", "%d open video but path is null or mSurface is null", java.lang.Integer.valueOf(hashCode()));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogVideoPlayer", "%d open video [%s]", java.lang.Integer.valueOf(hashCode()), this.f520138d.f257243c);
        if (!this.f520237x) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogVideoPlayer", hashCode() + ' ' + this.f520138d.f257243c + " before check crop rect, width: " + this.f520140f + ", height: " + this.f520141g);
            int i18 = this.f520140f;
            if (i18 == 0 || (i17 = this.f520141g) == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogVideoPlayer", hashCode() + ' ' + this.f520138d.f257243c + " width and height is zero! Don't check!");
                this.f520237x = false;
            } else {
                if (i18 % 16 != 0 || i17 % 16 != 0) {
                    vo4.a a17 = vo4.k.f520182a.a(this.f520138d.f257243c);
                    if (a17 == null || a17.f520131d < 0 || a17.f520132e < 0 || this.f520144j < 0 || a17.f520134g < 0) {
                        z17 = false;
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogVideoPlayer", "checkCropRect get from cache");
                        this.f520146l = a17.f520130c;
                        this.f520140f = a17.f520128a;
                        this.f520141g = a17.f520129b;
                        this.f520142h = a17.f520131d;
                        this.f520143i = a17.f520132e;
                        this.f520144j = a17.f520133f;
                        this.f520145k = a17.f520134g;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogVideoPlayer", hashCode() + ' ' + this.f520138d.f257243c + " finish check crop rect:[" + this.f520142h + ", " + this.f520143i + ", " + this.f520144j + ", " + this.f520145k + "], width:" + this.f520140f + ", height:" + this.f520141g);
                        z17 = true;
                    }
                    if (!z17) {
                        ((ku5.t0) ku5.t0.f394148d).h(new vo4.v(this), "VLogVideoPlayer_checkCropRect");
                    }
                }
                this.f520237x = true;
            }
        }
        try {
            this.f520229p = new android.graphics.SurfaceTexture(this.f520135a);
            this.f520230q = new android.view.Surface(this.f520229p);
            this.f520236w = false;
            ph3.k kVar = new ph3.k(android.os.Looper.getMainLooper(), false, 0);
            this.f520231r = kVar;
            kVar.h(this.f520138d.f257243c);
            ph3.k kVar2 = this.f520231r;
            if (kVar2 != null) {
                kVar2.f435962g = this.f520238y;
            }
            if (kVar2 != null) {
                kVar2.mo158545x42c875eb(this.f520230q);
            }
            ph3.k kVar3 = this.f520231r;
            if (kVar3 != null) {
                kVar3.mo158544x764d819b(this.f520139e);
            }
            ph3.k kVar4 = this.f520231r;
            if (kVar4 != null) {
                kVar4.q(false);
            }
            ph3.k kVar5 = this.f520231r;
            if (kVar5 != null) {
                kVar5.p(false);
            }
            ph3.k kVar6 = this.f520231r;
            if (kVar6 != null) {
                kVar6.mo158542xed060d07();
            }
            this.f520232s = j17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogVideoPlayer", hashCode() + " prepare player, wait");
            synchronized (this.f520233t) {
                try {
                    this.f520233t.wait();
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VLogVideoPlayer", e17, hashCode() + " wait prepare lock error", new java.lang.Object[0]);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p0 p0Var = this.f520138d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(p0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.vlog.model.VideoMaterial");
            int i19 = (int) (j17 + ((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p1) p0Var).f257244d);
            if (i19 > 0) {
                ph3.k kVar7 = this.f520231r;
                if (kVar7 != null) {
                    kVar7.a(i19);
                }
                synchronized (this.f520234u) {
                    try {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogVideoPlayer", hashCode() + " player seek wait:" + i19);
                        this.f520234u.wait(100L);
                    } catch (java.lang.Exception e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VLogVideoPlayer", e18, hashCode() + " wait seekLock error", new java.lang.Object[0]);
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogVideoPlayer", hashCode() + " player seek wait finish");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogVideoPlayer", hashCode() + " real seek time:" + i19 + ", not need to seek");
                this.f520235v = true;
                ph3.k kVar8 = this.f520231r;
                if (kVar8 == null || kVar8.n()) {
                    z18 = false;
                }
                if (z18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogVideoPlayer", hashCode() + " play directly start");
                    g();
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogVideoPlayer", hashCode() + " play finish cost " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VLogVideoPlayer", e19, hashCode() + " prepare async error %s", e19.getMessage());
        }
    }

    @Override // vo4.b
    public void e() {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode());
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogVideoPlayer", "%d player release [%s]", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        this.f520148n = false;
        ph3.k kVar = this.f520231r;
        if (kVar != null) {
            kVar.f435962g = null;
        }
        if (kVar != null) {
            kVar.mo158547x360802();
        }
        ph3.k kVar2 = this.f520231r;
        if (kVar2 != null) {
            kVar2.mo158543x41012807();
        }
        this.f520231r = null;
        this.f520236w = false;
        android.view.Surface surface = this.f520230q;
        if (surface != null) {
            surface.release();
        }
        android.graphics.SurfaceTexture surfaceTexture = this.f520229p;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.f520229p = null;
        this.f520230q = null;
        this.f520149o = false;
    }

    @Override // vo4.b
    public void f() {
        this.f520148n = false;
        ph3.k kVar = this.f520231r;
        if (kVar != null) {
            kVar.f435962g = null;
        }
        if (kVar != null) {
            kVar.mo158547x360802();
        }
        ph3.k kVar2 = this.f520231r;
        if (kVar2 != null) {
            kVar2.mo158543x41012807();
        }
        this.f520231r = null;
        this.f520236w = false;
        android.view.Surface surface = this.f520230q;
        if (surface != null) {
            surface.release();
        }
        android.graphics.SurfaceTexture surfaceTexture = this.f520229p;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.f520229p = null;
        this.f520230q = null;
    }

    public final boolean g() {
        if (this.f520231r == null || !this.f520236w) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Integer.valueOf(hashCode());
            objArr[1] = java.lang.Boolean.valueOf(this.f520231r == null);
            objArr[2] = java.lang.Boolean.valueOf(this.f520236w);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VLogVideoPlayer", "%d player is null[%b] or it prepared [%b]", objArr);
            return false;
        }
        java.lang.String str = "%d player start surface[%b], seekTime:" + this.f520232s;
        java.lang.Object[] objArr2 = new java.lang.Object[2];
        objArr2[0] = java.lang.Integer.valueOf(hashCode());
        objArr2[1] = java.lang.Boolean.valueOf(this.f520230q != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogVideoPlayer", str, objArr2);
        ph3.k kVar = this.f520231r;
        if (kVar != null) {
            kVar.mo158546x68ac462();
        }
        return true;
    }
}
