package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes15.dex */
public class l1 implements lu1.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ViewOnClickListenerC13051xc6cfcc17 f176596d;

    public l1(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ViewOnClickListenerC13051xc6cfcc17 viewOnClickListenerC13051xc6cfcc17) {
        this.f176596d = viewOnClickListenerC13051xc6cfcc17;
    }

    @Override // lu1.b
    public void I1(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardGiftReceiveUI", "CDN  download success! fieldId:" + str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ViewOnClickListenerC13051xc6cfcc17 viewOnClickListenerC13051xc6cfcc17 = this.f176596d;
        if (viewOnClickListenerC13051xc6cfcc17.f176355f == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardGiftReceiveUI", "CDN  download cardGiftInfo is null return!");
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(viewOnClickListenerC13051xc6cfcc17.f176355f.f176185i) || !str.equals(viewOnClickListenerC13051xc6cfcc17.f176355f.f176185i)) {
            viewOnClickListenerC13051xc6cfcc17.Y.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.k1(this, str, str2));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardGiftReceiveUI", "CDN  download fromUserContentVideoUrl! return");
        }
    }

    @Override // lu1.b
    public void J(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardGiftReceiveUI", "CDN download pic failure! fieldId:" + str);
    }

    @Override // lu1.b
    public void g2(java.lang.String str, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ViewOnClickListenerC13051xc6cfcc17 viewOnClickListenerC13051xc6cfcc17 = this.f176596d;
        if (viewOnClickListenerC13051xc6cfcc17.f176355f == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardGiftReceiveUI", "CDN  updateProgress cardGiftInfo is null return!");
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(viewOnClickListenerC13051xc6cfcc17.f176355f.f176185i) || !str.equals(viewOnClickListenerC13051xc6cfcc17.f176355f.f176185i)) {
            viewOnClickListenerC13051xc6cfcc17.Y.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.j1(this));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardGiftReceiveUI", "CDN  updateProgress fromUserContentVideoUrl return!");
        }
    }
}
