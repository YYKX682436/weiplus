package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class ri implements tl.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd f228919a;

    public ri(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd activityC16384xb66222dd) {
        this.f228919a = activityC16384xb66222dd;
    }

    @Override // tl.e
    /* renamed from: onCompletion */
    public void mo66237xa6db431b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearSendUIV2", "voicePlayer onCompletion");
        android.view.View view = this.f228919a.f227938h;
        if (view != null) {
            view.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.qi(this));
        }
    }
}
