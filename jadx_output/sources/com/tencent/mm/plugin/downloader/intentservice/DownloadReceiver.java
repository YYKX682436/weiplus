package com.tencent.mm.plugin.downloader.intentservice;

/* loaded from: classes11.dex */
public class DownloadReceiver extends android.os.ResultReceiver {
    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i17, android.os.Bundle bundle) {
        super.onReceiveResult(i17, bundle);
        if (i17 == 4657) {
            int i18 = bundle.getInt("progress");
            if (mo3.f.f330406a == null) {
                return;
            }
            if (i18 >= 100) {
                throw null;
            }
            throw null;
        }
    }
}
