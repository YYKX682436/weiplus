package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public class q5 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f34499x366c91de = 733;

    /* renamed from: NAME */
    public static final java.lang.String f34500x24728b = "compressVideo";

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f163550g = new java.util.concurrent.atomic.AtomicBoolean(false);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.r7 r7Var;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f163550g;
        if (atomicBoolean.get()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCompressVideo", "is compressing now");
            lVar.a(i17, o("fail:is compressing now"));
            return;
        }
        if (lVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiCompressVideo", "fail:component is null");
            return;
        }
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiCompressVideo", "fail:data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        java.lang.String optString = jSONObject.optString("src");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiCompressVideo", "fail:data src is empty");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        if (!optString.startsWith("wxfile://")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiCompressVideo", "fail:src path not supported");
            lVar.a(i17, o("fail:src path not be supported"));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 mo50354x59eafec1 = lVar.mo50354x59eafec1();
        if (mo50354x59eafec1 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiCompressVideo", "fail:runtime fileSystem is null");
            lVar.a(i17, o("fail:internal error"));
            return;
        }
        com.p314xaae8f345.mm.vfs.r6 mo49620x1d537609 = mo50354x59eafec1.mo49620x1d537609(optString);
        if (mo49620x1d537609 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiCompressVideo", "fail:srcFile is null");
            lVar.a(i17, o("fail:file doesn't exist"));
            return;
        }
        java.lang.String o17 = mo49620x1d537609.o();
        if (!com.p314xaae8f345.mm.vfs.w6.j(o17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiCompressVideo", "fail:filePath is null or without exist file");
            lVar.a(i17, o("fail:file doesn't exist"));
            return;
        }
        if (!jSONObject.has("quality") && !jSONObject.has(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63) && !jSONObject.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15517x245ebd1) && !jSONObject.has(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54473x7fe978e1)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiCompressVideo", "no quality config");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        if (!jSONObject.has("quality")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCompressVideo", "compress with advance config");
            float optDouble = (float) jSONObject.optDouble(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54473x7fe978e1, 1.0d);
            float round = (optDouble <= 0.0f || optDouble > 1.0f) ? 1.0f : (java.lang.Math.round(optDouble * 10.0f) * 1.0f) / 10.0f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.s7 c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.t7.c(o17);
            if (c17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiCompressVideo", "fail:videoInfo is null");
                lVar.a(i17, o("fail:can't get info from video file"));
                return;
            }
            int round2 = java.lang.Math.round(c17.f163588e * round);
            int round3 = java.lang.Math.round(c17.f163589f * round);
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.t7.f163616a;
            int optInt = jSONObject.optInt(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63, java.lang.Math.round((i18 * 1.0f) / 1000.0f)) * 1000;
            if (optInt <= 0 || optInt >= c17.f163590g) {
                optInt = i18;
            }
            float optDouble2 = (float) jSONObject.optDouble(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15517x245ebd1, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.d.f243942d);
            if (optDouble2 < 1.0f || optDouble2 > c17.f163591h) {
                optDouble2 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.d.f243942d;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCompressVideo", "ratio: %f, bitrate: %d, fps: %f", java.lang.Float.valueOf(round), java.lang.Integer.valueOf(optInt), java.lang.Float.valueOf(optDouble2));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.r7 r7Var2 = (round2 == 0 || round3 == 0) ? new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.r7(o17, com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf, com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48866x28b7342c, 0, 0, optInt, optDouble2) : new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.r7(o17, 0, 0, round2, round3, optInt, optDouble2);
            atomicBoolean.compareAndSet(false, true);
            ik1.h0.a().m77784x795fa299(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.p5(this, r7Var2, lVar, i17));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCompressVideo", "compress with quality config");
        java.lang.String optString2 = jSONObject.optString("quality");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCompressVideo", "quality: %s", optString2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.s7 c18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.t7.c(o17);
        int i19 = c18 == null ? com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf : c18.f163588e;
        int i27 = c18 == null ? com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48866x28b7342c : c18.f163589f;
        optString2.getClass();
        char c19 = 65535;
        switch (optString2.hashCode()) {
            case -1078030475:
                if (optString2.equals(ya.b.f77490x87518375)) {
                    c19 = 0;
                    break;
                }
                break;
            case 107348:
                if (optString2.equals("low")) {
                    c19 = 1;
                    break;
                }
                break;
            case 3202466:
                if (optString2.equals("high")) {
                    c19 = 2;
                    break;
                }
                break;
        }
        switch (c19) {
            case 0:
                r7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.r7(o17, 0, 0, java.lang.Math.round(i19 * 0.5f), java.lang.Math.round(i27 * 0.5f), java.lang.Math.round(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.t7.f163616a * 1.5f), com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.d.f243942d);
                break;
            case 1:
                r7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.r7(o17, 0, 0, java.lang.Math.round(i19 * 0.3f), java.lang.Math.round(i27 * 0.3f), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.t7.f163616a, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.d.f243942d);
                break;
            case 2:
                r7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.r7(o17, 0, 0, java.lang.Math.round(i19 * 0.8f), java.lang.Math.round(i27 * 0.8f), java.lang.Math.round(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.t7.f163616a * 2.0f), com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.d.f243942d);
                break;
            default:
                r7Var = null;
                break;
        }
        atomicBoolean.compareAndSet(false, true);
        ik1.h0.a().m77784x795fa299(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.p5(this, r7Var, lVar, i17));
    }
}
