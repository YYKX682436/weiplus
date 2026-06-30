package pf1;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f435301a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f435302b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f435303c;

    static {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4 = "{}";
        try {
            str = new org.json.JSONObject().put("err_msg", "system:function_not_exist").toString();
        } catch (org.json.JSONException unused) {
            str = "{}";
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        f435301a = str;
        try {
            str2 = new org.json.JSONObject().put("err_msg", "system:invalid_data").toString();
        } catch (org.json.JSONException unused2) {
            str2 = "{}";
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
        f435302b = str2;
        try {
            str3 = new org.json.JSONObject().put("err_msg", "system:invalid_api").toString();
        } catch (org.json.JSONException unused3) {
            str3 = "{}";
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
        f435303c = str3;
        try {
            str4 = new org.json.JSONObject().put("err_msg", "system:access_denied").toString();
        } catch (org.json.JSONException unused4) {
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str4);
    }
}
