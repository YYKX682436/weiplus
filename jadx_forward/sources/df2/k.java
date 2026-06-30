package df2;

/* loaded from: classes3.dex */
public final class k extends if2.b implements if2.e {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f312055m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f312056n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f312057o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1488x6c222b6a.C14198xcf03f077 f312058p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s f312059q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f312060r;

    /* renamed from: s, reason: collision with root package name */
    public r45.hc1 f312061s;

    /* renamed from: t, reason: collision with root package name */
    public r45.u12 f312062t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f312063u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f312055m = "Finder.AnchorGamePendantController";
    }

    public final void Z6(android.content.Intent intent) {
        java.lang.Integer valueOf = intent != null ? java.lang.Integer.valueOf(intent.getIntExtra("KEY_PARAMS_DO_ACTION", 0)) : null;
        java.lang.String str = "checkCloseLive, doAction:" + valueOf + ", isLiveStarted:" + ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).a8();
        java.lang.String str2 = this.f312055m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        if (valueOf != null && valueOf.intValue() == 14) {
            intent.putExtra("KEY_PARAMS_DO_ACTION", 0);
            df2.y yVar = (df2.y) m56789x25fe639c(df2.y.class);
            if (yVar != null) {
                yVar.Z6();
                return;
            }
            return;
        }
        if (valueOf != null && valueOf.intValue() == 15) {
            java.lang.String stringExtra = intent.getStringExtra("KEY_PARAMS_DO_ACTION_PARAMS");
            intent.putExtra("KEY_PARAMS_DO_ACTION", 0);
            intent.removeExtra("KEY_PARAMS_DO_ACTION_PARAMS");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "show FullScreenWebView url:" + stringExtra);
            if (stringExtra == null || stringExtra.length() == 0) {
                return;
            }
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("rawUrl", stringExtra);
            intent2.putExtra("convertActivityFromTranslucent", true);
            j45.l.j(O6(), "webview", ".ui.tools.WebViewUI", intent2, null);
        }
    }

    public final void a7(java.lang.String str, java.lang.String str2) {
        r45.k74 m76504xa819f0c7;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("event_name", str);
        jSONObject.put("event_data", str2);
        java.lang.String jSONObject2 = jSONObject.toString();
        java.lang.String str3 = this.f312055m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "invokeLiteApp actionName:frontend/onLiveEvent, query:" + jSONObject2);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = this.f312056n;
        if (c19786x6a1e2862 == null || (m76504xa819f0c7 = c19786x6a1e2862.m76504xa819f0c7()) == null) {
            return;
        }
        java.lang.String m75945x2fec8307 = m76504xa819f0c7.m75945x2fec8307(0);
        if ((m75945x2fec8307 == null || m75945x2fec8307.length() == 0) || !this.f312060r) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "invokeLiteApp actionName:frontend/onLiveEvent dispatch");
        if (((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).tk(m75945x2fec8307)) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).rj(m75945x2fec8307, "frontend/onLiveEvent", jSONObject2);
        } else {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).qj(m75945x2fec8307, 10, false, 10L, new df2.h(this, m75945x2fec8307, "frontend/onLiveEvent", jSONObject2));
        }
    }

    public final void b7() {
        a7("micMute", "{\"result\":" + ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).O4 + '}');
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onFloatMode */
    public void mo14866x804e7f00() {
        super.mo14866x804e7f00();
        if (this.f312057o != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f312055m, "ANCHOR_SCREEN_CAST_LITEAPP 1");
            i95.m c17 = i95.n0.c(zy2.zb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.z4 z4Var = ml2.z4.S1;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", 1);
            zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
        }
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveDeactivate */
    public void mo14860x9606ce3f() {
        super.mo14860x9606ce3f();
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        android.view.View view = this.f312057o;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).getClass();
        if (view instanceof com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329) {
            ((com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329) view).g();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveEnd */
    public void mo56792x5aa1a970() {
        fo0.n O;
        fo0.q qVar;
        android.view.View view;
        fo0.n O2;
        super.mo56792x5aa1a970();
        if (this.f312057o != null) {
            tn0.w0 Q6 = Q6();
            fo0.q qVar2 = (Q6 == null || (O2 = Q6.O()) == null) ? null : O2.f346359m;
            if (qVar2 != null) {
                qVar2.f346370b = new android.graphics.Point(com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561998yp), com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561997yo));
            }
            tn0.w0 Q62 = Q6();
            if (Q62 != null && (O = Q62.O()) != null && (qVar = O.f346359m) != null && (view = qVar.f346369a) != null) {
                android.view.ViewGroup viewGroup = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
                if (viewGroup != null) {
                    viewGroup.requestDisallowInterceptTouchEvent(false);
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/AnchorGamePendantController", "onLiveEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/AnchorGamePendantController", "onLiveEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            dk2.ef.s0(dk2.ef.f314905a, -1, null, null, null, false, 30, null);
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4, 0);
        jSONObject.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, "");
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        a7("liveEnd", jSONObject2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        r45.k74 m76504xa819f0c7;
        java.lang.String str;
        r45.nw1 nw1Var;
        r45.nw1 nw1Var2;
        r45.nw1 nw1Var3;
        r45.nw1 nw1Var4;
        r45.k74 m76504xa819f0c72;
        r45.k74 m76504xa819f0c73;
        r45.k74 m76504xa819f0c74;
        r45.ic1 ic1Var;
        super.mo14863x39a513b7(hc1Var);
        this.f312061s = hc1Var;
        this.f312056n = (hc1Var == null || (ic1Var = (r45.ic1) hc1Var.m75936x14adae67(85)) == null) ? null : (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) ic1Var.m75936x14adae67(2);
        ae2.in inVar = ae2.in.f85221a;
        jz5.g gVar = ae2.in.N4;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).intValue();
        java.lang.String str2 = "";
        java.lang.String str3 = this.f312055m;
        if (intValue == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "hardcode FINDER_LIVE_GAME_PENDANT_JUMP_INFO 1");
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862();
            r45.k74 k74Var = new r45.k74();
            k74Var.set(0, "wxalite164e2507fd4448cd0599ab206c3ff653");
            k74Var.set(1, "pages/home");
            k74Var.set(2, "");
            c19786x6a1e2862.m76551x3af0573b(k74Var);
            this.f312056n = c19786x6a1e2862;
        } else if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).intValue() == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "hardcode FINDER_LIVE_GAME_PENDANT_JUMP_INFO 2");
            this.f312056n = null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pendantJumpInfo:");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28622 = this.f312056n;
        sb6.append(c19786x6a1e28622 != null ? java.lang.Integer.valueOf(c19786x6a1e28622.m76480xe2ee1ca3()) : null);
        sb6.append(", ");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28623 = this.f312056n;
        sb6.append(c19786x6a1e28623 != null ? java.lang.Integer.valueOf(c19786x6a1e28623.m76503x92bc3c07()) : null);
        sb6.append(", ");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28624 = this.f312056n;
        sb6.append((c19786x6a1e28624 == null || (m76504xa819f0c74 = c19786x6a1e28624.m76504xa819f0c7()) == null) ? null : m76504xa819f0c74.m75945x2fec8307(0));
        sb6.append(", ");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28625 = this.f312056n;
        sb6.append((c19786x6a1e28625 == null || (m76504xa819f0c73 = c19786x6a1e28625.m76504xa819f0c7()) == null) ? null : m76504xa819f0c73.m75945x2fec8307(1));
        sb6.append(", ");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28626 = this.f312056n;
        sb6.append((c19786x6a1e28626 == null || (m76504xa819f0c72 = c19786x6a1e28626.m76504xa819f0c7()) == null) ? null : m76504xa819f0c72.m75945x2fec8307(2));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, sb6.toString());
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28627 = this.f312056n;
        if (c19786x6a1e28627 != null && (m76504xa819f0c7 = c19786x6a1e28627.m76504xa819f0c7()) != null) {
            java.lang.String m75945x2fec8307 = m76504xa819f0c7.m75945x2fec8307(0);
            if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
                if (this.f312057o == null) {
                    android.view.View oj6 = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).oj(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, false, false, null);
                    this.f312057o = oj6;
                    ((com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329) oj6).f127591y = true;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "create lite app view:" + this.f312057o);
                }
                android.view.View view = this.f312057o;
                if (view != null) {
                    android.content.Context context = view.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1488x6c222b6a.C14198xcf03f077 c14198xcf03f077 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1488x6c222b6a.C14198xcf03f077(context);
                    this.f312058p = c14198xcf03f077;
                    c14198xcf03f077.addView(view, new android.widget.FrameLayout.LayoutParams(-1, -1));
                    this.f312059q = new kf2.a0(this);
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("liteAppView:");
                    sb7.append(view.hashCode());
                    sb7.append(", liteAppStore:");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar = this.f312059q;
                    sb7.append(sVar != null ? sVar.hashCode() : 0);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, sb7.toString());
                    q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString("appId", m75945x2fec8307);
                    bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, m76504xa819f0c7.m75945x2fec8307(1));
                    java.lang.String m75945x2fec83072 = m76504xa819f0c7.m75945x2fec8307(2);
                    android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                    java.lang.String e17 = xy2.c.e(context2);
                    ya2.b2 b17 = ya2.h.f542017a.b(e17);
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("platId", 2);
                    jSONObject.put("nickname", b17 != null ? b17.w0() : "");
                    jSONObject.put("headImgUrl", b17 != null ? b17.m176700xe5e0d2a0() : "");
                    jSONObject.put("finderUsername", e17);
                    jSONObject.put("objectId", pm0.v.u(((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410516m));
                    jSONObject.put("liveId", pm0.v.u(((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0)));
                    jSONObject.put("startTime", ((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410521r.m75939xb282bd08(4));
                    jSONObject.put("gameAppid", ((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410521r.m75945x2fec8307(22));
                    r45.kc1 kc1Var = ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).f410373m;
                    if (kc1Var == null || (str = kc1Var.m75945x2fec8307(0)) == null) {
                        str = "";
                    }
                    jSONObject.put("lawTips", str);
                    r45.hc1 hc1Var2 = this.f312061s;
                    jSONObject.put("onlineCnt", (hc1Var2 == null || (nw1Var4 = (r45.nw1) hc1Var2.m75936x14adae67(3)) == null) ? 0 : nw1Var4.m75939xb282bd08(1));
                    r45.hc1 hc1Var3 = this.f312061s;
                    jSONObject.put("curParticipantCount", (hc1Var3 == null || (nw1Var3 = (r45.nw1) hc1Var3.m75936x14adae67(3)) == null) ? 0 : nw1Var3.m75939xb282bd08(10));
                    r45.hc1 hc1Var4 = this.f312061s;
                    long j17 = 0;
                    jSONObject.put("likeCnt", (hc1Var4 == null || (nw1Var2 = (r45.nw1) hc1Var4.m75936x14adae67(3)) == null) ? 0L : nw1Var2.m75942xfb822ef2(19));
                    r45.hc1 hc1Var5 = this.f312061s;
                    if (hc1Var5 != null && (nw1Var = (r45.nw1) hc1Var5.m75936x14adae67(3)) != null) {
                        j17 = nw1Var.m75942xfb822ef2(50);
                    }
                    jSONObject.put("liveHeatValue", j17);
                    jSONObject.put("enableShowHeat", ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).f410395p3 && ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).m7());
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    try {
                        if (m75945x2fec83072 != null) {
                            str2 = m75945x2fec83072;
                        }
                        jSONObject2 = new org.json.JSONObject(str2);
                    } catch (java.lang.Throwable unused) {
                    }
                    jSONObject2.put("init_data", jSONObject.toString());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "initLiteAppData " + jSONObject2);
                    java.lang.String jSONObject3 = jSONObject2.toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
                    bundle.putString("query", jSONObject3);
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).pk(view, bundle, true, false, this.f312059q, new df2.j(this));
                    tn0.w0 Q6 = Q6();
                    fo0.n O = Q6 != null ? Q6.O() : null;
                    if (O != null) {
                        fo0.q qVar = new fo0.q();
                        qVar.f346369a = this.f312058p;
                        qVar.f346371c = 0;
                        qVar.f346370b = new android.graphics.Point(500, 500);
                        qVar.f346372d = java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
                        O.f346359m = qVar;
                    }
                }
            }
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N6 = N6();
        Z6(N6 != null ? N6.getIntent() : null);
    }

    @Override // if2.e
    /* renamed from: onNewIntent */
    public void mo57867xc944513d(android.content.Intent intent) {
        Z6(intent);
    }

    @Override // if2.e
    /* renamed from: resume */
    public void mo57157xc84dc82d() {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N6 = N6();
        Z6(N6 != null ? N6.getIntent() : null);
    }
}
