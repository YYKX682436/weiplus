package xx;

/* loaded from: classes14.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public long f539361a;

    /* renamed from: b, reason: collision with root package name */
    public long f539362b;

    /* renamed from: c, reason: collision with root package name */
    public long f539363c;

    /* renamed from: d, reason: collision with root package name */
    public long f539364d;

    /* renamed from: e, reason: collision with root package name */
    public long f539365e;

    /* renamed from: h, reason: collision with root package name */
    public long f539368h;

    /* renamed from: i, reason: collision with root package name */
    public int f539369i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f539370j;

    /* renamed from: k, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.d0 f539371k;

    /* renamed from: l, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.w1 f539372l;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f539366f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f539367g = "";

    /* renamed from: m, reason: collision with root package name */
    public final xx.z f539373m = new xx.z(0, 0, 0, 0, 0, 0, 0, 127, null);

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f539374n = "";

    /* renamed from: o, reason: collision with root package name */
    public xx.g f539375o = xx.g.f539323e;

    public static /* synthetic */ java.util.Map b(xx.y yVar, boolean z17, yz5.l lVar, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        if ((i17 & 2) != 0) {
            lVar = xx.h.f539327d;
        }
        return yVar.a(z17, lVar);
    }

    public final java.util.Map a(boolean z17, yz5.l apply) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.v1 b17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apply, "apply");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.w1 w1Var = this.f539372l;
        if (w1Var != null && (b17 = w1Var.b()) != null) {
            linkedHashMap.put("bizuin", java.lang.Long.valueOf(this.f539368h));
            boolean[] zArr = b17.f298027i;
            java.lang.String str = zArr[3] ? b17.f298024f : "";
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getBizUsername(...)");
            linkedHashMap.put("bizusername", str);
            java.lang.String str2 = zArr[4] ? b17.f298025g : "";
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getBizNickname(...)");
            linkedHashMap.put("biznickname", str2);
            linkedHashMap.put("enter_ai_scene", java.lang.Integer.valueOf((zArr[2] ? b17.f298023e : com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.u1.PREVIED).f298015d));
            linkedHashMap.put("enter_sessionid", this.f539367g);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.d0 d0Var = this.f539371k;
            java.lang.String b18 = d0Var != null ? d0Var.b() : null;
            linkedHashMap.put("ai_clone_id", b18 != null ? b18 : "");
            if (z17) {
                linkedHashMap.put("speak_session_id", this.f539366f);
            }
            long j17 = this.f539365e;
            if (j17 != 0) {
                linkedHashMap.put("room_id", java.lang.String.valueOf(j17));
            }
        }
        apply.mo146xb9724478(linkedHashMap);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatBotBrandDataReporter", "getReportCommonData:" + linkedHashMap);
        return linkedHashMap;
    }

    public final void c(xx.c endType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(endType, "endType");
        if (this.f539370j) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatBotBrandDataReporter", "reportAILoadingEnd:" + endType);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("ai_voice_chat_loading_end", b(this, false, new xx.i(this, endType), 1, null), 36708);
        }
    }

    public final void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatBotBrandDataReporter", "reportAISpeakBegin");
        this.f539364d = c01.id.a();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("ai_voice_chat_model_speak_start", a(this.f539370j, new xx.j(this)), 36708);
    }

    public final void e(xx.e aiSpeakEndType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aiSpeakEndType, "aiSpeakEndType");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatBotBrandDataReporter", "reportAISpeakEnd:" + aiSpeakEndType);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("ai_voice_chat_model_speak_end", a(this.f539370j, new xx.l(this, aiSpeakEndType)), 36708);
    }

    public final void f(xx.e aiSpeakEndType, boolean z17, java.lang.String traceId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aiSpeakEndType, "aiSpeakEndType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(traceId, "traceId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatBotBrandDataReporter", "reportAISpeakEnd:" + aiSpeakEndType);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("ai_voice_chat_model_speak_end", a(this.f539370j, new xx.m(this, aiSpeakEndType, z17, traceId)), 36708);
    }

    public final void g(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatBotBrandDataReporter", "reportGreenMicCancelWithWordCnt");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("ai_voice_click_green_mic_cancel", a(this.f539370j, new xx.q(this, i17)), 36708);
    }

    public final void h(int i17, xx.d reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatBotBrandDataReporter", "reportGreenMicEndWithWordCnt");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("ai_voice_end_voice_input", a(this.f539370j, new xx.r(this, i17, reason)), 36708);
    }

    public final void i(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatBotBrandDataReporter", "reportUserJoinRoom");
        this.f539365e = j17;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("human_enter_voice_chat", a(false, new xx.t(this)), 36708);
    }

    public final void j(android.view.View backBtn) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(backBtn, "backBtn");
        dy1.a.i(backBtn, "ai_voice_chat_close_button");
        dy1.a.k(backBtn, b(this, false, null, 2, null));
        dy1.a.l(backBtn, 8, 36708);
        dy1.a.a(backBtn, new xx.w(this));
    }

    public final void k(android.app.Activity activity, com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.d0 d0Var, com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.w1 w1Var, xx.g roomType) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.v1 b17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roomType, "roomType");
        this.f539371k = d0Var;
        this.f539375o = roomType;
        this.f539372l = w1Var;
        this.f539361a = c01.id.a();
        if (w1Var != null && (b17 = w1Var.b()) != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            boolean[] zArr = b17.f298027i;
            java.lang.String str = zArr[3] ? b17.f298024f : "";
            if (str == null) {
                str = "";
            }
            sb6.append(str);
            sb6.append('_');
            sb6.append(this.f539361a);
            this.f539367g = sb6.toString();
            try {
                java.lang.String str2 = zArr[5] ? b17.f298026h : "";
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getStringBizuin(...)");
                byte[] decode = android.util.Base64.decode(str2, 0);
                if (decode != null) {
                    str2 = new java.lang.String(decode, r26.c.f450398a);
                }
                this.f539368h = java.lang.Long.parseLong(r26.n0.u0(str2).toString());
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ChatBotBrandDataReporter", e17.getMessage(), e17);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatBotBrandDataReporter", "setBrandDataReportPage reportAiChatExtInfo：");
        if (activity != null) {
            dy1.a.f(activity, iy1.c.BizAiVoiceChat);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).dk(activity, "biz_ai_voice_chat");
            dy1.a.h(activity, 12, 36708);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(activity, b(this, false, null, 2, null));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(activity, new xx.x(this, roomType));
        }
    }
}
