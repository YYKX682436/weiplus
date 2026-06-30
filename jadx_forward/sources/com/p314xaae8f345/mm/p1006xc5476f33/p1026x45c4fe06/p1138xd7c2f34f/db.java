package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class db extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.db f166108d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.db();

    public db() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.lang.String str = null;
        if (!(item instanceof org.json.JSONObject)) {
            return null;
        }
        org.json.JSONObject jSONObject = (org.json.JSONObject) item;
        java.lang.Object opt = jSONObject.opt("jsapi_name");
        java.lang.String obj = (opt == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(org.json.JSONObject.NULL, opt)) ? null : opt.toString();
        if (obj == null || obj.length() == 0) {
            return null;
        }
        java.lang.Object opt2 = jSONObject.opt("scope");
        if (opt2 != null && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(org.json.JSONObject.NULL, opt2)) {
            str = opt2.toString();
        }
        int optInt = jSONObject.optInt("auth_status", 0);
        if (str == null) {
            str = "";
        }
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.cb(obj, str, optInt);
    }
}
