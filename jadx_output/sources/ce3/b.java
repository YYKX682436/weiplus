package ce3;

/* loaded from: classes7.dex */
public final class b implements zq1.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ce3.c f40788a;

    public b(ce3.c cVar) {
        this.f40788a = cVar;
    }

    @Override // zq1.g0
    public boolean a(com.tencent.mm.plugin.brandservice.api.TransferRequestInfo transferRequestInfo) {
        return false;
    }

    @Override // zq1.g0
    public void b(com.tencent.mm.plugin.brandservice.api.TransferResultInfo result) {
        kotlin.jvm.internal.o.g(result, "result");
        r45.z24 z24Var = result.f93928f;
        java.util.HashMap hashMap = new java.util.HashMap();
        int i17 = result.f93926d;
        java.lang.String str = result.f93927e;
        com.tencent.mars.xlog.Log.i("MicroMsg.MBJsApiTransferBase", "errCode:" + i17 + " errMsg:" + str);
        ((js1.m) ((zq1.f0) gm0.j1.s(zq1.f0.class))).a(hashMap, result);
        ce3.c cVar = this.f40788a;
        if (z24Var == null) {
            cVar.s().invoke(cVar.h(2, "errCode:" + i17 + str));
            return;
        }
        java.lang.String str2 = z24Var.f391636f;
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put("result", str2);
        java.util.LinkedList<r45.cw3> header = z24Var.f391637g;
        kotlin.jvm.internal.o.f(header, "header");
        if (!header.isEmpty()) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            kotlin.jvm.internal.o.f(header, "header");
            for (r45.cw3 cw3Var : header) {
                java.lang.String str3 = cw3Var.f371860d;
                if (!(str3 == null || str3.length() == 0)) {
                    jSONObject.put(cw3Var.f371860d, cw3Var.f371861e);
                }
            }
            hashMap.put("header", jSONObject);
        }
        if (z24Var.f391634d == 0) {
            cVar.s().invoke(cVar.l(hashMap));
            return;
        }
        cVar.s().invoke(cVar.h(1, "fail ret:" + z24Var.f391634d + " retData:" + hashMap + " errMsg:" + str));
    }
}
