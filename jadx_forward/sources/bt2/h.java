package bt2;

/* loaded from: classes3.dex */
public final class h extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public r45.bw2 f105723d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.p1620xeb77f168.C14937x9aaf713e f105724e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
    }

    public static final void O6(km2.m mVar, java.lang.String str, r45.bw2 bw2Var) {
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        ml2.f4 f4Var = ml2.f4.f408981v;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 1008);
        jSONObject.put("sessionid", bw2Var.m75945x2fec8307(7));
        jSONObject.put("productid", str);
        r45.y23 y23Var = (r45.y23) bw2Var.m75936x14adae67(4);
        if (y23Var != null) {
            r45.gt3 gt3Var = (r45.gt3) y23Var.m75936x14adae67(61);
            java.lang.String m75945x2fec8307 = gt3Var != null ? gt3Var.m75945x2fec8307(1) : null;
            int i17 = (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) ? 1 : 0;
            jSONObject.put("seckill", st2.g3.f493859a.v(y23Var) ? 1 : 0);
            jSONObject.put("is_gift_show", i17 ^ 1);
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("entrance", bw2Var.m75945x2fec8307(6));
        r45.y23 y23Var2 = (r45.y23) bw2Var.m75936x14adae67(4);
        r0Var.Gj(f4Var, jSONObject, jSONObject2, y23Var2 != null ? y23Var2.m75945x2fec8307(17) : null);
        ((ct2.j) mVar.f390663e.a(ct2.j.class)).f303799g = android.os.SystemClock.elapsedRealtime();
        ct2.g R6 = ((ct2.j) mVar.f390663e.a(ct2.j.class)).R6();
        java.lang.String m75945x2fec83072 = bw2Var.m75945x2fec8307(7);
        if (m75945x2fec83072 == null) {
            m75945x2fec83072 = "";
        }
        R6.getClass();
        R6.f303788a = m75945x2fec83072;
        java.lang.String m75945x2fec83073 = bw2Var.m75945x2fec8307(6);
        R6.f303790c = m75945x2fec83073 != null ? m75945x2fec83073 : "";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        R6.f303789b = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "shoppingReport:" + R6);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.azl;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        ws2.k1.f530599r.c();
        return super.mo2274xbdc3c5dc();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        r45.bw2 bw2Var;
        km2.m mVar;
        cm2.t tVar;
        gk2.e m57654xd7793f26;
        java.lang.String str;
        r45.nw1 m76794xd0557130;
        r45.hd5 hd5Var;
        r45.nw1 m76794xd05571302;
        r45.i72 i72Var;
        if (m158354x19263085() instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085).m78583x85ccfe01(8);
        }
        m158354x19263085().getWindow().addFlags(2097280);
        m158354x19263085().getWindow().addFlags(67108864);
        m158354x19263085().getWindow().clearFlags(1024);
        m158354x19263085().getWindow().clearFlags(512);
        m158354x19263085().getWindow().clearFlags(67108864);
        if (m80379x76847179().getResources().getConfiguration().orientation == 2) {
            m158354x19263085().getWindow().getDecorView().setSystemUiVisibility(7942);
            m158354x19263085().getWindow().addFlags(1024);
        } else {
            m158354x19263085().getWindow().getDecorView().setSystemUiVisibility(1792);
        }
        m158354x19263085().getWindow().addFlags(Integer.MIN_VALUE);
        m158354x19263085().getWindow().setStatusBarColor(0);
        m158354x19263085().getWindow().setNavigationBarColor(0);
        m158354x19263085().getWindow().setFormat(-3);
        m158354x19263085().getWindow().setSoftInputMode(51);
        byte[] byteArrayExtra = m158359x1e885992().getByteArrayExtra("KEY_PARAMS_KEY_VALUE");
        if (byteArrayExtra != null) {
            bw2Var = new r45.bw2();
            bw2Var.mo11468x92b714fd(byteArrayExtra);
        } else {
            bw2Var = null;
        }
        this.f105723d = bw2Var;
        if (!(bw2Var != null && bw2Var.m75939xb282bd08(1) == 1)) {
            zl2.r4 r4Var = zl2.r4.f555483a;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("(Debug)回放状态(");
            r45.bw2 bw2Var2 = this.f105723d;
            sb6.append(bw2Var2 != null ? java.lang.Integer.valueOf(bw2Var2.m75939xb282bd08(1)) : null);
            sb6.append(")错误！");
            r4Var.f3(m158354x192630852, sb6.toString());
            m158354x19263085().finish();
            return;
        }
        r45.bw2 bw2Var3 = this.f105723d;
        java.lang.String m75945x2fec8307 = bw2Var3 != null ? bw2Var3.m75945x2fec8307(2) : null;
        if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
            zl2.r4 r4Var2 = zl2.r4.f555483a;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630853 = m158354x19263085();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("(Debug)回放url: ");
            r45.bw2 bw2Var4 = this.f105723d;
            sb7.append(bw2Var4 != null ? bw2Var4.m75945x2fec8307(2) : null);
            r4Var2.f3(m158354x192630853, sb7.toString());
        }
        this.f105724e = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.p1620xeb77f168.C14937x9aaf713e(m158354x19263085(), null);
        ((android.view.ViewGroup) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f568443mv1)).addView(this.f105724e);
        r45.bw2 bw2Var5 = this.f105723d;
        if (bw2Var5 != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) bw2Var5.m75936x14adae67(0);
            if (c19792x256d2725 == null) {
                mVar = null;
            } else {
                mVar = new km2.m(c19792x256d2725);
                cm2.a.f124861a.v(mVar, c19792x256d2725, 2);
            }
            if (mVar != null) {
                ct2.j jVar = (ct2.j) mVar.f390663e.a(ct2.j.class);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) bw2Var5.m75936x14adae67(0);
                jVar.a7((c19792x256d27252 == null || (m76794xd05571302 = c19792x256d27252.m76794xd0557130()) == null || (i72Var = (r45.i72) m76794xd05571302.m75936x14adae67(44)) == null) ? 0 : i72Var.m75939xb282bd08(2), java.lang.Boolean.TRUE);
                p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
                h0Var.f391656d = "";
                gk2.e eVar = mVar.f390663e;
                ((mm2.f6) eVar.a(mm2.f6.class)).f410570m = true;
                mm2.f6 f6Var = (mm2.f6) eVar.a(mm2.f6.class);
                if (((r45.y23) bw2Var5.m75936x14adae67(4)) != null) {
                    mm2.e1 e1Var = (mm2.e1) eVar.a(mm2.e1.class);
                    r45.av1 av1Var = new r45.av1();
                    av1Var.set(1, db2.t4.f309704a.a(6211));
                    av1Var.set(2, java.lang.Long.valueOf(e1Var.f410516m));
                    av1Var.set(3, java.lang.Long.valueOf(e1Var.f410521r.m75942xfb822ef2(0)));
                    av1Var.set(4, e1Var.f410525v);
                    r45.y23 y23Var = (r45.y23) bw2Var5.m75936x14adae67(4);
                    av1Var.set(5, java.lang.Long.valueOf(y23Var != null ? y23Var.m75942xfb822ef2(0) : 0L));
                    av1Var.set(10, 1177);
                    av1Var.set(7, ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Mj());
                    av1Var.d().l().K(new bt2.g(bw2Var5, mVar, h0Var));
                    r45.y23 y23Var2 = (r45.y23) bw2Var5.m75936x14adae67(4);
                    int m75939xb282bd08 = (y23Var2 == null || (hd5Var = (r45.hd5) y23Var2.m75936x14adae67(24)) == null) ? 0 : hd5Var.m75939xb282bd08(2);
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27253 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) bw2Var5.m75936x14adae67(0);
                    int m75939xb282bd082 = (c19792x256d27253 == null || (m76794xd0557130 = c19792x256d27253.m76794xd0557130()) == null) ? 0 : m76794xd0557130.m75939xb282bd08(4);
                    if (m75939xb282bd08 > m75939xb282bd082) {
                        ((ct2.j) mVar.f390663e.a(ct2.j.class)).c7(m75939xb282bd08 - m75939xb282bd082);
                    }
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder("initReplayStartOffset replayBeginTime:");
                    sb8.append(m75939xb282bd08);
                    sb8.append(",liveStartTime:");
                    sb8.append(m75939xb282bd082);
                    sb8.append(",replayStartOffset");
                    sb8.append(((ct2.j) mVar.f390663e.a(ct2.j.class)).f303801i);
                    sb8.append(",replayId:");
                    sb8.append(pm0.v.u(bw2Var5.m75942xfb822ef2(3)));
                    sb8.append(",product_id:");
                    r45.y23 y23Var3 = (r45.y23) bw2Var5.m75936x14adae67(4);
                    sb8.append(y23Var3 != null ? java.lang.Long.valueOf(y23Var3.m75942xfb822ef2(0)) : null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, sb8.toString());
                    r45.y23 y23Var4 = (r45.y23) bw2Var5.m75936x14adae67(4);
                    if (y23Var4 == null || (str = java.lang.Long.valueOf(y23Var4.m75942xfb822ef2(0)).toString()) == null) {
                        str = "";
                    }
                    h0Var.f391656d = str;
                    r45.y23 y23Var5 = (r45.y23) bw2Var5.m75936x14adae67(4);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(y23Var5);
                    tVar = new cm2.m0(y23Var5);
                    java.lang.String m75945x2fec83072 = bw2Var5.m75945x2fec8307(8);
                    if (m75945x2fec83072 == null) {
                        m75945x2fec83072 = "";
                    }
                    tVar.f124920f = m75945x2fec83072;
                } else if (((r45.ov2) bw2Var5.m75936x14adae67(5)) != null) {
                    r45.ov2 ov2Var = (r45.ov2) bw2Var5.m75936x14adae67(5);
                    java.lang.String m75945x2fec83073 = ov2Var != null ? ov2Var.m75945x2fec8307(0) : null;
                    if (m75945x2fec83073 == null) {
                        m75945x2fec83073 = "";
                    }
                    h0Var.f391656d = m75945x2fec83073;
                    r45.ov2 ov2Var2 = (r45.ov2) bw2Var5.m75936x14adae67(5);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(ov2Var2);
                    tVar = new cm2.k0(ov2Var2);
                } else {
                    tVar = null;
                }
                f6Var.c7(tVar);
                r45.nw1 nw1Var = ((mm2.e1) mVar.f390663e.a(mm2.e1.class)).f410521r;
                java.lang.String m75945x2fec83074 = bw2Var5.m75945x2fec8307(2);
                nw1Var.set(29, m75945x2fec83074 != null ? m75945x2fec83074 : "");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.p1620xeb77f168.C14937x9aaf713e c14937x9aaf713e = this.f105724e;
                if (c14937x9aaf713e != null) {
                    c14937x9aaf713e.mo57463x37f82187(mVar);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.p1620xeb77f168.C14937x9aaf713e c14937x9aaf713e2 = this.f105724e;
                if (c14937x9aaf713e2 != null && (m57654xd7793f26 = c14937x9aaf713e2.m57654xd7793f26()) != null) {
                    ws2.k1 a17 = ws2.k1.f530599r.a();
                    zs2.a aVar = new zs2.a();
                    aVar.f556777a = false;
                    aVar.f556778b = false;
                    a17.o(m57654xd7793f26, aVar);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.p1620xeb77f168.C14937x9aaf713e c14937x9aaf713e3 = this.f105724e;
                if (c14937x9aaf713e3 != null) {
                    c14937x9aaf713e3.r(false);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.p1620xeb77f168.C14937x9aaf713e c14937x9aaf713e4 = this.f105724e;
                if (c14937x9aaf713e4 != null) {
                    c14937x9aaf713e4.mo46547x6343c19();
                }
                ws2.k1.f530599r.a().p(this.f105724e, qs5.o.f447989i);
                if (((r45.y23) bw2Var5.m75936x14adae67(4)) == null) {
                    O6(mVar, (java.lang.String) h0Var.f391656d, bw2Var5);
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        km2.m m57663xfb7e5820;
        gk2.e eVar;
        r45.y23 y23Var;
        r45.y23 y23Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.p1620xeb77f168.C14937x9aaf713e c14937x9aaf713e = this.f105724e;
        if (c14937x9aaf713e != null && (m57663xfb7e5820 = c14937x9aaf713e.m57663xfb7e5820()) != null && (eVar = m57663xfb7e5820.f390663e) != null) {
            ct2.j jVar = (ct2.j) eVar.a(ct2.j.class);
            ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
            ml2.f4 f4Var = ml2.f4.f408982w;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", 1009);
            jSONObject.put("sessionid", jVar.R6().f303788a);
            jSONObject.put("productid", jVar.R6().f303789b);
            r45.bw2 bw2Var = this.f105723d;
            if (bw2Var != null && (y23Var2 = (r45.y23) bw2Var.m75936x14adae67(4)) != null) {
                jSONObject.put("seckill", st2.g3.f493859a.v(y23Var2) ? 1 : 0);
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("during", android.os.SystemClock.elapsedRealtime() - jVar.f303799g);
            r45.bw2 bw2Var2 = this.f105723d;
            r0Var.Gj(f4Var, jSONObject, jSONObject2, (bw2Var2 == null || (y23Var = (r45.y23) bw2Var2.m75936x14adae67(4)) == null) ? null : y23Var.m75945x2fec8307(17));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.p1620xeb77f168.C14937x9aaf713e c14937x9aaf713e2 = this.f105724e;
        if (c14937x9aaf713e2 != null) {
            c14937x9aaf713e2.s();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.p1620xeb77f168.C14937x9aaf713e c14937x9aaf713e3 = this.f105724e;
        if (c14937x9aaf713e3 != null) {
            c14937x9aaf713e3.mo46559xed5f7500();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.p1620xeb77f168.C14937x9aaf713e c14937x9aaf713e = this.f105724e;
        if (c14937x9aaf713e != null) {
            ws2.o m11220x7f570b99 = c14937x9aaf713e.m11220x7f570b99();
            if (m11220x7f570b99.f530645h) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayBaseUIC", "resume");
                at2.u1 u1Var = m11220x7f570b99.f530642e;
                if (u1Var != null) {
                    u1Var.v1(null, false);
                }
                at2.y1 y1Var = m11220x7f570b99.f530644g;
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = m11220x7f570b99.f530625b;
                if (y1Var != null && (c22699x3dcdb352 = y1Var.f95315r) != null) {
                    android.graphics.drawable.Drawable drawable = activityC0065xcd7aa112.getDrawable(com.p314xaae8f345.mm.R.raw.f79844x41f895de);
                    com.p314xaae8f345.mm.ui.uk.f(drawable, -1);
                    c22699x3dcdb352.setImageDrawable(drawable);
                }
                at2.y1 y1Var2 = m11220x7f570b99.f530644g;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = y1Var2 != null ? y1Var2.f95315r : null;
                if (c22699x3dcdb3522 == null) {
                    return;
                }
                c22699x3dcdb3522.setContentDescription(activityC0065xcd7aa112.getString(com.p314xaae8f345.mm.R.C30867xcad56011.eaz));
            }
        }
    }
}
