package ee4;

/* loaded from: classes4.dex */
public final class y0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jz5.l f333303d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ee4.b1 f333304e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(jz5.l lVar, ee4.b1 b1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f333303d = lVar;
        this.f333304e = b1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc$initLivePhotoCollectEventJob$1$1$1");
        ee4.y0 y0Var = new ee4.y0(this.f333303d, this.f333304e, interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc$initLivePhotoCollectEventJob$1$1$1");
        return y0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc$initLivePhotoCollectEventJob$1$1$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc$initLivePhotoCollectEventJob$1$1$1");
        ee4.y0 y0Var = (ee4.y0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        y0Var.mo150x989b7ca4(f0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc$initLivePhotoCollectEventJob$1$1$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc$initLivePhotoCollectEventJob$1$1$1");
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc$initLivePhotoCollectEventJob$1$1$1");
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.util.ArrayList<java.lang.String> stringArrayList = ((android.os.Bundle) this.f333303d.f384367e).getStringArrayList("key_work_err_media_ids");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("errMediaIds size: ");
        sb6.append(stringArrayList != null ? new java.lang.Integer(stringArrayList.size()) : null);
        java.lang.String sb7 = sb6.toString();
        ee4.b1 b1Var = this.f333304e;
        b1Var.f(sb7);
        if (!(stringArrayList == null || stringArrayList.isEmpty())) {
            for (java.lang.String str : stringArrayList) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$changeErrorLivePhotoItemToImage", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
                b1Var.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("changeErrorLivePhotoItemToImage", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
                b1Var.f("changeErrorLivePhotoItemToImage >> mediaKey: ".concat(str));
                java.util.List e17 = b1Var.f333211n.e();
                int size = e17.size();
                for (int i17 = 0; i17 < size; i17++) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.AbstractC18435x78de886c abstractC18435x78de886c = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.AbstractC18435x78de886c) e17.get(i17);
                    if (abstractC18435x78de886c.d() == 6) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.C18437xfbc5d82 c18437xfbc5d82 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.C18437xfbc5d82) abstractC18435x78de886c;
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c18437xfbc5d82.h(), str)) {
                            b1Var.f("find it the index is = " + i17);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTierDownToImage", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
                            c18437xfbc5d82.f252752s = 1;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTierDownToImage", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
                        }
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("changeErrorLivePhotoItemToImage", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$changeErrorLivePhotoItemToImage", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
            }
        }
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc$initLivePhotoCollectEventJob$1$1$1");
        return f0Var;
    }
}
