package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes7.dex */
public class p0 {

    /* renamed from: a, reason: collision with root package name */
    public android.net.NetworkInfo f145077a = null;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f145078b = null;

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
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetworkChangeMgr", "getWiFiIpAddress: %s", nextElement2.getHostAddress());
                                return nextElement2.getHostAddress();
                            }
                        }
                    }
                }
            }
        } catch (java.net.SocketException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetworkChangeMgr", e17, "", new java.lang.Object[0]);
        }
        return "";
    }
}
