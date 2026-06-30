package ll3;

/* loaded from: classes11.dex */
public class j0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f400717n;

    public j0(java.lang.String str) {
        this.f400717n = "MicroMsg.GlobalMusicFloatBallHelper";
        this.f400717n = str;
        b(h0(), "MusicFloatBall");
        Q(2);
        if (h0() == 23) {
            t().f174619f = 18;
        } else if (h0() == 6) {
            t().f174619f = 1;
        }
        g();
    }

    public void e0(b21.r rVar) {
        boolean z17;
        java.lang.String str = this.f400717n;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "addFloatBallForMusic");
        if (u()) {
            z17 = false;
        } else {
            z17 = true;
            a0(true);
        }
        if (!g0(rVar)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "can not hand musicPlayerEvent and ignore");
            return;
        }
        Z(rVar.f98881g);
        V(rVar.f98882h);
        c0("song_id", rVar.f98879e);
        c0("db_music_id", xl3.c.a(rVar));
        q0(rVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onMusicPlayerEvent isFromNewMusicPlayer: %s, newBall: %s", java.lang.Boolean.valueOf(rVar.T), java.lang.Boolean.valueOf(z17));
        if (z17) {
            t().f174618e = rVar.f98878d;
            g();
            f0(rVar);
        }
        r0(rVar);
    }

    public void f0(b21.r rVar) {
        if (rVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f400717n, "addMusicFloatBall isFromNewMusicPlayer: %s", java.lang.Boolean.valueOf(rVar.T));
            if (rVar.T) {
                return;
            }
            j();
        }
    }

    public boolean g0(b21.r rVar) {
        return (rVar == null || rVar.T || rVar.U || h0() != 6) ? false : true;
    }

    public int h0() {
        return 6;
    }

    public java.lang.String i0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d, boolean z17) {
        b21.r b17 = b21.m.b();
        java.lang.String g17 = c12886x91aa2b6d.g("song_id", "~");
        java.lang.String str = b17 == null ? "" : b17.f98879e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f400717n, "onFloatBallInfoRemoved, stop music id:%s current:%s, needStopMusic: %s, isStartPlayMusic: %s, isPlaying: %s", g17, str, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(b21.m.d()), java.lang.Boolean.valueOf(b21.m.c()));
        if (z17 && b17 != null && b21.m.d() && g17.equals(str)) {
            b21.m.j();
        }
        android.view.View view = c12886x91aa2b6d.f174585m;
        if (view != null && (view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.C16628x1b8e963a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.C16628x1b8e963a c16628x1b8e963a = (com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.C16628x1b8e963a) view;
            c16628x1b8e963a.f232205h.mo48814x2efc64();
            kl3.t.g().f(c16628x1b8e963a.f232204g);
        }
        if (z17) {
            return g17;
        }
        return null;
    }

    public void j0(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f4) {
    }

    public void k0(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f4, b21.r rVar) {
    }

    public void l0(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f4) {
        java.lang.String string;
        boolean z17;
        boolean z18 = true;
        if (!(kl3.t.f390376g != null)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f400717n, "floatBallMusicActionListener don't anything, must init MusicPlayerManager first with MusicLogic before!");
            return;
        }
        b21.r rVar = c5722xb16ab0f4.f136045g.f88570c;
        if (rVar == null) {
            rVar = b21.m.b();
        }
        if (rVar != null && !g0(rVar)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f400717n, "onMusicPlayerEvent action: %s, isFromNewMusicPlayer: %s, isFromTingPlayer: %s", java.lang.Integer.valueOf(c5722xb16ab0f4.f136045g.f88569b), java.lang.Boolean.valueOf(rVar.T), java.lang.Boolean.valueOf(rVar.U));
            return;
        }
        int i17 = c5722xb16ab0f4.f136045g.f88569b;
        if (i17 != 0 && i17 != 1) {
            if (i17 != 2) {
                if (i17 == 3) {
                    if (u()) {
                        k0(c5722xb16ab0f4, rVar);
                        return;
                    }
                    return;
                } else if (i17 != 7) {
                    if ((i17 == 13 || i17 == 14) && u() && rVar != null) {
                        Z(rVar.f98881g);
                        V(rVar.f98882h);
                        c0("song_id", rVar.f98879e);
                        c0("db_music_id", xl3.c.a(rVar));
                        r0(rVar);
                        return;
                    }
                    return;
                }
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new ll3.g0(this, c5722xb16ab0f4), 200L);
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.l5.Bi()) {
            string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573852g14);
        } else if (iq.b.a()) {
            string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g17);
        } else {
            ((kg0.r) ((lg0.n) i95.n0.c(lg0.n.class))).getClass();
            if (!vq4.p0.d()) {
                ((kg0.r) ((lg0.n) i95.n0.c(lg0.n.class))).getClass();
                if (!vq4.p0.c() && !iq.b.H() && !iq.b.d()) {
                    if (i95.n0.h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.x0.class)) {
                        java.util.Iterator it = ((java.util.ArrayList) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.b1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.x0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.x0.class))).Bi()).iterator();
                        while (it.hasNext()) {
                            if ((((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11735xd37b16d6) it.next()).f158456f & 4) > 0) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f400717n, "isAnyAppInVOIP, already exist wxa using VOIP");
                                z17 = true;
                                break;
                            }
                        }
                    }
                    z17 = false;
                    if (z17) {
                        string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g17);
                    } else {
                        string = null;
                        if (iq.b.m(null, false, null) || iq.b.n(null, false)) {
                            string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573849g11);
                        } else {
                            iq.b.r();
                        }
                    }
                }
            }
            string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g18);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            z18 = false;
        } else {
            b21.m.j();
            ((ku5.t0) ku5.t0.f394148d).B(new ll3.h0(this, string));
        }
        if (z18) {
            return;
        }
        e0(rVar);
        m0(c5722xb16ab0f4, rVar);
    }

    public void m0(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f4, b21.r rVar) {
    }

    public void n0(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f4) {
    }

    public void o0() {
        pv.j0 j0Var = (pv.j0) i95.n0.c(pv.j0.class);
        int i17 = this.f174665d.H;
        ((ov.p0) j0Var).getClass();
        java.lang.Boolean bool = qp1.w.f447288a;
        b0(i17 & (-3));
    }

    public void p0(b21.r rVar) {
        if (u()) {
            return;
        }
        a0(true);
        Z(rVar.f98881g);
        V(rVar.f98882h);
        c0("song_id", rVar.f98879e);
        c0("db_music_id", xl3.c.a(rVar));
        q0(rVar);
        t().f174618e = rVar.f98878d;
        g();
        r0(rVar);
        f0(rVar);
    }

    public void q0(b21.r rVar) {
        if (rVar.T) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.f174665d;
        pv.j0 j0Var = (pv.j0) i95.n0.c(pv.j0.class);
        int i17 = this.f174665d.H;
        ((ov.p0) j0Var).getClass();
        java.lang.Boolean bool = qp1.w.f447288a;
        c12886x91aa2b6d.H = i17 | 2;
        b0(this.f174665d.H);
    }

    public final void r0(b21.r rVar) {
        if (rVar.T) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.f174665d;
        if (c12886x91aa2b6d.f174585m == null) {
            c12886x91aa2b6d.f174585m = new com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.C16628x1b8e963a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, null);
        }
        android.view.View view = this.f174665d.f174585m;
        if (view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.C16628x1b8e963a) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.C16628x1b8e963a) view).m67225x65da7830(rVar);
            com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.C16628x1b8e963a c16628x1b8e963a = (com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.C16628x1b8e963a) this.f174665d.f174585m;
            c16628x1b8e963a.f232205h.mo48813x58998cd();
            kl3.t g17 = kl3.t.g();
            com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.k kVar = c16628x1b8e963a.f232204g;
            rl3.b bVar = (rl3.b) g17.a();
            if (kVar == null) {
                bVar.getClass();
                return;
            }
            java.util.LinkedList linkedList = bVar.f478768j;
            if (linkedList.contains(kVar)) {
                return;
            }
            linkedList.add(kVar);
        }
    }
}
