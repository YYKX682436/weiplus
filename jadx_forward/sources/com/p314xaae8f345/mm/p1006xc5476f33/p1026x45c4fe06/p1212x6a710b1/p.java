package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes7.dex */
public abstract class p {
    public static int a() {
        if (i95.n0.c(e42.e0.class) == null) {
            return 2500;
        }
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_xweb_video_loadcontrol_bufferforplaybackms, 2500);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandAVABTests", "getXWebVideoBufferForPlaybackMS, expt is %s", java.lang.Integer.valueOf(Ni));
        return Ni;
    }

    public static int b() {
        if (i95.n0.c(e42.e0.class) == null) {
            return 30000;
        }
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_xweb_video_loadcontrol_maxbufferms, 30000);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandAVABTests", "getXWebVideoMaxBufferMS, expt is %s", java.lang.Integer.valueOf(Ni));
        return Ni;
    }

    public static int c() {
        if (i95.n0.c(e42.e0.class) == null) {
            return 15000;
        }
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_xweb_video_loadcontrol_minbufferms, 15000);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandAVABTests", "getXWebVideoMinBufferDuration, expt is %s", java.lang.Integer.valueOf(Ni));
        return Ni;
    }

    public static int d() {
        int o17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("xweb_abtest_command").o("xweb_video_player_command_value", -1);
        if (-1 != o17) {
            return o17;
        }
        jz5.g gVar = mh1.b.f407823a;
        boolean z17 = true;
        if (((java.lang.Boolean) ((jz5.n) mh1.b.f407823a).mo141623x754a37bb()).booleanValue()) {
            e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
            boolean fj6 = e0Var != null ? ((h62.d) e0Var).fj(e42.d0.clicfg_android_wxa_video_sys_in_3g, true) : true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandAVABTests", "useSysPlayerIn3GUserSpace, " + fj6);
            if (fj6) {
                return 3;
            }
        }
        e42.e0 e0Var2 = (e42.e0) i95.n0.c(e42.e0.class);
        if (e0Var2 != null) {
            z17 = ((h62.d) e0Var2).fj(e42.d0.clicfg_android_xweb_video_tp, true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandAVABTests", "useThumbPlayer, expt is " + z17);
        }
        return z17 ? 5 : 4;
    }

    public static boolean e() {
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        boolean z17 = false;
        if (e0Var != null) {
            if (((h62.d) e0Var).Ni(e42.c0.clicfg_appbrand_wxeb_video_support_switch_thumbplayer_for_ua, 0) == 1) {
                z17 = true;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandAVABTests", "supportThumbPlayerSwitchUA, " + z17);
        return z17;
    }
}
