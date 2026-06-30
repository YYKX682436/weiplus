package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

/* loaded from: classes7.dex */
public final class i1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f34803x366c91de = 957;

    /* renamed from: NAME */
    private static final java.lang.String f34804x24728b = "shareVideoMessage";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.vfs.r6 mo49620x1d537609;
        com.p314xaae8f345.mm.vfs.r6 mo49620x1d5376092;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar;
        if (yVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiShareVideoMessage", "invoke, env is null");
            return;
        }
        android.content.Context f229340d = yVar.getF229340d();
        android.app.Activity activity = f229340d instanceof android.app.Activity ? (android.app.Activity) f229340d : null;
        if (activity == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiShareVideoMessage", "invoke, activity is null");
            yVar.a(i17, o("fail:activity is null"));
            return;
        }
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiShareVideoMessage", "invoke, data is null");
            yVar.a(i17, o("fail:data is null"));
            return;
        }
        java.lang.String optString = jSONObject.optString("videoPath");
        if (optString == null || optString.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiShareVideoMessage", "invoke, videoPath is empty");
            yVar.a(i17, o("fail:videoPath is empty"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiShareVideoMessage", "invoke, videoPath: " + optString);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 mo50354x59eafec1 = yVar.mo50354x59eafec1();
        java.lang.String o17 = (mo50354x59eafec1 == null || (mo49620x1d5376092 = mo50354x59eafec1.mo49620x1d537609(optString)) == null) ? null : mo49620x1d5376092.o();
        if (o17 == null || o17.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiShareVideoMessage", "invoke, videoPath is illegal");
            yVar.a(i17, o("fail:videoPath is illegal"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiShareVideoMessage", "invoke, realVideoPath: " + o17);
        java.lang.String optString2 = jSONObject.optString("thumbPath");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 mo50354x59eafec12 = yVar.mo50354x59eafec1();
        java.lang.String o18 = (mo50354x59eafec12 == null || (mo49620x1d537609 = mo50354x59eafec12.mo49620x1d537609(optString2)) == null) ? null : mo49620x1d537609.o();
        j91.d dVar = (j91.d) yVar.mo32091x9a3f0ba2().K1(j91.d.class);
        str = "";
        java.lang.String optString3 = jSONObject.optString("chatToolMode", "");
        boolean optBoolean = jSONObject.optBoolean("useForChatTool", false);
        if (dVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString3);
            if (!j91.c.a(optString3)) {
                java.lang.String d17 = optBoolean ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.t) dVar).d() : "";
                str = optBoolean ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.t) dVar).c() : "";
                str2 = d17;
            } else {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString3, "allPage") && !((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.t) dVar).o(jSONObject)) {
                    java.lang.String str3 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
                    str = str3 != null ? str3 : "";
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    try {
                        jSONObject2.put("errno", 101);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                    }
                    yVar.a(i17, u(str, jSONObject2));
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.t tVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.t) dVar;
                optBoolean = true;
                str2 = tVar.d();
                str = tVar.c();
            }
        } else {
            str2 = "";
        }
        boolean optBoolean2 = jSONObject.optBoolean("needShowEntrance", false);
        java.lang.String optString4 = jSONObject.optString("entrancePath");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiShareVideoMessage", "invoke, thumbPath: " + optString2 + ", realThumbPath: " + o18 + " needEntrance: " + optBoolean2 + " entrancePath: " + optString4 + " useForChatTool:" + optBoolean + " chatToolRoom:" + str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.C12241x4943f75 c12241x4943f75 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.C12241x4943f75(o17, o18, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.C12064xbfcfaad6(optBoolean2, yVar.mo48798x74292566(), optString4, 1, cf.c.a(yVar).f158813f, cf.c.a(yVar).f158812e, optBoolean, str2, str, cf.c.a(yVar).f158814g));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.h1 h1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.h1(yVar, activity, i17, this);
        java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.d.f159933a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.W6(activity, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.class, c12241x4943f75, h1Var, null);
    }
}
