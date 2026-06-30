package rh3;

/* loaded from: classes15.dex */
public class r implements rh3.o {

    /* renamed from: d, reason: collision with root package name */
    public final rh3.o f477214d;

    /* renamed from: e, reason: collision with root package name */
    public final th3.a f477215e;

    public r(rh3.o player) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(player, "player");
        this.f477214d = player;
        this.f477215e = new th3.a();
    }

    public final void a(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f477214d.mo162424xb5887064(), "operate:" + str + " invalid in state:" + mo162423x75286adb());
    }

    @Override // rh3.o
    public void b(boolean z17) {
        this.f477214d.b(z17);
    }

    @Override // rh3.o
    public void c(float f17, float f18) {
        this.f477214d.c(f17, f18);
    }

    @Override // rh3.o
    public void d(rh3.p onePlayContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onePlayContext, "onePlayContext");
        this.f477214d.d(onePlayContext);
    }

    @Override // rh3.o
    public void e(rh3.f listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f477214d.e(listener);
    }

    @Override // rh3.o
    public void f(rh3.e listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f477214d.f(listener);
    }

    @Override // rh3.o
    public void g(rh3.d listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f477214d.g(listener);
    }

    @Override // rh3.o
    /* renamed from: getCurrentPositionMs */
    public long mo162433xddd35a52() {
        int mo162423x75286adb = mo162423x75286adb();
        this.f477215e.getClass();
        boolean z17 = true;
        if (mo162423x75286adb != 1 && mo162423x75286adb != 2 && mo162423x75286adb != 3 && mo162423x75286adb != 4 && mo162423x75286adb != 5 && mo162423x75286adb != 6 && mo162423x75286adb != 8 && mo162423x75286adb != 9 && mo162423x75286adb != 7) {
            z17 = false;
        }
        if (z17) {
            return this.f477214d.mo162433xddd35a52();
        }
        a("getCurrentPosition");
        return -1L;
    }

    @Override // rh3.o
    /* renamed from: getDurationMs */
    public long mo162434x37a7fa50() {
        int mo162423x75286adb = mo162423x75286adb();
        this.f477215e.getClass();
        if (mo162423x75286adb == 4 || mo162423x75286adb == 5 || mo162423x75286adb == 6 || mo162423x75286adb == 8 || mo162423x75286adb == 9 || mo162423x75286adb == 7) {
            return this.f477214d.mo162434x37a7fa50();
        }
        a("getDuration");
        return -1L;
    }

    @Override // rh3.o
    /* renamed from: getState */
    public int mo162423x75286adb() {
        return this.f477214d.mo162423x75286adb();
    }

    @Override // rh3.o
    /* renamed from: getTag */
    public java.lang.String mo162424xb5887064() {
        return this.f477214d.mo162424xb5887064();
    }

    @Override // rh3.o
    /* renamed from: getVideoHeight */
    public int mo162435x463504c() {
        return this.f477214d.mo162435x463504c();
    }

    @Override // rh3.o
    /* renamed from: getVideoWidth */
    public int mo162436x8d5c7601() {
        return this.f477214d.mo162436x8d5c7601();
    }

    @Override // rh3.o
    public void h(rh3.m listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f477214d.h(listener);
    }

    @Override // rh3.o
    public void i(rh3.h listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f477214d.i(listener);
    }

    @Override // rh3.o
    /* renamed from: isPlaying */
    public boolean mo162437xc00617a4() {
        return this.f477214d.mo162437xc00617a4();
    }

    @Override // rh3.o
    public void j(rh3.k listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f477214d.j(listener);
    }

    @Override // rh3.o
    public void k(rh3.n listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f477214d.k(listener);
    }

    @Override // rh3.o
    public void l(rh3.i listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f477214d.l(listener);
    }

    @Override // rh3.o
    public java.lang.Object m() {
        return this.f477214d.m();
    }

    @Override // rh3.o
    public void n(wh3.b mediaSource) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaSource, "mediaSource");
        this.f477214d.n(mediaSource);
    }

    @Override // rh3.o
    public void o(rh3.j listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f477214d.o(listener);
    }

    @Override // rh3.o
    public void p(rh3.l listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f477214d.p(listener);
    }

    @Override // rh3.o
    /* renamed from: pause */
    public void mo162425x65825f6() {
        int mo162423x75286adb = mo162423x75286adb();
        this.f477215e.getClass();
        if (mo162423x75286adb == 5 || mo162423x75286adb == 6 || mo162423x75286adb == 7) {
            this.f477214d.mo162425x65825f6();
        } else {
            a("pause");
        }
    }

    @Override // rh3.o
    /* renamed from: prepareAsync */
    public void mo162426x857611b5() {
        int mo162423x75286adb = mo162423x75286adb();
        this.f477215e.getClass();
        boolean z17 = true;
        if (mo162423x75286adb != 1 && mo162423x75286adb != 8 && mo162423x75286adb != 9) {
            z17 = false;
        }
        if (z17) {
            this.f477214d.mo162426x857611b5();
        } else {
            a("prepareAsync");
        }
    }

    @Override // rh3.o
    public void q(rh3.g listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f477214d.q(listener);
    }

    @Override // rh3.o
    /* renamed from: release */
    public void mo162427x41012807() {
        int mo162423x75286adb = mo162423x75286adb();
        this.f477215e.getClass();
        boolean z17 = true;
        if (mo162423x75286adb != 1 && mo162423x75286adb != 2 && mo162423x75286adb != 3 && mo162423x75286adb != 4 && mo162423x75286adb != 5 && mo162423x75286adb != 6 && mo162423x75286adb != 8 && mo162423x75286adb != 9 && mo162423x75286adb != 7 && mo162423x75286adb != 10) {
            z17 = false;
        }
        if (z17) {
            this.f477214d.mo162427x41012807();
        } else {
            a("release");
        }
    }

    @Override // rh3.o
    /* renamed from: reset */
    public void mo162428x6761d4f() {
        int mo162423x75286adb = mo162423x75286adb();
        this.f477215e.getClass();
        boolean z17 = true;
        if (mo162423x75286adb != 1 && mo162423x75286adb != 2 && mo162423x75286adb != 3 && mo162423x75286adb != 4 && mo162423x75286adb != 5 && mo162423x75286adb != 6 && mo162423x75286adb != 8 && mo162423x75286adb != 9 && mo162423x75286adb != 7 && mo162423x75286adb != 10) {
            z17 = false;
        }
        if (z17) {
            this.f477214d.mo162428x6761d4f();
        } else {
            a("reset");
        }
    }

    @Override // rh3.o
    /* renamed from: seekTo */
    public void mo162429xc9fc1b13(long j17) {
        int mo162423x75286adb = mo162423x75286adb();
        this.f477215e.getClass();
        if (mo162423x75286adb == 4 || mo162423x75286adb == 5 || mo162423x75286adb == 6 || mo162423x75286adb == 7) {
            this.f477214d.mo162429xc9fc1b13(j17);
        } else {
            a("seekTo");
        }
    }

    @Override // rh3.o
    /* renamed from: setOutputMute */
    public void mo162438xd0747cbc(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(mo162424xb5887064(), "setOutputMute:" + z17);
        this.f477214d.mo162438xd0747cbc(z17);
    }

    @Override // rh3.o
    /* renamed from: setPlaySpeedRatio */
    public void mo162439xd079f5a(float f17) {
        this.f477214d.mo162439xd079f5a(f17);
    }

    @Override // rh3.o
    /* renamed from: setSurface */
    public void mo162430x42c875eb(android.view.Surface surface) {
        this.f477214d.mo162430x42c875eb(surface);
    }

    @Override // rh3.o
    /* renamed from: start */
    public void mo162431x68ac462() {
        int mo162423x75286adb = mo162423x75286adb();
        this.f477215e.getClass();
        if (mo162423x75286adb == 4 || mo162423x75286adb == 5 || mo162423x75286adb == 6 || mo162423x75286adb == 7) {
            this.f477214d.mo162431x68ac462();
        } else {
            a("start");
        }
    }

    @Override // rh3.o
    /* renamed from: stop */
    public void mo162432x360802() {
        int mo162423x75286adb = mo162423x75286adb();
        this.f477215e.getClass();
        if (mo162423x75286adb == 3 || mo162423x75286adb == 4 || mo162423x75286adb == 5 || mo162423x75286adb == 8 || mo162423x75286adb == 9 || mo162423x75286adb == 6 || mo162423x75286adb == 7) {
            this.f477214d.mo162432x360802();
        } else {
            a("stop");
        }
    }
}
