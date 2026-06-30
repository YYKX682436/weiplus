package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public final class o7 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p7 {
    public final java.lang.String K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.K = "MicroMsg.SnsUpload.PicV2Widget";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p7
    public android.view.View s(android.view.View view, android.view.View view2, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a c18379xb7ff44a, android.view.View view3, android.view.View view4) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initView", "com.tencent.mm.plugin.sns.ui.PicV2Widget");
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(this.f251698h == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.K, "initView: previewImage null[%b]", objArr);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.v4 v4Var = this.f251698h;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.x7 x7Var = this.f251697g;
        if (v4Var == null) {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f251490c;
            java.util.ArrayList d17 = x7Var.d();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getMedias(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pathListToPublishItemList", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem$Companion");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = d17.iterator();
            while (it.hasNext()) {
                arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.C18436x91cb1037((java.lang.String) it.next(), 0, 0, 0, null, 24, null));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pathListToPublishItemList", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem$Companion");
            this.f251698h = new ud4.k(view, view2, view3, view4, abstractActivityC21394xb3d2c0cf, arrayList, this.f251715y, c18379xb7ff44a, this.H, this.I, !this.f251708r);
        } else {
            java.util.ArrayList d18 = x7Var.d();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d18, "getMedias(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pathListToPublishItemList", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem$Companion");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it6 = d18.iterator();
            while (it6.hasNext()) {
                arrayList2.add(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.C18436x91cb1037((java.lang.String) it6.next(), 0, 0, 0, null, 24, null));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pathListToPublishItemList", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem$Companion");
            ((ud4.t) v4Var).e(new java.util.ArrayList(arrayList2), this.f251715y);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.v4 v4Var2 = this.f251698h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(v4Var2, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgV2View");
            ((ud4.k) v4Var2).d(x7Var.c());
        }
        ud4.t tVar = (ud4.t) this.f251698h;
        tVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getView", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getView", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a c18379xb7ff44a2 = tVar.f508267c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18379xb7ff44a2, "getView(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ui.PicV2Widget");
        return c18379xb7ff44a2;
    }
}
