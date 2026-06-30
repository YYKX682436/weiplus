package lr;

/* loaded from: classes15.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lr.u f402110d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ir.t0 f402111e;

    public r(lr.u uVar, ir.t0 t0Var) {
        this.f402110d = uVar;
        this.f402111e = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int size = this.f402111e.b().b().size();
        lr.u uVar = this.f402110d;
        uVar.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 N = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.N("EmoticonPanelKV", 2, null);
        int i17 = N != null ? N.getInt("last_custom_count", -1) : -1;
        lr.x xVar = uVar.f402125o;
        if (i17 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(xVar.f402138i, "no find last count");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(xVar.f402138i, "checkCustomEmojiLost count " + size + ", " + i17);
        if (i17 == 0 || size / i17 > 0.3f) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.C(2135L, 0L, 1L);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (N != null) {
            currentTimeMillis = N.getLong("last_check_time", java.lang.System.currentTimeMillis());
        }
        if (java.lang.System.currentTimeMillis() - currentTimeMillis >= 3600000) {
            new pr.t(0, null, true).a();
            g0Var.C(2135L, 2L, 1L);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(xVar.f402138i, "check limit " + currentTimeMillis);
            g0Var.C(2135L, 1L, 1L);
        }
    }
}
