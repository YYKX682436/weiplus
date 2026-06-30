package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1805xc04ba66c;

/* renamed from: com.tencent.mm.plugin.lite.jsapi.module.LiteAppDebugPannelModule */
/* loaded from: classes15.dex */
public class C16216x4ebdc024 extends bd.d {
    @bd.c(m10165xc19dc9be = false)
    /* renamed from: getLiteAppConfigList */
    public org.json.JSONArray m65729x6d08293d() {
        java.util.ArrayList<com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.C16232x49695e3> m65656xa8b1938b = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1798xaf3f8342.C16192x8446fa43.m65649x9cf0d20b().m65656xa8b1938b();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        if (m65656xa8b1938b != null && !m65656xa8b1938b.isEmpty()) {
            try {
                java.util.Iterator<com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.C16232x49695e3> it = m65656xa8b1938b.iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.C16232x49695e3 next = it.next();
                    if (!next.f37422x28d45f97.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1798xaf3f8342.C16192x8446fa43.f37331xb922ec4f)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1798xaf3f8342.C16193x8e74f094 m65653xd9e187d1 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1798xaf3f8342.C16192x8446fa43.m65649x9cf0d20b().m65653xd9e187d1(next.f37422x28d45f97);
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put("appId", next.f37422x28d45f97);
                        jSONObject.put("config", m65653xd9e187d1.m65674x9616526c());
                        jSONArray.put(jSONObject);
                    }
                }
            } catch (org.json.JSONException unused) {
            }
        }
        return jSONArray;
    }

    @bd.c(m10165xc19dc9be = false)
    /* renamed from: getLiteAppList */
    public org.json.JSONArray m65730x3b2c549b() {
        java.util.List<com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441> A = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().A();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441 : A) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("appId", c3712x3ed8a441.f14359x58b7f1c);
                jSONObject.put(dm.i4.f66874x4c6b1f55, c3712x3ed8a441.f14374xee5c7336);
                jSONObject.put("version", com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65338x15e79bbb(c3712x3ed8a441.f14369x346425, c3712x3ed8a441.f14359x58b7f1c, c3712x3ed8a441.f14372xa8503287));
                jSONObject.put("versionType", com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65339x5d154995(c3712x3ed8a441.f14369x346425, c3712x3ed8a441.f14359x58b7f1c, c3712x3ed8a441.f14372xa8503287));
                jSONObject.put("type", c3712x3ed8a441.f14373x368f3a);
                jSONObject.put("md5", c3712x3ed8a441.f127552md5);
                jSONArray.put(jSONObject);
            } catch (org.json.JSONException unused) {
            }
        }
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef u17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().u(null);
        if (u17 != null) {
            try {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("appId", com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37141xc474b466);
                jSONObject2.put(dm.i4.f66874x4c6b1f55, u17.f14333xee5c7336);
                jSONObject2.put("version", u17.f14334x14f51cd8);
                jSONObject2.put("type", u17.f14332x368f3a);
                jSONObject2.put("md5", u17.f127550md5);
                jSONArray.put(jSONObject2);
            } catch (org.json.JSONException unused2) {
            }
        }
        return jSONArray;
    }

    @bd.c(m10165xc19dc9be = false)
    /* renamed from: removeLiteApp */
    public boolean m65731x52212d6f(java.lang.String str) {
        if (str.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37141xc474b466)) {
            com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef u17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().u(null);
            if (u17 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().K(u17);
                com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x Ui = ((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class))).Ui(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37141xc474b466, com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29);
                if (Ui != null && Ui.f299130o == 1 && com.p314xaae8f345.mm.vfs.w6.j(Ui.m117639xfb83cc9b())) {
                    com.p314xaae8f345.mm.vfs.w6.h(Ui.m117639xfb83cc9b());
                }
            }
        } else {
            com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 y17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().y(str, null);
            if (y17 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().L(y17);
                md.k.a(com.p314xaae8f345.mm.p2621x8fb0427b.v3.f277808c + "/pkg/" + str);
                com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x Ui2 = ((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class))).Ui(str, com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29);
                if (Ui2 != null && Ui2.f299130o == 1 && com.p314xaae8f345.mm.vfs.w6.j(Ui2.m117639xfb83cc9b())) {
                    com.p314xaae8f345.mm.vfs.w6.h(Ui2.m117639xfb83cc9b());
                }
            }
        }
        return true;
    }
}
