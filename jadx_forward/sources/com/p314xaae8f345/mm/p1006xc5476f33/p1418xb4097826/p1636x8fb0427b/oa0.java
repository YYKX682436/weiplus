package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes11.dex */
public final class oa0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.oa0 f208835a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.oa0();

    public final b21.r a(r45.hf2 hf2Var, java.lang.String str, int i17) {
        b21.r rVar = new b21.r();
        rVar.f98878d = i17;
        rVar.f98879e = str;
        rVar.f98891t = hf2Var.m75945x2fec8307(3);
        rVar.f98883i = hf2Var.m75945x2fec8307(7);
        rVar.f98881g = hf2Var.m75945x2fec8307(0);
        rVar.f98882h = hf2Var.m75945x2fec8307(1);
        rVar.f98884m = hf2Var.m75945x2fec8307(8);
        rVar.f98895x = hf2Var.m75945x2fec8307(8);
        rVar.f98887p = hf2Var.m75945x2fec8307(4);
        rVar.f98885n = hf2Var.m75945x2fec8307(2);
        rVar.T = true;
        rVar.M = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_new_music_use_network_data_play, bm5.h0.RepairerConfig_Mv_UseNetworkDataPlay_Int, 0) == 1;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(hf2Var.m75945x2fec8307(18))) {
            rVar.P = hf2Var.m75945x2fec8307(18);
        }
        return rVar;
    }

    public final bw5.lp0 b(r45.hf2 musicSongInfo, java.lang.String musicId, r45.xs4 xs4Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicSongInfo, "musicSongInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicId, "musicId");
        bw5.v70 v70Var = new bw5.v70();
        boolean z17 = true;
        v70Var.y(1);
        bw5.z90 z90Var = new bw5.z90();
        z90Var.E(musicSongInfo.m75945x2fec8307(0));
        z90Var.C(musicSongInfo.m75945x2fec8307(1));
        z90Var.B(musicSongInfo.m75945x2fec8307(4));
        z90Var.z(musicSongInfo.m75945x2fec8307(2));
        z90Var.y(musicSongInfo.m75945x2fec8307(3));
        z90Var.q(musicSongInfo.m75945x2fec8307(7));
        z90Var.r(musicSongInfo.m75945x2fec8307(8));
        z90Var.A(musicSongInfo.m75945x2fec8307(18));
        z90Var.w(musicSongInfo.m75945x2fec8307(13));
        z90Var.t(musicSongInfo.m75945x2fec8307(12));
        java.lang.String d17 = z90Var.d();
        if (d17 != null && !r26.n0.N(d17)) {
            z17 = false;
        }
        if (z17 && xs4Var != null) {
            z90Var.t(xs4Var.m75945x2fec8307(6));
        }
        z90Var.x(musicSongInfo.m75945x2fec8307(6));
        v70Var.w(z90Var);
        v70Var.p(v70Var.j().o());
        v70Var.x(v70Var.j().l());
        v70Var.q(v70Var.j().c());
        bw5.lp0 lp0Var = new bw5.lp0();
        lp0Var.j(v70Var);
        lp0Var.g(musicId);
        return lp0Var;
    }

    public final boolean c(java.lang.String playId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(playId, "playId");
        b21.r b17 = b21.m.b();
        if ((b17 != null ? b17.f98879e : null) != null && b17.f98878d == 0 && b21.m.c()) {
            try {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(b17.f98879e, playId)) {
                    return true;
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return false;
    }

    public final void d(r45.hf2 musicSongInfo, java.lang.String musicId, int i17, java.lang.String musicCoverUrl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicSongInfo, "musicSongInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicId, "musicId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicCoverUrl, "musicCoverUrl");
        if (c(musicId)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMvLogic", "same music");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMvLogic", "playMusic");
        b21.r a17 = a(musicSongInfo, musicId, i17);
        c21.i iVar = (c21.i) i95.n0.c(c21.i.class);
        b21.t tVar = new b21.t();
        tVar.f98898a = musicId;
        tVar.f98900c = musicCoverUrl;
        ((ll3.j1) iVar).getClass();
        ll3.q0.e(a17, tVar);
        b21.m.i(a17);
    }

    public final void e(r45.hf2 musicSongInfo, java.lang.String musicId, int i17, r45.xs4 xs4Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicSongInfo, "musicSongInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicId, "musicId");
        if (c(musicId)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMvLogic", "same music");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMvLogic", "playMusic");
        b21.r a17 = a(musicSongInfo, musicId, i17);
        c21.i iVar = (c21.i) i95.n0.c(c21.i.class);
        b21.t a18 = b21.t.a(musicId, xs4Var);
        ((ll3.j1) iVar).getClass();
        ll3.q0.e(a17, a18);
        if (xs4Var != null) {
            if (!(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xs4Var.m75945x2fec8307(11)))) {
                xs4Var = null;
            }
            if (xs4Var != null) {
                a17.P = xs4Var.m75945x2fec8307(11);
            }
        }
        b21.m.i(a17);
    }
}
