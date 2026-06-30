package yx4;

/* loaded from: classes7.dex */
public final class d implements zq1.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f549507a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f549508b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.ref.WeakReference f549509c;

    public d(java.lang.String callbackId, java.lang.String funcName, java.lang.ref.WeakReference jsApiHandlerReference) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callbackId, "callbackId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(funcName, "funcName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsApiHandlerReference, "jsApiHandlerReference");
        this.f549507a = callbackId;
        this.f549508b = funcName;
        this.f549509c = jsApiHandlerReference;
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
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[transferRequest-");
        java.lang.String str = this.f549508b;
        sb6.append(str);
        sb6.append("] errMsg: %s, response: %s");
        java.lang.String sb7 = sb6.toString();
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = result.f175460e;
        objArr[1] = z24Var != null ? java.lang.Integer.valueOf(z24Var.f473167d) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiTransferRequestBase", sb7, objArr);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.C(1454L, 184L, 1L);
        nw4.g gVar = (nw4.g) this.f549509c.get();
        if (gVar == null) {
            g0Var.C(1454L, 185L, 1L);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiTransferRequestBase", "jsApiHandler is recycled");
            return;
        }
        ((js1.m) ((zq1.f0) gm0.j1.s(zq1.f0.class))).a(hashMap, result);
        java.lang.String str2 = this.f549507a;
        if (z24Var == null) {
            hashMap.put("errCode", -1);
            gVar.e(str2, str + ":fail", hashMap);
            return;
        }
        hashMap.put("errCode", java.lang.Integer.valueOf(z24Var.f473167d));
        java.lang.String str3 = z24Var.f473169f;
        if (str3 == null) {
            str3 = "";
        }
        hashMap.put("result", str3);
        java.util.LinkedList<r45.cw3> header = z24Var.f473170g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(header, "header");
        if (!header.isEmpty()) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(header, "header");
            for (r45.cw3 cw3Var : header) {
                java.lang.String str4 = cw3Var.f453393d;
                if (!(str4 == null || str4.length() == 0)) {
                    jSONObject.put(cw3Var.f453393d, cw3Var.f453394e);
                }
            }
            hashMap.put("header", jSONObject);
        }
        if (z24Var.f473167d == 0) {
            gVar.e(str2, str + ":ok", hashMap);
            return;
        }
        gVar.e(str2, str + ":fail " + z24Var.f473168e, hashMap);
    }
}
