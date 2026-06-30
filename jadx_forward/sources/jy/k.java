package jy;

/* loaded from: classes14.dex */
public class k extends jy.d implements wx.g1 {

    /* renamed from: f, reason: collision with root package name */
    public final jy.m f383998f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f383999g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f384000h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f384001i;

    /* renamed from: m, reason: collision with root package name */
    public hy.a0 f384002m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(jy.m screenInfo) {
        super(new jy.q(null, null, false, false));
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(screenInfo, "screenInfo");
        this.f383998f = screenInfo;
        this.f383999g = "ChatBot.BaseScreenViewModel";
        this.f384000h = jz5.h.b(jy.e.f383991d);
        this.f384001i = jz5.h.b(jy.f.f383992d);
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.d0 roomInfo = screenInfo.f384003a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roomInfo, "roomInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatBot.BaseScreenViewModel", "startAISession roomInfo:" + roomInfo);
        jy.q qVar = (jy.q) N6();
        boolean[] zArr = roomInfo.f297677n;
        P6(jy.q.a(qVar, zArr[5] ? roomInfo.f297674h : "", zArr[4] ? roomInfo.f297673g : "", false, false, 12, null));
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.i iVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.i();
        iVar.f297787m = roomInfo.b();
        boolean[] zArr2 = iVar.f297797w;
        zArr2[7] = true;
        iVar.f297786i = c01.id.c();
        zArr2[6] = true;
        iVar.f297781d = (java.lang.String) gm0.j1.u().c().l(4, null);
        zArr2[1] = true;
        iVar.f297788n = (java.lang.String) gm0.j1.u().c().l(2, null);
        zArr2[8] = true;
        iVar.f297782e = com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f;
        zArr2[2] = true;
        ly.h hVar = ly.h.f403715a;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        iVar.f297784g = java.lang.String.valueOf(hVar.a(context, true));
        zArr2[4] = true;
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        try {
            str = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionName;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            str = "1.0.0";
        }
        iVar.f297783f = str;
        zArr2[3] = true;
        iVar.f297785h = false;
        zArr2[5] = true;
        java.util.LinkedList linkedList = roomInfo.f297672f;
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                iVar.f297790p.add(((com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.a0) it.next()).b());
            }
        }
        java.util.LinkedList linkedList2 = roomInfo.f297672f;
        if (linkedList2 != null && (linkedList2.isEmpty() ^ true)) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.a0 a0Var = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.a0) linkedList2.get(0);
            iVar.f297789o = a0Var != null ? a0Var.b() : null;
            zArr2[9] = true;
        }
        iVar.f297794t = screenInfo.f384004b;
        zArr2[16] = true;
        iVar.f297791q = iVar.b() + '_' + iVar.c();
        zArr2[11] = true;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("chatbot_");
        sb6.append(iVar.f297786i);
        iVar.f297793s = sb6.toString();
        zArr2[14] = true;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.z2 z2Var = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.z2();
        z2Var.f298117d = com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.l2.MSG_VOIP_WELCOME;
        z2Var.Q[1] = true;
        hy.b0 b0Var = hy.b0.f367261a;
        java.util.Optional of6 = java.util.Optional.of(iVar);
        java.util.Optional of7 = java.util.Optional.of(z2Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(of7, "of(...)");
        hy.a0 e17 = b0Var.e("", of6, of7, iVar.b(), iVar.m112152x23a7af9b(), zArr2[16] ? iVar.f297794t : com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.w.ChatBotOpenScene_Unknown, java.util.Optional.of(roomInfo));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatBot.BaseScreenViewModel", "startSession complete session=" + e17);
        this.f384002m = e17;
        if (e17 != null) {
            e17.b(this);
        }
    }

    @Override // wx.g1
    public void J6(com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.j jVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f383999g, "onTTSBegin");
        P6(jy.q.a((jy.q) N6(), null, null, true, false, 11, null));
        ((gy.c) ((jz5.n) this.f384000h).mo141623x754a37bb()).e();
    }

    @Override // wx.g1
    public void R9() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f383999g, "onCallEnd");
    }

    @Override // jy.l
    public void V2(jy.r rVar, jy.s sVar) {
        jy.p event = (jy.p) rVar;
        jy.q state = (jy.q) sVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        boolean z17 = event instanceof jy.n;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.x1 x1Var = com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.x1.ResponseState_Voice;
        jz5.g gVar = this.f384001i;
        jy.m mVar = this.f383998f;
        java.lang.String str = this.f383999g;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "startRecording");
            ((gy.g) ((jz5.n) gVar).mo141623x754a37bb()).h();
            hy.a0 a0Var = this.f384002m;
            if (a0Var != null) {
                a0Var.e(mVar.f384003a.b(), true, mVar.f384005c, 0, false, false, new byte[0], false, x1Var, new java.util.ArrayList(), jy.i.f383996d);
                return;
            }
            return;
        }
        if (event instanceof jy.o) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "stopRecording");
            ((gy.g) ((jz5.n) gVar).mo141623x754a37bb()).j();
            hy.a0 a0Var2 = this.f384002m;
            if (a0Var2 != null) {
                a0Var2.e(mVar.f384003a.b(), false, mVar.f384005c, 0, false, false, new byte[0], false, x1Var, new java.util.ArrayList(), jy.j.f383997d);
            }
        }
    }

    @Override // wx.g1
    public void X8() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f383999g, "onTalkSucc");
    }

    @Override // wx.g1
    public void Yb(com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.j jVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f383999g, "onTTSEnd");
        p3325xe03a0797.p3326xc267989b.l.d(p012xc85e97e9.p093xedfae76a.d1.a(this), p3325xe03a0797.p3326xc267989b.q1.f392101a, null, new jy.h(this, null), 2, null);
    }

    @Override // p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        hy.a0 a0Var = this.f384002m;
        if (a0Var != null) {
            a0Var.d(this);
        }
        super.mo528x82b764cd();
        java.lang.String str = this.f383999g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onCleared");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "destroyVoIPSession");
        hy.a0 a0Var2 = this.f384002m;
        if (a0Var2 != null) {
            a0Var2.c(com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.d3.HANGUP_REASON_MANUAL, new jy.g(this));
        }
        this.f384002m = null;
        gy.c cVar = (gy.c) ((jz5.n) this.f384000h).mo141623x754a37bb();
        cVar.f();
        cVar.f358998b.release();
        ((gy.g) ((jz5.n) this.f384001i).mo141623x754a37bb()).d();
    }
}
