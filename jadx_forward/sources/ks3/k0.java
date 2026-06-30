package ks3;

/* loaded from: classes8.dex */
public class k0 {

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f393236g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyy);

    /* renamed from: h, reason: collision with root package name */
    public static android.util.SparseArray f393237h;

    /* renamed from: b, reason: collision with root package name */
    public ks3.z f393239b;

    /* renamed from: c, reason: collision with root package name */
    public ks3.i f393240c;

    /* renamed from: d, reason: collision with root package name */
    public ks3.s f393241d;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f393238a = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f393242e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f393243f = new java.util.HashMap();

    static {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyy);
        f393237h = null;
    }

    public k0() {
        f();
    }

    public static int a(ks3.k0 k0Var, hs3.l lVar) {
        k0Var.getClass();
        boolean z17 = lVar.f366118c.f366115c;
        hs3.j jVar = lVar.f366122g;
        if (!z17) {
            jVar.d(lVar.f366120e.f366128c, null);
            return 0;
        }
        hs3.o oVar = lVar.f366120e;
        java.util.Map map = lVar.f366121f;
        if (map == null) {
            jVar.b(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.ErrorCode.f15117xb77c61b3, "format error");
            return com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.ErrorCode.f15117xb77c61b3;
        }
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".Response.error.code"), 0);
        if (P == 0) {
            jVar.d(oVar.f366128c, lVar.f366121f);
            return 0;
        }
        jVar.b(P, k0Var.e(P, (java.lang.String) lVar.f366121f.get(".Response.error.message")));
        return P;
    }

    public static java.lang.String c() {
        return "https://" + f393236g;
    }

    public void b(long j17) {
        java.util.Map map = this.f393243f;
        ks3.j0 j0Var = (ks3.j0) ((java.util.HashMap) map).get(java.lang.Long.valueOf(j17));
        if (j0Var != null) {
            j0Var.onCancelled();
            j0Var.cancel(true);
        }
        ((java.util.HashMap) map).remove(java.lang.Long.valueOf(j17));
        ((java.util.HashMap) this.f393242e).remove(java.lang.Long.valueOf(j17));
    }

    public java.lang.String d() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        synchronized (lp0.b.class) {
            str = lp0.b.D() + "mail/";
        }
        sb6.append(str);
        sb6.append("attach/");
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.vfs.w6.u(sb7);
        return sb7;
    }

    public final java.lang.String e(int i17, java.lang.String str) {
        int i18;
        if (i17 != -7) {
            if (i17 != -6) {
                if (i17 == -4 || i17 == -3) {
                    i18 = com.p314xaae8f345.mm.R.C30867xcad56011.hkk;
                } else if (i17 != -1) {
                    switch (i17) {
                        case -105:
                            break;
                        case -104:
                            i18 = com.p314xaae8f345.mm.R.C30867xcad56011.hkj;
                            break;
                        case -103:
                            i18 = com.p314xaae8f345.mm.R.C30867xcad56011.hki;
                            break;
                        case -102:
                            i18 = com.p314xaae8f345.mm.R.C30867xcad56011.hkh;
                            break;
                        default:
                            i18 = 0;
                            break;
                    }
                } else {
                    i18 = com.p314xaae8f345.mm.R.C30867xcad56011.hkf;
                }
            }
            i18 = com.p314xaae8f345.mm.R.C30867xcad56011.hkl;
        } else {
            i18 = com.p314xaae8f345.mm.R.C30867xcad56011.hkm;
        }
        return i18 == 0 ? str : i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, i18);
    }

    public void f() {
        java.util.HashMap hashMap = (java.util.HashMap) this.f393243f;
        java.util.Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((ks3.j0) it.next()).cancel(true);
        }
        hashMap.clear();
        ((java.util.HashMap) this.f393242e).clear();
        ((java.util.HashMap) this.f393238a).clear();
        java.lang.String str = ((com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0(), js3.c.class)).f149939d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            ks3.z zVar = new ks3.z("wcf://mailapp/addr/mail_address/addrpage");
            this.f393239b = zVar;
            zVar.f393321b.a();
        } else {
            this.f393239b = new ks3.z("wcf://mailapp/addr/mail_address/" + str + "/addrpage");
        }
        this.f393240c = new ks3.i("wcf://mailapp/draft/");
        this.f393241d = new ks3.s("wcf://mailapp/http/", 0);
    }

    public final long g(java.lang.String str, int i17, java.util.Map map, hs3.p pVar, hs3.k kVar, hs3.j jVar) {
        java.lang.String str2;
        if (map == null) {
            map = new java.util.HashMap();
        }
        map.put("appname", "qqmail_weixin");
        map.put("f", "xml");
        map.put("charset", com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
        try {
            java.util.Enumeration<java.net.NetworkInterface> networkInterfaces = java.net.NetworkInterface.getNetworkInterfaces();
            loop0: while (networkInterfaces.hasMoreElements()) {
                java.util.Enumeration<java.net.InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    java.net.InetAddress nextElement = inetAddresses.nextElement();
                    if (!nextElement.isLoopbackAddress()) {
                        str2 = nextElement.getHostAddress();
                        break loop0;
                    }
                }
            }
        } catch (java.net.SocketException | java.lang.Exception unused) {
        }
        str2 = null;
        map.put("clientip", str2);
        hs3.l lVar = new hs3.l(c() + str, new hs3.n(i17, map, this.f393238a, pVar), jVar);
        lVar.f366118c = kVar;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new ks3.h0(this, lVar));
        return lVar.f366116a;
    }
}
