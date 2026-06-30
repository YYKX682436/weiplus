package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f;

/* loaded from: classes8.dex */
public class h extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f.a {
    public h() {
        super(29);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f.a
    public void a(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var, db5.g4 g4Var) {
        boolean z17 = e0Var.f488190n.getBoolean("from_shortcut", false);
        e0Var.f263712l1.getClass();
        java.lang.String str = null;
        java.lang.String t17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(null) ? e0Var.t() : null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(null)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.c4 c4Var = e0Var.K;
            java.lang.String b17 = c4Var.b();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17)) {
                str = (java.lang.String) c4Var.f263693c.get(b17);
            }
        }
        if (z17 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(t17) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !e0Var.v(255)) {
            return;
        }
        g4Var.g(29, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hr8), com.p314xaae8f345.mm.R.raw.f81396x2905e4aa);
        java.lang.String s17 = e0Var.s();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("url", s17);
        } catch (org.json.JSONException unused) {
        }
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(context, 34, 3401, 1, 1, 0, nj0.a.d(jSONObject.toString()));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f.a
    public void b(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f.z zVar) {
        java.lang.String str;
        android.os.Bundle bundle = new android.os.Bundle();
        e0Var.f263712l1.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(null)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.c4 c4Var = e0Var.K;
            java.lang.String b17 = c4Var.b();
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17) ? null : (java.lang.String) c4Var.f263693c.get(b17);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                return;
            }
            int lastIndexOf = str2.lastIndexOf("/");
            if (lastIndexOf != -1) {
                str = str2.substring(0, lastIndexOf) + "/0";
            } else {
                str = str2;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MenuDelegate_AddShortcut", "rawIconUrl : %s, newIconUrl : %s", str2, str);
            bundle.putString("icon_url", str);
        } else {
            bundle.putString("icon_url", null);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(null)) {
            java.lang.String s17 = e0Var.s();
            android.net.Uri parse = android.net.Uri.parse(s17);
            java.lang.String query = parse.getQuery();
            try {
                s17 = new java.net.URI(parse.getScheme(), parse.getAuthority(), parse.getPath(), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(query) ? "ssid=25" : query.contains("ssid=") ? query.replaceFirst("ssid=[0-9]*", "ssid=25") : query.concat("&ssid=25"), parse.getFragment()).toString();
            } catch (java.net.URISyntaxException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MenuDelegate_AddShortcut", e17, "", new java.lang.Object[0]);
            }
            bundle.putString("page_url", s17);
        } else {
            bundle.putString("page_url", null);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(null)) {
            bundle.putString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, e0Var.t());
        } else {
            bundle.putString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, null);
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f.g.class, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f.e(this, e0Var, context));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ga.f34328x366c91de, 12);
        java.lang.String s18 = e0Var.s();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("url", s18);
        } catch (org.json.JSONException unused) {
        }
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(context, 34, 3401, 1, 2, 0, nj0.a.d(jSONObject.toString()));
    }
}
