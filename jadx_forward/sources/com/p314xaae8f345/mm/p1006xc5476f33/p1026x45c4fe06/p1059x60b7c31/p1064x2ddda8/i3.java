package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public class i3 implements th1.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.j3 f161121a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C12004xb7c17ce f161122b;

    public i3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C12004xb7c17ce c12004xb7c17ce, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.j3 j3Var) {
        this.f161122b = c12004xb7c17ce;
        this.f161121a = j3Var;
    }

    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        th1.g gVar = (th1.g) m1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C12004xb7c17ce c12004xb7c17ce = this.f161122b;
        c12004xb7c17ce.getClass();
        try {
            o45.ah mo13821x7f35c2d1 = gVar.mo47948x7f0c4558().mo13821x7f35c2d1();
            c12004xb7c17ce.f160929x1 = mo13821x7f35c2d1.m150576x2b5bc573();
            c12004xb7c17ce.f160932y1 = mo13821x7f35c2d1.m150574x9be79b8f();
        } catch (java.lang.NullPointerException unused) {
        }
        if (c12004xb7c17ce.X) {
            c12004xb7c17ce.f160919p1 = java.lang.System.currentTimeMillis();
        } else {
            c12004xb7c17ce.f160931y0 = java.lang.System.currentTimeMillis();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.j3 j3Var = this.f161121a;
        if (i17 != 0 || i18 != 0) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.z2) j3Var).a(java.lang.String.format("cgi fail(%d,%d)", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0);
            return;
        }
        if (gVar == null || c12004xb7c17ce.f160921r == 2) {
            return;
        }
        com.p314xaae8f345.mm.p944x882e457a.o oVar = gVar.f500853d;
        r45.n24 n24Var = oVar == null ? null : (r45.n24) oVar.f152244b.f152233a;
        r45.j14 j14Var = n24Var.f462548d;
        if (j14Var == null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.z2) j3Var).a("cgi fail response null", 0);
            return;
        }
        int i19 = j14Var.f459024d;
        java.lang.String str2 = j14Var.f459025e;
        r45.jv5 jv5Var = n24Var.f462550f;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (jv5Var != null) {
            linkedList.add(jv5Var);
        }
        java.lang.String str3 = n24Var.f462551g;
        java.lang.String str4 = n24Var.f462552h;
        if (i19 != -12000) {
            if (i19 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.JsApiOperateWXData", "onSceneEnd NetSceneJSOperateWxData Failed %s", str2);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.z2) j3Var).a(str2, i19);
                return;
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = n24Var.f462549e;
            if (gVar2 == null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.z2) j3Var).a(com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1.OnLayerStatusChangedListener.LayerStatusMsg.f16697x69dc35be, i19);
                return;
            }
            java.lang.String i27 = gVar2.i();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.z2 z2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.z2) j3Var;
            z2Var.getClass();
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.k4.f161156g == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.k4.f161156g = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_appbrand_android_operatewxdata_ipc_optimization, false));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.JsApiOperateWXData", "isIpcOptimization= %s", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.k4.f161156g);
            boolean booleanValue = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.k4.f161156g.booleanValue();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C12004xb7c17ce c12004xb7c17ce2 = z2Var.f161341a;
            if (booleanValue) {
                if (i27.getBytes().length < 200000) {
                    c12004xb7c17ce2.f160917p = null;
                    c12004xb7c17ce2.f160916o = i27;
                } else {
                    z2Var.b(i27);
                }
                c12004xb7c17ce2.f160915n = null;
            } else {
                z2Var.b(i27);
            }
            c12004xb7c17ce2.f160933z = "ok";
            c12004xb7c17ce2.c();
            return;
        }
        c12004xb7c17ce.X = true;
        c12004xb7c17ce.I = n24Var.f462557p;
        c12004xb7c17ce.K = n24Var.f462556o;
        c12004xb7c17ce.f160908J = n24Var.f462555n;
        r45.i7 i7Var = n24Var.f462559r;
        if (i7Var != null) {
            c12004xb7c17ce.L = i7Var.f458306d;
            c12004xb7c17ce.M = i7Var.f458307e;
            if (k01.j.f384572a.b(null, c12004xb7c17ce.f160930y)) {
                java.lang.String mPrivacyInfo = c12004xb7c17ce.M;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mPrivacyInfo, "mPrivacyInfo");
                c12004xb7c17ce.M = r26.i0.t(mPrivacyInfo, "小游戏", "轻游戏", false);
            }
        }
        r45.sv6 sv6Var = n24Var.f462558q;
        if (sv6Var != null) {
            c12004xb7c17ce.N = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.C12007xb9118992(sv6Var);
        }
        r45.pw6 pw6Var = n24Var.f462560s;
        if (pw6Var != null) {
            c12004xb7c17ce.P = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.C12008x61435860(pw6Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.z2 z2Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.z2) j3Var;
        z2Var2.getClass();
        int size = linkedList.size();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C12004xb7c17ce c12004xb7c17ce3 = z2Var2.f161341a;
        c12004xb7c17ce3.G = size;
        int i28 = 0;
        while (true) {
            if (i28 >= c12004xb7c17ce3.G) {
                break;
            }
            r45.jv5 jv5Var2 = (r45.jv5) linkedList.get(i28);
            try {
                c12004xb7c17ce3.H.put(i28 + "", jv5Var2.mo14344x5f01b1f6());
                i28++;
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.JsApiOperateWXData", "IOException %s", e17.getMessage());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.JsApiOperateWXData", e17, "", new java.lang.Object[0]);
                c12004xb7c17ce3.f160933z = "fail";
                c12004xb7c17ce3.c();
                return;
            }
        }
        c12004xb7c17ce3.D = str3;
        c12004xb7c17ce3.E = str4;
        c12004xb7c17ce3.f160933z = "needConfirm";
        if (linkedList.size() <= 0) {
            c12004xb7c17ce3.c();
            return;
        }
        r45.jv5 jv5Var3 = (r45.jv5) linkedList.get(0);
        java.lang.String str5 = jv5Var3.f459669i;
        c12004xb7c17ce3.Q = str5 != null ? str5 : "";
        if (!"scope.userInfo".equals(jv5Var3.f459664d)) {
            c12004xb7c17ce3.c();
            return;
        }
        java.lang.String l17 = c01.z1.l();
        c12004xb7c17ce3.f160926w = l17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiOperateWXData", "userNickName=".concat(l17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.c0.f160953a.a(c01.z1.r(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.y2(z2Var2));
    }
}
