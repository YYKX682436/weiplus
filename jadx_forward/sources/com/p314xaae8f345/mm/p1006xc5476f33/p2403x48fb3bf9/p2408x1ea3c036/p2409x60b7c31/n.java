package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes.dex */
public class n extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "addToEmoticon";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAddToEmotion", "invoke");
        org.json.JSONObject e17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.g.e(str);
        if (e17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAddToEmotion", "bundle is null");
            q5Var.a("null_data", null);
            return;
        }
        java.lang.String optString = e17.optString("base64DataString");
        java.lang.String optString2 = e17.optString("thumbUrl");
        java.lang.String optString3 = e17.optString("url");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString3)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAddToEmotion", "doAddToEmoticon base64DataString is null and url is null");
                q5Var.a("base64DataString_and_url_is_null", null);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAddToEmotion", "doAddToEmoticon use url:%s", optString3);
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(context.getCacheDir(), kk.k.g(optString3.getBytes()));
            if (!r6Var.m()) {
                o11.f fVar = new o11.f();
                fVar.f423611b = true;
                fVar.f423615f = r6Var.o();
                fVar.f423635z = new java.lang.Object[]{r6Var.o()};
                ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.s5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.s5.class))).Di().j(optString3, null, fVar.a(), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.m(this, optString3, context, optString2, q5Var));
                return;
            }
            java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(r6Var.u());
            com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.x5 x5Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.x5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.x5.class);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.h2) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6.class))).getClass();
            java.lang.String g17 = n22.m.g();
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.o0) x5Var).getClass();
            java.lang.String p18 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.p(g17, "", p17);
            if (!com.p314xaae8f345.mm.vfs.w6.j(p18)) {
                com.p314xaae8f345.mm.vfs.w6.c(r6Var.o(), p18);
            }
            f(context, p17, optString2, q5Var);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAddToEmotion", "doAddToEmoticon use base64DataString");
        int indexOf = optString.indexOf(";base64,");
        try {
            byte[] decode = android.util.Base64.decode(indexOf != -1 ? optString.substring(indexOf + 8, optString.length()) : "", 0);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(decode)) {
                q5Var.a("fail", null);
                return;
            }
            java.lang.String g18 = kk.k.g(decode);
            com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.x5 x5Var2 = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.x5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.x5.class);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.h2) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6.class))).getClass();
            java.lang.String g19 = n22.m.g();
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.o0) x5Var2).getClass();
            java.lang.String p19 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.p(g19, "", g18);
            if (!com.p314xaae8f345.mm.vfs.w6.j(p19) || !com.p314xaae8f345.mm.vfs.w6.p(p19).equalsIgnoreCase(g18)) {
                com.p314xaae8f345.mm.vfs.w6.S(p19, decode, 0, decode.length);
            }
            f(context, g18, optString2, q5Var);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAddToEmotion", "doAddToEmoticon error:" + e18.getMessage());
            q5Var.a("fail", null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
    }

    public final void f(android.content.Context context, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.x5 x5Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.x5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.x5.class);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.h2) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6.class))).getClass();
        java.lang.String g17 = n22.m.g();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.o0) x5Var).getClass();
        java.lang.String p17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.p(g17, "", str);
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb Bi = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.k0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.v5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.v5.class))).Bi(str);
        if (Bi == null && com.p314xaae8f345.mm.vfs.w6.j(p17)) {
            int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.c(p17) ? 2 : 1;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.k0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.v5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.v5.class))).getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4();
            c21053xdbf1e5f4.f68671x4b6e68b9 = str;
            c21053xdbf1e5f4.f68653x95b20dd4 = 65;
            c21053xdbf1e5f4.f68689x2262335f = i17;
            c21053xdbf1e5f4.f68679x22618426 = (int) com.p314xaae8f345.mm.vfs.w6.k(p17);
            c21053xdbf1e5f4.f68685x2261e7f9 = 1;
            c21053xdbf1e5f4.f68686x7b284d5e = str2;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.k0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.v5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.v5.class))).wi(c21053xdbf1e5f4);
            Bi = c21053xdbf1e5f4;
        }
        if (Bi == null) {
            q5Var.a("fail", null);
            return;
        }
        boolean wi6 = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.s0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.y5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.y5.class))).wi(context, Bi, 18, c01.z1.r());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAddToEmotion", "doAddAction %b", java.lang.Boolean.valueOf(wi6));
        if (wi6) {
            q5Var.a(null, null);
        } else {
            q5Var.a("fail", null);
        }
    }
}
