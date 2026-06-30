package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4;

/* loaded from: classes4.dex */
public final class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ee f267316d;

    public i0(r45.ee eeVar) {
        this.f267316d = eeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 N = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.N("MpShareVideoImage", 2, null);
        r45.ee eeVar = this.f267316d;
        byte[] j17 = N.j(eeVar.f454874f);
        java.lang.String b17 = tv.a.b(eeVar.f454876h);
        if (j17 != null) {
            com.p314xaae8f345.mm.vfs.w6.S(b17, j17, 0, j17.length);
        }
        N.d();
    }
}
