package lp;

/* loaded from: classes4.dex */
public class t implements q25.a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f401777a = 0;

    static {
        q25.b.b(new lp.t(), "//warpgate");
    }

    @Override // q25.a
    public boolean a(android.content.Context context, java.lang.String[] strArr, java.lang.String str) {
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() > 1) {
            return false;
        }
        if (strArr.length < 2) {
            return true;
        }
        java.lang.String str2 = strArr[1];
        str2.getClass();
        char c17 = 65535;
        switch (str2.hashCode()) {
            case 3551:
                if (str2.equals("on")) {
                    c17 = 0;
                    break;
                }
                break;
            case 109935:
                if (str2.equals("off")) {
                    c17 = 1;
                    break;
                }
                break;
            case 3540994:
                if (str2.equals("stop")) {
                    c17 = 2;
                    break;
                }
                break;
            case 109757538:
                if (str2.equals("start")) {
                    c17 = 3;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                boolean z17 = x51.o1.f533575a;
                break;
            case 1:
                boolean z18 = x51.o1.f533575a;
                break;
            case 2:
                try {
                    java.lang.Class.forName("com.tencent.mm.plugin.sl_warpgate.server.WarpGateHttpServer").getMethod("stopServer", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                    dp.a.m125854x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "stop server", 1).show();
                    break;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WarpgateCommand", e17, "", new java.lang.Object[0]);
                    break;
                }
            case 3:
                int P = strArr.length >= 3 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[2], 8888) : 8888;
                try {
                    java.lang.Class.forName("com.tencent.mm.plugin.sl_warpgate.server.WarpGateHttpServer").getMethod("startServer", java.lang.Integer.TYPE).invoke(null, java.lang.Integer.valueOf(P));
                    dp.a.m125854x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "start server on " + P, 1).show();
                    break;
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WarpgateCommand", e18, "", new java.lang.Object[0]);
                    break;
                }
        }
        return true;
    }
}
