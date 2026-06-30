package ay;

/* loaded from: classes14.dex */
public final class v extends jy.d implements wx.g1 {

    /* renamed from: f, reason: collision with root package name */
    public final jy.m f15183f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f15184g;

    /* renamed from: h, reason: collision with root package name */
    public kotlinx.coroutines.r2 f15185h;

    /* renamed from: i, reason: collision with root package name */
    public xx.y f15186i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f15187m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f15188n;

    /* renamed from: o, reason: collision with root package name */
    public hy.a0 f15189o;

    /* renamed from: p, reason: collision with root package name */
    public int f15190p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.feature.chatbot.brand.ui.vm.ChatBotBrandScreenViewModel$voipListener$1 f15191q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.tencent.mm.sdk.event.IListener, com.tencent.mm.feature.chatbot.brand.ui.vm.ChatBotBrandScreenViewModel$voipListener$1] */
    public v(jy.m screenInfo) {
        super(new ay.e(null, null, false, false, false, 0.0f, true));
        kotlin.jvm.internal.o.g(screenInfo, "screenInfo");
        this.f15183f = screenInfo;
        this.f15184g = "ChatBot.BrandScreenViewModel";
        this.f15187m = jz5.h.b(ay.n.f15173d);
        jz5.g b17 = jz5.h.b(ay.o.f15174d);
        this.f15188n = b17;
        this.f15190p = 11;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        ?? r27 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.VoipEvent>(a0Var) { // from class: com.tencent.mm.feature.chatbot.brand.ui.vm.ChatBotBrandScreenViewModel$voipListener$1
            {
                this.__eventId = -797557590;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.VoipEvent voipEvent) {
                com.tencent.mm.autogen.events.VoipEvent event = voipEvent;
                kotlin.jvm.internal.o.g(event, "event");
                int i17 = event.f54945g.f8415b;
                ay.v vVar = ay.v.this;
                com.tencent.mars.xlog.Log.i(vVar.f15184g, "VoipEvent: " + i17);
                if (i17 == 11 && vVar.f15190p != i17) {
                    vVar.S6(vVar.f15183f.f302470a);
                }
                vVar.f15190p = i17;
                return false;
            }
        };
        this.f15191q = r27;
        ((gy.g) ((jz5.n) b17).getValue()).f277487h = new ay.s(this);
        S6(screenInfo.f302470a);
        r27.alive();
    }

    @Override // wx.g1
    public void J6(com.tencent.wechat.aff.chatbot.j jVar) {
        com.tencent.mars.xlog.Log.i(this.f15184g, "onTTSBegin");
        P6(ay.e.a((ay.e) N6(), null, null, true, false, false, 0.0f, false, 123, null));
        R6().e();
        kotlinx.coroutines.r2 r2Var = this.f15185h;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        T6();
        xx.y yVar = this.f15186i;
        if (yVar != null) {
            yVar.c(xx.c.f457777h);
            yVar.d();
        }
    }

    public final com.tencent.wechat.aff.chatbot.i Q6() {
        java.lang.String str;
        com.tencent.wechat.aff.chatbot.i iVar = new com.tencent.wechat.aff.chatbot.i();
        jy.m mVar = this.f15183f;
        iVar.f216254m = mVar.f302470a.b();
        boolean[] zArr = iVar.f216264w;
        zArr[7] = true;
        iVar.f216253i = c01.id.c();
        zArr[6] = true;
        iVar.f216248d = (java.lang.String) gm0.j1.u().c().l(4, null);
        zArr[1] = true;
        iVar.f216255n = (java.lang.String) gm0.j1.u().c().l(2, null);
        zArr[8] = true;
        iVar.f216249e = com.eclipsesource.mmv8.Platform.ANDROID;
        zArr[2] = true;
        ly.h hVar = ly.h.f322182a;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        iVar.f216251g = java.lang.String.valueOf(hVar.a(context, true));
        zArr[4] = true;
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        try {
            str = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionName;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            str = "1.0.0";
        }
        iVar.f216250f = str;
        zArr[3] = true;
        iVar.f216252h = false;
        zArr[5] = true;
        com.tencent.wechat.aff.chatbot.d0 d0Var = mVar.f302470a;
        java.util.LinkedList linkedList = d0Var.f216139f;
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                iVar.f216257p.add(((com.tencent.wechat.aff.chatbot.a0) it.next()).b());
            }
        }
        java.util.LinkedList linkedList2 = d0Var.f216139f;
        if (linkedList2 != null && (linkedList2.isEmpty() ^ true)) {
            com.tencent.wechat.aff.chatbot.a0 a0Var = (com.tencent.wechat.aff.chatbot.a0) d0Var.f216139f.get(0);
            iVar.f216256o = a0Var != null ? a0Var.b() : null;
            zArr[9] = true;
        }
        iVar.f216261t = mVar.f302471b;
        zArr[16] = true;
        iVar.f216258q = iVar.b() + '_' + iVar.c();
        zArr[11] = true;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("chatbot_");
        sb6.append(iVar.f216253i);
        iVar.f216260s = sb6.toString();
        zArr[14] = true;
        return iVar;
    }

    public final gy.c R6() {
        return (gy.c) ((jz5.n) this.f15187m).getValue();
    }

    @Override // wx.g1
    public void R9() {
        com.tencent.mars.xlog.Log.i(this.f15184g, "onCallEnd");
    }

    public final void S6(com.tencent.wechat.aff.chatbot.d0 roomInfo) {
        kotlin.jvm.internal.o.g(roomInfo, "roomInfo");
        java.lang.String str = this.f15184g;
        com.tencent.mars.xlog.Log.i(str, "startAISession roomInfo:" + roomInfo);
        ay.e eVar = (ay.e) N6();
        boolean[] zArr = roomInfo.f216144n;
        java.lang.String str2 = "";
        P6(ay.e.a(eVar, zArr[5] ? roomInfo.f216141h : "", zArr[4] ? roomInfo.f216140g : "", false, false, false, 0.0f, false, 124, null));
        com.tencent.wechat.aff.chatbot.i Q6 = Q6();
        com.tencent.wechat.aff.chatbot.z2 z2Var = new com.tencent.wechat.aff.chatbot.z2();
        z2Var.f216594q = Q6();
        boolean[] zArr2 = z2Var.Q;
        zArr2[11] = true;
        z2Var.f216584d = com.tencent.wechat.aff.chatbot.l2.MSG_VOIP_WELCOME;
        zArr2[1] = true;
        com.tencent.wechat.aff.chatbot.r2 r2Var = new com.tencent.wechat.aff.chatbot.r2();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.tencent.wechat.aff.chatbot.q2 q2Var = new com.tencent.wechat.aff.chatbot.q2();
        q2Var.f216434d = com.tencent.wechat.aff.chatbot.p2.TYPE_WEBPAGE;
        boolean[] zArr3 = q2Var.f216439i;
        zArr3[1] = true;
        q2Var.f216435e = com.tencent.wechat.aff.chatbot.n2.USER;
        zArr3[2] = true;
        com.tencent.wechat.aff.chatbot.v1 b17 = this.f15183f.f302473d.b();
        if (b17 == null) {
            str2 = null;
        } else if (b17.f216494i[1]) {
            str2 = b17.f216489d;
        }
        q2Var.f216436f = str2;
        zArr3[3] = true;
        linkedList.add(q2Var);
        r2Var.f216447d = linkedList;
        r2Var.f216448e[1] = true;
        z2Var.f216590m = r2Var;
        zArr2[7] = true;
        hy.b0 b0Var = hy.b0.f285728a;
        java.util.Optional of6 = java.util.Optional.of(Q6);
        java.util.Optional of7 = java.util.Optional.of(z2Var);
        kotlin.jvm.internal.o.f(of7, "of(...)");
        hy.a0 e17 = b0Var.e("", of6, of7, Q6.b(), Q6.getSessionId(), Q6.f216264w[16] ? Q6.f216261t : com.tencent.wechat.aff.chatbot.w.ChatBotOpenScene_Unknown, java.util.Optional.of(roomInfo));
        com.tencent.mars.xlog.Log.i(str, "startSession complete session=" + e17);
        this.f15189o = e17;
        if (e17 != null) {
            e17.b(this);
        }
    }

    public final void T6() {
        if (((ay.e) N6()).f15143e) {
            P6(ay.e.a((ay.e) N6(), null, null, false, false, false, 0.0f, false, 111, null));
        }
    }

    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [kotlin.coroutines.Continuation, yz5.l, java.util.concurrent.CancellationException, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21, types: [int, boolean] */
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
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(state, "state");
        if (event instanceof ay.a) {
            P6(ay.e.a((ay.e) N6(), null, null, false, false, false, 0.0f, false, 63, null));
            return;
        }
        boolean z17 = event instanceof ay.b;
        com.tencent.wechat.aff.chatbot.x1 x1Var = com.tencent.wechat.aff.chatbot.x1.ResponseState_Voice;
        jz5.g gVar = this.f15188n;
        jy.m mVar = this.f15183f;
        java.lang.String str2 = this.f15184g;
        if (!z17) {
            if (event instanceof ay.c) {
                com.tencent.mars.xlog.Log.i(str2, "stopRecording");
                ((gy.g) ((jz5.n) gVar).getValue()).j();
                hy.a0 a0Var = this.f15189o;
                if (a0Var != null) {
                    i17 = 1;
                    r152 = 0;
                    a0Var.e(mVar.f302470a.b(), false, mVar.f302472c, 0, false, false, new byte[0], false, x1Var, new java.util.ArrayList(), ay.u.f15182d);
                } else {
                    i17 = 1;
                    r152 = 0;
                }
                xx.y yVar3 = this.f15186i;
                if (yVar3 != null) {
                    com.tencent.mars.xlog.Log.i("ChatBotBrandDataReporter", "reportUserSpeakEnd");
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("ai_voice_chat_hold_speak_finish", xx.y.b(yVar3, false, new xx.v(yVar3), i17, r152), 36708);
                    com.tencent.mars.xlog.Log.i("ChatBotBrandDataReporter", "reportAILoadingStart");
                    yVar3.f457830c = c01.id.a();
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("ai_voice_chat_loading_start", xx.y.b(yVar3, false, r152, 3, r152), 36708);
                }
                kotlinx.coroutines.r2 r2Var = this.f15185h;
                if (r2Var != null) {
                    kotlinx.coroutines.p2.a(r2Var, r152, i17, r152);
                }
                P6(ay.e.a((ay.e) N6(), null, null, false, false, true, 0.0f, false, 111, null));
                this.f15185h = kotlinx.coroutines.l.d(androidx.lifecycle.d1.a(this), null, null, new ay.q(this, r152), 3, null);
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i(str2, "startRecording");
        if (((ay.e) N6()).f15141c && R6().f277471h) {
            R6().f();
        }
        ((gy.g) ((jz5.n) gVar).getValue()).h();
        hy.a0 a0Var2 = this.f15189o;
        if (a0Var2 != null) {
            r17 = 1;
            str = "ChatBotBrandDataReporter";
            a0Var2.e(mVar.f302470a.b(), true, mVar.f302472c, 0, false, false, new byte[0], false, x1Var, new java.util.ArrayList(), ay.t.f15181d);
        } else {
            r17 = 1;
            str = "ChatBotBrandDataReporter";
        }
        xx.y yVar4 = this.f15186i;
        if (yVar4 != null) {
            com.tencent.mars.xlog.Log.i(str, "reportUserSpeakBegin");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(yVar4.f457834g);
            sb6.append('_');
            int i18 = yVar4.f457836i + r17;
            yVar4.f457836i = i18;
            sb6.append(i18);
            yVar4.f457833f = sb6.toString();
            yVar4.f457829b = c01.id.a();
            cancellationException = null;
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("ai_voice_chat_hold_speak", xx.y.b(yVar4, false, null, 3, null), 36708);
            yVar4.f457837j = r17;
        } else {
            cancellationException = null;
        }
        if (((ay.e) N6()).f15141c && (yVar2 = this.f15186i) != null) {
            yVar2.e(xx.e.f457785f);
        }
        if (((ay.e) N6()).f15143e && (yVar = this.f15186i) != null) {
            yVar.c(xx.c.f457776g);
        }
        P6(ay.e.a((ay.e) N6(), null, null, false, false, false, 0.0f, false, 107, null));
        kotlinx.coroutines.r2 r2Var2 = this.f15185h;
        if (r2Var2 != null) {
            kotlinx.coroutines.p2.a(r2Var2, cancellationException, r17, cancellationException);
        }
        T6();
    }

    @Override // wx.g1
    public void X8() {
        com.tencent.mars.xlog.Log.i(this.f15184g, "onTalkSucc");
        if (!((ay.e) N6()).f15142d) {
            P6(ay.e.a((ay.e) N6(), null, null, false, true, false, 0.0f, false, 119, null));
        }
        xx.y yVar = this.f15186i;
        if (yVar != null) {
            yVar.i(0L);
        }
    }

    @Override // wx.g1
    public void Yb(com.tencent.wechat.aff.chatbot.j jVar) {
        com.tencent.mars.xlog.Log.i(this.f15184g, "onTTSEnd");
        xx.y yVar = this.f15186i;
        if (yVar != null) {
            yVar.e(xx.e.f457784e);
        }
        R6().f();
        kotlinx.coroutines.l.d(androidx.lifecycle.d1.a(this), kotlinx.coroutines.q1.f310568a, null, new ay.r(this, null), 2, null);
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        xx.y yVar;
        xx.y yVar2;
        hy.a0 a0Var = this.f15189o;
        if (a0Var != null) {
            a0Var.d(this);
        }
        if (((ay.e) N6()).f15141c && (yVar2 = this.f15186i) != null) {
            yVar2.e(xx.e.f457786g);
        }
        if (((ay.e) N6()).f15143e && (yVar = this.f15186i) != null) {
            yVar.c(xx.c.f457775f);
        }
        super.onCleared();
        java.lang.String str = this.f15184g;
        com.tencent.mars.xlog.Log.i(str, "onCleared");
        com.tencent.mars.xlog.Log.i(str, "destroyVoIPSession");
        hy.a0 a0Var2 = this.f15189o;
        if (a0Var2 != null) {
            a0Var2.c(com.tencent.wechat.aff.chatbot.d3.HANGUP_REASON_MANUAL, new ay.p(this));
        }
        this.f15189o = null;
        gy.c R6 = R6();
        R6.f();
        R6.f277465b.release();
        ((gy.g) ((jz5.n) this.f15188n).getValue()).d();
        dead();
    }
}
