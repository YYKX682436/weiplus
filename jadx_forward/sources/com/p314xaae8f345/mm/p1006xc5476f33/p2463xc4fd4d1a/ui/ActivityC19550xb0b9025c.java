package com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui;

/* renamed from: com.tencent.mm.plugin.wxcredit.ui.WalletBindDepositUI */
/* loaded from: classes9.dex */
public class ActivityC19550xb0b9025c extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f270048d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f270049e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f270050f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f270051g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f270052h = true;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c f270053i = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c();

    public final void U6() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f270053i.f261181e)) {
            this.f270050f.m83213x765074af("");
            return;
        }
        if (2 == this.f270053i.f261191r) {
            this.f270050f.m83213x765074af(this.f270053i.f261181e + " " + getString(com.p314xaae8f345.mm.R.C30867xcad56011.kki));
            return;
        }
        this.f270050f.m83213x765074af(this.f270053i.f261181e + " " + getString(com.p314xaae8f345.mm.R.C30867xcad56011.kl8));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d4x;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.kgn);
        com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c2 = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) findViewById(com.p314xaae8f345.mm.R.id.f569180pb4);
        this.f270048d = viewOnFocusChangeListenerC22907xe18534c2;
        qp5.p.a(viewOnFocusChangeListenerC22907xe18534c2);
        this.f270050f = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) findViewById(com.p314xaae8f345.mm.R.id.pbk);
        com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c22 = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) findViewById(com.p314xaae8f345.mm.R.id.jms);
        this.f270049e = viewOnFocusChangeListenerC22907xe18534c22;
        qp5.p.f(this, viewOnFocusChangeListenerC22907xe18534c22);
        this.f270051g = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.kao);
        m83125x8f91b80(this.f270048d, 0, false);
        m83125x8f91b80(this.f270049e, 0, false);
        this.f270050f.setOnClickListener(new e05.a(this));
        this.f270051g.setOnClickListener(new e05.b(this));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBindDepositUI", "onAcvityResult requestCode:" + i17);
        if (i18 == -1 && i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c c19097xe6dc5b4c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c) intent.getParcelableExtra("elemt_query");
            if (!c19097xe6dc5b4c.b()) {
                db5.e1.i(this, com.p314xaae8f345.mm.R.C30867xcad56011.kgl, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
            } else {
                this.f270053i = c19097xe6dc5b4c;
                U6();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        if ((r7 & r1) > 0) goto L26;
     */
    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo48630x76e0bfae(int r4, int r5, java.lang.String r6, com.p314xaae8f345.mm.p944x882e457a.m1 r7) {
        /*
            r3 = this;
            r6 = 0
            if (r4 != 0) goto L8a
            if (r5 != 0) goto L8a
            boolean r4 = r7 instanceof ss4.z
            if (r4 == 0) goto L8a
            ss4.z r7 = (ss4.z) r7
            com.tencent.mm.plugin.wallet_core.model.ElementQuery r4 = r7.f493681e
            if (r4 == 0) goto L8a
            boolean r4 = r4.b()
            r5 = 1
            r0 = 2131756315(0x7f10051b, float:1.9143534E38)
            if (r4 != 0) goto L20
            r4 = 2131779176(0x7f105e68, float:1.9189902E38)
            db5.e1.i(r3, r4, r0)
            return r5
        L20:
            com.tencent.mm.plugin.wallet_core.model.ElementQuery r4 = r7.f493681e
            r3.f270053i = r4
            r3.U6()
            com.tencent.mm.plugin.wallet_core.model.ElementQuery r4 = r3.f270053i
            boolean r7 = r4.f261189p
            if (r7 == 0) goto L3a
            boolean r4 = r4.c()
            if (r4 == 0) goto L3a
            r4 = 2131779144(0x7f105e48, float:1.9189837E38)
            db5.e1.i(r3, r4, r0)
            return r5
        L3a:
            com.tencent.mm.wallet_core.h r4 = com.p314xaae8f345.mm.p2802xd031a825.a.g(r3)
            if (r4 == 0) goto L86
            com.tencent.mm.plugin.wallet_core.model.ElementQuery r7 = r3.f270053i
            int r7 = r7.I
            android.os.Bundle r1 = r4.f295334c
            java.lang.String r2 = "key_support_bankcard"
            boolean r1 = r1.containsKey(r2)
            if (r1 != 0) goto L4f
            goto L57
        L4f:
            android.os.Bundle r1 = r4.f295334c
            int r1 = r1.getInt(r2, r5)
            if (r1 != 0) goto L59
        L57:
            r6 = r5
            goto L5f
        L59:
            l75.e0 r2 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c.A3
            r7 = r7 & r1
            if (r7 <= 0) goto L5f
            goto L57
        L5f:
            if (r6 != 0) goto L86
            boolean r4 = r4.r()
            java.lang.String r6 = "MicroMsg.WalletBindDepositUI"
            if (r4 == 0) goto L75
            java.lang.String r4 = "Overseas user try to bind domestic card!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r6, r4)
            r4 = 2131779067(0x7f105dfb, float:1.918968E38)
            db5.e1.i(r3, r4, r0)
            goto L80
        L75:
            java.lang.String r4 = "Domestic user try to bind international card!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r6, r4)
            r4 = 2131779066(0x7f105dfa, float:1.9189679E38)
            db5.e1.i(r3, r4, r0)
        L80:
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r4 = r3.f270048d
            r4.d()
            return r5
        L86:
            r3.U6()
            return r5
        L8a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ActivityC19550xb0b9025c.mo48630x76e0bfae(int, int, java.lang.String, com.tencent.mm.modelbase.m1):boolean");
    }
}
