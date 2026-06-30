package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public abstract class vf {

    /* renamed from: a, reason: collision with root package name */
    public static final uh1.p0 f90861a = new com.tencent.mm.plugin.appbrand.pf();

    /* renamed from: b, reason: collision with root package name */
    public static final uh1.p0 f90862b = new com.tencent.mm.plugin.appbrand.qf();

    /* renamed from: c, reason: collision with root package name */
    public static final uh1.o f90863c = new com.tencent.mm.plugin.appbrand.rf();

    /* renamed from: d, reason: collision with root package name */
    public static final uh1.o f90864d = new com.tencent.mm.plugin.appbrand.sf();

    /* renamed from: e, reason: collision with root package name */
    public static final uh1.e f90865e = new com.tencent.mm.plugin.appbrand.tf();

    /* renamed from: f, reason: collision with root package name */
    public static final uh1.d0 f90866f = new com.tencent.mm.plugin.appbrand.uf();

    public static boolean a(int i17) {
        java.lang.Boolean c17 = c(i17);
        if (c17 != null) {
            boolean booleanValue = c17.booleanValue();
            com.tencent.mars.xlog.Log.i("MicroMsg.WcWssSwitchLogic", "isABTestOpen commandResult type:%d,flag: %b", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(booleanValue));
            return booleanValue;
        }
        boolean z17 = true;
        if (i17 == 1 && !com.tencent.mm.plugin.appbrand.networking.j0.f86092a.b()) {
            z17 = false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WcWssSwitchLogic", "isABTestOpen type:%d,flag: %b", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        return z17;
    }

    public static boolean b(int i17) {
        java.lang.Boolean c17 = c(i17);
        if (c17 != null) {
            boolean booleanValue = c17.booleanValue();
            com.tencent.mars.xlog.Log.i("MicroMsg.WcWssSwitchLogic", "isGameABTestOpen commandResult type:%d,flag: %b", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(booleanValue));
            return booleanValue;
        }
        boolean z17 = true;
        if (i17 == 1 && !com.tencent.mm.plugin.appbrand.networking.j0.f86092a.b()) {
            z17 = false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WcWssSwitchLogic", "isGameABTestOpen type:%d,flag: %b", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        return z17;
    }

    public static java.lang.Boolean c(int i17) {
        if (i17 == 1) {
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.i().getString("appbrandgame_open_wcwss", "");
            if (string != null && string.equalsIgnoreCase("wcwss")) {
                return java.lang.Boolean.TRUE;
            }
            if (string == null || !string.equalsIgnoreCase("websocket")) {
                return null;
            }
            return java.lang.Boolean.FALSE;
        }
        if (i17 == 2) {
            java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.i().getString("appbrandgame_open_cdnrequest", "");
            if (string2 != null && string2.equalsIgnoreCase("chromium")) {
                return java.lang.Boolean.TRUE;
            }
            if (string2 == null || !string2.equalsIgnoreCase("request")) {
                return null;
            }
            return java.lang.Boolean.FALSE;
        }
        if (i17 == 3) {
            java.lang.String string3 = com.tencent.mm.sdk.platformtools.x2.i().getString("appbrandgame_open_cronetdownload", "");
            if (string3 != null && string3.equalsIgnoreCase("open")) {
                return java.lang.Boolean.TRUE;
            }
            if (string3 == null || !string3.equalsIgnoreCase("close")) {
                return null;
            }
            return java.lang.Boolean.FALSE;
        }
        if (i17 != 5) {
            return null;
        }
        java.lang.String string4 = com.tencent.mm.sdk.platformtools.x2.i().getString("appbrandgame_open_cronetupload", "");
        if (string4 != null && string4.equalsIgnoreCase("open")) {
            return java.lang.Boolean.TRUE;
        }
        if (string4 == null || !string4.equalsIgnoreCase("close")) {
            return null;
        }
        return java.lang.Boolean.FALSE;
    }
}
