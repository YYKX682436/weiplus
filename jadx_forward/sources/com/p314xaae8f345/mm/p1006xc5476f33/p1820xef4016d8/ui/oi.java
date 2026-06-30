package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class oi extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd f228814d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd activityC16384xb66222dd, boolean z17, long j17) {
        super(z17, j17);
        this.f228814d = activityC16384xb66222dd;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd activityC16384xb66222dd = this.f228814d;
        boolean isChecked = activityC16384xb66222dd.Y.isChecked();
        fc3.f fVar = fc3.f.f342573a;
        if (isChecked) {
            activityC16384xb66222dd.Y.setChecked(false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e5.l(activityC16384xb66222dd.R, 8, 300);
            fVar.b(activityC16384xb66222dd.f227951o2, activityC16384xb66222dd.f227955p2, 1, activityC16384xb66222dd.f227967v2, 0);
        } else {
            activityC16384xb66222dd.Y.setChecked(true);
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e5.l(activityC16384xb66222dd.R, 0, 300);
            fVar.b(activityC16384xb66222dd.f227951o2, activityC16384xb66222dd.f227955p2, 1, activityC16384xb66222dd.f227967v2, 1);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearSendUIV2", "click checkBoxLayout, and after check is %s", java.lang.Boolean.valueOf(activityC16384xb66222dd.Y.isChecked()));
    }
}
