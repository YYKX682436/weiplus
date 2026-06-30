package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class co extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ci {

    /* renamed from: f, reason: collision with root package name */
    static final java.lang.String f130676f = "name";

    /* renamed from: g, reason: collision with root package name */
    static final java.lang.String f130677g = "host";

    /* renamed from: h, reason: collision with root package name */
    static final java.lang.String f130678h = "host_test";

    /* renamed from: i, reason: collision with root package name */
    static final java.lang.String f130679i = "https";

    /* renamed from: j, reason: collision with root package name */
    static final java.lang.String f130680j = "status";

    private void b(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cq cqVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cq) com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35882x450f6f3b(jSONObject, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cq.class, new java.lang.Object[0]);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cs csVar = this.f130665b;
        csVar.f130691a = cqVar.f130689a;
        csVar.f130692b = cqVar.f130690b;
    }

    public final void a(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dn dnVar;
        if (jSONObject == null) {
            return;
        }
        java.lang.String optString = jSONObject.optString("name", null);
        if (android.text.TextUtils.isEmpty(optString) || (dnVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dn) b(optString)) == null) {
            return;
        }
        int optInt = jSONObject.optInt("status", 1);
        java.lang.String optString2 = jSONObject.optString(f130677g, null);
        java.lang.String optString3 = jSONObject.optString(f130678h, null);
        boolean optBoolean = jSONObject.optBoolean(f130679i, true);
        dnVar.f130736c = optInt != 0;
        dnVar.f130735b = optBoolean;
        if (!android.text.TextUtils.isEmpty(optString2)) {
            dnVar.f130755d = optString2;
        }
        if (!android.text.TextUtils.isEmpty(optString3)) {
            dnVar.f130756e = optString3;
        }
        dnVar.f130734a = optInt == 2;
    }
}
