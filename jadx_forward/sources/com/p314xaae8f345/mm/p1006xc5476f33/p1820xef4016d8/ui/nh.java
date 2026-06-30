package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class nh implements gc3.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd f228775a;

    public nh(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd activityC16384xb66222dd) {
        this.f228775a = activityC16384xb66222dd;
    }

    public void a(int i17, java.lang.String str) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd activityC16384xb66222dd = this.f228775a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearSendUIV2", "onDetectStop ret:%s useTime:%s filePath:%s", valueOf, java.lang.Long.valueOf(activityC16384xb66222dd.M.getF229151r()), str);
        android.view.View view = activityC16384xb66222dd.f227938h;
        if (view != null) {
            view.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.mh(this, i17, str));
        }
    }
}
