package am0;

/* loaded from: classes7.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f8623a = com.tencent.mm.vfs.q7.c("PublicResource") + "/kara/so";

    public static boolean a() {
        java.lang.String str = ym.d.f463123a;
        com.tencent.mars.xlog.Log.i("Cara.CaraEnv", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        if (ym.d.f463126d) {
            com.tencent.mars.xlog.Log.i("Cara.CaraEnv", "so is already init");
            return true;
        }
        if (com.tencent.mm.sdk.platformtools.z.f193115k) {
            if (ym.d.c() == null ? false : com.tencent.mm.vfs.w6.j(ym.d.d())) {
                if (ym.d.f463124b) {
                    com.tencent.mars.xlog.Log.i("Cara.CaraEnv", "so is downloading");
                } else {
                    java.lang.String d17 = ym.d.d();
                    if (android.text.TextUtils.isEmpty(d17)) {
                        com.tencent.mars.xlog.Log.i("Cara.CaraEnv", "so path empty");
                    } else if (!com.tencent.mm.vfs.w6.j(d17)) {
                        com.tencent.mars.xlog.Log.i("Cara.CaraEnv", "file not exists");
                    } else if (com.tencent.mm.vfs.w6.k(d17) == 0) {
                        com.tencent.mars.xlog.Log.i("Cara.CaraEnv", "file length 0");
                        com.tencent.mm.vfs.w6.h(d17);
                    } else {
                        try {
                            com.tencent.cso.CsoLoader.g(d17);
                            ym.d.f463126d = true;
                            return true;
                        } catch (java.lang.Throwable unused) {
                            com.tencent.mars.xlog.Log.i("Cara.CaraEnv", "so load error! %s", d17);
                            com.tencent.mm.vfs.w6.h(d17);
                            cn.a.a(10L);
                        }
                    }
                }
            }
        } else {
            com.tencent.mars.xlog.Log.i("Cara.CaraEnv", "32bit not support");
        }
        return false;
    }
}
