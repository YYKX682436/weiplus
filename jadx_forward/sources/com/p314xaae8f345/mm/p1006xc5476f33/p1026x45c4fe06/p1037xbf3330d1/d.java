package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1;

/* loaded from: classes7.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11734xf31693dd f158496d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11734xf31693dd c11734xf31693dd) {
        this.f158496d = c11734xf31693dd;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter("com.tencent.mm.Intent.ACTION_BACKGROUND_AUDIO_NOTIFICATION_CLICK");
        if (fp.h.a(33)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11734xf31693dd c11734xf31693dd = this.f158496d;
            c11734xf31693dd.f158446f.registerReceiver(c11734xf31693dd.f158453p, intentFilter);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11734xf31693dd c11734xf31693dd2 = this.f158496d;
            c11734xf31693dd2.f158446f.registerReceiver(c11734xf31693dd2.f158453p, intentFilter, 2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11734xf31693dd c11734xf31693dd3 = this.f158496d;
        android.app.NotificationManager notificationManager = c11734xf31693dd3.f158447g;
        int b17 = c11734xf31693dd3.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11734xf31693dd c11734xf31693dd4 = this.f158496d;
        notificationManager.notify(b17, c11734xf31693dd4.d(c11734xf31693dd4.f158446f, true, null));
        this.f158496d.f158450m = true;
    }
}
