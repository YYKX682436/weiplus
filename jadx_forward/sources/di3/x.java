package di3;

/* loaded from: classes10.dex */
public abstract class x {
    public static void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRecorderIDKeyStat", "markCapture");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.mo68477x336bdfd8(440L, 0L, 1L, false);
        di3.f0 f0Var = di3.w.f314303d;
        if (f0Var != null) {
            int i17 = f0Var.f314233a == 1 ? 39 : 36;
            int i18 = f0Var.f314239g;
            if (i18 == 720) {
                i17++;
            } else {
                if (f0Var.f314234b.f152724d < i18) {
                    i17 += 2;
                }
            }
            g0Var.mo68477x336bdfd8(440L, i17, 1L, false);
        }
    }

    public static void b(boolean z17, long j17) {
        int i17;
        int i18;
        int i19;
        di3.b.b().G = j17;
        di3.b b17 = di3.b.b();
        b17.getClass();
        m21.x xVar = new m21.x();
        m21.x xVar2 = new m21.x();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = b17.f314185a;
        sb6.append(str);
        sb6.append(",");
        xVar.b("model", sb6.toString());
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        java.lang.String str2 = b17.f314186b;
        sb7.append(str2);
        sb7.append(",");
        xVar.b("apiLevel", sb7.toString());
        xVar.b("memoryClass", b17.f314187c + ",");
        xVar.b("totalMemory", b17.f314188d + ",");
        xVar.b("maxCpu", b17.f314189e + ",");
        xVar.b("screenW", b17.f314190f + ",");
        xVar.b("screenH", b17.f314191g + ",");
        xVar2.b("model", str + ",");
        xVar2.b("apiLevel", str2 + ",");
        xVar2.b("memoryClass", b17.f314187c + ",");
        xVar2.b("totalMemory", b17.f314188d + ",");
        xVar2.b("maxCpu", b17.f314189e + ",");
        xVar2.b("screenW", b17.f314190f + ",");
        xVar2.b("screenH", b17.f314191g + ",");
        xVar.b("cropx", b17.f314196l + ",");
        xVar.b("cropy", b17.f314197m + ",");
        xVar.b("previewx", b17.f314198n + ",");
        xVar.b("previewy", b17.f314199o + ",");
        xVar.b("encoderx", b17.f314200p + ",");
        xVar.b("encodery", b17.f314201q + ",");
        xVar.b(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37665xf880c7f2, b17.f314202r + ",");
        xVar.b("deviceoutfps", b17.f314203s + ",");
        xVar.b("recordfps", b17.f314204t + ",");
        xVar.b("recordertype", b17.f314205u + ",");
        xVar.b("videoBitrate", b17.f314206v + ",");
        xVar.b("needRotateEachFrame", b17.f314207w + ",");
        xVar.b("isNeedRealtimeScale", b17.f314208x + ",");
        xVar.b("resolutionLimit", b17.f314209y + ",");
        xVar.b("outfps", b17.f314210z + ",");
        xVar.b("recordTime", b17.A + ",");
        xVar.b("avgcpu", b17.B + ",");
        xVar.b("outx", b17.C + ",");
        xVar.b("outy", b17.D + ",");
        xVar.b("outbitrate", b17.E + ",");
        xVar.b("fileSize", b17.F + ",");
        xVar.b("wait2playtime", b17.G + ",");
        xVar.b("useback", b17.H + ",");
        android.content.Intent registerReceiver = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            i18 = (intExtra == 2 || intExtra == 5) ? 1 : 0;
            i19 = registerReceiver.getIntExtra(ya.b.f77487x44fa364, -1);
            i17 = registerReceiver.getIntExtra("scale", -1);
        } else {
            i17 = 0;
            i18 = 0;
            i19 = 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CaptureStatistics", "battery %s %s %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17));
        xVar.b("mIsCharging", i18 + ",");
        xVar.b(ya.b.f77487x44fa364, i19 + ",");
        xVar.b("scale", i17 + ",");
        xVar.b("createTime", java.lang.System.currentTimeMillis() + ",");
        xVar2.b("prewViewlist1", b17.f314192h + ",");
        xVar2.b("pictureSize1", b17.f314193i + ",");
        xVar2.b("prewViewlist2", b17.f314194j + ",");
        xVar2.b("pictureSize2", b17.f314195k + ",");
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("report ");
        sb8.append(xVar.c());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CaptureStatistics", sb8.toString());
        xVar2.c();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.mo68478xbd3cda5f(13947, xVar.m146697x9616526c());
        g0Var.mo68478xbd3cda5f(13949, xVar2.m146697x9616526c());
        if (!z17) {
            g0Var.mo68477x336bdfd8(440L, 124L, 1L, false);
            g0Var.mo68477x336bdfd8(440L, 125L, j17, false);
            if (di3.w.f314303d.f314233a == 1) {
                g0Var.mo68477x336bdfd8(440L, 127L, j17, false);
                g0Var.mo68477x336bdfd8(440L, 131L, j17, false);
                return;
            } else {
                g0Var.mo68477x336bdfd8(440L, 126L, j17, false);
                g0Var.mo68477x336bdfd8(440L, 130L, j17, false);
                return;
            }
        }
        g0Var.mo68477x336bdfd8(440L, 119L, 1L, false);
        g0Var.mo68477x336bdfd8(440L, 120L, j17, false);
        di3.f0 f0Var = di3.w.f314303d;
        int i27 = f0Var.f314239g;
        if (i27 == 720) {
            g0Var.mo68477x336bdfd8(440L, 122L, j17, false);
            return;
        }
        if (f0Var.f314234b.f152724d < i27) {
            g0Var.mo68477x336bdfd8(440L, 123L, j17, false);
        } else {
            g0Var.mo68477x336bdfd8(440L, 121L, j17, false);
        }
    }

    public static void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRecorderIDKeyStat", "markFFMpegInitError");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(440L, 7L, 1L, false);
    }

    public static void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRecorderIDKeyStat", "markMediaCodecInitError");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(440L, 8L, 1L, false);
    }

    public static void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRecorderIDKeyStat", "markMediaCodecMuxError");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(440L, 31L, 1L, false);
    }

    public static void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRecorderIDKeyStat", "markMediaCodecYUVInitError");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(440L, 16L, 1L, false);
    }

    public static void g(java.lang.String str, int i17, int i18) {
        try {
            if (di3.w.f314303d != null) {
                int optInt = new org.json.JSONObject(com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69182xa23d6ecc(str)).optInt("videoBitrate");
                if (i18 == 1) {
                    if (i17 == 1) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                        g0Var.mo68477x336bdfd8(440L, 189L, optInt, false);
                        g0Var.mo68477x336bdfd8(440L, 190L, 1L, false);
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                        g0Var2.mo68477x336bdfd8(440L, 184L, optInt, false);
                        g0Var2.mo68477x336bdfd8(440L, 185L, 1L, false);
                    }
                } else if (i18 == 2) {
                    if (i17 == 1) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                        g0Var3.mo68477x336bdfd8(440L, 194L, optInt, false);
                        g0Var3.mo68477x336bdfd8(440L, 195L, 1L, false);
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var4 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                        g0Var4.mo68477x336bdfd8(440L, 199L, optInt, false);
                        g0Var4.mo68477x336bdfd8(440L, 200L, 1L, false);
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightRecorderIDKeyStat", "markAfterCaptureFinish error: %s", e17.getMessage());
        }
    }
}
