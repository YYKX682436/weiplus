package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1;

/* loaded from: classes7.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f158503d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11734xf31693dd f158504e;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11734xf31693dd c11734xf31693dd, android.graphics.Bitmap bitmap) {
        this.f158504e = c11734xf31693dd;
        this.f158503d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11734xf31693dd c11734xf31693dd = this.f158504e;
        android.app.NotificationManager notificationManager = c11734xf31693dd.f158447g;
        int b17 = c11734xf31693dd.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11734xf31693dd c11734xf31693dd2 = this.f158504e;
        notificationManager.notify(b17, c11734xf31693dd2.d(c11734xf31693dd2.f158446f, c11734xf31693dd2.f158450m, this.f158503d));
    }
}
