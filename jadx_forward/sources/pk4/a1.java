package pk4;

/* loaded from: classes15.dex */
public final class a1 implements com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStateChangeListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnErrorListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnPreparedListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnCompletionListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSeekCompleteListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnInfoListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnVideoSizeChangedListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18696xc5bcd349 f437995d;

    public a1(com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18696xc5bcd349 c18696xc5bcd349) {
        this.f437995d = c18696xc5bcd349;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnCompletionListener
    /* renamed from: onCompletion */
    public void mo53280xa6db431b(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 player) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(player, "player");
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18696xc5bcd349 c18696xc5bcd349 = this.f437995d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18696xc5bcd349.f256129h, "onCompletion");
        c18696xc5bcd349.q();
        for (ok4.d report : c18696xc5bcd349.f256128J) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(report, "$this$report");
            report.mo123988xaa8b332c();
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 a4Var = c18696xc5bcd349.f256135q.f438060d;
        if (a4Var != null) {
            a4Var.mo9755xa6db431b();
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnErrorListener
    /* renamed from: onError */
    public void mo53281xaf8aa769(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, int i17, int i18, long j17, long j18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18696xc5bcd349 c18696xc5bcd349 = this.f437995d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(c18696xc5bcd349.f256129h, "onError: type=" + i17 + ", code=" + i18 + ", " + j17 + ", " + j18);
        c18696xc5bcd349.n(new pk4.v0(i18, i17));
        c18696xc5bcd349.m();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 a4Var = c18696xc5bcd349.f256135q.f438060d;
        if (a4Var != null) {
            a4Var.mo9756xaf8aa769(i18, i17);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnInfoListener
    /* renamed from: onInfo */
    public void mo53278xc39adf2d(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, int i17, long j17, long j18, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18696xc5bcd349 c18696xc5bcd349 = this.f437995d;
        if (i17 == 3) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.b4 b4Var = c18696xc5bcd349.f256135q.f438057a;
            if (b4Var != null) {
                b4Var.k(3, 0);
            }
        } else if (i17 == 150) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18696xc5bcd349.f256129h, "loop start");
            pk4.t0 loopStartCallback = c18696xc5bcd349.getLoopStartCallback();
            if (loopStartCallback != null) {
                loopStartCallback.a();
            }
        } else if (i17 == 1006) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18696xc5bcd349.f256129h, "download progress updated");
        } else if (i17 == 1014) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18696xc5bcd349.f256129h, "player stopped");
        } else if (i17 == 105) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18696xc5bcd349.f256129h, "first audio frame rendered");
        } else if (i17 == 106) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18696xc5bcd349.f256129h, "first video frame rendered");
            pk4.s0 s0Var = c18696xc5bcd349.f256135q;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e4 e4Var = s0Var.f438058b;
            if (e4Var != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18696xc5bcd349.f256129h, "notify onTextureUpdate");
                e4Var.v();
                s0Var.f438058b = null;
            }
            if (!c18696xc5bcd349.f256137s) {
                c18696xc5bcd349.f256137s = true;
                java.util.Iterator it = c18696xc5bcd349.f256128J.iterator();
                while (it.hasNext()) {
                    ok4.d report = (ok4.d) it.next();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(report, "$this$report");
                    report.s();
                }
            }
            c18696xc5bcd349.p();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.b4 b4Var2 = c18696xc5bcd349.f256135q.f438057a;
            if (b4Var2 != null) {
                b4Var2.k(i17, 0);
            }
        } else if (i17 == 200) {
            long j19 = c18696xc5bcd349.f256138t;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long currentTimeMillis = java.lang.System.currentTimeMillis() - j19;
            boolean z18 = currentTimeMillis <= 300;
            java.lang.String str = c18696xc5bcd349.f256129h;
            if (z18) {
                pk4.w0 w0Var = new pk4.w0(c18696xc5bcd349);
                c18696xc5bcd349.f256143y = w0Var;
                c18696xc5bcd349.postDelayed(w0Var, 300 - currentTimeMillis);
            } else {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.b4 b4Var3 = c18696xc5bcd349.f256135q.f438057a;
                if (b4Var3 != null) {
                    b4Var3.k(701, 0);
                }
            }
            for (ok4.d report2 : c18696xc5bcd349.f256128J) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(report2, "$this$report");
                report2.e();
            }
        } else if (i17 != 201) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18696xc5bcd349.f256129h, "unhandled event: what=" + i17 + ", (" + j17 + ", " + j18 + ')');
        } else {
            java.lang.String str2 = c18696xc5bcd349.f256129h;
            java.util.Objects.toString(c18696xc5bcd349.f256143y);
            java.lang.Runnable runnable = c18696xc5bcd349.f256143y;
            if (runnable != null) {
                c18696xc5bcd349.removeCallbacks(runnable);
                c18696xc5bcd349.f256143y = null;
            } else {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.b4 b4Var4 = c18696xc5bcd349.f256135q.f438057a;
                if (b4Var4 != null) {
                    b4Var4.k(702, 0);
                }
            }
            for (ok4.d report3 : c18696xc5bcd349.f256128J) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(report3, "$this$report");
                report3.h();
            }
        }
        pk4.x0 x0Var = new pk4.x0(i17, j17, j18);
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18696xc5bcd349.M;
        c18696xc5bcd349.n(x0Var);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnPreparedListener
    /* renamed from: onPrepared */
    public void mo53283x58d5b73c(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18696xc5bcd349 c18696xc5bcd349 = this.f437995d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18696xc5bcd349.f256129h, "onPrepared");
        if (interfaceC26164x73fc6bc6 != null) {
            c18696xc5bcd349.C = (int) java.lang.Long.valueOf(interfaceC26164x73fc6bc6.mo100924x2d67b867(205)).longValue();
        }
        android.view.Surface surface = c18696xc5bcd349.f256136r.f437998e;
        if (surface != null && interfaceC26164x73fc6bc6 != null) {
            interfaceC26164x73fc6bc6.mo100971x42c875eb(surface, 1);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 a4Var = c18696xc5bcd349.f256135q.f438060d;
        if (a4Var != null) {
            a4Var.mo9757x58d5b73c();
        }
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new pk4.z0(c18696xc5bcd349, interfaceC26164x73fc6bc6, null), 3, null);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSeekCompleteListener
    /* renamed from: onSeekComplete */
    public void mo53284xe1fdf750(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18696xc5bcd349 c18696xc5bcd349 = this.f437995d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18696xc5bcd349.f256129h, "onSeekComplete: shouldPlay=" + c18696xc5bcd349.f256132n + ", isPlaying=" + c18696xc5bcd349.mo69311xc00617a4());
        if (c18696xc5bcd349.f256132n) {
            c18696xc5bcd349.mo69330x68ac462();
        }
        for (ok4.d report : c18696xc5bcd349.f256128J) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(report, "$this$report");
            report.q();
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.c4 c4Var = c18696xc5bcd349.f256135q.f438061e;
        if (c4Var != null) {
            c4Var.z(c18696xc5bcd349.f256132n);
        }
        c18696xc5bcd349.f256132n = false;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStateChangeListener
    /* renamed from: onStateChange */
    public void mo53282x4799dc42(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18696xc5bcd349 c18696xc5bcd349 = this.f437995d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18696xc5bcd349.f256129h, "preState=" + i17 + ", curState=" + i18);
        c18696xc5bcd349.f256139u = i18;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnVideoSizeChangedListener
    /* renamed from: onVideoSizeChanged */
    public void mo53285xdc9583f7(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, long j17, long j18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18696xc5bcd349 c18696xc5bcd349 = this.f437995d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18696xc5bcd349.f256129h, "onVideoSizeChanged: " + j17 + " x " + j18);
        int i17 = (int) j17;
        int i18 = (int) j18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18696xc5bcd349.f256129h, "setVideoSize: videoWidth=" + c18696xc5bcd349.f256142x + ", videoHeight=" + c18696xc5bcd349.f256141w + ", width=" + i17 + ", height=" + i18);
        if (c18696xc5bcd349.f256142x != i17 || c18696xc5bcd349.f256141w != i18) {
            c18696xc5bcd349.f256142x = i17;
            c18696xc5bcd349.f256141w = i18;
            c18696xc5bcd349.o();
            c18696xc5bcd349.requestLayout();
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 a4Var = c18696xc5bcd349.f256135q.f438060d;
        if (a4Var != null) {
            a4Var.T4(i17, i18);
        }
    }
}
