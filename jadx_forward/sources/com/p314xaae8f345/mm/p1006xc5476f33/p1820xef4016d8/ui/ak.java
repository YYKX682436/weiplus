package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class ak extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16387x8521db9 f228249d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16387x8521db9 activityC16387x8521db9) {
        super(false);
        this.f228249d = activityC16387x8521db9;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16387x8521db9 activityC16387x8521db9 = this.f228249d;
        android.os.ResultReceiver resultReceiver = activityC16387x8521db9.f228023y1;
        if (resultReceiver != null) {
            resultReceiver.send(0, null);
        }
        activityC16387x8521db9.finish();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        long j17 = activityC16387x8521db9.B1;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        g0Var.d(22105, 4, java.lang.Long.valueOf((android.os.SystemClock.elapsedRealtime() - j17) / 1000));
    }
}
