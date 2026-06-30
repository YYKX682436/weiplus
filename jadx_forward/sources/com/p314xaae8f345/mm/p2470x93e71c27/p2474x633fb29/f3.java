package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29;

/* loaded from: classes10.dex */
public final class f3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.f3 f270835a = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.f3();

    public static final int b(java.lang.String inputPath, java.lang.String outputPath, com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d videoParam, boolean z17, d11.n nVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputPath, "inputPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outputPath, "outputPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoParam, "videoParam");
        return c(inputPath, outputPath, videoParam, z17, false, 0L, nVar, null).f119790a;
    }

    public static final c35.p c(java.lang.String inputPath, java.lang.String outputPath, com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d videoParam, boolean z17, boolean z18, long j17, d11.n nVar, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputPath, "inputPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outputPath, "outputPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoParam, "videoParam");
        c35.p pVar = new c35.p();
        pVar.f119790a = -1;
        jo4.l lVar = (jo4.l) t21.f.a();
        lVar.f382454b = nVar;
        int m69179x9787f6ed = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69179x9787f6ed(inputPath);
        int i17 = videoParam.G;
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d = new com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d(videoParam);
        int i18 = (m69179x9787f6ed == 0 || m69179x9787f6ed == 180) ? c11120x15dce88d.f152724d : c11120x15dce88d.f152725e;
        int i19 = (m69179x9787f6ed == 0 || m69179x9787f6ed == 180) ? c11120x15dce88d.f152725e : c11120x15dce88d.f152724d;
        c11120x15dce88d.f152724d = i18;
        c11120x15dce88d.f152725e = i19;
        t21.c cVar = new t21.c(c11120x15dce88d);
        cVar.f496245f = false;
        if (c11120x15dce88d.A == 1) {
            cVar.f496243d = true;
            cVar.f496244e = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImportVideoTransfer", "outputHevc, force soft encode");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d18 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(inputPath, true);
        if (cVar.f496243d) {
            java.lang.Object valueOf = i17 == 9 ? java.lang.Long.valueOf(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697) : java.lang.Integer.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_c2c_hevc_soft_encode_duration_limit, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8));
            int i27 = d18 != null ? d18.f243915a : 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImportVideoTransfer", "c2c export hevc, soft encode duration limit:" + valueOf + ", videoDuration:" + i27 + ", scene = " + i17);
            if (kz5.n0.O(e06.p.m(1, i27), valueOf)) {
                cVar.f496243d = false;
                cVar.f496244e = false;
            } else {
                cVar.f496244e = true;
            }
        } else {
            boolean z19 = !f270835a.a();
            cVar.f496244e = z19;
            if (!z19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImportVideoTransfer", "report avc hard encode");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(106L, 52L, 1L, false);
            }
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImportVideoTransfer", "forceSoftEncode");
            cVar.f496244e = true;
        }
        if (z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImportVideoTransfer", "forceSoftDecode");
            cVar.f496250k = true;
        }
        cVar.f496247h = c11120x15dce88d.H;
        cVar.f496248i = c11120x15dce88d.I;
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_vc_video_parallel_mux_enable_c2c, false);
        if ((d18 != null ? d18.f243915a : 0) > 20000 && fj6 && com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274648k) {
            t21.x1 x1Var = cVar.f496246g;
            x1Var.f496594a = true;
            x1Var.f496595b = 2;
        }
        boolean z27 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_enable_c2c_soft_encode_vcodec2_faster_preset, 1) == 1;
        bm5.o1 o1Var = bm5.o1.f104252a;
        int g17 = o1Var.g(bm5.h0.RepairerConfig_Media_ImportVideoHEVC_ABR_Int, 0);
        float Di = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Di(e42.c0.clicfg_c2c_soft_vcodec2_faster_preset_bitrate_ratio, 1.3f);
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_enable_c2c_soft_encode_vcodec2_crf_preset, 14);
        float e17 = o1Var.e(bm5.h0.RepairerConfig_Media_ImportVideoBRRatio_Float, 0.0f);
        int g18 = o1Var.g(bm5.h0.RepairerConfig_Media_ImportVideoHEVC_CRF_Int, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImportVideoTransfer", "enableFastPreset:" + z27 + ", fastPresetBitrateRatio:" + Di + ", repairerVideoBRRatio:" + e17 + " constQualityMode:" + Ni + " repairerHEVCCRFMode:" + g18);
        if (c11120x15dce88d.G == 9 && cVar.f496243d && cVar.f496244e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImportVideoTransfer", "compress stocking video, use hevc preset " + c11120x15dce88d.P);
            int i28 = c11120x15dce88d.P;
            if (i28 == 5) {
                cVar.f496249j = new t21.d2(i28, 0.0f, 0, 0, 0, 30, null);
            } else if (i28 == 12 || i28 == 18) {
                float f17 = c11120x15dce88d.M;
                int i29 = c11120x15dce88d.N;
                int i37 = c11120x15dce88d.Q;
                cVar.f496249j = new t21.d2(i28, f17, i29, i37, i37 > 0 ? 3 : 0);
                if (g18 > 0) {
                    cVar.f496249j = new t21.d2(g18, f17, i29, i37, i37 > 0 ? 3 : 0);
                }
            }
        } else {
            if ((z27 || g17 > 0) && cVar.f496243d && cVar.f496244e) {
                cVar.f496249j = new t21.d2(16, 0.0f, 0, 0, 0, 30, null);
                if (g17 > 0) {
                    cVar.f496249j = new t21.d2(g17, 0.0f, 0, 0, 0, 30, null);
                }
                cVar.f496240a.f152727g = (int) (videoParam.f152727g * Di);
            }
            if ((Ni > 0 || g18 > 0) && cVar.f496243d && cVar.f496244e) {
                float f18 = c11120x15dce88d.M;
                int i38 = c11120x15dce88d.N;
                int i39 = c11120x15dce88d.Q;
                cVar.f496249j = new t21.d2(Ni, f18, i38, i39, i39 > 0 ? 3 : 0);
                if (g18 > 0) {
                    cVar.f496249j = new t21.d2(g18, f18, i38, i39, i39 > 0 ? 3 : 0);
                }
            }
        }
        if (e17 > 0.0f && cVar.f496243d && cVar.f496244e) {
            cVar.f496240a.f152727g = (int) (videoParam.f152727g * e17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImportVideoTransfer", "transferVideo softEncode:" + cVar.f496244e + " outputHevc:" + cVar.f496243d + " parallelParam :" + cVar.f496246g + " videoParam.videoBitrate:" + cVar.f496240a.f152727g);
        java.lang.Object obj = new java.lang.Object();
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        f65.y0.f341552a.f(str, cVar.f496243d ? 2 : 1, cVar.f496244e ? 1 : 2);
        boolean b17 = lVar.b(inputPath, outputPath, cVar, new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.e3(c0Var, pVar, str, obj));
        c0Var.f391645d = b17;
        if (!b17) {
            pVar.f119790a = -1;
            return pVar;
        }
        synchronized (obj) {
            try {
                obj.wait(j17);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ImportVideoTransfer", e18, "", new java.lang.Object[0]);
            }
        }
        int i47 = (!c0Var.f391645d || (d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(outputPath, true)) == null) ? -1 : d17.f243915a;
        if (i47 > 0) {
            pVar.f119791b = 0;
            pVar.f119790a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V1(i47);
        }
        return pVar;
    }

    public final boolean a() {
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_c2c_remuxing_avc_use_hard_encode, 0) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImportVideoTransfer", "expt enableAvcHard:%s", java.lang.Boolean.valueOf(z17));
        int g17 = bm5.o1.f104252a.g(bm5.h0.RepairerConfig_Media_AvcEncodeHard_Int, 0);
        if (g17 == 0) {
            return z17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImportVideoTransfer", "debug repairerConfig:" + g17);
        return g17 == 1;
    }
}
