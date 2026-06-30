package qe;

/* loaded from: classes7.dex */
public final class x extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    @java.lang.Deprecated
    public static final int f76467x366c91de = -2;

    /* renamed from: NAME */
    @java.lang.Deprecated
    public static final java.lang.String f76468x24728b = "responseClientRequest";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar;
        if (yVar == null) {
            return;
        }
        if (jSONObject == null) {
            str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            yVar.a(i17, u(str2, jSONObject2));
            return;
        }
        int optInt = jSONObject.optInt(dm.i4.f66865x76d1ec5a, 0);
        boolean optBoolean = jSONObject.optBoolean("support");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WXA.JsApiResponseClientRequest", "invoke requestId:" + optInt + ", support:" + optBoolean);
        xh1.g a17 = xh1.g.f536040m.a(yVar);
        java.lang.Object opt = jSONObject.opt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
        java.lang.String str4 = a17.f536043e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "handleLibServerResponse(requestId:" + optInt + ", support:" + optBoolean + ')');
        if (optBoolean) {
            xh1.b bVar = (xh1.b) a17.f536046h.remove(java.lang.Integer.valueOf(optInt));
            if (bVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str4, "handleLibServerResponse supported but missing mario for requestId:" + optInt);
            } else if (opt instanceof java.nio.ByteBuffer) {
                try {
                    java.lang.Object newInstance = bVar.f536023b.newInstance();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(newInstance, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ResponseProtoBuf");
                    com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = ((r45.js5) newInstance).mo11468x92b714fd(ik1.f.a((java.nio.ByteBuffer) opt));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo11468x92b714fd, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ResponseProtoBuf");
                    ((p3325xe03a0797.p3326xc267989b.r) bVar.f536022a).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813((r45.js5) mo11468x92b714fd));
                    xh1.f fVar = a17.f536047i;
                    fVar.getClass();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(java.lang.Integer.valueOf(optInt), "null cannot be cast to non-null type kotlin.Any");
                    fVar.mo50304x856b99f0(fVar.f536038b, java.lang.Integer.valueOf(optInt));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "handleLibServerResponse succeed for requestId:" + optInt);
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str4, "handleLibServerResponse succeed but parse data failed for requestId:" + optInt + ", exception:" + e18);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str4, "handleLibServerResponse succeed but responded data(" + opt + ") invalid for requestId:" + optInt);
            }
        } else {
            a17.b(optInt);
        }
        str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        str2 = str != null ? str : "";
        java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        try {
            jSONObject3.put("errno", 0);
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
        }
        yVar.a(i17, u(str2, jSONObject3));
    }
}
