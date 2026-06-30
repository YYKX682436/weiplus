package we2;

/* loaded from: classes3.dex */
public final class q implements we2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gk2.e f526784a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ we2.s f526785b;

    public q(gk2.e eVar, we2.s sVar) {
        this.f526784a = eVar;
        this.f526785b = sVar;
    }

    @Override // we2.a
    public java.util.List a() {
        return ((mm2.c1) this.f526784a.a(mm2.c1.class)).f410348h4;
    }

    @Override // we2.a
    public void b(android.view.View view, r45.oj1 msgJumpInfo) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c4 c4Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.v6 v6Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c4 c4Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.v6 v6Var2;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgJumpInfo, "msgJumpInfo");
        we2.s sVar = this.f526785b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(sVar.f526787f, "onCustomClick msgJumpInfo:" + msgJumpInfo.mo12245xcc313de3());
        int m75939xb282bd08 = msgJumpInfo.m75939xb282bd08(0);
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (m75939xb282bd08 == 1) {
            r45.rq1 rq1Var = (r45.rq1) msgJumpInfo.m75936x14adae67(1);
            if (rq1Var != null) {
                dk2.ef efVar = dk2.ef.f314905a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
                if (k0Var == null || (c4Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c4) k0Var.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c4.class)) == null || (v6Var2 = c4Var2.E) == null) {
                    f0Var = null;
                } else {
                    v6Var2.k(rq1Var);
                }
                if (f0Var != null) {
                    return;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(sVar.f526787f, "onCustomClick wording_info null");
            dk2.ef efVar2 = dk2.ef.f314905a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var2 = dk2.ef.f314913e;
            if (k0Var2 == null || (c4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c4) k0Var2.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c4.class)) == null || (v6Var = c4Var.E) == null) {
                return;
            }
            v6Var.k(null);
            return;
        }
        if (m75939xb282bd08 != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(sVar.f526787f, "onCustomClick jump_type invalid:" + msgJumpInfo.m75939xb282bd08(0));
            return;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) msgJumpInfo.m75936x14adae67(2);
        if (c19786x6a1e2862 != null) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            android.content.Context context = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            xc2.y2 y2Var = xc2.y2.f534876a;
            xc2.p0 p0Var = new xc2.p0(c19786x6a1e2862);
            p0Var.f534785n = 0;
            xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28622 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) msgJumpInfo.m75936x14adae67(2);
            if ((c19786x6a1e28622 != null ? c19786x6a1e28622.m76517xcb1f2fa3() : null) != null) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28623 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) msgJumpInfo.m75936x14adae67(2);
                if (c19786x6a1e28623 == null || (str = c19786x6a1e28623.m76517xcb1f2fa3()) == null) {
                    str = "";
                }
                boolean z17 = new cl0.g(str).mo15080xc3ca103c("platform_reminder_notification_biz_type", 0) == 2;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("type", 2);
                jSONObject.put("card_type", z17 ? 2 : 1);
                java.lang.String str2 = sVar.f526787f;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("report anchor platform notice comment type = 2, cardType = ");
                sb6.append(z17 ? 2 : 1);
                sb6.append(", report str = ");
                sb6.append(jSONObject);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
                i95.m c17 = i95.n0.c(ml2.j0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                zy2.zb.y6((zy2.zb) c17, ml2.z4.f409894l2, jSONObject.toString(), null, 4, null);
            }
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(sVar.f526787f, "onCustomClick jump_info null");
        }
    }

    @Override // we2.a
    public void c(java.lang.String str) {
        android.content.Context context;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f526785b.f526787f, "onCommentProfileClick username:" + str);
        if ((str == null || str.length() == 0) || zl2.r4.f555483a.c2(str)) {
            return;
        }
        dk2.ef efVar = dk2.ef.f314905a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
        if (k0Var == null || (context = k0Var.getContext()) == null) {
            return;
        }
        dk2.q4.j(dk2.q4.f315471a, context, this.f526784a, false, str, null, false, null, 112, null);
    }

    @Override // we2.a
    public void d(dk2.zf msg, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        dk2.t5 N6 = this.f526785b.N6();
        N6.getClass();
        if (msg.m() < N6.f315638d) {
            return;
        }
        if (msg.m() == N6.f315638d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveCommentStickyHelper", "onDescShow only update pos new:" + i17 + " old:" + N6.f315637c);
            N6.f315637c = i17;
            return;
        }
        if (N6.f315639e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveCommentStickyHelper", "cancel current sticky desc when new comes");
            N6.f315639e = false;
            yz5.p pVar = N6.f315642h;
            if (pVar != null) {
                pVar.mo149xb9724478(java.lang.Integer.valueOf(N6.f315637c), java.lang.Boolean.FALSE);
            }
        }
        N6.f315637c = i17;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        N6.f315636b = java.lang.System.currentTimeMillis();
        N6.f315638d = msg.m();
        N6.f315640f = true;
        N6.f315641g = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveCommentStickyHelper", "onDescShow may sticky desc: targetStickyCommentMsgIndex:" + N6.f315637c + " targetStickyCommentMsgStartShowTime:" + N6.f315636b + " targetStickyCommentMsgSeq:" + N6.f315638d);
    }

    @Override // we2.a
    public void e(boolean z17) {
        ((mm2.x4) this.f526784a.a(mm2.x4.class)).f411073u = z17;
    }

    @Override // we2.a
    public int f() {
        return this.f526785b.f526790i;
    }

    @Override // we2.a
    public void g(java.lang.String str, java.lang.String str2) {
        ((mm2.m6) this.f526784a.a(mm2.m6.class)).f410777i.mo7808x76db6cb1(new mm2.j7(str, str2));
    }

    @Override // we2.a
    public boolean h(int i17) {
        java.lang.Boolean bool = (java.lang.Boolean) ((java.util.LinkedHashMap) ((mm2.x4) this.f526784a.a(mm2.x4.class)).f411075w).get(java.lang.Integer.valueOf(i17));
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @Override // we2.a
    public r45.ze2 i() {
        return ((mm2.c1) this.f526784a.a(mm2.c1.class)).f410320c4;
    }

    @Override // we2.a
    public void j() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.th0 th0Var;
        android.content.Context context;
        we2.s sVar = this.f526785b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(sVar.f526787f, "onCommentFansClubClick");
        if (((mm2.c1) this.f526784a.a(mm2.c1.class)).m7()) {
            dk2.ef efVar = dk2.ef.f314905a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
            if (k0Var == null || (th0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.th0) k0Var.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.th0.class)) == null) {
                return;
            }
            th0Var.v1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.eh0.f193954n);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(sVar.f526787f, "onCommentFansClubClick intercepted: anchor disabled gift");
        dk2.ef efVar2 = dk2.ef.f314905a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var2 = dk2.ef.f314913e;
        if (k0Var2 == null || (context = k0Var2.getContext()) == null) {
            return;
        }
        db5.t7.g(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dk_));
    }

    @Override // we2.a
    public void k(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        zl2.r4.f555483a.j1(context, this.f526784a);
    }

    @Override // we2.a
    public boolean l(int i17) {
        dk2.t5 N6 = this.f526785b.N6();
        return N6.f315639e && N6.f315637c == i17;
    }

    @Override // we2.a
    public java.util.Set m() {
        return ((mm2.x4) this.f526784a.a(mm2.x4.class)).f411074v;
    }

    @Override // we2.a
    public void n(java.lang.String str, java.lang.String str2) {
        android.content.Context context;
        we2.s sVar = this.f526785b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(sVar.f526787f, "onCommentGiftClick rewardProductId:" + str + " toUsername:" + str2);
        gk2.e eVar = this.f526784a;
        if (!((mm2.c1) eVar.a(mm2.c1.class)).m7()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(sVar.f526787f, "onCommentGiftClick intercepted: anchor disabled gift");
            dk2.ef efVar = dk2.ef.f314905a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
            if (k0Var == null || (context = k0Var.getContext()) == null) {
                return;
            }
            db5.t7.g(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dk_));
            return;
        }
        dk2.ef efVar2 = dk2.ef.f314905a;
        if (dk2.ef.f314913e != null) {
            r45.zb4 zb4Var = new r45.zb4();
            if (str == null) {
                str = "";
            }
            zb4Var.set(0, str);
            zb4Var.set(1, java.lang.Boolean.TRUE);
            if (!(str2 == null || str2.length() == 0)) {
                zb4Var.set(6, str2);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb44 = ((mm2.s2) eVar.a(mm2.s2.class)).f410944p;
            if (c14227x4262fb44 != null) {
                c14227x4262fb44.mo7808x76db6cb1(zb4Var);
            }
        }
    }

    @Override // we2.a
    public void o(boolean z17, int i17) {
        mm2.x4 x4Var = (mm2.x4) this.f526784a.a(mm2.x4.class);
        x4Var.f411075w.put(java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
    }

    @Override // we2.a
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 p() {
        dk2.ef efVar = dk2.ef.f314905a;
        return dk2.ef.f314913e;
    }

    @Override // we2.a
    public boolean q() {
        return ((mm2.m6) this.f526784a.a(mm2.m6.class)).f410781p;
    }

    @Override // we2.a
    public boolean r() {
        return ((mm2.c1) this.f526784a.a(mm2.c1.class)).R6();
    }

    @Override // we2.a
    public void s(java.lang.String str) {
        sf2.d3 d3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
        if (k0Var == null || (d3Var = (sf2.d3) k0Var.mo57658x143f1b92(sf2.d3.class)) == null) {
            return;
        }
        d3Var.w7(-1, fn2.u1.f345947i, fn2.v1.f345956f, str);
    }

    @Override // we2.a
    public boolean t() {
        dk2.ef efVar = dk2.ef.f314905a;
        return dk2.ef.f314917g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // we2.a
    public void u(android.content.Context context, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        gk2.e eVar = this.f526784a;
        pq5.g l17 = new ek2.v2(((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0), ((mm2.e1) eVar.a(mm2.e1.class)).f410516m, ((mm2.e1) eVar.a(mm2.e1.class)).f410525v, ((mm2.e1) eVar.a(mm2.e1.class)).f410518o, str).l();
        if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            l17.f((im5.b) context);
        }
    }

    @Override // we2.a
    public boolean v(java.util.LinkedList linkedList) {
        return zl2.r4.f555483a.d2(this.f526784a, linkedList);
    }

    @Override // we2.a
    public java.lang.String w() {
        return ((mm2.c1) this.f526784a.a(mm2.c1.class)).f410385o;
    }

    @Override // we2.a
    public void x(android.app.Activity context, r45.v62 luckyMoneySendInfo, android.os.ResultReceiver resultReceiver, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(luckyMoneySendInfo, "luckyMoneySendInfo");
        dk2.xf k17 = dk2.ef.f314905a.k(this.f526784a);
        if (k17 != null) {
            ((dk2.r4) k17).W(context, luckyMoneySendInfo, resultReceiver, lVar);
        }
    }
}
