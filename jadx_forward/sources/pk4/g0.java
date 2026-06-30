package pk4;

/* loaded from: classes15.dex */
public final class g0 implements com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStateChangeListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnErrorListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnPreparedListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnCompletionListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSeekCompleteListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnInfoListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnVideoSizeChangedListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18695xb390043b f438017d;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18695xb390043b c18695xb390043b) {
        this.f438017d = c18695xb390043b;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnCompletionListener
    /* renamed from: onCompletion */
    public void mo53280xa6db431b(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 player) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(player, "player");
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18695xb390043b c18695xb390043b = this.f438017d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18695xb390043b.f256108d, "onCompletion");
        c18695xb390043b.n();
        for (ok4.d report : c18695xb390043b.E) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(report, "$this$report");
            report.mo123988xaa8b332c();
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 a4Var = c18695xb390043b.f256114m.f438067c;
        if (a4Var != null) {
            a4Var.mo9755xa6db431b();
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnErrorListener
    /* renamed from: onError */
    public void mo53281xaf8aa769(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, int i17, int i18, long j17, long j18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18695xb390043b c18695xb390043b = this.f438017d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(c18695xb390043b.f256108d, "onError: type=" + i17 + ", code=" + i18 + ", " + j17 + ", " + j18);
        c18695xb390043b.k(new pk4.a0(i18, i17));
        c18695xb390043b.j();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 a4Var = c18695xb390043b.f256114m.f438067c;
        if (a4Var != null) {
            a4Var.mo9756xaf8aa769(i18, i17);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnInfoListener
    /* renamed from: onInfo */
    public void mo53278xc39adf2d(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, int i17, long j17, long j18, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18695xb390043b c18695xb390043b = this.f438017d;
        if (i17 == 3) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.b4 b4Var = c18695xb390043b.f256114m.f438065a;
            if (b4Var != null) {
                b4Var.k(3, 0);
            }
        } else if (i17 == 108) {
            c18695xb390043b.post(new pk4.c0(c18695xb390043b));
        } else if (i17 == 150) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18695xb390043b.f256108d, "loop start");
            c18695xb390043b.m72027x1d37a1cd();
        } else if (i17 == 1006) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18695xb390043b.f256108d, "download progress updated");
        } else if (i17 == 1014) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18695xb390043b.f256108d, "player stopped");
        } else if (i17 == 105) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18695xb390043b.f256108d, "first audio frame rendered");
        } else if (i17 == 106) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18695xb390043b.f256108d, "first video frame rendered");
            pk4.x xVar = c18695xb390043b.f256114m;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e4 e4Var = xVar.f438066b;
            if (e4Var != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18695xb390043b.f256108d, "notify onTextureUpdate");
                e4Var.v();
                xVar.f438066b = null;
            }
            if (!c18695xb390043b.f256116o) {
                c18695xb390043b.f256116o = true;
                java.util.Iterator it = c18695xb390043b.E.iterator();
                while (it.hasNext()) {
                    ok4.d report = (ok4.d) it.next();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(report, "$this$report");
                    report.s();
                }
            }
            c18695xb390043b.m();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.b4 b4Var2 = c18695xb390043b.f256114m.f438065a;
            if (b4Var2 != null) {
                b4Var2.k(i17, 0);
            }
        } else if (i17 == 200) {
            long j19 = c18695xb390043b.f256117p;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long currentTimeMillis = java.lang.System.currentTimeMillis() - j19;
            boolean z18 = currentTimeMillis <= 300;
            java.lang.String str = c18695xb390043b.f256108d;
            if (z18) {
                pk4.b0 b0Var = new pk4.b0(c18695xb390043b);
                c18695xb390043b.f256125x = b0Var;
                c18695xb390043b.postDelayed(b0Var, 300 - currentTimeMillis);
            } else {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.b4 b4Var3 = c18695xb390043b.f256114m.f438065a;
                if (b4Var3 != null) {
                    b4Var3.k(701, 0);
                }
            }
            for (ok4.d report2 : c18695xb390043b.E) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(report2, "$this$report");
                report2.e();
            }
        } else if (i17 != 201) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18695xb390043b.f256108d, "unhandled event: what=" + i17 + ", (" + j17 + ", " + j18 + ')');
        } else {
            java.lang.String str2 = c18695xb390043b.f256108d;
            java.util.Objects.toString(c18695xb390043b.f256125x);
            java.lang.Runnable runnable = c18695xb390043b.f256125x;
            if (runnable != null) {
                c18695xb390043b.removeCallbacks(runnable);
                c18695xb390043b.f256125x = null;
            } else {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.b4 b4Var4 = c18695xb390043b.f256114m.f438065a;
                if (b4Var4 != null) {
                    b4Var4.k(702, 0);
                }
            }
            for (ok4.d report3 : c18695xb390043b.E) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(report3, "$this$report");
                report3.h();
            }
        }
        pk4.d0 d0Var = new pk4.d0(i17, j17, j18);
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18695xb390043b.G;
        c18695xb390043b.k(d0Var);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnPreparedListener
    /* renamed from: onPrepared */
    public void mo53283x58d5b73c(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18695xb390043b c18695xb390043b = this.f438017d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18695xb390043b.f256108d, "onPrepared");
        mk4.h hVar = c18695xb390043b.f256118q;
        hVar.getClass();
        java.lang.String logTag = c18695xb390043b.f256108d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(logTag, "logTag");
        hVar.f408692f = true;
        hVar.f408688b = logTag.concat(".MMSurfaceViewSwitchHelper");
        if (interfaceC26164x73fc6bc6 != null) {
            java.lang.Long.valueOf(interfaceC26164x73fc6bc6.mo100924x2d67b867(205)).longValue();
        }
        android.view.Surface surface = c18695xb390043b.f256115n.f438021e;
        if (surface != null && interfaceC26164x73fc6bc6 != null) {
            interfaceC26164x73fc6bc6.mo100971x42c875eb(surface, 2);
        }
        hVar.e(c18695xb390043b.f256119r);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 a4Var = c18695xb390043b.f256114m.f438067c;
        if (a4Var != null) {
            a4Var.mo9757x58d5b73c();
        }
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new pk4.f0(interfaceC26164x73fc6bc6, c18695xb390043b, null), 3, null);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSeekCompleteListener
    /* renamed from: onSeekComplete */
    public void mo53284xe1fdf750(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18695xb390043b c18695xb390043b = this.f438017d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18695xb390043b.f256108d, "onSeekComplete: shouldPlay=" + c18695xb390043b.f256111g + ", isPlaying=" + c18695xb390043b.mo69311xc00617a4());
        if (c18695xb390043b.f256111g) {
            c18695xb390043b.mo69330x68ac462();
        }
        for (ok4.d report : c18695xb390043b.E) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(report, "$this$report");
            report.q();
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.c4 c4Var = c18695xb390043b.f256114m.f438068d;
        if (c4Var != null) {
            c4Var.z(c18695xb390043b.f256111g);
        }
        c18695xb390043b.f256111g = false;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStateChangeListener
    /* renamed from: onStateChange */
    public void mo53282x4799dc42(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18695xb390043b c18695xb390043b = this.f438017d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18695xb390043b.f256108d, "preState=" + i17 + ", curState=" + i18);
        c18695xb390043b.f256121t = i18;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnVideoSizeChangedListener
    /* renamed from: onVideoSizeChanged */
    public void mo53285xdc9583f7(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, long j17, long j18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18695xb390043b c18695xb390043b = this.f438017d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18695xb390043b.f256108d, "onVideoSizeChanged: " + j17 + " x " + j18);
        int i17 = (int) j17;
        int i18 = (int) j18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18695xb390043b.f256108d, "setVideoSize: videoWidth=" + c18695xb390043b.f256124w + ", videoHeight=" + c18695xb390043b.f256123v + ", width=" + i17 + ", height=" + i18);
        if (c18695xb390043b.f256124w != i17 || c18695xb390043b.f256123v != i18) {
            c18695xb390043b.f256124w = i17;
            c18695xb390043b.f256123v = i18;
            c18695xb390043b.l();
            c18695xb390043b.f256119r.a(c18695xb390043b.f256124w, c18695xb390043b.f256123v);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 a4Var = c18695xb390043b.f256114m.f438067c;
        if (a4Var != null) {
            a4Var.T4(i17, i18);
        }
    }
}
