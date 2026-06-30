package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.l2.class)
/* loaded from: classes5.dex */
public class ym extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements sb5.l2 {

    /* renamed from: u, reason: collision with root package name */
    public static final java.util.HashMap f281865u = new java.util.HashMap();

    /* renamed from: v, reason: collision with root package name */
    public static final java.util.HashMap f281866v = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public boolean f281871i;

    /* renamed from: m, reason: collision with root package name */
    public int f281872m;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f281875p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f281876q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.regex.Pattern f281877r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.regex.Pattern f281878s;

    /* renamed from: t, reason: collision with root package name */
    public int f281879t;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.i6 f281867e = new com.p314xaae8f345.mm.sdk.p2603x2137b148.i6(5, "msg-translate-update-worker", 1);

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f281868f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public int f281869g = -1;

    /* renamed from: h, reason: collision with root package name */
    public boolean f281870h = false;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10687xa533b04c f281873n = null;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f281874o = "";

    public ym() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f281875p = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.C21675xd279843d(this, a0Var);
        this.f281876q = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5234x14788364>(a0Var) { // from class: com.tencent.mm.ui.chatting.component.TranslateComponent$3
            {
                this.f39173x3fe91575 = -348375692;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5234x14788364 c5234x14788364) {
                int D1;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5234x14788364 c5234x147883642 = c5234x14788364;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ym ymVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ym.this;
                com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10687xa533b04c c10687xa533b04c = ymVar.f281873n;
                java.lang.String str = c10687xa533b04c == null ? null : c10687xa533b04c.f149355e;
                if (c10687xa533b04c == null) {
                    D1 = -1;
                } else {
                    java.util.Map map = c10687xa533b04c.f149356f;
                    D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(map == null ? null : (java.lang.String) map.get("TranslateComponent.SettingsRequestExtKey.MsgPosition"), 0);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingUI.TranslateComponent", "changeTransLangListener, eventSessionId: " + c5234x147883642.f135568g.f90035a + ", requestMsgId: " + str + ", requestMsgPosition: " + D1);
                if (str != null && android.text.TextUtils.equals(str, c5234x147883642.f135568g.f90035a)) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(ymVar.f281874o, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(str));
                    qn4.y.e(Li.m124847x74d37ac6(), 4);
                    ymVar.f281873n = null;
                    ymVar.f281874o = "";
                    ymVar.A0(Li, D1);
                }
                return false;
            }
        };
        this.f281877r = java.util.regex.Pattern.compile("[a-zA-z]");
        this.f281878s = java.util.regex.Pattern.compile("[一-龥]");
        this.f281879t = -1;
    }

    public final void A0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io v07 = v0(f9Var);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io ioVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io.Transforming;
        if (v07 == ioVar) {
            return;
        }
        boolean k27 = f9Var.k2();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6175x4c627f21 c6175x4c627f21 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6175x4c627f21();
        am.hz hzVar = c6175x4c627f21.f136435g;
        hzVar.getClass();
        hzVar.f88413c = "" + f9Var.m124847x74d37ac6();
        hzVar.f88411a = r0(f9Var);
        hzVar.f88412b = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.c(this.f280113d.g());
        if (this.f280113d.D()) {
            if (n0(f9Var.m124847x74d37ac6())) {
                hzVar.f88415e = 4;
            } else {
                hzVar.f88415e = 118;
            }
        } else if (n0(f9Var.m124847x74d37ac6())) {
            hzVar.f88415e = 1;
        } else {
            hzVar.f88415e = 117;
        }
        if (!this.f280113d.D() || f9Var.A0() == 1) {
            hzVar.f88414d = 0;
        } else if (k27) {
            hzVar.f88414d = 0;
        } else {
            hzVar.f88414d = 1;
        }
        hzVar.f88416f = f9Var.Q0();
        c6175x4c627f21.e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.TranslateComponent", "showTranslateFromRequest, msgId: " + f9Var.m124847x74d37ac6() + ", targetIso: " + hzVar.f88412b + ", source: " + hzVar.f88416f + ", talker: " + this.f280113d.x());
        m0(f9Var.m124847x74d37ac6(), ioVar);
        this.f281869g = i17;
        this.f280113d.J();
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg
    public void I() {
        super.I();
        this.f281875p.mo48814x2efc64();
        this.f281876q.mo48814x2efc64();
        go.d dVar = go.d.f355229a;
        go.d.f355234f = go.c.f355228d;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void K() {
        this.f281875p.mo48814x2efc64();
        this.f281876q.mo48814x2efc64();
        go.d dVar = go.d.f355229a;
        go.d.f355234f = go.c.f355228d;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void a() {
        this.f281868f.clear();
        this.f281875p.mo48813x58998cd();
        this.f281876q.mo48813x58998cd();
        go.d.f355234f = new yz5.l() { // from class: com.tencent.mm.ui.chatting.component.ym$$a
            @Override // yz5.l
            /* renamed from: invoke */
            public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) obj;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ym ymVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ym.this;
                int R0 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) ymVar.f280113d.f542241c.a(sb5.z.class))).R0(f9Var);
                if (f9Var.b2()) {
                    return null;
                }
                ymVar.p0(f9Var, R0, false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.TranslateComponent", "registerListener autoTransFlag MsgId: %s", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ym.f281865u.put(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), java.lang.Boolean.TRUE);
                return null;
            }
        };
    }

    @Override // yn.d
    public void i0(android.view.View view, int i17, int i18, int i19, int i27) {
        if (i17 < this.f281879t) {
            this.f281870h = false;
        }
        this.f281879t = i17;
    }

    public void m0(long j17, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io ioVar) {
        this.f281868f.put(java.lang.Long.valueOf(j17), ioVar);
    }

    public boolean n0(long j17) {
        java.util.HashMap hashMap = f281866v;
        if (hashMap.get(java.lang.Long.valueOf(j17)) == null) {
            return false;
        }
        return ((java.lang.Boolean) hashMap.get(java.lang.Long.valueOf(j17))).booleanValue();
    }

    public boolean o0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var == null) {
            return false;
        }
        db5.t7.m(this.f280113d.g(), this.f280113d.g().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b6d));
        r45.aq6 aq6Var = new r45.aq6();
        aq6Var.f451740d = u0(r0(f9Var));
        aq6Var.f451741e = u0(f9Var.W0());
        aq6Var.f451742f = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(this.f280113d.g());
        aq6Var.b().l().h(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.dn(this));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r8, int r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ym.p0(com.tencent.mm.storage.f9, int, boolean):void");
    }

    public java.lang.String q0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, boolean z17) {
        if (z17) {
            java.lang.String W0 = f9Var.W0();
            return (this.f280113d.C() && W0 != null && f9Var.A0() == 0) ? c01.w9.u(W0) : W0;
        }
        java.lang.String j17 = f9Var.j();
        return (this.f280113d.C() && j17 != null && f9Var.A0() == 0) ? c01.w9.u(j17) : j17;
    }

    public final java.lang.String r0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var.k2()) {
            ot0.q v17 = ot0.q.v(f9Var.U1());
            if (v17 != null) {
                return v17.n();
            }
            return null;
        }
        if (!f9Var.g3()) {
            return f9Var.j();
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.kb y07 = w21.p0.Ai().y0(f9Var.z0());
        if (y07 != null) {
            return y07.f68624xad49e234;
        }
        return null;
    }

    public final void s0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        qn4.y.d(4);
        if (f9Var.i2()) {
            f9Var.l1(f9Var.F & (-17));
        }
        m0(f9Var.m124847x74d37ac6(), com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io.NoTransform);
        ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).getClass();
        com.p314xaae8f345.mm.p959x883644fd.e.f153038a.getClass();
        ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).lb(f9Var.m124847x74d37ac6(), f9Var, true);
        this.f281869g = -1;
        this.f280113d.J();
    }

    public boolean t0(android.view.MenuItem menuItem, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        int i17;
        int itemId = menuItem.getItemId();
        int groupId = menuItem.getGroupId();
        long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
        if (itemId != 124 && itemId != 125 && itemId != 163) {
            if (itemId != 164) {
                return false;
            }
            wd0.k2 k2Var = f9Var.H2() ? f9Var.b2() ? wd0.k2.CHAT_MSG_SOLITAIRE_TRANSLATE_RESULT : wd0.k2.CHAT_MSG_SOLITAIRE : f9Var.T2() ? f9Var.b2() ? wd0.k2.CHAT_MSG_QUOTE_TRANSLATE_RESULT : wd0.k2.CHAT_MSG_QUOTE : f9Var.b2() ? wd0.k2.CHAT_MSG_DEFAULT_TRANSLATE_RESULT : wd0.k2.CHAT_MSG_DEFAULT;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.TranslateComponent", "longclick to change translate language, messageType: " + f9Var.mo78013xfb85f7b0() + ", msgId: " + m124847x74d37ac6 + ", msgPosition: " + groupId + ", entrance: " + k2Var);
            com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10687xa533b04c c10687xa533b04c = new com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10687xa533b04c();
            c10687xa533b04c.f149354d = k2Var;
            c10687xa533b04c.f149355e = java.lang.String.valueOf(m124847x74d37ac6);
            c10687xa533b04c.b("TranslateComponent.SettingsRequestExtKey.MsgPosition", java.lang.String.valueOf(groupId));
            c10687xa533b04c.f149357g = 3;
            this.f281873n = c10687xa533b04c.m45295x5a5dd5d();
            this.f281874o = f9Var.Q0();
            ((vd0.o3) ((wd0.z1) i95.n0.c(wd0.z1.class))).fj(this.f280113d.g(), c10687xa533b04c);
            return true;
        }
        f9Var.b2();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm.f281779q = m124847x74d37ac6;
        java.util.HashMap hashMap = f281866v;
        java.lang.Long valueOf = java.lang.Long.valueOf(m124847x74d37ac6);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        hashMap.put(valueOf, bool);
        java.util.HashMap hashMap2 = f281865u;
        java.lang.Long valueOf2 = java.lang.Long.valueOf(m124847x74d37ac6);
        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
        hashMap2.put(valueOf2, bool2);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.f9 f9Var2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.ContextTranslate;
        if (itemId != 124 || ((java.lang.Boolean) c01.d9.b().p().l(327712, bool2)).booleanValue()) {
            if (itemId != 125 || ((java.lang.Boolean) c01.d9.b().p().l(327713, bool2)).booleanValue()) {
                i17 = 0;
            } else {
                if (!f9Var2.k(this.f280113d.g(), null)) {
                    return true;
                }
                c01.d9.b().p().w(327713, bool);
                i17 = com.p314xaae8f345.mm.R.C30867xcad56011.b5j;
            }
        } else {
            if (!f9Var2.k(this.f280113d.g(), null)) {
                return true;
            }
            c01.d9.b().p().w(327712, bool);
            i17 = com.p314xaae8f345.mm.R.C30867xcad56011.b6l;
        }
        if (i17 != 0) {
            android.app.Activity mo7438x76847179 = this.f280113d.f542250l.mo7438x76847179();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
            aVar.f293262s = this.f280113d.s().getString(i17);
            aVar.f293242a = this.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b6m);
            aVar.f293265v = of5.b.a(mo7438x76847179).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573827fz1);
            aVar.E = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.cn(this, m124847x74d37ac6, f9Var, groupId, itemId);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(mo7438x76847179, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
            j0Var.e(aVar);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
            if (d0Var != null) {
                d0Var.a(j0Var.f293370r);
            }
            j0Var.show();
        } else {
            this.f281870h = true;
            this.f281871i = false;
            this.f281872m = 0;
            go.d.f355229a.b(itemId == 163, m124847x74d37ac6);
            p0(f9Var, groupId, itemId == 125);
        }
        return true;
    }

    public final java.lang.String u0(java.lang.String str) {
        int t17;
        return (!this.f280113d.D() || ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) this.f280113d.f542241c.a(sb5.f.class))).f280286r || (t17 = c01.w9.t(str)) == -1) ? str : str.substring(t17 + 1).trim();
    }

    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io v0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io ioVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io) this.f281868f.get(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
        if (ioVar != null) {
            return ioVar;
        }
        boolean i27 = f9Var.i2();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io ioVar2 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io.NoTransform;
        if (!i27) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6177xe7ab44f9 c6177xe7ab44f9 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6177xe7ab44f9();
            c6177xe7ab44f9.f136436g.f88518a = "" + f9Var.m124847x74d37ac6();
            c6177xe7ab44f9.e();
            if (c6177xe7ab44f9.f136437h.f88640a) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io ioVar3 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io.Transforming;
                m0(f9Var.m124847x74d37ac6(), ioVar3);
                return ioVar3;
            }
        } else if (f9Var.b2()) {
            return com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io.Transformed;
        }
        return ioVar2;
    }

    public final int w0(int i17) {
        sb5.z zVar = (sb5.z) this.f280113d.f542241c.a(sb5.z.class);
        int i18 = 0;
        while (i18 <= 20) {
            if (!y0(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar).mo75871xfb80e389(i17 + i18 + 1))) {
                break;
            }
            i18++;
        }
        return i18;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void x() {
        this.f281873n = null;
        this.f281874o = "";
    }

    public final void x0(int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(19168, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17 + i19));
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void y() {
        this.f281871i = true;
        int i17 = this.f281869g;
        if (i17 >= 0) {
            x0(this.f281872m, 1, w0(i17));
        }
    }

    public final boolean y0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var == null) {
            return false;
        }
        if ((!f9Var.b3() && !f9Var.T2()) || f9Var.i2() || f9Var.A0() != 0) {
            return false;
        }
        java.lang.String j17 = f9Var.j();
        int indexOf = j17.indexOf(58);
        if (indexOf != -1) {
            j17 = j17.substring(indexOf + 1);
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.j() ? this.f281877r.matcher(j17).find() : this.f281878s.matcher(j17).find();
    }
}
