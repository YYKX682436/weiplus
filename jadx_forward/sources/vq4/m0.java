package vq4;

/* loaded from: classes14.dex */
public final class m0 implements vq4.z {
    public boolean A;
    public com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f B;
    public boolean C;

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f520870a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.C21000x8b2f716 f520871b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.s7 f520872c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f520874e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.l f520875f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f520877h;

    /* renamed from: i, reason: collision with root package name */
    public long f520878i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f520879j;

    /* renamed from: m, reason: collision with root package name */
    public vq4.o0 f520882m;

    /* renamed from: n, reason: collision with root package name */
    public final f25.f f520883n;

    /* renamed from: o, reason: collision with root package name */
    public f25.m0 f520884o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f520885p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f520886q;

    /* renamed from: r, reason: collision with root package name */
    public cv.v0 f520887r;

    /* renamed from: s, reason: collision with root package name */
    public cv.v0 f520888s;

    /* renamed from: t, reason: collision with root package name */
    public cv.v0 f520889t;

    /* renamed from: u, reason: collision with root package name */
    public final xm1.o f520890u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f520891v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f520892w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f520893x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f520894y;

    /* renamed from: z, reason: collision with root package name */
    public rq4.t f520895z;

    /* renamed from: d, reason: collision with root package name */
    public long f520873d = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f520876g = -1;

    /* renamed from: k, reason: collision with root package name */
    public long f520880k = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f520881l = -1;

    public m0() {
        vq4.i0 i0Var = new vq4.i0(this);
        this.f520883n = i0Var;
        this.f520886q = vq4.b0.f();
        this.f520890u = new xm1.o(new vq4.e0(this));
        f25.m0 m96 = ((f25.n0) i95.n0.c(f25.n0.class)).m9(f25.h0.f340630c, i0Var);
        this.f520884o = m96;
        if (m96 != null && ((g25.e) m96).f349513c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIP.VoIPAudioManager", "requestAudioFocus: gain focus");
            k(false);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIP.VoIPAudioManager", "requestAudioFocus: not gain focus");
            k(true);
        }
        this.f520870a = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("mSensorHandler");
        this.f520895z = new rq4.t();
        this.f520879j = b();
        this.A = true;
    }

    public int a() {
        cv.v0 v0Var;
        if (!mx3.f0.h()) {
            cv.v0 v0Var2 = this.f520889t;
            if (v0Var2 != null) {
                return v0Var2.f304049a;
            }
            return -1;
        }
        if (this.C) {
            v0Var = this.f520887r;
            if (v0Var == null) {
                return -1;
            }
        } else {
            v0Var = this.f520888s;
            if (v0Var == null) {
                return -1;
            }
        }
        return v0Var.f304049a;
    }

    public boolean b() {
        this.f520890u.getClass();
        return ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Vi();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        if ((r0 != null && r0.f304049a == 2) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0085, code lost:
    
        if ((r0 != null && r0.f304049a == 2) == false) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(boolean r12) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vq4.m0.c(boolean):void");
    }

    public void d() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "end");
        bundle.putInt("streamType", ym1.f.f544667h.g(((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Vi()));
        ((mx3.u) ((mx3.j) i95.n0.c(mx3.j.class))).Bi(mx3.i.VOIP, bundle);
    }

    public void e(java.lang.String username, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("isVideoCall", !z17 ? 1 : 0);
        bundle.putString(dm.i4.f66875xa013b0d5, username);
        bundle.putBoolean("isOutCall", z18);
        int i17 = this.f520881l;
        boolean z19 = false;
        if (i17 != -1 ? i17 == 1 : !(z18 && !z17)) {
            z19 = true;
        }
        bundle.putBoolean("isSpeakOn", z19);
        bundle.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "start");
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h2 Bi = gq4.v.Bi();
        long j17 = Bi != null ? Bi.f258113w : 0L;
        long currentTimeMillis = j17 > 0 ? java.lang.System.currentTimeMillis() - j17 : 0L;
        bundle.putLong("seekStartMs", currentTimeMillis);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIP.VoIPAudioManager", "continuePlayStartRing username:" + username + ", isVideoCall:" + z17 + ", isOutCall:" + z18 + ", seekStart:" + currentTimeMillis);
        this.C = ((mx3.u) ((mx3.j) i95.n0.c(mx3.j.class))).Bi(mx3.i.VOIP, bundle);
    }

    public void f() {
        this.f520890u.b();
        f25.m0 m0Var = this.f520884o;
        if (m0Var != null) {
            ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
        }
        this.f520888s = null;
        this.f520887r = null;
        this.f520884o = null;
        j();
    }

    public final void g() {
        java.lang.String r17;
        java.lang.String str;
        if (this.f520882m == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIP.VoIPAudioManager", "current state machine not init,wait connect to conntinue play");
            return;
        }
        h();
        vq4.o0 o0Var = this.f520882m;
        if (o0Var != null) {
            if (!this.A || !vq4.n0.e(o0Var.f520902a)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIP.VoIPAudioManager", "not allow to play tts cause " + this.A + " && " + vq4.n0.e(o0Var.f520902a));
                return;
            }
            this.A = false;
            if (this.f520892w || !nq4.f.f420547a.a()) {
                if (!this.f520892w) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIP.VoIPAudioManager", "direct play ringtone nor tts cause not support tts");
                }
                java.lang.String str2 = gq4.v.Bi().f258091a.f257964u;
                if (str2 == null) {
                    return;
                }
                e(str2, gq4.v.Bi().f258091a.f257965v, gq4.v.Bi().f258091a.f257966w);
                return;
            }
            java.lang.String str3 = gq4.v.Bi().f258091a.f257964u;
            if (str3 == null) {
                return;
            }
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            java.lang.String e17 = c01.a2.e(str3);
            boolean z17 = gq4.v.Bi().f258091a.f257965v;
            boolean z18 = gq4.v.Bi().f258091a.f257966w;
            if (!ip.b.a()) {
                r17 = z17 ? i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.j4t) : i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.j4v);
            } else if (z17) {
                r17 = e17 + i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.j4s);
            } else {
                r17 = e17 + i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.j4u);
            }
            java.lang.String str4 = r17;
            if (ip.b.a()) {
                if (z17) {
                    str = "video_" + str3 + '_' + e17 + "_showDetail";
                } else {
                    str = "voice_" + str3 + '_' + e17 + "_showDetail";
                }
            } else if (z17) {
                str = "video_" + str3 + '_' + e17 + "_hideDetail";
            } else {
                str = "voice_" + str3 + '_' + e17 + "_hideDetail";
            }
            java.lang.String str5 = str;
            nq4.e eVar = nq4.e.f420541a;
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            eVar.c(context, new vq4.k0(str5, str4, this, str3, z17, z18));
        }
    }

    public final void h() {
        vq4.o0 o0Var = this.f520882m;
        if (o0Var != null) {
            if (!vq4.n0.h(o0Var.f520902a)) {
                int i17 = o0Var.f520902a;
                if (!(258 == i17 || 259 == i17 || 4 == i17 || 5 == i17)) {
                    if (i17 == 262 || i17 == 8) {
                        nq4.f.f420547a.d();
                        return;
                    } else if (this.f520892w) {
                        nq4.f.f420547a.f();
                        return;
                    } else {
                        nq4.f.f420547a.e();
                        return;
                    }
                }
            }
            nq4.f.f420547a.c();
        }
    }

    public void i(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f fVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f fVar2;
        cv.v0 v0Var;
        this.B = fVar;
        if (mx3.f0.h()) {
            int i17 = -1;
            if (!this.C ? (v0Var = this.f520888s) != null : (v0Var = this.f520887r) != null) {
                i17 = v0Var.f304049a;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f fVar3 = this.B;
            if (fVar3 != null) {
                fVar3.K(i17);
            }
        } else {
            cv.v0 v0Var2 = this.f520889t;
            if (v0Var2 != null && (fVar2 = this.B) != null) {
                fVar2.i2(v0Var2);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f fVar4 = this.B;
        if (fVar4 != null) {
            fVar4.q2(this.f520890u.a());
        }
    }

    public void j() {
        java.lang.Class cls;
        int i17;
        java.lang.String feedId;
        int i18;
        java.lang.String feedId2;
        if (this.f520895z != null) {
            this.C = false;
            nx3.a wi6 = ((mx3.u) ((mx3.j) i95.n0.c(mx3.j.class))).wi();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(rq4.q.f480612m, "") && wi6 != null) {
                rq4.q.f480612m = java.lang.String.valueOf(wi6.f422878b);
                rq4.q.f480614o = wi6.f422882f;
                java.lang.String mMusicSid = wi6.f422880d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mMusicSid, "mMusicSid");
                rq4.q.f480620u = mMusicSid;
                java.lang.String mFinderObjectId = wi6.f422881e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mFinderObjectId, "mFinderObjectId");
                rq4.q.f480617r = mFinderObjectId;
                rq4.q.f480611l = java.lang.String.valueOf(wi6.f422879c);
                rq4.q.f480616q = wi6.f422883g;
                rq4.q.f480618s = new jz5.l(java.lang.Integer.valueOf(wi6.f422885i), java.lang.Integer.valueOf(wi6.f422886j));
                rq4.q.f480619t = wi6.f422887k;
                rq4.q.f480621v = wi6.f422890n;
                java.lang.String mPlayErrorMessage = wi6.f422891o;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mPlayErrorMessage, "mPlayErrorMessage");
                rq4.q.f480615p = mPlayErrorMessage;
            }
            rq4.t tVar = this.f520895z;
            if (tVar != null) {
                tVar.f480635b = rq4.q.f480613n;
            }
            if (this.f520892w) {
                java.lang.String mUsername = wi6.f422884h;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mUsername, "mUsername");
                java.lang.String mMusicSid2 = wi6.f422880d;
                java.lang.String mFinderObjectId2 = wi6.f422881e;
                java.lang.String str = (mFinderObjectId2 == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(mFinderObjectId2, "0")) ? mMusicSid2 : mFinderObjectId2;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                mx3.b0.g(mUsername, str);
                rq4.t tVar2 = this.f520895z;
                if (tVar2 != null) {
                    boolean z17 = this.f520893x;
                    java.lang.String mUsername2 = wi6.f422884h;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mUsername2, "mUsername");
                    if (tVar2.f480634a == 0) {
                        tVar2.f480634a = wi6.f422878b;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mMusicSid2, "mMusicSid");
                        tVar2.f480637d = mMusicSid2;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mFinderObjectId2, "mFinderObjectId");
                        tVar2.f480636c = mFinderObjectId2;
                        tVar2.f480638e = wi6.f422877a;
                        int i19 = tVar2.f480640g;
                        long j17 = tVar2.f480641h;
                        int i27 = z17 ? 2 : 1;
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tVar2.f480637d, "0")) {
                            i18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tVar2.f480636c, "0") ? 1 : 2;
                        }
                        if (i18 == 1) {
                            feedId2 = tVar2.f480637d;
                        } else if (i18 == 2) {
                            feedId2 = tVar2.f480636c;
                        }
                        int i28 = tVar2.f480638e ? 2 : 1;
                        boolean z18 = tVar2.f480635b;
                        long j18 = tVar2.f480634a / 1000;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedId2, "feedId");
                        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6837x9b5b39eb c6837x9b5b39eb = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6837x9b5b39eb();
                        cls = mx3.j.class;
                        c6837x9b5b39eb.f141588g = c6837x9b5b39eb.b("feedId", feedId2, true);
                        int i29 = i27;
                        c6837x9b5b39eb.f141589h = i18;
                        c6837x9b5b39eb.f141590i = i28;
                        c6837x9b5b39eb.f141592k = z18 ? 1L : 2L;
                        c6837x9b5b39eb.f141593l = j18;
                        c6837x9b5b39eb.f141591j = c6837x9b5b39eb.b("toUserName", mUsername2, true);
                        c6837x9b5b39eb.f141586e = i19;
                        c6837x9b5b39eb.f141587f = j17;
                        c6837x9b5b39eb.f141585d = i29;
                        c6837x9b5b39eb.k();
                        tVar2.f480634a = 0L;
                        tVar2.f480635b = false;
                        tVar2.f480636c = "0";
                        tVar2.f480637d = "0";
                        tVar2.f480638e = false;
                        tVar2.f480640g = 0;
                        tVar2.f480641h = 0L;
                    }
                }
                cls = mx3.j.class;
            } else {
                cls = mx3.j.class;
                if (tVar != null) {
                    boolean z19 = this.f520893x;
                    java.lang.String mUsername3 = wi6.f422884h;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mUsername3, "mUsername");
                    if (tVar.f480634a == 0 && tVar.f480640g != 0 && tVar.f480641h != 0) {
                        tVar.f480634a = wi6.f422878b;
                        java.lang.String mMusicSid3 = wi6.f422880d;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mMusicSid3, "mMusicSid");
                        tVar.f480637d = mMusicSid3;
                        java.lang.String mFinderObjectId3 = wi6.f422881e;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mFinderObjectId3, "mFinderObjectId");
                        tVar.f480636c = mFinderObjectId3;
                        tVar.f480638e = wi6.f422877a;
                        tVar.f480639f = wi6.f422888l;
                        int i37 = tVar.f480640g;
                        long j19 = tVar.f480641h;
                        int i38 = z19 ? 2 : 1;
                        int i39 = !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tVar.f480637d, "0") ? 1 : !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tVar.f480636c, "0") ? 2 : 3;
                        if (i39 != 1) {
                            i17 = 2;
                            feedId = i39 != 2 ? "0" : tVar.f480636c;
                        } else {
                            i17 = 2;
                            feedId = tVar.f480637d;
                        }
                        int i47 = tVar.f480638e ? i17 : 1;
                        long j27 = tVar.f480634a / 1000;
                        boolean z27 = tVar.f480639f;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedId, "feedId");
                        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6835xe49ef542 c6835xe49ef542 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6835xe49ef542();
                        c6835xe49ef542.f141567i = i38;
                        c6835xe49ef542.f141564f = i39;
                        c6835xe49ef542.f141562d = i37;
                        c6835xe49ef542.f141569k = j19;
                        c6835xe49ef542.f141563e = c6835xe49ef542.b("feedid", feedId, true);
                        c6835xe49ef542.f141565g = i47;
                        c6835xe49ef542.f141566h = c6835xe49ef542.b("tousername", mUsername3, true);
                        c6835xe49ef542.f141568j = j27;
                        c6835xe49ef542.f141570l = z27 ? 1 : 2;
                        c6835xe49ef542.f141571m = wi6.f422889m ? 1L : 2L;
                        c6835xe49ef542.k();
                        tVar.f480634a = 0L;
                        tVar.f480635b = false;
                        tVar.f480636c = "0";
                        tVar.f480637d = "0";
                        tVar.f480638e = false;
                        tVar.f480640g = 0;
                        tVar.f480641h = 0L;
                    }
                }
            }
            this.f520895z = null;
        } else {
            cls = mx3.j.class;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "close");
        ((mx3.u) ((mx3.j) i95.n0.c(cls))).Bi(mx3.i.VOIP, bundle);
    }

    public final void k(boolean z17) {
        if (j65.e.b() && j65.e.g()) {
            yx3.v Ai = ((mx3.u) ((mx3.j) i95.n0.c(mx3.j.class))).Ai();
            if (Ai != null) {
                Ai.f549481h = z17;
                yx3.k kVar = Ai.f549476c;
                if (kVar != null) {
                    kVar.i(z17);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.i1 i1Var = gq4.v.Bi().f258091a.f257944a.A;
            i1Var.R = z17;
            if (i1Var.f258179a != null) {
                i1Var.f258179a.R = z17;
            }
        }
    }

    public final void l(int i17, boolean z17) {
        if (i17 == 3 || i17 == 4) {
            this.f520881l = a();
        }
        this.f520890u.c(i17, z17);
    }

    public boolean m(cv.v0 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        if (mx3.f0.h()) {
            if (this.C) {
                this.f520888s = info;
                this.f520887r = info;
            } else {
                this.f520888s = info;
            }
        }
        this.f520890u.c(info.f304049a, true);
        return true;
    }

    public void n() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f520870a;
        if (n3Var != null) {
            n3Var.mo50293x3498a0(new vq4.l0(this));
        }
    }
}
