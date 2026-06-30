package cx;

/* loaded from: classes7.dex */
public final class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cx.j1 f305949d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bx.s f305950e;

    public i1(cx.j1 j1Var, bx.s sVar) {
        this.f305949d = j1Var;
        this.f305950e = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rv.p2 p2Var = (rv.p2) i95.n0.c(rv.p2.class);
        cx.j1 j1Var = this.f305949d;
        java.util.List<r01.l> wi6 = ((vw.b) p2Var).wi(j1Var.aj());
        java.lang.String Bi = cx.j1.Bi(j1Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initFrameSet size:");
        java.util.LinkedList linkedList = (java.util.LinkedList) wi6;
        sb6.append(linkedList.size());
        sb6.append(", with strategy ");
        bx.s sVar = this.f305950e;
        sb6.append(sVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(Bi, sb6.toString());
        if (linkedList.size() > 0) {
            int ordinal = sVar.ordinal();
            if (ordinal == 0) {
                cx.j1.wi(j1Var, 3, ((r01.l) linkedList.get(0)).f449669b, ((r01.l) linkedList.get(0)).f449670c);
            } else {
                if (ordinal != 1) {
                    return;
                }
                for (r01.l lVar : wi6) {
                    cx.j1.wi(j1Var, 3, lVar.f449669b, lVar.f449670c);
                }
            }
        }
    }
}
