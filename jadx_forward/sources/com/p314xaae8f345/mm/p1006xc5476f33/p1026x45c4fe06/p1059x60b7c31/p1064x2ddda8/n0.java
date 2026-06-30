package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public abstract class n0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g {
    public static java.util.LinkedList I(java.util.LinkedList linkedList) {
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.jv5 jv5Var = (r45.jv5) it.next();
            fl1.j jVar = new fl1.j();
            jVar.f345326a = jv5Var.f459664d;
            jVar.f345328c = jv5Var.f459665e;
            jVar.f345327b = jv5Var.f459666f;
            linkedList2.add(jVar);
        }
        return linkedList2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public final void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public final void B(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 c0Var) {
        throw new java.lang.UnsupportedOperationException();
    }

    public abstract void C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ff ffVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.o oVar);

    public void D(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, java.lang.String str, jc1.d dVar) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            lVar.a(i17, r(null, dVar, null));
        } else {
            lVar.a(i17, r(str, dVar, null));
        }
    }

    public void E(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, java.lang.String str, jc1.d dVar, org.json.JSONObject jSONObject) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            lVar.a(i17, r(null, dVar, jSONObject));
        } else {
            lVar.a(i17, r(str, dVar, jSONObject));
        }
    }

    public void F(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        lVar.a(i17, s(str, jSONObject));
    }

    public boolean G(org.json.JSONArray jSONArray, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        boolean z17;
        if (jSONArray != null && jSONArray.length() > 0) {
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                try {
                    java.lang.String obj = jSONArray.get(i17).toString();
                    if (c11510xdd90c2f2.H1 != null) {
                        for (int i18 = 0; i18 < c11510xdd90c2f2.H1.length(); i18++) {
                            if (c11510xdd90c2f2.H1.optString(i18).equals(obj)) {
                                z17 = true;
                                break;
                            }
                        }
                    }
                    z17 = false;
                } catch (org.json.JSONException unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.BaseAuthJsApi", "illegal arguments");
                }
                if (z17) {
                    return true;
                }
            }
        }
        return false;
    }

    public android.app.Activity H(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        android.content.Context Z0 = lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar).Z0() : lVar.mo50352x76847179();
        if (Z0 == null) {
            return null;
        }
        return q75.a.a(Z0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g
    public void h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ff ffVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h B;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h hVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = ffVar.f162546b;
        org.json.JSONObject jSONObject = ffVar.f162547c;
        boolean optBoolean = jSONObject.optBoolean("requestInQueue", true);
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.q0.f33864x24728b.equalsIgnoreCase(k())) {
            C(ffVar, null);
            return;
        }
        try {
            jSONObject.put("wxdataQueueTimestamp", java.lang.System.currentTimeMillis());
        } catch (org.json.JSONException unused) {
        }
        if (optBoolean) {
            if (lVar == null) {
                B = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.k.f161143a;
            } else if (lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) {
                B = ((ze.n) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar).t3()).B();
                if (B == null) {
                    B = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.k.f161143a;
                }
            } else {
                B = lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.g ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.g) lVar).B() : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.k.f161143a;
            }
            B.b(this, ffVar);
            return;
        }
        jz5.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.f.f161068g;
        if (lVar == null) {
            hVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.f.f161068g).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(hVar, "<get-DUMMY_IMPL>(...)");
        } else if (lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar).t3();
            ze.n nVar = t37 instanceof ze.n ? (ze.n) t37 : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.f L = nVar != null ? nVar.L() : null;
            if (L == null) {
                hVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.f.f161068g).mo141623x754a37bb();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(hVar, "<get-DUMMY_IMPL>(...)");
            } else {
                hVar = L;
            }
        } else if (lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.g) {
            hVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.g) lVar).L();
            if (hVar == null) {
                hVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.f.f161068g).mo141623x754a37bb();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(hVar, "<get-DUMMY_IMPL>(...)");
            }
        } else {
            hVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.f.f161068g).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(hVar, "<get-DUMMY_IMPL>(...)");
        }
        hVar.b(this, ffVar);
    }
}
