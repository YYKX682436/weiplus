package com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0;

/* loaded from: classes14.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f218782a = com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.s0.h().concat("/fdv_");

    static {
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.e.wi();
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Di("FacePro");
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Di("YTCommon");
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Di("YTAGReflectLiveCheck");
        com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.C27955x4b473500.m121211x8985d68f(true);
        com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.C27955x4b473500.m121212x77ac9eb8(true);
    }

    public r() {
        int i17 = 2;
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_face_sdk_log_level, 2);
        if (Ni >= 0 && Ni <= 5) {
            i17 = Ni;
        }
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.m120647xed871122(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "choose sdk log level:%s", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.m120648x26f6c366(new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.q(this));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(5:2|3|4|(2:6|(2:8|(2:10|(1:12))(1:41))(1:42))(1:43)|13)|(3:15|16|(1:18)(2:20|(2:22|23)(1:24)))|26|27|28|29|30|31|(3:33|34|(0)(0))(2:35|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0104, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0109, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FaceFlashManagerConfig", r0, "par config error. config:%s", r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0106, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0113 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode r20, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYtSDKKitFrameworkEventListener r21) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.r.a(com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework$YtSDKKitFrameworkWorkMode, com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework$IYtSDKKitFrameworkEventListener):boolean");
    }

    public boolean b(android.hardware.Camera camera, int i17) {
        int m121254xf3140855 = com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27959xb3654810.m121254xf3140855(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, camera, i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "YTCameraSetting  initCamera result:%s", java.lang.Integer.valueOf(m121254xf3140855));
        if (m121254xf3140855 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceFlashManagerError", "YTCommonInterface  initAuth error:%s", java.lang.Integer.valueOf(m121254xf3140855));
            return false;
        }
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKPlatformContext m120766x76565f86 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.m120758x9cf0d20b().m120766x76565f86();
        m120766x76565f86.f61788x695aadfe = camera;
        m120766x76565f86.f61789x7d672fb9 = i17;
        m120766x76565f86.f61790x3fe50cbd = com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27959xb3654810.m121251x2df20051(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, i17, 1);
        m120766x76565f86.f61787xb485b2a7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        return true;
    }

    public boolean c() {
        int b17 = com.p314xaae8f345.p3246xc10038c6.p3247x2ddda8.C27978x1f51c8.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "rel_wechat_2055-12-06.lic1.2", "", 0);
        if (b17 == 0) {
            com.p314xaae8f345.p3246xc10038c6.p3247x2ddda8.C27978x1f51c8.a();
            com.p314xaae8f345.p3246xc10038c6.p3247x2ddda8.C27978x1f51c8.m121399xd2d0c357(b17);
        } else {
            com.p314xaae8f345.p3246xc10038c6.p3247x2ddda8.C27978x1f51c8.a();
            com.p314xaae8f345.p3246xc10038c6.p3247x2ddda8.C27978x1f51c8.m121399xd2d0c357(b17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "YTCommonInterface  initAuth result:%s", java.lang.Integer.valueOf(b17));
        if (b17 == 0) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceFlashManagerError", "YTCommonInterface  initAuth error:%s", java.lang.Integer.valueOf(b17));
        return false;
    }
}
