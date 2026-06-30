package com.tencent.mm.booter;

/* loaded from: classes7.dex */
public class p0 {

    /* renamed from: a, reason: collision with root package name */
    public android.net.NetworkInfo f63544a = null;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f63545b = null;

    public final java.lang.String a() {
        try {
            java.util.Enumeration<java.net.NetworkInterface> networkInterfaces = java.net.NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                java.net.NetworkInterface nextElement = networkInterfaces.nextElement();
                if (nextElement.isUp() && !nextElement.isLoopback() && nextElement.getName().startsWith("wlan")) {
                    java.util.Enumeration<java.net.InetAddress> inetAddresses = nextElement.getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        java.net.InetAddress nextElement2 = inetAddresses.nextElement();
                        if ((nextElement2 instanceof java.net.Inet4Address) || (nextElement2 instanceof java.net.Inet6Address)) {
                            if (!nextElement2.isLinkLocalAddress()) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.NetworkChangeMgr", "getWiFiIpAddress: %s", nextElement2.getHostAddress());
                                return nextElement2.getHostAddress();
                            }
                        }
                    }
                }
            }
        } catch (java.net.SocketException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetworkChangeMgr", e17, "", new java.lang.Object[0]);
        }
        return "";
    }
}
