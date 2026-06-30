package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class ge implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5974x1d8a7409 f249964d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractActivityC18013x6b7f831d.AnonymousClass13 f249965e;

    public ge(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractActivityC18013x6b7f831d.AnonymousClass13 anonymousClass13, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5974x1d8a7409 c5974x1d8a7409) {
        this.f249965e = anonymousClass13;
        this.f249964d = c5974x1d8a7409;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$13$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractActivityC18013x6b7f831d.AnonymousClass13 anonymousClass13 = this.f249965e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractActivityC18013x6b7f831d abstractActivityC18013x6b7f831d = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractActivityC18013x6b7f831d.this;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractActivityC18013x6b7f831d.R;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$800", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        int i18 = abstractActivityC18013x6b7f831d.f248354z;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$800", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5974x1d8a7409 c5974x1d8a7409 = this.f249964d;
        if (i18 == c5974x1d8a7409.f136272g.f87933a) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractActivityC18013x6b7f831d abstractActivityC18013x6b7f831d2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractActivityC18013x6b7f831d.this;
            abstractActivityC18013x6b7f831d2.l5();
            am.ct ctVar = c5974x1d8a7409.f136272g;
            if (ctVar.f87935c) {
                if (com.p314xaae8f345.mm.vfs.w6.j(ctVar.f87936d)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsBaseGalleryUI", "trans result succ path %s", ctVar.f87936d);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3 = abstractActivityC18013x6b7f831d2.f248344p;
                    if (c18064xe6e1a3b3 != null) {
                        r45.m33 m70754xd9065b83 = c18064xe6e1a3b3.m70754xd9065b83();
                        if (m70754xd9065b83 != null) {
                            m70754xd9065b83.f461646h = true;
                            m70754xd9065b83.f461647i = ctVar.f87936d;
                            if (abstractActivityC18013x6b7f831d2.f248343o.mo70578x3219b31c() != null && abstractActivityC18013x6b7f831d2.f248343o.mo70578x3219b31c().m80829xf939df19() != null) {
                                abstractActivityC18013x6b7f831d2.f248343o.mo70578x3219b31c().m80829xf939df19().mo8343xced61ae5();
                            }
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsBaseGalleryUI", "ScanTranslationResultEvent current item is null");
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$13$1");
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsBaseGalleryUI", "trans result path %s not exist!", ctVar.f87936d);
            }
            abstractActivityC18013x6b7f831d2.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetTranslateResult", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            abstractActivityC18013x6b7f831d2.f248354z = 0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetTranslateResult", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            db5.e1.G(abstractActivityC18013x6b7f831d2, abstractActivityC18013x6b7f831d2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iaw), "", false, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$13$1");
    }
}
