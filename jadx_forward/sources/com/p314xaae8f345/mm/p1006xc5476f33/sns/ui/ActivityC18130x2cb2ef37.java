package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI */
/* loaded from: classes4.dex */
public class ActivityC18130x2cb2ef37 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractActivityC18013x6b7f831d {
    public java.util.ArrayList S = new java.util.ArrayList();
    public java.util.ArrayList T = new java.util.ArrayList();
    public int U = 0;
    public final java.util.HashMap V = new java.util.HashMap();
    public boolean W = false;

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
            r7();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
            return true;
        }
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
        return dispatchKeyEvent;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractActivityC18013x6b7f831d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cqv;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        java.lang.String str;
        java.lang.String str2;
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5 = "initView";
        java.lang.String str6 = "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initView", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
        boolean booleanExtra = getIntent().getBooleanExtra("k_need_delete", true);
        java.lang.String stringExtra = getIntent().getStringExtra("sns_gallery_userName");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String str7 = stringExtra == null ? "" : stringExtra;
        this.S = getIntent().getStringArrayListExtra("sns_gallery_temp_paths");
        java.util.ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("sns_temp_multi_pic_items");
        this.T = parcelableArrayListExtra;
        if (this.S == null && parcelableArrayListExtra == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
            return;
        }
        boolean z18 = (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) ? false : true;
        this.W = z18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUploadBrowseUI", "initView >> isMultiItems: %b", java.lang.Boolean.valueOf(z18));
        this.U = getIntent().getIntExtra("sns_gallery_position", 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3(this);
        this.f248343o = c18064xe6e1a3b3;
        c18064xe6e1a3b3.m70767x464b3146(false);
        this.f248343o.m70782xe9aedf19(true);
        this.f248343o.m70786xa143192c(c7());
        if (this.W) {
            java.util.ArrayList arrayList2 = this.T;
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.f246209d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUploadsList", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            if (arrayList2 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUploadsList", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
                str = "initView";
                str2 = "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI";
            } else {
                java.util.Iterator it6 = arrayList2.iterator();
                int i18 = 0;
                while (it6.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.AbstractC18435x78de886c abstractC18435x78de886c = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.AbstractC18435x78de886c) it6.next();
                    r45.m33 m33Var = new r45.m33();
                    r45.jj4 jj4Var = new r45.jj4();
                    if (abstractC18435x78de886c.e()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.C18437xfbc5d82 c18437xfbc5d82 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.C18437xfbc5d82) abstractC18435x78de886c;
                        boolean m17 = c18437xfbc5d82.m();
                        it = it6;
                        str3 = str5;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoStorageLogic", "getUploadsList >> livePhotoItem: id: %d, isParseFinish, %b", java.lang.Long.valueOf(c18437xfbc5d82.g()), java.lang.Boolean.valueOf(m17));
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pre_temp_sns_live_photo");
                        str4 = str6;
                        sb6.append(c18437xfbc5d82.g());
                        jj4Var.f459388d = sb6.toString();
                        jj4Var.f459393i = c18437xfbc5d82.b();
                        r45.jj4 jj4Var2 = new r45.jj4();
                        if (m17) {
                            jj4Var2.f459391g = c18437xfbc5d82.i();
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTempVideoPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
                            java.lang.String str8 = c18437xfbc5d82.f252753t;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTempVideoPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
                            jj4Var2.f459391g = str8;
                        }
                        jj4Var.X = jj4Var2;
                    } else {
                        it = it6;
                        str3 = str5;
                        str4 = str6;
                        jj4Var.f459388d = "pre_temp_extend_pic" + abstractC18435x78de886c.b();
                    }
                    m33Var.f461642d = jj4Var;
                    m33Var.f461643e = "";
                    m33Var.f461645g = i18;
                    arrayList3.add(m33Var);
                    i18++;
                    it6 = it;
                    str5 = str3;
                    str6 = str4;
                }
                str = str5;
                str2 = str6;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUploadsList", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            }
            arrayList = arrayList3;
        } else {
            str = "initView";
            str2 = "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI";
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Ni();
            java.util.ArrayList<java.lang.String> arrayList4 = this.S;
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.f246209d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUploadsList", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            if (arrayList4 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUploadsList", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            } else {
                arrayList5.clear();
                int i27 = 0;
                for (java.lang.String str9 : arrayList4) {
                    r45.m33 m33Var2 = new r45.m33();
                    r45.jj4 jj4Var3 = new r45.jj4();
                    jj4Var3.f459388d = "pre_temp_extend_pic" + str9;
                    m33Var2.f461642d = jj4Var3;
                    m33Var2.f461643e = "";
                    m33Var2.f461645g = i27;
                    arrayList5.add(m33Var2);
                    i27++;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUploadsList", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            }
            arrayList = arrayList5;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b32 = this.f248343o;
        android.view.View m78513xc2a54588 = m78513xc2a54588();
        c18064xe6e1a3b32.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSetTouchScalePreviewLayout", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        c18064xe6e1a3b32.f248721b2 = true;
        c18064xe6e1a3b32.f248722c2 = m78513xc2a54588;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSetTouchScalePreviewLayout", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        if (this.f248335d) {
            this.f248343o.X(arrayList, str7, this.U, b7(), this);
        } else {
            this.f248343o.X(arrayList, str7, this.U, a7(), this);
        }
        this.f248343o.m70779x76fc4600(this);
        m70700xbb8aeee6(this.f248343o);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.vt(this));
        if (booleanExtra) {
            m78478x84f07bce(0, com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0, com.p314xaae8f345.mm.R.raw.f80075x444ae503, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.yt(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, str2);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUploadBrowseUI", "onAcvityResult requestCode:" + i17);
        if (i18 != -1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractActivityC18013x6b7f831d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
        com.p314xaae8f345.mm.ui.bk.u0(this);
        super.onCreate(bundle);
        mo43517x10010bd5();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractActivityC18013x6b7f831d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().N(this);
        super.onDestroy();
        dx1.g.f326022a.j("SnsPublishProcess", "mediaPreviewPageStaytime_", java.lang.Long.valueOf(mo78509x4b0ac5a2()), bx1.u.f117843e);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractActivityC18013x6b7f831d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3 = this.f248343o;
        if (c18064xe6e1a3b3 != null) {
            c18064xe6e1a3b3.b0();
        }
        super.onPause();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractActivityC18013x6b7f831d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
        super.onResume();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3 = this.f248343o;
        if (c18064xe6e1a3b3 != null) {
            c18064xe6e1a3b3.c0(false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractActivityC18013x6b7f831d, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ak
    public void q6(r45.jj4 jj4Var, int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPageChange", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
        super.q6(jj4Var, i17, str);
        this.V.put(java.lang.Integer.valueOf(i17), java.lang.Boolean.TRUE);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPageChange", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
    }

    public void r7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("finishWithIntent", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
        android.content.Intent intent = new android.content.Intent();
        java.util.List<r45.m33> m70756xea2e6421 = this.f248343o.m70756xea2e6421();
        if (m70756xea2e6421 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("finishWithIntent", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUploadBrowseUI", "finishWithIntent >> isMultiItems: %b", java.lang.Boolean.valueOf(this.W));
        if (this.W) {
            this.T.clear();
            for (r45.m33 m33Var : m70756xea2e6421) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUploadBrowseUI", "finishWithIntent >> mediaId: %s", m33Var.f461642d.f459388d);
                if (m33Var.f461642d.f459388d.startsWith("pre_temp_sns_live_photo")) {
                    this.T.add(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.C18437xfbc5d82(m33Var.f461642d.f459393i, 0, 0, 0L, 0L, 0L, "", "", "", 0, 0, 0, "", "", new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1999xc84c5534.C17030x7c2c6071(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1999xc84c5534.C17030x7c2c6071.f237399u)));
                } else {
                    java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Ni() + m33Var.f461642d.f459388d;
                    if (m33Var.f461642d.f459388d.startsWith("pre_temp_extend_pic")) {
                        str = m33Var.f461642d.f459388d.substring(19);
                    }
                    this.T.add(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.C18436x91cb1037(str, 0, 0, 0));
                }
            }
            intent.putParcelableArrayListExtra("sns_temp_multi_pic_items", this.T);
        } else {
            this.S.clear();
            for (r45.m33 m33Var2 : m70756xea2e6421) {
                java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Ni() + m33Var2.f461642d.f459388d;
                if (m33Var2.f461642d.f459388d.startsWith("pre_temp_extend_pic")) {
                    str2 = m33Var2.f461642d.f459388d.substring(19);
                }
                this.S.add(str2);
            }
            intent.putExtra("sns_gallery_temp_paths", this.S);
        }
        java.util.HashMap hashMap = this.V;
        intent.putExtra("sns_update_preview_image_count", hashMap.size());
        hashMap.clear();
        setResult(-1, intent);
        finish();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("finishWithIntent", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractActivityC18013x6b7f831d, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n4
    public void s3(boolean z17, java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("notifyData", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3 = this.f248343o;
        if (c18064xe6e1a3b3 != null) {
            if (z17) {
                c18064xe6e1a3b3.c0(true);
            } else {
                c18064xe6e1a3b3.W();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyData", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractActivityC18013x6b7f831d, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n4
    public void y1(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSelectedId", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSelectedId", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
    }
}
