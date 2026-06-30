package c41;

/* loaded from: classes12.dex */
public class a extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f38367d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f38368e;

    /* renamed from: f, reason: collision with root package name */
    public final int f38369f;

    /* renamed from: g, reason: collision with root package name */
    public final int f38370g;

    /* renamed from: h, reason: collision with root package name */
    public final int f38371h;

    /* renamed from: i, reason: collision with root package name */
    public final int f38372i;

    /* renamed from: m, reason: collision with root package name */
    public final r45.wc6 f38373m;

    /* renamed from: n, reason: collision with root package name */
    public final r45.wc6 f38374n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f38375o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f38376p;

    public a(com.tencent.mm.protobuf.g gVar, int i17, int i18, int i19, int i27, r45.wc6 wc6Var, r45.wc6 wc6Var2, java.lang.String str) {
        this.f38367d = null;
        this.f38368e = gVar;
        this.f38369f = i17;
        this.f38370g = i18;
        this.f38371h = i19;
        this.f38372i = i27;
        this.f38373m = wc6Var;
        this.f38374n = wc6Var2;
        this.f38376p = str;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.zc6();
        lVar.f70665b = new r45.ad6();
        lVar.f70667d = zc1.b.CTRL_INDEX;
        lVar.f70666c = "/cgi-bin/micromsg-bin/speedtestreport";
        lVar.f70668e = 996;
        lVar.f70669f = 1000000996;
        lVar.f70675l = 0;
        lVar.f70677n = null;
        this.f38367d = lVar.a();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f38375o = u0Var;
        com.tencent.mm.modelbase.o oVar = this.f38367d;
        r45.zc6 zc6Var = (r45.zc6) oVar.f70710a.f70684a;
        zc6Var.f391910d = this.f38368e;
        zc6Var.f391914h = this.f38369f;
        zc6Var.f391915i = this.f38370g;
        zc6Var.f391916m = this.f38371h;
        zc6Var.f391917n = this.f38372i;
        zc6Var.f391919p = this.f38373m;
        zc6Var.f391918o = this.f38374n;
        if ("dual".equals(this.f38376p)) {
            java.lang.String str = zc6Var.f391918o.f389070d;
            if ((str == null || str.length() <= 0 || str.contains(".")) ? false : true) {
                r45.wc6 wc6Var = zc6Var.f391919p;
                java.lang.String str2 = "";
                try {
                    java.util.Enumeration<java.net.NetworkInterface> networkInterfaces = java.net.NetworkInterface.getNetworkInterfaces();
                    while (networkInterfaces.hasMoreElements()) {
                        java.util.Enumeration<java.net.InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                        while (true) {
                            if (inetAddresses.hasMoreElements()) {
                                java.net.InetAddress nextElement = inetAddresses.nextElement();
                                if (nextElement instanceof java.net.Inet6Address) {
                                    str2 = nextElement.getHostAddress().toString();
                                    break;
                                }
                            }
                        }
                    }
                } catch (java.lang.Exception unused) {
                }
                wc6Var.f389070d = str2;
                java.lang.String str3 = zc6Var.f391919p.f389070d;
            }
        }
        int netInfo = com.tencent.mars.comm.PlatformComm.C2Java.getNetInfo();
        if (netInfo == -1) {
            zc6Var.f391911e = "NONET";
        } else if (netInfo == 1) {
            zc6Var.f391911e = "WIFI";
            zc6Var.f391912f = com.tencent.mm.sdk.platformtools.v0.f193027a.e(false);
        } else if (netInfo != 2) {
            zc6Var.f391911e = "NONET";
        } else {
            int statisticsNetType = com.tencent.mars.comm.PlatformComm.C2Java.getStatisticsNetType();
            if (statisticsNetType == 2) {
                zc6Var.f391911e = "EDGE";
            } else if (statisticsNetType == 3) {
                zc6Var.f391911e = "2G";
            } else if (statisticsNetType == 4) {
                zc6Var.f391911e = "3G";
            } else if (statisticsNetType != 5) {
                zc6Var.f391911e = "EDGE";
            } else {
                zc6Var.f391911e = "4G";
            }
            com.tencent.mars.comm.PlatformComm.SIMInfo curSIMInfo = com.tencent.mars.comm.PlatformComm.C2Java.getCurSIMInfo();
            if (curSIMInfo != null) {
                zc6Var.f391912f = curSIMInfo.ispCode;
            } else {
                zc6Var.f391912f = "unknown_netinfo";
            }
        }
        zc6Var.f391913g = "device info:" + o45.wf.f343024b + " " + o45.wf.f343025c + " " + o45.wf.f343027e + " " + wo.q.f447785f;
        zc6Var.f391910d.toString();
        int length = zc6Var.f391910d.f192156a.length;
        zc6Var.computeSize();
        r45.wc6 wc6Var2 = zc6Var.f391919p;
        java.lang.String str4 = wc6Var2.f389070d;
        int i17 = wc6Var2.f389071e;
        r45.wc6 wc6Var3 = zc6Var.f391918o;
        java.lang.String str5 = wc6Var3.f389070d;
        int i18 = wc6Var3.f389071e;
        return dispatch(sVar, oVar, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return zc1.b.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        if (i19 == 0 && i18 == 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(qf1.j.CTRL_INDEX, 26);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(qf1.j.CTRL_INDEX, 27);
        }
        this.f38375o.onSceneEnd(i18, i19, str, this);
    }
}
