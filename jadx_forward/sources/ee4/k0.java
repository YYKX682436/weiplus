package ee4;

/* loaded from: classes4.dex */
public final class k0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.AbstractC18435x78de886c f333255d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.AbstractC18435x78de886c abstractC18435x78de886c) {
        super(0);
        this.f333255d = abstractC18435x78de886c;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicFileManagerPc$removePublishItem$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicFileManagerPc$removePublishItem$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.AbstractC18435x78de886c abstractC18435x78de886c = this.f333255d;
        if (abstractC18435x78de886c.d() == 1) {
            ie4.a aVar = ie4.a.f372535a;
            java.lang.String b17 = abstractC18435x78de886c.b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("safeDeleteFile", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicFileHelper");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiPicFileHelper", "safeDeleteFile >> ".concat(b17));
            if (r26.n0.B(b17, "draft", false) && !r26.n0.B(b17, "DCIM", true)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiPicFileHelper", "delete file ret >> " + com.p314xaae8f345.mm.vfs.w6.h(b17));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("safeDeleteFile", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicFileHelper");
        } else if (abstractC18435x78de886c.d() == 6) {
            ie4.a.f372535a.a((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.C18437xfbc5d82) abstractC18435x78de886c);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicFileManagerPc$removePublishItem$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicFileManagerPc$removePublishItem$1");
        return f0Var;
    }
}
