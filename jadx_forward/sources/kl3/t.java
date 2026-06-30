package kl3;

/* loaded from: classes16.dex */
public class t extends kl3.q {

    /* renamed from: g, reason: collision with root package name */
    public static kl3.t f390376g;

    /* renamed from: e, reason: collision with root package name */
    public kl3.e f390377e;

    /* renamed from: f, reason: collision with root package name */
    public xl3.b f390378f;

    public t(kl3.e eVar) {
        this.f390377e = eVar;
    }

    public static kl3.t g() {
        kl3.t tVar = f390376g;
        if (tVar == null) {
            throw new java.lang.NullPointerException("must init MusicPlayerManager with your impl logic first!!!");
        }
        if (tVar.f390377e == null) {
            tVar.f390377e = new kl3.r();
        }
        ((ll3.o2) ((cl3.e) i95.n0.c(cl3.e.class))).m134976x2690a4ac();
        return f390376g;
    }

    public static xl3.b k() {
        if (g().f390378f == null) {
            g().f390378f = new xl3.b();
        }
        return g().f390378f;
    }

    public static kl3.e l() {
        return g().f390377e;
    }

    @Override // kl3.q
    public com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l a() {
        b21.r j17 = j();
        return xl3.d.a(j17) ? this.f390374c : (j17 == null || !xl3.d.b(j17.f98878d)) ? this.f390372a : this.f390373b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(b21.r rVar) {
        if (rVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MusicUrlParser", "GetShakeMusicUrl, musicWrapper is null");
        } else {
            boolean m40093xb9aa8b5f = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            boolean m40088x550b09c5 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40088x550b09c5(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a = new com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a();
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(rVar.f98885n) ? rVar.f98887p : rVar.f98885n;
            java.lang.String str2 = rVar.f98886o;
            java.lang.String d17 = xl3.f.d(str, str2, m40093xb9aa8b5f, c19762x487075a);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicUrlParser", "parsePlayUrl mSrc:%s", d17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicUrlParser", "songWifiUrl:%s", rVar.f98885n);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicUrlParser", "isWifi:%d, isQQMusic:%d", java.lang.Integer.valueOf(m40093xb9aa8b5f ? 1 : 0), java.lang.Integer.valueOf(c19762x487075a.f38859x6ac9171 ? 1 : 0));
            boolean z17 = false;
            boolean z18 = m40093xb9aa8b5f ? c19762x487075a.f38859x6ac9171 : false;
            if (!m40088x550b09c5) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicUrlParser", "isNetConnected false, detect right Url to play");
                java.lang.String d18 = xl3.f.d(str, str2, true, c19762x487075a);
                java.lang.String d19 = xl3.f.d(str, str2, false, c19762x487075a);
                if ((d18 == null || !d18.equals(d19)) && !xl3.d.a(rVar)) {
                    if (xl3.d.b(rVar.f98878d)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicUrlParser", "use qqMusicPlayer");
                        if ((gl3.i.b(d18) && gl3.i.c(d18) > 0) == false) {
                            if (gl3.i.b(d19) && gl3.i.c(d19) > 0) {
                                z17 = true;
                            }
                            if (z17) {
                                d18 = d19;
                            }
                        }
                    } else {
                        if (!xl3.e.a(rVar, true)) {
                            d18 = xl3.e.a(rVar, false) ? d19 : "";
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicUrlParser", "use musicPlayer");
                    }
                    if (!android.text.TextUtils.isEmpty(d18) && !d18.equals(d17)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicUrlParser", "reset the mSrc :%s", d18);
                        d17 = d18;
                    }
                }
                d18 = "";
                if (!android.text.TextUtils.isEmpty(d18)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicUrlParser", "reset the mSrc :%s", d18);
                    d17 = d18;
                }
            }
            rVar.Q = d17;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = gl3.h.f354364a;
            if (!android.text.TextUtils.isEmpty(d17)) {
                gl3.h.f354365b.put(d17, java.lang.Boolean.valueOf(z18));
            }
        }
        if (this.f390377e.s(rVar)) {
            d(rVar);
        } else {
            e();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MusicPlayerManager", "prepare is fail, not to play or wait for callback onStart");
        }
    }

    public void i() {
        o();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicPlayerManager", "release");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicBasePlayEngine", "release");
        rl3.t tVar = this.f390373b;
        if (tVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayer", "release");
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc c25323xb43a8cc = tVar.f478811l;
            if (c25323xb43a8cc != null) {
                c25323xb43a8cc.mo93648x41012807();
                tVar.f478811l = null;
            }
            synchronized (tVar.f478767i) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.h5 h5Var = tVar.f478767i[0];
                if (h5Var != null) {
                    ((com.p314xaae8f345.mm.sdk.p2603x2137b148.l5) i95.n0.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.l5.class)).Di(h5Var);
                    tVar.f478767i[0] = null;
                }
            }
        }
        rl3.u uVar = this.f390374c;
        if (uVar != null) {
            try {
                com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d c26520x2c78c47d = uVar.f478827l;
                if (c26520x2c78c47d != null) {
                    c26520x2c78c47d.mo100933x41012807();
                    uVar.f478827l = null;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Music.TPMusicPlayer", e17, "release", new java.lang.Object[0]);
            }
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.f390375d);
        this.f390377e.mo143621x41012807();
        this.f390378f = null;
    }

    public b21.r j() {
        return this.f390377e.o();
    }

    public void m(boolean z17) {
        rl3.p pVar = this.f390372a;
        if (pVar.i()) {
            pVar.f478761c = z17;
        }
        rl3.t tVar = this.f390373b;
        if (tVar.i()) {
            tVar.f478761c = z17;
        }
        rl3.u uVar = this.f390374c;
        if (uVar.i()) {
            uVar.f478761c = z17;
        }
    }

    public void n(b21.r rVar) {
        if (rVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicPlayerManager", "MusicType %d", java.lang.Integer.valueOf(rVar.f98878d));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicPlayerManager", "startPlayNewMusic");
        h(this.f390377e.g(rVar));
    }

    public void o() {
        this.f390372a.mo67222x66343656();
        rl3.t tVar = this.f390373b;
        if (tVar != null) {
            tVar.mo67222x66343656();
        }
        rl3.u uVar = this.f390374c;
        if (uVar != null) {
            uVar.mo67222x66343656();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.f390375d);
    }

    public void p(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicBasePlayEngine", "stopMusicDelayIfPaused, delay_ms:%d", java.lang.Integer.valueOf(i17));
        java.lang.Runnable runnable = this.f390375d;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(runnable);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(runnable, i17);
    }
}
