package ab2;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final ab2.h f84309a = new ab2.h();

    public final java.lang.String a(ab2.g gVar) {
        java.lang.String str;
        long longExtra = gVar.f187707d.getIntent().getLongExtra("finder_from_feed_id", 0L);
        java.lang.Long valueOf = java.lang.Long.valueOf(longExtra);
        if (!(valueOf.longValue() != 0)) {
            valueOf = null;
        }
        str = "";
        if (valueOf != null) {
            long longValue = valueOf.longValue();
            str = "".length() > 0 ? "" : null;
            org.json.JSONObject jSONObject = str != null ? new org.json.JSONObject(str) : new org.json.JSONObject("{}");
            jSONObject.put("from_feed_id", pm0.v.u(longValue));
            str = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "toString(...)");
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = gVar.f187707d;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(abstractActivityC21394xb3d2c0cf.getIntent().getIntExtra("finder_from_feed_type", 0));
        if (!(valueOf2.intValue() != 0)) {
            valueOf2 = null;
        }
        if (valueOf2 != null) {
            int intValue = valueOf2.intValue();
            if (!(str.length() > 0)) {
                str = null;
            }
            org.json.JSONObject jSONObject2 = str != null ? new org.json.JSONObject(str) : new org.json.JSONObject("{}");
            jSONObject2.put("head_enter_type", java.lang.String.valueOf(intValue));
            str = jSONObject2.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "toString(...)");
        }
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(abstractActivityC21394xb3d2c0cf.getIntent().getIntExtra("key_from_comment_scene", 0));
        if (!(valueOf3.intValue() != 0)) {
            valueOf3 = null;
        }
        if (valueOf3 != null) {
            int intValue2 = valueOf3.intValue();
            if (!(str.length() > 0)) {
                str = null;
            }
            org.json.JSONObject jSONObject3 = str != null ? new org.json.JSONObject(str) : new org.json.JSONObject("{}");
            jSONObject3.put("from_comment_scene", java.lang.String.valueOf(intValue2));
            jSONObject3.put("ref_commentscene", java.lang.String.valueOf(intValue2));
            str = jSONObject3.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "toString(...)");
        }
        java.lang.String a17 = so2.o2.f492050f.a().a(longExtra);
        if (!(a17.length() > 0)) {
            a17 = null;
        }
        if (a17 == null) {
            return str;
        }
        java.lang.String str2 = str.length() > 0 ? str : null;
        org.json.JSONObject jSONObject4 = str2 != null ? new org.json.JSONObject(str2) : new org.json.JSONObject("{}");
        jSONObject4.put("feed_ad_report_info", a17);
        java.lang.String jSONObject5 = jSONObject4.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject5, "toString(...)");
        return jSONObject5;
    }
}
