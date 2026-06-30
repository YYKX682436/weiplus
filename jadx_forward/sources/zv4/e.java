package zv4;

/* loaded from: classes8.dex */
public final class e implements com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.UploadCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f557992d;

    public e(p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f557992d = qVar;
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.UploadCallback
    /* renamed from: onC2CUploadCompleted */
    public void mo37921xa24580f5(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadResult c2CUploadResult) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onC2CUploadCompleted filekey ");
        sb6.append(str);
        sb6.append(" error ");
        sb6.append(c2CUploadResult != null ? java.lang.Integer.valueOf(c2CUploadResult.f17981x139cb015) : null);
        sb6.append(" url ");
        sb6.append(c2CUploadResult != null ? c2CUploadResult.f17985xcd099653 : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSImageRecognizeUploader", sb6.toString());
        boolean z17 = false;
        if (c2CUploadResult != null && c2CUploadResult.f17981x139cb015 == 0) {
            z17 = true;
        }
        p3325xe03a0797.p3326xc267989b.q qVar = this.f557992d;
        if (!z17 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c2CUploadResult.f17986xb4089397) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c2CUploadResult.f17971xab4b3f30)) {
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
        } else {
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(kz5.c1.k(new jz5.l("dataType", 4), new jz5.l("aesKey", c2CUploadResult.f17971xab4b3f30), new jz5.l("fileId", c2CUploadResult.f17986xb4089397))));
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.UploadCallback
    /* renamed from: onUploadProgressChanged */
    public void mo37923xdaa196e7(java.lang.String str, long j17, long j18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSImageRecognizeUploader", "onC2CUploadCompleted filekey " + str + " finished " + j17 + " total " + j18);
    }
}
