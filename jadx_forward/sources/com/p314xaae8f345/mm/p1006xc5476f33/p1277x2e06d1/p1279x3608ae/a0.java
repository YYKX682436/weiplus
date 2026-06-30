package com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae;

/* loaded from: classes7.dex */
public class a0 implements android.app.PendingIntent.OnFinished {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f175250a;

    public a0(long j17) {
        this.f175250a = j17;
    }

    @Override // android.app.PendingIntent.OnFinished
    public void onSendFinished(android.app.PendingIntent pendingIntent, android.content.Intent intent, int i17, java.lang.String str, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXBizLogic", "safeStartWXBizEntry use PendingIntent.getActivities for enterId:%d onSendFinished resultCode: %d, resultData: %s", java.lang.Long.valueOf(this.f175250a), java.lang.Integer.valueOf(i17), str);
    }
}
