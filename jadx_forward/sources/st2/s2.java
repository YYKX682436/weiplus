package st2;

/* loaded from: classes3.dex */
public final class s2 {

    /* renamed from: a, reason: collision with root package name */
    public static final st2.s2 f493989a = new st2.s2();

    public final void a(gk2.e buContext, boolean z17) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (z17) {
            ml2.t2[] t2VarArr = ml2.t2.f409547d;
            i17 = 11;
        } else {
            ml2.t2[] t2VarArr2 = ml2.t2.f409547d;
            i17 = 12;
        }
        jSONObject.put("type", i17);
        ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
        jSONObject.put("sessionid", ml2.j0.f409116i.f409839n);
        jSONObject.put("appid", ((mm2.f6) buContext.a(mm2.f6.class)).A);
        long m75942xfb822ef2 = ((mm2.e1) buContext.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
        if (m75942xfb822ef2 < 0) {
            jSONObject.put("liveid", "");
        } else {
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            jSONObject.put("liveid", b52.b.q(m75942xfb822ef2));
        }
        p52.c cVar = p52.h.f433549a;
        jSONObject.put("clickid", p52.h.f433562n);
        p52.h.f433562n = "";
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.f409899o, jSONObject.toString(), null, 4, null);
    }
}
