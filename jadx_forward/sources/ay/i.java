package ay;

/* loaded from: classes14.dex */
public abstract class i extends p012xc85e97e9.p093xedfae76a.c1 implements wx.g1 {

    /* renamed from: d, reason: collision with root package name */
    public final jy.m f96682d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f96683e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f96684f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f96685g;

    /* renamed from: h, reason: collision with root package name */
    public hy.a0 f96686h;

    /* renamed from: i, reason: collision with root package name */
    public int f96687i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p689xc5a27af6.p713x2c0e0b6f.p714x59a4b87.ui.vm.C10505xfc6d4ce4 f96688m;

    /* JADX WARN: Type inference failed for: r2v0, types: [com.tencent.mm.feature.chatbot.brand.ui.vm.CBTBrandBaseViewModel$voipListener$1, com.tencent.mm.sdk.event.IListener] */
    public i(jy.m screenInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(screenInfo, "screenInfo");
        this.f96682d = screenInfo;
        this.f96683e = "ChatBot.BrandLiveViewModel";
        this.f96684f = jz5.h.b(ay.f.f96679d);
        this.f96685g = jz5.h.b(ay.g.f96680d);
        this.f96687i = 11;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        ?? r27 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba>(a0Var) { // from class: com.tencent.mm.feature.chatbot.brand.ui.vm.CBTBrandBaseViewModel$voipListener$1
            {
                this.f39173x3fe91575 = -797557590;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba c6231x4f3054ba) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba event = c6231x4f3054ba;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                int i17 = event.f136478g.f89948b;
                ay.i iVar = ay.i.this;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(iVar.f96683e, "VoipEvent: " + i17);
                if (i17 == 11 && iVar.f96687i != i17) {
                    iVar.O6(iVar.f96682d.f384003a);
                }
                iVar.f96687i = i17;
                return false;
            }
        };
        this.f96688m = r27;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatBot.BrandLiveViewModel", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
        O6(screenInfo.f384003a);
        r27.mo48813x58998cd();
    }

    public final com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.i N6() {
        java.lang.String str;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.i iVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.i();
        jy.m mVar = this.f96682d;
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

    public final void O6(com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.d0 roomInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roomInfo, "roomInfo");
        java.lang.String str = this.f96683e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "startAISession roomInfo:" + roomInfo);
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.i N6 = N6();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.z2 z2Var = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.z2();
        z2Var.f298127q = N6();
        boolean[] zArr = z2Var.Q;
        zArr[11] = true;
        z2Var.f298117d = com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.l2.MSG_VOIP_WELCOME;
        zArr[1] = true;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.r2 r2Var = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.r2();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.q2 q2Var = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.q2();
        q2Var.f297967d = com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.p2.TYPE_WEBPAGE;
        boolean[] zArr2 = q2Var.f297972i;
        zArr2[1] = true;
        q2Var.f297968e = com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.n2.USER;
        zArr2[2] = true;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.v1 b17 = this.f96682d.f384006d.b();
        q2Var.f297969f = b17 != null ? b17.f298027i[1] ? b17.f298022d : "" : null;
        zArr2[3] = true;
        linkedList.add(q2Var);
        r2Var.f297980d = linkedList;
        r2Var.f297981e[1] = true;
        z2Var.f298123m = r2Var;
        zArr[7] = true;
        hy.b0 b0Var = hy.b0.f367261a;
        java.util.Optional of6 = java.util.Optional.of(N6);
        java.util.Optional of7 = java.util.Optional.of(z2Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(of7, "of(...)");
        hy.a0 e17 = b0Var.e("", of6, of7, N6.b(), N6.m112152x23a7af9b(), N6.f297797w[16] ? N6.f297794t : com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.w.ChatBotOpenScene_Unknown, java.util.Optional.of(roomInfo));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "startSession complete session=" + e17);
        this.f96686h = e17;
        if (e17 != null) {
            e17.b(this);
        }
    }

    @Override // wx.g1
    public void R9() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f96683e, "onCallEnd");
    }

    @Override // p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        hy.a0 a0Var = this.f96686h;
        if (a0Var != null) {
            a0Var.d(this);
        }
        super.mo528x82b764cd();
        java.lang.String str = this.f96683e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onCleared");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "destroyVoIPSession");
        hy.a0 a0Var2 = this.f96686h;
        if (a0Var2 != null) {
            a0Var2.c(com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.d3.HANGUP_REASON_MANUAL, new ay.h(this));
        }
        this.f96686h = null;
        gy.c cVar = (gy.c) ((jz5.n) this.f96684f).mo141623x754a37bb();
        cVar.f();
        cVar.f358998b.release();
        ((gy.g) ((jz5.n) this.f96685g).mo141623x754a37bb()).d();
        mo48814x2efc64();
    }
}
