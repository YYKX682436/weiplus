package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

@j95.b
/* loaded from: classes12.dex */
public class h2 extends i95.w implements com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Boolean f147836d;

    public boolean Ai() {
        if (this.f147836d == null) {
            this.f147836d = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_emoji_msg_not_show_soft_bank, true));
        }
        return this.f147836d.booleanValue();
    }

    public java.lang.String Bi() {
        return n22.m.g();
    }

    public boolean Di(long j17) {
        int ordinal;
        java.util.ArrayList arrayList = n22.m.f415828a;
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 p17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().p1(j17);
        return p17 != null && p17.m1() == qk.x6.STATUS_UPLOAD_FAIL && ((ordinal = p17.y1().ordinal()) == 1 || ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 6);
    }

    public void wi(java.lang.String str, org.json.JSONObject jSONObject, com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb) {
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) interfaceC4987x84e327cb;
        java.util.ArrayList arrayList = n22.m.f415828a;
        try {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c21053xdbf1e5f4.f68671x4b6e68b9) || c21053xdbf1e5f4.f68671x4b6e68b9.equals(jSONObject.getString("md5"))) {
                c21053xdbf1e5f4.f68671x4b6e68b9 = n22.m.c(jSONObject.optString("md5", ""), c21053xdbf1e5f4.f68671x4b6e68b9);
                c21053xdbf1e5f4.f68654xf47770e7 = n22.m.c(jSONObject.optString("productUrl", ""), c21053xdbf1e5f4.f68654xf47770e7);
                c21053xdbf1e5f4.f68686x7b284d5e = n22.m.c(jSONObject.optString("thumb", ""), c21053xdbf1e5f4.f68686x7b284d5e);
                c21053xdbf1e5f4.f68659x5efe714f = n22.m.c(jSONObject.optString("encryptUrl", ""), c21053xdbf1e5f4.f68659x5efe714f);
                c21053xdbf1e5f4.f68642xf11e6e15 = n22.m.c(jSONObject.optString("aesKey", ""), c21053xdbf1e5f4.f68642xf11e6e15);
                c21053xdbf1e5f4.f68663x861009b5 = n22.m.c(jSONObject.optString("productID", ""), c21053xdbf1e5f4.f68663x861009b5);
                c21053xdbf1e5f4.E2 = n22.m.c(jSONObject.optString("productName", ""), c21053xdbf1e5f4.E2);
                l75.e0 e0Var = com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4.L2;
                c21053xdbf1e5f4.f68653x95b20dd4 = 65;
                if (lj.f.f(c21053xdbf1e5f4.f68654xf47770e7) && lj.f.f(c21053xdbf1e5f4.f68642xf11e6e15)) {
                    c21053xdbf1e5f4.f68654xf47770e7 = c21053xdbf1e5f4.f68659x5efe714f;
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, e17, "convertEmojiInfo", new java.lang.Object[0]);
        }
    }
}
