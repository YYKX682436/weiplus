package nf1;

/* loaded from: classes7.dex */
public final class b implements zq1.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nf1.c f418176a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f418177b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f418178c;

    public b(nf1.c cVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var) {
        this.f418176a = cVar;
        this.f418177b = i17;
        this.f418178c = c0Var;
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
        nf1.c cVar = this.f418176a;
        java.lang.String C = cVar.C();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[transferRequest-");
        int i17 = this.f418177b;
        sb6.append(i17);
        sb6.append("] errMsg: ");
        sb6.append(result.f175460e);
        sb6.append(", response: ");
        sb6.append(z24Var != null ? z24Var.f473167d : -1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(C, sb6.toString());
        ((js1.m) ((zq1.f0) gm0.j1.s(zq1.f0.class))).a(hashMap, result);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = this.f418178c;
        if (z24Var == null) {
            hashMap.put("errCode", -1);
            cVar.getClass();
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap.put("errno", -1);
            c0Var.a(i17, cVar.t("fail", hashMap));
            return;
        }
        hashMap.put("errCode", java.lang.Integer.valueOf(z24Var.f473167d));
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
        int i18 = z24Var.f473167d;
        if (i18 == 0) {
            cVar.getClass();
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap.put("errno", 0);
            c0Var.a(i17, cVar.t("ok", hashMap));
            return;
        }
        java.lang.String str5 = "fail " + z24Var.f473168e;
        cVar.getClass();
        java.lang.String str6 = str5 != null ? str5 : "";
        java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        hashMap.put("errno", java.lang.Integer.valueOf(i18));
        c0Var.a(i17, cVar.t(str6, hashMap));
    }
}
