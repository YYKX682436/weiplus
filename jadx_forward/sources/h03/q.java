package h03;

/* loaded from: classes2.dex */
public final class q implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24452xb1d7a30b, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.ActivityResultListener, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f359443d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Integer f359444e;

    /* renamed from: f, reason: collision with root package name */
    public android.app.Activity f359445f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.C24495xd6bee5f4 f359446g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.p1708xc5476f33.C15548x740e1db6 f359447h;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.flutter.plugin.LVFinderPlugin$contactChangedListener$1] */
    public q() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f359447h = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5436xd7d34ee8>(a0Var) { // from class: com.tencent.mm.plugin.flutter.plugin.LVFinderPlugin$contactChangedListener$1
            {
                this.f39173x3fe91575 = 797560056;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5436xd7d34ee8 c5436xd7d34ee8) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5436xd7d34ee8 event = c5436xd7d34ee8;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                pm0.v.X(new h03.d(h03.q.this, event));
                return false;
            }
        };
    }

    public static final void a(h03.q qVar, so2.u1 u1Var, int i17) {
        fc2.q f76;
        fc2.q f77;
        fc2.q f78;
        android.app.Activity activity = qVar.f359445f;
        if (activity == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LVFinderPlugin", "markReportStart context is null");
            qVar.f359443d = u1Var.getFeedObject().getFeedObject();
            qVar.f359444e = java.lang.Integer.valueOf(i17);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LVFinderPlugin", "markReportStart");
        qVar.b(u1Var.getFeedObject(), i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e17 = iyVar.e(activity);
        if (e17 != null && (f78 = e17.f7()) != null) {
            fc2.s sVar = new fc2.s(2);
            sVar.f342514e = u1Var;
            f78.f342509d = u1Var;
            sVar.f342517h = f78.f342507b;
            sVar.f342515f = u1Var.mo2128x1ed62e84();
            sVar.f342516g = u1Var.w();
            f78.f342507b = u1Var.mo2128x1ed62e84();
            f78.a(sVar);
        }
        ec2.f fVar = new ec2.f(4);
        fVar.f332498j = u1Var.mo2128x1ed62e84();
        fVar.f332499k = u1Var.w();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e18 = iyVar.e(activity);
        if (e18 != null && (f77 = e18.f7()) != null) {
            f77.a(fVar);
        }
        ec2.f fVar2 = new ec2.f(1);
        fVar2.f332498j = u1Var.mo2128x1ed62e84();
        fVar2.f332499k = u1Var.w();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e19 = iyVar.e(activity);
        if (e19 == null || (f76 = e19.f7()) == null) {
            return;
        }
        f76.a(fVar2);
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderItem, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderItem, "finderItem");
        bu2.j.f106067a.n(finderItem, new bu2.h(7017, 0L));
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17).rk(finderItem.getFeedObject(), i17, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24452xb1d7a30b
    /* renamed from: bulletCommentFontSize */
    public long mo90835xb083930d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209205e5).mo141623x754a37bb()).r()).intValue();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24452xb1d7a30b
    /* renamed from: bulletCommentPortraitNumberOfLines */
    public long mo90836xe0d41507() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209224f5).mo141623x754a37bb()).r()).intValue();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24452xb1d7a30b
    /* renamed from: bulletCommentShowDuration */
    public double mo90837x2904db4e() {
        return 7.5d;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24452xb1d7a30b
    /* renamed from: bulletCommentStrokeColorAlpha */
    public double mo90838xa26f2930() {
        int intValue = ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.R().r()).intValue();
        if (intValue == 1) {
            return 0.3d;
        }
        if (intValue != 2) {
            return intValue != 3 ? 0.6d : 0.5d;
        }
        return 0.4d;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24452xb1d7a30b
    /* renamed from: bulletCommentStrokeWidth */
    public double mo90839xab05e731() {
        return 9.0d;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24452xb1d7a30b
    /* renamed from: enableAirPlayVideo */
    public boolean mo90840x4db440a0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.N2).mo141623x754a37bb()).r()).intValue() != 0;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24452xb1d7a30b
    /* renamed from: enableShowBulletComment */
    public boolean mo90841xa34723bd(com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.C24451x12373195 feed, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 a17 = c03.i.a(feed);
        if (a17 != null) {
            return new so2.u1(a17).g2();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LVFinderPlugin", "enableShowBulletComment finderItem is null");
        return false;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24452xb1d7a30b
    /* renamed from: feedSetToSNSCoverSwitch */
    public boolean mo90842x98435a92() {
        return ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).wi();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24452xb1d7a30b
    /* renamed from: followFinderAccout */
    public void mo90843x39889944(com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.C24451x12373195 feed, boolean z17, long j17) {
        int i17;
        org.json.JSONObject jSONObject;
        org.json.JSONObject jSONObject2;
        java.lang.String str;
        java.lang.String str2;
        r45.fl2 fl2Var;
        java.lang.String X6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        android.app.Activity activity = this.f359445f;
        if (activity != null) {
            so2.u1 d17 = c03.i.d(feed);
            if (d17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LVFinderPlugin", "shareFeed feed to finderItem is null");
                return;
            }
            pf5.z zVar = pf5.z.f435481a;
            if (!(activity instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
            ya2.b2 contact = d17.getContact();
            if (contact != null) {
                java.lang.String D0 = contact.D0();
                if (z17) {
                    java.lang.String mk6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).mk(activity, d17.mo2128x1ed62e84(), d17.w());
                    if (mk6 == null || mk6.length() == 0) {
                        jSONObject2 = new org.json.JSONObject();
                    } else {
                        try {
                            jSONObject = new org.json.JSONObject(mk6);
                        } catch (org.json.JSONException unused) {
                            jSONObject = new org.json.JSONObject();
                        }
                        jSONObject2 = jSONObject;
                    }
                    r45.xk m59211x37f6d02b = d17.getFeedObject().m59211x37f6d02b();
                    if (m59211x37f6d02b == null || (str = m59211x37f6d02b.m75945x2fec8307(0)) == null) {
                        str = "";
                    }
                    jSONObject2.put("biz_username", str);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = activity instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
                    if (nyVar != null && (X6 = nyVar.X6()) != null) {
                        java.lang.String t17 = r26.i0.t(X6, ";", ",", false);
                        if (t17.length() > 0) {
                            org.json.JSONObject jSONObject3 = new org.json.JSONObject(t17);
                            if (jSONObject3.has("tag_name")) {
                                jSONObject2.put("tag_name", jSONObject3.get("tag_name"));
                            }
                            if (jSONObject3.has("tips_uuid")) {
                                jSONObject2.put("tips_uuid", jSONObject3.get("tips_uuid"));
                            }
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.e6 aj6 = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).aj(d17.mo2128x1ed62e84(), d17.w(), (int) j17);
                    if (aj6 == null || (fl2Var = aj6.f206545a) == null || (str2 = fl2Var.m75945x2fec8307(1)) == null) {
                        str2 = "";
                    }
                    i17 = 0;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.f206502a.b(V6, "follow", false, d17.mo2128x1ed62e84(), jSONObject2, str2);
                } else {
                    i17 = 0;
                }
                nv2.d0 d0Var = nv2.d0.f422003e;
                nv2.d0.f422003e.a(D0, z17 ? 1 : 2, d17.mo2128x1ed62e84(), d17.w(), V6, false, (i27 & 64) != 0 ? 0 : 0, (i27 & 128) != 0 ? "" : null, (i27 & 256) != 0 ? null : null, (i27 & 512) != 0 ? 0 : 24, (i27 & 1024) != 0 ? null : null, (i27 & 2048) != 0 ? null : null, (i27 & 4096) != 0 ? 0 : 0, (i27 & 8192) != 0 ? new r45.p31() : null, (i27 & 16384) != 0 ? "" : null, (i27 & 32768) != 0 ? "" : null);
                ya2.g gVar = ya2.h.f542017a;
                l75.e0 e0Var = ya2.b2.O2;
                gVar.i(D0, z17 ? ya2.b2.Q2 : i17);
                com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.C24495xd6bee5f4 c24495xd6bee5f4 = this.f359446g;
                if (c24495xd6bee5f4 != null) {
                    c24495xd6bee5f4.m90886x84be49d2(D0, z17, h03.e.f359410d);
                }
            }
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24452xb1d7a30b
    /* renamed from: getFinderContactInfo */
    public void mo90844xbf433032(java.lang.String username, yz5.l callback) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa Rj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Rj(username);
        if (Rj == null || (str = Rj.m76175x6d346f39()) == null) {
            str = "";
        }
        java.lang.String str2 = str;
        java.lang.String m76184x8010e5e4 = Rj != null ? Rj.m76184x8010e5e4() : null;
        boolean z17 = false;
        if (Rj != null) {
            int m76170x756826b3 = Rj.m76170x756826b3();
            l75.e0 e0Var = ya2.b2.O2;
            if (m76170x756826b3 == ya2.b2.Q2) {
                z17 = true;
            }
        }
        callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.C24450xc60f48d7(username, str2, m76184x8010e5e4, java.lang.Boolean.valueOf(z17), Rj != null ? java.lang.Long.valueOf(Rj.m76170x756826b3()) : null))));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24452xb1d7a30b
    /* renamed from: getFinderIdentityType */
    public long mo90845xd6fe0a54() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.u2();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24452xb1d7a30b
    /* renamed from: getGlobalPlayProgressesOfTids */
    public java.util.List mo90846xcef68f43(java.util.List tids) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tids, "tids");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(tids, 10));
        java.util.Iterator it = tids.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Double.valueOf(cu2.x.f303982a.e("", "", pm0.v.Z((java.lang.String) it.next()))));
        }
        return arrayList;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24452xb1d7a30b
    /* renamed from: getSelfFinderContact */
    public void mo90847x98da1078(yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        android.content.Context context = this.f359445f;
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        java.lang.String e17 = context != null ? xy2.c.e(context) : null;
        ya2.b2 b17 = e17 == null || r26.n0.N(e17) ? null : ya2.h.f542017a.b(e17);
        if (b17 == null) {
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null)));
            return;
        }
        java.lang.String D0 = b17.D0();
        java.lang.String m176700xe5e0d2a0 = b17.m176700xe5e0d2a0();
        java.lang.String w07 = b17.w0();
        int i17 = b17.f69313xcad4ef95;
        l75.e0 e0Var = ya2.b2.O2;
        callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.C24450xc60f48d7(D0, m176700xe5e0d2a0, w07, java.lang.Boolean.valueOf(i17 == ya2.b2.Q2), java.lang.Long.valueOf(b17.f69313xcad4ef95)))));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24452xb1d7a30b
    /* renamed from: getSelfWeChatContact */
    public void mo90848x9e334558(yz5.l callback) {
        com.p314xaae8f345.mm.p943x351df9c2.s0 Ni;
        com.p314xaae8f345.mm.p943x351df9c2.r0 n07;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.lang.String r17 = c01.z1.r();
        if (r17 == null || r17.length() == 0) {
            return;
        }
        java.lang.String d17 = (((kv.a0) i95.n0.c(kv.a0.class)) == null || (Ni = com.p314xaae8f345.mm.p943x351df9c2.d1.Ni()) == null || (n07 = Ni.n0(r17)) == null) ? null : n07.d();
        if (d17 == null) {
            d17 = "";
        }
        callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.C24450xc60f48d7(r17, d17, c01.z1.l(), null, null, 24, null))));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24452xb1d7a30b
    /* renamed from: getSharePanelItemsConfig */
    public java.util.List mo90849x23c342c7(com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.C24451x12373195 feed, long j17, java.lang.String options) {
        so2.u1 d17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(options, "options");
        java.util.List k17 = kz5.c0.k("0", "0");
        android.app.Activity activity = this.f359445f;
        if (activity == null || (d17 = c03.i.d(feed)) == null) {
            return k17;
        }
        int i17 = 0;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activity, 1, false);
        db5.g4 g4Var = new db5.g4(activity);
        if (com.p314xaae8f345.mm.ui.bk.y()) {
            if (com.p314xaae8f345.mm.ui.bk.z(activity.getTaskId())) {
                g4Var.g(117, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b9c), com.p314xaae8f345.mm.R.raw.f80164x8f15f9e0);
            } else {
                g4Var.g(117, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jjg), com.p314xaae8f345.mm.R.raw.f80311xadf8c434);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y4 y4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y4.f184247a;
        y4Var.k(activity, g4Var, d17);
        y4Var.s(activity, g4Var, d17);
        if (d17.g2()) {
            if (gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_FINDER_BULLET_SWITCH_BOOLEAN, true)) {
                g4Var.g(301, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gyu), com.p314xaae8f345.mm.R.raw.f78724xa7cab0f2);
            } else {
                g4Var.g(302, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gyy), com.p314xaae8f345.mm.R.raw.f78722xb2eedfd6);
            }
        }
        y4Var.y(activity, d17, g4Var, k0Var, 200);
        y4Var.x(activity, d17, g4Var);
        if (!hc2.b0.i(d17)) {
            g4Var.g(99, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gyz), com.p314xaae8f345.mm.R.raw.f79149xec043d5e);
            g4Var.g(101, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gys), com.p314xaae8f345.mm.R.raw.f80290xd9c5d1ec);
        }
        y4Var.q(activity, g4Var, d17);
        y4Var.m(activity, g4Var, d17);
        if (hc2.b0.i(d17)) {
            y4Var.t(activity, g4Var, d17);
            y4Var.g(activity, g4Var, d17);
        }
        y4Var.H(activity, d17, g4Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x3.f206965a.b(g4Var);
        java.util.List list = g4Var.f309877d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "getItemList(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((android.view.MenuItem) it.next()).getItemId()));
        }
        java.util.Set X0 = kz5.n0.X0(arrayList);
        int i18 = ((h03.b) kz5.n0.i0(h03.b.f359405f)).f359406d + 1;
        char[] cArr = new char[i18];
        java.util.Arrays.fill(cArr, '0');
        if (X0.contains(117)) {
            if (com.p314xaae8f345.mm.ui.bk.z(activity.getTaskId())) {
                cArr[17] = '1';
            } else {
                cArr[23] = '1';
            }
        }
        if (X0.contains(java.lang.Integer.valueOf(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.C26524xd6f088f0.f54463x110bac93))) {
            cArr[43] = '1';
        }
        if (X0.contains(java.lang.Integer.valueOf(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.C26524xd6f088f0.f54460xdba898a8))) {
            cArr[31] = '1';
        }
        if (X0.contains(java.lang.Integer.valueOf(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.C26524xd6f088f0.f54457x5e52d6e7))) {
            cArr[39] = '1';
        }
        if (X0.contains(301) || X0.contains(301)) {
            cArr[28] = '1';
        }
        if (X0.contains(200)) {
            cArr[20] = '1';
        }
        if (X0.contains(118)) {
            cArr[25] = '1';
        }
        if (X0.contains(99)) {
            cArr[4] = '1';
        }
        if (X0.contains(101)) {
            cArr[5] = '1';
        }
        if (X0.contains(109)) {
            cArr[14] = '1';
        }
        if (X0.contains(119)) {
            cArr[34] = '1';
        }
        if (X0.contains(121)) {
            cArr[40] = '1';
        }
        if (X0.contains(202)) {
            cArr[26] = '1';
        }
        if (!(i18 == 0)) {
            char[] cArr2 = new char[i18];
            int i19 = i18 - 1;
            if (i19 >= 0) {
                while (true) {
                    cArr2[i19 - i17] = cArr[i17];
                    if (i17 == i19) {
                        break;
                    }
                    i17++;
                }
            }
            cArr = cArr2;
        }
        java.lang.String bigInteger = new java.math.BigInteger(new java.lang.String(cArr), 2).toString(10);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bigInteger, "toString(...)");
        return kz5.c0.k("0", bigInteger);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24452xb1d7a30b
    /* renamed from: heartLikeFeed */
    public void mo90850x963e143b(com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.C24451x12373195 feed, boolean z17, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        android.app.Activity activity = this.f359445f;
        if (activity != null) {
            so2.u1 d17 = c03.i.d(feed);
            if (d17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LVFinderPlugin", "heartLikeFeed toVideoFeed is null");
                return;
            }
            pf5.z zVar = pf5.z.f435481a;
            if (!(activity instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
            nv2.h1 h1Var = nv2.n1.f422083g;
            boolean booleanValue = ((java.lang.Boolean) nv2.n1.f422084h.k(d17.getFeedObject().getFeedObject()).f384367e).booleanValue();
            if (z17) {
                booleanValue = false;
            }
            so2.e2.f491861a.b(V6, 1, d17.getFeedObject(), z17, false, 2, d17.getShowLikeTips(), booleanValue, hc2.s.f(d17.getContact()), null);
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24452xb1d7a30b
    /* renamed from: isFinderAudioPlaying */
    public boolean mo90851x21894588() {
        return ((wy2.g) ((o40.e) i95.n0.c(o40.e.class))).Ai();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24452xb1d7a30b
    /* renamed from: isSelfUsername */
    public boolean mo90852x1beaa28c(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        android.content.Context context = this.f359445f;
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(username, context != null ? xy2.c.e(context) : null);
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.ActivityResultListener
    /* renamed from: onActivityResult */
    public boolean mo63506x9d4787cb(int i17, int i18, android.content.Intent intent) {
        if (i17 != 2 || intent == null) {
            return true;
        }
        android.content.Context context = this.f359445f;
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y4.f184247a.Z(intent);
        db5.t7.i(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572089yf), com.p314xaae8f345.mm.R.raw.f81211xadecd6f4);
        return true;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LVFinderPlugin", "onAttachedToActivity");
        this.f359445f = binding.mo137508x19263085();
        binding.mo137502xbf77c2e1(this);
        ((ku5.t0) ku5.t0.f394148d).b(new h03.p(this), "MicroMsg.LVFinderPlugin");
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24452xb1d7a30b.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24452xb1d7a30b.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24452xb1d7a30b.Companion.m90876x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc2 = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc2, "getBinaryMessenger(...)");
        this.f359446g = new com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.C24495xd6bee5f4(m137983x3b5b91dc2, null, 2, null);
        mo48813x58998cd();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LVFinderPlugin", "InteractionUtil onAttachedToEngine");
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LVFinderPlugin", "onDetachedFromActivity");
        this.f359445f = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24452xb1d7a30b.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24452xb1d7a30b.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24452xb1d7a30b.Companion.m90876x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
        this.f359446g = null;
        mo48814x2efc64();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LVFinderPlugin", "InteractionUtil onDetachedFromEngine");
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24452xb1d7a30b
    /* renamed from: onTapMoreButtonInFriendsLikeList */
    public void mo90853xbb24299a(com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.C24451x12373195 feed, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24452xb1d7a30b
    /* renamed from: openFinderAudioPage */
    public void mo90854xa9a3fe55(long j17, byte[] listenInfo, double d17, java.lang.String contextId, java.lang.String tabContextId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listenInfo, "listenInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextId, "contextId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabContextId, "tabContextId");
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new h03.f(this.f359445f, listenInfo, d17, contextId, tabContextId, j17, null), 3, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24452xb1d7a30b
    /* renamed from: openFinderDetail */
    public void mo90855xc9e1a381(java.lang.String feedId, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedId, "feedId");
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new h03.g(this.f359445f, feedId, null), 3, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24452xb1d7a30b
    /* renamed from: openFinderProfile */
    public void mo90856x3086479(java.lang.String username, long j17, boolean z17, com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.C24451x12373195 c24451x12373195) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        pm0.v.X(new h03.h(this, c24451x12373195, j17, username, z17));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24452xb1d7a30b
    /* renamed from: openHalfScreenWebPage */
    public void mo90857x41e56f5a(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        android.app.Activity activity = this.f359445f;
        if (!(activity instanceof android.content.Context)) {
            activity = null;
        }
        android.app.Activity activity2 = activity;
        if (activity2 == null) {
            return;
        }
        r45.ac4 ac4Var = new r45.ac4();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862();
        c19786x6a1e2862.m76550x2592a27b(2);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19799x6a7e198 c19799x6a7e198 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19799x6a7e198();
        c19799x6a7e198.m77171xca029dad("https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/Lfe1Jj8m4vhEGHxK");
        c19799x6a7e198.m77169x53b6de6f(1);
        c19786x6a1e2862.m76541x751b57e5(c19799x6a7e198);
        ac4Var.set(1, c19786x6a1e2862);
        i95.m c17 = i95.n0.c(c61.yb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        c61.yb.Yi((c61.yb) c17, activity2, ac4Var, null, null, 8, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24452xb1d7a30b
    /* renamed from: openWebPage */
    public void mo90858x3d2e8259(java.lang.String url, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new h03.i(this.f359445f, url, null), 3, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24452xb1d7a30b
    /* renamed from: report18054AvatarClick */
    public void mo90859x12c38c7b(com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.C24451x12373195 feed, long j17, long j18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        android.app.Activity activity = this.f359445f;
        if (activity != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = activity instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            if (V6 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LVFinderPlugin", "reportObj is null");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o0.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r0.f206812q, V6, pm0.v.Z(feed.m90827x18e4224f()), null, 7, "1", 0L, null, new ec2.c((int) j18, false, z17, 0, 0L, 0, 56, null), null, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.r.f34562x366c91de, null);
            }
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24452xb1d7a30b
    /* renamed from: reportBulletComment */
    public void mo90860xa688ca29(com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.C24451x12373195 feed, long j17, java.lang.String commentInfoId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentInfoId, "commentInfoId");
        pm0.v.X(new h03.j(feed, commentInfoId, this));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24452xb1d7a30b
    /* renamed from: ringToneVideoDurationLimit */
    public long mo90861x4881a52e() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("FinderRingToneVideoDurationLimit"), 300L);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24452xb1d7a30b
    /* renamed from: savePlayProgress */
    public void mo90862x3af0ff9e(com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.C24451x12373195 feed, long j17, double d17, double d18, double d19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        java.lang.String m90827x18e4224f = feed.m90827x18e4224f();
        if (m90827x18e4224f == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LVFinderPlugin", "FeedId cannot be nil for updating progress");
        } else {
            cu2.x.f303982a.m(m90827x18e4224f, (long) (d17 * 1000), ((java.lang.Number) r5.f(pm0.v.Z(m90827x18e4224f)).f384367e).intValue() * 1000);
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24452xb1d7a30b
    /* renamed from: setFinderIdentity */
    public void mo90863x638afc06(long j17) {
        pm0.v.X(new h03.k(j17));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24452xb1d7a30b
    /* renamed from: shareFeed */
    public void mo90864xa1ada21d(com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.C24451x12373195 feed, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        int i17 = (int) j18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 a17 = c03.i.a(feed);
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LVFinderPlugin", "shareFeed feed to finderItem is null");
            return;
        }
        android.app.Activity activity = this.f359445f;
        if (activity == null) {
            return;
        }
        so2.u1 u1Var = new so2.u1(a17);
        int i18 = (int) j17;
        int ordinal = com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.EnumC24519xf91577d6.f43838x7c18fe9e.ordinal();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7 n7Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.f183939a;
        if (i18 == ordinal) {
            android.app.Activity activity2 = this.f359445f;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = activity2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 ? (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity2 : null;
            if (activityC0065xcd7aa112 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.C(n7Var, activityC0065xcd7aa112, a17, null, 0, null, 28, null);
                return;
            }
            return;
        }
        if (i18 == com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.EnumC24519xf91577d6.f43841x87e27600.ordinal()) {
            android.app.Activity activity3 = this.f359445f;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa1122 = activity3 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 ? (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity3 : null;
            if (activityC0065xcd7aa1122 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.F(n7Var, activityC0065xcd7aa1122, u1Var, null, 0, 0, 28, null);
                return;
            }
            return;
        }
        if (i18 == com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.EnumC24519xf91577d6.FAV.ordinal()) {
            so2.v0.b(so2.v0.f492177a, u1Var, activity, null, null, 12, null);
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.Rk((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17, activity, true, u1Var.mo2128x1ed62e84(), false, 8, null);
            return;
        }
        int ordinal2 = com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.EnumC24519xf91577d6.f43846xd65316df.ordinal();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x3 x3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x3.f206965a;
        if (i18 == ordinal2) {
            android.app.Activity activity4 = this.f359445f;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa1123 = activity4 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 ? (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity4 : null;
            if (activityC0065xcd7aa1123 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.H(n7Var, activityC0065xcd7aa1123, u1Var, null, 0, 12, null);
                x3Var.c(activity, "textstatus_in_menu", u1Var.mo2128x1ed62e84(), i17);
                if (u1Var.getFeedObject().m59311x25315bf4()) {
                    vs5.a aVar = vs5.a.f521457a;
                    r45.nw1 m59258xd0557130 = u1Var.getFeedObject().m59258xd0557130();
                    aVar.a(java.lang.String.valueOf(m59258xd0557130 != null ? java.lang.Long.valueOf(m59258xd0557130.m75942xfb822ef2(0)) : null), java.lang.String.valueOf(u1Var.getFeedObject().getFeedObject().m76784x5db1b11()), u1Var.getFeedObject().getFeedObject().m76836x6c03c64c(), "1", "3", "0", (i17 & 64) != 0 ? null : null, (i17 & 128) != 0 ? "" : null);
                    return;
                }
                return;
            }
            return;
        }
        if (i18 == com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.EnumC24519xf91577d6.f43842x5ba3b498.ordinal()) {
            android.app.Activity activity5 = this.f359445f;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = activity5 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activity5 : null;
            if (abstractActivityC21394xb3d2c0cf != null) {
                fe0.k4 k4Var = (fe0.k4) i95.n0.c(fe0.k4.class);
                byte[] mo14344x5f01b1f6 = u1Var.getFeedObject().getFeedObject().mo14344x5f01b1f6();
                ((ee0.n4) k4Var).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enterSnsCoverFinderPreviewUI", "com.tencent.mm.feature.sns.SnsFeatureService");
                if (mo14344x5f01b1f6 == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enterSnsCoverFinderPreviewUI", "com.tencent.mm.feature.sns.SnsFeatureService");
                    return;
                } else {
                    je4.a.f380848a.a(abstractActivityC21394xb3d2c0cf, 2, mo14344x5f01b1f6, 0, 9);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enterSnsCoverFinderPreviewUI", "com.tencent.mm.feature.sns.SnsFeatureService");
                    return;
                }
            }
            return;
        }
        if (i18 == com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.EnumC24519xf91577d6.f43844x266230.ordinal()) {
            android.app.Activity activity6 = this.f359445f;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa1124 = activity6 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 ? (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity6 : null;
            if (activityC0065xcd7aa1124 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y5.f184249a.d(activityC0065xcd7aa1124, u1Var, 2L, (r24 & 8) != 0, (r24 & 16) != 0 ? "" : null, (r24 & 32) != 0 ? "" : null, (r24 & 64) != 0 ? 0 : 0, (r24 & 128) != 0 ? null : null, h03.l.f359430d);
                x3Var.c(activity, "button_set_bell", u1Var.mo2128x1ed62e84(), i17);
                return;
            }
            return;
        }
        if (i18 == com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.EnumC24519xf91577d6.f43845x7f7d5b32.ordinal()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = activity instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[5];
            lVarArr[0] = new jz5.l("view_id", "projection");
            pf5.z zVar = pf5.z.f435481a;
            boolean z17 = activity instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112;
            if (!z17) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa1125 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx sxVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx) zVar.a(activityC0065xcd7aa1125).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx.class);
            long mo2128x1ed62e84 = u1Var.mo2128x1ed62e84();
            long j19 = sxVar.f217475x;
            lVarArr[1] = new jz5.l("if_projection", java.lang.Integer.valueOf((j19 == 0 || j19 != mo2128x1ed62e84) ? 0 : 1));
            lVarArr[2] = new jz5.l("feed_id", pm0.v.u(u1Var.mo2128x1ed62e84()));
            lVarArr[3] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.m75939xb282bd08(5)) : null);
            lVarArr[4] = new jz5.l("projection_front_time", 0L);
            ((cy1.a) rVar).Ej("view_clk", kz5.c1.k(lVarArr), 25496);
            if (!z17) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            p012xc85e97e9.p093xedfae76a.c1 a18 = zVar.a(activityC0065xcd7aa1125).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "get(...)");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx) a18).Z6(u1Var.mo2128x1ed62e84(), null);
            return;
        }
        int ordinal3 = com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.EnumC24519xf91577d6.f43840x5c797df4.ordinal();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y4 y4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y4.f184247a;
        if (i18 == ordinal3) {
            y4Var.I(activity, u1Var);
            return;
        }
        if (i18 != com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.EnumC24519xf91577d6.f43836x52770c8b.ordinal()) {
            if (i18 == com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.EnumC24519xf91577d6.f43835xc13f5a9e.ordinal()) {
                y4Var.S(activity, u1Var, null, i17, 23);
                return;
            } else if (i18 == com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.EnumC24519xf91577d6.f43843x185d5ba0.ordinal()) {
                xc2.y2.f534876a.V(activity, u1Var, i17, false);
                return;
            } else {
                com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.EnumC24519xf91577d6.f43839x52409ac7.ordinal();
                return;
            }
        }
        boolean C = zl2.q4.f555466a.C(u1Var);
        bd2.b bVar = bd2.b.f100777a;
        if (!C) {
            bVar.a(activity, a17.f66939xc8a07680, a17.m59229xb5af1dd5(), (i18 & 8) != 0 ? 0L : 0L, (i18 & 16) != 0 ? 58 : 0);
            return;
        }
        r45.nw1 m59258xd05571302 = a17.m59258xd0557130();
        if (m59258xd05571302 != null) {
            long m75942xfb822ef2 = m59258xd05571302.m75942xfb822ef2(0);
            pf5.z zVar2 = pf5.z.f435481a;
            if (!(activity instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            bVar.j(activity, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6(), m75942xfb822ef2, a17.m59299x6bf53a6c(), (i18 & 16) != 0 ? null : null, (i18 & 32) != 0 ? 62 : 0, (i18 & 64) != 0 ? null : new so2.h1(a17));
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24452xb1d7a30b
    /* renamed from: shareFeedToUser */
    public void mo90865x311c7d63(com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.C24451x12373195 feed, java.lang.String username, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        pm0.v.X(new h03.m(feed, username, this));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LVFinderPlugin", "shareFeedToUser");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24452xb1d7a30b
    /* renamed from: shouldShowTextState */
    public boolean mo90866x3e3749f4() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.X4).mo141623x754a37bb()).r()).intValue() == 1;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24452xb1d7a30b
    /* renamed from: showFansProfile */
    public void mo90867x14c10e8c(java.lang.String username, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        android.content.Intent intent = new android.content.Intent();
        ya2.b2 b2Var = new ya2.b2();
        b2Var.f69347xdec927b = username;
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ko koVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ko.f214053a;
        koVar.b(b2Var, intent);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        java.lang.String c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.m4.f207681a.c(username, 3);
        intent.putExtra("IsPoster", true);
        intent.putExtra("Action", 1);
        intent.putExtra("hideSendMsg", true);
        android.app.Activity activity = this.f359445f;
        if (activity != null) {
            intent.putExtra("SessionId", c17);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            koVar.g(activity, intent, (int) j17);
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24452xb1d7a30b
    /* renamed from: showFavEntryOnActionSheet */
    public boolean mo90868xc284d596() {
        return ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.D0().r()).intValue() == 1;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24452xb1d7a30b
    /* renamed from: showRingToneEntrance */
    public boolean mo90869x87e541b5() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_finder_ring_tone_entrance_switch, true);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24452xb1d7a30b
    /* renamed from: statReportExposeEnd */
    public void mo90870x60015aaf(com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.C24451x12373195 feed, long j17, byte[] bArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        android.app.Activity activity = this.f359445f;
        if (activity == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).a(new h03.n(feed, this, j17, bArr, activity));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24452xb1d7a30b
    /* renamed from: statReportExposeStart */
    public void mo90871x65dd7136(com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.C24451x12373195 feed, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        ((ku5.t0) ku5.t0.f394148d).b(new h03.o(feed, this, j17), "MicroMsg.LVFinderPlugin");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24452xb1d7a30b
    /* renamed from: statReportFlush */
    public void mo90872xe5883b3c() {
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24452xb1d7a30b
    /* renamed from: thumbFavFeed */
    public void mo90873xa76928a3(com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.C24451x12373195 feed, boolean z17, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        android.app.Activity activity = this.f359445f;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = activity instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 ? (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity : null;
        if (activityC0065xcd7aa112 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 a17 = c03.i.a(feed);
            if (a17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LVFinderPlugin", "thumbFavFeed toFinderItem is null");
            } else {
                so2.v0.f492177a.c(activityC0065xcd7aa112, a17, z17, 2, (r17 & 16) != 0 ? 0 : 0, (r17 & 32) != 0 ? null : null, (r17 & 64) != 0 ? null : null);
            }
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24452xb1d7a30b
    /* renamed from: videoCoverEnabled */
    public boolean mo90874x45360ba5() {
        return ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).wi();
    }
}
