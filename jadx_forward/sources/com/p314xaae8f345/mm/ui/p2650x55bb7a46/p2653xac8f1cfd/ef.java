package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class ef implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280500d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ff f280501e;

    public ef(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ff ffVar, java.lang.String str) {
        this.f280501e = ffVar;
        this.f280500d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ff ffVar = this.f280501e;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ffVar.f280587d.f281220h)) {
            return;
        }
        java.lang.String str = this.f280500d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !str.equals(ffVar.f280587d.f281220h)) {
            return;
        }
        ffVar.f280587d.J0(false);
    }
}
