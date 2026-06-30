package com.tencent.mm.modelavatar;

/* loaded from: classes11.dex */
public abstract class g {
    public static android.graphics.Bitmap a(java.lang.String str) {
        return b(str, false, -1, null);
    }

    public static android.graphics.Bitmap b(java.lang.String str, boolean z17, int i17, com.tencent.mm.modelavatar.e eVar) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !gm0.j1.b().m()) {
            return null;
        }
        if (com.tencent.mm.storage.z3.H3(str)) {
            str = com.tencent.mm.storage.z3.Y4(str);
        }
        if (c01.e2.L(str)) {
            str = "weixin";
        }
        return com.tencent.mm.modelavatar.d1.wi().f(str, z17, i17, eVar);
    }

    public static java.lang.String c(java.lang.String str, boolean z17, boolean z18) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !gm0.j1.b().m()) {
            return null;
        }
        return com.tencent.mm.storage.z3.H3(str) ? com.tencent.mm.modelavatar.d1.Ai().j(com.tencent.mm.storage.z3.Y4(str), z17) : com.tencent.mm.modelavatar.d1.Ai().j(str, z17);
    }

    public static java.lang.String d(com.tencent.mm.modelavatar.r0 r0Var, int i17) {
        if (i17 == 1) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(r0Var.c())) {
                return "hd_avatar_no_url";
            }
            return "hd_" + kk.k.g(r0Var.c().getBytes(java.nio.charset.StandardCharsets.UTF_8));
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(r0Var.d())) {
            return "small_avatar_no_url";
        }
        return "small_" + kk.k.g(r0Var.d().getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public static com.tencent.mm.modelavatar.r0 e(java.lang.String str, r45.tn4 tn4Var, com.tencent.mm.storage.z3 z3Var) {
        com.tencent.mm.modelavatar.r0 r0Var = new com.tencent.mm.modelavatar.r0();
        r0Var.f70537i = -1;
        r0Var.f70529a = str;
        r0Var.f70532d = tn4Var.U;
        r0Var.f70533e = tn4Var.T;
        com.tencent.mars.xlog.Log.i("MicroMsg.AvatarLogic", "dkhurl contact %s b[%s] s[%s], ImgFlag:%s", r0Var.e(), r0Var.c(), r0Var.d(), java.lang.Integer.valueOf(tn4Var.f386598o));
        r0Var.f70534f = tn4Var.C != 0 ? 1 : 0;
        int i17 = tn4Var.f386598o;
        if (i17 == 2) {
            r0Var.f70530b = 3;
            h(str, r0Var, "AvatarLogicModify");
        } else {
            if (i17 == 3 || i17 == 4) {
                r0Var.f70530b = i17;
            }
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_img_update_flag_no_modify_sw, 1) == 1) {
                com.tencent.mm.modelavatar.r0 n07 = com.tencent.mm.modelavatar.d1.Ni().n0(str);
                if (n07 != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AvatarLogic", "oldImgFlag smallurl:%s bigUrl:%s imgFlag:%d needUpdateFlag:%b", n07.d(), n07.c(), java.lang.Integer.valueOf(n07.f70530b), java.lang.Boolean.valueOf(n07.f70536h != 0));
                    if (tn4Var.f386598o == 1 && com.tencent.mm.sdk.platformtools.t8.K0(r0Var.d()) && com.tencent.mm.sdk.platformtools.t8.K0(r0Var.c())) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.AvatarLogic", "ImgFlag no change, also url is empty. %s", str);
                        return null;
                    }
                    if (!com.tencent.mm.sdk.platformtools.t8.D0(n07.d(), tn4Var.U) || !com.tencent.mm.sdk.platformtools.t8.D0(n07.c(), tn4Var.T)) {
                        h(str, r0Var, "AvatarLogicUrlChange");
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AvatarLogic", "ImgFlag Not Exist %s", str);
                    if (tn4Var.f386598o == 1 && com.tencent.mm.sdk.platformtools.t8.K0(r0Var.d()) && com.tencent.mm.sdk.platformtools.t8.K0(r0Var.c())) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.AvatarLogic", "ImgFlag no change, also url is empty. %s", str);
                    } else {
                        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_avatar_not_found_img_flag_update_flag, 1) == 1) {
                            h(str, r0Var, "AvatarLogicEmpty");
                        }
                    }
                }
            }
        }
        return r0Var;
    }

    public static boolean f(java.lang.String str, int i17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        com.tencent.mm.modelavatar.r0 n07 = com.tencent.mm.modelavatar.d1.Ni().n0(str);
        if (n07 != null && str.equals(n07.e()) && i17 == n07.f70530b) {
            return true;
        }
        if (n07 == null) {
            n07 = new com.tencent.mm.modelavatar.r0();
        }
        n07.f70529a = str;
        n07.f70530b = i17;
        n07.f70537i = 3;
        return com.tencent.mm.modelavatar.d1.Ni().y0(n07);
    }

    public static boolean g(java.lang.String str) {
        if (str == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AvatarLogic", "setQQAvatarImgFlag failed : invalid username");
            return false;
        }
        if (!str.endsWith("@qqim")) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AvatarLogic", "setQQAvatarImgFlag failed : invalid username");
            return false;
        }
        com.tencent.mm.modelavatar.r0 r0Var = new com.tencent.mm.modelavatar.r0();
        r0Var.f70529a = str;
        r0Var.f70530b = 3;
        r0Var.f70537i = 3;
        return com.tencent.mm.modelavatar.d1.Ni().y0(r0Var);
    }

    public static void h(java.lang.String str, com.tencent.mm.modelavatar.r0 r0Var, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || c01.z1.r().equals(str)) {
            return;
        }
        com.tencent.mm.modelavatar.d1.wi().j(str, r0Var);
    }
}
