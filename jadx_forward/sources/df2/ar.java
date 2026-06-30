package df2;

/* loaded from: classes3.dex */
public final class ar extends if2.b implements if2.e, mf2.a {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f311270m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f311271n;

    /* renamed from: o, reason: collision with root package name */
    public org.p3363xbe4143f1.C29690xfae77312 f311272o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.rfx.C20942x379cf5ee f311273p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f311274q;

    /* renamed from: r, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 f311275r;

    /* renamed from: s, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 f311276s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f311277t;

    /* renamed from: u, reason: collision with root package name */
    public int f311278u;

    /* renamed from: v, reason: collision with root package name */
    public r45.lv1 f311279v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.mc f311280w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f311270m = "LiveProductGiftBubbleController";
        this.f311271n = ae2.in.f85221a.a(ym5.f6.f544836c2);
        this.f311274q = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4("LiveProductGiftBubbleController::Timer", (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new df2.yq(this), true);
        this.f311275r = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(-1);
        this.f311276s = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z6(df2.ar r17, android.content.Context r18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r19) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.ar.Z6(df2.ar, android.content.Context, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void a7() {
        r45.uv1 uv1Var;
        r45.p42 p42Var;
        r45.uv1 uv1Var2;
        r45.p42 p42Var2;
        boolean e76 = e7(this.f311279v);
        java.lang.String str = this.f311270m;
        if (e76) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "followAttend failed, isAttend");
            return;
        }
        r45.lv1 lv1Var = this.f311279v;
        java.lang.Integer num = null;
        java.lang.String m75945x2fec8307 = lv1Var != null ? lv1Var.m75945x2fec8307(0) : null;
        if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "followAttend failed, activityId:" + m75945x2fec8307);
            return;
        }
        r45.lv1 lv1Var2 = this.f311279v;
        java.lang.Integer valueOf = (lv1Var2 == null || (uv1Var2 = (r45.uv1) lv1Var2.m75936x14adae67(1)) == null || (p42Var2 = (r45.p42) uv1Var2.m75936x14adae67(10)) == null) ? null : java.lang.Integer.valueOf(p42Var2.m75939xb282bd08(0));
        if ((valueOf != null && valueOf.intValue() == 4) || (valueOf != null && valueOf.intValue() == 6)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(this, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new df2.kq(this, m75945x2fec8307, null), 2, null);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("followAttend failed, attend_type:");
        r45.lv1 lv1Var3 = this.f311279v;
        if (lv1Var3 != null && (uv1Var = (r45.uv1) lv1Var3.m75936x14adae67(1)) != null && (p42Var = (r45.p42) uv1Var.m75936x14adae67(10)) != null) {
            num = java.lang.Integer.valueOf(p42Var.m75939xb282bd08(0));
        }
        sb6.append(num);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b b7() {
        android.view.View c76 = c7();
        if (c76 == null) {
            c76 = (android.view.ViewGroup) S6(com.p314xaae8f345.mm.R.id.tiq);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) (c76 != null ? c76.findViewById(com.p314xaae8f345.mm.R.id.f564586vc) : null);
        if (c22789xd23e9a9b == null) {
            return null;
        }
        ym5.l2 l2Var = ym5.l2.f544957a;
        ym5.j2[] j2VarArr = ym5.j2.f544925d;
        c22789xd23e9a9b.o(ae2.in.f85221a.a(ym5.f6.f544836c2));
        return c22789xd23e9a9b;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a c7() {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) S6(com.p314xaae8f345.mm.R.id.tiq);
        android.view.ViewParent parent = viewGroup != null ? viewGroup.getParent() : null;
        if (parent instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a) parent;
        }
        return null;
    }

    public final android.widget.TextView d7() {
        android.view.View c76 = c7();
        if (c76 == null) {
            c76 = (android.view.ViewGroup) S6(com.p314xaae8f345.mm.R.id.tiq);
        }
        return (android.widget.TextView) (c76 != null ? c76.findViewById(com.p314xaae8f345.mm.R.id.odf) : null);
    }

    public final boolean e7(r45.lv1 lv1Var) {
        boolean z17 = pm0.v.z(lv1Var != null ? lv1Var.m75939xb282bd08(7) : 0, 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f311270m, "isAttend:" + z17);
        return z17;
    }

    public final boolean f7() {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = this.f311276s;
        return ((java.lang.Number) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).mo144003x754a37bb()).intValue() == 1 || ((java.lang.Number) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).mo144003x754a37bb()).intValue() == 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if ((r0 != null && r0.m75939xb282bd08(6) == 3) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g7(boolean r6) {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onBubbleStatusChanged isNewBubble:"
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r5.f311270m
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            r45.lv1 r0 = r5.f311279v
            r2 = 1
            if (r0 == 0) goto L28
            r3 = 0
            if (r0 == 0) goto L25
            r4 = 6
            int r0 = r0.m75939xb282bd08(r4)
            r4 = 3
            if (r0 != r4) goto L25
            r0 = r2
            goto L26
        L25:
            r0 = r3
        L26:
            if (r0 == 0) goto L29
        L28:
            r3 = r2
        L29:
            if (r6 == 0) goto L42
            if (r3 != 0) goto L42
            com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout r6 = r5.c7()
            if (r6 == 0) goto L36
            r6.e()
        L36:
            com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout r6 = r5.c7()
            if (r6 == 0) goto L3f
            r6.d()
        L3f:
            r5.i7(r2)
        L42:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "onBubbleStatusChanged canHide:"
            r6.<init>(r0)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r6)
            if (r3 == 0) goto L5f
            com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout r6 = r5.c7()
            if (r6 == 0) goto L62
            r6.c()
            goto L62
        L5f:
            r5.h7()
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.ar.g7(boolean):void");
    }

    public final void h7() {
        android.widget.TextView d76;
        java.lang.String str = this.f311270m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "refreshViews");
        if (this.f311279v != null) {
            android.widget.TextView d77 = d7();
            java.lang.CharSequence text = d77 != null ? d77.getText() : null;
            if ((text == null || text.length() == 0) && (d76 = d7()) != null) {
                d76.setVisibility(8);
            }
            r45.lv1 lv1Var = this.f311279v;
            java.lang.Integer valueOf = lv1Var != null ? java.lang.Integer.valueOf(lv1Var.m75939xb282bd08(6)) : null;
            if (valueOf != null && valueOf.intValue() == 1) {
                r45.lv1 lv1Var2 = this.f311279v;
                if (lv1Var2 != null && lv1Var2.m75939xb282bd08(6) == 1) {
                    int min = java.lang.Math.min(lv1Var2.m75939xb282bd08(5), lv1Var2.m75939xb282bd08(3) - c01.id.e());
                    p3325xe03a0797.p3326xc267989b.p3328x30012e.h3 h3Var = (p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.f311275r;
                    int intValue = ((java.lang.Number) h3Var.mo144003x754a37bb()).intValue();
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f311274q;
                    if (intValue <= 0 || b4Var.e()) {
                        b4Var.d();
                        h3Var.k(java.lang.Integer.valueOf(min));
                        b4Var.c(1000L, 1000L);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "startCountDown remainTime:" + min);
                    } else {
                        h3Var.k(java.lang.Integer.valueOf(min));
                    }
                }
            } else if (valueOf != null && valueOf.intValue() == 2) {
                r45.lv1 lv1Var3 = this.f311279v;
                if (pm0.v.z(lv1Var3 != null ? lv1Var3.m75939xb282bd08(7) : 0, 16)) {
                    android.widget.TextView d78 = d7();
                    if (d78 != null) {
                        d78.setText(O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573089nq3));
                    }
                } else {
                    android.widget.TextView d79 = d7();
                    if (d79 != null) {
                        d79.setText(O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573088nq2));
                    }
                }
                android.widget.TextView d710 = d7();
                if (d710 != null) {
                    d710.setVisibility(0);
                }
            } else if (valueOf != null && valueOf.intValue() == 3) {
                android.widget.TextView d711 = d7();
                if (d711 != null) {
                    d711.setText(O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573089nq3));
                }
                android.widget.TextView d712 = d7();
                if (d712 != null) {
                    d712.setVisibility(0);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a c76 = c7();
            if (c76 != null) {
                c76.setOnClickListener(new df2.wq(this));
            }
        }
    }

    public final void i7(int i17) {
        java.lang.String str;
        java.lang.String m75945x2fec8307;
        if (zl2.r4.f555483a.w1()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f311270m, "report21084 type:" + i17 + ", but is anchor");
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        r45.lv1 lv1Var = this.f311279v;
        java.lang.String str2 = "";
        if (lv1Var == null || (str = lv1Var.m75945x2fec8307(0)) == null) {
            str = "";
        }
        jSONObject.put(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.WXWebPage.f32847x4430964b, str);
        r45.lv1 lv1Var2 = this.f311279v;
        if (lv1Var2 != null && (m75945x2fec8307 = lv1Var2.m75945x2fec8307(8)) != null) {
            str2 = m75945x2fec8307;
        }
        jSONObject.put("order_id", str2);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.L2, t17, 0L, null, null, null, null, null, 252, null);
    }

    public final void k7(boolean z17) {
        p3325xe03a0797.p3326xc267989b.r2 r2Var;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) S6(com.p314xaae8f345.mm.R.id.tnp);
        boolean z18 = frameLayout != null && frameLayout.getVisibility() == 0;
        java.lang.String str = this.f311270m;
        if (z18 && z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "showCard but cardContainer is visible");
            return;
        }
        android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) S6(com.p314xaae8f345.mm.R.id.tnp);
        r45.lv1 lv1Var = this.f311279v;
        if (frameLayout2 == null || lv1Var == null) {
            r2Var = null;
        } else {
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            r2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new df2.xq(lv1Var, z17, this, frameLayout2, null), 2, null);
        }
        if (r2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "showCard, cardContainer:" + ((android.widget.FrameLayout) S6(com.p314xaae8f345.mm.R.id.tnp)) + ", productGiftInfo:" + this.f311279v);
        }
    }

    public final void l7(r45.lv1 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        r45.lv1 lv1Var = this.f311279v;
        java.lang.String str = this.f311270m;
        boolean z17 = true;
        if (lv1Var != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(info.m75945x2fec8307(8), lv1Var.m75945x2fec8307(8))) {
            int m75939xb282bd08 = lv1Var.m75939xb282bd08(6);
            int m75939xb282bd082 = info.m75939xb282bd08(6);
            int m75939xb282bd083 = lv1Var.m75939xb282bd08(5);
            int m75939xb282bd084 = info.m75939xb282bd08(5);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "localStatus:" + m75939xb282bd08 + ", remoteStatus:" + m75939xb282bd082 + ", localRemainTime:" + m75939xb282bd083 + ", remoteRemainTime:" + m75939xb282bd084);
            if (m75939xb282bd082 != 1 || m75939xb282bd084 >= m75939xb282bd083) {
                if (m75939xb282bd082 == 1 && m75939xb282bd083 < m75939xb282bd084) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "remainTime RemoteItem:" + m75939xb282bd082 + " invalid");
                } else if ((m75939xb282bd082 == 1 && m75939xb282bd08 != 1) || (m75939xb282bd082 == 2 && m75939xb282bd08 == 3)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "status RemoteItem:" + m75939xb282bd082 + " invalid");
                }
                z17 = false;
            }
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "invalid remote info");
            return;
        }
        this.f311279v = info;
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new df2.zq(lv1Var, info, this, null), 2, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "gift info updated to " + info.mo12245xcc313de3());
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.f311276s).k(java.lang.Integer.valueOf(info.m75939xb282bd08(6)));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a c76 = c7();
        if (c76 != null) {
            c76.m56781xa1160b3b(new df2.rq(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a c77 = c7();
        if (c77 != null) {
            c77.b();
        }
        if (this.f311279v != null) {
            g7(true);
        }
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new df2.vq(this, null), 2, null);
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b b76 = b7();
        if (b76 != null) {
            b76.n();
        }
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) S6(com.p314xaae8f345.mm.R.id.tnp);
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) S6(com.p314xaae8f345.mm.R.id.tnp);
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
        this.f311280w = null;
    }
}
