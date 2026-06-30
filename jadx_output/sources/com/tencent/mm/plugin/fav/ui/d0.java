package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes4.dex */
public class d0 implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public long f100561d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavBaseUI f100562e;

    public d0(com.tencent.mm.plugin.fav.ui.FavBaseUI favBaseUI) {
        this.f100562e = favBaseUI;
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteBaseUI", "[onNotifyChange] event=%s", str);
        com.tencent.mm.plugin.fav.ui.FavBaseUI favBaseUI = this.f100562e;
        favBaseUI.f100276q.removeCallbacks(favBaseUI.N);
        long j17 = this.f100561d;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (android.os.SystemClock.elapsedRealtime() - j17 <= 200) {
            favBaseUI.f100276q.postDelayed(favBaseUI.N, 200L);
        } else {
            this.f100561d = android.os.SystemClock.elapsedRealtime();
            favBaseUI.f100276q.post(favBaseUI.N);
        }
    }
}
