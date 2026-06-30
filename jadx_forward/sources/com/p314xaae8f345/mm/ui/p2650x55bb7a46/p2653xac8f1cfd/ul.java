package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes14.dex */
public final class ul extends android.speech.tts.UtteranceProgressListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fm f281620a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yb5.d f281621b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f281622c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f281623d;

    public ul(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fm fmVar, yb5.d dVar, long j17, java.util.ArrayList arrayList) {
        this.f281620a = fmVar;
        this.f281621b = dVar;
        this.f281622c = j17;
        this.f281623d = arrayList;
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public void onDone(java.lang.String utteranceId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(utteranceId, "utteranceId");
        java.util.List f07 = r26.n0.f0(utteranceId, new java.lang.String[]{"_"}, false, 0, 6, null);
        long parseLong = java.lang.Long.parseLong((java.lang.String) f07.get(0));
        int parseInt = java.lang.Integer.parseInt((java.lang.String) f07.get(1));
        int i17 = parseInt + 1;
        java.util.ArrayList arrayList = this.f281623d;
        java.lang.Object obj = arrayList.get(parseInt);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        r45.tc6 tc6Var = (r45.tc6) obj;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fm fmVar = this.f281620a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = fmVar.f280597m;
        if (b4Var != null) {
            b4Var.d();
        }
        int length = tc6Var.f467849e + tc6Var.f467848d.length();
        sb5.h2 h2Var = fmVar.f280596i;
        if (h2Var != null) {
            h2Var.a(length, java.lang.Long.valueOf(parseLong));
        }
        if (parseInt == arrayList.size() - 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextToSpeechComponent", "notify end");
            fmVar.m0(2);
            fmVar.t0(this.f281621b);
            return;
        }
        r45.tc6 tc6Var2 = (r45.tc6) arrayList.get(i17);
        if (tc6Var2 != null && tc6Var2.f467850f) {
            java.lang.String subText = ((r45.tc6) arrayList.get(i17)).f467848d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(subText, "subText");
            fmVar.s0(i17, parseLong, subText);
        } else {
            x21.l lVar = fmVar.f280594g;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(lVar.f533078b, "resume");
            lVar.f533081e.a(false);
        }
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public void onError(java.lang.String utteranceId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(utteranceId, "utteranceId");
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public void onStart(java.lang.String utteranceId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(utteranceId, "utteranceId");
        java.util.List f07 = r26.n0.f0(utteranceId, new java.lang.String[]{"_"}, false, 0, 6, null);
        long parseLong = java.lang.Long.parseLong((java.lang.String) f07.get(0));
        int parseInt = java.lang.Integer.parseInt((java.lang.String) f07.get(1));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextToSpeechComponent", "play with android tts onStart:%s, msgId:%s, index:%s", utteranceId, java.lang.Long.valueOf(parseLong), java.lang.Integer.valueOf(parseInt));
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fm fmVar = this.f281620a;
        if (parseInt == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextToSpeechComponent", "notify start");
            yb5.d dVar = this.f281621b;
            fmVar.n0(dVar);
            fmVar.o0(dVar);
            fmVar.f280592e = parseLong;
            fmVar.f280599o.f468759d = this.f281622c;
            fmVar.f280593f = 0L;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.sl(dVar));
        }
        r45.uc6 uc6Var = fmVar.f280599o;
        if (parseInt >= uc6Var.f468760e) {
            uc6Var.f468760e = parseInt + 1;
        }
        java.lang.Object obj = this.f281623d.get(parseInt);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        r45.tc6 tc6Var = (r45.tc6) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        int i17 = tc6Var.f467849e;
        f0Var.f391649d = i17;
        sb5.h2 h2Var = fmVar.f280596i;
        if (h2Var != null) {
            h2Var.a(i17, java.lang.Long.valueOf(parseLong));
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.tl(f0Var, tc6Var, this.f281620a, parseLong), true);
        b4Var.c(0L, 200L);
        fmVar.f280597m = b4Var;
    }
}
