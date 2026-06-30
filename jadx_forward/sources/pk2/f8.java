package pk2;

/* loaded from: classes3.dex */
public final class f8 {

    /* renamed from: a, reason: collision with root package name */
    public static final pk2.f8 f437280a = new pk2.f8();

    public static void a(pk2.f8 f8Var, int i17, int i18, java.lang.Integer num, int i19, java.lang.Object obj) {
        if ((i19 & 4) != 0) {
            num = -1;
        }
        f8Var.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("element", i17);
        jSONObject.put("type", i18);
        if (num == null || num.intValue() != -1) {
            jSONObject.put("userType", num);
        }
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.D1, jSONObject.toString(), null, 4, null);
    }

    public static /* synthetic */ void d(pk2.f8 f8Var, int i17, int i18, int i19, int i27, java.lang.Integer num, int i28, java.lang.Object obj) {
        if ((i28 & 16) != 0) {
            num = null;
        }
        f8Var.b(i17, i18, i19, i27, num);
    }

    public final void b(int i17, int i18, int i19, int i27, java.lang.Integer num) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("element", i17);
        jSONObject.put("type", i18);
        jSONObject.put("sub_element", i19);
        jSONObject.put("sub_type", i27);
        if (num != null) {
            jSONObject.put(ya.b.f77502x92235c1b, num.intValue());
        }
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.P1, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
    }

    public final void c(int i17, int i18, java.util.Map map) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("element", i17);
        jSONObject.put("type", i18);
        if (map != null) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                jSONObject.put((java.lang.String) entry.getKey(), entry.getValue());
            }
        }
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.P1, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
    }
}
