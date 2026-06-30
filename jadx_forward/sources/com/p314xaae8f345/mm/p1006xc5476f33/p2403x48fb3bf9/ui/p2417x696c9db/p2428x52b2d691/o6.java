package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class o6 extends qw4.a implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.o6 f267940d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.o6();

    /* renamed from: e, reason: collision with root package name */
    public static nw4.k f267941e;

    /* renamed from: f, reason: collision with root package name */
    public static nw4.y2 f267942f;

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        f267941e = env;
        f267942f = msg;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenCTID", "jsapi call, params:%s", msg.f422323a);
        android.content.Intent intent = new android.content.Intent();
        intent.setComponent(new android.content.ComponentName("cn.cyberIdentity.certification", "cn.wh.project.view.v.authorization.WAuthActivity"));
        intent.setFlags(8388608);
        java.lang.Object obj = msg.f422323a.get("orgID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.String");
        intent.putExtra("orgID", (java.lang.String) obj);
        java.lang.Object obj2 = msg.f422323a.get("appID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
        intent.putExtra("appID", (java.lang.String) obj2);
        java.lang.Object obj3 = msg.f422323a.get("bizSeq");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
        intent.putExtra("bizSeq", (java.lang.String) obj3);
        java.lang.Object obj4 = msg.f422323a.get("type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj4, "null cannot be cast to non-null type kotlin.String");
        intent.putExtra("type", (java.lang.String) obj4);
        intent.putExtra(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56317xb68cafb1, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
        android.content.Context context = env.f422393a;
        if (!(context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf)) {
            return true;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).m78545xde66c1f2(this);
        android.content.Context context2 = env.f422393a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2).startActivityForResult(intent, 212);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.v.f33752x366c91de;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "openCTID";
    }

    public final void e(nw4.y2 y2Var, int i17, java.util.Map map) {
        nw4.g gVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenCTID", "callbackJsApi, msg:" + y2Var + ", errCode:" + i17 + "， retMap:" + map);
        if (f267941e == null || y2Var == null) {
            return;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("err_code", java.lang.Integer.valueOf(i17));
        if (map != null) {
            linkedHashMap.put("result", map);
        }
        java.lang.String str = i17 == 0 ? "ok" : "unknown error";
        nw4.k kVar = f267941e;
        if (kVar != null && (gVar = kVar.f422396d) != null) {
            gVar.e(y2Var.f422546c, y2Var.f422552i + ':' + str, linkedHashMap);
        }
        f267941e = null;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        if (i17 != 212) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("JsApiOpenCTID onActivityResult requestCode: ");
        sb6.append(i17);
        sb6.append(", resultCode: ");
        sb6.append(i18);
        sb6.append(", data: ");
        sb6.append(intent == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenCTID", sb6.toString());
        if (i18 != -1 || intent == null) {
            e(f267942f, -1, null);
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String stringExtra = intent.getStringExtra("resultCode");
        if (stringExtra == null) {
            stringExtra = "";
        }
        hashMap.put("resultCode", stringExtra);
        java.lang.String stringExtra2 = intent.getStringExtra("resultDesc");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        hashMap.put("resultDesc", stringExtra2);
        java.lang.String stringExtra3 = intent.getStringExtra("idCardAuthData");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        hashMap.put("idCardAuthData", stringExtra3);
        java.lang.String stringExtra4 = intent.getStringExtra("certPwdData");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        hashMap.put("certPwdData", stringExtra4);
        java.lang.String stringExtra5 = intent.getStringExtra("resultData");
        hashMap.put("resultData", stringExtra5 != null ? stringExtra5 : "");
        e(f267942f, 0, hashMap);
    }
}
