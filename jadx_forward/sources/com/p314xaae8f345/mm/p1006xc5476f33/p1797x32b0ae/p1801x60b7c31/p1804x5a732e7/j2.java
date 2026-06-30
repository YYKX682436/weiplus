package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes7.dex */
public final class j2 implements zq1.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.k2 f225155a;

    public j2(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.k2 k2Var) {
        this.f225155a = k2Var;
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
        ((js1.m) ((zq1.f0) gm0.j1.s(zq1.f0.class))).a(hashMap, result);
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = result.f175460e;
        objArr[1] = z24Var != null ? java.lang.Integer.valueOf(z24Var.f473167d) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiExtTransfer", "extTransfer errMsg: %s, response: %s", objArr);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.k2 k2Var = this.f225155a;
        if (z24Var == null) {
            k2Var.f224976f.a("extTransfer: fail");
            return;
        }
        hashMap.put("errCode", java.lang.Integer.valueOf(z24Var.f473167d));
        java.lang.String str = z24Var.f473169f;
        if (str == null) {
            str = "";
        }
        hashMap.put("result", str);
        java.util.LinkedList<r45.cw3> header = z24Var.f473170g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(header, "header");
        if (!header.isEmpty()) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(header, "header");
            for (r45.cw3 cw3Var : header) {
                java.lang.String str2 = cw3Var.f453393d;
                if (!(str2 == null || str2.length() == 0)) {
                    jSONObject.put(cw3Var.f453393d, cw3Var.f453394e);
                }
            }
            hashMap.put("header", jSONObject);
        }
        if (z24Var.f473167d == 0) {
            k2Var.f224976f.b(hashMap);
        } else {
            k2Var.f224976f.a("extTransfer: fail");
        }
    }
}
