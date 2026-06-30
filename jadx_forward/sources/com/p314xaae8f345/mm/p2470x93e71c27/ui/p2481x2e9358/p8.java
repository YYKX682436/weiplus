package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public final class p8 implements z21.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.h9 f272098a;

    public p8(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.h9 h9Var) {
        this.f272098a = h9Var;
    }

    @Override // z21.b
    public void a(java.lang.String[] strArr, java.util.List list) {
        if (strArr == null) {
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.h9 h9Var = this.f272098a;
        h9Var.E = true;
        java.lang.String d07 = kz5.z.d0(strArr, "", null, null, 0, null, null, 62, null);
        h9Var.getClass();
        h9Var.f271887J = d07;
        if (!(list == null || list.isEmpty())) {
            if (h9Var.f271889b.length() == 0) {
                h9Var.f271889b = (java.lang.String) kz5.n0.i0(list);
            }
        }
        if ((d07.length() > 0) && !h9Var.f271890c) {
            h9Var.f271890c = true;
            java.lang.String sttVoiceSessionId = h9Var.f271888a;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.y4 m75444x92b2a53 = h9Var.f271892e.m75444x92b2a53();
            java.lang.String c17 = m75444x92b2a53 != null ? m75444x92b2a53.c() : null;
            if (c17 == null) {
                c17 = "";
            }
            java.lang.String voiceId = h9Var.f271889b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sttVoiceSessionId, "sttVoiceSessionId");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(voiceId, "voiceId");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QuickVoice2TxtReporter", "reportFirstResult sessionId:%s, chatUsername:%s, voiceId:%s", sttVoiceSessionId, c17, voiceId);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("stt_voice_session_id", sttVoiceSessionId);
            hashMap.put("chat_username", c17);
            hashMap.put("voiceid", voiceId);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("sst_long_press_process", hashMap, 35963);
        }
        strArr.toString();
        java.util.Objects.toString(list);
        boolean z17 = h9Var.E;
    }

    @Override // z21.b
    public void b(java.util.List list) {
    }

    @Override // z21.b
    public void c() {
    }

    @Override // z21.b
    public void d(int i17) {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f272098a.Q;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.h9 h9Var = this.f272098a;
        h9Var.Q = null;
        if (h9Var.L) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.QuickVoice2TxtHelper", "onRecognizeFinish duplicate callback, ignore. endFlag=" + i17);
            return;
        }
        this.f272098a.L = true;
        if (this.f272098a.f271887J.length() == 0) {
            this.f272098a.E = false;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.h9 h9Var2 = this.f272098a;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k8 k8Var = h9Var2.M;
        if (k8Var != null) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.u8) k8Var).a(h9Var2.f271887J);
        }
    }

    @Override // z21.b
    public void e(int i17, int i18, int i19, long j17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.h9 h9Var = this.f272098a;
        p3325xe03a0797.p3326xc267989b.l.d(h9Var.f271895h, null, null, new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.o8(i17, h9Var, null), 3, null);
    }

    @Override // z21.b
    public void f(java.lang.String str, boolean z17) {
    }

    @Override // z21.b
    public void g() {
    }
}
