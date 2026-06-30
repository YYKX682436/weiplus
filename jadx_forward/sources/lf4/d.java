package lf4;

/* loaded from: classes4.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf4.g f399910d;

    public d(lf4.g gVar) {
        this.f399910d = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadNpData username=");
        lf4.g gVar = this.f399910d;
        sb6.append(gVar.f399928e);
        sb6.append(" maxId=");
        sb6.append(gVar.f399930g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlbumPresenter", sb6.toString());
        int i17 = gVar.f399933m;
        if (i17 != 0 || gVar.f399934n) {
            return;
        }
        gVar.f399933m = i17 + 1;
        com.p314xaae8f345.mm.p944x882e457a.r1 r1Var = gm0.j1.n().f354821b;
        java.lang.String str = gVar.f399928e;
        r1Var.g(new ff4.d(str, gVar.f399930g, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, ef4.w.f334001t.e())));
    }
}
