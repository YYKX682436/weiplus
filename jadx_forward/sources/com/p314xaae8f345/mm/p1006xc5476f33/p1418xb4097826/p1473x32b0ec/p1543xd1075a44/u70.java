package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class u70 extends if2.b implements ut3.d, if2.e {

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f201487m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sl f201488n;

    /* renamed from: o, reason: collision with root package name */
    public eg2.s0 f201489o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f201490p;

    /* renamed from: q, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f201491q;

    /* renamed from: r, reason: collision with root package name */
    public r45.yg7 f201492r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u70(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f201491q = p3325xe03a0797.p3326xc267989b.z0.b();
        this.f201492r = r45.yg7.FinderLiveImgSource_Unknown;
    }

    public static final void Z6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.u70 u70Var, java.lang.String str, java.lang.String str2) {
        android.view.View S6 = u70Var.S6(com.p314xaae8f345.mm.R.id.f566298fg5);
        u70Var.f201487m = S6 != null ? (android.widget.ImageView) S6.findViewById(com.p314xaae8f345.mm.R.id.ewg) : null;
        if (S6 != null) {
            S6.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c70(u70Var));
        }
        if (S6 != null) {
            S6.addOnAttachStateChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d70(u70Var));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStartLivePostCoverWidget", "scene:" + str + ", url: " + str2);
        if (str2.length() > 0) {
            eg2.s0 s0Var = u70Var.f201489o;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, s0Var != null ? s0Var.f334165i : null)) {
                u70Var.a7();
                eg2.s0 s0Var2 = u70Var.f201489o;
                if (s0Var2 != null) {
                    s0Var2.a();
                }
            }
        }
        if (((mm2.n0) u70Var.m56788xbba4bfc0(mm2.n0.class)).Q6(xy2.c.e(u70Var.O6()))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStartLivePostCoverWidget", "checkCoverEnhanceIfNeeded: skip, co-live invitee");
        } else {
            int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_PREVIOUS_COVER_ENHANCE_GUIDE_CNT_INT_SYNC, 0);
            ae2.in inVar = ae2.in.f85221a;
            int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85330k8).mo141623x754a37bb()).r()).intValue();
            boolean e76 = u70Var.e7();
            boolean z17 = !zl2.r4.f555483a.T1((r45.q12) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) u70Var.m56788xbba4bfc0(mm2.g1.class)).f410601f).mo144003x754a37bb());
            if (!e76) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStartLivePostCoverWidget", "checkCoverEnhanceIfNeeded: skip, coverEnhanceEnabled=false");
            } else if (z17) {
                if (str2.length() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStartLivePostCoverWidget", "checkCoverEnhanceIfNeeded: skip, url is empty");
                } else if (r17 >= intValue) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStartLivePostCoverWidget", "checkCoverEnhanceIfNeeded: skip, guideCnt=" + r17 + " >= guideLimit=" + intValue);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStartLivePostCoverWidget", "checkCoverEnhanceIfNeeded: will check, url=" + str2 + ", guideCnt=" + r17 + '/' + intValue);
                    if (u70Var.f201489o == null) {
                        u70Var.f201489o = new eg2.s0(u70Var.f201491q, u70Var.O6());
                    }
                    eg2.s0 s0Var3 = u70Var.f201489o;
                    if (s0Var3 != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.a70 a70Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.a70(u70Var);
                        java.lang.String e17 = xy2.c.e(s0Var3.f334162f);
                        if (!(e17.length() == 0)) {
                            if (!(str2.length() == 0)) {
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("check: coverUrl=");
                                sb6.append(str2);
                                sb6.append(", scene=1, hasCheckCompleted=");
                                java.util.concurrent.atomic.AtomicBoolean atomicBoolean = s0Var3.f334168l;
                                sb6.append(atomicBoolean.get());
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveHDTaskChecker", sb6.toString());
                                if (atomicBoolean.get() && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(s0Var3.f334165i, str2)) {
                                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("check: already completed, directly callback with cached result, needEnhance=");
                                    java.util.concurrent.atomic.AtomicBoolean atomicBoolean2 = s0Var3.f334169m;
                                    sb7.append(atomicBoolean2);
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveHDTaskChecker", sb7.toString());
                                    if (atomicBoolean2.get()) {
                                        a70Var.a();
                                    } else {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStartLivePostCoverWidget", "cover does not need enhance");
                                    }
                                } else {
                                    s0Var3.a();
                                    s0Var3.f334110b.set(false);
                                    s0Var3.f334165i = str2;
                                    s0Var3.f334163g = e17;
                                    s0Var3.f334164h = 1;
                                    s0Var3.f334111c = p3325xe03a0797.p3326xc267989b.l.d(s0Var3.f334161e, null, null, new eg2.r0(s0Var3, str2, a70Var, e17, 1, null), 3, null);
                                }
                            }
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderLiveHDTaskChecker", "check: invalid params, finderUsername=" + e17 + ", coverUrl=" + str2);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderStartLivePostCoverWidget", "cover enhance check failed");
                    }
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStartLivePostCoverWidget", "checkCoverEnhanceIfNeeded: skip, coverEnhanceEnabledForLiveMode=false (gameMode)");
            }
        }
        android.widget.ImageView imageView = u70Var.f201487m;
        if (imageView != null) {
            if (com.p314xaae8f345.mm.vfs.w6.j(str2)) {
                zl2.r4.f555483a.P(imageView, str2, java.lang.Math.min(imageView.getWidth(), 500), java.lang.Math.min(imageView.getHeight(), 500));
            } else {
                mn2.g1 g1Var = mn2.g1.f411508a;
                g1Var.e().c(new mn2.q3(str2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f), imageView, g1Var.h(mn2.f1.I));
            }
        }
    }

    public final void a7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sl slVar = this.f201488n;
        if (slVar != null) {
            slVar.dismiss();
        }
        this.f201488n = null;
    }

    public final void b7(java.lang.String str) {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N6 = N6();
        if (N6 != null) {
            zl2.k kVar = zl2.k.f555384a;
            boolean e76 = e7();
            r45.bo1 bo1Var = r45.bo1.FinderLiveCoverImageEnhanceScene_CreateLive;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sl slVar = this.f201488n;
            boolean z17 = false;
            if (slVar != null && slVar.isShowing()) {
                z17 = true;
            }
            kVar.a(N6, str, 100111, null, e76, bo1Var, z17);
        }
    }

    @Override // ut3.d
    public boolean c5(android.content.Context context, android.os.Bundle bundle, ut3.c cVar) {
        return false;
    }

    public final void c7(boolean z17) {
        a7();
        eg2.s0 s0Var = this.f201489o;
        java.lang.String str = s0Var != null ? s0Var.f334166j : null;
        java.lang.String str2 = s0Var != null ? s0Var.f334167k : null;
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderStartLivePostCoverWidget", "enterEditWithCachedCover: no cached local path, fallback to selection");
            f7();
            return;
        }
        ((ml2.j0) i95.n0.c(ml2.j0.class)).bk(ml2.x3.f409763p);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N6 = N6();
        if (N6 != null) {
            zl2.k.f555384a.a(N6, str, 100111, str2, e7(), r45.bo1.FinderLiveCoverImageEnhanceScene_CreateLive, z17);
        }
    }

    public final java.lang.String d7() {
        java.lang.String str = zl2.r4.f555483a.T1((r45.q12) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) m56788xbba4bfc0(mm2.g1.class)).f410601f).mo144003x754a37bb()) ? (java.lang.String) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) m56788xbba4bfc0(mm2.g1.class)).f410612t).mo144003x754a37bb() : (java.lang.String) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) m56788xbba4bfc0(mm2.g1.class)).f410608p).mo144003x754a37bb();
        return str == null ? "" : str;
    }

    public final boolean e7() {
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_finder_live_force_enable_cover_enhance, 0) == 1) {
            return true;
        }
        return gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_ENABLE_COVER_ENHANCE_PREPARE_BOOLEAN_SYNC, false);
    }

    public final void f7() {
        if (!gm0.j1.u().l()) {
            db5.t7.l(O6());
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(O6(), 1, false);
        k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g70(this);
        k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h70(this);
        k0Var.C = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.i70(this);
        k0Var.f293389e = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.j70(this);
        k0Var.v();
    }

    public final void g7(ml2.x3 x3Var) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", x3Var.f409766d);
        jSONObject.put("sence", 1);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.c1 c1Var = ml2.c1.f408858e;
        zy2.zb.j5(zbVar, 7L, jSONObject.toString(), null, 4, null);
    }

    public final void h7(te2.k3 type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", type.f499698d);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.c1 c1Var = ml2.c1.f408858e;
        zy2.zb.j5(zbVar, 75L, jSONObject.toString(), null, 4, null);
    }

    @Override // ut3.d
    public void k3(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046, android.os.Bundle bundle) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_extra_data", bundle);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c16991x15ced046, "null cannot be cast to non-null type android.os.Parcelable");
        intent.putExtra("KSEGMENTMEDIAINFO", c16991x15ced046);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        android.app.Activity activity = (android.app.Activity) context;
        activity.setResult(-1, intent);
        activity.finish();
    }

    @Override // if2.e
    /* renamed from: onActivityResult */
    public void mo57866x9d4787cb(int i17, int i18, android.content.Intent intent) {
        android.net.Uri data;
        java.lang.String str = null;
        if (i17 != 10010 && i17 != 10011) {
            if (i17 == 100111 && i18 == -1) {
                p3325xe03a0797.p3326xc267989b.l.d(this.f201491q, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.f70(intent, this, null), 3, null);
                return;
            }
            return;
        }
        if (i18 != -1) {
            ((ml2.j0) i95.n0.c(ml2.j0.class)).bk(ml2.x3.f409755e);
            g7(i17 == 10011 ? ml2.x3.f409759i : ml2.x3.f409760m);
            return;
        }
        if (intent != null && (data = intent.getData()) != null) {
            str = data.getPath();
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            android.content.Context O6 = O6();
            ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
            java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183676l;
            ((ub0.r) oVar).getClass();
            str = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.b(O6, intent, str2);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStartLivePostCoverWidget", "filePath[" + str + "] " + intent);
        if (str == null || str.length() == 0) {
            ((ml2.j0) i95.n0.c(ml2.j0.class)).bk(ml2.x3.f409755e);
        } else {
            b7(str);
            ((ml2.j0) i95.n0.c(ml2.j0.class)).bk(i17 == 10011 ? ml2.x3.f409761n : ml2.x3.f409762o);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.l70(this, null), 3, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.n70(this, null), 3, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p70(this, null), 3, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.r70(this, null), 3, null);
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        this.f201487m = null;
        a7();
        eg2.s0 s0Var = this.f201489o;
        if (s0Var != null) {
            s0Var.a();
        }
        this.f201489o = null;
    }

    @Override // ut3.d
    public void r3(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16994x3ba8255 c16994x3ba8255, android.os.Bundle bundle) {
    }
}
