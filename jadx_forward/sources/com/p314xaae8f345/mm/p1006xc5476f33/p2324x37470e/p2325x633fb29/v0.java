package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29;

/* loaded from: classes10.dex */
public abstract class v0 {
    public static final boolean a() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_edit_enable_add_finder_audio, 0) == 1;
    }

    public static final boolean b() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("FINDER_CONFIG_USER_KEY").getInt("FINDER_FOLLOW_PAT_ENTRANCE", 0) == 1 || ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_follow_pat_entrance, 0) == 1;
    }

    public static final boolean c() {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("FINDER_CONFIG_USER_KEY").getInt("USERINFO_FINDER_EDITOR_MAGIC_INT_SYNC", 0) == 1;
    }

    public static final boolean d() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("FINDER_CONFIG_USER_KEY").getInt("USERINFO_FINDER_EDITOR_VIDEO_TEMPLATE_INT_SYNC", 0);
        return false;
    }

    public static final boolean e() {
        boolean z17;
        boolean z18;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257080a.a()) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257097r == 2;
        }
        int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("FINDER_CONFIG_USER_KEY").getInt("USERINFO_FINDER_HEVC_ENCODE_OPTION_INT_SYNC", 0);
        st3.n nVar = st3.n.f494088a;
        if (((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).bj()) {
            boolean z19 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_enable_hevc_hard_encode, 0) == 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HevcEncodeChecker", "canEncodeHevcHard, svr isEnable:" + z19 + ", cpuName:" + st3.n.f494089b);
            if (z19) {
                if (!(st3.n.f494089b.length() == 0)) {
                    java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_enable_hevc_hard_cpu_list, "", true);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HevcEncodeChecker", "canEncodeHevcHard, hardCpuList:" + Zi);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Zi);
                    java.util.List<java.lang.String> f07 = r26.n0.f0(Zi, new java.lang.String[]{";"}, false, 0, 6, null);
                    if (!f07.isEmpty()) {
                        for (java.lang.String str : f07) {
                            if ((str.length() > 0) && r26.n0.D(st3.n.f494089b, str, false, 2, null)) {
                                z17 = true;
                                break;
                            }
                        }
                    }
                    z17 = false;
                    if (z17) {
                        z18 = true;
                        return i17 == 2 || z18;
                    }
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HevcEncodeChecker", "canEncodeHevcHard: hevc not support");
        }
        z18 = false;
        if (i17 == 2) {
            return true;
        }
    }

    public static final boolean f(boolean z17, long j17) {
        boolean z18 = false;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257080a.a()) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257097r == 1;
        }
        int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("FINDER_CONFIG_USER_KEY").getInt("USERINFO_FINDER_HEVC_ENCODE_OPTION_INT_SYNC", -1);
        st3.n nVar = st3.n.f494088a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274648k) {
            if (((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).bj()) {
                boolean z19 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_enable_hevc_soft_encode, 0) == 1;
                boolean z27 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_enable_hevc_soft_encode_long_video, 0) == 1;
                long Ui = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_enable_hevc_soft_encode_long_video_max_duration, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697);
                int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_enable_hevc_min_gpu_rating, -1);
                int f17 = rs0.n.f480839d.f();
                boolean z28 = !z17 ? z19 : z27 && j17 <= Ui;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HevcEncodeChecker", "canEncodeHevcSoft, svr isEnable:" + z28 + ", cpuName:" + st3.n.f494089b + ", longVideo:" + z17 + ", duration:" + j17 + ", enableShortSoft:" + z19 + ", enableLongSoft:" + z27 + ", longSoftDurationLimit:" + Ui + ", enableSoftMinGpuRating:" + Ni + ", gpuRating:" + f17);
                z18 = z28 && f17 > 0 && Ni > 0 && f17 >= Ni;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HevcEncodeChecker", "finderEnableHevcSoft: hevc not support");
            }
        }
        return i17 != -1 ? i17 == 1 : z18;
    }
}
