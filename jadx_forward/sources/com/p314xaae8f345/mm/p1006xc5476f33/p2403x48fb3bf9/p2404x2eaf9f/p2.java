package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f;

/* loaded from: classes8.dex */
public final class p2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 f263440d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.net.Uri f263441e;

    public p2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var, android.net.Uri uri) {
        this.f263440d = e3Var;
        this.f263441e = uri;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.net.Uri uri;
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        android.content.Context m81400x569210f3 = this.f263440d.f263449a.m81400x569210f3();
        ((kt.c) i0Var).getClass();
        if (m81400x569210f3 == null || (uri = this.f263441e) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppInfoLogic", "launchApp failed, context or uri is null.");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppInfoLogic", "try to launchApp with uri.");
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", uri);
        intent.addFlags(268435456);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.v(m81400x569210f3, intent, null, null, null);
    }
}
