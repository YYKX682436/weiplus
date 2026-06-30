package com.tencent.mm.plugin.appbrand.widget.recent;

/* loaded from: classes7.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.recent.d f91937d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f91938e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l75.w0 f91939f;

    public b(com.tencent.mm.plugin.appbrand.widget.recent.d dVar, java.lang.String str, l75.w0 w0Var) {
        this.f91937d = dVar;
        this.f91938e = str;
        this.f91939f = w0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AbsAppBrandStorageWithCache", "notify cache update");
        java.util.Set set = this.f91937d.f91962f;
        java.lang.String str = this.f91938e;
        l75.w0 w0Var = this.f91939f;
        synchronized (set) {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                ((l75.q0) it.next()).onNotifyChange(str, w0Var);
            }
        }
        this.f91937d.f(this.f91938e, this.f91939f);
    }
}
