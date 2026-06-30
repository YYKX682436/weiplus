package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f;

/* loaded from: classes11.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.e0 f254802d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f254803e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tj4.e f254804f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.e0 e0Var, in5.s0 s0Var, tj4.e eVar) {
        super(2);
        this.f254802d = e0Var;
        this.f254803e = s0Var;
        this.f254804f = eVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        java.lang.String statusId = (java.lang.String) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusId, "statusId");
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(statusId, "-1");
        qj4.s sVar = qj4.s.f445491a;
        in5.s0 s0Var = this.f254803e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.e0 e0Var = this.f254802d;
        if (b17) {
            android.content.Context context = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            e0Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TopicSelfItemConvert", "goToSetTextStatus");
            bi4.d1 d1Var = new bi4.d1();
            d1Var.f436475i = 17L;
            d1Var.f436474h = ((qj4.v) ((bi4.z0) i95.n0.c(bi4.z0.class))).Bi();
            bi4.o1.f102608a.b((android.app.Activity) context, d1Var, 1001);
            java.lang.String a17 = en1.a.a();
            java.lang.String str2 = d1Var.f436474h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
            sVar.u(new qj4.l(a17, false, 17L, null, str2, null, null, 104, null));
            java.lang.String str3 = ej4.e0.f334881g;
            qj4.s.n(sVar, 21L, null, 0, null, null, null, 0, 0L, 0L, null, null, null, null, str3 == null ? "" : str3, 8190, null);
        } else {
            android.content.Context context2 = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            p3325xe03a0797.p3326xc267989b.r2 r2Var = e0Var.f254807f;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            e0Var.f254807f = p3325xe03a0797.p3326xc267989b.l.d(e0Var.f254806e, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.c0(context2, statusId, null), 3, null);
            java.lang.Object obj3 = this.f254804f.f501360d.get(intValue);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj3, "get(...)");
            tj4.a aVar = (tj4.a) obj3;
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("icon_pos", intValue - 1);
                jSONObject.put("days_before", aVar.f501347b);
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                str = jSONObject2;
            } catch (org.json.JSONException unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TextStatus.TopicSelfItemConvert", "reportJumpHistoryUI error");
                str = "";
            }
            int i17 = aVar.f501350e;
            java.lang.String str4 = (java.lang.String) kz5.n0.X(aVar.f501348c);
            java.lang.String str5 = ej4.e0.f334881g;
            qj4.s.n(sVar, 22L, str4, 0, null, null, null, 0, 0L, 0L, null, java.lang.Integer.valueOf(i17), null, str, str5 == null ? "" : str5, 3068, null);
        }
        return jz5.f0.f384359a;
    }
}
