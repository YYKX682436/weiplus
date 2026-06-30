package com.tencent.kinda.framework.module.impl;

/* loaded from: classes9.dex */
public class KindaCrtServiceImpl implements com.tencent.kinda.gen.KCrtService, com.tencent.mm.modelbase.u0 {
    private final java.lang.String TAG = "KindaCrtServiceImpl";
    private com.tencent.kinda.gen.VoidStringCallback m_deleteFailCallBack;
    private com.tencent.kinda.gen.VoidCallback m_deleteSuccessCallback;
    private com.tencent.kinda.gen.VoidStringCallback m_failCallback;
    private com.tencent.kinda.gen.KGenDigitalCrtReq m_req;
    private com.tencent.kinda.gen.VoidCallback m_successCallback;

    @Override // com.tencent.kinda.gen.KCrtService
    public void delCert() {
        this.m_deleteFailCallBack = null;
        this.m_deleteSuccessCallback = null;
        com.tencent.mm.wallet_core.model.p1.c().getClass();
        java.lang.String b17 = com.tencent.mm.wallet_core.model.p1.b();
        com.tencent.mars.xlog.Log.i("KindaCrtServiceImpl", "do delete cert: %s", b17);
        com.tencent.mm.wallet_core.model.p1.c().a(b17);
        gm0.j1.d().g(new com.tencent.mm.wallet_core.model.r0(b17));
    }

    @Override // com.tencent.kinda.gen.KCrtService
    public java.lang.String getCrtNo() {
        com.tencent.mm.wallet_core.model.p1.c().getClass();
        java.lang.String b17 = com.tencent.mm.wallet_core.model.p1.b();
        if (b17.isEmpty()) {
            com.tencent.mars.xlog.Log.e("KindaCrtServiceImpl", "crt_no is empty.");
            return null;
        }
        android.content.Context context = com.tencent.kinda.framework.widget.tools.KindaContext.get();
        if (context != null) {
            com.tencent.mm.wallet_core.model.j.b().e(context);
        }
        if (com.tencent.mm.wallet_core.model.j.b().f(b17)) {
            return b17;
        }
        com.tencent.mars.xlog.Log.e("KindaCrtServiceImpl", "crt_no is not exist.");
        return null;
    }

    @Override // com.tencent.kinda.gen.KCrtService
    public boolean hasCrt() {
        java.lang.String crtNo = getCrtNo();
        return (crtNo == null || crtNo.isEmpty()) ? false : true;
    }

    @Override // com.tencent.kinda.gen.KCrtService
    public boolean isCrtExist(java.lang.String str) {
        return com.tencent.mm.wallet_core.model.j.b().f(str);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.e("KindaCrtServiceImpl", "onSceneEnd. errCode: " + i18 + " errMsg: " + str);
        if (m1Var instanceof com.tencent.kinda.framework.module.impl.NetSceneKindaGenDigitalCert) {
            com.tencent.mars.xlog.Log.e("KindaCrtServiceImpl", "NetSceneKindaGenDigitalCert");
            if (i18 == 0) {
                com.tencent.kinda.gen.VoidCallback voidCallback = this.m_successCallback;
                if (voidCallback != null) {
                    voidCallback.call();
                } else {
                    com.tencent.mars.xlog.Log.e("KindaCrtServiceImpl", "m_successCallback is null!!");
                }
            } else {
                com.tencent.kinda.gen.VoidStringCallback voidStringCallback = this.m_failCallback;
                if (voidStringCallback != null) {
                    voidStringCallback.call(str);
                } else {
                    com.tencent.mars.xlog.Log.e("KindaCrtServiceImpl", "m_failCallback is null!!");
                }
            }
            gm0.j1.n().f273288b.q(fe1.o.CTRL_INDEX, this);
            return;
        }
        if (m1Var instanceof com.tencent.mm.wallet_core.model.r0) {
            com.tencent.mars.xlog.Log.e("KindaCrtServiceImpl", "NetSceneDeletedigitalcert");
            if (i18 == 0) {
                com.tencent.kinda.gen.VoidCallback voidCallback2 = this.m_deleteSuccessCallback;
                if (voidCallback2 != null) {
                    voidCallback2.call();
                } else {
                    com.tencent.mars.xlog.Log.e("KindaCrtServiceImpl", "m_deleteSuccessCallback is null!!");
                }
            } else {
                com.tencent.kinda.gen.VoidStringCallback voidStringCallback2 = this.m_deleteFailCallBack;
                if (voidStringCallback2 != null) {
                    voidStringCallback2.call(str);
                } else {
                    com.tencent.mars.xlog.Log.e("KindaCrtServiceImpl", "m_deleteFailCallBack is null!!");
                }
            }
            this.m_deleteFailCallBack = null;
            this.m_successCallback = null;
            gm0.j1.n().f273288b.q(fe1.o.CTRL_INDEX, this);
        }
    }

    @Override // com.tencent.kinda.gen.KCrtService
    public java.lang.String sign(java.lang.String str, byte[] bArr) {
        if (str == null || bArr == null) {
            return null;
        }
        android.content.Context context = com.tencent.kinda.framework.widget.tools.KindaContext.get();
        if (context != null) {
            com.tencent.mm.wallet_core.model.j.b().e(context);
        }
        java.lang.String a17 = com.tencent.mm.wallet_core.model.j.b().a(str, bArr);
        if (com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20743, "user_identification", "pay_cert_sign", "", "", "", "", java.lang.Integer.valueOf(com.tencent.mm.wallet_core.model.j.b().c()));
        }
        return a17;
    }

    @Override // com.tencent.kinda.gen.KCrtService
    public void startDeleteDigitalCrtImpl(java.lang.String str, com.tencent.kinda.gen.VoidCallback voidCallback, com.tencent.kinda.gen.VoidStringCallback voidStringCallback) {
        this.m_deleteSuccessCallback = voidCallback;
        this.m_deleteFailCallBack = voidStringCallback;
        com.tencent.mm.wallet_core.model.p1.c().a(str);
        com.tencent.mm.wallet_core.model.r0 r0Var = new com.tencent.mm.wallet_core.model.r0(str);
        gm0.j1.n().f273288b.a(1568, this);
        gm0.j1.d().g(r0Var);
    }

    @Override // com.tencent.kinda.gen.KCrtService
    public void startGenDigitalCrtImpl(com.tencent.kinda.gen.KGenDigitalCrtReq kGenDigitalCrtReq, com.tencent.kinda.gen.VoidCallback voidCallback, com.tencent.kinda.gen.VoidStringCallback voidStringCallback) {
        this.m_req = kGenDigitalCrtReq;
        this.m_successCallback = voidCallback;
        this.m_failCallback = voidStringCallback;
        gm0.j1.n().f273288b.a(fe1.o.CTRL_INDEX, this);
        com.tencent.kinda.framework.module.impl.NetSceneKindaGenDigitalCert netSceneKindaGenDigitalCert = new com.tencent.kinda.framework.module.impl.NetSceneKindaGenDigitalCert(kGenDigitalCrtReq);
        com.tencent.mars.xlog.Log.i("KindaCrtServiceImpl", "The Param of startGenDigitalCrtImpl is: " + kGenDigitalCrtReq.toString());
        gm0.j1.d().g(netSceneKindaGenDigitalCert);
    }

    @Override // com.tencent.kinda.gen.KCrtService
    public java.lang.String updateCurrentDeviceCertNoWithInfo(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
        byte[] binary = iTransmitKvData.getBinary("UserCertInfo");
        r45.uv6 uv6Var = new r45.uv6();
        try {
            uv6Var.parseFrom(binary);
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("KindaCrtServiceImpl", "userCertInfo parse failed");
        }
        if (uv6Var.f387687e == 0) {
            return "";
        }
        com.tencent.mm.wallet_core.model.p1.c().getClass();
        com.tencent.mars.xlog.Log.i("KindaCrtServiceImpl", "local crtNO: %s", com.tencent.mm.wallet_core.model.p1.b());
        java.util.LinkedList linkedList = uv6Var.f387692m;
        com.tencent.mars.xlog.Log.i("KindaCrtServiceImpl", "userCertInfo crt_list size: %d", java.lang.Integer.valueOf(linkedList.size()));
        for (int i17 = 0; i17 < linkedList.size(); i17++) {
            r45.mv mvVar = (r45.mv) linkedList.get(i17);
            if (mvVar.f380841f != 0 && !com.tencent.mm.sdk.platformtools.t8.K0(mvVar.f380842g)) {
                java.lang.String[] split = mvVar.f380842g.split("_");
                for (int i18 = 0; i18 < split.length; i18++) {
                    java.lang.String str = split[i18];
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                        com.tencent.mars.xlog.Log.e("KindaCrtServiceImpl", "crtNo.length == 0");
                    } else {
                        com.tencent.mars.xlog.Log.i("KindaCrtServiceImpl", "svr crtNo at index %d is %s", java.lang.Integer.valueOf(i18), str);
                        if (com.tencent.mm.wallet_core.model.j.b().f(str)) {
                            com.tencent.mars.xlog.Log.i("KindaCrtServiceImpl", "cert exists %s", str);
                            com.tencent.mm.wallet_core.model.p1.c().getClass();
                            if (str.equals(com.tencent.mm.wallet_core.model.p1.b())) {
                                com.tencent.mars.xlog.Log.i("KindaCrtServiceImpl", "svr cert equals to local certNo %s", str);
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
