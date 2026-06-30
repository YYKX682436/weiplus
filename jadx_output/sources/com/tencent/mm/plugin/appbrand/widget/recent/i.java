package com.tencent.mm.plugin.appbrand.widget.recent;

/* loaded from: classes7.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.recent.j f91990d;

    public i(com.tencent.mm.plugin.appbrand.widget.recent.j jVar) {
        this.f91990d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            java.lang.String u17 = com.tencent.mm.sdk.platformtools.o4.M("appbrand_multi_task_mmkv_name").u("appbrand_multi_task_common_used_resp_key", "");
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCommonUsedCache", "textEncode:%s", u17);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(u17)) {
                r45.rs3 rs3Var = (r45.rs3) new r45.rs3().parseFrom(n56.a.a(u17));
                synchronized (com.tencent.mm.plugin.appbrand.widget.recent.k.f91995b) {
                    com.tencent.mm.plugin.appbrand.widget.recent.k.f91994a = rs3Var;
                }
            }
        } catch (java.io.IOException unused) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCommonUsedCache", "getResponse, encode error");
        }
        com.tencent.mm.plugin.appbrand.widget.recent.j jVar = this.f91990d;
        if (jVar != null) {
            com.tencent.mm.plugin.appbrand.widget.recent.o oVar = (com.tencent.mm.plugin.appbrand.widget.recent.o) jVar;
            oVar.f92020a.post(new com.tencent.mm.plugin.appbrand.widget.recent.o$$a(oVar, com.tencent.mm.plugin.appbrand.widget.recent.k.f91994a));
        }
    }
}
