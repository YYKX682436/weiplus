package com.tencent.mm.plugin.base.stub;

/* loaded from: classes7.dex */
public class a0 implements android.app.PendingIntent.OnFinished {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f93717a;

    public a0(long j17) {
        this.f93717a = j17;
    }

    @Override // android.app.PendingIntent.OnFinished
    public void onSendFinished(android.app.PendingIntent pendingIntent, android.content.Intent intent, int i17, java.lang.String str, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WXBizLogic", "safeStartWXBizEntry use PendingIntent.getActivities for enterId:%d onSendFinished resultCode: %d, resultData: %s", java.lang.Long.valueOf(this.f93717a), java.lang.Integer.valueOf(i17), str);
    }
}
