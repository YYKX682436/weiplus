package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public abstract class n0 extends com.tencent.mm.plugin.appbrand.jsapi.f implements com.tencent.mm.plugin.appbrand.jsapi.g {
    public static java.util.LinkedList I(java.util.LinkedList linkedList) {
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.jv5 jv5Var = (r45.jv5) it.next();
            fl1.j jVar = new fl1.j();
            jVar.f263793a = jv5Var.f378131d;
            jVar.f263795c = jv5Var.f378132e;
            jVar.f263794b = jv5Var.f378133f;
            linkedList2.add(jVar);
        }
        return linkedList2;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public final void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public final void B(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17, com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var) {
        throw new java.lang.UnsupportedOperationException();
    }

    public abstract void C(com.tencent.mm.plugin.appbrand.jsapi.ff ffVar, com.tencent.mm.plugin.appbrand.jsapi.auth.o oVar);

    public void D(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, java.lang.String str, jc1.d dVar) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            lVar.a(i17, r(null, dVar, null));
        } else {
            lVar.a(i17, r(str, dVar, null));
        }
    }

    public void E(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, java.lang.String str, jc1.d dVar, org.json.JSONObject jSONObject) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            lVar.a(i17, r(null, dVar, jSONObject));
        } else {
            lVar.a(i17, r(str, dVar, jSONObject));
        }
    }

    public void F(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        lVar.a(i17, s(str, jSONObject));
    }

    public boolean G(org.json.JSONArray jSONArray, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        boolean z17;
        if (jSONArray != null && jSONArray.length() > 0) {
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                try {
                    java.lang.String obj = jSONArray.get(i17).toString();
                    if (appBrandRuntime.H1 != null) {
                        for (int i18 = 0; i18 < appBrandRuntime.H1.length(); i18++) {
                            if (appBrandRuntime.H1.optString(i18).equals(obj)) {
                                z17 = true;
                                break;
                            }
                        }
                    }
                    z17 = false;
                } catch (org.json.JSONException unused) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.BaseAuthJsApi", "illegal arguments");
                }
                if (z17) {
                    return true;
                }
            }
        }
        return false;
    }

    public android.app.Activity H(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        android.content.Context Z0 = lVar instanceof com.tencent.mm.plugin.appbrand.e9 ? ((com.tencent.mm.plugin.appbrand.e9) lVar).Z0() : lVar.getContext();
        if (Z0 == null) {
            return null;
        }
        return q75.a.a(Z0);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.g
    public void h(com.tencent.mm.plugin.appbrand.jsapi.ff ffVar) {
        com.tencent.mm.plugin.appbrand.jsapi.auth.h B;
        com.tencent.mm.plugin.appbrand.jsapi.auth.h hVar;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = ffVar.f81013b;
        org.json.JSONObject jSONObject = ffVar.f81014c;
        boolean optBoolean = jSONObject.optBoolean("requestInQueue", true);
        if (com.tencent.mm.plugin.appbrand.jsapi.auth.q0.NAME.equalsIgnoreCase(k())) {
            C(ffVar, null);
            return;
        }
        try {
            jSONObject.put("wxdataQueueTimestamp", java.lang.System.currentTimeMillis());
        } catch (org.json.JSONException unused) {
        }
        if (optBoolean) {
            if (lVar == null) {
                B = com.tencent.mm.plugin.appbrand.jsapi.auth.k.f79610a;
            } else if (lVar instanceof com.tencent.mm.plugin.appbrand.y) {
                B = ((ze.n) ((com.tencent.mm.plugin.appbrand.y) lVar).t3()).B();
                if (B == null) {
                    B = com.tencent.mm.plugin.appbrand.jsapi.auth.k.f79610a;
                }
            } else {
                B = lVar instanceof com.tencent.mm.plugin.appbrand.jsapi.auth.g ? ((com.tencent.mm.plugin.appbrand.jsapi.auth.g) lVar).B() : com.tencent.mm.plugin.appbrand.jsapi.auth.k.f79610a;
            }
            B.b(this, ffVar);
            return;
        }
        jz5.g gVar = com.tencent.mm.plugin.appbrand.jsapi.auth.f.f79535g;
        if (lVar == null) {
            hVar = (com.tencent.mm.plugin.appbrand.jsapi.auth.h) ((jz5.n) com.tencent.mm.plugin.appbrand.jsapi.auth.f.f79535g).getValue();
            kotlin.jvm.internal.o.f(hVar, "<get-DUMMY_IMPL>(...)");
        } else if (lVar instanceof com.tencent.mm.plugin.appbrand.y) {
            com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = ((com.tencent.mm.plugin.appbrand.y) lVar).t3();
            ze.n nVar = t37 instanceof ze.n ? (ze.n) t37 : null;
            com.tencent.mm.plugin.appbrand.jsapi.auth.f L = nVar != null ? nVar.L() : null;
            if (L == null) {
                hVar = (com.tencent.mm.plugin.appbrand.jsapi.auth.h) ((jz5.n) com.tencent.mm.plugin.appbrand.jsapi.auth.f.f79535g).getValue();
                kotlin.jvm.internal.o.f(hVar, "<get-DUMMY_IMPL>(...)");
            } else {
                hVar = L;
            }
        } else if (lVar instanceof com.tencent.mm.plugin.appbrand.jsapi.auth.g) {
            hVar = ((com.tencent.mm.plugin.appbrand.jsapi.auth.g) lVar).L();
            if (hVar == null) {
                hVar = (com.tencent.mm.plugin.appbrand.jsapi.auth.h) ((jz5.n) com.tencent.mm.plugin.appbrand.jsapi.auth.f.f79535g).getValue();
                kotlin.jvm.internal.o.f(hVar, "<get-DUMMY_IMPL>(...)");
            }
        } else {
            hVar = (com.tencent.mm.plugin.appbrand.jsapi.auth.h) ((jz5.n) com.tencent.mm.plugin.appbrand.jsapi.auth.f.f79535g).getValue();
            kotlin.jvm.internal.o.f(hVar, "<get-DUMMY_IMPL>(...)");
        }
        hVar.b(this, ffVar);
    }
}
