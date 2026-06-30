package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1142xa3787f7d;

/* loaded from: classes7.dex */
public abstract class m {
    public static final boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 config, java.lang.Integer num, java.lang.String str, int i17) {
        boolean mo168058x74219ae7;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        if (config.f128817z == 7 || config.f158825e2 || !(mo168058x74219ae7 = ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7())) {
            return true;
        }
        int hd6 = ((uh4.c0) i95.n0.c(uh4.c0.class)).hd();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTeenModeUtils", "canLaunchAppBrand isTeenMode: %b, miniProgramOption: %d, serviceType: %d, isPluginApp: %b", java.lang.Boolean.valueOf(mo168058x74219ae7), java.lang.Integer.valueOf(hd6), java.lang.Integer.valueOf(config.f128817z), java.lang.Boolean.valueOf(config.f158825e2));
        if (hd6 != 0) {
            return hd6 != 2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5 z5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5.class);
        if (str == null) {
            str = "";
        }
        return z5Var.m2(str, i17);
    }
}
