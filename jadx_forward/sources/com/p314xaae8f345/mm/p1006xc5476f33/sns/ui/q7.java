package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class q7 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.u4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p7 f251863a;

    public q7(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p7 p7Var) {
        this.f251863a = p7Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.u4
    public void a(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onItemClick", "com.tencent.mm.plugin.sns.ui.PicWidget$1");
        final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p7 p7Var = this.f251863a;
        if (i17 < 0) {
            p7Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("selectPhoto", "com.tencent.mm.plugin.sns.ui.PicWidget");
            gm0.j1.i();
            boolean l17 = gm0.j1.u().l();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = p7Var.f251490c;
            if (!l17) {
                db5.t7.k(abstractActivityC21394xb3d2c0cf, null);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("selectPhoto", "com.tencent.mm.plugin.sns.ui.PicWidget");
            } else if (p7Var.f251697g.c() >= 9) {
                db5.e1.i(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.R.C30867xcad56011.jgz, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("selectPhoto", "com.tencent.mm.plugin.sns.ui.PicWidget");
            } else {
                if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ws.a()) {
                    p7Var.u();
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showAddPicDialog", "com.tencent.mm.plugin.sns.ui.PicWidget");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PicWidget", "showAddPicDialog: ");
                    try {
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) abstractActivityC21394xb3d2c0cf, 1, false);
                        k0Var.f293405n = new db5.o4() { // from class: com.tencent.mm.plugin.sns.ui.p7$$a
                            @Override // db5.o4
                            /* renamed from: onCreateMMMenu */
                            public final void mo887xc459429a(db5.g4 g4Var) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p7 p7Var2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p7.this;
                                p7Var2.getClass();
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$showAddPicDialog$0", "com.tencent.mm.plugin.sns.ui.PicWidget");
                                boolean z17 = x51.o1.f533575a;
                                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = p7Var2.f251490c;
                                g4Var.f(0, abstractActivityC21394xb3d2c0cf2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571940u4));
                                g4Var.f(1, abstractActivityC21394xb3d2c0cf2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571948uc));
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$showAddPicDialog$0", "com.tencent.mm.plugin.sns.ui.PicWidget");
                            }
                        };
                        k0Var.f293414s = new db5.t4() { // from class: com.tencent.mm.plugin.sns.ui.p7$$b
                            @Override // db5.t4
                            /* renamed from: onMMMenuItemSelected */
                            public final void mo888x34063ac(android.view.MenuItem menuItem, int i18) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p7 p7Var2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p7.this;
                                p7Var2.getClass();
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$showAddPicDialog$1", "com.tencent.mm.plugin.sns.ui.PicWidget");
                                int itemId = menuItem.getItemId();
                                if (itemId == 0) {
                                    p7Var2.q();
                                } else if (itemId == 1) {
                                    p7Var2.u();
                                }
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$showAddPicDialog$1", "com.tencent.mm.plugin.sns.ui.PicWidget");
                            }
                        };
                        k0Var.v();
                    } catch (java.lang.Exception unused) {
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showAddPicDialog", "com.tencent.mm.plugin.sns.ui.PicWidget");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("selectPhoto", "com.tencent.mm.plugin.sns.ui.PicWidget");
            }
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(p7Var.f251490c, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18130x2cb2ef37.class);
            intent.putExtra("sns_gallery_position", i17);
            intent.putExtra("sns_gallery_temp_paths", p7Var.f251697g.d());
            intent.putExtra("key_from_scene", 7);
            p7Var.f251490c.startActivityForResult(intent, 7);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onItemClick", "com.tencent.mm.plugin.sns.ui.PicWidget$1");
    }
}
