package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* loaded from: classes10.dex */
public class r2 implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f230945d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.s2 f230946e;

    public r2(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.s2 s2Var, long j17) {
        this.f230946e = s2Var;
        this.f230945d = j17;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "BigSightFFMpegRecorder_markAfterCaptureFinish_idkeystat";
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        int i18;
        int i19;
        int i27;
        int i28;
        int i29;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.r2 r2Var = this;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.s2 s2Var = r2Var.f230946e;
        java.lang.String mo127744x5000ed37 = s2Var.f230950d.f230768m.mo127744x5000ed37();
        r45.vh4 vh4Var = s2Var.f230950d.M;
        di3.f0 f0Var = di3.w.f314303d;
        int i37 = f0Var.f314233a;
        int i38 = f0Var.f314239g;
        try {
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightRecorderIDKeyStat", "markAfterCaptureFinish error: %s", e17.getMessage());
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo127744x5000ed37)) {
            if (!com.p314xaae8f345.mm.vfs.w6.j(mo127744x5000ed37)) {
                di3.x.b(false, r2Var.f230945d);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.mo68477x336bdfd8(440L, 87L, 1L, false);
            org.json.JSONObject jSONObject = new org.json.JSONObject(com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69182xa23d6ecc(mo127744x5000ed37));
            int i39 = (int) jSONObject.getDouble("videoFPS");
            int optInt = jSONObject.optInt("videoBitrate");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRecorderIDKeyStat", "markAfterCaptureFinish, videoFPS: %s, videoBitrate: %s, recorderType: %s, resolutionLimit: %s", java.lang.Integer.valueOf(i39), java.lang.Integer.valueOf(optInt), java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(i38));
            di3.b.b().a(mo127744x5000ed37, i39);
            if (i37 == 1) {
                i17 = optInt;
                i18 = i39;
                g0Var.mo68477x336bdfd8(440L, 89L, 1L, false);
                g0Var.mo68477x336bdfd8(440L, 49L, i18, false);
                i19 = 69;
                i27 = 93;
                i28 = 73;
            } else {
                i17 = optInt;
                i18 = i39;
                g0Var.mo68477x336bdfd8(440L, 88L, 1L, false);
                g0Var.mo68477x336bdfd8(440L, 48L, i18, false);
                i19 = 50;
                i27 = 90;
                i28 = 54;
            }
            if (i38 == 720) {
                i19 += 6;
                i27++;
                i28 += 6;
            } else {
                di3.f0 f0Var2 = di3.w.f314303d;
                if ((f0Var2.f314234b.f152724d < f0Var2.f314239g) || i38 == 1080) {
                    i19 += 12;
                    i27 += 2;
                    i28 += 12;
                }
            }
            int i47 = i19;
            int i48 = i27;
            long j17 = i18;
            g0Var.mo68477x336bdfd8(440L, i28, j17, false);
            g0Var.mo68477x336bdfd8(440L, i48, 1L, false);
            g0Var.mo68477x336bdfd8(440L, 47L, j17, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRecorderIDKeyStat", "markAfterCaptureFinish, filePath: %s base %d", mo127744x5000ed37, java.lang.Integer.valueOf(i47));
            if (i18 < 0 || i18 > 10) {
                i29 = 1;
                if (i18 > 10 && i18 <= 15) {
                    g0Var.mo68477x336bdfd8(440L, i47 + 1, 1L, false);
                } else if (i18 > 15 && i18 <= 20) {
                    g0Var.mo68477x336bdfd8(440L, i47 + 2, 1L, false);
                } else if (i18 > 20 && i18 <= 30) {
                    g0Var.mo68477x336bdfd8(440L, i47 + 3, 1L, false);
                }
            } else {
                i29 = 1;
                g0Var.mo68477x336bdfd8(440L, i47, 1L, false);
            }
            int i49 = i17;
            if (i49 > 0) {
                if (i37 == 2) {
                    long j18 = i49;
                    g0Var.mo68477x336bdfd8(440L, 175L, j18, false);
                    g0Var.mo68477x336bdfd8(440L, 176L, 1L, false);
                    if (vh4Var != null) {
                        int i57 = vh4Var.f469770g;
                        if (i57 == i29) {
                            g0Var.mo68477x336bdfd8(440L, 184L, j18, false);
                            g0Var.mo68477x336bdfd8(440L, 185L, 1L, false);
                        } else if (i57 == 2) {
                            g0Var.mo68477x336bdfd8(440L, 194L, j18, false);
                            g0Var.mo68477x336bdfd8(440L, 195L, 1L, false);
                        }
                    }
                } else {
                    long j19 = i49;
                    g0Var.mo68477x336bdfd8(440L, 179L, j19, false);
                    g0Var.mo68477x336bdfd8(440L, 180L, 1L, false);
                    if (vh4Var != null) {
                        int i58 = vh4Var.f469770g;
                        if (i58 == i29) {
                            g0Var.mo68477x336bdfd8(440L, 189L, j19, false);
                            g0Var.mo68477x336bdfd8(440L, 190L, 1L, false);
                        } else if (i58 == 2) {
                            g0Var.mo68477x336bdfd8(440L, 199L, j19, false);
                            g0Var.mo68477x336bdfd8(440L, 200L, 1L, false);
                        }
                    }
                }
            }
        }
        r2Var = this;
        di3.x.b(false, r2Var.f230945d);
    }
}
