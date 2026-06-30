package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class db extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.launching.db f84575d = new com.tencent.mm.plugin.appbrand.launching.db();

    public db() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object item) {
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.String str = null;
        if (!(item instanceof org.json.JSONObject)) {
            return null;
        }
        org.json.JSONObject jSONObject = (org.json.JSONObject) item;
        java.lang.Object opt = jSONObject.opt("jsapi_name");
        java.lang.String obj = (opt == null || kotlin.jvm.internal.o.b(org.json.JSONObject.NULL, opt)) ? null : opt.toString();
        if (obj == null || obj.length() == 0) {
            return null;
        }
        java.lang.Object opt2 = jSONObject.opt("scope");
        if (opt2 != null && !kotlin.jvm.internal.o.b(org.json.JSONObject.NULL, opt2)) {
            str = opt2.toString();
        }
        int optInt = jSONObject.optInt("auth_status", 0);
        if (str == null) {
            str = "";
        }
        return new com.tencent.mm.plugin.appbrand.launching.cb(obj, str, optInt);
    }
}
