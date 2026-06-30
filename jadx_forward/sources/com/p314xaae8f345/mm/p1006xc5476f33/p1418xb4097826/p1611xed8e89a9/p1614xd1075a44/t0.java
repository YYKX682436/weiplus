package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44;

/* loaded from: classes3.dex */
public final class t0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f206307d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1 f206308e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f206309f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f206310g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f206311h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f206312i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(r45.h32 h32Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1 s1Var, java.lang.String str, java.lang.String str2, boolean z17, java.lang.String str3) {
        super(2);
        this.f206307d = h32Var;
        this.f206308e = s1Var;
        this.f206309f = str;
        this.f206310g = str2;
        this.f206311h = z17;
        this.f206312i = str3;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1 s1Var;
        java.lang.String str;
        int i17;
        int i18;
        int intValue = ((java.lang.Number) obj).intValue();
        ((java.lang.Number) obj2).intValue();
        r45.h32 h32Var = this.f206307d;
        java.lang.String str2 = this.f206309f;
        java.lang.String str3 = this.f206310g;
        java.lang.String str4 = this.f206312i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1 s1Var2 = this.f206308e;
        if (intValue != -1) {
            h32Var.set(1, 0);
            if (intValue == 1) {
                ((h50.i) ((i50.o) i95.n0.c(i50.o.class))).wi(s1Var2.f206251b, 2, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.v0(h32Var, s1Var2));
                cl0.g gVar = new cl0.g();
                gVar.s("source_type", 0);
                gVar.s("ref_page_type", str2);
                cl0.g gVar2 = new cl0.g();
                r45.ov2 a17 = zl2.t.a(h32Var);
                gVar2.h("coupon_id", a17 != null ? a17.m75945x2fec8307(1) : null);
                gVar2.o("ui_position", 1);
                gVar.o("notice_type", 1);
                i95.m c17 = i95.n0.c(c50.c1.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                c50.c1 c1Var = (c50.c1) c17;
                ml2.i5 i5Var = ml2.i5.f409104f;
                java.lang.String str5 = s1Var2.f206255f;
                java.lang.String m75945x2fec8307 = h32Var.m75945x2fec8307(3);
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                c50.c1.l9(c1Var, i5Var, str3, 0L, 0, str5, null, null, null, null, m75945x2fec8307, gVar.toString(), h32Var.m75945x2fec8307(4), gVar2.toString(), s1Var2.e(), s1Var2.d(), null, 33248, null);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.w0 w0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.w0(str3);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.l1 l1Var = s1Var2.f206249J;
                l1Var.getClass();
                l1Var.f206140d = w0Var;
                l1Var.f206141e = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.x0(this.f206311h);
                l1Var.f206142f = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.y0(h32Var);
                gm0.j1.d().a(6276, l1Var);
                if (s1Var2.B) {
                    s1Var2.f206275z = h32Var.m75939xb282bd08(1);
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("finder_username", str3);
                    java.lang.String m75945x2fec83072 = h32Var.m75945x2fec8307(8);
                    if (m75945x2fec83072 == null) {
                        m75945x2fec83072 = "";
                    }
                    hashMap.put("activityId", m75945x2fec83072);
                    i95.m c18 = i95.n0.c(zy2.zb.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                    ml2.t1 t1Var = ml2.t1.R1;
                    r45.qt2 qt2Var = s1Var2.f206252c;
                    zy2.zb.T8((zy2.zb) c18, t1Var, hashMap, qt2Var.m75945x2fec8307(1), java.lang.String.valueOf(qt2Var.m75939xb282bd08(5)), null, null, false, 112, null);
                    i95.m c19 = i95.n0.c(c61.zb.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
                    c61.zb zbVar = (c61.zb) c19;
                    java.lang.String m75945x2fec83073 = h32Var.m75945x2fec8307(4);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m75945x2fec83073);
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = s1Var2.f206251b;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                    pf5.z zVar = pf5.z.f435481a;
                    gm0.j1.d().g(c61.zb.x3(zbVar, str3, m75945x2fec83073, 1, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6(), activity.getIntent().getStringExtra("key_promotion_token"), java.lang.Integer.valueOf(str2 == null || str2.length() == 0 ? 0 : 901), null, null, str4, null, null, null, null, 7872, null));
                    c61.zb zbVar2 = (c61.zb) i95.n0.c(c61.zb.class);
                    java.lang.String m75945x2fec83074 = h32Var.m75945x2fec8307(4);
                    if (m75945x2fec83074 == null) {
                        m75945x2fec83074 = "";
                    }
                    if (((b92.d1) zbVar2).bj(str3, m75945x2fec83074) == null) {
                        c61.zb zbVar3 = (c61.zb) i95.n0.c(c61.zb.class);
                        java.lang.String m75945x2fec83075 = h32Var.m75945x2fec8307(4);
                        if (m75945x2fec83075 == null) {
                            m75945x2fec83075 = "";
                        }
                        ((b92.d1) zbVar3).Ai(str3, m75945x2fec83075, h32Var);
                    } else {
                        c61.zb zbVar4 = (c61.zb) i95.n0.c(c61.zb.class);
                        java.lang.String m75945x2fec83076 = h32Var.m75945x2fec8307(4);
                        if (m75945x2fec83076 == null) {
                            m75945x2fec83076 = "";
                        }
                        r45.h32 bj6 = ((b92.d1) zbVar4).bj(str3, m75945x2fec83076);
                        if (bj6 != null) {
                            bj6.set(1, java.lang.Integer.valueOf(h32Var.m75939xb282bd08(1)));
                        }
                    }
                    ((te2.e4) ((zy2.g8) zVar.a(activity).c(zy2.g8.class))).f499507d.M0(str3);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1.i(s1Var2, str3, h32Var);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1.h(s1Var2, h32Var, 1);
                    i17 = 4;
                    s1Var = s1Var2;
                    str = str3;
                    i18 = 8;
                } else {
                    i17 = 4;
                    i18 = 8;
                    s1Var = s1Var2;
                    str = str3;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1.g(s1Var2, str3, str2, str4, h32Var, h32Var, 1);
                }
            } else {
                s1Var = s1Var2;
                str = str3;
                i17 = 4;
                i18 = 8;
            }
            if (s1Var.B) {
                java.lang.String m75945x2fec83077 = h32Var.m75945x2fec8307(i18);
                java.lang.String str6 = m75945x2fec83077 == null ? "" : m75945x2fec83077;
                java.lang.String m75945x2fec83078 = h32Var.m75945x2fec8307(i17);
                pq5.g l17 = new db2.b2(str6, null, null, 0L, 0L, m75945x2fec83078 == null ? "" : m75945x2fec83078, 1, false, 158, null).l();
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = s1Var.f206251b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(activityC0065xcd7aa112, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                l17.f((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activityC0065xcd7aa112);
                l17.K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.g1(s1Var, str));
            }
        } else if (!s1Var2.B) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.z0 z0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.z0(h32Var, s1Var2, str3, str2, str4);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) s1Var2.f206251b, 1, true);
            k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.q1(s1Var2);
            k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.r1(h32Var, s1Var2, str3, z0Var);
            k0Var.v();
        }
        return jz5.f0.f384359a;
    }
}
