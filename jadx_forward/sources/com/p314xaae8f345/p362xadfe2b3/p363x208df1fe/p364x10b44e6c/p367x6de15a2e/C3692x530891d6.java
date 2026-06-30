package com.p314xaae8f345.p362xadfe2b3.p363x208df1fe.p364x10b44e6c.p367x6de15a2e;

/* renamed from: com.tencent.liteapp.framework.dynamic_module.network.PayMarsLiteAppScene */
/* loaded from: classes12.dex */
public class C3692x530891d6 extends com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3261x5ce02b8f {

    /* renamed from: CASHIER_PRIORITY */
    private static final int f14052xab0b6bc0 = 100;
    private static final java.lang.String TAG = "MicroMsg.paymars.scene.android";

    /* renamed from: cgiId */
    private final int f14055x5a37c80;

    /* renamed from: cgiUri */
    private final java.lang.String f14056xaecc42a7;

    /* renamed from: nativeCallbackPtr */
    private final java.util.concurrent.atomic.AtomicLong f14057x48fbabd2;

    /* renamed from: sNetworkService */
    private static final com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3254xffc5bb87 f14054x328f5bfa = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3254xffc5bb87();

    /* renamed from: sCrtService */
    private static final com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3230x73332fdd f14053xc3f309e3 = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3230x73332fdd();

    public C3692x530891d6(long j17, int i17, int i18, java.lang.String str, int i19, int i27, int i28, byte[] bArr, com.p314xaae8f345.p347x615374d.gen.AbstractC3437x23203a abstractC3437x23203a) {
        super(i17, i18, str, i19, i27, i28, bArr, abstractC3437x23203a, null);
        this.f14057x48fbabd2 = new java.util.concurrent.atomic.AtomicLong(j17);
        this.f14055x5a37c80 = i18;
        this.f14056xaecc42a7 = str;
        m48020x311b1826(100);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "init: cgiId:%d, cgiUri:%s, nativePtr:%d", java.lang.Integer.valueOf(i18), str, java.lang.Long.valueOf(j17));
    }

    /* renamed from: crtSign */
    public static java.lang.String m28808x3e1b5942(byte[] bArr) {
        try {
            if (bArr == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "crtSign: data is null");
                return null;
            }
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3230x73332fdd c3230x73332fdd = f14053xc3f309e3;
            if (!c3230x73332fdd.mo25863xb70438eb()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "crtSign: hasCrt=false, dataSize:%d", java.lang.Integer.valueOf(bArr.length));
                return null;
            }
            java.lang.String mo25862x74464cd0 = c3230x73332fdd.mo25862x74464cd0();
            if (mo25862x74464cd0 != null && !mo25862x74464cd0.isEmpty()) {
                java.lang.String mo25865x35ddbd = c3230x73332fdd.mo25865x35ddbd(mo25862x74464cd0, bArr);
                if (mo25865x35ddbd != null && !mo25865x35ddbd.isEmpty()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "crtSign: success, crtNo:%s, dataSize:%d, signLen:%d", mo25862x74464cd0, java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(mo25865x35ddbd.length()));
                    return "{\"crtNo\":\"" + mo25862x74464cd0 + "\",\"sign\":\"" + mo25865x35ddbd + "\"}";
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "crtSign: sign returned empty, crtNo:%s, dataSize:%d", mo25862x74464cd0, java.lang.Integer.valueOf(bArr.length));
                return null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "crtSign: getCrtNo returned empty despite hasCrt=true");
            return null;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "crtSign error: %s", th6.getMessage());
            return null;
        }
    }

    /* renamed from: getBaseRequest */
    public static byte[] m28809xa452ad48(int i17) {
        try {
            byte[] mo25944xa452ad48 = f14054x328f5bfa.mo25944xa452ad48(i17);
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Integer.valueOf(i17);
            objArr[1] = java.lang.Integer.valueOf(mo25944xa452ad48 != null ? mo25944xa452ad48.length : 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "getBaseRequest: scene:%d, resultSize:%d", objArr);
            return mo25944xa452ad48;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "getBaseRequest error: %s", th6.getMessage());
            return null;
        }
    }

    /* renamed from: nativeOnTaskEnd */
    private static native void m28810xda682be0(long j17, byte[] bArr, int i17, int i18, int i19, java.lang.String str);

    /* renamed from: startRequest */
    public static int m28811x394b73cd(long j17, byte[] bArr, java.lang.String str, int i17, int i18, int i19, int i27, int i28) {
        java.lang.Object[] objArr = new java.lang.Object[7];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = str;
        objArr[2] = java.lang.Integer.valueOf(bArr != null ? bArr.length : 0);
        objArr[3] = java.lang.Integer.valueOf(i19);
        objArr[4] = java.lang.Integer.valueOf(i27);
        objArr[5] = java.lang.Integer.valueOf(i28);
        objArr[6] = java.lang.Thread.currentThread().getName();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "startRequest: cgiId:%d, cgiUrl:%s, reqSize:%d, timeout:%d, retry:%d, channel:%d, thread:%s", objArr);
        com.p314xaae8f345.mm.p944x882e457a.f3 f3Var = com.p314xaae8f345.mm.p944x882e457a.z2.f152380b;
        com.p314xaae8f345.mm.p944x882e457a.r1 r1Var = f3Var != null ? ((gm0.n) f3Var).f354793a.f354821b : null;
        if (r1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "startRequest: NetSceneQueue not ready");
            return -1;
        }
        if (r1Var.h(new com.p314xaae8f345.p362xadfe2b3.p363x208df1fe.p364x10b44e6c.p367x6de15a2e.C3692x530891d6(j17, i18, i17, str, i28, i19, i27, bArr, new fd.c(i17, str)), 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "startRequest: queued ok, cgiId:%d, priority:%d", java.lang.Integer.valueOf(i17), 100);
            return 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "startRequest: queue.doScene rejected, cgiId:%d", java.lang.Integer.valueOf(i17));
        return -1;
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3261x5ce02b8f, com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: cancel */
    public void mo9408xae7a2e7a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "cancel: cgiId:%d, nativePtr:%d", java.lang.Integer.valueOf(this.f14055x5a37c80), java.lang.Long.valueOf(this.f14057x48fbabd2.get()));
        super.mo9408xae7a2e7a();
        long andSet = this.f14057x48fbabd2.getAndSet(0L);
        if (andSet != 0) {
            m28810xda682be0(andSet, null, 3, -1, 0, "canceled");
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3261x5ce02b8f, com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        int i27;
        int i28;
        byte[] bArr2;
        int i29;
        java.lang.String str2;
        byte[] bArr3;
        int i37;
        if (i18 == 0) {
            i28 = -1;
            try {
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3260xb1b43d3.Resp resp = (com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3260xb1b43d3.Resp) v0Var.mo13821x7f35c2d1();
                if (resp == null || resp.m25981x66cabedc() == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "onGYNetEnd: resp or responseWrapper is null despite errType=OK");
                    bArr3 = null;
                    i37 = 0;
                    str2 = "response wrapper is null";
                    i27 = 3;
                } else {
                    byte[] m25984xfb7e5820 = resp.m25981x66cabedc().m25984xfb7e5820();
                    i28 = i19;
                    i37 = resp.mo150578x7f2fddf8();
                    bArr3 = m25984xfb7e5820;
                    i27 = i18;
                    str2 = str;
                }
                i29 = i37;
                bArr2 = bArr3;
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "onGYNetEnd extract resp error: %s", th6.getMessage());
                bArr2 = null;
                i29 = 0;
                str2 = "extract resp failed: " + th6.getMessage();
                i27 = 3;
            }
        } else {
            i27 = i18;
            i28 = i19;
            bArr2 = null;
            i29 = 0;
            str2 = str;
        }
        java.lang.Object[] objArr = new java.lang.Object[7];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(this.f14055x5a37c80);
        objArr[2] = java.lang.Integer.valueOf(i27);
        objArr[3] = java.lang.Integer.valueOf(i28);
        objArr[4] = java.lang.Integer.valueOf(i29);
        objArr[5] = java.lang.Integer.valueOf(bArr2 != null ? bArr2.length : 0);
        objArr[6] = java.lang.Thread.currentThread().getName();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "onGYNetEnd: netId:%d, cgiId:%d, errType:%d, errCode:%d, retCode:%d, respSize:%d, thread:%s", objArr);
        long andSet = this.f14057x48fbabd2.getAndSet(0L);
        if (andSet != 0) {
            m28810xda682be0(andSet, bArr2, i27, i28, i29, str2);
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 m48002x65c7b8c0 = m48002x65c7b8c0();
        if (m48002x65c7b8c0 != null) {
            m48002x65c7b8c0.mo815x76e0bfae(i27, i28, str2, this);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "onGYNetEnd: queueCallback is null, scene may not be managed by queue");
        }
    }
}
