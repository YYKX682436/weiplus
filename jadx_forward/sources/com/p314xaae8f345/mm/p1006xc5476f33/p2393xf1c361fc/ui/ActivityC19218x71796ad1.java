package com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/websearch/ui/WebSearchImageLoadingUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "ui-websearch_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.websearch.ui.WebSearchImageLoadingUI */
/* loaded from: classes12.dex */
public final class ActivityC19218x71796ad1 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f263186s = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f263188e;

    /* renamed from: g, reason: collision with root package name */
    public long f263190g;

    /* renamed from: i, reason: collision with root package name */
    public int f263192i;

    /* renamed from: m, reason: collision with root package name */
    public long f263193m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f263194n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f263195o;

    /* renamed from: r, reason: collision with root package name */
    public long f263198r;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f263187d = "MicroMsg.WebSearch.WebSearchImageLoadingUI";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f263189f = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f263191h = "";

    /* renamed from: p, reason: collision with root package name */
    public boolean f263196p = true;

    /* renamed from: q, reason: collision with root package name */
    public final vv4.k0 f263197q = new vv4.k0(this);

    public final void T6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f263187d, "cancelDownloadImage isDownloading: %b, imgLocalId: %d, msgId: %d, talker: %s", java.lang.Boolean.valueOf(this.f263194n), java.lang.Long.valueOf(this.f263193m), java.lang.Long.valueOf(this.f263188e), this.f263189f);
        if (this.f263194n || this.f263193m != 0) {
            ((m11.j) ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).Di()).g(this.f263193m, new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(this.f263188e, this.f263189f), 0, this.f263197q);
        }
    }

    public final void U6(int i17, java.lang.String str, java.lang.String str2, int i18, long j17) {
        pm0.v.K(null, new vv4.o0(str, this, i17, str2, i18, j17));
    }

    public final void V6(java.lang.String str, long j17, int i17, java.lang.String str2) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = pt0.f0.f439742b1.n(str, j17);
        p15.e eVar = new p15.e();
        java.lang.String str3 = n17.G;
        if (str3 == null) {
            str3 = "";
        }
        eVar.m126728xdc93280d(str3);
        p15.s q17 = eVar.q();
        java.lang.String m157696xfb865c31 = q17 != null ? q17.m157696xfb865c31() : null;
        java.lang.String str4 = m157696xfb865c31 != null ? m157696xfb865c31 : "";
        ry3.p pVar = new ry3.p();
        pVar.f483062c = j17;
        pVar.f483063d = str;
        pVar.f483060a = this.f263190g;
        pVar.f483066g = i17;
        pVar.f483067h = 4;
        r45.cj cjVar = new r45.cj();
        pVar.f483068i = cjVar;
        cjVar.f453112d = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(0);
        pVar.f483072m = this.f263196p;
        pVar.f483065f = str4;
        r45.e64 i18 = su4.r2.i();
        if (i18 != null) {
            r45.vi viVar = new r45.vi();
            pVar.f483069j = viVar;
            viVar.f469805e = i18.f454579d;
            viVar.f469804d = i18.f454580e;
            viVar.f469806f = i18.f454581f;
        }
        U6(2, str2, this.f263191h, 0, java.lang.System.currentTimeMillis());
        long Ni = ((yz3.w) ((ry3.j) i95.n0.c(ry3.j.class))).Ni(pVar, new vv4.s0(this, str2));
        this.f263198r = Ni;
        if (Ni != 0) {
            U6(4, str2, this.f263191h, 0, java.lang.System.currentTimeMillis());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0127, code lost:
    
        if (com.p314xaae8f345.mm.vfs.w6.j(r0) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01c7, code lost:
    
        if (com.p314xaae8f345.mm.vfs.w6.j(r2) != false) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W6(boolean r20) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19218x71796ad1.W6(boolean):void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d9m;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        T6();
        U6(11, "", this.f263191h, 0, java.lang.System.currentTimeMillis());
        this.f263195o = true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo74406x9c8c0d33(new vv4.l0(this), com.p314xaae8f345.mm.R.raw.f78352x20d6422c);
        mo54450xbf7c1df6("");
        this.f263188e = getIntent().getLongExtra("key_msg_id", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("key_msg_talker");
        this.f263189f = stringExtra != null ? stringExtra : "";
        this.f263190g = getIntent().getLongExtra("key_session_id", 0L);
        this.f263192i = getIntent().getIntExtra("key_scan_goods_request_type", 0);
        this.f263196p = getIntent().getBooleanExtra("key_upload_image_use_cdn_opt", true);
        java.lang.String c17 = o13.p.c(this.f263190g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getUnsignedLong(...)");
        this.f263191h = c17;
        W6(true);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        if (this.f263198r != 0) {
            ((yz3.w) ((ry3.j) i95.n0.c(ry3.j.class))).wi(this.f263198r);
        }
        super.onDestroy();
    }

    /* renamed from: showLoading */
    public final void m74088x2b33b77f() {
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366) findViewById(com.p314xaae8f345.mm.R.id.im6)).setImageResource(com.p314xaae8f345.mm.R.raw.f81382xf36fc2d6);
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366) findViewById(com.p314xaae8f345.mm.R.id.im6)).setImageResource(com.p314xaae8f345.mm.R.raw.f81395x45b05210);
        }
    }
}
