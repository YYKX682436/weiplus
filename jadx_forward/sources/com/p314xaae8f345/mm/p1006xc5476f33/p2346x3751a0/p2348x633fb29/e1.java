package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29;

/* loaded from: classes13.dex */
public class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f257999d;

    /* renamed from: e, reason: collision with root package name */
    public int f258000e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f258001f = 0;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d1 f258002g;

    public e1(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var, com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.q0 q0Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        byte[] address;
        java.lang.String defaultHost = android.net.Proxy.getDefaultHost();
        int defaultPort = android.net.Proxy.getDefaultPort();
        if (defaultHost != null && defaultHost.length() > 0 && defaultPort > 0) {
            this.f257999d = 1;
            this.f258000e = defaultPort;
            try {
                try {
                    address = java.net.InetAddress.getByName(java.net.InetAddress.getByName(defaultHost).getHostAddress()).getAddress();
                } catch (java.net.UnknownHostException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VoipHelper", e17, "", new java.lang.Object[0]);
                }
                if (address != null) {
                    i17 = 0;
                    for (byte b17 : address) {
                        i17 = (i17 << 8) | (b17 & 255);
                    }
                    this.f258001f = i17;
                }
                i17 = 0;
                this.f258001f = i17;
            } catch (java.net.UnknownHostException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Voip.VoipContext", e18, "", new java.lang.Object[0]);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d1 d1Var = this.f258002g;
        int i18 = this.f257999d;
        int i19 = this.f258000e;
        int i27 = this.f258001f;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.z0 z0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.z0) d1Var;
        z0Var.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.y0(z0Var, i18, i27, i19));
    }
}
