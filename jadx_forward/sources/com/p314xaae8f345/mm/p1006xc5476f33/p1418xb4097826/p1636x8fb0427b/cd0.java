package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes11.dex */
public final class cd0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.cd0 f208113a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.cd0();

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(java.lang.String musicId, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicId, "musicId");
        if ((musicId.length() == 0) == true) {
            rk4.z8 z8Var = (rk4.z8) e();
            rk4.z8 z8Var2 = z8Var.nj() ? z8Var : null;
            if (z8Var2 != null) {
                z8Var2.pj();
            }
            if (b21.m.c()) {
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6773x3bf523d8 c6773x3bf523d8 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6773x3bf523d8();
                c6773x3bf523d8.f140989j = 2L;
                c6773x3bf523d8.f140990k = 8L;
                zy2.oc.b(c6773x3bf523d8);
                b21.m.f();
            }
            return false;
        }
        if (z17) {
            if (!f(musicId, true)) {
                return false;
            }
            ((rk4.z8) e()).pj();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMvLogic", "stopMusic");
            return true;
        }
        b21.r b17 = b21.m.b();
        if ((b17 != null ? b17.f98879e : null) == null || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(b17.f98879e, musicId) || !b21.m.c()) {
            return false;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6773x3bf523d8 c6773x3bf523d82 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6773x3bf523d8();
        c6773x3bf523d82.f140989j = 2L;
        c6773x3bf523d82.f140990k = 8L;
        zy2.oc.b(c6773x3bf523d82);
        b21.m.f();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final bw5.ar0 b(android.content.Context context, bw5.ar0 scene) {
        android.content.Intent intent;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        if (context instanceof qk.c9) {
            if (((qk.c9) context).getF191047v()) {
                int ordinal = scene.ordinal();
                return ordinal != 116 ? ordinal != 126 ? ordinal != 134 ? ordinal != 128 ? ordinal != 129 ? scene : bw5.ar0.TingScene_FinderProfileCategoryHalfScreen : bw5.ar0.TingScene_FinderProfileSingerHalfScreen : bw5.ar0.TingScene_FinderProfileAudioHalfScreen : bw5.ar0.TingScene_FinderProfileMusicHalfScreen : bw5.ar0.TingScene_BrandProfileHalfScreen;
            }
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            boolean z17 = false;
            if (activity != null && (intent = activity.getIntent()) != null && lk5.s.c(intent)) {
                z17 = true;
            }
            if (z17 && com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.bd0.f208056a[scene.ordinal()] == 4) {
                return bw5.ar0.TingScene_FinderProfileAudioTabFromFinder;
            }
        }
        return scene;
    }

    public final bw5.lp0 c(r45.zi2 zi2Var, java.lang.String str) {
        bw5.v70 v70Var = new bw5.v70();
        v70Var.y(1);
        bw5.z90 z90Var = new bw5.z90();
        java.lang.String m75945x2fec8307 = zi2Var.m75945x2fec8307(2);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        z90Var.E(m75945x2fec8307);
        java.lang.String m75945x2fec83072 = zi2Var.m75945x2fec8307(3);
        if (m75945x2fec83072 == null) {
            m75945x2fec83072 = "";
        }
        z90Var.C(m75945x2fec83072);
        java.lang.String m75945x2fec83073 = zi2Var.m75945x2fec8307(7);
        if (m75945x2fec83073 == null) {
            m75945x2fec83073 = "";
        }
        z90Var.B(m75945x2fec83073);
        java.lang.String m75945x2fec83074 = zi2Var.m75945x2fec8307(5);
        if (m75945x2fec83074 == null) {
            m75945x2fec83074 = "";
        }
        z90Var.z(m75945x2fec83074);
        java.lang.String m75945x2fec83075 = zi2Var.m75945x2fec8307(6);
        if (m75945x2fec83075 == null) {
            m75945x2fec83075 = "";
        }
        z90Var.y(m75945x2fec83075);
        java.lang.String m75945x2fec83076 = zi2Var.m75945x2fec8307(4);
        if (m75945x2fec83076 == null) {
            m75945x2fec83076 = "";
        }
        z90Var.q(m75945x2fec83076);
        java.lang.String m75945x2fec83077 = zi2Var.m75945x2fec8307(8);
        if (m75945x2fec83077 == null) {
            m75945x2fec83077 = "";
        }
        z90Var.r(m75945x2fec83077);
        java.lang.String m75945x2fec83078 = zi2Var.m75945x2fec8307(0);
        if (m75945x2fec83078 == null) {
            m75945x2fec83078 = "";
        }
        z90Var.A(m75945x2fec83078);
        v70Var.w(z90Var);
        java.lang.String o17 = v70Var.j().o();
        if (o17 == null) {
            o17 = "";
        }
        v70Var.p(o17);
        java.lang.String l17 = v70Var.j().l();
        if (l17 == null) {
            l17 = "";
        }
        v70Var.x(l17);
        java.lang.String c17 = v70Var.j().c();
        v70Var.q(c17 != null ? c17 : "");
        v70Var.t(true);
        bw5.lp0 lp0Var = new bw5.lp0();
        lp0Var.j(v70Var);
        if (str.length() == 0) {
            str = v70Var.m13170xcc16feb8();
        }
        if (str.length() == 0) {
            str = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        }
        lp0Var.g(str);
        return lp0Var;
    }

    public final void d(r45.zi2 musicInfo, java.lang.String musicId, int i17, r45.xs4 xs4Var, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicInfo, "musicInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicId, "musicId");
        b21.r rVar = new b21.r();
        rVar.f98878d = i17;
        rVar.f98879e = musicId;
        rVar.f98891t = musicInfo.m75945x2fec8307(6);
        rVar.f98883i = musicInfo.m75945x2fec8307(4);
        rVar.f98881g = musicInfo.m75945x2fec8307(2);
        rVar.f98882h = musicInfo.m75945x2fec8307(3);
        rVar.f98884m = musicInfo.m75945x2fec8307(8);
        rVar.f98895x = musicInfo.m75945x2fec8307(1);
        rVar.f98887p = musicInfo.m75945x2fec8307(7);
        rVar.f98885n = musicInfo.m75945x2fec8307(5);
        rVar.T = true;
        rVar.P = musicInfo.m75945x2fec8307(0);
        rVar.M = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_new_music_use_network_data_play, bm5.h0.RepairerConfig_Mv_UseNetworkDataPlay_Int, 0) == 1;
        if (!z17) {
            rVar.N = false;
        }
        c21.i iVar = (c21.i) i95.n0.c(c21.i.class);
        b21.t a17 = b21.t.a(musicId, xs4Var);
        ((ll3.j1) iVar).getClass();
        ll3.q0.e(rVar, a17);
        if (xs4Var != null) {
            if (!(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xs4Var.m75945x2fec8307(11)))) {
                xs4Var = null;
            }
            if (xs4Var != null) {
                rVar.P = xs4Var.m75945x2fec8307(11);
            }
        }
        b21.m.i(rVar);
    }

    public final qk.g9 e() {
        return (qk.g9) i95.n0.c(qk.g9.class);
    }

    public final boolean f(java.lang.String playId, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(playId, "playId");
        if (z17) {
            return ((rk4.z8) e()).oj(playId);
        }
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

    public final boolean g(android.content.Context context, r45.zi2 musicSongInfo, java.lang.String musicId, int i17, r45.xs4 xs4Var, boolean z17, bw5.ar0 tingScene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicSongInfo, "musicSongInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicId, "musicId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tingScene, "tingScene");
        if (z17) {
            if (f(musicId, true)) {
                ((rk4.z8) e()).zj();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMvLogic", "stopMusic");
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMvLogic", "playMusic");
            bw5.lp0 c17 = c(musicSongInfo, musicId);
            boolean h17 = il4.l.f373675a.h(context);
            il4.e eVar = new il4.e(null, 0, b(context, tingScene).f106955d, true, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554419, null);
            eVar.f373655s.f373664c = h17;
            qk.g9 e17 = e();
            java.lang.String b17 = c17.b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getClientId(...)");
            ((rk4.z8) e17).qj(b17, c17, eVar);
            return false;
        }
        b21.r b18 = b21.m.b();
        if ((b18 != null ? b18.f98879e : null) == null || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(b18.f98879e, musicId)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMvLogic", "playMusic");
            d(musicSongInfo, musicId, i17, xs4Var, z17);
        } else {
            if (b21.m.c()) {
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6773x3bf523d8 c6773x3bf523d8 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6773x3bf523d8();
                c6773x3bf523d8.f140989j = 2L;
                c6773x3bf523d8.f140990k = 8L;
                zy2.oc.b(c6773x3bf523d8);
                b21.m.j();
                return true;
            }
            d(musicSongInfo, musicId, i17, xs4Var, z17);
        }
        return false;
    }
}
