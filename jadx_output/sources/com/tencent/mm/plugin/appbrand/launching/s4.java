package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public class s4 implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f85138d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.x4 f85139e;

    public s4(com.tencent.mm.plugin.appbrand.launching.x4 x4Var, java.lang.String str) {
        this.f85139e = x4Var;
        this.f85138d = str;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return this.f85138d;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.launching.x4 x4Var = this.f85139e;
        x4Var.getClass();
        t81.b bVar = (t81.b) com.tencent.mm.plugin.appbrand.app.r9.fj(t81.b.class);
        java.lang.String str = x4Var.f85397a;
        int i17 = x4Var.f85403g.f77444d;
        int i18 = x4Var.f85400d;
        android.util.Pair y07 = bVar.y0(dm.i4.COL_USERNAME, str, 1, i18);
        if (((java.lang.Boolean) y07.first).booleanValue()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Launching.ContactSilentSyncProcess", "sync blocked with username(%s) scene(%d)", str, java.lang.Integer.valueOf(i18));
            r81.f.INSTANCE.b(((java.lang.Integer) y07.second).intValue(), 164);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Launching.ContactSilentSyncProcess", "[appversion] start() username %s, scene %d", str, java.lang.Integer.valueOf(i18));
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.appbrand.launching.t4 t4Var = new com.tencent.mm.plugin.appbrand.launching.t4(x4Var);
        com.tencent.mm.plugin.appbrand.config.q.j(x4Var.f85397a, true, new com.tencent.mm.plugin.appbrand.launching.v4(x4Var, str, i17, currentTimeMillis), t4Var);
    }
}
