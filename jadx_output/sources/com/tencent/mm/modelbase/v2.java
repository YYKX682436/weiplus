package com.tencent.mm.modelbase;

/* loaded from: classes12.dex */
public class v2 extends com.tencent.mm.network.w0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.network.v0 f70827d;

    /* renamed from: e, reason: collision with root package name */
    public final q01.o0 f70828e;

    /* renamed from: f, reason: collision with root package name */
    public final o45.hg f70829f;

    /* renamed from: g, reason: collision with root package name */
    public final o45.kg f70830g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f70831h;

    public v2(com.tencent.mm.network.v0 v0Var, com.tencent.mm.sdk.platformtools.n3 n3Var, q01.o0 o0Var) {
        this.f70827d = v0Var;
        this.f70829f = new com.tencent.mm.modelbase.r2(v0Var.getReqObj(), v0Var.getType());
        this.f70830g = new com.tencent.mm.modelbase.y2(v0Var.getRespObj(), v0Var.getType());
        this.f70831h = n3Var;
        this.f70828e = o0Var;
    }

    @Override // com.tencent.mm.network.z0
    public com.tencent.mm.network.ReqInfo Ag(int i17) {
        ((com.tencent.mm.modelbase.r2) this.f70829f).a(i17);
        return Qc();
    }

    @Override // com.tencent.mm.network.z0
    public void Bg(com.tencent.mm.network.k0 k0Var, int i17, int i18) {
        this.f70831h.post(new com.tencent.mm.modelbase.t2(this, k0Var, i17, i18));
    }

    @Override // com.tencent.mm.network.z0
    public com.tencent.mm.network.BufToRespRes Cc(int i17, byte[] bArr) {
        com.tencent.mm.modelbase.r2 r2Var = (com.tencent.mm.modelbase.r2) this.f70829f;
        byte[] K6 = r2Var.K6();
        long eCDHEngine = r2Var.getECDHEngine();
        com.tencent.mm.modelbase.y2 y2Var = (com.tencent.mm.modelbase.y2) this.f70830g;
        boolean Zd = y2Var.Zd(i17, bArr, K6, eCDHEngine);
        byte[] bArr2 = y2Var.f70844g;
        int dc6 = y2Var.dc();
        int n86 = y2Var.n8();
        int serverSequenceId = y2Var.f70842e.getServerSequenceId();
        int cmdId = y2Var.f70842e.getCmdId();
        boolean b37 = r2Var.b3();
        boolean V7 = r2Var.V7();
        return new com.tencent.mm.network.BufToRespRes(bArr2, Zd ? 1 : 0, dc6, n86, serverSequenceId, cmdId, b37 ? 1 : 0, V7 ? 1 : 0, this.f70827d.getUri());
    }

    @Override // com.tencent.mm.network.z0
    public void G2(com.tencent.mm.network.k0 k0Var, int i17, int i18, java.lang.String str) {
        this.f70831h.post(new com.tencent.mm.modelbase.s2(this, i17, i18, str));
    }

    @Override // com.tencent.mm.network.z0
    public com.tencent.mm.network.ReqInfo Qc() {
        com.tencent.mm.network.v0 v0Var = this.f70827d;
        int type = v0Var.getType();
        java.lang.String uri = v0Var.getUri();
        boolean keepAlive = v0Var.keepAlive();
        com.tencent.mm.modelbase.r2 r2Var = (com.tencent.mm.modelbase.r2) this.f70829f;
        int cmdId = r2Var.f70792g.getCmdId();
        int options = v0Var.getOptions();
        boolean shortSupport = r2Var.f70792g.getShortSupport();
        boolean isLongPolling = v0Var.getIsLongPolling();
        int newDNSBusinessType = v0Var.getNewDNSBusinessType();
        int timeOut = v0Var.getTimeOut();
        int longPollingTimeout = v0Var.getLongPollingTimeout();
        boolean isUserCmd = v0Var.getIsUserCmd();
        int hashCode = v0Var.hashCode();
        int newExtFlags = v0Var.getNewExtFlags();
        boolean isSingleSession = v0Var.isSingleSession();
        boolean b37 = r2Var.b3();
        return new com.tencent.mm.network.ReqInfo(type, uri, keepAlive ? 1 : 0, cmdId, options, shortSupport ? 1 : 0, isLongPolling ? 1 : 0, newDNSBusinessType, timeOut, longPollingTimeout, isUserCmd ? 1 : 0, hashCode, newExtFlags, isSingleSession ? 1 : 0, b37 ? 1 : 0, v0Var.bindCellularStrategy().ordinal(), r2Var.f70798p);
    }

    @Override // com.tencent.mm.network.z0
    public void Re(com.tencent.mm.network.r rVar, com.tencent.mm.network.k0 k0Var, int i17, int i18) {
        this.f70831h.post(new com.tencent.mm.modelbase.u2(this, k0Var, i17, i18));
    }

    @Override // com.tencent.mm.network.z0
    public void S6(int i17) {
        q01.o0 o0Var = this.f70828e;
        if (o0Var != null) {
            o0Var.g(i17);
        }
    }

    @Override // com.tencent.mm.network.z0
    public int Zc() {
        byte[] bArr;
        int type = getType();
        com.tencent.mm.network.v0 v0Var = this.f70827d;
        if (type != 126) {
            if (type == 252 || type == 763 || type == 701 || type == 702) {
                return c01.f9.a(v0Var);
            }
            return -1;
        }
        o45.bi biVar = (o45.bi) v0Var.getReqObj();
        o45.ci ciVar = (o45.ci) v0Var.getRespObj();
        biVar.getClass();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMReqRespReg2", "summerauth decodeAndRetriveAccInfo type:%d, stack[%s]", 126, new com.tencent.mm.sdk.platformtools.z3());
        int i17 = ciVar.f342919f;
        if (i17 != 0) {
            return i17;
        }
        r45.xx5 xx5Var = ciVar.f342914a.f392389J;
        if (xx5Var != null) {
            int i18 = xx5Var.f390583g;
            r45.ig0 ig0Var = xx5Var.f390581e;
            byte[] d17 = x51.j1.d(xx5Var.f390584h);
            byte[] d18 = x51.j1.d(xx5Var.f390585i);
            byte[] d19 = x51.j1.d(xx5Var.f390582f);
            int i19 = ig0Var.f377012e.f371839d;
            com.tencent.mm.sdk.platformtools.t8.G1(com.tencent.mm.sdk.platformtools.t8.j(d19));
            com.tencent.mm.sdk.platformtools.t8.G1(com.tencent.mm.sdk.platformtools.t8.j(d17));
            com.tencent.mm.sdk.platformtools.t8.G1(com.tencent.mm.sdk.platformtools.t8.j(d18));
            byte[] d27 = x51.j1.d(ig0Var.f377012e);
            byte[] bArr2 = biVar.f342910b;
            if (com.tencent.mm.sdk.platformtools.t8.M0(d27)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MMReqRespReg2", "summerauth svr ecdh key is null!");
                bArr = null;
            } else {
                int length = d27.length;
                com.tencent.mm.sdk.platformtools.t8.G1(com.tencent.mm.sdk.platformtools.t8.j(d27));
                com.tencent.mm.sdk.platformtools.t8.G1(com.tencent.mm.sdk.platformtools.t8.j(bArr2));
                com.tencent.mm.pointers.PByteArray pByteArray = new com.tencent.mm.pointers.PByteArray();
                int computerKeyWithAllStr = com.tencent.mm.protocal.MMProtocalJni.computerKeyWithAllStr(ig0Var.f377011d, d27, bArr2, pByteArray, 0);
                bArr = pByteArray.value;
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[0] = java.lang.Integer.valueOf(computerKeyWithAllStr);
                objArr[1] = java.lang.Integer.valueOf(bArr != null ? bArr.length : -1);
                objArr[2] = com.tencent.mm.sdk.platformtools.t8.G1(com.tencent.mm.sdk.platformtools.t8.j(bArr));
                com.tencent.mars.xlog.Log.i("MicroMsg.MMReqRespReg2", "summerauth ComputerKeyWithAllStr ret:%d, agreedECDHKey len: %d, values:%s", objArr);
            }
            ciVar.f342915b = bArr != null ? bArr : new byte[0];
            if ((i18 & 4) == 0) {
                ciVar.a(d19, d17, d18);
                ciVar.f342919f = 1;
            } else if (com.tencent.mm.sdk.platformtools.t8.M0(bArr)) {
                ciVar.a(new byte[0], d17, d18);
                ciVar.f342919f = 2;
            } else {
                byte[] aesDecrypt = com.tencent.mm.protocal.MMProtocalJni.aesDecrypt(d19, bArr);
                com.tencent.mm.sdk.platformtools.t8.j(d19);
                com.tencent.mm.sdk.platformtools.t8.G1(com.tencent.mm.sdk.platformtools.t8.j(aesDecrypt));
                if (com.tencent.mm.sdk.platformtools.t8.M0(aesDecrypt)) {
                    ciVar.a(new byte[0], d17, d18);
                    ciVar.f342919f = 2;
                } else {
                    com.tencent.mm.sdk.platformtools.t8.G1(com.tencent.mm.sdk.platformtools.t8.j(aesDecrypt));
                    ciVar.a(aesDecrypt, d17, d18);
                    ciVar.f342919f = 1;
                }
            }
        } else {
            ciVar.a(new byte[0], new byte[0], new byte[0]);
            ciVar.f342919f = 2;
        }
        return ciVar.f342919f;
    }

    @Override // com.tencent.mm.network.z0
    public com.tencent.mm.network.ReqToBufRes g9(int i17, byte[] bArr, java.lang.String str, int i18, int i19, int i27, int i28, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i29, boolean z17, byte[] bArr5, boolean z18, int i37, boolean z19, boolean z27, boolean z28) {
        o45.hg hgVar = this.f70829f;
        if (z28) {
            ((com.tencent.mm.modelbase.r2) hgVar).li(z27);
        }
        com.tencent.mm.modelbase.r2 r2Var = (com.tencent.mm.modelbase.r2) hgVar;
        r2Var.zb(bArr);
        if (z18) {
            r2Var.L8(bArr5);
        }
        com.tencent.mm.network.v0 v0Var = this.f70827d;
        if (i17 != 0) {
            r2Var.U2(i17);
            r2Var.f70791f = v0Var.getTransHeader();
        }
        if (z19) {
            r2Var.getClass();
            if (z65.c.a() || bm5.o1.f22719a.a()) {
                r2Var.f70795m = i37;
            }
        }
        r2Var.d(i19);
        r2Var.a(i27);
        v0Var.setReqHost(str);
        v0Var.setEncryptAlgo(i18);
        return new com.tencent.mm.network.ReqToBufRes(r2Var.f70794i, r2Var.D2(i28, bArr2, i18, bArr3, bArr4, i29, z17) ? 1 : 0);
    }

    @Override // com.tencent.mm.network.z0
    public int getNewExtFlags() {
        return this.f70827d.getNewExtFlags();
    }

    @Override // com.tencent.mm.network.z0
    public o45.hg getReqObj() {
        return this.f70829f;
    }

    @Override // com.tencent.mm.network.z0
    public o45.kg getRespObj() {
        return this.f70830g;
    }

    @Override // com.tencent.mm.network.z0
    public byte[] getTransHeader() {
        return this.f70827d.getTransHeader();
    }

    @Override // com.tencent.mm.network.z0
    public int getType() {
        return this.f70827d.getType();
    }

    @Override // com.tencent.mm.network.z0
    public java.lang.String getUri() {
        return this.f70827d.getUri();
    }

    @Override // com.tencent.mm.network.z0
    public boolean isSingleSession() {
        return this.f70827d.isSingleSession();
    }

    @Override // com.tencent.mm.network.z0
    public int o2() {
        return this.f70827d.hashCode();
    }

    @Override // com.tencent.mm.network.z0
    public com.tencent.mm.network.RespInfo of(byte[] bArr) {
        com.tencent.mm.network.v0 v0Var = this.f70827d;
        o45.ah respObj = v0Var.getRespObj();
        o45.zg reqObj = v0Var.getReqObj();
        o45.kg kgVar = this.f70830g;
        byte[] bArr2 = ((com.tencent.mm.modelbase.y2) kgVar).f70844g;
        java.lang.String errMsg = respObj.getErrMsg();
        int retCode = respObj.getRetCode();
        java.lang.String cgiVerifyPublicKey = reqObj.getCgiVerifyPublicKey();
        java.lang.String cgiVerifyPrivateKey = reqObj.getCgiVerifyPrivateKey();
        int hashCode = v0Var.hashCode();
        ((com.tencent.mm.modelbase.y2) kgVar).s9(bArr);
        return new com.tencent.mm.network.RespInfo(bArr2, errMsg, retCode, cgiVerifyPublicKey, cgiVerifyPrivateKey, hashCode);
    }

    @Override // com.tencent.mm.network.z0
    public java.lang.String s7() {
        return this.f70827d.getReqObj().getCgiVerifyPrivateKey();
    }

    @Override // com.tencent.mm.network.z0
    public void setEncryptAlgo(int i17) {
        this.f70827d.setEncryptAlgo(i17);
    }

    @Override // com.tencent.mm.network.z0
    public void setReqHost(java.lang.String str) {
        this.f70827d.setReqHost(str);
    }

    @Override // com.tencent.mm.network.z0
    public void setSingleSession(boolean z17) {
        this.f70827d.setSingleSession(z17);
    }

    @Override // com.tencent.mm.network.z0
    public java.lang.String vh() {
        return this.f70827d.getReqObj().getCgiVerifyPublicKey();
    }

    @Override // com.tencent.mm.network.z0
    public void wa(java.util.Map map) {
        ((com.tencent.mm.modelbase.y2) this.f70830g).f70842e.setMMNativeNetTaskAdapterProfile(map);
    }
}
