package ce3;

/* loaded from: classes7.dex */
public final class b implements zq1.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ce3.c f122321a;

    public b(ce3.c cVar) {
        this.f122321a = cVar;
    }

    @Override // zq1.g0
    public boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12965xc9712d2 c12965xc9712d2) {
        return false;
    }

    @Override // zq1.g0
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12966xaa8af0d6 result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        r45.z24 z24Var = result.f175461f;
        java.util.HashMap hashMap = new java.util.HashMap();
        int i17 = result.f175459d;
        java.lang.String str = result.f175460e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBJsApiTransferBase", "errCode:" + i17 + " errMsg:" + str);
        ((js1.m) ((zq1.f0) gm0.j1.s(zq1.f0.class))).a(hashMap, result);
        ce3.c cVar = this.f122321a;
        if (z24Var == null) {
            cVar.s().mo146xb9724478(cVar.h(2, "errCode:" + i17 + str));
            return;
        }
        java.lang.String str2 = z24Var.f473169f;
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put("result", str2);
        java.util.LinkedList<r45.cw3> header = z24Var.f473170g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(header, "header");
        if (!header.isEmpty()) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(header, "header");
            for (r45.cw3 cw3Var : header) {
                java.lang.String str3 = cw3Var.f453393d;
                if (!(str3 == null || str3.length() == 0)) {
                    jSONObject.put(cw3Var.f453393d, cw3Var.f453394e);
                }
            }
            hashMap.put("header", jSONObject);
        }
        if (z24Var.f473167d == 0) {
            cVar.s().mo146xb9724478(cVar.l(hashMap));
            return;
        }
        cVar.s().mo146xb9724478(cVar.h(1, "fail ret:" + z24Var.f473167d + " retData:" + hashMap + " errMsg:" + str));
    }
}
