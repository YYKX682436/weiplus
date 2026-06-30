package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes12.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p642xad8b531f.ServiceC10285xbf7f55f6 f144892d;

    public g(com.p314xaae8f345.mm.p642xad8b531f.ServiceC10285xbf7f55f6 serviceC10285xbf7f55f6) {
        this.f144892d = serviceC10285xbf7f55f6;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p642xad8b531f.l lVar = com.p314xaae8f345.mm.p642xad8b531f.ServiceC10285xbf7f55f6.f144767v;
        this.f144892d.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoreService", "initOther");
        com.p314xaae8f345.mm.p642xad8b531f.l lVar2 = com.p314xaae8f345.mm.p642xad8b531f.ServiceC10285xbf7f55f6.f144767v;
        if (lVar2 != null) {
            ((com.p314xaae8f345.mm.app.k0) lVar2).a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            com.p314xaae8f345.mm.app.k0 k0Var = (com.p314xaae8f345.mm.app.k0) com.p314xaae8f345.mm.p642xad8b531f.ServiceC10285xbf7f55f6.f144767v;
            k0Var.getClass();
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getFilesDir(), com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.f7335x31ce7ede);
            com.p314xaae8f345.mm.app.k0.f135008h = r6Var.o();
            if (!r6Var.m()) {
                r6Var.J();
            }
            if (k0Var.f135014f == null) {
                com.p314xaae8f345.mm.app.j0 j0Var = new com.p314xaae8f345.mm.app.j0(com.p314xaae8f345.mm.app.k0.f135008h);
                k0Var.f135014f = j0Var;
                j0Var.startWatching();
            }
            k0Var.f135012d.postDelayed(k0Var.f135013e, 3600000L);
        }
    }
}
