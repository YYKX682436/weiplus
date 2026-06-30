package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes5.dex */
public final class c70 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.c70 f208101d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.c70();

    public c70() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Iterator it = kz5.c0.i(e42.d0.clicfg_finder_ftpp_codec_reuse_model_list_0, e42.d0.clicfg_finder_ftpp_codec_reuse_model_list_1, e42.d0.clicfg_finder_ftpp_codec_reuse_model_list_2, e42.d0.clicfg_finder_ftpp_codec_reuse_model_list_3, e42.d0.clicfg_finder_ftpp_codec_reuse_model_list_4, e42.d0.clicfg_finder_ftpp_codec_reuse_model_list_5, e42.d0.clicfg_finder_ftpp_codec_reuse_model_list_6, e42.d0.clicfg_finder_ftpp_codec_reuse_model_list_7, e42.d0.clicfg_finder_ftpp_codec_reuse_model_list_8, e42.d0.clicfg_finder_ftpp_codec_reuse_model_list_9).iterator();
        boolean z17 = false;
        while (it.hasNext()) {
            java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi((e42.d0) it.next(), (java.lang.String) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.E).mo141623x754a37bb(), true);
            if (!android.text.TextUtils.isEmpty(Zi)) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(Zi);
                    if (jSONObject.getInt("mode") == 1) {
                        org.json.JSONArray jSONArray = jSONObject.getJSONArray("whitelist");
                        int length = jSONArray.length();
                        int i17 = 0;
                        while (true) {
                            if (i17 >= length) {
                                break;
                            }
                            if (r26.i0.p(wo.w0.m(), jSONArray.getString(i17), true)) {
                                z17 = true;
                                break;
                            }
                            i17++;
                        }
                        if (z17) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("FinderConfig", th6, "", new java.lang.Object[0]);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1505L, 9L, z17 ? 1L : 0L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderConfig", "checkEnableCodecReuse enableCodecReuse:" + z17 + " duration:" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        return java.lang.Boolean.valueOf(z17);
    }
}
