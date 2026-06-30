package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class zb extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.zb f268246d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.zb();

    /* renamed from: e, reason: collision with root package name */
    public static nw4.k f268247e;

    /* renamed from: f, reason: collision with root package name */
    public static nw4.y2 f268248f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0105 A[Catch: Exception -> 0x0194, TryCatch #1 {Exception -> 0x0194, blocks: (B:14:0x009f, B:16:0x00a7, B:18:0x00ab, B:20:0x00af, B:21:0x00fd, B:23:0x0105, B:25:0x0109, B:27:0x010d, B:46:0x0116, B:47:0x0128, B:49:0x012e, B:52:0x013c, B:53:0x0149, B:55:0x014f, B:57:0x0176, B:65:0x00b2, B:66:0x00c4, B:68:0x00ca, B:71:0x00d8, B:73:0x00e8, B:75:0x00f1), top: B:13:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018e  */
    @Override // nw4.q2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(nw4.k r21, nw4.y2 r22) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.zb.a(nw4.k, nw4.y2):boolean");
    }

    @Override // nw4.q2
    public int b() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lab.d.f34388x366c91de;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "selectMultiSessionHistory";
    }

    public final void e(android.content.Intent data) {
        nw4.g gVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.util.HashMap hashMap = new java.util.HashMap();
        java.io.Serializable serializableExtra = data.getSerializableExtra("result");
        java.util.HashMap hashMap2 = serializableExtra instanceof java.util.HashMap ? (java.util.HashMap) serializableExtra : null;
        java.util.HashMap hashMap3 = new java.util.HashMap();
        if (hashMap2 != null) {
            for (java.util.Map.Entry entry : hashMap2.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                try {
                    hashMap3.put(str, new org.json.JSONArray((java.lang.String) entry.getValue()));
                    org.json.JSONArray jSONArray = (org.json.JSONArray) hashMap3.get(str);
                    if (jSONArray != null) {
                        jSONArray.length();
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("JsApiSelectMutiSessionHistory", "解析用户 " + str + " 的JSONArray失败: " + e17.getMessage());
                    hashMap3.put(str, new org.json.JSONArray());
                }
            }
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra = data.getStringArrayListExtra("selectedUserNames");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(stringArrayListExtra, "null cannot be cast to non-null type kotlin.Any");
        hashMap.put("selectedUserNames", stringArrayListExtra);
        java.io.Serializable serializableExtra2 = data.getSerializableExtra("selectDict");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(serializableExtra2, "null cannot be cast to non-null type kotlin.Any");
        hashMap.put("selectDict", serializableExtra2);
        java.io.Serializable serializableExtra3 = data.getSerializableExtra("selectDictExtraData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(serializableExtra3, "null cannot be cast to non-null type kotlin.Any");
        hashMap.put("selectDictExtraData", serializableExtra3);
        hashMap.put("result", hashMap3);
        nw4.k kVar = f268247e;
        if (kVar == null || (gVar = kVar.f422396d) == null) {
            return;
        }
        nw4.y2 y2Var = f268248f;
        java.lang.String str2 = y2Var != null ? y2Var.f422546c : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        nw4.y2 y2Var2 = f268248f;
        sb6.append(y2Var2 != null ? y2Var2.f422552i : null);
        sb6.append(":ok");
        gVar.e(str2, sb6.toString(), hashMap);
    }
}
