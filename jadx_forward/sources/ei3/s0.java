package ei3;

/* loaded from: classes10.dex */
public class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ei3.w0 f334654d;

    public s0(ei3.w0 w0Var) {
        this.f334654d = w0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        ei3.w0 w0Var = this.f334654d;
        w0Var.getClass();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.lang.String str = null;
        if (w0Var.f334712s != null && w0Var.f334713t != null) {
            if (fp.h.c(18)) {
                w0Var.f334712s.quitSafely();
            } else {
                w0Var.f334712s.quit();
            }
            w0Var.f334713t = null;
        }
        int i17 = w0Var.f334702i.f334536e;
        w0Var.f334698e = (i17 * 1000.0f) / w0Var.f334697d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "stop, frameCount: %s, fps: %s, duration: %s, file: %s handlerrunning %s, overrideDurationMs: %s, overrideFps: %s", java.lang.Integer.valueOf(i17), java.lang.Float.valueOf(w0Var.f334698e), java.lang.Integer.valueOf(w0Var.f334697d), w0Var.f334696c, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), java.lang.Integer.valueOf(w0Var.f334699f), java.lang.Float.valueOf(w0Var.f334700g));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "frameCountCallback %s", w0Var.A.c());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "yuvRecorderWriteDataCallback %s", w0Var.f334719z.c());
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1874x633fb29.BinderC16530x6b2d3ec8.m66802x9cf0d20b() != null) {
            str = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1874x633fb29.BinderC16530x6b2d3ec8.m66802x9cf0d20b().m66807x1efd7235();
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w0Var.f334696c)) {
            str = new com.p314xaae8f345.mm.vfs.r6(w0Var.f334696c).s().o();
        }
        java.lang.String l17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? ai3.d.l(str) : w0Var.f334696c;
        int i18 = w0Var.f334697d;
        int i19 = w0Var.f334699f;
        int i27 = i19 > 0 ? i19 : i18;
        float f17 = w0Var.f334698e;
        float f18 = w0Var.f334700g;
        w0Var.f334703j = new ei3.l0(new com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h(w0Var.f334711r), l17, f18 > 0.0f ? f18 : f17, w0Var.f334706m, i27, w0Var.B.f152732o, w0Var.L, false, false);
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
        boolean z18 = false;
        boolean a17 = w0Var.f334703j.a(false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "mux used %sms, success: %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime2), java.lang.Boolean.valueOf(a17));
        if (a17) {
            boolean z19 = w0Var.F;
            if ((z19 && w0Var.f334715v) || ((!w0Var.f334715v && !z19) || ((z19 && java.lang.Math.abs(w0Var.f334710q - w0Var.G) == 0) || w0Var.G == 180))) {
                long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime();
                boolean z27 = w0Var.f334715v;
                int i28 = (z27 || w0Var.F) ? z27 ? w0Var.G : 180 : w0Var.f334710q;
                if (w0Var.G == 180 && !z27 && (i28 = i28 + 180) > 360) {
                    i28 += org.p3343x72743996.net.InterfaceC29524x4f65168b.f73983x984b3535;
                }
                if (i28 > 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69252x50488dfd(l17, w0Var.f334714u, i28);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "tagRotateVideo used %sms, cameraOrientation: %s, isLandscape: %s, deviceDegree: %s, rotateDegree: %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime3), java.lang.Integer.valueOf(w0Var.f334710q), java.lang.Boolean.valueOf(w0Var.F), java.lang.Integer.valueOf(w0Var.G), java.lang.Integer.valueOf(i28));
                    long elapsedRealtime4 = android.os.SystemClock.elapsedRealtime();
                    try {
                        com.p314xaae8f345.mm.vfs.w6.h(l17);
                        com.p314xaae8f345.mm.vfs.w6.w(w0Var.f334714u, l17);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "copyFile cost %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime4));
                        s75.d.b(new ei3.t0(w0Var, w0Var.f334714u), "BigSightMediaCodecMP4MuxRecorder_tagRotate_after_process");
                    } catch (java.lang.Exception unused) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "stop, copy file error");
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69225x381fab99(w0Var.f334711r);
            w0Var.f334709p.a(ei3.l.Stop);
            w0Var.E = com.p314xaae8f345.mm.vfs.w6.p(l17);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l17) && !l17.equals(w0Var.f334696c)) {
                com.p314xaae8f345.mm.vfs.w6.w(l17, w0Var.f334696c);
                com.p314xaae8f345.mm.vfs.w6.h(l17);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "move muxResultPath %s , isExist: %b", l17, java.lang.Boolean.valueOf(com.p314xaae8f345.mm.vfs.w6.j(l17)));
            java.lang.String str2 = w0Var.f334696c;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "to mCurRecordPath %s ,  isExist: %b", str2, java.lang.Boolean.valueOf(com.p314xaae8f345.mm.vfs.w6.j(str2)));
            z18 = true;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "mux failed!");
            di3.x.e();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "stopImpl result: %s", java.lang.Boolean.valueOf(z18));
        if (z18) {
            if (this.f334654d.I != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "call stopCallback");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(this.f334654d.I);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69225x381fab99(this.f334654d.f334711r);
        if (this.f334654d.H != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new ei3.r0(this));
        }
    }
}
