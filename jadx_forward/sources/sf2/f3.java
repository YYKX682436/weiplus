package sf2;

/* loaded from: classes10.dex */
public final class f3 extends sf2.j0 {

    /* renamed from: d, reason: collision with root package name */
    public final sf2.d3 f488670d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(sf2.d3 controller) {
        super(sf2.f0.f488661d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        this.f488670d = controller;
    }

    @Override // sf2.j0
    public void b() {
        try {
            tn0.w0 f17 = f();
            boolean Y = f17 != null ? tn0.w0.Y(f17, null, 1, null) : false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSongAuditionHelper", "adjustVolumeForAudition: isInTRTC=" + Y);
            if (!Y) {
                o();
            } else {
                p();
                n();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveSongAuditionHelper", "adjustVolumeForAudition error", e17);
        }
    }

    @Override // sf2.j0
    public mm2.j5 d() {
        return (mm2.j5) this.f488670d.m56788xbba4bfc0(mm2.j5.class);
    }

    @Override // sf2.j0
    public android.content.Context e() {
        return this.f488670d.O6();
    }

    @Override // sf2.j0
    public tn0.w0 f() {
        return this.f488670d.Q6();
    }

    @Override // sf2.j0
    public mm2.k5 g() {
        return (mm2.k5) this.f488670d.m56788xbba4bfc0(mm2.k5.class);
    }

    @Override // sf2.j0
    public p3325xe03a0797.p3326xc267989b.y0 h() {
        return new sf2.e3(this);
    }

    @Override // sf2.j0
    public void i() {
        try {
            tn0.w0 f17 = f();
            boolean Y = f17 != null ? tn0.w0.Y(f17, null, 1, null) : false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSongAuditionHelper", "restoreVolumeAfterAudition: isInTRTC=" + Y);
            if (Y) {
                r();
                q();
                return;
            }
            try {
                tn0.w0 f18 = f();
                co0.s sVar = f18 instanceof co0.s ? (co0.s) f18 : null;
                hn0.r rVar = sVar != null ? sVar.R1 : null;
                if (rVar != null) {
                    rVar.f363965x.remove(hn0.q.f363940d);
                    rVar.a();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSongAuditionHelper", "restoreCdnVolume: reset AUDITION source");
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveSongAuditionHelper", "restoreCdnVolume error", e17);
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveSongAuditionHelper", "restoreVolumeAfterAudition error", e18);
        }
    }

    public final void m() {
        try {
            if (!(((nm2.a) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) d().f410715g).mo144003x754a37bb()) instanceof nm2.b)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSongAuditionHelper", "onAudioPathChanged: not in listening state, ignore");
                return;
            }
            tn0.w0 f17 = f();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSongAuditionHelper", "onAudioPathChanged: audio environment changed during audition, isInTRTC=" + (f17 != null ? tn0.w0.Y(f17, null, 1, null) : false) + ", re-adjusting volumes");
            b();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveSongAuditionHelper", "onAudioPathChanged error", e17);
        }
    }

    public final void n() {
        sf2.d3 d3Var = this.f488670d;
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = d3Var.f372632e;
            ch2.o2 o2Var = ubVar != null ? (ch2.o2) ubVar.mo57658x143f1b92(ch2.o2.class) : null;
            if (o2Var != null) {
                dh2.c0 c0Var = dh2.c0.f313967e;
                ah2.b k76 = o2Var.k7();
                if (k76 != null) {
                    ((dh2.x) k76).o(0, null, c0Var);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSongAuditionHelper", "reduceBgmVolumeIfSinging: set volume=0 (source=AUDITION), is self singing: " + ((om2.g) d3Var.m56788xbba4bfc0(om2.g.class)).S6());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveSongAuditionHelper", "reduceBgmVolumeIfSinging error", e17);
        }
    }

    public final void o() {
        try {
            tn0.w0 f17 = f();
            co0.s sVar = f17 instanceof co0.s ? (co0.s) f17 : null;
            hn0.r rVar = sVar != null ? sVar.R1 : null;
            if (rVar != null) {
                rVar.f363965x.put(hn0.q.f363940d, 0);
                rVar.a();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSongAuditionHelper", "reduceCdnVolume: 100 -> 0 (source=AUDITION)");
            } else {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reduceCdnVolume failed, visitorTrtcCore is null: ");
                sb6.append(sVar == null);
                sb6.append(", cndPlayerManager is null");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveSongAuditionHelper", sb6.toString());
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveSongAuditionHelper", "reduceCdnVolume error", e17);
        }
    }

    public final void p() {
        try {
            tn0.w0 f17 = f();
            zn0.a0 U = f17 != null ? f17.U() : null;
            if (U == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveSongAuditionHelper", "reduceTrtcRemoteVolume failed, remoteUserManager is null");
                return;
            }
            zn0.f0 f0Var = zn0.f0.AUDITION;
            U.E.put(f0Var, 0);
            U.b();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TRTCRemoteUserManager", "setAllRemoteUserVolume: volume=0, source=" + f0Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSongAuditionHelper", "reduceTrtcRemoteVolume: volume=0 (source=AUDITION)");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveSongAuditionHelper", "reduceTrtcRemoteVolume error", e17);
        }
    }

    public final void q() {
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = this.f488670d.f372632e;
            ch2.o2 o2Var = ubVar != null ? (ch2.o2) ubVar.mo57658x143f1b92(ch2.o2.class) : null;
            if (o2Var != null) {
                dh2.c0 c0Var = dh2.c0.f313967e;
                ah2.b k76 = o2Var.k7();
                if (k76 != null) {
                    ((dh2.x) k76).k(c0Var);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSongAuditionHelper", "restoreBgmVolume: reset AUDITION source");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveSongAuditionHelper", "restoreBgmVolume error", e17);
        }
    }

    public final void r() {
        try {
            tn0.w0 f17 = f();
            zn0.a0 U = f17 != null ? f17.U() : null;
            if (U != null) {
                zn0.f0 f0Var = zn0.f0.AUDITION;
                U.E.remove(f0Var);
                U.b();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TRTCRemoteUserManager", "resetAllRemoteUserVolume: source=" + f0Var);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSongAuditionHelper", "restoreTrtcRemoteVolume: reset AUDITION source");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveSongAuditionHelper", "restoreTrtcRemoteVolume error", e17);
        }
    }
}
