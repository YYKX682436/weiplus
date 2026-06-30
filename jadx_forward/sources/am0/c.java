package am0;

/* loaded from: classes7.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f90156a = com.p314xaae8f345.mm.vfs.q7.c("PublicResource") + "/kara/so";

    public static boolean a() {
        java.lang.String str = ym.d.f544656a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Cara.CaraEnv", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
        if (ym.d.f544659d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Cara.CaraEnv", "so is already init");
            return true;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274648k) {
            if (ym.d.c() == null ? false : com.p314xaae8f345.mm.vfs.w6.j(ym.d.d())) {
                if (ym.d.f544657b) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Cara.CaraEnv", "so is downloading");
                } else {
                    java.lang.String d17 = ym.d.d();
                    if (android.text.TextUtils.isEmpty(d17)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Cara.CaraEnv", "so path empty");
                    } else if (!com.p314xaae8f345.mm.vfs.w6.j(d17)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Cara.CaraEnv", "file not exists");
                    } else if (com.p314xaae8f345.mm.vfs.w6.k(d17) == 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Cara.CaraEnv", "file length 0");
                        com.p314xaae8f345.mm.vfs.w6.h(d17);
                    } else {
                        try {
                            com.p314xaae8f345.cso.C2941xefde02d2.g(d17);
                            ym.d.f544659d = true;
                            return true;
                        } catch (java.lang.Throwable unused) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Cara.CaraEnv", "so load error! %s", d17);
                            com.p314xaae8f345.mm.vfs.w6.h(d17);
                            cn.a.a(10L);
                        }
                    }
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Cara.CaraEnv", "32bit not support");
        }
        return false;
    }
}
