package com.p314xaae8f345.mm.p2812xd0cf26bd.ui.p2813x2eaded;

/* renamed from: com.tencent.mm.wedrop.ui.code.TransferFileUIC */
/* loaded from: classes5.dex */
public final class C22927xe8447aa8 extends wm3.a implements ll5.h {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f295808d;

    /* renamed from: e, reason: collision with root package name */
    public em.j4 f295809e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f295810f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.wd0 f295811g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f295812h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f295813i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f295814m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f295815n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a f295816o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2812xd0cf26bd.ui.p2813x2eaded.C22929x74439d25 f295817p;

    /* renamed from: q, reason: collision with root package name */
    public long f295818q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2812xd0cf26bd.ui.p2813x2eaded.C22928xa5ad59cb f295819r;

    /* renamed from: s, reason: collision with root package name */
    public aq5.r0 f295820s;

    /* renamed from: t, reason: collision with root package name */
    public int f295821t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.tencent.mm.wedrop.ui.code.TransferFileUIC$wifiEventReceiver$1] */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.tencent.mm.wedrop.ui.code.TransferFileUIC$apEventReceiver$1] */
    public C22927xe8447aa8(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f295814m = jz5.h.b(new fq5.i(this));
        this.f295815n = jz5.h.b(new fq5.c(this));
        this.f295816o = new com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a("wedropScope", activity, 0, 4, null);
        this.f295817p = new android.content.BroadcastReceiver() { // from class: com.tencent.mm.wedrop.ui.code.TransferFileUIC$wifiEventReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context, android.content.Intent intent) {
                if (context == null || intent == null) {
                    return;
                }
                jq5.l lVar = jq5.n.f382815a;
                boolean z17 = lVar.c() && lVar.e();
                com.p314xaae8f345.mm.p2812xd0cf26bd.ui.p2813x2eaded.C22927xe8447aa8 c22927xe8447aa8 = com.p314xaae8f345.mm.p2812xd0cf26bd.ui.p2813x2eaded.C22927xe8447aa8.this;
                if (!z17) {
                    c22927xe8447aa8.V6(2);
                    return;
                }
                int i17 = c22927xe8447aa8.f295821t;
                if (i17 == 2 || i17 == 5) {
                    c22927xe8447aa8.U6();
                }
            }
        };
        this.f295819r = new android.content.BroadcastReceiver() { // from class: com.tencent.mm.wedrop.ui.code.TransferFileUIC$apEventReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context, android.content.Intent intent) {
                if (context == null || intent == null) {
                    return;
                }
                com.p314xaae8f345.mm.p2812xd0cf26bd.ui.p2813x2eaded.C22927xe8447aa8 c22927xe8447aa8 = com.p314xaae8f345.mm.p2812xd0cf26bd.ui.p2813x2eaded.C22927xe8447aa8.this;
                int i17 = c22927xe8447aa8.f295821t;
                if (i17 == 4 || i17 == 6) {
                    long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeDrop.TransferFileUIC", "apEventReceiver() called with: now = " + elapsedRealtime);
                    if (elapsedRealtime - c22927xe8447aa8.f295818q > 200) {
                        c22927xe8447aa8.f295818q = elapsedRealtime;
                        c22927xe8447aa8.U6();
                    }
                }
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x02cb, code lost:
    
        if (r9 == null) goto L200;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void T6(com.p314xaae8f345.mm.p2812xd0cf26bd.ui.p2813x2eaded.C22927xe8447aa8 r9, int r10) {
        /*
            Method dump skipped, instructions count: 804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2812xd0cf26bd.ui.p2813x2eaded.C22927xe8447aa8.T6(com.tencent.mm.wedrop.ui.code.TransferFileUIC, int):void");
    }

    public final void U6() {
        if (jq5.b.f382788a.b().i("is_first_receive", true)) {
            V6(1);
            return;
        }
        V6(3);
        v65.i.b(this.f295816o, null, new fq5.d(this, null), 1, null);
    }

    public final void V6(int i17) {
        android.view.View view;
        em.j4 j4Var = this.f295809e;
        if (j4Var == null || (view = j4Var.f336009a) == null) {
            return;
        }
        view.post(new fq5.j(this, i17));
    }

    @Override // ll5.h
    public android.view.View i2() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2755x2eaded.C22675xc8629185 c22675xc8629185 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2755x2eaded.C22675xc8629185(m80379x76847179(), null, 2, null);
        ll5.a aVar = new ll5.a();
        aVar.f400799d = com.p314xaae8f345.mm.R.raw.f80922x6741306;
        aVar.f400800e = c22675xc8629185.getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77788x5ac80f24);
        java.lang.String string = c22675xc8629185.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nyv);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        aVar.f400801f = string;
        java.lang.String string2 = c22675xc8629185.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nyt);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        aVar.f400802g = string2;
        ((hs.d0) ((kd0.i2) i95.n0.c(kd0.i2.class))).wi(kd0.g3.f388182n, aVar, ((java.lang.Number) ((jz5.n) this.f295814m).mo141623x754a37bb()).intValue(), null);
        aVar.f400804i = new fq5.a(this, c22675xc8629185);
        c22675xc8629185.m48330xfcfee142(aVar);
        return c22675xc8629185;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(this.f295817p, intentFilter);
        android.content.IntentFilter intentFilter2 = new android.content.IntentFilter();
        intentFilter2.addAction("android.net.wifi.WIFI_AP_STATE_CHANGED");
        intentFilter2.addAction("android.net.conn.TETHER_STATE_CHANGED");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(this.f295819r, intentFilter2);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        if (!this.f295812h) {
            aq5.p0.f94806a.f(this.f295820s, true);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.unregisterReceiver(this.f295817p);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.unregisterReceiver(this.f295819r);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeDrop.TransferFileUIC", "onDestroy() called, hasGoToTransferPage:" + this.f295812h);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        if (r2 == true) goto L18;
     */
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo2284x57429eec() {
        /*
            r10 = this;
            boolean r0 = r10.f295810f
            if (r0 != 0) goto L5
            goto L5c
        L5:
            int r0 = r10.f295821t
            r1 = 1
            r2 = 2
            r3 = 0
            if (r0 != r2) goto L3b
            em.j4 r0 = r10.f295809e
            if (r0 == 0) goto L34
            com.tencent.mm.wedrop.ui.view.PermissionAreaView r0 = r0.d()
            if (r0 == 0) goto L34
            java.util.List r0 = r0.f295824f
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
            r2 = r1
        L1f:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L31
            java.lang.Object r4 = r0.next()
            com.tencent.mm.wedrop.ui.view.PermissionLineView r4 = (com.p314xaae8f345.mm.p2812xd0cf26bd.ui.p2814x373aa5.C22931x315eebc8) r4
            boolean r4 = r4.g()
            r2 = r2 & r4
            goto L1f
        L31:
            if (r2 != r1) goto L34
            goto L35
        L34:
            r1 = r3
        L35:
            if (r1 == 0) goto L5a
            r10.U6()
            goto L5a
        L3b:
            if (r0 == r1) goto L5a
            r1 = 3
            if (r0 == r1) goto L5a
            boolean r0 = r10.f295812h
            if (r0 == 0) goto L5a
            androidx.appcompat.app.AppCompatActivity r0 = r10.m158354x19263085()
            kotlinx.coroutines.y0 r4 = v65.m.b(r0)
            kotlinx.coroutines.p0 r5 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            r6 = 0
            fq5.n r7 = new fq5.n
            r0 = 0
            r7.<init>(r10, r0)
            r8 = 2
            r9 = 0
            p3325xe03a0797.p3326xc267989b.l.d(r4, r5, r6, r7, r8, r9)
        L5a:
            r10.f295812h = r3
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2812xd0cf26bd.ui.p2813x2eaded.C22927xe8447aa8.mo2284x57429eec():void");
    }
}
