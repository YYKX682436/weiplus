package zw1;

/* loaded from: classes15.dex */
public class b4 implements y60.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 f558121d;

    public b4(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3) {
        this.f558121d = activityC13149x63b02cb3;
    }

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
        if (str != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3 = this.f558121d;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC13149x63b02cb3.f177970f.R) && str.equals(activityC13149x63b02cb3.f177970f.R)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "cdnImageDownloadListener mchPhoto = %s notifyKey = %s", activityC13149x63b02cb3.f177970f.R, str);
                activityC13149x63b02cb3.B7(2);
            }
        }
    }
}
