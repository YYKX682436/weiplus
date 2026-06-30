package nf;

/* loaded from: classes7.dex */
public abstract class s {
    public static java.lang.String a() {
        int i17;
        try {
            i17 = wo.p1.a();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.LuggageNetUtil", "getSelfIp, call NetworkDetailInfo.getNetType(), exp = %s", e17);
            i17 = 0;
        }
        if (i17 == 0) {
            return "127.0.0.1";
        }
        if (i17 == 1) {
            return b();
        }
        try {
            java.util.Enumeration<java.net.NetworkInterface> networkInterfaces = java.net.NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                java.net.NetworkInterface nextElement = networkInterfaces.nextElement();
                if (nextElement != null) {
                    java.util.Enumeration<java.net.InetAddress> inetAddresses = nextElement.getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        java.net.InetAddress nextElement2 = inetAddresses.nextElement();
                        if (nextElement2 != null && !nextElement2.isLoopbackAddress() && (nextElement2 instanceof java.net.Inet4Address)) {
                            return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(nextElement2.getHostAddress()) ? "127.0.0.1" : nextElement2.getHostAddress();
                        }
                    }
                }
            }
            return "127.0.0.1";
        } catch (java.lang.Exception unused) {
            return "127.0.0.1";
        }
    }

    public static java.lang.String b() {
        int g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.v0.f274560a.g(false);
        return g17 == 0 ? "127.0.0.1" : java.lang.String.format("%d.%d.%d.%d", java.lang.Integer.valueOf(g17 & 255), java.lang.Integer.valueOf((g17 >> 8) & 255), java.lang.Integer.valueOf((g17 >> 16) & 255), java.lang.Integer.valueOf((g17 >> 24) & 255));
    }
}
