package com.tencent.mm.modelbase;

/* loaded from: classes12.dex */
public abstract class k1 implements com.tencent.mm.network.v0 {
    private static final java.lang.String TAG = "MicroMsg.MMReqRespBase";
    private o45.zg req;
    private java.lang.String reqHost;
    private boolean isUserCmd = false;
    private boolean isSingleSession = true;
    private int encryptAlgo = 0;
    private int newdnsBusinessType = 0;
    private com.tencent.mars.stn.StnManager.Task.EBindCellularStrategy bindCellularStrategy = com.tencent.mars.stn.StnManager.Task.EBindCellularStrategy.kDefault;

    public static void fillBaseReq(o45.zg zgVar, com.tencent.mm.modelbase.k1 k1Var) {
        int b17;
        zgVar.setDeviceID(wo.w0.k());
        int i17 = o45.wf.f343023a;
        zgVar.setDeviceType(wo.q.f447780a);
        zgVar.setClientVersion(o45.wf.f343029g);
        if (com.tencent.mm.sdk.platformtools.x2.p()) {
            b17 = com.tencent.mm.network.x2.c().f71993n.f71902o;
        } else {
            o45.rg rgVar = o45.qg.f343000a;
            b17 = rgVar != null ? ((c01.f9) rgVar).b() : 0;
        }
        zgVar.setUin(b17);
        if (!o45.ag.f342892a) {
            com.tencent.mars.xlog.Log.i(TAG, "summerauths check cgi[%s] USE_ECDH[%s] accHasReady[%s] ", java.lang.Integer.valueOf(zgVar.getCmdId()), java.lang.Boolean.valueOf(o45.ag.f342892a), java.lang.Boolean.valueOf(gm0.j1.a()));
            return;
        }
        int type = k1Var.getType();
        boolean z17 = com.tencent.mm.modelbase.a.f70583a;
        com.tencent.mars.xlog.Log.i(TAG, "summerauths check cgi[%s] accHasReady openSwitch[%s] ", java.lang.Integer.valueOf(type), java.lang.Boolean.valueOf(z17));
        if (z17) {
            if (!com.tencent.mm.modelbase.j.c(zgVar.getCmdId())) {
                k1Var.setSingleSession(false);
            }
            com.tencent.mars.xlog.Log.i(TAG, "summerauths UseAesGcmSessionKeySwitch open cgi[%s] singleSession[%s]", java.lang.Integer.valueOf(type), java.lang.Boolean.valueOf(k1Var.isSingleSession()));
        } else if (com.tencent.mm.modelbase.a.f70585c.contains(java.lang.Integer.valueOf(type))) {
            com.tencent.mars.xlog.Log.i(TAG, "summerauths check cgi list found cgi[%s] singleSession[%s]", java.lang.Integer.valueOf(type), java.lang.Boolean.valueOf(k1Var.isSingleSession()));
            if (com.tencent.mm.modelbase.j.c(zgVar.getCmdId())) {
                return;
            }
            k1Var.setSingleSession(false);
        }
    }

    @Override // com.tencent.mm.network.v0
    public com.tencent.mars.stn.StnManager.Task.EBindCellularStrategy bindCellularStrategy() {
        return this.bindCellularStrategy;
    }

    @Override // com.tencent.mm.network.v0
    public int getEncryptAlgo() {
        return this.encryptAlgo;
    }

    @Override // com.tencent.mm.network.v0
    public boolean getIsLongPolling() {
        return false;
    }

    @Override // com.tencent.mm.network.v0
    public boolean getIsUserCmd() {
        return this.isUserCmd;
    }

    @Override // com.tencent.mm.network.v0
    public int getLongPollingTimeout() {
        return 0;
    }

    @Override // com.tencent.mm.network.v0
    public int getNewDNSBusinessType() {
        return this.newdnsBusinessType;
    }

    @Override // com.tencent.mm.network.v0
    public int getNewExtFlags() {
        return 0;
    }

    @Override // com.tencent.mm.network.v0
    public int getOptions() {
        return 0;
    }

    public boolean getPush() {
        return false;
    }

    @Override // com.tencent.mm.network.v0
    public java.lang.String getReqHost() {
        return this.reqHost;
    }

    @Override // com.tencent.mm.network.v0
    public final o45.zg getReqObj() {
        if (this.req == null) {
            o45.zg reqObjImp = getReqObjImp();
            this.req = reqObjImp;
            fillBaseReq(reqObjImp, this);
        }
        return this.req;
    }

    public abstract o45.zg getReqObjImp();

    @Override // com.tencent.mm.network.v0
    public int getTimeOut() {
        return 0;
    }

    @Override // com.tencent.mm.network.v0
    public byte[] getTransHeader() {
        return null;
    }

    @Override // com.tencent.mm.network.v0
    public boolean isSingleSession() {
        return this.isSingleSession;
    }

    @Override // com.tencent.mm.network.v0
    public boolean keepAlive() {
        return false;
    }

    @Override // com.tencent.mm.network.v0
    public void setBindCellularStrategy(com.tencent.mars.stn.StnManager.Task.EBindCellularStrategy eBindCellularStrategy) {
        this.bindCellularStrategy = eBindCellularStrategy;
    }

    @Override // com.tencent.mm.network.v0
    public void setConnectionInfo(java.lang.String str) {
    }

    @Override // com.tencent.mm.network.v0
    public void setEncryptAlgo(int i17) {
        this.encryptAlgo = i17;
    }

    public void setIsUserCmd(boolean z17) {
        this.isUserCmd = z17;
    }

    @Override // com.tencent.mm.network.v0
    public void setNewDNSBusinessType(int i17) {
        this.newdnsBusinessType = i17;
    }

    @Override // com.tencent.mm.network.v0
    public void setReqHost(java.lang.String str) {
        this.reqHost = str;
    }

    @Override // com.tencent.mm.network.v0
    public void setSingleSession(boolean z17) {
        this.isSingleSession = z17;
    }
}
