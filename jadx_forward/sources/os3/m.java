package os3;

/* loaded from: classes8.dex */
public class m implements com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16930x4222da3c f429680d;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16930x4222da3c activityC16930x4222da3c) {
        this.f429680d = activityC16930x4222da3c;
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback
    /* renamed from: onC2CDownloadCompleted */
    public void mo562xf8a76f8e(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadResult c2CDownloadResult) {
        int i17 = c2CDownloadResult.f17871x139cb015;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AttachDownloadPage", "cdn get response code = %d", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16930x4222da3c activityC16930x4222da3c = this.f429680d;
        if (i17 == 0) {
            com.p314xaae8f345.mm.vfs.w6.P(activityC16930x4222da3c.f236354r, activityC16930x4222da3c.X6() + ".temp", activityC16930x4222da3c.X6());
            activityC16930x4222da3c.A = 3;
            activityC16930x4222da3c.runOnUiThread(new os3.k(this));
            return;
        }
        activityC16930x4222da3c.A = 4;
        int i18 = activityC16930x4222da3c.C;
        if (i18 >= 5) {
            activityC16930x4222da3c.runOnUiThread(new os3.l(this));
        } else {
            activityC16930x4222da3c.C = i18 + 1;
            activityC16930x4222da3c.W6();
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback
    /* renamed from: onDownloadProgressChanged */
    public void mo563x617c4940(java.lang.String str, long j17, long j18, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16930x4222da3c activityC16930x4222da3c = this.f429680d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16930x4222da3c.U6(activityC16930x4222da3c);
        activityC16930x4222da3c.A = 1;
    }
}
