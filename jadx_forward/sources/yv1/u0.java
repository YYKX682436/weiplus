package yv1;

/* loaded from: classes12.dex */
public final class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f547700d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yv1.n0 f547701e;

    public u0(java.util.List list, yv1.n0 n0Var) {
        this.f547700d = list;
        this.f547701e = n0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Delete ALL FTS, talker count:  ");
        java.util.List list = this.f547700d;
        sb6.append(list.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanService", sb6.toString());
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.r3) ((c01.j8) i95.n0.c(c01.j8.class))).wi();
        int size = list.size();
        yv1.n0 n0Var = this.f547701e;
        int[] iArr = n0Var.f547651i;
        iArr[3] = iArr[3] + size;
        n0Var.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanService", "Done delete FTS.");
    }
}
