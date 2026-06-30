package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public class i4 implements com.tencent.mm.plugin.appbrand.appcache.va {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.j4 f75589a;

    public i4(com.tencent.mm.plugin.appbrand.appcache.j4 j4Var) {
        this.f75589a = j4Var;
    }

    @Override // m81.d
    public /* bridge */ /* synthetic */ void a(java.lang.Object obj) {
    }

    @Override // m81.d
    public void c(java.lang.String str, m81.c cVar, java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LibIncrementalTestCase[incremental]", "MockLibInfo Download Result %s", cVar);
        if (cVar == m81.c.OK) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.appcache.h4(this));
            return;
        }
        com.tencent.mm.plugin.appbrand.appcache.r4.q(this.f75589a.f75606d, "Download MockLibInfo Error: " + cVar.name());
    }
}
