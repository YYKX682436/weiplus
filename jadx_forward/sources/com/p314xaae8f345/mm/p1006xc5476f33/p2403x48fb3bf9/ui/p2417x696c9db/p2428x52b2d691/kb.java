package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class kb extends qw4.a implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.kb f267853d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.kb();

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.ref.WeakReference f267854e;

    /* renamed from: f, reason: collision with root package name */
    public static nw4.y2 f267855f;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRequestSubscribeMessage", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.s.f34540x24728b);
        f267854e = new java.lang.ref.WeakReference(env);
        f267855f = msg;
        java.lang.String str = (java.lang.String) ((java.util.HashMap) msg.f422323a).get("appId");
        java.lang.String str2 = (java.lang.String) ((java.util.HashMap) msg.f422323a).get("extInfo");
        java.lang.String str3 = (java.lang.String) ((java.util.HashMap) msg.f422323a).get("templateIdList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (str3 != null) {
            org.json.JSONArray jSONArray = new org.json.JSONArray(str3);
            int length = jSONArray.length();
            int i17 = 0;
            while (true) {
                if (i17 >= length) {
                    break;
                }
                java.lang.Object obj = jSONArray.get(i17);
                if (!(obj instanceof java.lang.String)) {
                    f267853d.e(msg, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54055x82c2d261, ":fail templateId invalid", null);
                    break;
                }
                arrayList.add(obj);
                i17++;
            }
        }
        if (arrayList.isEmpty()) {
            e(msg, 10001, ":fail templateIdList empty", null);
        } else {
            android.content.Context context = env.f422393a;
            if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).m78545xde66c1f2(this);
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("key_extra_info", str2);
            bundle.putBoolean("key_need_result", true);
            bundle.putStringArrayList("key_template_id_list", arrayList);
            e31.k kVar = (e31.k) ((jz5.n) ((ba0.h) ((ca0.e) i95.n0.c(ca0.e.class))).f100210d).mo141623x754a37bb();
            if (kVar != null) {
                android.content.Context context2 = env.f422393a;
                if (str == null) {
                    str = "";
                }
                kVar.g(context2, 2, 213, str, bundle);
            }
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return zd.d.f77569x366c91de;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.s.f34540x24728b;
    }

    public final void e(nw4.y2 y2Var, int i17, java.lang.String str, java.util.Map map) {
        nw4.k kVar;
        nw4.g gVar;
        if (y2Var == null) {
            return;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("err_code", java.lang.Integer.valueOf(i17));
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        if (i17 == 0) {
            if (!(str.length() > 0)) {
                str = "ok";
            }
        } else {
            if (!(str.length() > 0)) {
                str = "unknown error";
            }
        }
        java.lang.ref.WeakReference weakReference = f267854e;
        if (weakReference != null && (kVar = (nw4.k) weakReference.get()) != null && (gVar = kVar.f422396d) != null) {
            gVar.e(y2Var.f422546c, y2Var.f422552i + ':' + str, linkedHashMap);
        }
        f267854e = null;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        if (intent == null || i17 != 213) {
            return;
        }
        java.util.ArrayList<com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3> parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_result_data");
        int intExtra = intent.getIntExtra("key_result_err_code", -1);
        java.lang.String stringExtra = intent.getStringExtra("key_result_err_msg");
        if (stringExtra == null) {
            stringExtra = "unknown error";
        }
        java.lang.String stringExtra2 = intent.getStringExtra("key_result_ext_data");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(intExtra);
        objArr[1] = stringExtra;
        objArr[2] = parcelableArrayListExtra != null ? java.lang.Integer.valueOf(parcelableArrayListExtra.size()) : null;
        objArr[3] = stringExtra2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRequestSubscribeMessage", "requestSubscribeMessage onActivityResult errCode: %s, errMsg: %s, template size: %s, extData: %s", objArr);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (parcelableArrayListExtra != null) {
            for (com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d3 : parcelableArrayListExtra) {
                java.lang.String str = c11159x8f55e6d3.f153336f;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("status", c11159x8f55e6d3.f153344q);
                jSONObject.put(str, jSONObject2.toString());
            }
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("templatesDetail", jSONObject.toString());
        hashMap.put("ext_info", stringExtra2);
        e(f267855f, intExtra, stringExtra, hashMap);
    }
}
