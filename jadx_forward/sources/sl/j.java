package sl;

/* loaded from: classes12.dex */
public class j implements com.p314xaae8f345.mm.p944x882e457a.c1 {

    /* renamed from: q, reason: collision with root package name */
    public static java.lang.String f490560q;

    /* renamed from: a, reason: collision with root package name */
    public tl.h f490561a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f490562b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f490563c;

    /* renamed from: d, reason: collision with root package name */
    public final int f490564d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.z0 f490565e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.b1 f490566f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.w0 f490567g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f490568h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f490569i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f490570j;

    /* renamed from: k, reason: collision with root package name */
    public final float f490571k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.List f490572l;

    /* renamed from: m, reason: collision with root package name */
    public final fl.a f490573m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f490574n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.y0 f490575o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.x0 f490576p;

    public j(android.content.Context context, int i17, float f17) {
        this(context, i17);
        this.f490571k = f17;
    }

    public double a() {
        tl.h hVar = this.f490561a;
        if (hVar == null) {
            return 0.0d;
        }
        return hVar.c();
    }

    public boolean b() {
        tl.h hVar = this.f490561a;
        return hVar != null && hVar.mo166727x2fe4f2e8() == 2;
    }

    public boolean c() {
        tl.h hVar = this.f490561a;
        if (hVar == null) {
            return false;
        }
        return hVar.mo166728xc00617a4();
    }

    public boolean d(boolean z17) {
        com.p314xaae8f345.mm.p944x882e457a.z0 z0Var;
        com.p314xaae8f345.mm.p944x882e457a.w0 w0Var;
        if (this.f490561a == null) {
            return false;
        }
        com.p314xaae8f345.mm.p944x882e457a.w0 w0Var2 = this.f490567g;
        fl.a aVar = this.f490573m;
        if (w0Var2 != null) {
            boolean D = aVar.D(z17, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoicePlayer", "back pause ret:%s", java.lang.Boolean.valueOf(D));
            if (D && (w0Var = this.f490567g) != null) {
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.v0) w0Var).q(true);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoicePlayer", "backplay Player abandonFocus focus helper, needFocusOnPlay: %s, hasAudioFocus: %s", java.lang.Boolean.valueOf(this.f490569i), java.lang.Boolean.FALSE);
            return D;
        }
        boolean D2 = aVar.D(z17, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoicePlayer", "pause ret:%s", java.lang.Boolean.valueOf(D2));
        if (D2 && (z0Var = this.f490565e) != null) {
            z0Var.c(z17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoicePlayer", "jacks Player abandonFocus focus helper, needFocusOnPlay: %s, hasAudioFocus: %s", java.lang.Boolean.valueOf(this.f490569i), java.lang.Boolean.FALSE);
        return D2;
    }

    public boolean e() {
        if (this.f490561a == null) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoicePlayer", "resume");
        fl.a aVar = this.f490573m;
        tl.h hVar = aVar.f345224q;
        boolean mo166730xc84dc82d = hVar != null ? hVar.mo166730xc84dc82d() : false;
        if (mo166730xc84dc82d) {
            aVar.r("music", 2);
            if (ym1.f.f544667h.i()) {
                aVar.f345223p = false;
            }
            aVar.A(aVar.f345223p);
        }
        if (!aVar.f345222o) {
            if (j65.e.g()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoiceAudioManager", "resumePlaying set mute false");
                tl.h hVar2 = aVar.f345224q;
                if (hVar2 != null) {
                    hVar2.mo166732x764d819b(false);
                }
            } else {
                f25.m0 m96 = ((f25.n0) i95.n0.c(f25.n0.class)).m9(f25.j0.f340633c, aVar.f345218k);
                aVar.f345219l = m96;
                aVar.f345222o = m96 != null ? ((g25.e) m96).f349513c : false;
            }
        }
        com.p314xaae8f345.mm.p944x882e457a.w0 w0Var = this.f490567g;
        if (w0Var != null) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.v0) w0Var).q(false);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoicePlayer", "jacks Player requestFocus focus helper, needFocusOnPlay: %s, hasAudioFocus: %s", java.lang.Boolean.valueOf(this.f490569i), java.lang.Boolean.FALSE);
        return mo166730xc84dc82d;
    }

    public void f(boolean z17) {
        this.f490573m.a(z17);
    }

    public boolean g(java.lang.String str, boolean z17, boolean z18, int i17) {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(z18);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i17);
        int i18 = this.f490564d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoicePlayer", "start file name:[%s] speakerOn:[%b], isFullPath: %s, type: %s, userType: %s", str, valueOf, valueOf2, valueOf3, java.lang.Integer.valueOf(i18));
        iz5.a.g(null, str.length() > 0);
        f490560q = this.f490568h;
        this.f490568h = str;
        if (!com.p314xaae8f345.mm.vfs.w6.j(z18 ? str : ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).vj(bm5.y.f104290j, str, false))) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = str;
            if (!z18) {
                str = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).vj(bm5.y.f104290j, str, false);
            }
            objArr[1] = str;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SceneVoicePlayer", "start, file %s not exist!, fullPath: %s", objArr);
            return false;
        }
        if (i17 == -1) {
            i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? -1 : w21.v0.g(bm5.y.f104290j, str, i18, z18) ? 0 : w21.v0.h(str, i18, z18) ? 2 : 1;
        }
        android.content.Context context = this.f490562b;
        if (i17 == 0) {
            if (context != null) {
                this.f490561a = new w21.d1(context);
            } else {
                this.f490561a = new w21.d1();
            }
        } else if (i17 == 1) {
            if (context != null) {
                this.f490561a = new w21.i0(context);
            } else {
                this.f490561a = new w21.i0();
            }
        } else if (i17 == 2) {
            float f17 = this.f490571k;
            if (context != null) {
                this.f490561a = new w21.d0(context, f17);
            } else {
                this.f490561a = new w21.d0(f17);
            }
            this.f490561a.d(new sl.b(this));
        }
        tl.h hVar = this.f490561a;
        fl.a aVar = this.f490573m;
        if (hVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoicePlayer", "init player success %s", java.lang.Integer.valueOf(hashCode()));
            aVar.f345224q = this.f490561a;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SceneVoicePlayer", "init player failed %s", java.lang.Integer.valueOf(hashCode()));
        }
        aVar.F();
        aVar.f345223p = z17;
        if (ym1.f.Ri() || ym1.f.Ni()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoicePlayer", "headset plugged: %b, bluetoothon: %b", java.lang.Boolean.valueOf(ym1.f.Ri()), java.lang.Boolean.valueOf(ym1.f.Ni()));
            aVar.f345223p = false;
        }
        aVar.A(aVar.f345223p);
        sl.i iVar = new sl.i(this);
        tl.h hVar2 = this.f490561a;
        if (hVar2 != null) {
            hVar2.b(iVar);
        }
        sl.d dVar = new sl.d(this);
        tl.h hVar3 = this.f490561a;
        if (hVar3 != null) {
            hVar3.a(dVar);
        }
        if (!z18) {
            str = i18 == 0 ? ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).vj(bm5.y.f104290j, str, false) : null;
        }
        aVar.G(str, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoicePlayer", "jacks Player requestFocus focus helper, needFocusOnPlay: %s", java.lang.Boolean.valueOf(this.f490569i));
        return true;
    }

    public void h(boolean z17) {
        com.p314xaae8f345.mm.p944x882e457a.b1 b1Var;
        tl.h hVar = this.f490561a;
        if (hVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SceneVoicePlayer", "stop player failed cause player is null %s", java.lang.Integer.valueOf(hashCode()));
            return;
        }
        hVar.mo166733x360802();
        this.f490561a.b(null);
        this.f490561a.d(null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoicePlayer", "stop player abandon focus, needFocusOnPlay: %s, hasAudioFocus: %s, abandonFocusOnStop: %s", java.lang.Boolean.valueOf(this.f490569i), java.lang.Boolean.FALSE, java.lang.Boolean.valueOf(this.f490570j));
        fl.a aVar = this.f490573m;
        aVar.v();
        if (aVar.f345222o && aVar.f345221n) {
            f25.m0 m0Var = aVar.f345219l;
            if (m0Var != null) {
                ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
            }
            aVar.f345219l = null;
            aVar.f345222o = false;
        }
        if (z17 || (b1Var = this.f490566f) == null) {
            return;
        }
        b1Var.mo47945xc39f8281();
    }

    public void i() {
        this.f490573m.getClass();
        ym1.f.f544667h.o("music");
    }

    public j(android.content.Context context, int i17) {
        this.f490561a = null;
        this.f490562b = null;
        this.f490563c = false;
        this.f490564d = 0;
        this.f490568h = null;
        this.f490569i = true;
        this.f490570j = true;
        this.f490571k = 1.0f;
        this.f490572l = new java.util.ArrayList();
        this.f490574n = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C20070x20b51afb()) == 1;
        this.f490575o = null;
        this.f490562b = context instanceof android.app.Activity ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a : context;
        this.f490564d = i17;
        this.f490573m = new fl.a(new sl.a(this));
    }
}
