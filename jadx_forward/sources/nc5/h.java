package nc5;

/* loaded from: classes10.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nc5.o f417734d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f417735e;

    public h(nc5.o oVar, java.lang.String str) {
        this.f417734d = oVar;
        this.f417735e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xg3.m0 u17 = c01.d9.b().u();
        nc5.o oVar = this.f417734d;
        int N3 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) u17).N3(oVar.f417747b);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportExpose >> ");
        sb6.append(N3);
        sb6.append(", ");
        java.lang.String sugTextList = this.f417735e;
        sb6.append(sugTextList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryQueryHeaderUI", sb6.toString());
        ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).getClass();
        java.lang.String userName = oVar.f417747b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sugTextList, "sugTextList");
        f65.o.f341446b = userName;
        f65.o.f341448d = oVar.f417748c;
        f65.o.f341449e = sugTextList;
        f65.o.f341452h = N3;
        ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).Bi(1);
    }
}
