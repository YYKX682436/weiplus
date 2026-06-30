package com.p314xaae8f345.mm.p944x882e457a;

/* loaded from: classes12.dex */
public abstract class k1 implements com.p314xaae8f345.mm.p971x6de15a2e.v0 {
    private static final java.lang.String TAG = "MicroMsg.MMReqRespBase";
    private o45.zg req;

    /* renamed from: reqHost */
    private java.lang.String f32542x413aa366;

    /* renamed from: isUserCmd */
    private boolean f32540xd4abcce5 = false;

    /* renamed from: isSingleSession */
    private boolean f32539x74080c24 = true;

    /* renamed from: encryptAlgo */
    private int f32538x14f8a658 = 0;

    /* renamed from: newdnsBusinessType */
    private int f32541x52122943 = 0;

    /* renamed from: bindCellularStrategy */
    private com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.Task.EBindCellularStrategy f32537xbed9255a = com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.Task.EBindCellularStrategy.kDefault;

    /* renamed from: fillBaseReq */
    public static void m47970x3481750a(o45.zg zgVar, com.p314xaae8f345.mm.p944x882e457a.k1 k1Var) {
        int b17;
        zgVar.m150622xb8af8873(wo.w0.k());
        int i17 = o45.wf.f424556a;
        zgVar.m150623x4af50cb2(wo.q.f529313a);
        zgVar.mo150592x7e38194b(o45.wf.f424562g);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.p()) {
            b17 = com.p314xaae8f345.mm.p971x6de15a2e.x2.c().f153526n.f153435o;
        } else {
            o45.rg rgVar = o45.qg.f424533a;
            b17 = rgVar != null ? ((c01.f9) rgVar).b() : 0;
        }
        zgVar.mo150593xca029c98(b17);
        if (!o45.ag.f424425a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "summerauths check cgi[%s] USE_ECDH[%s] accHasReady[%s] ", java.lang.Integer.valueOf(zgVar.mo13850x7443ca3f()), java.lang.Boolean.valueOf(o45.ag.f424425a), java.lang.Boolean.valueOf(gm0.j1.a()));
            return;
        }
        int mo13822xfb85f7b0 = k1Var.mo13822xfb85f7b0();
        boolean z17 = com.p314xaae8f345.mm.p944x882e457a.a.f152116a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "summerauths check cgi[%s] accHasReady openSwitch[%s] ", java.lang.Integer.valueOf(mo13822xfb85f7b0), java.lang.Boolean.valueOf(z17));
        if (z17) {
            if (!com.p314xaae8f345.mm.p944x882e457a.j.c(zgVar.mo13850x7443ca3f())) {
                k1Var.mo47989x42fed7ec(false);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "summerauths UseAesGcmSessionKeySwitch open cgi[%s] singleSession[%s]", java.lang.Integer.valueOf(mo13822xfb85f7b0), java.lang.Boolean.valueOf(k1Var.mo47981x74080c24()));
        } else if (com.p314xaae8f345.mm.p944x882e457a.a.f152118c.contains(java.lang.Integer.valueOf(mo13822xfb85f7b0))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "summerauths check cgi list found cgi[%s] singleSession[%s]", java.lang.Integer.valueOf(mo13822xfb85f7b0), java.lang.Boolean.valueOf(k1Var.mo47981x74080c24()));
            if (com.p314xaae8f345.mm.p944x882e457a.j.c(zgVar.mo13850x7443ca3f())) {
                return;
            }
            k1Var.mo47989x42fed7ec(false);
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v0
    /* renamed from: bindCellularStrategy */
    public com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.Task.EBindCellularStrategy mo47971xbed9255a() {
        return this.f32537xbed9255a;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v0
    /* renamed from: getEncryptAlgo */
    public int mo47972xeeceed22() {
        return this.f32538x14f8a658;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v0
    /* renamed from: getIsLongPolling */
    public boolean mo47973xf2299a67() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v0
    /* renamed from: getIsUserCmd */
    public boolean mo47974xd4193e2f() {
        return this.f32540xd4abcce5;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v0
    /* renamed from: getLongPollingTimeout */
    public int mo47975xe6182bb0() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v0
    /* renamed from: getNewDNSBusinessType */
    public int mo47976x1de73f19() {
        return this.f32541x52122943;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v0
    /* renamed from: getNewExtFlags */
    public int mo25959xb6805570() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v0
    /* renamed from: getOptions */
    public int mo14486xf353c268() {
        return 0;
    }

    /* renamed from: getPush */
    public boolean mo47977xfb841790() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v0
    /* renamed from: getReqHost */
    public java.lang.String mo47978x7f07df30() {
        return this.f32542x413aa366;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v0
    /* renamed from: getReqObj */
    public final o45.zg mo47979x2d63726f() {
        if (this.req == null) {
            o45.zg mo13820xe7c2e2dd = mo13820xe7c2e2dd();
            this.req = mo13820xe7c2e2dd;
            m47970x3481750a(mo13820xe7c2e2dd, this);
        }
        return this.req;
    }

    /* renamed from: getReqObjImp */
    public abstract o45.zg mo13820xe7c2e2dd();

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v0
    /* renamed from: getTimeOut */
    public int mo47980xef7c110b() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v0
    /* renamed from: getTransHeader */
    public byte[] mo25964x2ee16a1f() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v0
    /* renamed from: isSingleSession */
    public boolean mo47981x74080c24() {
        return this.f32539x74080c24;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v0
    /* renamed from: keepAlive */
    public boolean mo47982x962be848() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v0
    /* renamed from: setBindCellularStrategy */
    public void mo47983xe6f810dc(com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.Task.EBindCellularStrategy eBindCellularStrategy) {
        this.f32537xbed9255a = eBindCellularStrategy;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v0
    /* renamed from: setConnectionInfo */
    public void mo47984x23eedae(java.lang.String str) {
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v0
    /* renamed from: setEncryptAlgo */
    public void mo47985x85346096(int i17) {
        this.f32538x14f8a658 = i17;
    }

    /* renamed from: setIsUserCmd */
    public void m47986x306cfea3(boolean z17) {
        this.f32540xd4abcce5 = z17;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v0
    /* renamed from: setNewDNSBusinessType */
    public void mo47987xb512c125(int i17) {
        this.f32541x52122943 = i17;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v0
    /* renamed from: setReqHost */
    public void mo47988xf2792ca4(java.lang.String str) {
        this.f32542x413aa366 = str;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v0
    /* renamed from: setSingleSession */
    public void mo47989x42fed7ec(boolean z17) {
        this.f32539x74080c24 = z17;
    }
}
