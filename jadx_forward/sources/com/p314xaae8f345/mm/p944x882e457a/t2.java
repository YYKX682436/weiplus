package com.p314xaae8f345.mm.p944x882e457a;

/* loaded from: classes12.dex */
public class t2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p971x6de15a2e.k0 f152341d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f152342e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f152343f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.v2 f152344g;

    public t2(com.p314xaae8f345.mm.p944x882e457a.v2 v2Var, com.p314xaae8f345.mm.p971x6de15a2e.k0 k0Var, int i17, int i18) {
        this.f152344g = v2Var;
        this.f152341d = k0Var;
        this.f152342e = i17;
        this.f152343f = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p944x882e457a.v2 v2Var;
        c01.f9 f9Var;
        c01.f9 f9Var2;
        int i17 = c01.h9.a().getInt("key_auth_update_version", 0);
        int i18 = i17 <= 637665332 ? o45.ag.f424425a ? 252 : 701 : o45.ag.f424425a ? 763 : 702;
        if (i17 == 0) {
            android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("ticket_prefs", 4);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(sharedPreferences.getString("_auth_ticket", ""))) {
                i18 = o45.ag.f424425a ? 763 : 702;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteReqResp", "summerauth dealWithAutoAuth revise to autoauth");
                jx3.f.INSTANCE.mo68477x336bdfd8(148L, 50L, 1L, true);
            } else {
                jx3.f.INSTANCE.mo68477x336bdfd8(148L, 49L, 1L, true);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteReqResp", "summerauth dealWithAutoAuth keep manual as old [%s]", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(sharedPreferences.getString("_auth_ticket", "")));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteReqResp", "summerauth dealWithAutoAuth updateVersion:%d, clientVersion:%d WLOGIN_BUG_VERSION:%d, newAuthType:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(o45.wf.f424562g), 637665332, java.lang.Integer.valueOf(i18));
        if (i18 == 252 || i18 == 701) {
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.mo68477x336bdfd8(148L, 48L, 1L, true);
            fVar.mo68477x336bdfd8(148L, o45.ag.f424425a ? 115L : 116L, 1L, true);
            fVar.mo68477x336bdfd8(148L, o45.ag.f424426b ? 117L : 118L, 1L, true);
        } else {
            jx3.f fVar2 = jx3.f.INSTANCE;
            fVar2.mo68477x336bdfd8(148L, o45.ag.f424425a ? 111L : 112L, 1L, true);
            fVar2.mo68477x336bdfd8(148L, o45.ag.f424426b ? 113L : 114L, 1L, true);
        }
        com.p314xaae8f345.mm.p944x882e457a.v2 v2Var2 = this.f152344g;
        int i19 = ((v2Var2.f152360d.mo13822xfb85f7b0() == 702 || v2Var2.f152360d.mo13822xfb85f7b0() == 701 || v2Var2.f152360d.mo13822xfb85f7b0() == 763 || v2Var2.f152360d.mo13822xfb85f7b0() == 252) && ((o45.vg) v2Var2.f152360d.mo13821x7f35c2d1()).f424554g == 2) ? 1 : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteReqResp", "summerauth dealWithAutoAuth old type:%d new auth type:%d, reqFlag:%d", java.lang.Integer.valueOf(v2Var2.f152360d.mo13822xfb85f7b0()), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        ((c01.f9) o45.qg.f424533a).getClass();
        c01.f9 f9Var3 = new c01.f9(i18);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i19);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(f9Var3.hashCode());
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMReqRespAuth", "summerauth autoAuthReq authReqFlag:%d, this:%d, stack:%s", valueOf, valueOf2, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        o45.ug ugVar = (o45.ug) f9Var3.mo47979x2d63726f();
        android.content.SharedPreferences a17 = c01.h9.a();
        int i27 = a17.getInt("key_auth_update_version", 0);
        int i28 = o45.wf.f424562g;
        int i29 = f9Var3.f118715a;
        if (i27 < i28) {
            ugVar.m150629x6027f5dc((i29 == 702 || i29 == 763) ? 12 : 16);
            jx3.f.INSTANCE.mo68477x336bdfd8(148L, i29 == 702 ? 14L : 13L, 1L, false);
        } else {
            ugVar.m150629x6027f5dc((i29 == 702 || i29 == 763) ? 2 : 1);
        }
        r45.zd zdVar = new r45.zd();
        zdVar.f473460i = i19;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(new byte[0]);
        zdVar.f473459h = cu5Var;
        r45.cu5 cu5Var2 = new r45.cu5();
        cu5Var2.d(new byte[0]);
        zdVar.f473458g = cu5Var2;
        r45.z57 z57Var = new r45.z57();
        zdVar.f473456e = z57Var;
        z57Var.f473273e = "";
        z57Var.f473272d = "";
        z57Var.f473274f = "";
        r45.sb7 sb7Var = new r45.sb7();
        zdVar.f473457f = sb7Var;
        sb7Var.f467154e = "";
        sb7Var.f467153d = "";
        if (gm0.j1.a()) {
            gm0.j1.i();
            java.lang.String str = (java.lang.String) gm0.j1.u().c().l(2, null);
            if (str == null) {
                str = "";
            }
            gm0.j1.i();
            kk.v vVar = new kk.v(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j1((java.lang.Integer) gm0.j1.u().c().l(9, null), 0));
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                str = vVar.m143587x9616526c();
            }
            java.lang.String str2 = str;
            gm0.j1.i();
            v2Var = v2Var2;
            byte[] d17 = gm0.j1.b().l().d(vVar.longValue(), "", i29 == 252 || i29 == 701);
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = str2;
            objArr[1] = vVar;
            objArr[2] = java.lang.Integer.valueOf(d17 == null ? -1 : d17.length);
            objArr[3] = d17 == null ? "null" : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(d17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMReqRespAuth", "summerauth loginbuf username:%s, qq:%s, len:%d, content:[%s]", objArr);
            r45.cu5 cu5Var3 = new r45.cu5();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(d17)) {
                d17 = new byte[0];
            }
            cu5Var3.d(d17);
            zdVar.f473455d = cu5Var3;
            o45.vg vgVar = f9Var3.f118717c;
            if (i29 == 702 || i29 == 763) {
                o45.mg mgVar = (o45.mg) ugVar;
                o45.ng ngVar = (o45.ng) vgVar;
                r45.mc mcVar = new r45.mc();
                r45.pc pcVar = new r45.pc();
                r45.oc ocVar = mgVar.f424513b;
                ocVar.f463674d = pcVar;
                ocVar.f463675e = mcVar;
                java.lang.String string = a17.getString("_auth_key", "");
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                objArr2[0] = java.lang.Integer.valueOf(string != null ? string.length() : -1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMReqRespAuth", "summerauths KEY_SP_SUFFIX keyStr[%s]", objArr2);
                byte[] h17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(string);
                r45.nc ncVar = new r45.nc();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(h17)) {
                    f9Var = f9Var3;
                    jx3.f.INSTANCE.mo68477x336bdfd8(148L, 16L, 1L, false);
                    r45.cu5 cu5Var4 = new r45.cu5();
                    cu5Var4.d(new byte[0]);
                    mcVar.f461877e = cu5Var4;
                } else {
                    r45.cu5 cu5Var5 = new r45.cu5();
                    cu5Var5.d(h17);
                    mcVar.f461877e = cu5Var5;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMReqRespAuth", "summerauths keyBuf[%s, %s]", java.lang.Integer.valueOf(cu5Var5.f453374f.f273689a.length), java.lang.Integer.valueOf(h17.length));
                    try {
                        ncVar.mo11468x92b714fd(h17);
                        f9Var = f9Var3;
                    } catch (java.io.IOException e17) {
                        jx3.f.INSTANCE.mo68477x336bdfd8(148L, 15L, 1L, false);
                        f9Var = f9Var3;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMReqRespAuth", e17, "summerauthkey Failed parse autoauthkey buf", new java.lang.Object[0]);
                    }
                }
                r45.cu5 cu5Var6 = ncVar.f462771d;
                if (cu5Var6 != null) {
                    pcVar.f464468d = cu5Var6;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMReqRespAuth", "summerauthkey AesEncryptKey [%s][%s]", java.lang.Integer.valueOf(cu5Var6.f453374f.f273689a.length), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(ncVar.f462771d.f453374f.f273689a));
                } else {
                    jx3.f.INSTANCE.mo68477x336bdfd8(148L, 17L, 1L, false);
                    r45.cu5 cu5Var7 = new r45.cu5();
                    cu5Var7.d(new byte[0]);
                    pcVar.f464468d = cu5Var7;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMReqRespAuth", "summerauthkey AesEncryptKey null!");
                }
                mcVar.f461876d = zdVar;
                java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b;
                mcVar.f461891v = str3;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMReqRespAuth", "aesReq.AndroidPackageName [%s]", str3);
                mgVar.f424514c = str2;
                ngVar.f424549b = str2;
            } else {
                r45.ki4 ki4Var = new r45.ki4();
                r45.ii4 ii4Var = new r45.ii4();
                r45.ji4 ji4Var = ((o45.sg) ugVar).f424539b;
                ji4Var.f459371d = ki4Var;
                ji4Var.f459372e = ii4Var;
                ii4Var.f458617z = 2;
                ii4Var.f458598d = zdVar;
                ki4Var.f460251f = str2;
                gm0.j1.i();
                java.lang.String str4 = (java.lang.String) gm0.j1.u().c().l(3, null);
                if (str4 == null) {
                    str4 = "";
                }
                gm0.j1.i();
                java.lang.String str5 = (java.lang.String) gm0.j1.u().c().l(19, null);
                if (str5 == null) {
                    str5 = "";
                }
                ki4Var.f460252g = str5;
                ki4Var.f460253h = str4;
                f9Var = f9Var3;
            }
            f9Var2 = f9Var;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMReqRespAuth", "autoAuthReq build autoauth Req  , failed  acc not ready");
            v2Var = v2Var2;
            f9Var2 = null;
        }
        try {
            this.f152341d.ri(f9Var2 == null ? null : new com.p314xaae8f345.mm.p944x882e457a.v2(f9Var2, v2Var.f152364h, null), this.f152342e, this.f152343f, "");
        } catch (android.os.RemoteException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemoteReqResp", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e18));
        }
    }
}
