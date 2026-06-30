package com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220;

/* renamed from: com.tencent.kinda.framework.module.impl.WXPNetSceneBase */
/* loaded from: classes12.dex */
public class C3261x5ce02b8f extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {
    private static final java.lang.String TAG = "MicroMsg.KindaLibWXPNetSceneBase";
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3437x23203a cgi;

    /* renamed from: cgiId */
    private int f12480x5a37c80;

    /* renamed from: cgiUri */
    private java.lang.String f12481xaecc42a7;

    /* renamed from: onSceneEndCallback */
    private com.p314xaae8f345.mm.p944x882e457a.u0 f12482x65cbb613;

    /* renamed from: respCmdId */
    private int f12483x88beba05 = 0;

    /* renamed from: wxpCommReqResp */
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3260xb1b43d3 f12484xd69f3b3;

    /* renamed from: com.tencent.kinda.framework.module.impl.WXPNetSceneBase$3, reason: invalid class name */
    /* loaded from: classes12.dex */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: $SwitchMap$com$tencent$kinda$gen$KindaNewDNSBusinessType */
        static final /* synthetic */ int[] f12491x5c51b523;

        static {
            int[] iArr = new int[com.p314xaae8f345.p347x615374d.gen.EnumC3565x34304f30.m28259xcee59d22().length];
            f12491x5c51b523 = iArr;
            try {
                iArr[com.p314xaae8f345.p347x615374d.gen.EnumC3565x34304f30.PAY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
        }
    }

    public C3261x5ce02b8f(int i17, int i18, java.lang.String str, int i19, int i27, int i28, byte[] bArr, com.p314xaae8f345.p347x615374d.gen.AbstractC3437x23203a abstractC3437x23203a, com.p314xaae8f345.p347x615374d.gen.AbstractC3484x5b74a360 abstractC3484x5b74a360) {
        this.f12480x5a37c80 = i18;
        this.f12481xaecc42a7 = str;
        this.cgi = abstractC3437x23203a;
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3260xb1b43d3 c3260xb1b43d3 = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3260xb1b43d3(bArr, str, i18, i17, 0, true, i28, i27, abstractC3437x23203a.mo27911x966afe1(), abstractC3484x5b74a360);
        this.f12484xd69f3b3 = c3260xb1b43d3;
        c3260xb1b43d3.mo47987xb512c125(m25991xf020b4d2(abstractC3437x23203a));
        m48018x2c3c6d81(true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "init scene: cgiId:%d, cgiUri:%s ", java.lang.Integer.valueOf(i18), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: clearField */
    public void m25990xd2ece2ad() {
        this.cgi = null;
        if (this.f12484xd69f3b3 != null) {
            this.f12484xd69f3b3 = null;
        }
    }

    /* renamed from: getCgiNewDNSBusinessType */
    private int m25991xf020b4d2(com.p314xaae8f345.p347x615374d.gen.AbstractC3437x23203a abstractC3437x23203a) {
        return com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3261x5ce02b8f.AnonymousClass3.f12491x5c51b523[abstractC3437x23203a.mo27908x1de73f19().ordinal()] != 1 ? 0 : 2;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: cancel */
    public void mo9408xae7a2e7a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "cancel: thread when doScene: %s, thread id: %d, cgiUri: %s", java.lang.Thread.currentThread(), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), this.f12481xaecc42a7);
        super.mo9408xae7a2e7a();
        if (this.cgi == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.module.impl.WXPNetSceneBase.2
            @Override // java.lang.Runnable
            public void run() {
                if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3261x5ce02b8f.this.cgi == null) {
                    return;
                }
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3261x5ce02b8f.this.cgi.mo27913xc39ed64f(1, null, null);
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3261x5ce02b8f.this.m25990xd2ece2ad();
            }
        });
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: dispatch */
    public int mo9409x10f9447a(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, com.p314xaae8f345.mm.p971x6de15a2e.l0 l0Var) {
        return super.mo9409x10f9447a(sVar, v0Var, l0Var);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f12482x65cbb613 = u0Var;
        rp3.c.a().getClass();
        return mo9409x10f9447a(sVar, this.f12484xd69f3b3, this);
    }

    /* renamed from: finalize */
    public void m25992xd764dc1e() {
        super.finalize();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return this.f12480x5a37c80;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, final int i18, final int i19, java.lang.String str, final com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "onGYNetEnd: %s, , uri: %s errType %d errCode %d errMsg %s", java.lang.Integer.valueOf(this.f12480x5a37c80), this.f12481xaecc42a7, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        final com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3260xb1b43d3.Resp resp = (com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3260xb1b43d3.Resp) v0Var.mo13821x7f35c2d1();
        if (this.cgi == null) {
            return;
        }
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.module.impl.WXPNetSceneBase.1
            @Override // java.lang.Runnable
            public void run() {
                r45.xw m150576x2b5bc573;
                if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3261x5ce02b8f.this.cgi == null) {
                    return;
                }
                java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
                hashMap.put("reqHost", v0Var.mo47978x7f07df30());
                hashMap.put("encryptAlgo", java.lang.Integer.toString(v0Var.mo47972xeeceed22()));
                hashMap.put("stn_errCode", java.lang.Integer.toString(i19));
                hashMap.put("stn_errType", java.lang.Integer.toString(i18));
                if (v0Var.mo13821x7f35c2d1() != null && (m150576x2b5bc573 = v0Var.mo13821x7f35c2d1().m150576x2b5bc573()) != null) {
                    long j17 = m150576x2b5bc573.f472086w;
                    long j18 = j17 - m150576x2b5bc573.f472085v;
                    hashMap.put("startTime", java.lang.String.valueOf(j17));
                    hashMap.put("startSendPacketTime", java.lang.String.valueOf(m150576x2b5bc573.f472074h + j18));
                    hashMap.put("sendPacketFinishedTime", java.lang.String.valueOf(m150576x2b5bc573.f472075i + j18));
                    hashMap.put("startDecodePacketTime", java.lang.String.valueOf(m150576x2b5bc573.f472078o + j18));
                    hashMap.put("decodePacketFinishedTime", java.lang.String.valueOf(m150576x2b5bc573.f472079p + j18));
                    hashMap.put("rtt", java.lang.String.valueOf(m150576x2b5bc573.f472081r));
                    hashMap.put(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56087x98abae37, m150576x2b5bc573.f472084u);
                }
                int i27 = i18;
                if (i27 == 0) {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3261x5ce02b8f.this.cgi.mo27913xc39ed64f(0, resp.m25981x66cabedc().m25984xfb7e5820(), hashMap);
                } else if (i27 == 4 && i19 == -102) {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3261x5ce02b8f.this.cgi.mo27913xc39ed64f(351, null, hashMap);
                } else {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3261x5ce02b8f.this.cgi.mo27913xc39ed64f(1, null, hashMap);
                }
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3261x5ce02b8f.this.m25990xd2ece2ad();
            }
        });
        this.f12482x65cbb613.mo815x76e0bfae(i18, i19, str, this);
    }
}
