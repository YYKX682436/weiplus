package sy1;

/* loaded from: classes13.dex */
public class d implements ly1.b {

    /* renamed from: a, reason: collision with root package name */
    public long f495371a;

    /* renamed from: b, reason: collision with root package name */
    public int f495372b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f495373c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f495374d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f495375e;

    public void a(java.util.Map map) {
        java.lang.Object l17;
        java.lang.String str;
        java.lang.String str2;
        if (map == null) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - this.f495371a >= 60000) {
            this.f495372b = sz1.a.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            try {
                if (gm0.j1.a() && !u46.l.e(wo.w0.c())) {
                    java.util.Enumeration<java.net.NetworkInterface> networkInterfaces = java.net.NetworkInterface.getNetworkInterfaces();
                    loop0: while (networkInterfaces.hasMoreElements()) {
                        java.net.NetworkInterface nextElement = networkInterfaces.nextElement();
                        if (!nextElement.isLoopback() && !nextElement.isVirtual()) {
                            java.util.Enumeration<java.net.InetAddress> inetAddresses = nextElement.getInetAddresses();
                            while (inetAddresses.hasMoreElements()) {
                                java.net.InetAddress nextElement2 = inetAddresses.nextElement();
                                if ((nextElement2 instanceof java.net.Inet4Address) && !nextElement2.equals(java.net.InetAddress.getLocalHost())) {
                                    str = nextElement2.getHostAddress();
                                    break loop0;
                                }
                            }
                        }
                    }
                }
            } catch (java.net.SocketException | java.net.UnknownHostException | java.lang.Exception unused) {
            }
            str = null;
            this.f495373c = str;
            try {
                if (gm0.j1.a() && !u46.l.e(wo.w0.c())) {
                    java.util.Enumeration<java.net.NetworkInterface> networkInterfaces2 = java.net.NetworkInterface.getNetworkInterfaces();
                    loop2: while (networkInterfaces2.hasMoreElements()) {
                        java.net.NetworkInterface nextElement3 = networkInterfaces2.nextElement();
                        if (!nextElement3.isLoopback() && !nextElement3.isVirtual()) {
                            java.util.Enumeration<java.net.InetAddress> inetAddresses2 = nextElement3.getInetAddresses();
                            while (inetAddresses2.hasMoreElements()) {
                                java.net.InetAddress nextElement4 = inetAddresses2.nextElement();
                                if (nextElement4 instanceof java.net.Inet6Address) {
                                    str2 = nextElement4.getHostAddress();
                                    break loop2;
                                }
                            }
                        }
                    }
                }
            } catch (java.net.SocketException | java.lang.Exception unused2) {
            }
            str2 = null;
            this.f495374d = str2;
            this.f495371a = currentTimeMillis;
        }
        map.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52918x89383abf, java.lang.Integer.valueOf(this.f495372b));
        map.put("mode_flag", java.lang.Integer.valueOf(sz1.a.d()));
        map.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52909x9bfe27d4, o45.wf.f424558c);
        map.put("device_brand", o45.wf.f424557b);
        map.put("os_name", o45.wf.f424560e);
        map.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52919x5302ea51, wo.q.f529318f);
        map.put("ipv4", this.f495373c);
        map.put("ipv6", this.f495374d);
        if (this.f495375e == null && gm0.j1.a() && (l17 = gm0.j1.u().c().l(274436, null)) != null && (l17 instanceof java.lang.String)) {
            java.lang.String str3 = (java.lang.String) l17;
            if (!android.text.TextUtils.isEmpty(str3)) {
                this.f495375e = str3;
            }
        }
        map.put("regcountry", this.f495375e);
    }
}
