package ay;

/* loaded from: classes14.dex */
public final class v extends jy.d implements wx.g1 {

    /* renamed from: f, reason: collision with root package name */
    public final jy.m f96716f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f96717g;

    /* renamed from: h, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f96718h;

    /* renamed from: i, reason: collision with root package name */
    public xx.y f96719i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f96720m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f96721n;

    /* renamed from: o, reason: collision with root package name */
    public hy.a0 f96722o;

    /* renamed from: p, reason: collision with root package name */
    public int f96723p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p689xc5a27af6.p713x2c0e0b6f.p714x59a4b87.ui.vm.C10506xe280c365 f96724q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.tencent.mm.sdk.event.IListener, com.tencent.mm.feature.chatbot.brand.ui.vm.ChatBotBrandScreenViewModel$voipListener$1] */
    public v(jy.m screenInfo) {
        super(new ay.e(null, null, false, false, false, 0.0f, true));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(screenInfo, "screenInfo");
        this.f96716f = screenInfo;
        this.f96717g = "ChatBot.BrandScreenViewModel";
        this.f96720m = jz5.h.b(ay.n.f96706d);
        jz5.g b17 = jz5.h.b(ay.o.f96707d);
        this.f96721n = b17;
        this.f96723p = 11;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        ?? r27 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba>(a0Var) { // from class: com.tencent.mm.feature.chatbot.brand.ui.vm.ChatBotBrandScreenViewModel$voipListener$1
            {
                this.f39173x3fe91575 = -797557590;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba c6231x4f3054ba) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba event = c6231x4f3054ba;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                int i17 = event.f136478g.f89948b;
                ay.v vVar = ay.v.this;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vVar.f96717g, "VoipEvent: " + i17);
                if (i17 == 11 && vVar.f96723p != i17) {
                    vVar.S6(vVar.f96716f.f384003a);
                }
                vVar.f96723p = i17;
                return false;
            }
        };
        this.f96724q = r27;
        ((gy.g) ((jz5.n) b17).mo141623x754a37bb()).f359020h = new ay.s(this);
        S6(screenInfo.f384003a);
        r27.mo48813x58998cd();
    }

    @Override // wx.g1
    public void J6(com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.j jVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f96717g, "onTTSBegin");
        P6(ay.e.a((ay.e) N6(), null, null, true, false, false, 0.0f, false, 123, null));
        R6().e();
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f96718h;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        T6();
        xx.y yVar = this.f96719i;
        if (yVar != null) {
            yVar.c(xx.c.f539310h);
            yVar.d();
        }
    }

    public final com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.i Q6() {
        java.lang.String str;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.i iVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.i();
        jy.m mVar = this.f96716f;
        iVar.f297787m = mVar.f384003a.b();
        boolean[] zArr = iVar.f297797w;
        zArr[7] = true;
        iVar.f297786i = c01.id.c();
        zArr[6] = true;
        iVar.f297781d = (java.lang.String) gm0.j1.u().c().l(4, null);
        zArr[1] = true;
        iVar.f297788n = (java.lang.String) gm0.j1.u().c().l(2, null);
        zArr[8] = true;
        iVar.f297782e = com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f;
        zArr[2] = true;
        ly.h hVar = ly.h.f403715a;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        iVar.f297784g = java.lang.String.valueOf(hVar.a(context, true));
        zArr[4] = true;
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        try {
            str = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionName;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            str = "1.0.0";
        }
        iVar.f297783f = str;
        zArr[3] = true;
        iVar.f297785h = false;
        zArr[5] = true;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.d0 d0Var = mVar.f384003a;
        java.util.LinkedList linkedList = d0Var.f297672f;
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                iVar.f297790p.add(((com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.a0) it.next()).b());
            }
        }
        java.util.LinkedList linkedList2 = d0Var.f297672f;
        if (linkedList2 != null && (linkedList2.isEmpty() ^ true)) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.a0 a0Var = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.a0) d0Var.f297672f.get(0);
            iVar.f297789o = a0Var != null ? a0Var.b() : null;
            zArr[9] = true;
        }
        iVar.f297794t = mVar.f384004b;
        zArr[16] = true;
        iVar.f297791q = iVar.b() + '_' + iVar.c();
        zArr[11] = true;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("chatbot_");
        sb6.append(iVar.f297786i);
        iVar.f297793s = sb6.toString();
        zArr[14] = true;
        return iVar;
    }

    public final gy.c R6() {
        return (gy.c) ((jz5.n) this.f96720m).mo141623x754a37bb();
    }

    @Override // wx.g1
    public void R9() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f96717g, "onCallEnd");
    }

    public final void S6(com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.d0 roomInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roomInfo, "roomInfo");
        java.lang.String str = this.f96717g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "startAISession roomInfo:" + roomInfo);
        ay.e eVar = (ay.e) N6();
        boolean[] zArr = roomInfo.f297677n;
        java.lang.String str2 = "";
        P6(ay.e.a(eVar, zArr[5] ? roomInfo.f297674h : "", zArr[4] ? roomInfo.f297673g : "", false, false, false, 0.0f, false, 124, null));
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.i Q6 = Q6();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.z2 z2Var = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.z2();
        z2Var.f298127q = Q6();
        boolean[] zArr2 = z2Var.Q;
        zArr2[11] = true;
        z2Var.f298117d = com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.l2.MSG_VOIP_WELCOME;
        zArr2[1] = true;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.r2 r2Var = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.r2();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.q2 q2Var = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.q2();
        q2Var.f297967d = com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.p2.TYPE_WEBPAGE;
        boolean[] zArr3 = q2Var.f297972i;
        zArr3[1] = true;
        q2Var.f297968e = com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.n2.USER;
        zArr3[2] = true;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.v1 b17 = this.f96716f.f384006d.b();
        if (b17 == null) {
            str2 = null;
        } else if (b17.f298027i[1]) {
            str2 = b17.f298022d;
        }
        q2Var.f297969f = str2;
        zArr3[3] = true;
        linkedList.add(q2Var);
        r2Var.f297980d = linkedList;
        r2Var.f297981e[1] = true;
        z2Var.f298123m = r2Var;
        zArr2[7] = true;
        hy.b0 b0Var = hy.b0.f367261a;
        java.util.Optional of6 = java.util.Optional.of(Q6);
        java.util.Optional of7 = java.util.Optional.of(z2Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(of7, "of(...)");
        hy.a0 e17 = b0Var.e("", of6, of7, Q6.b(), Q6.m112152x23a7af9b(), Q6.f297797w[16] ? Q6.f297794t : com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.w.ChatBotOpenScene_Unknown, java.util.Optional.of(roomInfo));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "startSession complete session=" + e17);
        this.f96722o = e17;
        if (e17 != null) {
            e17.b(this);
        }
    }

    public final void T6() {
        if (((ay.e) N6()).f96676e) {
            P6(ay.e.a((ay.e) N6(), null, null, false, false, false, 0.0f, false, 111, null));
        }
    }

    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [kotlin.coroutines.Continuation, yz5.l, java.util.concurrent.CancellationException, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v24 */
    @Override // jy.l
    public void V2(jy.r rVar, jy.s sVar) {
        int i17;
        ?? r152;
        ?? r17;
        java.lang.String str;
        java.util.concurrent.CancellationException cancellationException;
        xx.y yVar;
        xx.y yVar2;
        ay.d event = (ay.d) rVar;
        ay.e state = (ay.e) sVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        if (event instanceof ay.a) {
            P6(ay.e.a((ay.e) N6(), null, null, false, false, false, 0.0f, false, 63, null));
            return;
        }
        boolean z17 = event instanceof ay.b;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.x1 x1Var = com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.x1.ResponseState_Voice;
        jz5.g gVar = this.f96721n;
        jy.m mVar = this.f96716f;
        java.lang.String str2 = this.f96717g;
        if (!z17) {
            if (event instanceof ay.c) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "stopRecording");
                ((gy.g) ((jz5.n) gVar).mo141623x754a37bb()).j();
                hy.a0 a0Var = this.f96722o;
                if (a0Var != null) {
                    i17 = 1;
                    r152 = 0;
                    a0Var.e(mVar.f384003a.b(), false, mVar.f384005c, 0, false, false, new byte[0], false, x1Var, new java.util.ArrayList(), ay.u.f96715d);
                } else {
                    i17 = 1;
                    r152 = 0;
                }
                xx.y yVar3 = this.f96719i;
                if (yVar3 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatBotBrandDataReporter", "reportUserSpeakEnd");
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("ai_voice_chat_hold_speak_finish", xx.y.b(yVar3, false, new xx.v(yVar3), i17, r152), 36708);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatBotBrandDataReporter", "reportAILoadingStart");
                    yVar3.f539363c = c01.id.a();
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("ai_voice_chat_loading_start", xx.y.b(yVar3, false, r152, 3, r152), 36708);
                }
                p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f96718h;
                if (r2Var != null) {
                    p3325xe03a0797.p3326xc267989b.p2.a(r2Var, r152, i17, r152);
                }
                P6(ay.e.a((ay.e) N6(), null, null, false, false, true, 0.0f, false, 111, null));
                this.f96718h = p3325xe03a0797.p3326xc267989b.l.d(p012xc85e97e9.p093xedfae76a.d1.a(this), null, null, new ay.q(this, r152), 3, null);
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "startRecording");
        if (((ay.e) N6()).f96674c && R6().f359004h) {
            R6().f();
        }
        ((gy.g) ((jz5.n) gVar).mo141623x754a37bb()).h();
        hy.a0 a0Var2 = this.f96722o;
        if (a0Var2 != null) {
            r17 = 1;
            str = "ChatBotBrandDataReporter";
            a0Var2.e(mVar.f384003a.b(), true, mVar.f384005c, 0, false, false, new byte[0], false, x1Var, new java.util.ArrayList(), ay.t.f96714d);
        } else {
            r17 = 1;
            str = "ChatBotBrandDataReporter";
        }
        xx.y yVar4 = this.f96719i;
        if (yVar4 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "reportUserSpeakBegin");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(yVar4.f539367g);
            sb6.append('_');
            int i18 = yVar4.f539369i + r17;
            yVar4.f539369i = i18;
            sb6.append(i18);
            yVar4.f539366f = sb6.toString();
            yVar4.f539362b = c01.id.a();
            cancellationException = null;
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("ai_voice_chat_hold_speak", xx.y.b(yVar4, false, null, 3, null), 36708);
            yVar4.f539370j = r17;
        } else {
            cancellationException = null;
        }
        if (((ay.e) N6()).f96674c && (yVar2 = this.f96719i) != null) {
            yVar2.e(xx.e.f539318f);
        }
        if (((ay.e) N6()).f96676e && (yVar = this.f96719i) != null) {
            yVar.c(xx.c.f539309g);
        }
        P6(ay.e.a((ay.e) N6(), null, null, false, false, false, 0.0f, false, 107, null));
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = this.f96718h;
        if (r2Var2 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, cancellationException, r17, cancellationException);
        }
        T6();
    }

    @Override // wx.g1
    public void X8() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f96717g, "onTalkSucc");
        if (!((ay.e) N6()).f96675d) {
            P6(ay.e.a((ay.e) N6(), null, null, false, true, false, 0.0f, false, 119, null));
        }
        xx.y yVar = this.f96719i;
        if (yVar != null) {
            yVar.i(0L);
        }
    }

    @Override // wx.g1
    public void Yb(com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.j jVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f96717g, "onTTSEnd");
        xx.y yVar = this.f96719i;
        if (yVar != null) {
            yVar.e(xx.e.f539317e);
        }
        R6().f();
        p3325xe03a0797.p3326xc267989b.l.d(p012xc85e97e9.p093xedfae76a.d1.a(this), p3325xe03a0797.p3326xc267989b.q1.f392101a, null, new ay.r(this, null), 2, null);
    }

    @Override // p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        xx.y yVar;
        xx.y yVar2;
        hy.a0 a0Var = this.f96722o;
        if (a0Var != null) {
            a0Var.d(this);
        }
        if (((ay.e) N6()).f96674c && (yVar2 = this.f96719i) != null) {
            yVar2.e(xx.e.f539319g);
        }
        if (((ay.e) N6()).f96676e && (yVar = this.f96719i) != null) {
            yVar.c(xx.c.f539308f);
        }
        super.mo528x82b764cd();
        java.lang.String str = this.f96717g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onCleared");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "destroyVoIPSession");
        hy.a0 a0Var2 = this.f96722o;
        if (a0Var2 != null) {
            a0Var2.c(com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.d3.HANGUP_REASON_MANUAL, new ay.p(this));
        }
        this.f96722o = null;
        gy.c R6 = R6();
        R6.f();
        R6.f358998b.release();
        ((gy.g) ((jz5.n) this.f96721n).mo141623x754a37bb()).d();
        mo48814x2efc64();
    }
}
