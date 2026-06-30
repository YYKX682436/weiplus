package zv2;

/* loaded from: classes4.dex */
public final class g0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final zv2.g0 f557938d = new zv2.g0();

    public g0() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        zv2.h0 h0Var = zv2.l0.f557941i;
        r45.n74 n74Var = new r45.n74();
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("PostLinkVideoPageLiteapp");
            if (d17 == null) {
                d17 = "";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderConfig", "FINDER_POST_LINK_VIDEO_PAGE_LITEAPP PostLinkVideoPageLiteapp: dynamic config chars = ".concat(d17));
            byte[] decode = android.util.Base64.decode(d17, 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decode, "decode(...)");
            org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(decode, r26.c.f450398a));
            n74Var.f462663d = jSONObject.optString("appId");
            n74Var.f462664e = jSONObject.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
            n74Var.f462665f = jSONObject.optString("query");
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(n74Var);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderTencentVideoWidget", "appId:" + n74Var.f462663d + " path:" + n74Var.f462664e + " query:" + n74Var.f462665f);
        return n74Var;
    }
}
