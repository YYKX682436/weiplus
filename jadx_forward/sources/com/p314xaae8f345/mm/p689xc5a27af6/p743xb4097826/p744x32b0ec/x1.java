package com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec;

/* loaded from: classes3.dex */
public final class x1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4 f148560d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f148561e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f148562f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f148563g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f148564h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4 v4Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, int i17, java.lang.String str, android.content.Context context) {
        super(0);
        this.f148560d = v4Var;
        this.f148561e = c19792x256d2725;
        this.f148562f = i17;
        this.f148563g = str;
        this.f148564h = context;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666;
        java.lang.String m76944x730bcac6;
        java.lang.String m76803x6c285d75;
        java.lang.String m76836x6c03c64c;
        r45.nw1 m76794xd0557130;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f148561e;
        r45.nw1 m76794xd05571302 = c19792x256d2725 != null ? c19792x256d2725.m76794xd0557130() : null;
        com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4 v4Var = this.f148560d;
        v4Var.Fk(m76794xd05571302, false);
        java.lang.String str = this.f148563g;
        int i17 = hc2.l.h(str) ? 4 : 15;
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
        java.lang.String str2 = "";
        java.lang.String t17 = r26.i0.t(uuid, "-", "", false);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i18 = this.f148562f;
        sb6.append(i18);
        sb6.append('-');
        sb6.append(i17);
        sb6.append("-65-");
        sb6.append(t17);
        java.lang.String sb7 = sb6.toString();
        ((ml2.j0) i95.n0.c(ml2.j0.class)).Zj(str);
        long m76784x5db1b11 = c19792x256d2725 != null ? c19792x256d2725.m76784x5db1b11() : 0L;
        java.lang.String pageType = java.lang.String.valueOf(i18);
        int i19 = v4Var.gk(c19792x256d2725 != null ? c19792x256d2725.m76794xd0557130() : null) ? 1 : 2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageType, "pageType");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("object_id", pm0.v.u(m76784x5db1b11));
        jSONObject.put("page_type", pageType);
        jSONObject.put("object_type", i19);
        jSONObject.put("page_sub_type", 0);
        zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
        ml2.o3[] o3VarArr = ml2.o3.f409306d;
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        ((ml2.j0) zbVar).Wj("watch_live_record", jSONObject2);
        ss5.i0 i0Var = (ss5.i0) i95.n0.c(ss5.i0.class);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        android.content.Intent b17 = vd2.t3.f517454a.b(null, java.lang.String.valueOf(i18), 0);
        android.content.Context context = this.f148564h;
        long m76784x5db1b112 = c19792x256d2725 != null ? c19792x256d2725.m76784x5db1b11() : 0L;
        long m75942xfb822ef2 = (c19792x256d2725 == null || (m76794xd0557130 = c19792x256d2725.m76794xd0557130()) == null) ? 0L : m76794xd0557130.m75942xfb822ef2(0);
        java.lang.String str3 = (c19792x256d2725 == null || (m76836x6c03c64c = c19792x256d2725.m76836x6c03c64c()) == null) ? "" : m76836x6c03c64c;
        java.lang.String str4 = (c19792x256d2725 == null || (m76803x6c285d75 = c19792x256d2725.m76803x6c285d75()) == null) ? "" : m76803x6c285d75;
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        if (c19792x256d2725 != null && (m76802x2dd01666 = c19792x256d2725.m76802x2dd01666()) != null && (m76944x730bcac6 = m76802x2dd01666.m76944x730bcac6()) != null) {
            str2 = m76944x730bcac6;
        }
        ((vd2.d5) i0Var).wi(b17, context, m76784x5db1b112, m75942xfb822ef2, str3, str4, ((c61.p2) ybVar).Gj(str2), sb7, ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Ck());
        return jz5.f0.f384359a;
    }
}
