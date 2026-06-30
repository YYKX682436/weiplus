package eu2;

@j95.b
/* loaded from: classes2.dex */
public final class b0 extends i95.w {
    public static final du2.l I = du2.l.f325014e;
    public java.lang.ref.WeakReference A;

    /* renamed from: d, reason: collision with root package name */
    public cw2.da f338290d;

    /* renamed from: e, reason: collision with root package name */
    public cw2.wa f338291e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Long f338292f;

    /* renamed from: h, reason: collision with root package name */
    public in5.s0 f338294h;

    /* renamed from: m, reason: collision with root package name */
    public boolean f338296m;

    /* renamed from: n, reason: collision with root package name */
    public long f338297n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f338298o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f338299p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f338300q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.concurrent.Future f338301r;

    /* renamed from: t, reason: collision with root package name */
    public f25.m0 f338303t;

    /* renamed from: u, reason: collision with root package name */
    public android.graphics.Bitmap f338304u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f338305v;

    /* renamed from: w, reason: collision with root package name */
    public ls5.l f338306w;

    /* renamed from: z, reason: collision with root package name */
    public android.content.res.Configuration f338309z;

    /* renamed from: g, reason: collision with root package name */
    public eu2.k f338293g = eu2.k.f338330g;

    /* renamed from: i, reason: collision with root package name */
    public eu2.e f338295i = eu2.e.f338317f;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e2 f338302s = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e2(1000, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.h2.f183749e, null, 4, null);

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f338307x = jz5.h.b(eu2.t.f338342d);

    /* renamed from: y, reason: collision with root package name */
    public final eu2.n f338308y = new eu2.n(this);
    public final java.util.HashSet B = new java.util.HashSet();
    public final jz5.g C = jz5.h.b(eu2.q.f338339d);
    public final jz5.g D = jz5.h.b(eu2.z.f338349d);
    public final jz5.g E = jz5.h.b(eu2.l.f338332d);
    public final jz5.g F = jz5.h.b(eu2.s.f338341d);
    public final eu2.m G = new eu2.m(this);
    public final eu2.a0 H = new eu2.a0(this);

    public static final void Ai(eu2.b0 b0Var, boolean z17) {
        fu2.c wi6 = b0Var.Ui().wi(I);
        eu2.j jVar = wi6 instanceof eu2.j ? (eu2.j) wi6 : null;
        if (jVar != null) {
            jVar.c(z17);
        }
    }

    public static final boolean Bi(eu2.b0 b0Var) {
        if (b0Var.f338298o) {
            return true;
        }
        cw2.da daVar = b0Var.f338290d;
        return daVar != null && daVar.mo58787xc00617a4();
    }

    public final void Di() {
        java.util.concurrent.Future future = this.f338301r;
        if (future != null) {
            future.cancel(true);
        }
        this.f338301r = null;
    }

    public final void Ni() {
        boolean z17;
        boolean z18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoSystemPlayerController", "[cancelPlayerNotification]");
        du2.n Ui = Ui();
        du2.l type = I;
        Ui.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        if (type != Ui.f325022i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerManager", "[cancelPlayerNotification] failed, type = " + type + ", currentBusinessType = " + Ui.f325022i);
            return;
        }
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            z17 = false;
        }
        if (z17 || z65.c.a()) {
            z18 = true;
        } else {
            kb2.b bVar = kb2.b.f387758a;
            z18 = false;
        }
        if (z18) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("FinderSystemPlayerManager", "[cancelPlayerNotification] type = " + type, new java.lang.Object[0]);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerManager", "[cancelPlayerNotification] type = " + type);
        }
        android.os.Bundle bundle = Ui.f325024n;
        bundle.putBoolean("key_need_cancel_notification", true);
        bundle.putBoolean("key_set_session_active", false);
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.r rVar = Ui.f325020g;
        if (rVar != null) {
            rVar.a("COMMAND_SET_ACTIVE_AND_CANCEL_NOTIFICATION", Ui.f325024n, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x013c, code lost:
    
        if (r7 == 9) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final in5.s0 Ri(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 r13) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eu2.b0.Ri(androidx.appcompat.app.AppCompatActivity):in5.s0");
    }

    public final du2.n Ui() {
        return (du2.n) ((jz5.n) this.F).mo141623x754a37bb();
    }

    public final boolean Vi(cw2.wa waVar, java.lang.String str) {
        if (waVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoSystemPlayerController", "[" + str + "] mediaInfo is null!");
            return true;
        }
        if (this.f338293g != eu2.k.f338328e) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoSystemPlayerController", "[" + str + "] currentScene = MINI_VIEW, return!");
        return true;
    }

    public final boolean Zi() {
        android.os.PowerManager powerManager = (android.os.PowerManager) ((jz5.n) this.C).mo141623x754a37bb();
        boolean z17 = !(powerManager != null ? powerManager.isInteractive() : true);
        android.app.KeyguardManager keyguardManager = (android.app.KeyguardManager) ((jz5.n) this.E).mo141623x754a37bb();
        return (keyguardManager != null && keyguardManager.isKeyguardLocked()) || z17;
    }

    public final boolean aj() {
        du2.w wVar = Ui().f325017d;
        if (wVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1637x7c6522f1.ServiceC15002xfa6c787f serviceC15002xfa6c787f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1637x7c6522f1.ServiceC15002xfa6c787f) wVar;
            if (((du2.q) ((jz5.n) serviceC15002xfa6c787f.f210013p).mo141623x754a37bb()).f325031c.contains(java.lang.Integer.valueOf(serviceC15002xfa6c787f.f210014q))) {
                return true;
            }
        }
        return false;
    }

    public final void bj(java.lang.String str) {
        boolean z17;
        boolean z18 = true;
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            z17 = false;
        }
        if (!z17 && !z65.c.a()) {
            kb2.b bVar = kb2.b.f387758a;
            z18 = false;
        }
        if (z18) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("FinderVideoSystemPlayerController", str, new java.lang.Object[0]);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoSystemPlayerController", str);
        }
    }

    public final boolean cj(eu2.k kVar) {
        long j17;
        if (kVar != null) {
            du2.n Ui = Ui();
            du2.l type = I;
            Ui.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
            if (!Ui.f325023m.containsKey(type)) {
                du2.n Ui2 = Ui();
                du2.l lVar = du2.l.f325014e;
                eu2.j jVar = new eu2.j(this);
                Ui2.getClass();
                Ui2.f325023m.put(lVar, jVar);
            }
        }
        du2.n Ui3 = Ui();
        du2.l businessType = I;
        fu2.c wi6 = Ui3.wi(businessType);
        if (wi6 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoSystemPlayerController", "[notifyMediaInfoUpdate] failed! depend is null, currentBusinessType = " + businessType);
            return false;
        }
        int ordinal = this.f338295i.ordinal();
        if (ordinal == 0) {
            j17 = this.f338297n;
        } else {
            if (ordinal != 1 && ordinal != 2) {
                throw new jz5.j();
            }
            j17 = 0;
        }
        int i17 = this.f338298o ? 3 : 2;
        fu2.b bVar = ((eu2.j) wi6).f338325c;
        bVar.f348407a = j17;
        bVar.f348408b = i17;
        bVar.f348409c = 1.0f;
        if (kVar != null) {
            return Ui().Ni(businessType);
        }
        du2.n Ui4 = Ui();
        Ui4.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(businessType, "businessType");
        if (businessType == Ui4.f325022i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerManager", "[updateMediaState] businessType = " + businessType);
            return Ui4.Ni(null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerManager", "[updateMediaState] update state failed! businessType = " + businessType + ", currentBusinessType = " + Ui4.f325022i);
        return false;
    }

    public final void fj(cw2.wa waVar, java.lang.Long l17, eu2.k kVar) {
        if (waVar != null) {
            long m59124x87980ca = waVar.f305632f.m59124x87980ca();
            java.lang.Long l18 = this.f338292f;
            if (l18 != null && m59124x87980ca == l18.longValue()) {
                eu2.k kVar2 = this.f338293g;
                eu2.k kVar3 = eu2.k.f338328e;
                if (kVar2 != kVar3 || kVar == kVar3) {
                    this.f338297n = l17 != null ? l17.longValue() : 0L;
                    this.f338302s.a(new eu2.p(this, waVar, l17));
                }
            }
        }
    }

    public final void hj(eu2.k scene) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.r rVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        if (scene != this.f338293g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoSystemPlayerController", "[releaseSystemPlayer] release failed, scene = " + scene + ", currentScene = " + this.f338293g);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoSystemPlayerController", "[releaseSystemPlayer] playingView = " + this.f338290d + ", scene = " + scene);
        cw2.da daVar = this.f338290d;
        if (daVar != null) {
            daVar.mo58801x360802();
        }
        mj();
        nj();
        Ni();
        if (this.B.isEmpty()) {
            du2.n Ui = Ui();
            Ui.getClass();
            du2.l type = I;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = Ui.f325023m;
            concurrentHashMap.remove(type);
            if (!concurrentHashMap.isEmpty() || (rVar = Ui.f325020g) == null) {
                return;
            }
            rVar.a("COMMAND_DISCONNECT_SERVICE", null, null);
        }
    }

    public final void ij(java.lang.String str) {
        java.lang.Integer num;
        java.lang.String str2;
        r45.qt2 qt2Var;
        java.lang.String m75945x2fec8307;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88;
        android.content.Context context;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r0 a76;
        r45.qt2 qt2Var2;
        java.lang.String m75945x2fec83072;
        i95.m c17 = i95.n0.c(dy1.r.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        dy1.r rVar = (dy1.r) c17;
        java.util.HashMap i17 = kz5.c1.i(new jz5.l("event_time", java.lang.String.valueOf(c01.id.c())));
        java.lang.Long l17 = this.f338292f;
        int ordinal = this.f338293g.ordinal();
        if (ordinal != 0) {
            num = null;
            if (ordinal != 1) {
                in5.s0 s0Var = this.f338294h;
                if (s0Var != null && (context = s0Var.f374654e) != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
                    if (nyVar != null && (a76 = nyVar.a7(-1)) != null && (qt2Var2 = a76.f206817h) != null && (m75945x2fec83072 = qt2Var2.m75945x2fec8307(0)) != null) {
                        str2 = m75945x2fec83072;
                    } else if (nyVar != null) {
                        str2 = nyVar.f216918q;
                    }
                }
                str2 = null;
            } else {
                kd2.q0 q0Var = kd2.p1.N.a().f388320x;
                java.lang.Long valueOf = (q0Var == null || (c14989xf862ae88 = q0Var.f388339g) == null) ? null : java.lang.Long.valueOf(c14989xf862ae88.getFeedId());
                str2 = (q0Var == null || (qt2Var = q0Var.f388336d) == null || (m75945x2fec8307 = qt2Var.m75945x2fec8307(0)) == null) ? "" : m75945x2fec8307;
                num = 1;
                l17 = valueOf;
            }
        } else {
            num = 2;
            str2 = this.f338305v;
        }
        if (num != null) {
            i17.put("lock_scene", java.lang.Integer.valueOf(num.intValue()));
        }
        i17.put("feed_id", pm0.v.u(l17 != null ? l17.longValue() : 0L));
        i17.put("session_id", str2 == null ? "" : str2);
        i17.put("behaviour_session_id", str2 != null ? str2 : "");
        ((cy1.a) rVar).yj(str, null, i17, 1, true);
    }

    public final void mj() {
        bj("[resetController]");
        this.f338297n = 0L;
        this.f338291e = null;
        this.f338292f = null;
        this.f338293g = eu2.k.f338330g;
        this.f338295i = eu2.e.f338317f;
        this.f338304u = null;
        this.f338294h = null;
        this.f338309z = null;
        this.f338290d = null;
        this.f338305v = null;
        this.f338298o = false;
        this.f338299p = false;
        Di();
        fu2.c wi6 = Ui().wi(I);
        if (wi6 == null) {
            return;
        }
        eu2.j jVar = (eu2.j) wi6;
        fu2.b bVar = jVar.f338325c;
        bVar.f348407a = 0L;
        bVar.f348408b = 0;
        bVar.f348409c = 1.0f;
        fu2.a aVar = jVar.f338324b;
        aVar.f348405a = null;
        aVar.f348406b = null;
    }

    public final void nj() {
        cw2.da daVar = this.f338290d;
        if (daVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoSystemPlayerController", "[resetPlayers] playingView = " + daVar + ", mediaid:" + daVar.mo56696x9040359a());
            daVar.mo58801x360802();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = daVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) daVar : null;
            if (c15188xd8bd4bd != null) {
                c15188xd8bd4bd.m61433x70cb65e3(null);
                c15188xd8bd4bd.m61412x49bc1928(null);
            }
            daVar.mo56715xe9d735dd(null);
            daVar.d();
            daVar.b();
        }
        this.f338290d = null;
    }

    public final void oj() {
        cw2.wa waVar;
        if (this.f338293g == eu2.k.f338327d && (waVar = this.f338291e) != null) {
            java.lang.Float valueOf = java.lang.Float.valueOf((float) waVar.f305631e.e().m75942xfb822ef2(24));
            if (!(valueOf.floatValue() > 0.0f)) {
                valueOf = null;
            }
            if (valueOf != null) {
                float floatValue = valueOf.floatValue();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoSystemPlayerController", "[saveProgress]: currentPlayMs = " + this.f338297n);
                ey2.v2 v2Var = (ey2.v2) ((jz5.n) this.D).mo141623x754a37bb();
                long m59124x87980ca = waVar.f305632f.m59124x87980ca();
                long j17 = this.f338297n;
                int i17 = (int) ((((float) j17) / floatValue) * 100);
                long j18 = floatValue;
                ey2.t2 t2Var = ey2.t2.f339049f;
                v2Var.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoStateCacheVM", "[updateProgress] feedId=" + pm0.v.u(m59124x87980ca) + " playTimeMs=" + j17 + " totalTimeMs=" + j18 + " invokeSource=" + t2Var + " progress=" + i17 + " seekMode=3 forceSeek=true");
                ey2.q2 q2Var = (ey2.q2) v2Var.f339089f.get(pm0.v.u(m59124x87980ca));
                if (q2Var != null) {
                    q2Var.f339013c = i17;
                    q2Var.f339014d = j17;
                    q2Var.f339015e = j18;
                    q2Var.f339017g = java.lang.System.currentTimeMillis();
                    q2Var.f339018h = 3;
                    q2Var.f339019i = true;
                }
            }
        }
    }

    public final void pj() {
        cw2.wa waVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88;
        if (this.f338293g != eu2.k.f338327d || (waVar = this.f338291e) == null || (c14989xf862ae88 = waVar.f305632f) == null) {
            return;
        }
        long m59124x87980ca = c14989xf862ae88.m59124x87980ca();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderVideoSystemPlayerController", "[updateEndState]: feed id = ".concat(pm0.v.u(m59124x87980ca)));
        ((ey2.v2) ((jz5.n) this.D).mo141623x754a37bb()).T6(m59124x87980ca);
    }

    public final void qj(cw2.da daVar, eu2.k scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        boolean z17 = false;
        if (daVar != null && daVar.mo58787xc00617a4()) {
            z17 = true;
        }
        eu2.k kVar = this.f338293g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoSystemPlayerController", "[updateSystemPlayer] new scene = " + scene.name() + ", last scene: " + kVar.name() + " isPlaying = " + z17 + ", view = " + daVar + ',');
        if (!rj(daVar != null ? daVar.getF212289y() : null, z17, scene, daVar != null ? java.lang.Long.valueOf(daVar.mo56685x3d7f3f1d()) : null) || kVar == scene) {
            return;
        }
        if (scene == eu2.k.f338327d || scene == eu2.k.f338328e) {
            ij("lock_and_gen_player");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r8.f338292f, (r9 == null || (r6 = r9.f305632f) == null) ? null : java.lang.Long.valueOf(r6.m59124x87980ca())) == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean rj(cw2.wa r9, boolean r10, eu2.k r11, java.lang.Long r12) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eu2.b0.rj(cw2.wa, boolean, eu2.k, java.lang.Long):boolean");
    }

    public final void wi() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoSystemPlayerController", "[abandonAudioFocus]");
        f25.m0 m0Var = this.f338303t;
        if (m0Var != null) {
            i95.m c17 = i95.n0.c(f25.n0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ((f25.n0) c17).yg(m0Var);
        }
        this.f338303t = null;
    }
}
