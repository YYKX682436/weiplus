package a92;

/* loaded from: classes12.dex */
public class b implements com.tencent.mm.modelbase.u0 {

    /* renamed from: e, reason: collision with root package name */
    public static a92.b f2414e;

    /* renamed from: f, reason: collision with root package name */
    public static volatile boolean f2415f;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f2416d;

    public b(android.content.Context context) {
        this.f2416d = context;
    }

    public static a92.b b() {
        a92.b bVar = f2414e;
        if (bVar != null) {
            return bVar;
        }
        synchronized (a92.b.class) {
            a92.b bVar2 = f2414e;
            if (bVar2 != null) {
                return bVar2;
            }
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            if (context == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FCM.FcmRegister", "FCM appcontext null");
                return null;
            }
            a92.b bVar3 = new a92.b(context);
            f2414e = bVar3;
            return bVar3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            Method dump skipped, instructions count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a92.b.a():void");
    }

    public void c(java.lang.String newToken) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FCM.FcmRegister", "register token to svr");
        jx3.f fVar = jx3.f.INSTANCE;
        fVar.idkeyStat(901L, 11L, 1L, false);
        if (com.tencent.mm.sdk.platformtools.t8.K0(newToken)) {
            fVar.idkeyStat(901L, 13L, 1L, false);
            com.tencent.mars.xlog.Log.e("MicroMsg.FCM.FcmRegister", "token is null, fail reg");
            return;
        }
        jz5.g gVar = a92.f.f2420a;
        kotlin.jvm.internal.o.g(newToken, "newToken");
        java.lang.String b17 = a92.f.b();
        jz5.g gVar2 = a92.f.f2420a;
        long j17 = com.tencent.mm.sdk.platformtools.o4.L().getLong("fcm_curr_reg_time", 0L);
        boolean z17 = !kotlin.jvm.internal.o.b(newToken, b17);
        if (j17 > 0 && !android.text.TextUtils.isEmpty(b17)) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
            com.tencent.mars.xlog.Log.i("MicroMsg.FCM.FcmTokenManager", "onFcmTokenRefresh: " + b17 + ">>" + newToken + ", durationMs=" + currentTimeMillis);
            if (((java.lang.Boolean) ((jz5.n) a92.f.f2421b).getValue()).booleanValue()) {
                java.lang.Throwable th6 = new java.lang.Throwable();
                java.lang.String[] strArr = new java.lang.String[3];
                strArr[0] = "FcmTokenRefresh";
                strArr[1] = z17 ? "1" : "0";
                strArr[2] = java.lang.String.valueOf(java.util.concurrent.TimeUnit.MILLISECONDS.toMinutes(currentTimeMillis));
                ap.a.a(10000, "CompatProfiler", th6, null, strArr);
            }
        }
        if (!z17) {
            fVar.idkeyStat(901L, 12L, 1L, false);
            com.tencent.mars.xlog.Log.w("MicroMsg.FCM.FcmRegister", "have registered yet.");
            return;
        }
        a92.g gVar3 = new a92.g(newToken);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(216, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.g(gVar3);
        fVar.idkeyStat(901L, 14L, 1L, false);
    }

    public void d(java.lang.String str) {
        jx3.f fVar = jx3.f.INSTANCE;
        fVar.idkeyStat(901L, 18L, 1L, false);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            fVar.idkeyStat(901L, 19L, 1L, false);
            com.tencent.mars.xlog.Log.w("MicroMsg.FCM.FcmRegister", "unreg fail, token is null");
            return;
        }
        jz5.g gVar = a92.f.f2420a;
        com.tencent.mars.xlog.Log.i("MicroMsg.FCM.FcmTokenManager", "clearCurrRegFcmToken");
        com.tencent.mm.sdk.platformtools.o4.L().remove("fcm_curr_reg_token");
        com.tencent.mm.sdk.platformtools.o4.L().remove("fcm_curr_reg_time");
        a92.h hVar = new a92.h(str);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(com.tencent.mm.plugin.appbrand.jsapi.m9.CTRL_INDEX, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.g(hVar);
        fVar.idkeyStat(901L, 21L, 1L, false);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var == null) {
            return;
        }
        if (m1Var instanceof a92.g) {
            gm0.j1.i();
            a92.g gVar = (a92.g) m1Var;
            gm0.j1.n().f273288b.a(216, this);
            if (i17 == 0 && i18 == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FCM.FcmRegister", "NetSceneFcmReg success.");
                jx3.f.INSTANCE.idkeyStat(901L, 16L, 1L, false);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.FCM.FcmRegister", "NetSceneFcmReg faild.");
                jx3.f.INSTANCE.idkeyStat(901L, 17L, 1L, false);
            }
            a92.f.c(((r45.u7) gVar.f2423d.f70710a.f70684a).f387095d);
            return;
        }
        if (m1Var instanceof a92.h) {
            gm0.j1.i();
            gm0.j1.n().f273288b.a(com.tencent.mm.plugin.appbrand.jsapi.m9.CTRL_INDEX, this);
            if (i17 == 0 && i18 == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FCM.FcmRegister", "NetSceneFcmUnreg success.");
                jx3.f.INSTANCE.idkeyStat(901L, 23L, 1L, false);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.FCM.FcmRegister", "NetSceneFcmUnreg faild.");
                jx3.f.INSTANCE.idkeyStat(901L, 24L, 1L, false);
            }
            jz5.g gVar2 = a92.f.f2420a;
            com.tencent.mars.xlog.Log.i("MicroMsg.FCM.FcmTokenManager", "clearCurrRegFcmToken");
            com.tencent.mm.sdk.platformtools.o4.L().remove("fcm_curr_reg_token");
            com.tencent.mm.sdk.platformtools.o4.L().remove("fcm_curr_reg_time");
        }
    }
}
