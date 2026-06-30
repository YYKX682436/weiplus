package in0;

/* loaded from: classes3.dex */
public final class q extends tn0.w0 {

    /* renamed from: b2, reason: collision with root package name */
    public static in0.q f374302b2;
    public int P1;
    public int Q1;
    public final in0.c R1;
    public int S1;
    public cl0.g T1;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 U1;
    public final p05.p0 V1;
    public final p05.q0 W1;
    public final p05.o0 X1;
    public yz5.s Y1;
    public lo0.b0 Z1;

    /* renamed from: a2, reason: collision with root package name */
    public int f374303a2;

    public q(boolean z17) {
        super(true, z17);
        this.P1 = 1;
        this.R1 = new in0.c(this);
        this.U1 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4("anchor_sei_sender", (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new in0.b(this), true);
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        this.V1 = new p05.j0();
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        this.W1 = new p05.l0();
        rh0.f0 f0Var = (rh0.f0) i95.n0.c(rh0.f0.class);
        p05.z0 weVisionJsonCallbackBucket = this.F;
        ((qh0.r) f0Var).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(weVisionJsonCallbackBucket, "weVisionJsonCallbackBucket");
        this.X1 = new p05.i0(weVisionJsonCallbackBucket);
        in0.p pVar = new in0.p(this);
        p05.z0 z0Var = this.F;
        z0Var.getClass();
        z0Var.f432272a.add(pVar);
        this.f374303a2 = -1;
    }

    public static final java.lang.String S0(in0.q qVar, java.lang.String sdkUserId, float f17, java.lang.String gestureId, java.lang.String randomId, float f18, float f19, float f27, float f28, java.lang.String giftComboId, int i17) {
        qVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sdkUserId, "sdkUserId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gestureId, "gestureId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(randomId, "randomId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftComboId, "giftComboId");
        cl0.g gVar = new cl0.g();
        hn0.u uVar = hn0.u.f363970e;
        gVar.o("wxT", 32);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("u", sdkUserId);
        if (i17 == 0) {
            jSONObject.put("a", java.lang.Float.valueOf(f17));
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put(dm.i4.f66865x76d1ec5a, gestureId);
            jSONObject2.put("i", randomId);
            jSONObject2.put("x", java.lang.Float.valueOf(f18));
            jSONObject2.put("y", java.lang.Float.valueOf(f19));
            jSONObject2.put("r", java.lang.Float.valueOf(f27));
            jSONObject2.put("s", java.lang.Float.valueOf(f28));
            jSONObject2.put("g", giftComboId);
            jSONArray.put(jSONObject2);
            jSONObject.put("ga", jSONArray);
        } else if (i17 == 1) {
            jSONObject.put("gs", gestureId);
        }
        gVar.h("d", jSONObject.toString());
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        return gVar2;
    }

    public static void d1(in0.q qVar, android.graphics.Bitmap bitmap, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        go0.f0 f0Var = qVar.f502304r;
        f0Var.getClass();
        f0Var.l(new go0.z(f0Var, bitmap, z17));
    }

    @Override // tn0.w0
    public void E(hn0.i callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        super.E(callback);
        java.util.Iterator it = ((java.util.ArrayList) this.E1).iterator();
        boolean z17 = false;
        while (it.hasNext() && !(z17 = ((java.lang.Boolean) ((yz5.a) it.next()).mo152xb9724478()).booleanValue())) {
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreAnchor", "#enterRoom isSetMuteImageBlock=" + z17);
        if (!z17) {
            android.graphics.drawable.Drawable drawable = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f80602xaca7263b);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(drawable, "getDrawable(...)");
            N0(pm0.v.o(drawable, com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf, 1280, android.graphics.Bitmap.Config.ARGB_8888), 5);
        }
        vn0.c cVar = vn0.b.f519707a;
        xn0.l d17 = cVar.d();
        xn0.a a17 = cVar.a();
        d17.getClass();
        a17.getClass();
        vn0.e eVar = this.f502297m;
        if (eVar != null) {
            eVar.k();
        }
        vn0.e eVar2 = this.f502297m;
        if (eVar2 != null) {
            eVar2.f519716a.mo30266xa24faeb(false);
        }
    }

    @Override // tn0.w0
    public int G(jn0.a params) {
        go0.k0 k0Var;
        mm2.e1 e1Var;
        kn0.g gVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        fn0.g gVar2 = fn0.g.f345728a;
        hn0.g gVar3 = fn0.g.f345729b;
        boolean z17 = gVar3 != null && ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.L6).mo141623x754a37bb()).r()).intValue() == 1;
        kn0.p pVar = this.D;
        if (!z17) {
            kn0.i iVar = this.C;
            if (!pVar.g((iVar == null || (gVar = iVar.f391091b) == null) ? null : java.lang.Long.valueOf(gVar.f391068b))) {
                return -4;
            }
        }
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("floatMode liveMode:");
        sb6.append(pVar.e());
        sb6.append(", forceMoveTask:");
        sb6.append(params.f382009b);
        sb6.append(", dontFinish:");
        sb6.append(params.f382010c);
        sb6.append(", generateType:");
        sb6.append(params.f382011d);
        sb6.append(", opType:");
        sb6.append(params.f382012e);
        sb6.append(", staticFloatImage:");
        android.graphics.Bitmap bitmap = params.f382013f;
        sb6.append(bitmap);
        sb6.append(", isScreenShareMode:");
        sb6.append(pVar.f391122i);
        sb6.append(" isVoiceRoomMode: ");
        sb6.append(Z());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreAnchor", sb6.toString());
        if (!Z()) {
            boolean z19 = pVar.f391122i;
            fo0.n nVar = this.f502300p;
            if (!z19 && !pVar.e()) {
                if (!((gVar3 == null || (e1Var = (mm2.e1) dk2.ef.f314905a.i(mm2.e1.class)) == null || e1Var.R6() != 3) ? false : true)) {
                    android.view.TextureView textureView = new android.view.TextureView(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                    textureView.setSurfaceTextureListener(new in0.d(this, elapsedRealtime, params, textureView));
                    go0.f1 f1Var = this.f502304r.f355300p;
                    if (f1Var != null && (k0Var = f1Var.f355307w) != null) {
                        k0Var.L = 0;
                        k0Var.K = 0;
                    }
                    nVar.c(textureView);
                }
            }
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            android.widget.ImageView imageView = new android.widget.ImageView(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(bitmap);
            frameLayout.addView(imageView);
            nVar.c(frameLayout);
        }
        super.G(params);
        return 0;
    }

    @Override // tn0.w0
    public org.json.JSONObject I() {
        return this.T1;
    }

    @Override // tn0.w0
    public org.json.JSONObject K() {
        return W0();
    }

    @Override // tn0.w0
    public fo0.n O() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LiveCoreAnchor", "getLiveMiniManager not support.");
        return this.f502300p;
    }

    public final void T0(cl0.g gVar) {
        java.lang.String str;
        int i17;
        zn0.v d17;
        org.json.JSONObject jSONObject = U().f555852w;
        if (jSONObject != null) {
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("list");
            int length = optJSONArray != null ? optJSONArray.length() : 0;
            for (int i18 = 0; i18 < length; i18++) {
                org.json.JSONObject optJSONObject = optJSONArray != null ? optJSONArray.optJSONObject(i18) : null;
                int optInt = optJSONObject != null ? optJSONObject.optInt("us", 0) : 0;
                if (optJSONObject == null || (str = optJSONObject.optString(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.UID)) == null) {
                    str = "";
                } else {
                    zn0.v d18 = zn0.x.f555947a.d(str);
                    if (d18 != null) {
                        if (d18.f555943h <= this.T.f391035a) {
                            java.util.regex.Pattern pattern = pm0.v.f438335a;
                            optInt |= 1;
                        } else {
                            java.util.regex.Pattern pattern2 = pm0.v.f438335a;
                            optInt &= -2;
                        }
                    }
                }
                zn0.a0 U = U();
                com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser tRTCMixUser = (com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser) U.f555851v.get(str);
                if (tRTCMixUser != null && (d17 = zn0.x.f555947a.d(str)) != null) {
                    optInt = U.a(d17.f555945m, tRTCMixUser, optInt);
                }
                U().getClass();
                if (fn0.g.f345728a.o(str)) {
                    java.util.regex.Pattern pattern3 = pm0.v.f438335a;
                    i17 = optInt | 16;
                } else {
                    java.util.regex.Pattern pattern4 = pm0.v.f438335a;
                    i17 = optInt & (-17);
                }
                if (optJSONObject != null) {
                    optJSONObject.putOpt("us", java.lang.Integer.valueOf(i17));
                }
            }
            if (U().k()) {
                gVar.s("am", jSONObject.toString());
            } else {
                gVar.s("m", jSONObject.toString());
            }
        }
    }

    public final void U0(cl0.g gVar) {
        if (this.f374303a2 != -1) {
            cl0.g gVar2 = new cl0.g();
            gVar2.o("recordScreenScene", this.f374303a2);
            gVar.h("rs", gVar2.toString());
        }
    }

    public final org.json.JSONObject V0() {
        r45.ay1 ay1Var;
        r45.ay1 ay1Var2;
        om2.g gVar;
        om2.g gVar2;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        fn0.g gVar3 = fn0.g.f345728a;
        hn0.g gVar4 = fn0.g.f345729b;
        jSONObject.putOpt("version", java.lang.Integer.valueOf((gVar4 == null || (gVar2 = (om2.g) dk2.ef.f314905a.i(om2.g.class)) == null) ? 0 : gVar2.f427847u));
        java.lang.String str = null;
        r45.yx1 Q6 = (gVar4 == null || (gVar = (om2.g) dk2.ef.f314905a.i(om2.g.class)) == null) ? null : gVar.Q6();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        if (Q6 != null) {
            java.lang.String str2 = Q6.f473002r;
            if (str2 == null) {
                str2 = "";
            }
            jSONObject2.putOpt(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.UID, str2);
            java.lang.String str3 = Q6.f472992e;
            if (str3 == null) {
                str3 = "";
            }
            jSONObject2.putOpt("uiqId", str3);
            r45.by1 by1Var = Q6.f472999o;
            jSONObject2.putOpt("sName", (by1Var == null || (ay1Var2 = by1Var.f452676d) == null) ? null : ay1Var2.f451884e);
            r45.by1 by1Var2 = Q6.f472999o;
            if (by1Var2 != null && (ay1Var = by1Var2.f452676d) != null) {
                str = ay1Var.f451883d;
            }
            jSONObject2.putOpt("sId", str != null ? str : "");
        }
        jSONObject.putOpt("cs", jSONObject2);
        return jSONObject;
    }

    public final org.json.JSONObject W0() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("anchorVolume: ");
        sb6.append(this.S1);
        sb6.append(" micWaveThresHolder: ");
        kn0.d dVar = this.T;
        sb6.append(dVar.f391035a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreAnchor", sb6.toString());
        if (this.S1 <= dVar.f391035a) {
            int i17 = this.Q1;
            java.util.regex.Pattern pattern = pm0.v.f438335a;
            this.Q1 = i17 | 1;
        } else {
            int i18 = this.Q1;
            java.util.regex.Pattern pattern2 = pm0.v.f438335a;
            this.Q1 = i18 & (-2);
        }
        kn0.p pVar = this.D;
        if (pVar.e() || Z()) {
            this.Q1 |= 2;
        } else {
            this.Q1 &= -3;
        }
        if (pVar.f391122i) {
            this.Q1 |= 4;
        } else {
            this.Q1 &= -5;
        }
        java.util.List i19 = kz5.c0.i(9, 3, 4);
        zn0.a0 U = U();
        if (kz5.n0.O(i19, U != null ? java.lang.Integer.valueOf(U.f555849t) : null)) {
            this.Q1 |= 8;
        } else {
            this.Q1 &= -9;
        }
        jSONObject.putOpt("userId", pVar.f391119f);
        jSONObject.putOpt("userStatus", java.lang.Integer.valueOf(this.Q1));
        r45.rm1 rm1Var = this.M;
        jSONObject.putOpt("songId", java.lang.Integer.valueOf(rm1Var != null ? rm1Var.m75939xb282bd08(0) : 0));
        r45.rm1 rm1Var2 = this.M;
        jSONObject.putOpt("songType", java.lang.Integer.valueOf(rm1Var2 != null ? rm1Var2.m75939xb282bd08(2) : 0));
        r45.rm1 rm1Var3 = this.M;
        java.lang.Object m75945x2fec8307 = rm1Var3 != null ? rm1Var3.m75945x2fec8307(1) : null;
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        jSONObject.putOpt("listenId", m75945x2fec8307);
        jSONObject.putOpt("playStatus", java.lang.Integer.valueOf(this.N ? 1 : 0));
        jSONObject.putOpt("st", java.lang.Long.valueOf(c01.id.c()));
        jSONObject.putOpt("newSongComponentStatus", java.lang.Integer.valueOf(this.P));
        jSONObject.putOpt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54497x63979feb, java.lang.Integer.valueOf(this.P1));
        jSONObject.putOpt("as", java.lang.Integer.valueOf(U().B));
        return jSONObject;
    }

    public final cl0.g X0() {
        org.json.JSONObject W0 = W0();
        cl0.g gVar = new cl0.g();
        try {
            hn0.u uVar = hn0.u.f363970e;
            gVar.s("wxT", 16);
            gVar.s("d", W0.toString());
            if (fn0.g.f345728a.g()) {
                gVar.s("ks", V0().toString());
            }
            cl0.g gVar2 = new cl0.g();
            gVar2.s("lm", java.lang.Integer.valueOf(U().f555855z));
            gVar2.s("lsm", java.lang.Integer.valueOf(U().A));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreAnchor", "prepareAnchorSeiInfo liveMode: " + U().f555855z + " subMode: " + U().A);
            gVar.s("lm", gVar2.toString());
            T0(gVar);
            U0(gVar);
        } catch (cl0.f | java.io.IOException unused) {
        }
        this.P1++;
        this.T1 = gVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreAnchor", "genAnchorSeiInfo json:" + gVar + " localSeq: " + this.P1 + " anchorInfoLinkMicJson: " + U().f555852w);
        return gVar;
    }

    public final void Y0(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        android.os.Bundle bundle = new android.os.Bundle();
        if (jSONObject2 != null) {
            bundle.putString("live_cdn_sei_msg", W0().toString());
            if (U().k()) {
                bundle.putString("live_link_mic_info_in_anchor_sei_msg_am", jSONObject2.toString());
            } else {
                bundle.putString("live_link_mic_info_in_anchor_sei_msg", jSONObject2.toString());
            }
        }
        if (jSONObject != null) {
            bundle.putString("LIVE_LINK_MIC_INFO_FULL_SEI_MSG", jSONObject.toString());
        }
        bundle.putString("live_cdn_sei_msg", W0().toString());
        hn0.i iVar = this.A;
        if (iVar != null) {
            iVar.mo57125xf5bc2045(24, bundle);
        }
    }

    public void Z0(java.lang.String str) {
        go0.q1 g17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreAnchor", "refreshMicUserView, userId:" + str);
        if (str == null || (g17 = U().g(str)) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreAnchor", "refreshMicUserView, find renderSurface for userId:" + this.D.f391119f);
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10849x610a91e1 c10849x610a91e1 = this.f502307u;
        com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf c17 = c10849x610a91e1 != null ? c10849x610a91e1.c(g17.f355353d, g17.f355354e) : null;
        if (c17 != null) {
            android.view.TextureView textureView = new android.view.TextureView(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            c17.mo46533x473bda1f(textureView);
            textureView.setSurfaceTextureListener(new in0.g(g17));
        }
    }

    @Override // tn0.w0, vn0.f
    public void a(int i17) {
        super.a(i17);
        this.U1.d();
    }

    public final void a1(java.util.List luaRes) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(luaRes, "luaRes");
        go0.f0 f0Var = this.f502304r;
        p05.p0 effect = this.V1;
        f0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(effect, "effect");
        f0Var.l(new go0.g(f0Var, effect));
        f0Var.l(new in0.k(this, luaRes));
    }

    public final void b1(jz5.l lVar, yz5.a aVar, yz5.a aVar2) {
        go0.f0 f0Var = this.f502304r;
        p05.q0 effect = this.W1;
        f0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(effect, "effect");
        f0Var.l(new go0.h(f0Var, effect));
        f0Var.l(new in0.l(this, lVar, aVar, aVar2));
    }

    public void c1(lo0.b0 b0Var) {
        if (b0Var == null) {
            b0Var = this.Z1;
        } else {
            this.Z1 = b0Var;
        }
        hn0.h.b(this, this.f502307u, b0Var, 0, 4, null);
    }

    @Override // tn0.w0, vn0.f
    public void e(long j17) {
        super.e(j17);
        if (j17 > 0) {
            this.U1.c(1000L, 1000L);
        }
        this.f502292f.mo50293x3498a0(this.R1);
    }

    @Override // tn0.w0
    public void h0() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        kn0.p pVar = this.D;
        pVar.a();
        if (!pVar.f391122i) {
            Q().f502232b = null;
        }
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10849x610a91e1 c10849x610a91e1 = this.f502307u;
        if (c10849x610a91e1 != null) {
            c10849x610a91e1.f(new in0.e(this, elapsedRealtime), new in0.f(this));
        }
    }

    @Override // tn0.w0, zn0.e0
    public void k(org.json.JSONObject jSONObject) {
        Y0(X0(), jSONObject);
    }

    @Override // tn0.w0
    public void m0() {
        super.m0();
        go0.f0 f0Var = this.f502304r;
        f0Var.getClass();
        f0Var.l(new go0.w(f0Var, null));
        ((p05.j0) this.V1).b(null);
        ((p05.l0) this.W1).b(null);
        ((p05.i0) this.X1).b(null);
        this.f502292f.mo50300x3fa464aa(this.R1);
        this.f502313y = null;
        this.f502316z = null;
        this.Z1 = null;
    }

    @Override // hn0.h
    public int n() {
        D(true);
        vn0.e eVar = this.f502297m;
        if (eVar != null) {
            eVar.k();
        }
        this.E = true;
        go0.f0 f0Var = this.f502304r;
        f0Var.h(in0.m.f374296d);
        in0.n nVar = in0.n.f374297d;
        f0Var.getClass();
        go0.f1 f1Var = f0Var.f355300p;
        if (f1Var == null) {
            return 0;
        }
        f1Var.O = nVar;
        return 0;
    }

    @Override // tn0.w0, zn0.e0
    public void o(int i17, int i18) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("live_base_mic_mode_old", i17);
        bundle.putInt("live_base_mic_mode_new", i18);
        hn0.i iVar = this.A;
        if (iVar != null) {
            iVar.mo57125xf5bc2045(38, bundle);
        }
    }

    @Override // tn0.w0, vn0.f
    public void p(int i17, java.lang.String str, android.os.Bundle bundle) {
        java.lang.String debugText = "[-3301]create room fail," + str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(debugText, "debugText");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreError", debugText);
        super.p(i17, str, bundle);
    }

    @Override // tn0.w0, vn0.f
    public void q(java.util.ArrayList arrayList, int i17) {
        super.q(arrayList, i17);
        java.util.ArrayList arrayList2 = zn0.x.f555947a.f555948a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrayList2, "getRemoteUserConfigList(...)");
        synchronized (arrayList2) {
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((zn0.v) it.next()).f555943h = 0;
            }
        }
        this.S1 = 0;
        if (arrayList != null) {
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCVolumeInfo tRTCVolumeInfo = (com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCVolumeInfo) it6.next();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(this.D.f391119f, tRTCVolumeInfo.f57187xce2b2e46)) {
                    this.S1 = tRTCVolumeInfo.f57188xcfaae71a;
                } else {
                    zn0.v d17 = zn0.x.f555947a.d(tRTCVolumeInfo.f57187xce2b2e46);
                    if (d17 != null) {
                        d17.f555943h = tRTCVolumeInfo.f57188xcfaae71a;
                    }
                }
            }
        }
        java.util.ArrayList<? extends android.os.Parcelable> arrayList3 = new java.util.ArrayList<>();
        if (arrayList != null) {
            java.util.Iterator it7 = arrayList.iterator();
            while (it7.hasNext()) {
                com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCVolumeInfo tRTCVolumeInfo2 = (com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCVolumeInfo) it7.next();
                java.lang.String userId = tRTCVolumeInfo2.f57187xce2b2e46;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(userId, "userId");
                arrayList3.add(new com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p824x633fb29.C10829x94b03533(userId, tRTCVolumeInfo2.f57188xcfaae71a, tRTCVolumeInfo2.vad));
            }
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelableArrayList("live_user_volume_info", arrayList3);
        hn0.i iVar = this.A;
        if (iVar != null) {
            iVar.mo57125xf5bc2045(19, bundle);
        }
    }
}
