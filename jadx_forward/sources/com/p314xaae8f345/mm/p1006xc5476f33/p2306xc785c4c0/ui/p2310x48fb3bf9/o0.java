package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9;

/* loaded from: classes7.dex */
public class o0 implements zq1.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f256775a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.l f256776b;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.l lVar, java.lang.String str) {
        this.f256776b = lVar;
        this.f256775a = str;
    }

    @Override // zq1.g0
    public boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12965xc9712d2 c12965xc9712d2) {
        return false;
    }

    @Override // zq1.g0
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12966xaa8af0d6 c12966xaa8af0d6) {
        r45.z24 z24Var = c12966xaa8af0d6.f175461f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "TopStoryTransferRequestResultCallback.onResult errCode: %s errMsg: %s, response: %s", java.lang.Integer.valueOf(c12966xaa8af0d6.f175459d), c12966xaa8af0d6.f175460e, z24Var);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        ((js1.m) ((zq1.f0) gm0.j1.s(zq1.f0.class))).getClass();
        jSONObject.put("h5auth", c12966xaa8af0d6.f175462g ? 1 : 0);
        jSONObject.put("retry", c12966xaa8af0d6.f175463h ? 1 : 0);
        try {
            jSONObject.put("objectid", this.f256775a);
        } catch (java.lang.Exception unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.l lVar = this.f256776b;
        try {
            if (z24Var == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.b.a(lVar, "onExtTransferReady", lVar.f().toString());
                return;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z24Var.f473169f)) {
                jSONObject.put("result", "");
            } else {
                jSONObject.put("result", z24Var.f473169f);
            }
            java.util.LinkedList linkedList = z24Var.f473170g;
            if (linkedList != null && linkedList.size() > 0) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                java.util.Iterator it = z24Var.f473170g.iterator();
                while (it.hasNext()) {
                    r45.cw3 cw3Var = (r45.cw3) it.next();
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cw3Var.f453393d)) {
                        try {
                            jSONObject2.put(cw3Var.f453393d, cw3Var.f453394e);
                        } catch (org.json.JSONException unused2) {
                        }
                    }
                }
                jSONObject.put("header", jSONObject2);
            }
            jSONObject.put("ret", z24Var.f473167d);
            com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.b.a(lVar, "onExtTransferReady", jSONObject.toString());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TopStory.TopStoryWebViewJSApi", e17, "onResult", new java.lang.Object[0]);
            com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.b.a(lVar, "onExtTransferReady", lVar.f().toString());
        }
    }
}
