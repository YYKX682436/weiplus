package com.tencent.mapsdk.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class co extends com.tencent.mapsdk.internal.ci {

    /* renamed from: f, reason: collision with root package name */
    static final java.lang.String f49143f = "name";

    /* renamed from: g, reason: collision with root package name */
    static final java.lang.String f49144g = "host";

    /* renamed from: h, reason: collision with root package name */
    static final java.lang.String f49145h = "host_test";

    /* renamed from: i, reason: collision with root package name */
    static final java.lang.String f49146i = "https";

    /* renamed from: j, reason: collision with root package name */
    static final java.lang.String f49147j = "status";

    private void b(org.json.JSONObject jSONObject) {
        com.tencent.mapsdk.internal.cq cqVar = (com.tencent.mapsdk.internal.cq) com.tencent.map.tools.json.JsonUtils.parseToModel(jSONObject, com.tencent.mapsdk.internal.cq.class, new java.lang.Object[0]);
        com.tencent.mapsdk.internal.cs csVar = this.f49132b;
        csVar.f49158a = cqVar.f49156a;
        csVar.f49159b = cqVar.f49157b;
    }

    public final void a(org.json.JSONObject jSONObject) {
        com.tencent.mapsdk.internal.dn dnVar;
        if (jSONObject == null) {
            return;
        }
        java.lang.String optString = jSONObject.optString("name", null);
        if (android.text.TextUtils.isEmpty(optString) || (dnVar = (com.tencent.mapsdk.internal.dn) b(optString)) == null) {
            return;
        }
        int optInt = jSONObject.optInt("status", 1);
        java.lang.String optString2 = jSONObject.optString(f49144g, null);
        java.lang.String optString3 = jSONObject.optString(f49145h, null);
        boolean optBoolean = jSONObject.optBoolean(f49146i, true);
        dnVar.f49203c = optInt != 0;
        dnVar.f49202b = optBoolean;
        if (!android.text.TextUtils.isEmpty(optString2)) {
            dnVar.f49222d = optString2;
        }
        if (!android.text.TextUtils.isEmpty(optString3)) {
            dnVar.f49223e = optString3;
        }
        dnVar.f49201a = optInt == 2;
    }
}
