package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1;

/* loaded from: classes7.dex */
public class b implements tf1.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tf1.f f158484a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11734xf31693dd f158485b;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11734xf31693dd c11734xf31693dd, tf1.f fVar) {
        this.f158485b = c11734xf31693dd;
        this.f158484a = fVar;
    }

    @Override // tf1.e
    public void a() {
        if (this.f158485b.f158449i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppBrand.MicroMsg.AppBrandAudioOfVideoBackgroundPlayNotificationLogic", "onBackgroundAudioStart, isCanceled");
            return;
        }
        this.f158485b.f158450m = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11734xf31693dd c11734xf31693dd = this.f158485b;
        android.app.NotificationManager notificationManager = c11734xf31693dd.f158447g;
        int b17 = c11734xf31693dd.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11734xf31693dd c11734xf31693dd2 = this.f158485b;
        notificationManager.notify(b17, c11734xf31693dd2.d(c11734xf31693dd2.f158446f, true, null));
    }

    @Override // tf1.e
    public void b() {
        if (this.f158485b.f158449i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppBrand.MicroMsg.AppBrandAudioOfVideoBackgroundPlayNotificationLogic", "onBackgroundAudioPause, isCanceled");
            return;
        }
        boolean l17 = this.f158484a.l();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11734xf31693dd c11734xf31693dd = this.f158485b;
        android.app.NotificationManager notificationManager = c11734xf31693dd.f158447g;
        int b17 = c11734xf31693dd.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11734xf31693dd c11734xf31693dd2 = this.f158485b;
        notificationManager.notify(b17, c11734xf31693dd2.d(c11734xf31693dd2.f158446f, l17, null));
    }

    @Override // tf1.e
    public void c(android.graphics.Bitmap bitmap) {
    }

    @Override // tf1.e
    public void d() {
        if (this.f158485b.f158449i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppBrand.MicroMsg.AppBrandAudioOfVideoBackgroundPlayNotificationLogic", "onExitBackground, isCanceled");
        } else {
            this.f158485b.e();
        }
    }

    @Override // tf1.e
    public void e() {
        if (this.f158485b.f158449i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppBrand.MicroMsg.AppBrandAudioOfVideoBackgroundPlayNotificationLogic", "onBackgroundAudioPause, isCanceled");
            return;
        }
        this.f158485b.f158450m = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11734xf31693dd c11734xf31693dd = this.f158485b;
        android.app.NotificationManager notificationManager = c11734xf31693dd.f158447g;
        int b17 = c11734xf31693dd.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11734xf31693dd c11734xf31693dd2 = this.f158485b;
        notificationManager.notify(b17, c11734xf31693dd2.d(c11734xf31693dd2.f158446f, false, null));
    }
}
