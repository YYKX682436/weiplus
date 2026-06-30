package com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec;

/* loaded from: classes3.dex */
public final class u1 implements zy2.k5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4 f148478a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f148479b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f148480c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f148481d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f148482e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f148483f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f148484g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f148485h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f148486i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f148487j;

    public u1(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4 v4Var, java.lang.String str, java.lang.String str2, android.content.Context context, org.json.JSONObject jSONObject, java.lang.String str3, java.lang.String str4, int i17, zy2.i5 i5Var, zy2.i5 i5Var2) {
        this.f148478a = v4Var;
        this.f148479b = str;
        this.f148480c = str2;
        this.f148481d = context;
        this.f148482e = jSONObject;
        this.f148483f = str3;
        this.f148484g = str4;
        this.f148485h = i17;
        this.f148486i = i5Var;
        this.f148487j = i5Var2;
    }

    @Override // zy2.k5
    public void a(int i17, int i18, java.lang.String str, r45.z61 resp) {
        r45.nw1 m76794xd0557130;
        r45.i72 i72Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) resp.m75936x14adae67(1);
        r45.nw1 m76794xd05571302 = c19792x256d2725 != null ? c19792x256d2725.m76794xd0557130() : null;
        com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4 v4Var = this.f148478a;
        if (!v4Var.vk(m76794xd05571302, "auto")) {
            com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4 v4Var2 = this.f148478a;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) resp.m75936x14adae67(1);
            android.content.Context context = this.f148481d;
            java.lang.String extraInfo = this.f148484g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(extraInfo, "$extraInfo");
            com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.Ai(v4Var2, c19792x256d27252, context, extraInfo, this.f148485h, i17, i18, str, this.f148486i, this.f148487j);
            return;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27253 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) resp.m75936x14adae67(1);
        long m75942xfb822ef2 = (c19792x256d27253 == null || (m76794xd0557130 = c19792x256d27253.m76794xd0557130()) == null || (i72Var = (r45.i72) m76794xd0557130.m75936x14adae67(44)) == null) ? 0L : i72Var.m75942xfb822ef2(12);
        android.content.Context context2 = this.f148481d;
        if (m75942xfb822ef2 != 0) {
            i95.m c17 = i95.n0.c(c61.yb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            c61.yb.nc((c61.yb) c17, m75942xfb822ef2, null, 2, null).l().K(new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.t1(v4Var, context2));
            return;
        }
        java.lang.String str2 = this.f148479b;
        boolean z17 = str2 == null || str2.length() == 0;
        java.lang.String str3 = this.f148483f;
        org.json.JSONObject jSONObject = this.f148482e;
        if (!z17) {
            java.lang.String str4 = this.f148480c;
            if (!(str4 == null || str4.length() == 0)) {
                v4Var.Ni((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) resp.m75936x14adae67(1), context2, jSONObject, str3 != null ? str3 : "");
                return;
            }
        }
        v4Var.Ri((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) resp.m75936x14adae67(1), context2, jSONObject, str3 != null ? str3 : "");
    }
}
