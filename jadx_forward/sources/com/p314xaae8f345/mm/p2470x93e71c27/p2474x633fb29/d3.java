package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29;

/* loaded from: classes10.dex */
public final class d3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.d3 f270809a = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.d3();

    public final boolean a() {
        boolean z17 = false;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274648k) {
            return false;
        }
        if (!((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).bj()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImportVideoHevcChecker", "importVideoEnableHevc: hevc not support");
            return false;
        }
        int g17 = bm5.o1.f104252a.g(bm5.h0.RepairerConfig_Media_ImportVideoRemuxHevc_Int, 0);
        boolean z18 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_import_video_enable_hevc_soft, 0) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImportVideoHevcChecker", "importVideoEnableHevc software encode enable:" + z18);
        int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv_gpu_info").getInt("gpu_info_rating", -1);
        if (z18) {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_import_video_enable_hevc_soft_gpu_rating_limit, -1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImportVideoHevcChecker", "importVideoEnableHevc software encode gpu rating limit:" + Ni + ", gpuRating:" + i17);
            if (Ni > 0 && i17 >= Ni) {
                z17 = true;
            }
        } else {
            z17 = z18;
        }
        boolean z19 = g17 != 1 ? z17 : true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImportVideoHevcChecker", "importVideoEnableHevc software encode enable:" + z19 + ", repairerConfig:" + g17 + ", gpuRating:" + i17);
        return z19;
    }
}
