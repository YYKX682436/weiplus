package lx3;

/* loaded from: classes8.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f403614a = bm5.f1.a().replace(":", "").replace(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, "") + "heavy_user_id_mapping.dat";

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Object f403615b = new java.lang.Object();

    public f(lx3.e eVar) {
    }

    public final r45.gw3 a() {
        java.lang.String str;
        byte[] N;
        synchronized (f403615b) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(com.p314xaae8f345.mm.p2621x8fb0427b.v3.f277806a);
            str = f403614a;
            sb6.append(str);
            N = com.p314xaae8f345.mm.vfs.w6.N(sb6.toString(), 0, -1);
        }
        if (N == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.HeavyUserIDMappingStg", "get file content fail, filename" + str);
            return null;
        }
        r45.gw3 gw3Var = new r45.gw3();
        try {
            gw3Var.mo11468x92b714fd(N);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HeavyUserIDMappingStg", "svr_version:" + gw3Var.f457091d + ", ret:" + gw3Var.f457093f + ", size: " + gw3Var.f457092e.size());
            return gw3Var;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.HeavyUserIDMappingStg", th6, "", new java.lang.Object[0]);
            return null;
        }
    }

    public final int b(int i17) {
        r45.gw3 a17 = a();
        if (a17 == null) {
            return 0;
        }
        int i18 = a17.f457091d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HeavyUserIDMappingStg", "version:" + i18);
        return i18;
    }

    public void c(r45.gw3 gw3Var, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HeavyUserIDMappingStg", "saveIDMapping, channel:" + i17);
        if (gw3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.HeavyUserIDMappingStg", "HeavyUserRespInfo is null");
            return;
        }
        if (gw3Var.f457093f != 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("heavyUserRespInfo.RespType Unnormal, type:");
            int i18 = gw3Var.f457093f;
            sb6.append(1 == i18 ? "服务器过载" : 2 == i18 ? "服务器没有配置表" : 3 == i18 ? "服务器配置表错误" : "非法的错误类型");
            sb6.append(",version:");
            sb6.append(gw3Var.f457091d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HeavyUserIDMappingStg", sb6.toString());
            return;
        }
        int b17 = b(i17);
        int i19 = gw3Var.f457091d;
        if (b17 == i19) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HeavyUserIDMappingStg", "version changed, client:" + b(i17) + ", svr:" + i19);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HeavyUserIDMappingStg", "svr_version:" + gw3Var.f457091d + ", ret:" + gw3Var.f457093f + ", size: " + gw3Var.f457092e.size());
        try {
            byte[] mo14344x5f01b1f6 = gw3Var.mo14344x5f01b1f6();
            synchronized (f403615b) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HeavyUserIDMappingStg", "new version:" + gw3Var.f457091d);
                com.p314xaae8f345.mm.vfs.w6.a(com.p314xaae8f345.mm.p2621x8fb0427b.v3.f277806a + f403614a, mo14344x5f01b1f6);
            }
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.HeavyUserIDMappingStg", e17, "", new java.lang.Object[0]);
        }
    }
}
