package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e;

/* loaded from: classes15.dex */
public class n0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225554a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f225555b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f f225556c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5587xf7a06bec f225557d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.t0 f225558e;

    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.t0 t0Var, java.lang.String str, java.lang.String[] strArr, com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f enumC3698xfb48f2f, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5587xf7a06bec c5587xf7a06bec) {
        this.f225558e = t0Var;
        this.f225554a = str;
        this.f225555b = strArr;
        this.f225556c = enumC3698xfb48f2f;
        this.f225557d = c5587xf7a06bec;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h
    /* renamed from: fail */
    public void mo25333x2fd71e(java.lang.String str, int i17) {
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.o0(this));
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5677x6d1cb2fe c5677x6d1cb2fe = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5677x6d1cb2fe();
        am.ti tiVar = c5677x6d1cb2fe.f136003g;
        tiVar.f89546a = false;
        tiVar.f89547b = str;
        c5677x6d1cb2fe.e();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h
    /* renamed from: success */
    public void mo25334x90b54003(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441, int i17) {
        java.lang.String str;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5677x6d1cb2fe c5677x6d1cb2fe = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5677x6d1cb2fe();
        am.ti tiVar = c5677x6d1cb2fe.f136003g;
        tiVar.f89546a = true;
        tiVar.f89547b = c3712x3ed8a441.f14359x58b7f1c;
        tiVar.f89548c = c3712x3ed8a441.f14369x346425;
        tiVar.f89549d = c3712x3ed8a441.f14375x14f51cd8;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.t0 t0Var = this.f225558e;
        java.lang.String str2 = this.f225554a;
        t0Var.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        if (str2 != null && !str2.equals("")) {
            for (java.lang.String str3 : str2.split("&")) {
                java.lang.String[] split = str3.split("=", 2);
                if (split.length > 1) {
                    hashMap.put(split[0], split[1]);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LiteAppDevQrCodeListener", "query2Map params split length unexpected! param:%s", str3);
                    hashMap.put(split[0], "");
                }
            }
        }
        if (hashMap.containsKey("attach") && "1".equals(hashMap.get("attach")) && hashMap.containsKey("debug") && "1".equals(hashMap.get("debug")) && hashMap.containsKey("debugSvr")) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                c3712x3ed8a441.f14367xdbc3b5f = jSONObject;
                jSONObject.put("type", "debug");
                c3712x3ed8a441.f14367xdbc3b5f.put("debugInfo", this.f225554a);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppDevQrCodeListener", "exception: ", e17.toString());
            }
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().V(c3712x3ed8a441);
                ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.RunnableC16224x624771f());
            } catch (java.lang.Exception unused) {
                ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.RunnableC16225x6247720());
            }
            c5677x6d1cb2fe.e();
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", c3712x3ed8a441.f14359x58b7f1c);
        java.lang.String str4 = this.f225555b[0];
        if (str4 != null) {
            bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, str4);
        }
        java.lang.String str5 = this.f225555b[1];
        if (str5 != null) {
            bundle.putString("query", str5);
        }
        if (!"".equals(this.f225554a) && (str = this.f225554a) != null) {
            bundle.putString("qr_url_query_string", str);
        }
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80 c3708xc1f46f80 = new com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80();
        c3708xc1f46f80.f14311x683188c = this.f225556c;
        bundle.putParcelable("liteappReferrerInfo", c3708xc1f46f80);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk((android.content.Context) this.f225557d.f135909g.f87981c.get(), bundle, true, false, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.t0.b(this.f225558e, this.f225557d);
        c5677x6d1cb2fe.e();
    }
}
