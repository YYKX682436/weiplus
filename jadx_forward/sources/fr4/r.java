package fr4;

/* loaded from: classes11.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final fr4.r f347392a = new fr4.r();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.tencent.mm.plugin.lite.s] */
    /* JADX WARN: Type inference failed for: r7v2 */
    public static final boolean b(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar, long j17, org.json.JSONObject data, int i17, android.content.Context context, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 fragment, java.lang.String toUsername) {
        org.json.JSONObject optJSONObject;
        java.lang.String optString;
        boolean z17;
        java.lang.String str;
        java.lang.String str2 = sVar;
        fr4.r rVar = f347392a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUsername, "toUsername");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("W1wPersonalMsgLiteAppStoreHelper", "handleChangeIdentityAction: data=" + data);
        try {
            optJSONObject = data.optJSONObject("fromUserInfo");
            optString = data.optString("msgSessionId");
        } catch (java.lang.Exception e17) {
            e = e17;
        }
        try {
            if (optJSONObject != null) {
                try {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                    if (!(optString.length() == 0)) {
                        java.lang.String optString2 = optJSONObject.optString(dm.i4.f66875xa013b0d5);
                        java.lang.String optString3 = optJSONObject.optString("avatarStyle");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
                        if (optString2.length() == 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("W1wPersonalMsgLiteAppStoreHelper", "handleChangeIdentityAction: username is empty");
                            rVar.c(sVar, j17, i17, "username is empty");
                            return true;
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("W1wPersonalMsgLiteAppStoreHelper", "handleChangeIdentityAction: switching to user=" + optString2 + ", session=" + optString);
                        fr4.g0 g0Var = (fr4.g0) i95.n0.c(fr4.g0.class);
                        if (!(g0Var != null ? g0Var.hj(data) : false)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("W1wPersonalMsgLiteAppStoreHelper", "handleChangeIdentityAction: failed to update current contact");
                            rVar.c(sVar, j17, i17, "failed to update current contact");
                            return true;
                        }
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put("result", true);
                        jSONObject.put("errMsg", "");
                        if (str2 != 0) {
                            str2.c(j17, i17, jSONObject.toString());
                        }
                        rVar.a(str2);
                        fr4.g0 g0Var2 = (fr4.g0) i95.n0.c(fr4.g0.class);
                        java.lang.String Di = g0Var2 != null ? g0Var2.Di() : null;
                        if (toUsername.length() > 0) {
                            if (!(Di == null || Di.length() == 0)) {
                                z17 = true;
                                str = "W1wPersonalMsgLiteAppStoreHelper";
                                ((fr4.g0) i95.n0.c(fr4.g0.class)).fj(toUsername, Di, new fr4.q(optString3, toUsername, Di, context, optString, optString2, fragment));
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "handleChangeIdentityAction completed successfully");
                                return z17;
                            }
                        }
                        z17 = true;
                        str = "W1wPersonalMsgLiteAppStoreHelper";
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "handleChangeIdentityAction completed successfully");
                        return z17;
                    }
                } catch (java.lang.Exception e18) {
                    e = e18;
                    str2 = "W1wPersonalMsgLiteAppStoreHelper";
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "handleChangeIdentityAction failed", e);
                    rVar.c(sVar, j17, i17, "exception: " + e.getMessage());
                    return true;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("W1wPersonalMsgLiteAppStoreHelper", "handleChangeIdentityAction: missing required fields - fromUserInfo or msgSessionId");
            rVar.c(sVar, j17, i17, "missing required fields");
            return true;
        } catch (java.lang.Exception e19) {
            e = e19;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "handleChangeIdentityAction failed", e);
            rVar.c(sVar, j17, i17, "exception: " + e.getMessage());
            return true;
        }
    }

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar) {
        if (sVar == null || sVar.f225699c == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("W1wPersonalMsgLiteAppStoreHelper", "Cannot close LiteApp: store is null or appUuid is 0");
            return;
        }
        try {
            if (((q80.g0) i95.n0.c(q80.g0.class)) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65269x10864c08(sVar.f225699c, new android.content.Intent());
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("W1wPersonalMsgLiteAppStoreHelper", "Closed LiteApp window: " + sVar.f225699c);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("W1wPersonalMsgLiteAppStoreHelper", "Failed to close LiteApp window", e17);
        }
    }

    public final void c(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar, long j17, int i17, java.lang.String str) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("result", false);
        jSONObject.put("errCode", -1);
        jSONObject.put("errMsg", str);
        if (sVar != null) {
            sVar.c(j17, i17, jSONObject.toString());
        }
    }
}
