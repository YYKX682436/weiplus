package qx4;

/* loaded from: classes8.dex */
public final class j0 implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f448947d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f448948e;

    public j0(java.lang.String str, int i17) {
        this.f448947d = str;
        this.f448948e = i17;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        android.os.Looper.myQueue().removeIdleHandler(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchPreloadLogic", "idleWebSearchPreload");
        qx4.z0 z0Var = new qx4.z0(this.f448947d, this.f448948e);
        qx4.l0 l0Var = qx4.l0.f448955a;
        int i17 = z0Var.f449010b;
        if (l0Var.b(i17) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchPreloadLogic", "already exist preload obj");
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start to preload obj url:");
        java.lang.String url = z0Var.f449009a;
        sb6.append(url);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchPreloadLogic", sb6.toString());
        z0Var.f449011c = c01.id.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        qx4.m0 m0Var = new qx4.m0(url, i17);
        qx4.l0.f448956b.put(java.lang.Integer.valueOf(i17), m0Var);
        new qx4.y0(z0Var, m0Var).mo152xb9724478();
        return false;
    }
}
