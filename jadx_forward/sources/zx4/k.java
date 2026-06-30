package zx4;

/* loaded from: classes7.dex */
public final class k extends android.os.FileObserver {

    /* renamed from: e, reason: collision with root package name */
    public static final zx4.j f558688e = new zx4.j(null);

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f558689a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f558690b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f558691c;

    /* renamed from: d, reason: collision with root package name */
    public final zx4.e f558692d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(java.lang.String dirPath, zx4.e listener) {
        super(dirPath, 200);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dirPath, "dirPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f558691c = dirPath;
        this.f558692d = listener;
    }

    @Override // android.os.FileObserver
    public void onEvent(int i17, java.lang.String str) {
        if (str == null) {
            return;
        }
        java.lang.String path = this.f558691c + str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebView.ScreenshotFileObserver", "onEvent, event: " + i17 + ", takenPath: " + path);
        zx4.e eVar = this.f558692d;
        if (i17 == 8) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f558689a, path)) {
                return;
            }
            ((zx4.s) eVar).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WebviewScreenShotHelper", "onScreenshotTaken, path: ".concat(path));
            this.f558689a = path;
            return;
        }
        if (i17 == 64) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f558689a, path)) {
                this.f558690b = true;
                return;
            }
            return;
        }
        if (i17 == 128 && this.f558690b) {
            this.f558690b = false;
            java.lang.String str2 = this.f558689a;
            if (str2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebView.ScreenshotFileObserver", "onEvent, fromPath is null");
                return;
            }
            ((zx4.s) eVar).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "toPath");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WebviewScreenShotHelper", "onScreenshotMove, fromPath: " + str2 + ", toPath: " + path);
            qk.r6 r6Var = (qk.r6) i95.n0.c(qk.r6.class);
            if (!(r6Var != null && ((qv.s) r6Var).Ai())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WebviewScreenShotHelper", "onScreenshotMove, switch closed.");
                return;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.r1 mj6 = r01.q3.mj();
            mj6.getClass();
            l75.k0 db6 = mj6.f276796d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.k4 k4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.k4(db6, db6.b(), null);
            try {
                com.p314xaae8f345.mm.p2621x8fb0427b.p1 y07 = mj6.y0(str2);
                if (y07 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizScreenshotInfoStorage", "updateOnScreenshotMove, query for " + str2 + " fail");
                } else if (mj6.mo9951xb06685ab(y07, new java.lang.String[0])) {
                    y07.f67192x90a2b490 = path;
                    y07.f67193x90a4a338 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
                    boolean mo880xb970c2b9 = mj6.mo880xb970c2b9(y07);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateOnScreenshotMove, insert for ");
                    sb6.append(path);
                    sb6.append(' ');
                    sb6.append(mo880xb970c2b9 ? ya.b.f77504xbb80cbe3 : "fail");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizScreenshotInfoStorage", sb6.toString());
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizScreenshotInfoStorage", "updateOnScreenshotMove, delete for " + str2 + " fail");
                }
                wz5.a.a(k4Var, null);
            } catch (java.lang.Throwable th6) {
                try {
                    throw th6;
                } catch (java.lang.Throwable th7) {
                    wz5.a.a(k4Var, th6);
                    throw th7;
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(java.io.File file, zx4.e listener) {
        super(file, 200);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(file, "file");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f558691c = file.getAbsolutePath() + java.io.File.separator;
        this.f558692d = listener;
    }
}
