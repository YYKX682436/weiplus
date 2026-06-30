package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes7.dex */
public final class b implements zq1.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 f263794a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.c f263795b;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.c cVar) {
        this.f263794a = q5Var;
        this.f263795b = cVar;
    }

    @Override // zq1.g0
    public boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12965xc9712d2 c12965xc9712d2) {
        java.lang.String str;
        boolean i17 = (c12965xc9712d2 == null || (str = c12965xc9712d2.f175447e) == null) ? false : hy4.i.i(str);
        if (!i17) {
            this.f263794a.a("interceptRequest url is not GameCenterUrl ", null);
        }
        return !i17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zq1.g0
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12966xaa8af0d6 result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        r45.z24 z24Var = result.f175461f;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        ((js1.m) ((zq1.f0) gm0.j1.s(zq1.f0.class))).getClass();
        jSONObject.put("h5auth", result.f175462g ? 1 : 0);
        jSONObject.put("retry", result.f175463h ? 1 : 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var = this.f263794a;
        if (z24Var == null) {
            java.lang.String str = result.f175460e;
            q5Var.a(str == null || str.length() == 0 ? this.f263795b.f() + " failed" : result.f175460e, jSONObject);
            return;
        }
        java.lang.Object obj = z24Var.f473168e;
        if (obj == null) {
            obj = "";
        }
        jSONObject.put("err_desc", obj);
        java.lang.Object obj2 = z24Var.f473169f;
        jSONObject.put("respJson", obj2 != null ? obj2 : "");
        java.util.LinkedList<r45.cw3> header = z24Var.f473170g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(header, "header");
        if (!header.isEmpty()) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            for (r45.cw3 cw3Var : header) {
                java.lang.String str2 = cw3Var.f453393d;
                if ((str2 == null || str2.length() == 0) == false) {
                    jSONObject2.put(cw3Var.f453393d, cw3Var.f453394e);
                }
            }
            jSONObject.put("header", jSONObject2);
        }
        if (z24Var.f473167d == 0) {
            q5Var.a(null, jSONObject);
            return;
        }
        q5Var.a("failed " + z24Var.f473167d, jSONObject);
    }
}
