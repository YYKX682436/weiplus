package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes8.dex */
public final class i7 extends android.database.ContentObserver {
    @Override // android.database.ContentObserver
    public void onChange(boolean z17, android.net.Uri uri) {
        super.onChange(z17, uri);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScreenShotUtil", "contentObserver onChange, not in main process, skip, check if there is any mistakes?");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotUtil", "contentObserver onChange, uri: " + uri);
        if (uri == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScreenShotUtil", "contentObserver onChange, uri is null, skip");
            return;
        }
        r26.t tVar = com.p314xaae8f345.mm.sdk.p2603x2137b148.m7.f274389a;
        java.lang.String uri2 = uri.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uri2, "toString(...)");
        if (!tVar.a(uri2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotUtil", "contentObserver onChange, return: uri not matched");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotUtil", "contentObserver onChange, removePreviousTask: " + ((ku5.t0) ku5.t0.f394148d).A("MicroMsg.ScreenShotUtil"));
        ((ku5.t0) ku5.t0.f394148d).l(new com.p314xaae8f345.mm.sdk.p2603x2137b148.h7(uri), 300L, "MicroMsg.ScreenShotUtil");
    }
}
