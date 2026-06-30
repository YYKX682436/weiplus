package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

@j95.b
/* loaded from: classes.dex */
public class r2 extends i95.w implements af1.n0 {
    @Override // af1.n0
    public int zh() {
        boolean z17;
        int i17 = 0;
        if (z65.c.a()) {
            z17 = true;
        } else {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            z17 = false;
        }
        int i18 = z17 ? 2 : 0;
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        if (e0Var != null) {
            i18 = ((h62.d) e0Var).Ni(e42.d0.clicfg_android_wxa_video_fix_notify_error, i18);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandAVABTests", "notifyErrorWorkaroundChannel, expt is " + i18);
        }
        java.lang.Boolean valueOf = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("xweb_abtest_command").contains("video_fix_notify_error_command_value") ? java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("xweb_abtest_command").getBoolean("video_fix_notify_error_command_value", false)) : null;
        if (valueOf == null) {
            i17 = i18;
        } else if (valueOf.booleanValue()) {
            i17 = 2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandAVABTests", "notifyErrorWorkaroundChannel: " + i17);
        return i17;
    }
}
