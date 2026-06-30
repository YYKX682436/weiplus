package a92;

/* loaded from: classes12.dex */
public class b implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: e, reason: collision with root package name */
    public static a92.b f83947e;

    /* renamed from: f, reason: collision with root package name */
    public static volatile boolean f83948f;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f83949d;

    public b(android.content.Context context) {
        this.f83949d = context;
    }

    public static a92.b b() {
        a92.b bVar = f83947e;
        if (bVar != null) {
            return bVar;
        }
        synchronized (a92.b.class) {
            a92.b bVar2 = f83947e;
            if (bVar2 != null) {
                return bVar2;
            }
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            if (context == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FCM.FcmRegister", "FCM appcontext null");
                return null;
            }
            a92.b bVar3 = new a92.b(context);
            f83947e = bVar3;
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FCM.FcmRegister", "register token to svr");
        jx3.f fVar = jx3.f.INSTANCE;
        fVar.mo68477x336bdfd8(901L, 11L, 1L, false);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(newToken)) {
            fVar.mo68477x336bdfd8(901L, 13L, 1L, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FCM.FcmRegister", "token is null, fail reg");
            return;
        }
        jz5.g gVar = a92.f.f83953a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newToken, "newToken");
        java.lang.String b17 = a92.f.b();
        jz5.g gVar2 = a92.f.f83953a;
        long j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getLong("fcm_curr_reg_time", 0L);
        boolean z17 = !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(newToken, b17);
        if (j17 > 0 && !android.text.TextUtils.isEmpty(b17)) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FCM.FcmTokenManager", "onFcmTokenRefresh: " + b17 + ">>" + newToken + ", durationMs=" + currentTimeMillis);
            if (((java.lang.Boolean) ((jz5.n) a92.f.f83954b).mo141623x754a37bb()).booleanValue()) {
                java.lang.Throwable th6 = new java.lang.Throwable();
                java.lang.String[] strArr = new java.lang.String[3];
                strArr[0] = "FcmTokenRefresh";
                strArr[1] = z17 ? "1" : "0";
                strArr[2] = java.lang.String.valueOf(java.util.concurrent.TimeUnit.MILLISECONDS.toMinutes(currentTimeMillis));
                ap.a.a(10000, "CompatProfiler", th6, null, strArr);
            }
        }
        if (!z17) {
            fVar.mo68477x336bdfd8(901L, 12L, 1L, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FCM.FcmRegister", "have registered yet.");
            return;
        }
        a92.g gVar3 = new a92.g(newToken);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(216, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.g(gVar3);
        fVar.mo68477x336bdfd8(901L, 14L, 1L, false);
    }

    public void d(java.lang.String str) {
        jx3.f fVar = jx3.f.INSTANCE;
        fVar.mo68477x336bdfd8(901L, 18L, 1L, false);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            fVar.mo68477x336bdfd8(901L, 19L, 1L, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FCM.FcmRegister", "unreg fail, token is null");
            return;
        }
        jz5.g gVar = a92.f.f83953a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FCM.FcmTokenManager", "clearCurrRegFcmToken");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().remove("fcm_curr_reg_token");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().remove("fcm_curr_reg_time");
        a92.h hVar = new a92.h(str);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m9.f34451x366c91de, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.g(hVar);
        fVar.mo68477x336bdfd8(901L, 21L, 1L, false);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var == null) {
            return;
        }
        if (m1Var instanceof a92.g) {
            gm0.j1.i();
            a92.g gVar = (a92.g) m1Var;
            gm0.j1.n().f354821b.a(216, this);
            if (i17 == 0 && i18 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FCM.FcmRegister", "NetSceneFcmReg success.");
                jx3.f.INSTANCE.mo68477x336bdfd8(901L, 16L, 1L, false);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FCM.FcmRegister", "NetSceneFcmReg faild.");
                jx3.f.INSTANCE.mo68477x336bdfd8(901L, 17L, 1L, false);
            }
            a92.f.c(((r45.u7) gVar.f83956d.f152243a.f152217a).f468628d);
            return;
        }
        if (m1Var instanceof a92.h) {
            gm0.j1.i();
            gm0.j1.n().f354821b.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m9.f34451x366c91de, this);
            if (i17 == 0 && i18 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FCM.FcmRegister", "NetSceneFcmUnreg success.");
                jx3.f.INSTANCE.mo68477x336bdfd8(901L, 23L, 1L, false);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FCM.FcmRegister", "NetSceneFcmUnreg faild.");
                jx3.f.INSTANCE.mo68477x336bdfd8(901L, 24L, 1L, false);
            }
            jz5.g gVar2 = a92.f.f83953a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FCM.FcmTokenManager", "clearCurrRegFcmToken");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().remove("fcm_curr_reg_token");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().remove("fcm_curr_reg_time");
        }
    }
}
