package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class i10 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.z10 f194422d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.y f194423e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i10(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.z10 z10Var, cm2.y yVar) {
        super(2);
        this.f194422d = z10Var;
        this.f194423e = yVar;
    }

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.z10 z10Var, cm2.y yVar, java.lang.String str, r45.h32 h32Var, int i17, org.json.JSONObject jSONObject) {
        r45.h32 h32Var2;
        int i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(z10Var.f196793i, "reserve notice, id:" + yVar.f124941v.m75945x2fec8307(4) + ", optype:" + i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1 i1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1.f189463a;
        java.lang.String m75945x2fec8307 = h32Var.m75945x2fec8307(4);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        r45.h32 e17 = i1Var.e(str, m75945x2fec8307);
        if (e17 != null) {
            e17.set(1, java.lang.Integer.valueOf(h32Var.m75939xb282bd08(1)));
        } else {
            java.lang.String m75945x2fec83072 = h32Var.m75945x2fec8307(4);
            if (m75945x2fec83072 != null) {
                i1Var.a(str, m75945x2fec83072, h32Var);
            }
        }
        java.lang.String m75945x2fec83073 = h32Var.m75945x2fec8307(4);
        if (m75945x2fec83073 == null) {
            m75945x2fec83073 = "";
        }
        java.lang.Integer num = z10Var.f196803v;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(num != null ? num.intValue() : 101);
        gk2.e eVar = z10Var.f196789e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = ((mm2.c1) eVar.a(mm2.c1.class)).f410379n;
        db2.e5 e5Var = new db2.e5(str, m75945x2fec83073, i17, null, null, valueOf, java.lang.Long.valueOf(c19792x256d2725 != null ? c19792x256d2725.m76784x5db1b11() : -1L), null, jSONObject != null ? new org.json.JSONObject().put("ActionResult", jSONObject).toString() : null, null, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(((mm2.e1) eVar.a(mm2.e1.class)).f410518o), null, null, null, 14992, null);
        gm0.j1.d().a(6276, z10Var.f196800s);
        gm0.j1.d().g(e5Var);
        yz5.p pVar = z10Var.f196802u;
        if (pVar != null) {
            i18 = 1;
            h32Var2 = h32Var;
            pVar.mo149xb9724478(java.lang.Boolean.valueOf(i17 == 1), h32Var2);
        } else {
            h32Var2 = h32Var;
            i18 = 1;
        }
        h32Var2.set(i18, java.lang.Integer.valueOf(h32Var2.m75939xb282bd08(i18)));
        z10Var.b(yVar);
    }

    public static final void d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.z10 z10Var, r45.h32 h32Var, cm2.y yVar, int i17, java.lang.String str) {
        org.json.JSONObject jSONObject;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = z10Var.f196798q;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        h32Var.set(1, 1);
        if (z10Var.f196801t) {
            bf2.c cVar = bf2.c.f101131a;
            gk2.e eVar = z10Var.f196789e;
            java.lang.String m75945x2fec8307 = yVar.f124941v.m75945x2fec8307(4);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            java.lang.String str2 = m75945x2fec8307;
            r45.ov2 a17 = zl2.t.a(h32Var);
            jSONObject = bf2.c.c(cVar, eVar, 4, 1, str2, 0, a17 != null ? a17.m75945x2fec8307(1) : null, i17 != 1 ? 0 : 1, 0, null, 0, sb1.a.f76732x366c91de, null);
        } else {
            jSONObject = null;
        }
        a(z10Var, yVar, str, h32Var, 2, jSONObject);
        android.view.ViewGroup viewGroup = z10Var.f196794m;
        db5.t7.i(viewGroup.getContext(), viewGroup.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cn8), com.p314xaae8f345.mm.R.raw.f79703xc84d169a);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int i17;
        int i18;
        android.view.ViewGroup viewGroup;
        org.json.JSONObject jSONObject;
        r45.h32 h32Var;
        r45.ov2 a17;
        xu2.u uVar;
        xu2.v vVar;
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.z10 z10Var = this.f194422d;
        yz5.l lVar = z10Var.f196791g;
        cm2.y yVar = this.f194423e;
        if (lVar != null) {
            lVar.mo146xb9724478(yVar);
        }
        gk2.e eVar = z10Var.f196789e;
        if (((mm2.c1) eVar.a(mm2.c1.class)).M7()) {
            qo0.c cVar = z10Var.f196790f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = cVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) cVar : null;
            if (k0Var != null && (uVar = (xu2.u) k0Var.mo57682x2a5e9229(xu2.u.class)) != null && (vVar = uVar.f538765r) != null) {
                vVar.b();
            }
        }
        r45.h32 h32Var2 = z10Var.f196799r;
        if (h32Var2 == null) {
            h32Var2 = yVar.f124941v;
        }
        java.lang.String str = ((mm2.c1) eVar.a(mm2.c1.class)).f410385o;
        android.view.ViewGroup viewGroup2 = z10Var.f196794m;
        if (intValue != -1) {
            h32Var2.set(1, 0);
            if (intValue == 1) {
                if (z10Var.f196801t) {
                    bf2.c cVar2 = bf2.c.f101131a;
                    gk2.e eVar2 = z10Var.f196789e;
                    java.lang.String m75945x2fec8307 = yVar.f124941v.m75945x2fec8307(4);
                    java.lang.String str2 = m75945x2fec8307 == null ? "" : m75945x2fec8307;
                    r45.ov2 a18 = zl2.t.a(h32Var2);
                    jSONObject = bf2.c.c(cVar2, eVar2, 3, 1, str2, 0, a18 != null ? a18.m75945x2fec8307(1) : null, intValue2 == 1 ? 1 : 0, 0, null, 0, sb1.a.f76732x366c91de, null);
                } else {
                    jSONObject = null;
                }
                i18 = 1;
                viewGroup = viewGroup2;
                a(this.f194422d, this.f194423e, str, h32Var2, 1, jSONObject);
                if (intValue2 == 0 && (h32Var = z10Var.f196799r) != null) {
                    if (!zl2.t.e(h32Var)) {
                        h32Var = null;
                    }
                    if (h32Var != null && (a17 = zl2.t.a(h32Var)) != null) {
                        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.o7.a(a17)) {
                            a17 = null;
                        }
                        if (a17 != null) {
                            r45.l1 l1Var = (r45.l1) a17.m75936x14adae67(19);
                            if ((l1Var != null && (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a.a(l1Var) ^ true)) && z10Var.f196801t) {
                                ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
                                java.lang.String m75945x2fec83072 = h32Var.m75945x2fec8307(4);
                                java.lang.String m75945x2fec83073 = a17.m75945x2fec8307(1);
                                r0Var.getClass();
                                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                                ml2.f4 f4Var = ml2.f4.f408964e;
                                jSONObject2.put("commerceAction", 1013);
                                if (m75945x2fec83072 == null) {
                                    m75945x2fec83072 = "";
                                }
                                jSONObject2.put("noticeid", m75945x2fec83072);
                                if (m75945x2fec83073 == null) {
                                    m75945x2fec83073 = "";
                                }
                                jSONObject2.put("coupon_id", m75945x2fec83073);
                                ml2.r0.hj(r0Var, ml2.b4.f408797s, java.lang.String.valueOf(jSONObject2), 0L, null, null, null, null, null, 252, null);
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ed edVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ed.f213532a;
                            android.content.Context context = z10Var.f196788d;
                            java.lang.String m75945x2fec83074 = h32Var.m75945x2fec8307(3);
                            i17 = 0;
                            long m75939xb282bd08 = h32Var.m75939xb282bd08(0) * 1000;
                            java.lang.String m75945x2fec83075 = h32Var.m75945x2fec8307(4);
                            if (m75945x2fec83075 == null) {
                                m75945x2fec83075 = "";
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ed.b(edVar, context, h32Var, m75945x2fec83074, m75939xb282bd08, kz5.b0.c(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.dd(a17, m75945x2fec83075)), ((mm2.c1) eVar.a(mm2.c1.class)).f410385o, false, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v10(z10Var, h32Var, a17), 192, null);
                        }
                    }
                }
                i17 = 0;
            } else {
                i17 = 0;
                i18 = 1;
                viewGroup = viewGroup2;
            }
            if ((h32Var2.m75939xb282bd08(9) == i18 ? i18 : i17) != 0) {
                java.lang.String m75945x2fec83076 = h32Var2.m75945x2fec8307(8);
                java.lang.String str3 = m75945x2fec83076 == null ? "" : m75945x2fec83076;
                java.lang.String m75945x2fec83077 = h32Var2.m75945x2fec8307(4);
                pq5.g l17 = new db2.b2(str3, null, null, 0L, 0L, m75945x2fec83077 == null ? "" : m75945x2fec83077, 1, false, 158, null).l();
                android.content.Context context2 = viewGroup.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                l17.f((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2);
                l17.K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.k10(z10Var, str));
            }
        } else if (intValue2 != 0) {
            d(z10Var, h32Var2, yVar, intValue2, str);
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(viewGroup2.getContext(), 1, true);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.z10 z10Var2 = this.f194422d;
            k0Var2.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.g10(z10Var2);
            k0Var2.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.h10(z10Var2, h32Var2, this.f194423e, intValue2, str);
            k0Var2.v();
        }
        return jz5.f0.f384359a;
    }
}
