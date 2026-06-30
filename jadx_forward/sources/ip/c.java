package ip;

/* loaded from: classes10.dex */
public abstract class c {
    public static int a() {
        try {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("InputLimitSendAppMsgEmotionBufSize"), 5242880);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("MicroMsg.BoundaryConfig", "getAppEmojiMsgMaxSize:%s", e17);
            return 5242880;
        }
    }

    public static int b() {
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_emoji_custom_max_size, 10);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BoundaryConfig", "getCustomEmojiMaxSize: %s", java.lang.Integer.valueOf(Ni));
        return Ni * 1048576;
    }

    public static int c() {
        try {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("InputLimitSendEmotionWidth"), 1024);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("MicroMsg.BoundaryConfig", "getCustomEmojiMaxWidthAndHeight:%s", e17);
            return 1024;
        }
    }

    public static int d() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("InputLimitFavText"), 100000) * 2;
    }

    public static int e() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("InputLimitSendEmotionBufSize"), 10485760);
    }

    public static java.lang.String f() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("InputLimitForbiddenChar");
    }

    public static long g() {
        try {
            java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("InputLimitFavFileSize");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BoundaryConfig", "getFileSizeLimit nullOrNil");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BoundaryConfig", "getFileSizeLimit " + d17);
            }
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(d17, com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.f56078x428b3be8);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BoundaryConfig", th6, "getMaxFavFileSize", new java.lang.Object[0]);
            return com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.f56078x428b3be8;
        }
    }

    public static long h() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("InputLimitFavNotesSize"), 1073741824L);
    }

    public static long i() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("InputLimitGroupFileTotalSize"), 1073741824L);
    }

    public static long j() {
        java.lang.String e17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().e(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2529x2ff57c.C20166x40b89da());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BoundaryConfig", "MaxSendBigFileSize, svrLimit:%s, localLimit:%s", e17, 10737418240L);
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(e17, 10737418240L);
    }

    public static long k() {
        java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("InputLimitSendFileSize");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BoundaryConfig", "MaxSendFileSize, svrLimit:%s, localLimit:%s", d17, 1073741824L);
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(d17, 1073741824L);
    }

    public static long l() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("InputLimitVideoSize"), 26214400L);
    }

    public static int m() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SnsCommentMaxSize"), 1000) * 2;
    }

    public static int n() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("InputLimitSNSObjectText"), 2000) * 2;
    }
}
