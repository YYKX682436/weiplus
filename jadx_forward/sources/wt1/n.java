package wt1;

/* loaded from: classes15.dex */
public class n implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: e, reason: collision with root package name */
    public lu1.e f530844e;

    /* renamed from: f, reason: collision with root package name */
    public int f530845f;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f530843d = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f530846g = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new wt1.l(this), false);

    public final xt1.m a(r45.fg5 fg5Var) {
        xt1.m mVar = new xt1.m();
        mVar.f68236x95970a65 = fg5Var.f455850d;
        mVar.f68239x45f51afb = fg5Var.f455851e;
        mVar.f68237xa7f540fc = fg5Var.f455854h;
        mVar.f68240xd5964816 = fg5Var.f455852f;
        mVar.f68241x9c21bcc8 = fg5Var.f455855i;
        mVar.f68242xdde7b67f = fg5Var.f455853g;
        mVar.f68238xcb645d97 = java.lang.System.currentTimeMillis();
        return mVar;
    }

    public final r45.c25 b(java.lang.String str, java.lang.String str2, lu1.e eVar) {
        r45.c25 c25Var = new r45.c25();
        c25Var.f452775d = str;
        c25Var.f452776e = str2;
        c25Var.f452777f = new java.lang.Long(java.lang.System.currentTimeMillis() / 1000).intValue();
        c25Var.f452778g = eVar == null ? -1 : eVar.f402870d;
        return c25Var;
    }

    public final void c(java.lang.String str, lu1.h0 h0Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doNetSceneGetDynamicQrcode, cardId:");
        sb6.append(str);
        sb6.append(",scene :");
        sb6.append(h0Var == null ? 0 : h0Var.f402882d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDynamicQrcodeOfflineMgr", sb6.toString());
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(str);
        xt1.l0 l0Var = new xt1.l0(linkedList, h0Var != null ? h0Var.f402882d : 0);
        gm0.j1.n().f354821b.a(1382, this);
        gm0.j1.n().f354821b.g(l0Var);
    }

    public final void d(java.lang.String str, java.lang.String str2, lu1.e eVar) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(b(str, str2, eVar));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "doNetSceneReport, operate_list=%d,refreshAction=%d", java.lang.Integer.valueOf(linkedList.size()), java.lang.Integer.valueOf(eVar.f402870d));
        f(linkedList);
    }

    public final void e(java.lang.String str, java.util.List list, lu1.e eVar) {
        if (eVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "doNetSceneReport error! CardCodeRefreshAction is null! cannot report!");
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedList.add(b(str, ((xt1.o) it.next()).f68372xacb60e68, eVar));
        }
        f(linkedList);
    }

    public final void f(java.util.LinkedList linkedList) {
        gm0.j1.n().f354821b.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.f1.f34290x366c91de, this);
        gm0.j1.n().f354821b.g(new xt1.o0(linkedList));
    }

    public final void g(tt1.j jVar, lu1.h0 h0Var) {
        boolean z17 = false;
        if (jVar != null) {
            if (jVar.i0() == null || !jVar.i0().E) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "get cardInfo is_commom_card is false!");
            } else {
                z17 = true;
            }
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "cannot  get qrCode !");
            j(2, "");
            return;
        }
        if (!lu1.a0.x(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "isNetworkAvailable false cannot connet network!");
            j(-1, "");
        } else if (this.f530845f < 3) {
            c(jVar.g(), h0Var);
            this.f530845f++;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "doRequestNetSceneGetDynamicQrcode is  limit requestcount:" + this.f530845f + ",cannot request!");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0108 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(lu1.h0 r10) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wt1.n.h(lu1.h0):void");
    }

    public final boolean i(xt1.m mVar) {
        if (java.lang.System.currentTimeMillis() - mVar.f68238xcb645d97 <= mVar.f68237xa7f540fc * 1000) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "code  expire time is true! currentTime= %s,codeFetchTime=%s,field_expire_time_interval=%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Long.valueOf(mVar.f68238xcb645d97), java.lang.Integer.valueOf(mVar.f68237xa7f540fc));
        return true;
    }

    public final void j(int i17, java.lang.String str) {
        wt1.m mVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "onFail()");
        if (this.f530843d == null) {
            return;
        }
        for (int i18 = 0; i18 < ((java.util.ArrayList) this.f530843d).size(); i18++) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.ArrayList) this.f530843d).get(i18);
            if (weakReference != null && (mVar = (wt1.m) weakReference.get()) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0 b0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) mVar;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardDetailUIContoller", "onGetCodeFail! errCode = %d, errMsg=%s", java.lang.Integer.valueOf(i17), str);
                android.os.Message obtain = android.os.Message.obtain();
                com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.r0 r0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.r0(null);
                r0Var.f176675a = com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.q0.onGetCodeFail;
                r0Var.f176676b = i17 == -1 ? b0Var.h(com.p314xaae8f345.mm.R.C30867xcad56011.ase) : i17 == 2 ? b0Var.h(com.p314xaae8f345.mm.R.C30867xcad56011.ars) : b0Var.h(com.p314xaae8f345.mm.R.C30867xcad56011.asd);
                obtain.obj = r0Var;
                b0Var.W.mo50308x2936bf5f(obtain);
            }
        }
    }

    public final void k(lu1.e eVar) {
        wt1.m mVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "onReceiveCodeUnavailable()");
        if (this.f530843d == null) {
            return;
        }
        for (int i17 = 0; i17 < ((java.util.ArrayList) this.f530843d).size(); i17++) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.ArrayList) this.f530843d).get(i17);
            if (weakReference != null && (mVar = (wt1.m) weakReference.get()) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUIContoller", "on onReceiveCodeUnavailable! do update refresh code view!");
                android.os.Message obtain = android.os.Message.obtain();
                com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.r0 r0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.r0(null);
                r0Var.f176675a = com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.q0.onReceiveCodeUnavailable;
                r0Var.f176677c = eVar;
                obtain.obj = r0Var;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) mVar).W.mo50308x2936bf5f(obtain);
            }
        }
    }

    public void l() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "stopRefreshCodeTimer!");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f530846g;
        if (b4Var.e()) {
            return;
        }
        b4Var.d();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        wt1.m mVar;
        lu1.e eVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSceneEnd, errType = ");
        sb6.append(i17);
        sb6.append(" errCode = ");
        sb6.append(i18);
        sb6.append(",NetSceneBase=");
        sb6.append(m1Var != null ? m1Var.getClass() : "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDynamicQrcodeOfflineMgr", sb6.toString());
        if (i17 != 0 || i18 != 0) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onSceneEnd, errType = ");
            sb7.append(i17);
            sb7.append(" errCode = ");
            sb7.append(i18);
            sb7.append(" cmd:");
            sb7.append(m1Var != null ? m1Var.mo808xfb85f7b0() : 0);
            sb7.append("  NetSceneBase=");
            sb7.append(m1Var != null ? m1Var.getClass() : "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardDynamicQrcodeOfflineMgr", sb7.toString());
            if (!(m1Var instanceof xt1.l0)) {
                gm0.j1.n().f354821b.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.f1.f34290x366c91de, this);
                return;
            } else {
                j(i18, str);
                gm0.j1.n().f354821b.q(1382, this);
                return;
            }
        }
        if (!(m1Var instanceof xt1.l0)) {
            gm0.j1.n().f354821b.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.f1.f34290x366c91de, this);
            return;
        }
        r45.fg5 fg5Var = ((xt1.l0) m1Var).f538054f;
        if (fg5Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "onSceneEnd, resp  qr_code_item_list is null ");
            return;
        }
        java.lang.String str2 = fg5Var.f455850d;
        if (xt1.t0.Zi().y0(str2) == null) {
            xt1.t0.Zi().mo880xb970c2b9(a(fg5Var));
        } else {
            xt1.t0.Zi().mo9952xce0038c9(a(fg5Var), new java.lang.String[0]);
        }
        java.util.List z07 = xt1.t0.aj().z0(str2);
        if (!((java.util.ArrayList) z07).isEmpty() && xt1.t0.aj().d(str2) && (eVar = this.f530844e) != null) {
            e(str2, z07, eVar);
        }
        java.util.Iterator it = fg5Var.f455856m.iterator();
        while (true) {
            java.lang.String str3 = null;
            if (!it.hasNext()) {
                break;
            }
            r45.eg5 eg5Var = (r45.eg5) it.next();
            xt1.o oVar = new xt1.o();
            oVar.f68370x95970a65 = str2;
            oVar.f68372xacb60e68 = eg5Var.f454997d;
            java.lang.String str4 = eg5Var.f454998e;
            if (str4 != null && str4.length() > 0) {
                try {
                    str3 = lu1.s.c("CbW9HMPiil38ldOjZp5WkwlIfzvLwiX6_" + gm0.j1.b().h() + "_" + str2, str4);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CardDymanicQrcodeOfflineHelper", e17, "", new java.lang.Object[0]);
                }
            }
            oVar.f68371x225a5212 = str3;
            xt1.t0.aj().mo880xb970c2b9(oVar);
        }
        lu1.e eVar2 = this.f530844e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "onSuccess()");
        if (this.f530843d != null) {
            while (r6 < ((java.util.ArrayList) this.f530843d).size()) {
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.ArrayList) this.f530843d).get(r6);
                if (weakReference != null && (mVar = (wt1.m) weakReference.get()) != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUIContoller", "onGetCodeSuccess! do update code view!");
                    android.os.Message obtain = android.os.Message.obtain();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.r0 r0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.r0(null);
                    r0Var.f176675a = com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.q0.onGetCodeSuccess;
                    r0Var.f176677c = eVar2;
                    obtain.obj = r0Var;
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) mVar).W.mo50308x2936bf5f(obtain);
                }
                r6++;
            }
        }
        gm0.j1.n().f354821b.q(1382, this);
    }
}
