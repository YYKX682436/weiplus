package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29;

/* loaded from: classes8.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f221888a = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.m.b(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.l.PERMANENT) + "hvmenu/";

    public static void a(java.util.List list, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.k kVar) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
            if (kVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.i iVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.i) kVar;
                java.lang.String str = iVar.f221863a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameCommOpertionProcessor", "menu icon download complete! save menu data. appid:%s", str);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ri().J0("pb_game_hv_menu_" + str, iVar.f221864b);
                return;
            }
            return;
        }
        r45.rk4 rk4Var = (r45.rk4) list.remove(0);
        if (rk4Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(rk4Var.f466499f)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameCommOpertionProcessor", "menu is null or thumburl is null");
            return;
        }
        java.lang.String str2 = f221888a + kk.k.g(rk4Var.f466499f.getBytes());
        o11.f fVar = new o11.f();
        fVar.f423611b = true;
        fVar.f423615f = str2;
        n11.a.b().d(rk4Var.f466499f, fVar.a(), new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.j(rk4Var, list, kVar));
    }

    public static boolean b(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.l lVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.l) ((h43.e) i95.n0.c(h43.e.class));
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 abstractC19284xdca64a7 = null;
        byte[] z07 = lVar.wi() == null ? null : lVar.wi().z0(str);
        if (z07 != null && z07.length != 0) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(z07));
                int optInt = jSONObject.optInt("mediaType", 0);
                if (optInt == 1) {
                    abstractC19284xdca64a7 = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19285xc6d09416();
                    abstractC19284xdca64a7.d(jSONObject);
                } else if (optInt == 4) {
                    abstractC19284xdca64a7 = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19287x4a9b6f36();
                    abstractC19284xdca64a7.d(jSONObject);
                }
            } catch (org.json.JSONException unused) {
            }
            if (abstractC19284xdca64a7 != null && com.p314xaae8f345.mm.vfs.w6.j(abstractC19284xdca64a7.f264271g) && (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(abstractC19284xdca64a7.f264270f) || com.p314xaae8f345.mm.vfs.w6.j(abstractC19284xdca64a7.f264270f))) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi().a(abstractC19284xdca64a7);
                return true;
            }
        }
        return false;
    }
}
