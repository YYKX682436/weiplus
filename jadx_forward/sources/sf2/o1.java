package sf2;

/* loaded from: classes10.dex */
public final class o1 extends sf2.j0 {

    /* renamed from: d, reason: collision with root package name */
    public final sf2.x f488762d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(sf2.x controller) {
        super(sf2.f0.f488662e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        this.f488762d = controller;
    }

    @Override // sf2.j0
    public void b() {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNormalRoomSongAuditionHelper", "adjustVolumeForAudition");
            m();
            n();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveNormalRoomSongAuditionHelper", "adjustVolumeForAudition error", e17);
        }
    }

    @Override // sf2.j0
    public mm2.j5 d() {
        return (mm2.j5) this.f488762d.m56788xbba4bfc0(mm2.j5.class);
    }

    @Override // sf2.j0
    public android.content.Context e() {
        return this.f488762d.O6();
    }

    @Override // sf2.j0
    public tn0.w0 f() {
        return dk2.ef.f314905a.f();
    }

    @Override // sf2.j0
    public mm2.k5 g() {
        return (mm2.k5) this.f488762d.m56788xbba4bfc0(mm2.k5.class);
    }

    @Override // sf2.j0
    public p3325xe03a0797.p3326xc267989b.y0 h() {
        return new sf2.n1(this);
    }

    @Override // sf2.j0
    public void i() {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNormalRoomSongAuditionHelper", "restoreVolumeAfterAudition");
            o();
            p();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveNormalRoomSongAuditionHelper", "restoreVolumeAfterAudition error", e17);
        }
    }

    public final void m() {
        com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8 T;
        com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a mo30282x5f1b9a9c;
        com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.AudioMusicParam audioMusicParam;
        try {
            tn0.w0 f17 = f();
            java.lang.Integer num = null;
            if (f17 != null && (audioMusicParam = f17.L) != null) {
                num = java.lang.Integer.valueOf(audioMusicParam.f127778id);
            }
            if (num == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNormalRoomSongAuditionHelper", "reduceBgMusicVolume: no bg music playing");
                return;
            }
            if (f17 != null && (T = f17.T()) != null && (mo30282x5f1b9a9c = T.mo30282x5f1b9a9c()) != null) {
                mo30282x5f1b9a9c.mo29057xc0cc2931(num.intValue(), 0);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNormalRoomSongAuditionHelper", "reduceBgMusicVolume: bgMusicId=" + num + ", volume=0");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveNormalRoomSongAuditionHelper", "reduceBgMusicVolume error", e17);
        }
    }

    public final void n() {
        sf2.x xVar = this.f488762d;
        try {
            sf2.e1 e1Var = (sf2.e1) xVar.getStore().m56798x25fe639c(sf2.e1.class);
            if (e1Var == null || !(((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.m6) xVar.m56788xbba4bfc0(mm2.m6.class)).f410784s).mo144003x754a37bb() instanceof mm2.i6)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNormalRoomSongAuditionHelper", "reduceSingSongVolume: not singing or controller not found");
            } else {
                e1Var.k7(0, dh2.c0.f313967e);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNormalRoomSongAuditionHelper", "reduceSingSongVolume: volume=0");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveNormalRoomSongAuditionHelper", "reduceSingSongVolume error", e17);
        }
    }

    public final void o() {
        com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8 T;
        com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a mo30282x5f1b9a9c;
        com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.AudioMusicParam audioMusicParam;
        try {
            tn0.w0 f17 = f();
            java.lang.Integer num = null;
            if (f17 != null && (audioMusicParam = f17.L) != null) {
                num = java.lang.Integer.valueOf(audioMusicParam.f127778id);
            }
            if (num != null) {
                int i17 = f17 != null ? f17.f502311x0 : 100;
                if (f17 != null && (T = f17.T()) != null && (mo30282x5f1b9a9c = T.mo30282x5f1b9a9c()) != null) {
                    mo30282x5f1b9a9c.mo29057xc0cc2931(num.intValue(), i17);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNormalRoomSongAuditionHelper", "restoreBgMusicVolume: bgMusicId=" + num + ", volume=" + i17);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveNormalRoomSongAuditionHelper", "restoreBgMusicVolume error", e17);
        }
    }

    public final void p() {
        try {
            sf2.e1 e1Var = (sf2.e1) this.f488762d.getStore().m56798x25fe639c(sf2.e1.class);
            if (e1Var != null) {
                dh2.c0 c0Var = dh2.c0.f313967e;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNormalRoomSingController", "resetKtvBgmVolumeSource: source=" + c0Var);
                ah2.b f76 = e1Var.f7();
                if (f76 != null) {
                    ((dh2.x) f76).k(c0Var);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNormalRoomSongAuditionHelper", "restoreSingSongVolume: reset AUDITION source");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveNormalRoomSongAuditionHelper", "restoreSingSongVolume error", e17);
        }
    }
}
