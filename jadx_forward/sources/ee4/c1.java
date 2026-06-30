package ee4;

/* loaded from: classes4.dex */
public final class c1 implements ud4.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ee4.e1 f333228a;

    public c1(ee4.e1 e1Var) {
        this.f333228a = e1Var;
    }

    @Override // ud4.d
    public void a(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("moveItem", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicPreviewViewPc$itemChangePositionCallback$1");
        ee4.e1 e1Var = this.f333228a;
        e1Var.f("moveItem: fromPos: " + i17 + " toPos: " + i18);
        ee4.b1 m17 = e1Var.m();
        m17.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("moveItem", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
        fe4.b bVar = m17.f333211n;
        bVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("moveItem", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem");
        if (i17 == i18) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("moveItem", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem");
        } else if (bVar.f343095a.size() <= i17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("moveItem", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.AbstractC18435x78de886c abstractC18435x78de886c = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.AbstractC18435x78de886c) bVar.f343095a.remove(i17);
            java.util.ArrayList arrayList = (java.util.ArrayList) bVar.f343096b;
            arrayList.remove(i17);
            if (i18 < bVar.f343095a.size()) {
                bVar.f343095a.add(i18, abstractC18435x78de886c);
                java.lang.String b17 = abstractC18435x78de886c.b();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
                arrayList.add(i18, b17);
            } else {
                bVar.f343095a.add(abstractC18435x78de886c);
                java.lang.String b18 = abstractC18435x78de886c.b();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b18);
                arrayList.add(b18);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("moveItem", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("moveItem", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("moveItem", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicPreviewViewPc$itemChangePositionCallback$1");
    }

    @Override // ud4.d
    /* renamed from: removeItem */
    public void mo71192x417605b7(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeItem", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicPreviewViewPc$itemChangePositionCallback$1");
        ee4.e1 e1Var = this.f333228a;
        e1Var.f("removeItem: pos: " + i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getContext", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicPreviewViewPc");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf c17 = e1Var.c();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getContext", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicPreviewViewPc");
        ee4.b1 m17 = e1Var.m();
        m17.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeItem", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
        m17.w((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.AbstractC18435x78de886c) m17.f333211n.e().get(i17), true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeItem", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
        if (c17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd) c17).q7();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getPreviewImage$p", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicPreviewViewPc");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.v4 v4Var = e1Var.f333233n;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getPreviewImage$p", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicPreviewViewPc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(v4Var, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        ((ud4.t) v4Var).d(e1Var.m().v().f());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeItem", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicPreviewViewPc$itemChangePositionCallback$1");
    }
}
