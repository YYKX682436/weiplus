package ht0;

/* loaded from: classes10.dex */
public class n0 extends wu5.b {

    /* renamed from: e, reason: collision with root package name */
    public int f366243e;

    /* renamed from: g, reason: collision with root package name */
    public float f366245g;

    /* renamed from: h, reason: collision with root package name */
    public int f366246h;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Object f366251p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.Runnable f366252q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ht0.o0 f366253r;

    /* renamed from: f, reason: collision with root package name */
    public volatile int f366244f = 0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f366247i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f366248m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f366249n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f366250o = false;

    public n0(ht0.o0 o0Var) {
        this.f366253r = o0Var;
        java.lang.Object obj = new java.lang.Object();
        this.f366251p = obj;
        this.f366252q = null;
        synchronized (obj) {
            try {
                java.lang.String r17 = com.p314xaae8f345.mm.vfs.w6.r(o0Var.f366262g);
                o0Var.f366273r = (r17.endsWith("/") ? r17 : r17.concat("/")) + "tempRotate.mp4";
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.X264YUVMP4MuxRecorder", "retrieve file name error: %s", e17.getMessage());
            }
        }
    }

    @Override // wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "SightCustomAsyncMediaRecorder_encode";
    }

    @Override // java.lang.Runnable
    public void run() {
        ht0.o0 o0Var = this.f366253r;
        if (o0Var.f366277v == -1) {
            o0Var.f366277v = android.os.Process.myTid();
            android.os.Process.setThreadPriority(android.os.Process.myTid(), -2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "encodeTid: %s", java.lang.Integer.valueOf(this.f366253r.f366277v));
        }
        synchronized (this.f366251p) {
            while (!this.f366248m) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                int m69253x89b555ee = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69253x89b555ee(this.f366243e, java.lang.Math.max(0, this.f366244f), false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "ing: trgger encode use %dms, Encode index[%d, %d), threadId: %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), java.lang.Integer.valueOf(this.f366244f), java.lang.Integer.valueOf(m69253x89b555ee), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
                if (java.lang.Math.abs(m69253x89b555ee - this.f366244f) <= 5) {
                    try {
                        java.lang.Thread.sleep(100L);
                    } catch (java.lang.Exception unused) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.X264YUVMP4MuxRecorder", "thread sleep error");
                    }
                }
                this.f366244f = m69253x89b555ee;
            }
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
            if (!this.f366249n) {
                this.f366244f = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69253x89b555ee(this.f366243e, this.f366244f, true);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "end: trgger encode use %dms, curEncode index %d, markCancel %B, threadId: %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime2), java.lang.Integer.valueOf(this.f366244f), java.lang.Boolean.valueOf(this.f366249n), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            if (!this.f366249n) {
                int max = java.lang.Math.max(1000, this.f366246h);
                ht0.o0 o0Var2 = this.f366253r;
                int i17 = o0Var2.f366265j;
                int i18 = i17 > 0 ? i17 : max;
                float f17 = this.f366245g;
                float f18 = o0Var2.f366266k;
                float f19 = f18 > 0.0f ? f18 : f17;
                com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h hVar = o0Var2.D;
                java.lang.String str = o0Var2.f366262g;
                int i19 = o0Var2.f366269n;
                com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d = o0Var2.B;
                o0Var2.f366260e = new ei3.l0(hVar, str, f19, i19, i18, c11120x15dce88d.f152732o, o0Var2.M, true, c11120x15dce88d.K == 1);
                long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime();
                ht0.o0 o0Var3 = this.f366253r;
                boolean a17 = ((ei3.l0) o0Var3.f366260e).a(o0Var3.N);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "mux used %sms, success: %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime3), java.lang.Boolean.valueOf(a17));
                if (!a17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.X264YUVMP4MuxRecorder", "mux failed!");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69225x381fab99(this.f366243e);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new ht0.k0(this));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markX264CaptureFailed");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(985L, 37L, 1L);
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markX264CaptureSuccess");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(985L, 39L, 1L);
                ht0.o0 o0Var4 = this.f366253r;
                boolean z19 = o0Var4.G;
                if ((z19 && o0Var4.f366278w) || ((!o0Var4.f366278w && !z19) || ((z19 && java.lang.Math.abs(o0Var4.f366272q - o0Var4.H) == 0) || this.f366253r.H == 180))) {
                    long elapsedRealtime4 = android.os.SystemClock.elapsedRealtime();
                    ht0.o0 o0Var5 = this.f366253r;
                    boolean z27 = o0Var5.f366278w;
                    int i27 = (z27 || o0Var5.G) ? z27 ? o0Var5.H : 180 : o0Var5.f366272q;
                    if (o0Var5.H == 180 && !z27 && (i27 = i27 + 180) > 360) {
                        i27 += org.p3343x72743996.net.InterfaceC29524x4f65168b.f73983x984b3535;
                    }
                    if (i27 > 0) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69252x50488dfd(o0Var5.f366262g, o0Var5.f366273r, i27);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "tagRotateVideo used %sms, cameraOrientation: %s, isLandscape: %s, deviceDegree: %s, rotateDegree: %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime4), java.lang.Integer.valueOf(this.f366253r.f366272q), java.lang.Boolean.valueOf(this.f366253r.G), java.lang.Integer.valueOf(this.f366253r.H), java.lang.Integer.valueOf(i27));
                        ht0.o0 o0Var6 = this.f366253r;
                        java.lang.String str2 = o0Var6.f366273r;
                        try {
                            com.p314xaae8f345.mm.vfs.w6.c(str2, o0Var6.f366262g);
                            ((ku5.t0) ku5.t0.f394148d).g(new ht0.m0(this, str2));
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "tag rotate used %sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime4));
                            try {
                                com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(this.f366253r.f366262g, true);
                                if (d17 != null) {
                                    int i28 = d17.f243916b;
                                    int i29 = d17.f243919e;
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markX264CaptureResult, bitrate:" + i28 + ", fps:" + i29);
                                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                                    g0Var.C(985L, 38L, (long) i28);
                                    g0Var.C(985L, 41L, (long) i29);
                                }
                            } catch (java.lang.Exception unused2) {
                            }
                        } catch (java.lang.Exception unused3) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.X264YUVMP4MuxRecorder", "stop, copy file error");
                            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69225x381fab99(this.f366243e);
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new ht0.l0(this));
                            return;
                        }
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69225x381fab99(this.f366243e);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "all finish, callback: %s", this.f366252q);
            this.f366253r.mo127748x6761d4f();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(this.f366252q);
            this.f366250o = true;
            ht0.o0 o0Var7 = this.f366253r;
            o0Var7.f366277v = -1;
            o0Var7.f366276u = -1;
        }
    }
}
