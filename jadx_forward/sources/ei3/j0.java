package ei3;

/* loaded from: classes10.dex */
public class j0 extends wu5.b {

    /* renamed from: e, reason: collision with root package name */
    public int f334592e;

    /* renamed from: g, reason: collision with root package name */
    public float f334594g;

    /* renamed from: h, reason: collision with root package name */
    public int f334595h;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Object f334600p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.Runnable f334601q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ei3.k0 f334602r;

    /* renamed from: f, reason: collision with root package name */
    public volatile int f334593f = 0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f334596i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f334597m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f334598n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f334599o = false;

    public j0(ei3.k0 k0Var) {
        this.f334602r = k0Var;
        java.lang.Object obj = new java.lang.Object();
        this.f334600p = obj;
        this.f334601q = null;
        synchronized (obj) {
            try {
                java.lang.String r17 = com.p314xaae8f345.mm.vfs.w6.r(k0Var.f334610g);
                k0Var.f334621r = (r17.endsWith("/") ? r17 : r17.concat("/")) + "tempRotate.mp4";
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightFFMpegRecorder", "retrieve file name error: %s", e17.getMessage());
            }
        }
    }

    @Override // wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "MicroMsg.MMSightFFMpegRecorder";
    }

    @Override // java.lang.Runnable
    public void run() {
        ei3.k0 k0Var = this.f334602r;
        if (k0Var.f334625v == -1) {
            k0Var.f334625v = android.os.Process.myTid();
            android.os.Process.setThreadPriority(android.os.Process.myTid(), -2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightFFMpegRecorder", "encodeTid: %s", java.lang.Integer.valueOf(this.f334602r.f334625v));
        }
        synchronized (this.f334600p) {
            while (!this.f334597m) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                int m69253x89b555ee = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69253x89b555ee(this.f334592e, java.lang.Math.max(0, this.f334593f), false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightFFMpegRecorder", "ing: trgger encode use %dms, Encode index[%d, %d), threadId: %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), java.lang.Integer.valueOf(this.f334593f), java.lang.Integer.valueOf(m69253x89b555ee), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
                if (java.lang.Math.abs(m69253x89b555ee - this.f334593f) <= 5) {
                    try {
                        java.lang.Thread.sleep(100L);
                    } catch (java.lang.Exception unused) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightFFMpegRecorder", "thread sleep error");
                    }
                }
                this.f334593f = m69253x89b555ee;
            }
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
            if (!this.f334598n) {
                this.f334593f = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69253x89b555ee(this.f334592e, this.f334593f, true);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightFFMpegRecorder", "end: trgger encode use %dms, curEncode index %d, markCancel %B, threadId: %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime2), java.lang.Integer.valueOf(this.f334593f), java.lang.Boolean.valueOf(this.f334598n), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            if (!this.f334598n) {
                int max = java.lang.Math.max(1000, this.f334595h);
                ei3.k0 k0Var2 = this.f334602r;
                int i17 = k0Var2.f334613j;
                int i18 = i17 > 0 ? i17 : max;
                float f17 = this.f334594g;
                float f18 = k0Var2.f334614k;
                float f19 = f18 > 0.0f ? f18 : f17;
                com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h hVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h(this.f334592e);
                ei3.k0 k0Var3 = this.f334602r;
                k0Var2.f334608e = new ei3.l0(hVar, k0Var3.f334610g, f19, k0Var3.f334617n, i18, k0Var3.A.f152732o, false, true, false);
                long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime();
                ei3.k0 k0Var4 = this.f334602r;
                ei3.n nVar = k0Var4.f334608e;
                k0Var4.getClass();
                boolean a17 = ((ei3.l0) nVar).a(false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightFFMpegRecorder", "mux used %sms, success: %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime3), java.lang.Boolean.valueOf(a17));
                if (!a17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightFFMpegRecorder", "mux failed!");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69225x381fab99(this.f334592e);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new ei3.g0(this));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRecorderIDKeyStat", "markFFMpegCaptureMuxError");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(440L, 30L, 1L, false);
                    return;
                }
                ei3.k0 k0Var5 = this.f334602r;
                boolean z19 = k0Var5.F;
                if ((z19 && k0Var5.f334626w) || ((!k0Var5.f334626w && !z19) || ((z19 && java.lang.Math.abs(k0Var5.f334620q - k0Var5.G) == 0) || this.f334602r.G == 180))) {
                    long elapsedRealtime4 = android.os.SystemClock.elapsedRealtime();
                    ei3.k0 k0Var6 = this.f334602r;
                    boolean z27 = k0Var6.f334626w;
                    int i19 = (z27 || k0Var6.F) ? z27 ? k0Var6.G : 180 : k0Var6.f334620q;
                    if (k0Var6.G == 180 && !z27 && (i19 = i19 + 180) > 360) {
                        i19 += org.p3343x72743996.net.InterfaceC29524x4f65168b.f73983x984b3535;
                    }
                    if (i19 > 0) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69252x50488dfd(k0Var6.f334610g, k0Var6.f334621r, i19);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightFFMpegRecorder", "tagRotateVideo used %sms, cameraOrientation: %s, isLandscape: %s, deviceDegree: %s, rotateDegree: %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime4), java.lang.Integer.valueOf(this.f334602r.f334620q), java.lang.Boolean.valueOf(this.f334602r.F), java.lang.Integer.valueOf(this.f334602r.G), java.lang.Integer.valueOf(i19));
                        ei3.k0 k0Var7 = this.f334602r;
                        java.lang.String str = k0Var7.f334621r;
                        try {
                            com.p314xaae8f345.mm.vfs.w6.c(str, k0Var7.f334610g);
                            s75.d.b(new ei3.i0(this, str), "BigSightFFMpegRecorder_tagRotate_after_process");
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightFFMpegRecorder", "tag rotate used %sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime4));
                        } catch (java.lang.Exception unused2) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightFFMpegRecorder", "stop, copy file error");
                            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69225x381fab99(this.f334592e);
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new ei3.h0(this));
                            return;
                        }
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69225x381fab99(this.f334592e);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightFFMpegRecorder", "all finish, callback: %s", this.f334601q);
            this.f334602r.mo127748x6761d4f();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(this.f334601q);
            this.f334599o = true;
            ei3.k0 k0Var8 = this.f334602r;
            k0Var8.f334625v = -1;
            k0Var8.f334624u = -1;
        }
    }
}
