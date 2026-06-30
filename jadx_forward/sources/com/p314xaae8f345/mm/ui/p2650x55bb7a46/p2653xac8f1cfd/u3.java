package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.t.class)
/* loaded from: classes10.dex */
public final class u3 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements sb5.t, xg3.h0 {

    /* renamed from: e, reason: collision with root package name */
    public boolean f281581e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f281582f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Long f281583g;

    /* renamed from: h, reason: collision with root package name */
    public c50.m0 f281584h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f281585i;

    /* renamed from: m, reason: collision with root package name */
    public org.json.JSONObject f281586m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f281587n = "";

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.Rect f281588o = new android.graphics.Rect();

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void E() {
        ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).n0(this, android.os.Looper.getMainLooper());
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg
    public void I() {
        super.I();
        if (gm0.j1.a()) {
            ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).za(this);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void J() {
        if (p0()) {
            o0(true);
            c50.m0 m0Var = this.f281584h;
            if (m0Var != null) {
                ((gp2.l0) m0Var).o();
            }
            this.f281585i = false;
            vd2.e2 e2Var = (vd2.e2) ((en0.e) i95.n0.c(en0.e.class));
            e2Var.f517241d = false;
            e2Var.f517245h.clear();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void K() {
        if (gm0.j1.a()) {
            ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).za(this);
        }
    }

    @Override // xg3.h0
    public void c0(xg3.m0 msgstg, xg3.l0 notifyInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgstg, "msgstg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(notifyInfo, "notifyInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChattingFinderLiveNotifyComponent", "[onNotifyChange]");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(notifyInfo.f535944b, "delete")) {
            java.util.ArrayList msgList = notifyInfo.f535945c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(msgList, "msgList");
            if (!msgList.isEmpty()) {
                java.util.Iterator it = msgList.iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next();
                    s40.y0 y0Var = (s40.y0) i95.n0.c(s40.y0.class);
                    long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.f5) y0Var).getClass();
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).Pj().y0(m124847x74d37ac6);
                }
            }
        }
    }

    @Override // yn.d
    public void j0(android.view.View view, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (p0() && i17 == 0) {
            ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.t3(this));
            m0("scrollIdle");
            n0("scrollIdle");
        }
    }

    public final void m0(java.lang.String str) {
        java.lang.String str2;
        boolean z17;
        java.lang.String str3;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.u3 u3Var = this;
        java.lang.String str4 = str;
        if (p0()) {
            java.lang.String str5 = "ChattingFinderLiveNotifyComponent";
            if (!u3Var.f281581e) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChattingFinderLiveNotifyComponent", "checkAutoPlay: pause, don't auto play, source=" + str4);
                return;
            }
            int m17 = u3Var.f280113d.m();
            int j17 = u3Var.f280113d.j() - m17;
            int o17 = u3Var.f280113d.o() - m17;
            if (j17 < 0 || j17 > o17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ChattingFinderLiveNotifyComponent", "checkAutoPlay: error, source=" + str4 + ", index start:%d,end:%d", java.lang.Integer.valueOf(j17), java.lang.Integer.valueOf(o17));
                return;
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = u3Var.f280113d.f542250l;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea = abstractC21611x7536149b instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea ? (com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea) abstractC21611x7536149b : null;
            if (c21628xcedb13ea == null) {
                return;
            }
            sb5.z zVar = c21628xcedb13ea.f279801s;
            p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.g0();
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
            f0Var.f391649d = -1;
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var3 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            if (j17 <= o17) {
                while (true) {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k kVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar;
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 mo75871xfb80e389 = kVar.mo75871xfb80e389(o17);
                    if (mo75871xfb80e389 != null && mo75871xfb80e389.mo78013xfb85f7b0() == 1075839025) {
                        android.view.View O0 = kVar.O0(mo75871xfb80e389.m124847x74d37ac6());
                        if (O0 == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str5, "checkAutoPlay: view is null, source=" + str4 + ", index=" + o17 + ", msgId=" + mo75871xfb80e389.m124847x74d37ac6());
                        } else {
                            android.view.View findViewById = O0.findViewById(com.p314xaae8f345.mm.R.id.icp);
                            if (findViewById != null) {
                                if (findViewById.getVisibility() == 8) {
                                    z17 = true;
                                } else if (findViewById.isShown()) {
                                    android.graphics.Rect rect = u3Var.f281588o;
                                    z17 = findViewById.getGlobalVisibleRect(rect) && rect.width() >= findViewById.getMeasuredWidth() && rect.height() >= findViewById.getMeasuredHeight();
                                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                                } else {
                                    z17 = false;
                                }
                                if (z17) {
                                    java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(mo75871xfb80e389.j(), "msg", null);
                                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.live_widget.status"), 0) == 1) {
                                        java.lang.String str7 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.live_widget.thumb_url");
                                        if (str7 == null) {
                                            str7 = "";
                                        }
                                        long Z = pm0.v.Z((java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.live_id"));
                                        str2 = str5;
                                        long Z2 = pm0.v.Z((java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.object_id"));
                                        java.lang.String str8 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.finder_username");
                                        if (str8 == null) {
                                            str8 = "";
                                        }
                                        java.lang.String str9 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.object_nonce_id");
                                        if (str9 == null) {
                                            str9 = "";
                                        }
                                        int i17 = o17;
                                        java.lang.String str10 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.tips_id");
                                        if (str10 == null) {
                                            str10 = "";
                                        }
                                        java.lang.String str11 = str10;
                                        java.lang.String str12 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.notice_id");
                                        if (str12 == null) {
                                            str12 = "";
                                        }
                                        java.lang.String str13 = str12;
                                        java.lang.String str14 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.report_ext_info");
                                        if (str14 == null) {
                                            str14 = "";
                                        }
                                        java.lang.String str15 = str14;
                                        java.lang.String str16 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.title.nickname");
                                        if (str16 == null) {
                                            str16 = "";
                                        }
                                        g0Var.f391654d = Z;
                                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725();
                                        h0Var2.f391656d = c19792x256d2725;
                                        c19792x256d2725.m76877x684351d(Z2);
                                        ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) h0Var2.f391656d).m76896xfefec3e9(str9);
                                        ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) h0Var2.f391656d).m76929x66bc2758(str8);
                                        ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) h0Var2.f391656d).m76894x7ac946f0(str16);
                                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) h0Var2.f391656d;
                                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 c19793xceab7f56 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56();
                                        c19793xceab7f56.m77002xdb5612fc(9);
                                        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e = c19793xceab7f56.m76962x74cd162e();
                                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e();
                                        c19788xd7cfd73e.m76666xdb5612fc(9);
                                        c19788xd7cfd73e.m76676xd3f7e23b(str7);
                                        m76962x74cd162e.add(c19788xd7cfd73e);
                                        c19792x256d27252.m76895x5bf46472(c19793xceab7f56);
                                        h0Var3.f391656d = mo75871xfb80e389;
                                        h0Var.f391656d = findViewById;
                                        f0Var.f391649d = i17;
                                        u3Var = this;
                                        u3Var.f281587n = str13;
                                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                                        jSONObject.put("msgid", str11);
                                        jSONObject.put("type", str13.length() == 0 ? 2L : 1L);
                                        byte[] bArr = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.f5) ((s40.y0) i95.n0.c(s40.y0.class))).wi(mo75871xfb80e389.m124847x74d37ac6()).f68155xb4c686ce;
                                        if (bArr != null) {
                                            java.lang.String str17 = new java.lang.String(bArr, r26.c.f450398a);
                                            if (!(str17.length() > 0)) {
                                                str17 = null;
                                            }
                                            if (str17 != null) {
                                                str3 = str17;
                                                jSONObject.put("reportcontent", str3);
                                                u3Var.f281586m = jSONObject;
                                            }
                                        }
                                        str3 = str15;
                                        jSONObject.put("reportcontent", str3);
                                        u3Var.f281586m = jSONObject;
                                    }
                                }
                            }
                        }
                    }
                    str2 = str5;
                    if (o17 == j17) {
                        break;
                    }
                    o17--;
                    str4 = str;
                    str5 = str2;
                }
            } else {
                str2 = "ChattingFinderLiveNotifyComponent";
            }
            if (g0Var.f391654d == 0 || h0Var.f391656d == null || h0Var2.f391656d == null || h0Var3.f391656d == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "checkAutoPlay: source=" + str + ", 0 view need to auto play");
                u3Var.o0(true);
                return;
            }
            r45.l71 Hj = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Hj(g0Var.f391654d);
            r45.nw1 nw1Var = Hj != null ? (r45.nw1) Hj.m75936x14adae67(1) : null;
            u3Var.f281583g = java.lang.Long.valueOf(g0Var.f391654d);
            if (nw1Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "checkAutoPlay: live info is null, source=" + str + ", autoPlayIndex=" + f0Var.f391649d + ", autoPlayLiveId=" + g0Var.f391654d);
                return;
            }
            java.lang.String str18 = str2;
            if (nw1Var.m75939xb282bd08(2) != 1) {
                u3Var.f281583g = null;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str18, "checkAutoPlay: live is end, source=" + str + ", autoPlayIndex=" + f0Var.f391649d + ", autoPlayLiveId=" + g0Var.f391654d);
                return;
            }
            s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
            long m75942xfb822ef2 = nw1Var.m75942xfb822ef2(0);
            qs5.d dVar = qs5.d.f447959e;
            java.lang.Integer Uj = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) w0Var).Uj(m75942xfb822ef2, 5);
            if (Uj == null || (Uj.intValue() & 1) == 0) {
                if (Uj == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str18, "checkAutoPlay: flag is null wait cgi back, source=" + str + ", autoPlayIndex=" + f0Var.f391649d + ", autoPlayLiveId=" + g0Var.f391654d);
                    return;
                }
                u3Var.o0(true);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str18, "checkAutoPlay: server ban auto play, source=" + str + ", auto_play_control_flag=" + Uj + ", autoPlayIndex=" + f0Var.f391649d + ", autoPlayLiveId=" + g0Var.f391654d);
                return;
            }
            if (u3Var.f281584h == null) {
                c50.q0 q0Var = (c50.q0) i95.n0.c(c50.q0.class);
                android.app.Activity g17 = u3Var.f280113d.g();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(g17, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                c50.m0 Ai = ((v40.q) q0Var).Ai((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) g17);
                u3Var.f281584h = Ai;
                ((gp2.l0) Ai).f(c50.a.f120121g, 16);
            }
            if (!u3Var.f281585i) {
                u3Var.f281585i = true;
                c50.m0 m0Var = u3Var.f281584h;
                if (m0Var != null) {
                    ((gp2.l0) m0Var).e(null);
                }
            }
            ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) h0Var2.f391656d).m76887xcb0dd23c(nw1Var);
            c50.m0 m0Var2 = u3Var.f281584h;
            boolean C = m0Var2 != null ? ((gp2.l0) m0Var2).C(str18, nw1Var.m75942xfb822ef2(0)) : false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str18, "checkAutoPlay: start play live, source=" + str + ", isPlaying=" + C + ", autoPlayLiveId=" + nw1Var.m75942xfb822ef2(0) + ", autoPlayIndex=" + f0Var.f391649d + ", feedId=" + pm0.v.u(((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) h0Var2.f391656d).m76784x5db1b11()));
            if (C) {
                return;
            }
            u3Var.o0(false);
            c50.m0 m0Var3 = u3Var.f281584h;
            if (m0Var3 != null) {
                ((gp2.l0) m0Var3).F((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) h0Var2.f391656d, (android.view.View) h0Var.f391656d, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.l3(g0Var, h0Var2, h0Var, u3Var), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.n3(nw1Var, f0Var, h0Var2, this, h0Var3), null, true);
            }
        }
    }

    public final void n0(java.lang.String str) {
        if (p0()) {
            int m17 = this.f280113d.m();
            int j17 = this.f280113d.j() - m17;
            int o17 = this.f280113d.o() - m17;
            if (j17 < 0 || j17 > o17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ChattingFinderLiveNotifyComponent", "checkGetMoreLive: error, source=" + str + ", index start:%d,end:%d", java.lang.Integer.valueOf(j17), java.lang.Integer.valueOf(o17));
                return;
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = this.f280113d.f542250l;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea = abstractC21611x7536149b instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea ? (com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea) abstractC21611x7536149b : null;
            if (c21628xcedb13ea == null) {
                return;
            }
            sb5.z zVar = c21628xcedb13ea.f279801s;
            java.util.ArrayList<com.p314xaae8f345.mm.p2621x8fb0427b.f9> arrayList = new java.util.ArrayList();
            if (j17 <= o17) {
                while (true) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 mo75871xfb80e389 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar).mo75871xfb80e389(o17);
                    if (mo75871xfb80e389 != null && mo75871xfb80e389.mo78013xfb85f7b0() == 1075839025) {
                        arrayList.add(mo75871xfb80e389);
                    }
                    if (o17 == j17) {
                        break;
                    } else {
                        o17--;
                    }
                }
            }
            vd2.e2 e2Var = (vd2.e2) ((en0.e) i95.n0.c(en0.e.class));
            e2Var.getClass();
            if (arrayList.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNotifyGetMoreLiveService", "notifyVisibleMsgInfo: ");
                return;
            }
            java.util.ArrayList arrayList2 = e2Var.f517244g;
            arrayList2.clear();
            for (com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var : arrayList) {
                java.lang.String str2 = (java.lang.String) com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(f9Var.j(), "msg", null).get(".msg.appmsg.extinfo.notifymsg.tipsinfo.object_id");
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (str2 == null) {
                    str2 = "";
                }
                long Z = pm0.v.Z(str2);
                if (Z != 0) {
                    arrayList2.add(java.lang.Long.valueOf(Z));
                    e2Var.f517245h.put(java.lang.Long.valueOf(Z), f9Var);
                }
            }
            e2Var.Ai("notifyVisibleMsgInfo");
        }
    }

    public final void o0(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChattingFinderLiveNotifyComponent", "clearAllPlayer: isClearAll=" + z17);
        c50.m0 m0Var = this.f281584h;
        if (m0Var != null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.o3 o3Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.o3(this);
            gp2.l0 l0Var = (gp2.l0) m0Var;
            l0Var.m();
            l0Var.M(o3Var);
        }
        if (z17) {
            this.f281583g = null;
        }
    }

    public final boolean p0() {
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b("notifymessage", this.f280113d.u().d1());
    }

    public void q0(hd5.n action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        if (p0() && this.f281582f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChattingFinderLiveNotifyComponent", "onDataSetChangeFinish: action=" + action);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3 p17 = this.f280113d.p();
            if (p17 != null) {
                pm0.v.b(p17.f(), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.s3(this));
                this.f281582f = false;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void x() {
        this.f281581e = true;
        if (p0()) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
            vd2.j2.f517312h = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q3(this);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
            vd2.j2.f517310f = true;
            ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.t3(this));
            n0("onResume");
            pm0.v.V(0L, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.r3(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void y() {
        this.f281581e = false;
        if (p0()) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
            vd2.j2 j2Var = vd2.j2.f517305a;
            vd2.j2.f517312h = null;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
            vd2.j2.f517310f = false;
            vd2.j2.f517313i.mo50303x856b99f0(vd2.j2.f517308d);
            o0(true);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void z() {
        if (p0()) {
            vd2.e2 e2Var = (vd2.e2) ((en0.e) i95.n0.c(en0.e.class));
            e2Var.f517241d = true;
            e2Var.f517242e = e2Var.f517243f;
        }
    }
}
