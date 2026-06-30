package rq4;

/* loaded from: classes14.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rq4.i f480498d;

    public g(rq4.i iVar) {
        this.f480498d = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rq4.i iVar = this.f480498d;
        long j17 = iVar.f480517r;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (java.lang.System.currentTimeMillis() - j17 > 300000 && !iVar.f480516q) {
            iVar.f480519t = new qj0.a();
        }
        qj0.a aVar = iVar.f480519t;
        if (aVar != null) {
            iVar.f480516q = true;
            iVar.f480513n = aVar.b() > 0 ? aVar.b() - iVar.f480513n : 0L;
            iVar.f480514o = aVar.a() > 0 ? aVar.a() - iVar.f480514o : 0L;
            iVar.f480515p = aVar.c() > 0 ? aVar.c() - iVar.f480515p : 0L;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPProfileReport", "current profile latest gpu info  is gl:" + iVar.f480513n + " egl:" + iVar.f480514o + " gfx:" + iVar.f480515p);
        }
        iVar.f480519t = null;
    }
}
