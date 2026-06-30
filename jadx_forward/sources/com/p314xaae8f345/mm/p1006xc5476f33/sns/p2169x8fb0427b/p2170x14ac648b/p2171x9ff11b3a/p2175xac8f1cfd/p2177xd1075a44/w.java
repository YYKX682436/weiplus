package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p2177xd1075a44;

/* loaded from: classes15.dex */
public final class w extends com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p2177xd1075a44.u {
    public final java.lang.ref.WeakReference F;

    public w(int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p2177xd1075a44.C17923xbf7ab6c3 c17923xbf7ab6c3) {
        super(i17, c17923xbf7ab6c3);
        this.F = new java.lang.ref.WeakReference(c17923xbf7ab6c3);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p2177xd1075a44.u
    public void x(android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGetFrameBmp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView$SightImageViewController");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p2177xd1075a44.C17923xbf7ab6c3 c17923xbf7ab6c3 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p2177xd1075a44.C17923xbf7ab6c3) this.F.get();
        if (c17923xbf7ab6c3 != null) {
            c17923xbf7ab6c3.mo69290xd44890a8(bitmap);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGetFrameBmp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView$SightImageViewController");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SightPlayImageView", "onGetFrameBmp, imageView is null, do clear");
            s();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGetFrameBmp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView$SightImageViewController");
        }
    }
}
