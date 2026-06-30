package c41;

/* loaded from: classes12.dex */
public class a extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f119900d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f119901e;

    /* renamed from: f, reason: collision with root package name */
    public final int f119902f;

    /* renamed from: g, reason: collision with root package name */
    public final int f119903g;

    /* renamed from: h, reason: collision with root package name */
    public final int f119904h;

    /* renamed from: i, reason: collision with root package name */
    public final int f119905i;

    /* renamed from: m, reason: collision with root package name */
    public final r45.wc6 f119906m;

    /* renamed from: n, reason: collision with root package name */
    public final r45.wc6 f119907n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f119908o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f119909p;

    public a(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i17, int i18, int i19, int i27, r45.wc6 wc6Var, r45.wc6 wc6Var2, java.lang.String str) {
        this.f119900d = null;
        this.f119901e = gVar;
        this.f119902f = i17;
        this.f119903g = i18;
        this.f119904h = i19;
        this.f119905i = i27;
        this.f119906m = wc6Var;
        this.f119907n = wc6Var2;
        this.f119909p = str;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.zc6();
        lVar.f152198b = new r45.ad6();
        lVar.f152200d = zc1.b.f77555x366c91de;
        lVar.f152199c = "/cgi-bin/micromsg-bin/speedtestreport";
        lVar.f152201e = 996;
        lVar.f152202f = 1000000996;
        lVar.f152208l = 0;
        lVar.f152210n = null;
        this.f119900d = lVar.a();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f119908o = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f119900d;
        r45.zc6 zc6Var = (r45.zc6) oVar.f152243a.f152217a;
        zc6Var.f473443d = this.f119901e;
        zc6Var.f473447h = this.f119902f;
        zc6Var.f473448i = this.f119903g;
        zc6Var.f473449m = this.f119904h;
        zc6Var.f473450n = this.f119905i;
        zc6Var.f473452p = this.f119906m;
        zc6Var.f473451o = this.f119907n;
        if ("dual".equals(this.f119909p)) {
            java.lang.String str = zc6Var.f473451o.f470603d;
            if ((str == null || str.length() <= 0 || str.contains(".")) ? false : true) {
                r45.wc6 wc6Var = zc6Var.f473452p;
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
                wc6Var.f470603d = str2;
                java.lang.String str3 = zc6Var.f473452p.f470603d;
            }
        }
        int m40114xab99a7b5 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.C2Java.m40114xab99a7b5();
        if (m40114xab99a7b5 == -1) {
            zc6Var.f473444e = "NONET";
        } else if (m40114xab99a7b5 == 1) {
            zc6Var.f473444e = "WIFI";
            zc6Var.f473445f = com.p314xaae8f345.mm.sdk.p2603x2137b148.v0.f274560a.e(false);
        } else if (m40114xab99a7b5 != 2) {
            zc6Var.f473444e = "NONET";
        } else {
            int m40117xee32071e = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.C2Java.m40117xee32071e();
            if (m40117xee32071e == 2) {
                zc6Var.f473444e = "EDGE";
            } else if (m40117xee32071e == 3) {
                zc6Var.f473444e = "2G";
            } else if (m40117xee32071e == 4) {
                zc6Var.f473444e = "3G";
            } else if (m40117xee32071e != 5) {
                zc6Var.f473444e = "EDGE";
            } else {
                zc6Var.f473444e = "4G";
            }
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.SIMInfo m40112x13cb13bb = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.C2Java.m40112x13cb13bb();
            if (m40112x13cb13bb != null) {
                zc6Var.f473445f = m40112x13cb13bb.f19337x7cf60793;
            } else {
                zc6Var.f473445f = "unknown_netinfo";
            }
        }
        zc6Var.f473446g = "device info:" + o45.wf.f424557b + " " + o45.wf.f424558c + " " + o45.wf.f424560e + " " + wo.q.f529318f;
        zc6Var.f473443d.toString();
        int length = zc6Var.f473443d.f273689a.length;
        zc6Var.mo75928xcd1e8d8();
        r45.wc6 wc6Var2 = zc6Var.f473452p;
        java.lang.String str4 = wc6Var2.f470603d;
        int i17 = wc6Var2.f470604e;
        r45.wc6 wc6Var3 = zc6Var.f473451o;
        java.lang.String str5 = wc6Var3.f470603d;
        int i18 = wc6Var3.f470604e;
        return mo9409x10f9447a(sVar, oVar, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return zc1.b.f77555x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        if (i19 == 0 && i18 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(qf1.j.f76479x366c91de, 26);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(qf1.j.f76479x366c91de, 27);
        }
        this.f119908o.mo815x76e0bfae(i18, i19, str, this);
    }
}
