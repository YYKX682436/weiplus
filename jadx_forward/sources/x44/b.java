package x44;

/* loaded from: classes4.dex */
public final class b extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.AdWorldCupAvatarUpdateDone");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        try {
            java.lang.String c17 = env.b().c();
            if (c17 == null) {
                c17 = "";
            }
            java.lang.String optString = data.optString("avatarUrl", "");
            java.lang.String optString2 = data.optString("avatarMd5", "");
            boolean z17 = true;
            if (c17.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAdJs.AdWorldCupAvatarUpdateDone", "aid empty from pageParam, fail");
                b(g("aid not found"));
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                if (optString.length() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdJs.AdWorldCupAvatarUpdateDone", "doAction RESET, aid=" + c17 + ", clear avatar");
                    m84.a0.a(c17);
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6047xd7a3f4f1 c6047xd7a3f4f1 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6047xd7a3f4f1();
                    am.kv kvVar = c6047xd7a3f4f1.f136335g;
                    kvVar.f88716a = c17;
                    kvVar.f88717b = "";
                    kvVar.getClass();
                    c6047xd7a3f4f1.e();
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("aid", c17);
                    jSONObject.put("isReset", 1);
                    m(jSONObject);
                    b(jSONObject);
                } else {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doAction SET, aid=");
                    sb6.append(c17);
                    sb6.append(", avatarUrlLen=");
                    sb6.append(optString.length());
                    sb6.append(", hasMd5=");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
                    sb6.append(optString2.length() > 0);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdJs.AdWorldCupAvatarUpdateDone", sb6.toString());
                    if (optString2.length() <= 0) {
                        z17 = false;
                    }
                    if (!z17) {
                        optString2 = null;
                    }
                    m84.a0.e(c17, new m84.z(optString, optString2, java.lang.System.currentTimeMillis()));
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6047xd7a3f4f1 c6047xd7a3f4f12 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6047xd7a3f4f1();
                    am.kv kvVar2 = c6047xd7a3f4f12.f136335g;
                    kvVar2.f88716a = c17;
                    kvVar2.f88717b = optString;
                    kvVar2.getClass();
                    c6047xd7a3f4f12.e();
                    w64.t.e(optString, null, null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdJs.AdWorldCupAvatarUpdateDone", "trigger preload for state-publish emoji, aid=" + c17 + ", urlLen=" + optString.length());
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("aid", c17);
                    jSONObject2.put("isReset", 0);
                    m(jSONObject2);
                    b(jSONObject2);
                }
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c("SnsAdJs.AdWorldCupAvatarUpdateDone", th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.AdWorldCupAvatarUpdateDone");
    }
}
