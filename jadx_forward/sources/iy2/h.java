package iy2;

/* loaded from: classes15.dex */
public final class h implements z21.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15487x24678974 f377428a;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15487x24678974 c15487x24678974) {
        this.f377428a = c15487x24678974;
    }

    @Override // z21.b
    public void a(java.lang.String[] lst, java.util.List voiceIdSet) {
        android.text.Editable text;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lst, "lst");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(voiceIdSet, "voiceIdSet");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15487x24678974 c15487x24678974 = this.f377428a;
        iy2.e voiceDetectListener = c15487x24678974.getVoiceDetectListener();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(voiceDetectListener);
        iy2.z zVar = (iy2.z) voiceDetectListener;
        if (lst.length > 0 && lst[0].length() > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15489x5c3b8a7a c15489x5c3b8a7a = zVar.f377448a;
            if (c15489x5c3b8a7a.f218311v) {
                c15489x5c3b8a7a.f218311v = false;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = c15489x5c3b8a7a.f218304o;
                if (c22621x7603e017 != null && c22621x7603e017.getText() != null) {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = c15489x5c3b8a7a.f218304o;
                    android.text.Editable text2 = c22621x7603e0172 != null ? c22621x7603e0172.getText() : null;
                    if (!(text2 == null || text2.length() == 0)) {
                        if (r26.i0.p(c15489x5c3b8a7a.f218312w, "。", true) || r26.i0.p(c15489x5c3b8a7a.f218312w, ".", true)) {
                            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0173 = c15489x5c3b8a7a.f218304o;
                            int selectionStart = c22621x7603e0173 != null ? c22621x7603e0173.getSelectionStart() : 0;
                            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0174 = c15489x5c3b8a7a.f218304o;
                            if (selectionStart >= ((c22621x7603e0174 == null || (text = c22621x7603e0174.getText()) == null) ? 0 : text.length())) {
                                iy2.c cVar = c15489x5c3b8a7a.f218314y;
                                if (cVar != null) {
                                    com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0175 = c15489x5c3b8a7a.f218304o;
                                    java.lang.String text3 = c15489x5c3b8a7a.f218312w;
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text3, "text");
                                    cVar.c(c22621x7603e0175, text3, true);
                                }
                                iy2.c cVar2 = c15489x5c3b8a7a.f218314y;
                                if (cVar2 != null) {
                                    cVar2.a(c15489x5c3b8a7a.f218304o);
                                }
                            }
                            c15489x5c3b8a7a.f218312w = "";
                        }
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0176 = c15489x5c3b8a7a.f218304o;
                        java.lang.String valueOf = java.lang.String.valueOf(c22621x7603e0176 != null ? c22621x7603e0176.getText() : null);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c15489x5c3b8a7a.f218296d, "addPunctuation msg = %s,msg.length() = %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(valueOf), java.lang.Integer.valueOf(valueOf.length()));
                    }
                }
            }
            iy2.c cVar3 = c15489x5c3b8a7a.f218314y;
            if (cVar3 != null) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0177 = c15489x5c3b8a7a.f218304o;
                java.lang.String text4 = lst[0];
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text4, "text");
                cVar3.c(c22621x7603e0177, text4, true);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0178 = c15489x5c3b8a7a.f218304o;
            if (c22621x7603e0178 != null) {
                c22621x7603e0178.setCursorVisible(true);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0179 = c15489x5c3b8a7a.f218304o;
            if (c22621x7603e0179 != null) {
                c22621x7603e0179.requestFocus();
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.t0(c15489x5c3b8a7a.f218297e);
            if (!c15489x5c3b8a7a.f218309t && lst[0].length() != 0) {
                c15489x5c3b8a7a.f218309t = true;
                java.lang.System.currentTimeMillis();
                java.lang.System.currentTimeMillis();
            }
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 mmHandler = c15487x24678974.getMmHandler();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mmHandler);
        mmHandler.mo50303x856b99f0(0);
        c15487x24678974.getMmHandler().mo50307xb9e94560(0, c15487x24678974.f218288r);
    }

    @Override // z21.b
    public void b(java.util.List keywords) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keywords, "keywords");
    }

    @Override // z21.b
    public void c() {
    }

    @Override // z21.b
    public void d(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15487x24678974 c15487x24678974 = this.f377428a;
        java.lang.String str = c15487x24678974.f218277d;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 mmHandler = c15487x24678974.getMmHandler();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mmHandler);
        mmHandler.mo50303x856b99f0(0);
        c15487x24678974.getMmHandler().mo50303x856b99f0(1);
        iy2.e voiceDetectListener = c15487x24678974.getVoiceDetectListener();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(voiceDetectListener);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15489x5c3b8a7a c15489x5c3b8a7a = ((iy2.z) voiceDetectListener).f377448a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c15489x5c3b8a7a.f218296d, "VoiceDetectListener onDetectFinish  time %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15489x5c3b8a7a.a(c15489x5c3b8a7a);
        iy2.c cVar = c15489x5c3b8a7a.f218314y;
        if (cVar != null) {
            cVar.b(c15489x5c3b8a7a.f218304o);
        }
        c15489x5c3b8a7a.e();
        android.content.Context context = c15489x5c3b8a7a.f218306q;
        if (context instanceof android.app.Activity) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            ((android.app.Activity) context).getWindow().clearFlags(128);
        }
        iy2.r rVar = c15489x5c3b8a7a.f218303n;
        if (rVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wr) rVar).a(false);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = c15489x5c3b8a7a.f218304o;
        if (c22621x7603e017 != null) {
            c22621x7603e017.setHint((java.lang.CharSequence) null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c15489x5c3b8a7a.f218296d, "resumeMusic");
        co0.s u07 = dk2.ef.f314905a.u0();
        if (u07 != null) {
            u07.f1(false);
        }
        c15487x24678974.f(false);
    }

    @Override // z21.b
    public void e(int i17, int i18, int i19, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15487x24678974 c15487x24678974 = this.f377428a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 mmHandler = c15487x24678974.getMmHandler();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mmHandler);
        mmHandler.mo50303x856b99f0(0);
        c15487x24678974.getMmHandler().mo50303x856b99f0(1);
        android.os.Message message = new android.os.Message();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("localCode", i17);
        bundle.putInt("errType", i18);
        bundle.putInt("errCode", i19);
        message.setData(bundle);
        message.what = c15487x24678974.f218281h;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 callUiHandler = c15487x24678974.getCallUiHandler();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(callUiHandler);
        callUiHandler.mo50308x2936bf5f(message);
    }

    @Override // z21.b
    public void f(java.lang.String str, boolean z17) {
    }

    @Override // z21.b
    public void g() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15487x24678974 c15487x24678974 = this.f377428a;
        java.lang.String str = c15487x24678974.f218277d;
        c15487x24678974.getCurrentState();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 amplitudeTimer = c15487x24678974.getAmplitudeTimer();
        if (amplitudeTimer != null) {
            amplitudeTimer.d();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 callUiHandler = c15487x24678974.getCallUiHandler();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(callUiHandler);
        c15487x24678974.getClass();
        callUiHandler.mo50305x3d8a09a2(0);
    }
}
