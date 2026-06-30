package ee4;

/* loaded from: classes4.dex */
public final class d1 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.u4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ee4.e1 f333231a;

    public d1(ee4.e1 e1Var) {
        this.f333231a = e1Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.u4
    public void a(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onItemClick", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicPreviewViewPc$previewImageClick$1");
        ee4.e1 e1Var = this.f333231a;
        e1Var.f("onItemClick : " + i17);
        if (i17 < 0) {
            ee4.e eVar = (ee4.e) e1Var.a(ee4.e.class);
            eVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClickAdd", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicAddItemClickPc");
            if (!gm0.j1.u().l()) {
                db5.t7.k(eVar.c(), null);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClickAdd", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicAddItemClickPc");
            } else if (eVar.m().v().f() >= 9) {
                db5.e1.i(eVar.c(), com.p314xaae8f345.mm.R.C30867xcad56011.jgz, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClickAdd", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicAddItemClickPc");
            } else {
                if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ws.a()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGoAlbumPc", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicBasePc");
                    ee4.m0 m0Var = (ee4.m0) ((jz5.n) eVar.f333281h).mo141623x754a37bb();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGoAlbumPc", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicBasePc");
                    m0Var.p();
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showAddPicDialog", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicAddItemClickPc");
                    eVar.f("showAddPicDialog: ");
                    try {
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) eVar.c(), 1, false);
                        k0Var.f293405n = new ee4.c(eVar);
                        k0Var.f293414s = new ee4.d(eVar);
                        k0Var.v();
                    } catch (java.lang.Exception e17) {
                        eVar.e("showAddPicDialog exception >> " + e17.getMessage());
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showAddPicDialog", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicAddItemClickPc");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClickAdd", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicAddItemClickPc");
            }
        } else {
            android.content.Intent intent = new android.content.Intent();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getContext", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicPreviewViewPc");
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf c17 = e1Var.c();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getContext", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicPreviewViewPc");
            intent.setClass(c17, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18130x2cb2ef37.class);
            intent.putExtra("sns_gallery_position", i17);
            intent.putParcelableArrayListExtra("sns_temp_multi_pic_items", new java.util.ArrayList<>(e1Var.m().v().e()));
            intent.putExtra("key_from_scene", 7);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getContext", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicPreviewViewPc");
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf c18 = e1Var.c();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getContext", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicPreviewViewPc");
            c18.startActivityForResult(intent, 7);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onItemClick", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicPreviewViewPc$previewImageClick$1");
    }
}
