package com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui;

/* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexBaseUI */
/* loaded from: classes9.dex */
public abstract class AbstractActivityC16473xfb0d5c3 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e implements y60.e, at4.i0 {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f229771u = 0;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f229775g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f229776h;

    /* renamed from: p, reason: collision with root package name */
    public int f229781p;

    /* renamed from: q, reason: collision with root package name */
    public int f229782q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f229783r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f229784s;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f229772d = null;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.i f229773e = null;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f229774f = null;

    /* renamed from: i, reason: collision with root package name */
    public java.util.ArrayList f229777i = null;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f229778m = null;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f229779n = null;

    /* renamed from: o, reason: collision with root package name */
    public boolean f229780o = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f229785t = false;

    static {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.f573824fy2);
    }

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
    }

    public abstract void U6();

    public abstract void V6();

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19100xad1ade2c W6(java.util.List list) {
        if (list != null && list.size() != 0 && !android.text.TextUtils.isEmpty(this.f229778m)) {
            for (int i17 = 0; i17 < list.size(); i17++) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19100xad1ade2c c19100xad1ade2c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19100xad1ade2c) list.get(i17);
                if (c19100xad1ade2c != null && this.f229778m.equals(c19100xad1ade2c.f261352d)) {
                    return c19100xad1ade2c;
                }
            }
        }
        return null;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19100xad1ade2c X6(java.util.List list) {
        if (list != null && list.size() != 0 && !android.text.TextUtils.isEmpty(this.f229779n)) {
            for (int i17 = 0; i17 < list.size(); i17++) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19100xad1ade2c c19100xad1ade2c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19100xad1ade2c) list.get(i17);
                if (c19100xad1ade2c != null && this.f229779n.equals(c19100xad1ade2c.f261357i)) {
                    return c19100xad1ade2c;
                }
            }
        }
        return null;
    }

    public void Y6(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19100xad1ade2c c19100xad1ade2c, int i17) {
        int i18;
        if (c19100xad1ade2c != null && i17 >= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27 c19101x8593f27 = c19100xad1ade2c.f261360o;
            java.lang.String str = (c19101x8593f27 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19101x8593f27.f261367g)) ? "" : c19100xad1ade2c.f261360o.f261367g;
            java.util.ArrayList arrayList = this.f229777i;
            int size = arrayList == null ? 0 : arrayList.size();
            boolean d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.i.d(c19100xad1ade2c);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[10];
            objArr[0] = c19100xad1ade2c.f261352d;
            objArr[1] = java.lang.Integer.valueOf(size);
            objArr[2] = 0;
            objArr[3] = java.lang.Integer.valueOf(i17);
            objArr[4] = str;
            objArr[5] = java.lang.Integer.valueOf(d17 ? 2 : 1);
            objArr[6] = 1;
            objArr[7] = 0;
            objArr[8] = 0;
            objArr[9] = 0;
            g0Var.d(10881, objArr);
        }
        if (c19100xad1ade2c != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19100xad1ade2c.f261357i)) {
            if (((tg1.n) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.i6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.i6.class))).wi(c19100xad1ade2c.f261357i, null)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallIndexBaseUI", "handleFunction, intercept by AppBrandNativeLink, nativeUrl = %s", c19100xad1ade2c.f261357i);
                bt4.f.b().f(c19100xad1ade2c.f261352d);
                bt4.g.b().d(c19100xad1ade2c.f261352d);
                if (c19100xad1ade2c.f261360o != null) {
                    bt4.f.b().d(c19100xad1ade2c);
                    return;
                }
                return;
            }
        }
        int a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.n1.a(c19100xad1ade2c);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallIndexBaseUI", "functionType : " + a17);
        switch (a17) {
            case 0:
                android.content.Intent intent = new android.content.Intent();
                if (mo63463x4510f9c8()) {
                    intent.putExtra("key_is_hide_progress", true);
                }
                intent.putExtra("key_func_info", c19100xad1ade2c);
                j45.l.j(this, "recharge", ".ui.PhoneRechargeUI", intent, null);
                com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.n1.d(15, 0);
                return;
            case 1:
                gm0.j1.i();
                this.f229781p = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("rawUrl", c19100xad1ade2c.f261358m);
                intent2.putExtra("geta8key_username", c01.z1.r());
                intent2.putExtra("pay_channel", 1);
                intent2.putExtra("KPublisherId", "pay_wallet");
                intent2.putExtra("key_download_restrict", c19100xad1ade2c.f261363r);
                intent2.putExtra("key_wallet_region", this.f229781p);
                intent2.putExtra("key_function_id", c19100xad1ade2c.f261352d);
                intent2.putExtra(com.p314xaae8f345.mm.ui.w2.f292738r, true);
                intent2.putExtra("geta8key_scene", 46);
                com.p314xaae8f345.mm.p2802xd031a825.ui.r1.T(mo55332x76847179(), intent2);
                return;
            case 2:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MallIndexBaseUI", "doSelectFunction no jump");
                return;
            case 3:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MallIndexBaseUI", "doSelectFunction do nothing");
                db5.t7.m123883x26a183b(this, "fuction list error", 1).show();
                return;
            case 4:
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var2.d(11701, 0, 0, 0, 0, 1);
                android.content.Intent intent3 = new android.content.Intent();
                intent3.putExtra("pay_channel", 1);
                j45.l.j(this, "luckymoney", ".ui.LuckyMoneyIndexUI", intent3, null);
                com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.n1.d(13, 0);
                g0Var2.d(11850, 4, 0);
                return;
            case 5:
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var3.d(11458, 1);
                if (c01.z1.I()) {
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    java.util.LinkedList linkedList2 = new java.util.LinkedList();
                    linkedList.add(getString(com.p314xaae8f345.mm.R.C30867xcad56011.i1h));
                    linkedList2.add(0);
                    linkedList.add(getString(com.p314xaae8f345.mm.R.C30867xcad56011.b_x));
                    linkedList2.add(1);
                    i18 = 11850;
                    db5.e1.d(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574349hz3), linkedList, linkedList2, null, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.z(this));
                } else {
                    i18 = 11850;
                    gm0.j1.i();
                    com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
                    com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MALL_INDEX_HAS_SHOWN_FTF_NOTICE_BOOLEAN;
                    if (((java.lang.Boolean) c17.m(u3Var, java.lang.Boolean.FALSE)).booleanValue()) {
                        d7();
                    } else {
                        gm0.j1.i();
                        gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
                        db5.e1.t(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.kmt), "", new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.a0(this));
                    }
                }
                com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.n1.d(14, 0);
                g0Var3.d(i18, 3, 0);
                return;
            case 6:
                android.content.Intent intent4 = new android.content.Intent();
                intent4.putExtra("key_from_scene", 1);
                j45.l.j(mo55332x76847179(), "offline", ".ui.WalletOfflineEntranceUI", intent4, null);
                com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.n1.d(9, 0);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11850, 5, 0);
                return;
            case 7:
                android.content.Intent intent5 = new android.content.Intent();
                if (mo63463x4510f9c8()) {
                    intent5.putExtra("key_is_hide_progress", true);
                }
                intent5.putExtra("key_func_info", c19100xad1ade2c);
                j45.l.j(this, "recharge", ".ui.RechargeUI", intent5, null);
                return;
            case 8:
                android.content.Intent intent6 = new android.content.Intent();
                intent6.putExtra("BaseScanUI_select_scan_mode", 1);
                intent6.putExtra("key_scan_report_enter_scene", 3);
                j45.l.j(mo55332x76847179(), "scanner", ".ui.BaseScanUI", intent6, null);
                return;
            case 9:
                j45.l.h(mo55332x76847179(), "luckymoney", ".f2f.ui.LuckyMoneyF2FQRCodeUI");
                return;
            default:
                return;
        }
    }

    public abstract void Z6();

    public abstract boolean a7();

    public abstract void b7(android.view.View view);

    @Override // at4.i0
    public void c6(int i17, java.util.Map map, java.lang.Object[] objArr) {
        if (i17 != 12 || this.f229774f == null) {
            return;
        }
        j7();
    }

    public abstract void c7();

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: checkProcLife */
    public boolean mo66577x53f7ec9a() {
        return false;
    }

    public final void d7() {
        if (c01.z1.I()) {
            com.p314xaae8f345.mm.p2802xd031a825.a.k(mo55332x76847179(), "wallet_payu", "PayURemittanceProcess", null, null);
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("pay_channel", 1);
        com.p314xaae8f345.mm.p2802xd031a825.a.k(mo55332x76847179(), "remittance", "RemittanceProcess", bundle, null);
    }

    public abstract void e7();

    public abstract void f7();

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

    public abstract void h7();

    public abstract void i7();

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.v(this));
        this.f229772d = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.j9u);
        c7();
        Z6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.i iVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.i(this, this.f229781p);
        this.f229773e = iVar;
        this.f229772d.setAdapter((android.widget.ListAdapter) iVar);
        this.f229773e.f229926f = new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.y(this);
        b7(this.f229783r);
        this.f229775g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.af7);
        h7();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: isTransparent */
    public boolean mo63463x4510f9c8() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f229778m) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f229779n)) ? false : true;
    }

    public abstract void j7();

    public void k7() {
        java.util.ArrayList arrayList;
        int i17;
        boolean z17 = true;
        mo74408xb0dfae51(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.i iVar = this.f229773e;
        java.util.ArrayList arrayList2 = this.f229777i;
        java.util.ArrayList arrayList3 = (java.util.ArrayList) iVar.f229924d;
        arrayList3.clear();
        if (arrayList2 != null) {
            int i18 = 0;
            while (i18 < arrayList2.size()) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                int i19 = 0;
                while (i19 < 3) {
                    int i27 = i18 + i19;
                    if (i27 >= arrayList2.size() || (i19 > 0 && i27 - 1 >= 0 && ((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19100xad1ade2c) arrayList2.get(i17)).f261361p != ((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19100xad1ade2c) arrayList2.get(i27)).f261361p)) {
                        break;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.g gVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.g(iVar);
                    gVar.f229915b = i27;
                    gVar.f229914a = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19100xad1ade2c) arrayList2.get(i27);
                    arrayList4.add(gVar);
                    i19++;
                }
                if (arrayList4.size() > 0) {
                    arrayList3.add(arrayList4);
                }
                i18 += i19;
            }
            iVar.f229931n = 0;
            iVar.f229932o = 0;
            java.util.Iterator it = arrayList3.iterator();
            int i28 = -1;
            while (it.hasNext()) {
                java.util.ArrayList arrayList5 = (java.util.ArrayList) it.next();
                if (arrayList5.size() > 0) {
                    if (i28 != -1 && i28 != ((com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.g) arrayList5.get(0)).f229914a.f261361p) {
                        break;
                    }
                    iVar.f229931n += arrayList5.size();
                    iVar.f229932o++;
                    i28 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.g) arrayList5.get(0)).f229914a.f261361p;
                }
            }
            iVar.f229932o--;
        }
        iVar.f229925e = ef3.r.wi().Bi(iVar.f229929i).f95357y;
        if (arrayList3.size() > 3 && (arrayList = (java.util.ArrayList) arrayList3.get(3)) != null && arrayList.size() > 0) {
            int i29 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.g) arrayList.get(0)).f229914a.f261361p;
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19100xad1ade2c c19100xad1ade2c = ((com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.g) it6.next()).f229914a;
                if (c19100xad1ade2c.f261361p != i29) {
                    break;
                } else if (com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.i.d(c19100xad1ade2c)) {
                    break;
                }
            }
        }
        z17 = false;
        iVar.f229933p = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FunctionListAdapter", "hasMoreNewAtFirstSectionBottom: %s", java.lang.Boolean.valueOf(z17));
        iVar.notifyDataSetChanged();
        U6();
        i7();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1) {
            gm0.j1.i();
            this.f229781p = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallIndexBaseUI", "onCreate");
        super.onCreate(bundle);
        if (!gm0.j1.a()) {
            finish();
        }
        gm0.j1.i();
        int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
        this.f229781p = getIntent().getIntExtra("key_wallet_region", intValue);
        java.lang.String stringExtra = getIntent().getStringExtra("key_uuid");
        this.f229776h = stringExtra;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            this.f229776h = java.util.UUID.randomUUID().toString();
        }
        m83090x14f40144(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.j.f33899x366c91de);
        ((pg0.a3) i95.n0.c(pg0.a3.class)).aj().a(this);
        this.f229778m = getIntent().getStringExtra("key_func_id");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallIndexBaseUI", "mFuncId:" + this.f229778m + " wallet_region: " + this.f229781p + " walletType: " + c01.z1.m() + " default_region: " + intValue);
        this.f229779n = getIntent().getStringExtra("key_native_url");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mNativeUrl:");
        sb6.append(this.f229779n);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallIndexBaseUI", sb6.toString());
        if (mo63463x4510f9c8()) {
            return;
        }
        V6();
        mo67598xf0aced2e(0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallIndexBaseUI", "index Oncreate");
        f7();
        mo43517x10010bd5();
        bt4.f.a();
        e7();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallIndexBaseUI", "hy: use default controller for MallIndexUI");
        g7();
        if (c01.z1.I()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MallIndexBaseUI", "it is payu account ,not initFingerPrint");
        } else {
            pz2.a aVar = (pz2.a) gm0.j1.s(pz2.a.class);
            if (aVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallIndexBaseUI", "IFingerPrintMgr is not null, do showFingerPrintEntrance()");
                ((mz2.a) aVar).f(this);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MallIndexBaseUI", "IFingerPrintMgr is not null");
            }
        }
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.n1.d(1, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11850, 1, 0);
        android.os.Looper.myQueue().addIdleHandler(new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.C16474xf37c3b3e());
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        m83121xf6ff5b27(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.j.f33899x366c91de);
        ((pg0.a3) i95.n0.c(pg0.a3.class)).aj().b(this);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onProgressFinish */
    public boolean mo63464xa6efccdf() {
        if (mo63463x4510f9c8()) {
            return true;
        }
        k7();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        boolean z17 = true;
        h45.g0.f360478a = 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallIndexBaseUI", "index onResume");
        if (!gm0.j1.a()) {
            finish();
        }
        if (!mo63463x4510f9c8()) {
            a7();
            if (ef3.r.wi().Ai(this.f229781p) == null) {
                m83099x5406100e(new ef3.j(this.f229781p, bt4.d.a(), 0), true);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MallIndexBaseUI", "funcitonlist invalid");
                z17 = false;
            } else {
                m83099x5406100e(new ef3.j(this.f229781p, bt4.d.a(), 1), false);
                this.f229777i = ef3.r.wi().Ai(this.f229781p);
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallIndexBaseUI", "has data");
                k7();
                return;
            }
            return;
        }
        java.util.ArrayList Ai = ef3.r.wi().Ai(this.f229781p);
        this.f229777i = Ai;
        if (Ai != null && Ai.size() > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19100xad1ade2c W6 = W6(this.f229777i);
            if (W6 == null) {
                W6 = X6(this.f229777i);
            }
            Y6(W6, -1);
            finish();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallIndexBaseUI", "mFunctionList == null");
        try {
            if (getIntent().getIntExtra("key_scene", 0) != 1 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f229779n)) {
                java.lang.String stringExtra = getIntent().getStringExtra("key_url");
                m83096xe7b1ccf7(new ef3.j(this.f229781p, bt4.d.a(), getIntent().getStringExtra("key_app_id"), this.f229778m, stringExtra == null ? "" : stringExtra, 0));
            }
            m83096xe7b1ccf7(new ef3.j(this.f229781p, bt4.d.a(), 0));
        } catch (java.io.UnsupportedEncodingException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MallIndexBaseUI", e17, "", new java.lang.Object[0]);
            setResult(0);
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19100xad1ade2c c19100xad1ade2c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.s6 s6Var;
        if (m1Var instanceof us4.a) {
            if (i17 != 0 || i18 != 0) {
                finish();
                return true;
            }
            if (this.f229780o) {
                this.f229780o = false;
                if (((pg0.a3) i95.n0.c(pg0.a3.class)).cj().y0().f67049xff817ee4 == 0) {
                    com.p314xaae8f345.mm.p2802xd031a825.a.k(this, "wallet_payu", "PayUOpenProcess", null, null);
                    return true;
                }
            }
        }
        if (m1Var.mo808xfb85f7b0() != 495) {
            return false;
        }
        ef3.j jVar = (ef3.j) m1Var;
        int i19 = this.f229781p;
        if (jVar.f333946g != i19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallIndexBaseUI", "pass wallet local: %d cgi: %d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(jVar.f333946g));
        }
        if (!mo63463x4510f9c8()) {
            if (i17 == 0 && i18 == 0 && ef3.r.wi().Ai(this.f229781p) != null && jVar.f333943d != null) {
                this.f229777i = ef3.r.wi().Ai(this.f229781p);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallIndexBaseUI", "get from server now! " + this.f229781p + " " + this.f229777i.size());
                bt4.f b17 = bt4.f.b();
                java.util.ArrayList arrayList = this.f229777i;
                b17.getClass();
                if (arrayList != null) {
                    java.util.HashMap hashMap = (java.util.HashMap) b17.f106003a;
                    java.util.HashSet hashSet = new java.util.HashSet(hashMap.keySet());
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        hashSet.remove(((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19100xad1ade2c) it.next()).f261352d);
                    }
                    java.util.Iterator it6 = hashSet.iterator();
                    while (it6.hasNext()) {
                        hashMap.remove((java.lang.String) it6.next());
                    }
                    b17.g();
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(this.f229777i)) {
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    java.util.Iterator it7 = this.f229777i.iterator();
                    while (it7.hasNext()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19100xad1ade2c c19100xad1ade2c2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19100xad1ade2c) it7.next();
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19100xad1ade2c2.f261357i)) {
                            linkedList.add(c19100xad1ade2c2.f261357i);
                        }
                    }
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList) && (s6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.s6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.s6.class)) != null) {
                        s6Var.gd(linkedList);
                    }
                }
            }
            k7();
            boolean booleanExtra = getIntent().getBooleanExtra("key_wallet_has_red", false);
            if (this.f229772d.getChildCount() != 0) {
                int firstVisiblePosition = this.f229772d.getFirstVisiblePosition();
                int top = this.f229772d.getChildAt(0).getTop();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallIndexBaseUI", "initCheckNew %s fpos %s top %s", java.lang.Boolean.valueOf(booleanExtra), java.lang.Integer.valueOf(firstVisiblePosition), java.lang.Integer.valueOf(top));
                if (firstVisiblePosition == 0 && top == 0 && booleanExtra && !this.f229785t && this.f229777i != null) {
                    this.f229785t = true;
                    int headerViewsCount = this.f229772d.getHeaderViewsCount() + this.f229773e.getCount();
                    java.util.List list = this.f229773e.f229924d;
                    if (list != null) {
                        java.util.ArrayList arrayList2 = (java.util.ArrayList) list;
                        int size = arrayList2.size() - 1;
                        while (true) {
                            if (size <= 0) {
                                break;
                            }
                            java.util.Iterator it8 = ((java.util.ArrayList) arrayList2.get(size)).iterator();
                            while (it8.hasNext()) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.g gVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.g) it8.next();
                                if (gVar != null && (c19100xad1ade2c = gVar.f229914a) != null && com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.i.d(c19100xad1ade2c)) {
                                    int firstVisiblePosition2 = this.f229772d.getFirstVisiblePosition();
                                    int lastVisiblePosition = this.f229772d.getLastVisiblePosition();
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallIndexBaseUI", "get listview show top %s bottom %s redPos: %d", java.lang.Integer.valueOf(firstVisiblePosition2), java.lang.Integer.valueOf(lastVisiblePosition), java.lang.Integer.valueOf(headerViewsCount));
                                    if (headerViewsCount < firstVisiblePosition2 || headerViewsCount > lastVisiblePosition) {
                                        int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.b.f229867c;
                                        int i28 = com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.b.f229870f;
                                        int i29 = com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.b.f229868d;
                                        int i37 = i28 + ((headerViewsCount + 1) * i29) + i27;
                                        if (headerViewsCount > 2) {
                                            i37 += i27;
                                        }
                                        if (headerViewsCount > 3) {
                                            i37 += i27;
                                        }
                                        int scrollY = (i37 + (i29 / 3)) - this.f229772d.getScrollY();
                                        int i38 = com.p314xaae8f345.mm.ui.bk.h(this).y;
                                        if (com.p314xaae8f345.mm.ui.bk.k(this)) {
                                            i38 -= com.p314xaae8f345.mm.ui.bk.j(this);
                                        }
                                        if (mo2533x106ab264() != null) {
                                            i38 -= mo2533x106ab264().l();
                                        }
                                        this.f229772d.smoothScrollBy(scrollY - i38, 1000);
                                    }
                                }
                            }
                            headerViewsCount--;
                            size--;
                        }
                    }
                }
            }
            Z6();
        } else if (i17 == 0 && i18 == 0 && jVar.f333943d != null) {
            if (getIntent().getIntExtra("key_scene", 0) == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19100xad1ade2c W6 = W6(jVar.f333943d);
                if (W6 != null) {
                    Y6(W6, -1);
                }
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f229779n)) {
                java.util.ArrayList arrayList3 = jVar.f333943d;
                if (arrayList3 != null && arrayList3.size() > 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallIndexBaseUI", "functionScene.mFunctionList != null");
                    Y6(W6(jVar.f333943d), -1);
                } else if (ef3.r.wi().Ai(this.f229781p) == null || ef3.r.wi().Ai(this.f229781p).size() <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MallIndexBaseUI", "SubCoreMall.getCore().getFunctionList() == null");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallIndexBaseUI", "SubCoreMall.getCore().getFunctionList() != null");
                    Y6(W6(ef3.r.wi().Ai(this.f229781p)), -1);
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19100xad1ade2c X6 = X6(jVar.f333943d);
                if (X6 == null) {
                    setResult(0);
                    finish();
                    return true;
                }
                Y6(X6, -1);
            }
            setResult(-1);
            finish();
        } else {
            setResult(0);
            finish();
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
}
