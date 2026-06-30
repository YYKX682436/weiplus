package com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220;

/* renamed from: com.tencent.kinda.framework.module.impl.KindaCrtServiceImpl */
/* loaded from: classes9.dex */
public class C3230x73332fdd implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3446x80371bbb, com.p314xaae8f345.mm.p944x882e457a.u0 {
    private final java.lang.String TAG = "KindaCrtServiceImpl";

    /* renamed from: m_deleteFailCallBack */
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3635x710ca4a f12398xdb301000;

    /* renamed from: m_deleteSuccessCallback */
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 f12399x50b859eb;

    /* renamed from: m_failCallback */
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3635x710ca4a f12400xe212a015;

    /* renamed from: m_req */
    private com.p314xaae8f345.p347x615374d.gen.C3462xa42a71ac f12401x62ce9cc;

    /* renamed from: m_successCallback */
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 f12402xeb4ded96;

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3446x80371bbb
    /* renamed from: delCert */
    public void mo25861x5c5a84cf() {
        this.f12398xdb301000 = null;
        this.f12399x50b859eb = null;
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p1.c().getClass();
        java.lang.String b17 = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p1.b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaCrtServiceImpl", "do delete cert: %s", b17);
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p1.c().a(b17);
        gm0.j1.d().g(new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.r0(b17));
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3446x80371bbb
    /* renamed from: getCrtNo */
    public java.lang.String mo25862x74464cd0() {
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p1.c().getClass();
        java.lang.String b17 = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p1.b();
        if (b17.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KindaCrtServiceImpl", "crt_no is empty.");
            return null;
        }
        android.content.Context context = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
        if (context != null) {
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.j.b().e(context);
        }
        if (com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.j.b().f(b17)) {
            return b17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KindaCrtServiceImpl", "crt_no is not exist.");
        return null;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3446x80371bbb
    /* renamed from: hasCrt */
    public boolean mo25863xb70438eb() {
        java.lang.String mo25862x74464cd0 = mo25862x74464cd0();
        return (mo25862x74464cd0 == null || mo25862x74464cd0.isEmpty()) ? false : true;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3446x80371bbb
    /* renamed from: isCrtExist */
    public boolean mo25864x5549075c(java.lang.String str) {
        return com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.j.b().f(str);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KindaCrtServiceImpl", "onSceneEnd. errCode: " + i18 + " errMsg: " + str);
        if (m1Var instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3252xc16c1a0a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KindaCrtServiceImpl", "NetSceneKindaGenDigitalCert");
            if (i18 == 0) {
                com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619 = this.f12402xeb4ded96;
                if (abstractC3623x3b485619 != null) {
                    abstractC3623x3b485619.mo25801x2e7a5e();
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KindaCrtServiceImpl", "m_successCallback is null!!");
                }
            } else {
                com.p314xaae8f345.p347x615374d.gen.AbstractC3635x710ca4a abstractC3635x710ca4a = this.f12400xe212a015;
                if (abstractC3635x710ca4a != null) {
                    abstractC3635x710ca4a.mo28515x2e7a5e(str);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KindaCrtServiceImpl", "m_failCallback is null!!");
                }
            }
            gm0.j1.n().f354821b.q(fe1.o.f69744x366c91de, this);
            return;
        }
        if (m1Var instanceof com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.r0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KindaCrtServiceImpl", "NetSceneDeletedigitalcert");
            if (i18 == 0) {
                com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b4856192 = this.f12399x50b859eb;
                if (abstractC3623x3b4856192 != null) {
                    abstractC3623x3b4856192.mo25801x2e7a5e();
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KindaCrtServiceImpl", "m_deleteSuccessCallback is null!!");
                }
            } else {
                com.p314xaae8f345.p347x615374d.gen.AbstractC3635x710ca4a abstractC3635x710ca4a2 = this.f12398xdb301000;
                if (abstractC3635x710ca4a2 != null) {
                    abstractC3635x710ca4a2.mo28515x2e7a5e(str);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KindaCrtServiceImpl", "m_deleteFailCallBack is null!!");
                }
            }
            this.f12398xdb301000 = null;
            this.f12402xeb4ded96 = null;
            gm0.j1.n().f354821b.q(fe1.o.f69744x366c91de, this);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3446x80371bbb
    /* renamed from: sign */
    public java.lang.String mo25865x35ddbd(java.lang.String str, byte[] bArr) {
        if (str == null || bArr == null) {
            return null;
        }
        android.content.Context context = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
        if (context != null) {
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.j.b().e(context);
        }
        java.lang.String a17 = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.j.b().a(str, bArr);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(20743, "user_identification", "pay_cert_sign", "", "", "", "", java.lang.Integer.valueOf(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.j.b().c()));
        }
        return a17;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3446x80371bbb
    /* renamed from: startDeleteDigitalCrtImpl */
    public void mo25866xb1ef7a7a(java.lang.String str, com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619, com.p314xaae8f345.p347x615374d.gen.AbstractC3635x710ca4a abstractC3635x710ca4a) {
        this.f12399x50b859eb = abstractC3623x3b485619;
        this.f12398xdb301000 = abstractC3635x710ca4a;
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p1.c().a(str);
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.r0 r0Var = new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.r0(str);
        gm0.j1.n().f354821b.a(1568, this);
        gm0.j1.d().g(r0Var);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3446x80371bbb
    /* renamed from: startGenDigitalCrtImpl */
    public void mo25867xda10d79b(com.p314xaae8f345.p347x615374d.gen.C3462xa42a71ac c3462xa42a71ac, com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619, com.p314xaae8f345.p347x615374d.gen.AbstractC3635x710ca4a abstractC3635x710ca4a) {
        this.f12401x62ce9cc = c3462xa42a71ac;
        this.f12402xeb4ded96 = abstractC3623x3b485619;
        this.f12400xe212a015 = abstractC3635x710ca4a;
        gm0.j1.n().f354821b.a(fe1.o.f69744x366c91de, this);
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3252xc16c1a0a c3252xc16c1a0a = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3252xc16c1a0a(c3462xa42a71ac);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaCrtServiceImpl", "The Param of startGenDigitalCrtImpl is: " + c3462xa42a71ac.m27997x9616526c());
        gm0.j1.d().g(c3252xc16c1a0a);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3446x80371bbb
    /* renamed from: updateCurrentDeviceCertNoWithInfo */
    public java.lang.String mo25868xa133f13f(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
        byte[] mo27541x124d2ef7 = abstractC3411xcfaed72e.mo27541x124d2ef7("UserCertInfo");
        r45.uv6 uv6Var = new r45.uv6();
        try {
            uv6Var.mo11468x92b714fd(mo27541x124d2ef7);
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KindaCrtServiceImpl", "userCertInfo parse failed");
        }
        if (uv6Var.f469220e == 0) {
            return "";
        }
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p1.c().getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaCrtServiceImpl", "local crtNO: %s", com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p1.b());
        java.util.LinkedList linkedList = uv6Var.f469225m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaCrtServiceImpl", "userCertInfo crt_list size: %d", java.lang.Integer.valueOf(linkedList.size()));
        for (int i17 = 0; i17 < linkedList.size(); i17++) {
            r45.mv mvVar = (r45.mv) linkedList.get(i17);
            if (mvVar.f462374f != 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mvVar.f462375g)) {
                java.lang.String[] split = mvVar.f462375g.split("_");
                for (int i18 = 0; i18 < split.length; i18++) {
                    java.lang.String str = split[i18];
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KindaCrtServiceImpl", "crtNo.length == 0");
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaCrtServiceImpl", "svr crtNo at index %d is %s", java.lang.Integer.valueOf(i18), str);
                        if (com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.j.b().f(str)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaCrtServiceImpl", "cert exists %s", str);
                            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p1.c().getClass();
                            if (str.equals(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p1.b())) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaCrtServiceImpl", "svr cert equals to local certNo %s", str);
                                return str;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        return "";
    }
}
