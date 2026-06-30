package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9;

/* loaded from: classes4.dex */
public final class v {

    /* renamed from: e, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.u f245299e = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.u(null);

    /* renamed from: f, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 f245300f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.r2(3);

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17803x7f9d5a75 f245301a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f245302b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f245303c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.t f245304d;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17803x7f9d5a75 c17803x7f9d5a75) {
        this.f245301a = c17803x7f9d5a75;
    }

    public static final boolean a(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkShowAdLivingStream", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
        boolean a17 = f245299e.a(c17933xe8d1b226);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkShowAdLivingStream", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
        return a17;
    }

    public final void b() {
        r45.nw1 nw1Var;
        r45.p94 p94Var;
        r45.p94 p94Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doExitAdLiveRoom", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17803x7f9d5a75 c17803x7f9d5a75 = this.f245301a;
        if (c17803x7f9d5a75 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doExitAdLiveRoom", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
            try {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doExitAdLiveRoom, enable is ");
                r45.l71 l71Var = c17803x7f9d5a75.mGetLiveInfoResp;
                sb6.append((l71Var == null || (p94Var2 = (r45.p94) l71Var.m75936x14adae67(17)) == null) ? null : java.lang.Boolean.valueOf(p94Var2.m75933x41a8a7f2(0)));
                sb6.append(", mIsEnterAdRoom is ");
                sb6.append(c17803x7f9d5a75.mIsEnterAdRoom);
                sb6.append(", mNeedExitAdRoomReq is ");
                sb6.append(c17803x7f9d5a75.mNeedExitAdRoomReq);
                sb6.append(", mIsPlayerPaused is ");
                sb6.append(c17803x7f9d5a75.D);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdLivingStreamContainer", sb6.toString());
                if (!c17803x7f9d5a75.D) {
                    c17803x7f9d5a75.f();
                }
                c17803x7f9d5a75.A = c17803x7f9d5a75.F;
                r45.l71 l71Var2 = c17803x7f9d5a75.mGetLiveInfoResp;
                if (((l71Var2 == null || (p94Var = (r45.p94) l71Var2.m75936x14adae67(17)) == null || !p94Var.m75933x41a8a7f2(0)) ? false : true) && c17803x7f9d5a75.mNeedExitAdRoomReq && c17803x7f9d5a75.mIsEnterAdRoom) {
                    c17803x7f9d5a75.mIsEnterAdRoom = false;
                    r45.l71 l71Var3 = c17803x7f9d5a75.mGetLiveInfoResp;
                    java.lang.Long valueOf = l71Var3 != null ? java.lang.Long.valueOf(l71Var3.m75942xfb822ef2(18)) : null;
                    r45.l71 l71Var4 = c17803x7f9d5a75.mGetLiveInfoResp;
                    java.lang.Long valueOf2 = (l71Var4 == null || (nw1Var = (r45.nw1) l71Var4.m75936x14adae67(1)) == null) ? null : java.lang.Long.valueOf(nw1Var.m75942xfb822ef2(0));
                    r45.l71 l71Var5 = c17803x7f9d5a75.mGetLiveInfoResp;
                    java.lang.String m75945x2fec8307 = l71Var5 != null ? l71Var5.m75945x2fec8307(19) : null;
                    r45.l71 l71Var6 = c17803x7f9d5a75.mGetLiveInfoResp;
                    java.lang.String m75945x2fec83072 = l71Var6 != null ? l71Var6.m75945x2fec8307(20) : null;
                    r45.hc1 hc1Var = c17803x7f9d5a75.mFinderJoinLiveResp;
                    com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = hc1Var != null ? hc1Var.m75934xbce7f2f(1) : null;
                    c17803x7f9d5a75.C = java.lang.System.currentTimeMillis() / 1000;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdLivingStreamContainer", "doExitAdLiveRoom, liveId is " + valueOf2 + ", objectId is " + valueOf + ", nonceId is " + m75945x2fec8307 + ", mFinderUsername is " + c17803x7f9d5a75.mFinderUsername + ", sessionBuffer is " + m75945x2fec83072 + ", mJoinLiveEndTimestamp is " + c17803x7f9d5a75.C + ", liveCookies is " + m75934xbce7f2f);
                    if (!(valueOf2 == null)) {
                        if (!(valueOf == null)) {
                            if (!(m75945x2fec8307 == null)) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdLivingStreamContainer", "do getLiveMsg");
                                c17803x7f9d5a75.f245157J = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.c(new java.lang.ref.WeakReference(c17803x7f9d5a75));
                                ss5.k0 k0Var = (ss5.k0) i95.n0.c(ss5.k0.class);
                                java.lang.String str = c17803x7f9d5a75.mFinderUsername;
                                byte[] g17 = m75934xbce7f2f != null ? m75934xbce7f2f.g() : null;
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.c cVar = c17803x7f9d5a75.f245157J;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k0Var);
                                ss5.k0.B4(k0Var, null, str, g17, valueOf2.longValue(), valueOf.longValue(), m75945x2fec8307, null, 11, true, 0, null, 0, null, null, cVar, null, null, null, false, null, null, 0L, null, 6176256, null).l();
                            }
                        }
                    }
                }
                c17803x7f9d5a75.g();
                c17803x7f9d5a75.m();
            } catch (java.lang.Throwable th6) {
                ca4.q.c("doExitAdLiveRoom error", th6);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdLivingStreamContainer", "doExitAdLiveRoom, exp is" + th6);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doExitAdLiveRoom", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doExitAdLiveRoom", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(int r23, int r24) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v.c(int, int):void");
    }

    public final void d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17, r45.jj4 jj4Var, java.lang.Integer num, java.lang.Integer num2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillAdLivingStreamViewInfo", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
        try {
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdLivingStreamHelper", "fillAdLivingStreamViewInfo, exp is " + th6);
        }
        if (c17933xe8d1b226 == null || jj4Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdLivingStreamHelper", "fillAdLivingStreamViewInfo, but snsInfo or media is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillAdLivingStreamViewInfo", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17803x7f9d5a75 c17803x7f9d5a75 = this.f245301a;
        if (c17803x7f9d5a75 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdLivingStreamHelper", "fillAdLivingStreamViewInfo, but adLivingViewContainer is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillAdLivingStreamViewInfo", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
            return;
        }
        if (!ca4.m0.V(this.f245302b, c17933xe8d1b226)) {
            h();
        }
        boolean z17 = true;
        if (!ca4.m0.V(c17803x7f9d5a75.m69630x9f8c0a8f(), c17933xe8d1b226)) {
            this.f245303c = false;
            c17803x7f9d5a75.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetParams", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
            c17803x7f9d5a75.startEnterAdLiveRoomTime = 0L;
            c17803x7f9d5a75.F = 0L;
            c17803x7f9d5a75.C = 0L;
            c17803x7f9d5a75.B = 0L;
            c17803x7f9d5a75.E = false;
            c17803x7f9d5a75.D = true;
            c17803x7f9d5a75.mIsEnterAdRoom = false;
            c17803x7f9d5a75.mFinderJoinLiveResp = null;
            c17803x7f9d5a75.m69641x30f2d575(true);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetParams", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        }
        c17803x7f9d5a75.setVisibility(0);
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.i0.c(ca4.z0.T(c17933xe8d1b226), 2) != 771) {
            z17 = false;
        }
        c17803x7f9d5a75.m69652x3a3868c2(z17);
        if (c17803x7f9d5a75.m69630x9f8c0a8f() == null || this.f245302b == null) {
            this.f245302b = c17933xe8d1b226;
            c17803x7f9d5a75.m69663x9a446b9b(c17933xe8d1b226);
            this.f245303c = false;
            c(i17, 3);
            android.widget.ImageView m69632xc4cb76a2 = c17803x7f9d5a75.m69632xc4cb76a2();
            if (m69632xc4cb76a2 != null) {
                m69632xc4cb76a2.setVisibility(0);
            }
            c17803x7f9d5a75.n(jj4Var, num, num2);
        }
        android.widget.ImageView m69633xb83b87a4 = c17803x7f9d5a75.m69633xb83b87a4();
        if (m69633xb83b87a4 != null) {
            android.content.Context context = c17803x7f9d5a75.getContext();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 hj6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj();
            int hashCode = context.hashCode();
            com.p314xaae8f345.mm.p2621x8fb0427b.s7 d17 = com.p314xaae8f345.mm.p2621x8fb0427b.s7.d();
            d17.f276846b = c17933xe8d1b226.m70371x485d7().f39015xc86e6609;
            hj6.l0(jj4Var, m69633xb83b87a4, -1, hashCode, d17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillAdLivingStreamViewInfo", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17803x7f9d5a75 e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdLivingViewContainer", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdLivingViewContainer", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
        return this.f245301a;
    }

    public final void f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUIDestroy", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdLivingStreamHelper", "onUIDestroy");
            f245300f.d(-1);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17803x7f9d5a75 c17803x7f9d5a75 = this.f245301a;
            if (c17803x7f9d5a75 != null) {
                c17803x7f9d5a75.l();
            }
            h();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdLivingStreamHelper", "onUIDestroy, exp is " + th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUIDestroy", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
    }

    public final void g() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pausePlayerStream", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
        boolean c17 = f245299e.c();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17803x7f9d5a75 c17803x7f9d5a75 = this.f245301a;
        if (!c17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdLivingStreamHelper", "isNotAdLivingFrequencyLimit, pausePlayerStream");
            this.f245303c = false;
            if (c17803x7f9d5a75 != null) {
                c17803x7f9d5a75.k();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pausePlayerStream", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
            return;
        }
        if (c17803x7f9d5a75 != null ? p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c17803x7f9d5a75.j(), java.lang.Boolean.TRUE) : false) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdLivingStreamHelper", "pausePlayerStream");
            this.f245303c = false;
            c17803x7f9d5a75.k();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AdLivingStreamHelper", "pausePlayerStream, but player is not playing");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pausePlayerStream", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
    }

    public final void h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reset", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
        this.f245303c = false;
        this.f245302b = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17803x7f9d5a75 c17803x7f9d5a75 = this.f245301a;
        if (c17803x7f9d5a75 != null) {
            c17803x7f9d5a75.m();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reset", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
    }

    public final void i() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startAdStreamPlayer", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
        boolean c17 = f245299e.c();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17803x7f9d5a75 c17803x7f9d5a75 = this.f245301a;
        if (c17) {
            if (c17803x7f9d5a75 != null ? p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c17803x7f9d5a75.j(), java.lang.Boolean.TRUE) : false) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AdLivingStreamHelper", "startAdStreamPlayer, but player is playing");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startAdStreamPlayer", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdLivingStreamHelper", "startAdStreamPlayer");
        this.f245303c = true;
        java.lang.Integer valueOf = c17803x7f9d5a75 != null ? java.lang.Integer.valueOf(c17803x7f9d5a75.m69625x45e4bf8a()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            if (c17803x7f9d5a75 != null) {
                c17803x7f9d5a75.p();
            }
        } else if (c17803x7f9d5a75 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resumePlayerStream", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdLivingStreamContainer", "resumePlayerStream, mIsPlayCompleted is " + c17803x7f9d5a75.mIsPlayCompleted + ", mIsPlayerPaused is " + c17803x7f9d5a75.D);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdLivingStreamContainer", "resumePlayerStream, exp is" + th6);
            }
            if (c17803x7f9d5a75.mIsPlayCompleted) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resumePlayerStream", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
            } else {
                if (c17803x7f9d5a75.D) {
                    c17803x7f9d5a75.h();
                }
                c17803x7f9d5a75.D = false;
                c17803x7f9d5a75.mPlayerStatus = 1;
                android.widget.ImageView imageView = c17803x7f9d5a75.mStatusIcon;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                c50.m0 m0Var = c17803x7f9d5a75.mPlayer;
                if (m0Var != null) {
                    ((gp2.l0) m0Var).G();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resumePlayerStream", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startAdStreamPlayer", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
    }
}
