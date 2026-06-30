package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public class g4 extends k75.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.r4 f75549d;

    public g4(com.tencent.mm.plugin.appbrand.appcache.r4 r4Var) {
        this.f75549d = r4Var;
    }

    @Override // k75.c
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LibIncrementalTestCase[incremental]", "WriteMockLibInfo enter");
        java.lang.String a17 = com.tencent.mm.plugin.appbrand.appcache.w8.a();
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(a17);
        com.tencent.mm.plugin.appbrand.appcache.r4 r4Var = this.f75549d;
        if (K0) {
            com.tencent.mm.plugin.appbrand.appcache.r4.q(r4Var, "!!MockLibInfo Path Error!!");
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("version", 0);
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(a17);
            r6Var.l();
            r6Var.k();
            byte[] bytes = jSONObject.toString().getBytes(com.tencent.mapsdk.internal.rv.f51270c);
            int S = com.tencent.mm.vfs.w6.S(r6Var.o(), bytes, 0, bytes.length);
            if (S == 0) {
                r4Var.o(r4Var.f75943o);
                return;
            }
            com.tencent.mm.plugin.appbrand.appcache.r4.q(r4Var, "MockLibInfo Write Error " + S);
        } catch (java.lang.Exception e17) {
            com.tencent.mm.plugin.appbrand.appcache.r4.q(r4Var, "MockLibInfo Write Exception " + e17.getMessage());
        }
    }
}
