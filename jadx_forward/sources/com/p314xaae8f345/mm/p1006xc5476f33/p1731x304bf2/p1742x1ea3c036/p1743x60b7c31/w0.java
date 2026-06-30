package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes12.dex */
public final class w0 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "getStoreEmoticonImage";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        org.json.JSONObject e17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.g.e(str);
        if (e17 == null || context == null || q5Var == null) {
            if (q5Var != null) {
                q5Var.a("invalid_params", null);
                return;
            }
            return;
        }
        java.lang.String optString = e17.optString("md5");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            q5Var.a("invalid_params", null);
            return;
        }
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb Bi = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.k0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.v5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.v5.class))).Bi(optString);
        if (Bi != null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) Bi;
            if (o35.a.b(c21053xdbf1e5f4.h0())) {
                f(Bi, q5Var);
                return;
            } else {
                c21053xdbf1e5f4.W(context);
                f(Bi, q5Var);
                return;
            }
        }
        java.lang.String optString2 = e17.optString("product_id");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.k0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.v5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.v5.class))).getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f42 = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4();
            c21053xdbf1e5f42.f68671x4b6e68b9 = optString;
            c21053xdbf1e5f42.f68663x861009b5 = optString2;
            com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.w5 w5Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.w5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.w5.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.v0 v0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.v0(q5Var, this, context);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.m0) w5Var).getClass();
            zq.h.f556505a.c(c21053xdbf1e5f42, v0Var);
            return;
        }
        java.lang.String optString3 = e17.optString("emojiInfoBufferBase64");
        if (optString3 == null || optString3.length() == 0) {
            q5Var.a("productId is null and emojiInfoBufferBase64 is null", null);
            return;
        }
        byte[] decode = android.util.Base64.decode(optString3, 2);
        r45.ri0 ri0Var = new r45.ri0();
        ri0Var.mo11468x92b714fd(decode);
        java.lang.String str2 = ri0Var.f466419d;
        if (str2 == null || str2.length() == 0) {
            q5Var.a("emojiInfoBufferBase64 cast to emojiInfo error", null);
            return;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.k0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.v5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.v5.class))).getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f43 = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4();
        c21053xdbf1e5f43.f68671x4b6e68b9 = ri0Var.f466419d;
        c21053xdbf1e5f43.f68663x861009b5 = ri0Var.f466425m;
        c21053xdbf1e5f43.f68642xf11e6e15 = ri0Var.f466424i;
        c21053xdbf1e5f43.f68654xf47770e7 = ri0Var.f466423h;
        c21053xdbf1e5f43.f68661x765114aa = ri0Var.f466426n;
        c21053xdbf1e5f43.f68660x7650f4b9 = ri0Var.f466427o;
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.w5 w5Var2 = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.w5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.w5.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.v0 v0Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.v0(q5Var, this, context);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.m0) w5Var2).getClass();
        zq.h.f556505a.c(c21053xdbf1e5f43, v0Var2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0016 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:3:0x0002, B:5:0x0008, B:11:0x0031, B:15:0x0016), top: B:2:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb r5, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 r6) {
        /*
            r4 = this;
            r0 = 0
            r1 = 0
            java.lang.String r5 = r5.h0()     // Catch: java.lang.Exception -> L3f
            if (r5 == 0) goto L11
            int r2 = r5.length()     // Catch: java.lang.Exception -> L3f
            if (r2 != 0) goto Lf
            goto L11
        Lf:
            r2 = r0
            goto L12
        L11:
            r2 = 1
        L12:
            if (r2 == 0) goto L16
            r5 = r1
            goto L31
        L16:
            java.io.InputStream r5 = com.p314xaae8f345.mm.vfs.w6.E(r5)     // Catch: java.lang.Exception -> L3f
            java.lang.String r2 = "openRead(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r5, r2)     // Catch: java.lang.Exception -> L3f
            int r2 = r5.available()     // Catch: java.lang.Exception -> L3f
            byte[] r2 = new byte[r2]     // Catch: java.lang.Exception -> L3f
            r5.read(r2)     // Catch: java.lang.Exception -> L3f
            r5.close()     // Catch: java.lang.Exception -> L3f
            r5 = 2
            java.lang.String r5 = android.util.Base64.encodeToString(r2, r5)     // Catch: java.lang.Exception -> L3f
        L31:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L3f
            r2.<init>()     // Catch: java.lang.Exception -> L3f
            java.lang.String r3 = "base64GifData"
            r2.put(r3, r5)     // Catch: java.lang.Exception -> L3f
            r6.a(r1, r2)     // Catch: java.lang.Exception -> L3f
            goto L4c
        L3f:
            r5 = move-exception
            java.lang.String r2 = "JsApiGetStoreEmoticonImage"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r5, r1, r0)
            java.lang.String r5 = "fail"
            r6.a(r5, r1)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.w0.f(com.tencent.mm.api.IEmojiInfo, com.tencent.mm.plugin.webview.luggage.jsapi.q5):void");
    }
}
