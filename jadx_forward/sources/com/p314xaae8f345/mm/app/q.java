package com.p314xaae8f345.mm.app;

/* loaded from: classes12.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f135247d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.app.s f135248e;

    public q(com.p314xaae8f345.mm.app.s sVar, java.lang.String str) {
        this.f135248e = sVar;
        this.f135247d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f135248e.f135291e.f135310c.f135422n && this.f135248e.f135290d.remove(this.f135247d)) {
            this.f135248e.f135291e.f135309b.a(false, this.f135247d);
        } else {
            this.f135248e.f135291e.f135310c.f135417f = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppForegroundDelegate", "[PAUSED] delay to check background in stop!");
        }
        com.p314xaae8f345.mm.app.d5 d5Var = com.p314xaae8f345.mm.app.d5.f134917a;
        java.lang.String activityName = this.f135247d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityName, "activityName");
        com.p314xaae8f345.mm.app.d5.f134926j = false;
    }
}
