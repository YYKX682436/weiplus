package d35;

/* loaded from: classes9.dex */
public final class h implements bt3.p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final d35.h f307877a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f307878b;

    /* renamed from: c, reason: collision with root package name */
    public static final d35.g f307879c;

    static {
        d35.h hVar = new d35.h();
        f307877a = hVar;
        bt3.l0.C = hVar;
        f307878b = new java.util.HashMap();
        f307879c = new d35.g();
    }

    public void a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        jz5.f0 f0Var;
        if (f9Var != null) {
            java.lang.String mediaid = f307877a.b(f9Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileLanDownloadMgr", "cancelLanDownloadFile " + mediaid);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaid, "mediaid");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileLanDownloadMgr", "cancelLanDownloadFile ".concat(mediaid));
            ((ux.a) ((vx.e) i95.n0.c(vx.e.class))).getClass();
            hv1.d.f().e().w(mediaid);
            java.util.HashMap hashMap = f307878b;
            jz5.l lVar = (jz5.l) hashMap.get(mediaid);
            if (lVar != null) {
                com.p314xaae8f345.mm.vfs.w6.h((java.lang.String) lVar.f384367e);
                jx3.f.INSTANCE.mo68477x336bdfd8(1680L, 16L, 1L, false);
            }
            hashMap.remove(mediaid);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileLanDownloadMgr", "cancelLanDownloadFile msginfo is null");
        }
    }

    public final java.lang.String b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        return "lan_" + f9Var.Q0() + '_' + f9Var.m124847x74d37ac6();
    }

    public final void c(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        d(msgInfo, ot0.q.v(msgInfo.j()));
    }

    public final void d(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo, ot0.q qVar) {
        java.lang.String field_cgi;
        java.lang.String field_aeskey;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        long a17 = c01.id.a() - msgInfo.mo78012x3fdd41df();
        d35.i iVar = d35.i.f307880a;
        if (a17 >= iVar.b()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileLanDownloadMgr", "startToLanDownloadFile exceed limit time, %s", java.lang.Long.valueOf(iVar.b()));
            return;
        }
        if (qVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileLanDownloadMgr", "appmsgContent is null!");
            return;
        }
        if (!ez.v0.f339310a.k(java.lang.Integer.valueOf(qVar.f430199i))) {
            a95.a y07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3.class)).wi().y0(msgInfo.I0());
            if (y07 != null) {
                field_cgi = y07.f68547x4b6e43c0;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_cgi, "field_cgi");
                field_aeskey = y07.f68546xf11e6e15;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_aeskey, "field_aeskey");
            }
            field_cgi = "";
            field_aeskey = "";
        } else {
            if (x51.t1.b(qVar.f430262x2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileLanDownloadMgr", "fileLanInfo is null!");
                return;
            }
            java.lang.String fileLanInfo = qVar.f430262x2;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(fileLanInfo, "fileLanInfo");
            java.lang.String[] strArr = (java.lang.String[]) new r26.t(";").g(fileLanInfo, 0).toArray(new java.lang.String[0]);
            if (strArr != null && strArr.length == 2) {
                field_cgi = strArr[0];
                field_aeskey = strArr[1];
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileLanDownloadMgr", "startToLanDownloadFile cgi:%s aesKey:%s", field_cgi, field_aeskey);
            }
            field_cgi = "";
            field_aeskey = "";
        }
        java.lang.String b17 = b(msgInfo);
        java.util.HashMap hashMap = f307878b;
        if (hashMap.containsKey(b17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileLanDownloadMgr", "downloadImp " + b17 + " has exist");
            return;
        }
        if (x51.t1.b(field_cgi)) {
            return;
        }
        java.lang.String str = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.f(lp0.b.t(), qVar.n(), qVar.f430223o) + "_lan_tmp";
        if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
            com.p314xaae8f345.mm.vfs.w6.h(str);
        }
        hashMap.put(b17, new jz5.l(msgInfo, str));
        ((ux.a) ((vx.e) i95.n0.c(vx.e.class))).getClass();
        com.p314xaae8f345.mm.p947xba6de98f.l1 e17 = hv1.d.f().e();
        int b18 = (int) iVar.b();
        e17.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnTransportEngine", "startLanDownload: mediaid:" + b17);
        com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest c2CDownloadRequest = new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest();
        c2CDownloadRequest.f17792xcd096f43 = b17;
        c2CDownloadRequest.url = field_cgi;
        c2CDownloadRequest.f17767xab4b3f30 = field_aeskey;
        c2CDownloadRequest.m37861xfb0731c4(str);
        c2CDownloadRequest.f17821x8c50294f = b18;
        c2CDownloadRequest.f17841x86986d5f = 600;
        c2CDownloadRequest.f17775x596916e = -2;
        int m37786xf0570eef = ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37786xf0570eef(c2CDownloadRequest, f307879c);
        jx3.f.INSTANCE.mo68477x336bdfd8(1680L, m37786xf0570eef == 0 ? 11L : 12L, 1L, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileLanDownloadMgr", "fetch: start mediaId:" + b17 + " cgi:" + field_cgi + " aesKey:" + field_aeskey + " tmpFile " + b17 + ' ' + m37786xf0570eef);
    }
}
