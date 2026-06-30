package com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui;

/* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2 */
/* loaded from: classes9.dex */
public abstract class AbstractActivityC16475xe6d27f7f extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e implements y60.e, at4.i0 {

    /* renamed from: w, reason: collision with root package name */
    public static final java.lang.String[] f229786w = {"moneydata.hk", "wechatpay.com.hk"};

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f229790g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.C22905xef04d72d f229791h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f229792i;

    /* renamed from: q, reason: collision with root package name */
    public int f229797q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f229798r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f229799s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.RelativeLayout f229800t;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f229787d = null;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.o f229788e = null;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f229789f = null;

    /* renamed from: m, reason: collision with root package name */
    public java.util.ArrayList f229793m = null;

    /* renamed from: n, reason: collision with root package name */
    public java.util.ArrayList f229794n = null;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f229795o = null;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f229796p = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f229801u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f229802v = false;

    /* JADX WARN: Code restructure failed: missing block: B:83:0x02a0, code lost:
    
        r0 = r0.buildUpon();
        r0.appendQueryParameter("wx_client_click_time", java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
        r0.appendQueryParameter("wx_client_render_opt", java.lang.String.valueOf(r16));
        r0 = r0.build().toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexBaseUIv2", "wrapUrlWithWebViewRenderOptParams src:%s", r7);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexBaseUIv2", "wrapUrlWithWebViewRenderOptParams wrapUrl:%s", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02d8, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void V6(com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16475xe6d27f7f r17, r45.n53 r18, int r19) {
        /*
            Method dump skipped, instructions count: 911
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16475xe6d27f7f.V6(com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2, r45.n53, int):void");
    }

    private com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19100xad1ade2c a7(java.util.List list) {
        if (list != null && list.size() != 0 && !android.text.TextUtils.isEmpty(this.f229795o)) {
            for (int i17 = 0; i17 < list.size(); i17++) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19100xad1ade2c c19100xad1ade2c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19100xad1ade2c) list.get(i17);
                if (c19100xad1ade2c != null && this.f229795o.equals(c19100xad1ade2c.f261352d)) {
                    return c19100xad1ade2c;
                }
            }
        }
        return null;
    }

    private com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19100xad1ade2c b7(java.util.List list) {
        if (list != null && list.size() != 0 && !android.text.TextUtils.isEmpty(this.f229796p)) {
            for (int i17 = 0; i17 < list.size(); i17++) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19100xad1ade2c c19100xad1ade2c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19100xad1ade2c) list.get(i17);
                if (c19100xad1ade2c != null && this.f229796p.equals(c19100xad1ade2c.f261357i)) {
                    return c19100xad1ade2c;
                }
            }
        }
        return null;
    }

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
    }

    public final void U6() {
        r45.r67 r67Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        int lastVisiblePosition = this.f229787d.getLastVisiblePosition();
        if (lastVisiblePosition <= this.f229787d.getHeaderViewsCount()) {
            return;
        }
        int headerViewsCount = lastVisiblePosition <= this.f229787d.getHeaderViewsCount() + this.f229788e.getCount() ? lastVisiblePosition - this.f229787d.getHeaderViewsCount() : this.f229788e.getCount();
        java.util.List list = this.f229788e.f229982d;
        for (int i17 = 0; i17 < headerViewsCount; i17++) {
            java.util.Iterator it = ((java.util.ArrayList) ((java.util.ArrayList) list).get(i17)).iterator();
            while (it.hasNext()) {
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.m) it.next()) != null) {
                    sb6.append(java.lang.Long.toString(r8.f229974a.f462615d.f463529d & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2));
                    sb6.append(";");
                }
            }
        }
        int i18 = headerViewsCount - 1;
        if (i18 < 0) {
            return;
        }
        int intValue = ((java.lang.Integer) bt4.d.e(this.f229797q).get(((com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.m) ((java.util.ArrayList) ((java.util.ArrayList) list).get(i18)).get(0)).f229974a.f462622n)).intValue();
        int i19 = this.f229797q;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedList linkedList = bt4.d.d(i19).f463581d;
        if (linkedList != null) {
            for (int i27 = 0; i27 < linkedList.size(); i27++) {
                r45.o53 o53Var = (r45.o53) linkedList.get(i27);
                if (o53Var != null && (r67Var = o53Var.f463473d) != null) {
                    arrayList.add(java.lang.Integer.valueOf(r67Var.f466114d));
                }
            }
        }
        for (int i28 = 0; i28 < intValue; i28++) {
            sb7.append(arrayList.get(i28));
            sb7.append(";");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexBaseUIv2", "exposure report productID：%s、groupId：%s", sb6, sb7);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(20548, sb6, sb7);
    }

    public abstract void W6();

    public abstract void X6();

    public abstract void Y6();

    public abstract int Z6();

    @Override // at4.i0
    public void c6(int i17, java.util.Map map, java.lang.Object[] objArr) {
        if (i17 != 12 || this.f229789f == null) {
            return;
        }
        m7();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c7(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19100xad1ade2c r12, int r13) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16475xe6d27f7f.c7(com.tencent.mm.plugin.wallet_core.model.mall.MallFunction, int):void");
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: checkProcLife */
    public boolean mo66577x53f7ec9a() {
        return false;
    }

    public abstract void d7();

    public abstract boolean e7();

    public abstract void f7(android.view.View view);

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
    }

    public abstract void g7();

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bw8;
    }

    public void h7() {
    }

    public abstract void i7();

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.c0(this));
        this.f229800t = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.m7o);
        this.f229787d = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.j9u);
        g7();
        d7();
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.o oVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.o(this, this.f229797q);
        this.f229788e = oVar;
        this.f229787d.setAdapter((android.widget.ListAdapter) oVar);
        this.f229788e.f229984f = new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.f0(this);
        f7(this.f229798r);
        this.f229790g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.af7);
        com.p314xaae8f345.mm.p2802xd031a825.ui.C22905xef04d72d c22905xef04d72d = (com.p314xaae8f345.mm.p2802xd031a825.ui.C22905xef04d72d) findViewById(com.p314xaae8f345.mm.R.id.pga);
        this.f229791h = c22905xef04d72d;
        c22905xef04d72d.a();
        k7();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: isTransparent */
    public boolean mo63463x4510f9c8() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f229795o) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f229796p)) ? false : true;
    }

    public abstract void j7();

    public abstract void k7();

    public abstract void l7();

    public abstract void m7();

    public void n7() {
        r45.r67 r67Var;
        int i17;
        int i18;
        int i19;
        mo74408xb0dfae51(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.o oVar = this.f229788e;
        if (oVar != null) {
            java.util.ArrayList arrayList = this.f229794n;
            java.util.ArrayList arrayList2 = (java.util.ArrayList) oVar.f229982d;
            arrayList2.clear();
            if (arrayList != null) {
                for (int i27 = 0; i27 < arrayList.size(); i27 += i17) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    i17 = 0;
                    while (i17 < 4 && (i18 = i27 + i17) < arrayList.size() && (i17 <= 0 || i18 - 1 < 0 || ((r45.n53) arrayList.get(i19)).f462622n == ((r45.n53) arrayList.get(i18)).f462622n)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.m mVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.m(oVar);
                        mVar.f229975b = i18;
                        mVar.f229974a = (r45.n53) arrayList.get(i18);
                        arrayList3.add(mVar);
                        i17++;
                    }
                    if (arrayList3.size() > 0) {
                        arrayList2.add(arrayList3);
                    }
                }
            }
            android.util.SparseArray sparseArray = new android.util.SparseArray();
            java.util.LinkedList linkedList = bt4.d.d(oVar.f229987i).f463581d;
            if (linkedList != null) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    r45.o53 o53Var = (r45.o53) it.next();
                    if (o53Var != null && (r67Var = o53Var.f463473d) != null) {
                        sparseArray.put(r67Var.f466114d, r67Var.f466115e);
                    }
                }
            }
            oVar.f229983e = sparseArray;
            oVar.notifyDataSetChanged();
        }
        W6();
        X6();
        l7();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1) {
            gm0.j1.i();
            this.f229797q = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
            if (i18 == -1) {
                if (c01.z1.z()) {
                    finish();
                    return;
                }
                finish();
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5924xbbf53cb8 c5924xbbf53cb8 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5924xbbf53cb8();
                c5924xbbf53cb8.f136226g.f88501a = mo55332x76847179();
                c5924xbbf53cb8.e();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexBaseUIv2", "onCreate");
        super.onCreate(bundle);
        if (!gm0.j1.a()) {
            finish();
        }
        gm0.j1.i();
        int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
        this.f229797q = getIntent().getIntExtra("key_wallet_region", intValue);
        java.lang.String stringExtra = getIntent().getStringExtra("key_uuid");
        this.f229792i = stringExtra;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            this.f229792i = java.util.UUID.randomUUID().toString();
        }
        m83090x14f40144(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.j.f33899x366c91de);
        m83090x14f40144(4362);
        ((pg0.a3) i95.n0.c(pg0.a3.class)).aj().a(this);
        this.f229795o = getIntent().getStringExtra("key_func_id");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexBaseUIv2", "mFuncId:" + this.f229795o + " wallet_region: " + this.f229797q + " walletType: " + c01.z1.m() + " default_region: " + intValue);
        this.f229796p = getIntent().getStringExtra("key_native_url");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mNativeUrl:");
        sb6.append(this.f229796p);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexBaseUIv2", sb6.toString());
        if (mo63463x4510f9c8()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexBaseUIv2", "Oncreate：isTransparent()");
            return;
        }
        Y6();
        mo67598xf0aced2e(0);
        j7();
        mo43517x10010bd5();
        bt4.f.a();
        i7();
        if (c01.z1.I()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicorMsg.MallIndexBaseUIv2", "it is payu account ,not initFingerPrint");
        } else {
            pz2.a aVar = (pz2.a) gm0.j1.s(pz2.a.class);
            if (aVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexBaseUIv2", "IFingerPrintMgr is not null, do showFingerPrintEntrance()");
                ((mz2.a) aVar).f(this);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicorMsg.MallIndexBaseUIv2", "IFingerPrintMgr is not null");
            }
        }
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.n1.d(1, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11850, 1, 0);
        android.os.Looper.myQueue().addIdleHandler(new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.C16476x9e36802());
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        m83121xf6ff5b27(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.j.f33899x366c91de);
        m83121xf6ff5b27(4362);
        ((pg0.a3) i95.n0.c(pg0.a3.class)).aj().b(this);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onProgressFinish */
    public boolean mo63464xa6efccdf() {
        if (mo63463x4510f9c8()) {
            return true;
        }
        n7();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        android.widget.RelativeLayout relativeLayout;
        super.onResume();
        boolean z17 = true;
        h45.g0.f360478a = 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexBaseUIv2", "onResume");
        if (!gm0.j1.a()) {
            finish();
        }
        if (!mo63463x4510f9c8() && (relativeLayout = this.f229800t) != null) {
            relativeLayout.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.b0(this));
        }
        if (!mo63463x4510f9c8()) {
            e7();
            if (bt4.d.b(this.f229797q).size() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicorMsg.MallIndexBaseUIv2", "funcitonlist invalid");
                m83099x5406100e(new ef3.k(this.f229797q, false), true);
                z17 = false;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexBaseUIv2", "funcitonlist has cache");
                m83099x5406100e(new ef3.k(this.f229797q, true), false);
                this.f229794n = bt4.d.b(this.f229797q);
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexBaseUIv2", "has data");
                n7();
                U6();
                return;
            }
            return;
        }
        java.util.ArrayList Ai = ef3.r.wi().Ai(this.f229797q);
        this.f229793m = Ai;
        if (Ai != null && Ai.size() > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19100xad1ade2c a76 = a7(this.f229793m);
            if (a76 == null) {
                a76 = b7(this.f229793m);
            }
            c7(a76, -1);
            finish();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexBaseUIv2", "mFunctionList == null");
        try {
            if (getIntent().getIntExtra("key_scene", 0) != 1 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f229796p)) {
                java.lang.String stringExtra = getIntent().getStringExtra("key_url");
                m83096xe7b1ccf7(new ef3.j(this.f229797q, bt4.d.a(), getIntent().getStringExtra("key_app_id"), this.f229795o, stringExtra == null ? "" : stringExtra, 0));
            }
            m83096xe7b1ccf7(new ef3.j(this.f229797q, bt4.d.a(), 0));
        } catch (java.io.UnsupportedEncodingException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicorMsg.MallIndexBaseUIv2", e17, "", new java.lang.Object[0]);
            setResult(0);
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.c77 c77Var;
        r45.n53 n53Var;
        m1Var.mo808xfb85f7b0();
        if (m1Var.mo808xfb85f7b0() != 4362) {
            if (m1Var.mo808xfb85f7b0() != 495) {
                return false;
            }
            ef3.j jVar = (ef3.j) m1Var;
            int i19 = this.f229797q;
            if (jVar.f333946g != i19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexBaseUIv2", "pass wallet local: %d cgi: %d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(jVar.f333946g));
            }
            if (mo63463x4510f9c8()) {
                if (i17 == 0 && i18 == 0 && jVar.f333943d != null) {
                    if (getIntent().getIntExtra("key_scene", 0) == 1) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19100xad1ade2c a76 = a7(jVar.f333943d);
                        if (a76 != null) {
                            c7(a76, -1);
                        }
                    } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f229796p)) {
                        java.util.ArrayList arrayList = jVar.f333943d;
                        if (arrayList != null && arrayList.size() > 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexBaseUIv2", "functionScene.mFunctionList != null");
                            c7(a7(jVar.f333943d), -1);
                        } else if (ef3.r.wi().Ai(this.f229797q) == null || ef3.r.wi().Ai(this.f229797q).size() <= 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicorMsg.MallIndexBaseUIv2", "SubCoreMall.getCore().getFunctionList() == null");
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexBaseUIv2", "SubCoreMall.getCore().getFunctionList() != null");
                            c7(a7(ef3.r.wi().Ai(this.f229797q)), -1);
                        }
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19100xad1ade2c b76 = b7(jVar.f333943d);
                        if (b76 == null) {
                            setResult(0);
                            finish();
                            return true;
                        }
                        c7(b76, -1);
                    }
                    setResult(-1);
                    finish();
                } else {
                    setResult(0);
                    finish();
                }
            }
            return true;
        }
        ef3.k kVar = (ef3.k) m1Var;
        int i27 = this.f229797q;
        if (kVar.f333950g != i27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexBaseUIv2", "pass wallet local: %d cgi: %d", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(kVar.f333950g));
        }
        if (i17 == 0 && i18 == 0) {
            this.f229794n = bt4.d.b(this.f229797q);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexBaseUIv2", "get from server now! " + this.f229797q + " " + this.f229794n.size());
            bt4.f b17 = bt4.f.b();
            java.util.ArrayList arrayList2 = this.f229794n;
            b17.getClass();
            if (arrayList2 != null) {
                java.util.HashMap hashMap = (java.util.HashMap) b17.f106003a;
                java.util.HashSet hashSet = new java.util.HashSet(hashMap.keySet());
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    hashSet.remove(((r45.n53) it.next()).f462615d.f463529d + "");
                }
                java.util.Iterator it6 = hashSet.iterator();
                while (it6.hasNext()) {
                    hashMap.remove((java.lang.String) it6.next());
                }
                b17.g();
            }
        }
        n7();
        boolean booleanExtra = getIntent().getBooleanExtra("key_wallet_has_red", false);
        if (this.f229787d.getChildCount() != 0) {
            int firstVisiblePosition = this.f229787d.getFirstVisiblePosition();
            int top = this.f229787d.getChildAt(0).getTop();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexBaseUIv2", "initCheckNew %s fpos %s top %s", java.lang.Boolean.valueOf(booleanExtra), java.lang.Integer.valueOf(firstVisiblePosition), java.lang.Integer.valueOf(top));
            if (firstVisiblePosition == 0 && top == 0 && booleanExtra && !this.f229801u && this.f229794n != null) {
                this.f229801u = true;
                int headerViewsCount = this.f229787d.getHeaderViewsCount() + this.f229788e.getCount();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexBaseUIv2", "mFunctionsGv.getHeaderViewsCount()： %s mFunctionAdapter.getCount(): %s", java.lang.Integer.valueOf(this.f229787d.getHeaderViewsCount()), java.lang.Integer.valueOf(this.f229788e.getCount()));
                java.util.List list = this.f229788e.f229982d;
                if (list != null) {
                    java.util.ArrayList arrayList3 = (java.util.ArrayList) list;
                    int size = arrayList3.size() - 1;
                    while (true) {
                        if (size <= 0) {
                            break;
                        }
                        java.util.Iterator it7 = ((java.util.ArrayList) arrayList3.get(size)).iterator();
                        while (it7.hasNext()) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.m mVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.m) it7.next();
                            if (mVar != null && (n53Var = mVar.f229974a) != null && com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.o.c(n53Var)) {
                                int firstVisiblePosition2 = this.f229787d.getFirstVisiblePosition();
                                int lastVisiblePosition = this.f229787d.getLastVisiblePosition();
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexBaseUIv2", "get listview show top %s bottom %s redPos: %d", java.lang.Integer.valueOf(firstVisiblePosition2), java.lang.Integer.valueOf(lastVisiblePosition), java.lang.Integer.valueOf(headerViewsCount));
                                if (headerViewsCount < firstVisiblePosition2 || headerViewsCount > lastVisiblePosition) {
                                    int Z6 = Z6() + (com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.b.f229868d * (headerViewsCount + 1)) + ((i65.a.b(mo55332x76847179(), 48) + i65.a.b(mo55332x76847179(), 8)) * ((java.lang.Integer) bt4.d.e(this.f229797q).get(mVar.f229974a.f462622n)).intValue());
                                    int i28 = com.p314xaae8f345.mm.ui.bk.h(this).y;
                                    if (com.p314xaae8f345.mm.ui.bk.k(this)) {
                                        i28 -= com.p314xaae8f345.mm.ui.bk.j(this);
                                    }
                                    if (mo2533x106ab264() != null) {
                                        i28 -= mo2533x106ab264().l();
                                    }
                                    this.f229787d.smoothScrollBy(((Z6 - i28) - this.f229787d.getScrollY()) + (com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.b.f229868d / 3), 1000);
                                    r45.n53 n53Var2 = mVar.f229974a;
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexBaseUIv2", "offset function is %s, groupName is %s", n53Var2.f462615d.f463530e, java.lang.Integer.valueOf(n53Var2.f462622n));
                                } else {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexBaseUIv2", "the last redDot item is visible");
                                }
                            }
                        }
                        headerViewsCount--;
                        size--;
                    }
                }
            }
        }
        d7();
        U6();
        java.util.ArrayList arrayList4 = this.f229794n;
        if (arrayList4 != null && !arrayList4.isEmpty()) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.Iterator it8 = arrayList4.iterator();
            while (it8.hasNext()) {
                r45.n53 n53Var3 = (r45.n53) it8.next();
                r45.n67 n67Var = n53Var3.f462617f;
                if (n67Var != null && n67Var.f462646g == 2 && (c77Var = n67Var.f462645f) != null && !android.text.TextUtils.isEmpty(c77Var.f452894d)) {
                    linkedList.add(n53Var3.f462617f.f462645f.f452894d);
                }
            }
            if (!linkedList.isEmpty()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.s6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.s6.class)).Y4(linkedList);
            }
        }
        java.util.ArrayList arrayList5 = this.f229794n;
        if (arrayList5 != null && arrayList5.size() > 0) {
            java.util.Iterator it9 = this.f229794n.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    break;
                }
                r45.n67 n67Var2 = ((r45.n53) it9.next()).f462617f;
                if (n67Var2 != null && n67Var2.f462646g == 2) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5.class)).Rh(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6.G);
                    break;
                }
            }
        }
        if (kVar.f333949f == null) {
            new r45.o93();
        }
        r45.o93 o93Var = kVar.f333949f;
        if (o93Var == null) {
            o93Var = new r45.o93();
        }
        r45.g7 g7Var = o93Var.f463583f;
        if (g7Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexBaseUIv2", "alert info is null");
        } else if (!g7Var.f456467d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexBaseUIv2", "need alert is false");
        } else if (this.f229802v) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexBaseUIv2", "has show tips halfpage, ignore show");
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(mo55332x76847179(), 2, 3, false);
            android.view.View inflate = android.view.View.inflate(mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.dv7, null);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.obc);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g7Var.f456468e)) {
                textView.setText("");
            } else {
                textView.setText(g7Var.f456468e);
            }
            com.p314xaae8f345.mm.ui.bk.s0(textView.getPaint());
            z2Var.t(inflate);
            android.view.View inflate2 = android.view.View.inflate(mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.dv6, null);
            android.widget.TextView textView2 = (android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.cgi);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g7Var.f456469f)) {
                textView2.setText("");
            } else {
                textView2.setText(g7Var.f456469f);
            }
            z2Var.j(inflate2);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g7Var.f456470g)) {
                z2Var.y(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
            } else {
                z2Var.y(g7Var.f456470g);
            }
            z2Var.x(1);
            z2Var.z(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560252fa));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexBaseUIv2", "show alert dialog, title is : %s, desc is : %s", textView.getText(), textView2.getText());
            z2Var.F = new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.g0(this, z2Var);
            this.f229802v = true;
            h7();
            z2Var.C();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14419, this.f229792i, 7);
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: setStatusColor */
    public void mo66578x399050cf() {
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: shouldFixStatusBar */
    public void mo66579x11aba77f() {
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(hf3.c.class);
        hashSet.add(hf3.e.class);
    }
}
