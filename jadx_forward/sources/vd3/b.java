package vd3;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f517590a = jz5.h.b(vd3.a.f517589d);

    public final java.util.HashMap a() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        bf3.x0 x0Var = bf3.x0.f101207a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        android.graphics.Point a17 = x0Var.a(context);
        android.graphics.Point point = new android.graphics.Point();
        java.lang.Object systemService = context.getSystemService("window");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        android.view.WindowManager windowManager = (android.view.WindowManager) systemService;
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            android.view.WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            point.x = currentWindowMetrics.getBounds().width();
            point.y = currentWindowMetrics.getBounds().height();
        } else {
            windowManager.getDefaultDisplay().getSize(point);
        }
        int b17 = a06.d.b(java.lang.Integer.valueOf(a17.x).floatValue() / ((java.lang.Number) ((jz5.n) this.f517590a).mo141623x754a37bb()).floatValue());
        int b18 = a06.d.b(java.lang.Integer.valueOf(a17.y).floatValue() / ((java.lang.Number) ((jz5.n) this.f517590a).mo141623x754a37bb()).floatValue());
        int b19 = a06.d.b(java.lang.Integer.valueOf(point.y).floatValue() / ((java.lang.Number) ((jz5.n) this.f517590a).mo141623x754a37bb()).floatValue());
        jz5.l[] lVarArr = new jz5.l[17];
        lVarArr[0] = new jz5.l("platform", com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f);
        bf3.p0 p0Var = bf3.p0.f101178a;
        java.lang.Object mo141623x754a37bb = ((jz5.n) bf3.p0.f101182e).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        lVarArr[1] = new jz5.l("brand", (java.lang.String) mo141623x754a37bb);
        java.lang.Object mo141623x754a37bb2 = ((jz5.n) bf3.p0.f101183f).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
        lVarArr[2] = new jz5.l("model", (java.lang.String) mo141623x754a37bb2);
        lVarArr[3] = new jz5.l("pixelRatio", java.lang.Float.valueOf(((java.lang.Number) ((jz5.n) this.f517590a).mo141623x754a37bb()).floatValue()));
        java.lang.Object mo141623x754a37bb3 = ((jz5.n) bf3.p0.f101184g).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb3, "getValue(...)");
        lVarArr[4] = new jz5.l(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37655xccbf8c68, (java.lang.String) mo141623x754a37bb3);
        java.lang.Object mo141623x754a37bb4 = ((jz5.n) bf3.p0.f101185h).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb4, "getValue(...)");
        lVarArr[5] = new jz5.l("version", (java.lang.String) mo141623x754a37bb4);
        lVarArr[6] = new jz5.l("fontSizeSetting", java.lang.Integer.valueOf(((java.lang.Number) ((jz5.n) bf3.p0.f101179b).mo141623x754a37bb()).intValue()));
        lVarArr[7] = new jz5.l("fontSizeScaleFactor", java.lang.Float.valueOf(((java.lang.Number) ((jz5.n) bf3.p0.f101180c).mo141623x754a37bb()).floatValue()));
        lVarArr[8] = new jz5.l("screenWidth", java.lang.Integer.valueOf(b17));
        lVarArr[9] = new jz5.l("screenHeight", java.lang.Integer.valueOf(b18));
        lVarArr[10] = new jz5.l("screenHeightWithNavigationBar", java.lang.Integer.valueOf(b19));
        lVarArr[11] = new jz5.l("windowWidth", java.lang.Integer.valueOf(b17));
        lVarArr[12] = new jz5.l("windowHeight", java.lang.Integer.valueOf(b18));
        lVarArr[13] = new jz5.l("system", "Android " + android.os.Build.VERSION.RELEASE);
        lVarArr[14] = new jz5.l("theme", com.p314xaae8f345.mm.ui.bk.C() ? "dark" : "light");
        int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getConfiguration().orientation;
        lVarArr[15] = new jz5.l("deviceOrientation", i17 != 1 ? i17 != 2 ? "" : "landscape" : "portrait");
        uh4.c0 c0Var = (uh4.c0) i95.n0.c(uh4.c0.class);
        lVarArr[16] = new jz5.l("isTeenMode", java.lang.Boolean.valueOf(c0Var != null ? c0Var.mo168058x74219ae7() : false));
        java.util.HashMap i18 = kz5.c1.i(lVarArr);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBGetSystemInfoImpl", "systemInfo: " + i18);
        return i18;
    }
}
