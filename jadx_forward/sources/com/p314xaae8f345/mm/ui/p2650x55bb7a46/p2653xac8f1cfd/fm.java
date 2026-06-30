package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.i2.class)
/* loaded from: classes14.dex */
public final class fm extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements sb5.i2 {

    /* renamed from: e, reason: collision with root package name */
    public long f280592e;

    /* renamed from: f, reason: collision with root package name */
    public long f280593f;

    /* renamed from: i, reason: collision with root package name */
    public sb5.h2 f280596i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f280597m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f280598n;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.Boolean f280600p;

    /* renamed from: g, reason: collision with root package name */
    public final x21.l f280594g = new x21.l(false, 1, null);

    /* renamed from: h, reason: collision with root package name */
    public final y21.h f280595h = new y21.h(false, false, 3, null);

    /* renamed from: o, reason: collision with root package name */
    public r45.uc6 f280599o = new r45.uc6();

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void K() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextToSpeechComponent", "onChattingExitAnimStart!!");
        yb5.d mChattingContext = this.f280113d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mChattingContext, "mChattingContext");
        w0(mChattingContext, false);
        com.p314xaae8f345.mm.ui.p2740x696c9db.b1.a();
    }

    public final void m0(int i17) {
        r45.uc6 uc6Var = this.f280599o;
        if (uc6Var == null || uc6Var.f468759d == 0 || uc6Var.f468762g) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6361xb17206ba c6361xb17206ba = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6361xb17206ba();
        r45.uc6 uc6Var2 = this.f280599o;
        c6361xb17206ba.f137114d = uc6Var2.f468760e;
        c6361xb17206ba.f137115e = uc6Var2.f468761f;
        if (uc6Var2.f468763h) {
            c6361xb17206ba.f137118h = 2L;
        } else {
            c6361xb17206ba.f137118h = 1L;
        }
        c6361xb17206ba.f137119i = uc6Var2.f468759d;
        c6361xb17206ba.f137120j = i17;
        c6361xb17206ba.k();
        this.f280599o.f468762g = true;
        this.f280599o = new r45.uc6();
    }

    public final void n0(yb5.d ui6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        ym1.e eVar = ym1.f.f544667h;
        boolean j17 = eVar.j();
        boolean i17 = eVar.i();
        if (j17 || !i17) {
            if (q0()) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ql(ui6));
            }
        } else {
            if (this.f280598n) {
                return;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pl(ui6));
            this.f280598n = true;
        }
    }

    public final void o0(yb5.d ui6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("audio");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        if (((android.media.AudioManager) systemService).getStreamVolume(3) == 0) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rl(ui6));
        }
    }

    public final void p0(yb5.d ui6, java.util.ArrayList inputText, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputText, "inputText");
        android.app.Activity g17 = ui6.g();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.vl vlVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.vl(this, ui6, j17, inputText);
        synchronized (com.p314xaae8f345.mm.ui.p2740x696c9db.b1.class) {
            if (com.p314xaae8f345.mm.ui.p2740x696c9db.b1.f291814a == null) {
                com.p314xaae8f345.mm.ui.p2740x696c9db.b1.f291814a = new android.speech.tts.TextToSpeech(g17.getApplicationContext(), vlVar);
            }
            android.media.AudioManager audioManager = (android.media.AudioManager) g17.getSystemService("audio");
            com.p314xaae8f345.mm.ui.p2740x696c9db.b1.f291815b = audioManager;
            audioManager.setMode(0);
        }
    }

    public final boolean q0() {
        return c01.d9.b().p().n(26, false);
    }

    public void r0(yb5.d ui6, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, java.lang.CharSequence chatText) {
        boolean booleanValue;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatText, "chatText");
        java.util.ArrayList x07 = x0(chatText);
        long m124847x74d37ac6 = msg.m124847x74d37ac6();
        this.f280599o.f468763h = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(msg.Q0());
        this.f280593f = m124847x74d37ac6;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.yl(ui6));
        java.lang.Boolean bool = this.f280600p;
        if (bool != null) {
            booleanValue = bool.booleanValue();
        } else {
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_text_to_speech_stream, false));
            this.f280600p = valueOf;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
            booleanValue = valueOf.booleanValue();
        }
        if (!booleanValue) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextToSpeechComponent", "saveAndPlaySpeech!!");
            u0(ui6, m124847x74d37ac6, msg.I0(), x07, false);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextToSpeechComponent", "saveAndPlaySpeechStream!!");
        long I0 = msg.I0();
        java.lang.String msgText = chatText.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgText, "msgText");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextToSpeechComponent", "saveAndPlaySpeechStream");
        p0(ui6, x07, I0);
        boolean z17 = !q0();
        android.media.AudioManager audioManager = com.p314xaae8f345.mm.ui.p2740x696c9db.b1.f291815b;
        if (audioManager != null) {
            if (z17) {
                audioManager.setSpeakerphoneOn(true);
                com.p314xaae8f345.mm.ui.p2740x696c9db.b1.f291815b.setMode(0);
            } else {
                audioManager.setSpeakerphoneOn(false);
                com.p314xaae8f345.mm.ui.p2740x696c9db.b1.f291815b.setMode(3);
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        if (msgText.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TextToSpeechComponent", "msg is null");
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var3 = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        java.lang.String v07 = v0();
        p3325xe03a0797.p3326xc267989b.y0 y0Var = gm0.j1.b().f354778h.f354678e;
        if (y0Var == null) {
            y0Var = p3325xe03a0797.p3326xc267989b.z0.b();
        }
        pn4.e1 e1Var = new pn4.e1(m124847x74d37ac6, msgText, v07, y0Var);
        e1Var.f438622h = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.em(c0Var3, this, ui6, m124847x74d37ac6, I0, msgText);
        java.lang.String str = e1Var.f438619e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "start trans");
        if (com.p314xaae8f345.mm.vfs.w6.j(e1Var.f())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "already downloaded");
            p3325xe03a0797.p3326xc267989b.l.d(e1Var.f438618d, null, null, new pn4.b1(e1Var, null), 3, null);
            e1Var.h(pn4.u0.f438763e);
        } else {
            e1Var.h(pn4.u0.f438764f);
            p3325xe03a0797.p3326xc267989b.l.d(e1Var.f438618d, null, null, new pn4.c1(e1Var, null), 3, null);
        }
        y21.h hVar = this.f280595h;
        hVar.b(e1Var);
        hVar.f(!q0());
        hVar.c(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.cm(c0Var, this, ui6, m124847x74d37ac6, I0, msgText, f0Var, x07, c0Var2, e1Var));
        hVar.d();
    }

    public final void s0(int i17, long j17, java.lang.String subText) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subText, "subText");
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(j17);
        sb6.append('_');
        sb6.append(i17);
        hashMap.put("utteranceId", sb6.toString());
        synchronized (com.p314xaae8f345.mm.ui.p2740x696c9db.b1.class) {
            if (com.p314xaae8f345.mm.ui.p2740x696c9db.b1.f291814a != null && !android.text.TextUtils.isEmpty(subText)) {
                com.p314xaae8f345.mm.ui.p2740x696c9db.b1.f291814a.speak(subText.toString(), 1, hashMap);
            }
        }
    }

    public final void t0(yb5.d ui6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.zl(this, ui6));
    }

    public final void u0(yb5.d ui6, long j17, long j18, java.util.ArrayList inputText, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputText, "inputText");
        p0(ui6, inputText, j18);
        boolean z18 = !q0();
        android.media.AudioManager audioManager = com.p314xaae8f345.mm.ui.p2740x696c9db.b1.f291815b;
        if (audioManager != null) {
            if (z18) {
                audioManager.setSpeakerphoneOn(true);
                com.p314xaae8f345.mm.ui.p2740x696c9db.b1.f291815b.setMode(0);
            } else {
                audioManager.setSpeakerphoneOn(false);
                com.p314xaae8f345.mm.ui.p2740x696c9db.b1.f291815b.setMode(3);
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        x21.l lVar = this.f280594g;
        lVar.b();
        boolean z19 = !q0();
        java.lang.String str = lVar.f533078b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "switchSpeaker: " + z19);
        x21.c.d(lVar.f533081e, z19, 0, 2, null);
        lVar.c();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xl xlVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xl(inputText, this, c0Var, ui6, j17, j18, f0Var, c0Var2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "setAudioFilePlayStateListener");
        lVar.f533083g = xlVar;
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
        if (c20976x6ba6452a != null) {
            v65.i.b(c20976x6ba6452a, null, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.am(inputText, this, j17, z17, null), 1, null);
        }
    }

    public final java.lang.String v0() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (context == null || context.getCacheDir() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TextToSpeechComponent", "path is empty, MMApplicationContext.getContext() == null");
            return "";
        }
        java.lang.String str = gm0.j1.u().h() + "speech";
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (!(m17.a() ? m17.f294799a.F(m17.f294800b) : false)) {
            com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, m17);
            if (m18.a()) {
                m18.f294799a.r(m18.f294800b);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextToSpeechComponent", "path is not exists, mkdir path: %s", str);
        }
        return str;
    }

    public void w0(yb5.d ui6, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextToSpeechComponent", "stopSpeech!!");
        if (!(this.f280594g.f533079c != null ? r0.d() : true)) {
            x21.l.d(this.f280594g, true, false, 2, null);
            this.f280594g.b();
        }
        if (this.f280595h.a()) {
            y21.h.e(this.f280595h, true, false, 2, null);
        }
        android.speech.tts.TextToSpeech textToSpeech = com.p314xaae8f345.mm.ui.p2740x696c9db.b1.f291814a;
        if (textToSpeech != null && textToSpeech.isSpeaking()) {
            synchronized (com.p314xaae8f345.mm.ui.p2740x696c9db.b1.class) {
                android.speech.tts.TextToSpeech textToSpeech2 = com.p314xaae8f345.mm.ui.p2740x696c9db.b1.f291814a;
                if (textToSpeech2 != null) {
                    textToSpeech2.stop();
                }
            }
        }
        m0(1);
        this.f280596i = null;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f280597m;
        if (b4Var != null) {
            b4Var.d();
        }
        this.f280597m = null;
        if (z17 || this.f280592e != 0 || this.f280593f != 0) {
            t0(ui6);
        }
        this.f280592e = 0L;
        this.f280593f = 0L;
        x21.l lVar = this.f280594g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(lVar.f533078b, "setAudioFilePlayStateListener");
        lVar.f533083g = null;
        this.f280595h.c(null);
    }

    public java.util.ArrayList x0(java.lang.CharSequence msgText) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgText, "msgText");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String[] strArr = {"。", "，", "?", "？", "!", "！", ";", "；", "\n"};
        java.lang.String[] strArr2 = {",", "~", "～", "、", "-", "—", "(", ")", "（", "）", " "};
        int length = msgText.length();
        java.lang.String[] strArr3 = new java.lang.String[length];
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (i17 < length) {
            int i27 = i17 + 1;
            java.lang.String obj = msgText.subSequence(i17, i27).toString();
            strArr3[i17] = obj;
            if (i17 >= i18 + 10) {
                if (i17 < i18 + 22) {
                    if (kz5.z.G(strArr, obj)) {
                        r45.tc6 tc6Var = new r45.tc6();
                        tc6Var.f467848d = msgText.subSequence(i18, i27).toString();
                        tc6Var.f467849e = i18;
                        arrayList.add(tc6Var);
                        i18 = i27;
                        i19 = i18;
                    }
                } else if (kz5.z.G(strArr, obj) || kz5.z.G(strArr2, strArr3[i17])) {
                    r45.tc6 tc6Var2 = new r45.tc6();
                    tc6Var2.f467848d = msgText.subSequence(i18, i27).toString();
                    tc6Var2.f467849e = i18;
                    arrayList.add(tc6Var2);
                    i18 = i27;
                    i19 = i18;
                }
            }
            if (i17 == length - 1 && (i17 == 0 || i19 < i17)) {
                r45.tc6 tc6Var3 = new r45.tc6();
                tc6Var3.f467848d = msgText.subSequence(i18, i27).toString();
                tc6Var3.f467849e = i18;
                arrayList.add(tc6Var3);
                i19 = i27;
            }
            i17 = i27;
        }
        return arrayList;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void y() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextToSpeechComponent", "onChattingExitAnimStart!!");
        yb5.d mChattingContext = this.f280113d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mChattingContext, "mChattingContext");
        w0(mChattingContext, false);
        com.p314xaae8f345.mm.ui.p2740x696c9db.b1.a();
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void z() {
        sb5.z0 z0Var = (sb5.z0) this.f280113d.f542241c.a(sb5.z0.class);
        boolean z17 = (j65.e.b() && j65.e.f()) ? false : 8;
        com.p314xaae8f345.mm.ui.j jVar = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe) z0Var).f281225p;
        boolean z18 = !z17;
        jVar.getClass();
        jVar.f290513m.setVisibility(z18 ? 0 : 8);
    }
}
