package rq4;

/* loaded from: classes14.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rq4.i f480497d;

    public f(rq4.i iVar) {
        this.f480497d = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qj0.a aVar = new qj0.a();
        rq4.i iVar = this.f480497d;
        iVar.f480519t = aVar;
        iVar.f480513n = aVar.b();
        iVar.f480514o = aVar.a();
        iVar.f480515p = aVar.c();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        iVar.f480517r = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPProfileReport", "current profile gpu init info is gl:" + iVar.f480513n + " egl:" + iVar.f480514o + " gfx:" + iVar.f480515p);
        iVar.f480519t = null;
        ((vq4.i) iVar.f480518s.mo141623x754a37bb()).c();
    }
}
