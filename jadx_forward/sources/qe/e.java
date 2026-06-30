package qe;

/* loaded from: classes7.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t f443472d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qe.f f443473e;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t tVar, qe.f fVar) {
        this.f443472d = tVar;
        this.f443473e = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.u h07 = this.f443472d.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h07, "getAddon(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0 l0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0) h07;
        qe.f fVar = this.f443473e;
        qe.f.a(fVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CronetHttpNativeInstallHelper", "tempInitHttpBinding: isolatePtr=%d contextPtr=%d", java.lang.Long.valueOf(l0Var.L()), java.lang.Long.valueOf(l0Var.G()));
        ((qe.c) ((jz5.n) fVar.f443477c).mo141623x754a37bb()).m83268xb12b1304(l0Var.L(), l0Var.G());
    }
}
