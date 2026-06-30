package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad;

/* loaded from: classes7.dex */
public final class s6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f229653d;

    public s6(java.lang.String str) {
        this.f229653d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274592g;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.R0(context, str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushPreloadFeatureService", "no need to preload");
            je3.i.x2(je3.k.f380831e, "PreloadMBIsAlive", 1, this.f229653d, 0.0f, 8, null);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start preload MB2.0 env for ");
        java.lang.String str2 = this.f229653d;
        sb6.append(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushPreloadFeatureService", sb6.toString());
        je3.i.x2(je3.k.f380831e, "PreloadMBStart", 1, this.f229653d, 0.0f, 8, null);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("appStatus", com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40975xf7b3660d() ? 1 : 2);
        bundle.putLong("processStartTime", android.os.SystemClock.elapsedRealtime());
        bundle.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, str2);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(str, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.q6.class, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.r6.f229646d);
    }
}
