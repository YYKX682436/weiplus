package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public final class ie implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.me f159875d;

    public ie(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.me meVar) {
        this.f159875d = meVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.me meVar = this.f159875d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.RuntimeLaunchSessionPlugin", "didFinishColdLaunch appId:" + meVar.f167284a.f156336n + ", sessionId:" + meVar.f167284a.u0().f128809v);
        java.lang.String str = meVar.f167284a.u0().f128809v;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getVisitingSessionId(...)");
        meVar.f167285b = str;
    }
}
