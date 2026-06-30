package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class k4 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavPostVoiceUI f101216d;

    public k4(com.tencent.mm.plugin.fav.ui.FavPostVoiceUI favPostVoiceUI) {
        this.f101216d = favPostVoiceUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.fav.ui.FavPostVoiceUI favPostVoiceUI = this.f101216d;
        if (favPostVoiceUI.f100378m == -1) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            favPostVoiceUI.f100378m = android.os.SystemClock.elapsedRealtime();
        }
        long j17 = favPostVoiceUI.f100378m;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
        if (elapsedRealtime >= 3590000 && elapsedRealtime <= 3600000) {
            android.widget.Toast toast = favPostVoiceUI.f100379n;
            if (toast == null) {
                favPostVoiceUI.f100379n = dp.a.makeText(favPostVoiceUI, favPostVoiceUI.getString(com.tencent.mm.R.string.c_3, java.lang.Integer.valueOf((int) ((3600000 - elapsedRealtime) / 1000))), 0);
            } else {
                toast.setText(favPostVoiceUI.getString(com.tencent.mm.R.string.c_3, java.lang.Integer.valueOf((int) ((3600000 - elapsedRealtime) / 1000))));
            }
            favPostVoiceUI.f100379n.show();
        }
        if (elapsedRealtime < 3600000) {
            return true;
        }
        favPostVoiceUI.f100377i = true;
        favPostVoiceUI.P6();
        return false;
    }
}
