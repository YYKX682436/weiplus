package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1;

/* loaded from: classes7.dex */
public class g implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11734xf31693dd f158505a;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11734xf31693dd c11734xf31693dd) {
        this.f158505a = c11734xf31693dd;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.c0
    public void a(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppBrand.MicroMsg.AppBrandAudioOfVideoBackgroundPlayNotificationLogic", "loadAlbum, localPath: " + str);
        android.graphics.Bitmap g17 = this.f158505a.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.j0(str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11734xf31693dd.f158442q, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11734xf31693dd.f158443r, 0.0f));
        if (g17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AppBrand.MicroMsg.AppBrandAudioOfVideoBackgroundPlayNotificationLogic", "loadAlbum, albumBitmap is null");
            return;
        }
        this.f158505a.f158452o = g17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11734xf31693dd c11734xf31693dd = this.f158505a;
        if (c11734xf31693dd.f158449i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppBrand.MicroMsg.AppBrandAudioOfVideoBackgroundPlayNotificationLogic", "refreshNotification, isCanceled");
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.f(c11734xf31693dd, g17));
    }
}
