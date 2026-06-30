package com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1946x6052700;

/* renamed from: com.tencent.mm.plugin.performance.jectl.JeVersion$JeService */
/* loaded from: classes11.dex */
public class ServiceC16798xc23ab7f3 extends android.app.Service {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f234528d = 0;

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ((ku5.t0) ku5.t0.f394148d).k(new com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1946x6052700.d(this), 60000L);
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1946x6052700.b(this));
        return 2;
    }
}
