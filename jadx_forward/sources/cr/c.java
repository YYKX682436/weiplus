package cr;

/* loaded from: classes8.dex */
public final class c implements com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cr.d f303089d;

    public c(cr.d dVar) {
        this.f303089d = dVar;
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback
    /* renamed from: onC2CDownloadCompleted */
    public void mo562xf8a76f8e(java.lang.String filekey, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadResult result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filekey, "filekey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        cr.d dVar = this.f303089d;
        dVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCdnHttpsFetcher", "onC2CDownloadCompleted: " + filekey + ", " + result.f17871x139cb015);
        if (result.f17871x139cb015 != 0) {
            yz5.l lVar = dVar.f303091b;
            if (lVar != null) {
                lVar.mo146xb9724478(java.lang.Boolean.FALSE);
            }
            dVar.b(false);
            return;
        }
        yz5.l lVar2 = dVar.f303091b;
        if (lVar2 != null) {
            lVar2.mo146xb9724478(java.lang.Boolean.TRUE);
        }
        dVar.b(true);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback
    /* renamed from: onDownloadProgressChanged */
    public void mo563x617c4940(java.lang.String filekey, long j17, long j18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filekey, "filekey");
    }
}
