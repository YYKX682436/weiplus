package ay;

/* loaded from: classes14.dex */
public abstract class i extends androidx.lifecycle.c1 implements wx.g1 {

    /* renamed from: d, reason: collision with root package name */
    public final jy.m f15149d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f15150e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f15151f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f15152g;

    /* renamed from: h, reason: collision with root package name */
    public hy.a0 f15153h;

    /* renamed from: i, reason: collision with root package name */
    public int f15154i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.feature.chatbot.brand.ui.vm.CBTBrandBaseViewModel$voipListener$1 f15155m;

    /* JADX WARN: Type inference failed for: r2v0, types: [com.tencent.mm.feature.chatbot.brand.ui.vm.CBTBrandBaseViewModel$voipListener$1, com.tencent.mm.sdk.event.IListener] */
    public i(jy.m screenInfo) {
        kotlin.jvm.internal.o.g(screenInfo, "screenInfo");
        this.f15149d = screenInfo;
        this.f15150e = "ChatBot.BrandLiveViewModel";
        this.f15151f = jz5.h.b(ay.f.f15146d);
        this.f15152g = jz5.h.b(ay.g.f15147d);
        this.f15154i = 11;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        ?? r27 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.VoipEvent>(a0Var) { // from class: com.tencent.mm.feature.chatbot.brand.ui.vm.CBTBrandBaseViewModel$voipListener$1
            {
                this.__eventId = -797557590;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.VoipEvent voipEvent) {
                com.tencent.mm.autogen.events.VoipEvent event = voipEvent;
                kotlin.jvm.internal.o.g(event, "event");
                int i17 = event.f54945g.f8415b;
                ay.i iVar = ay.i.this;
                com.tencent.mars.xlog.Log.i(iVar.f15150e, "VoipEvent: " + i17);
                if (i17 == 11 && iVar.f15154i != i17) {
                    iVar.O6(iVar.f15149d.f302470a);
                }
                iVar.f15154i = i17;
                return false;
            }
        };
        this.f15155m = r27;
        com.tencent.mars.xlog.Log.i("ChatBot.BrandLiveViewModel", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        O6(screenInfo.f302470a);
        r27.alive();
    }

    public final com.tencent.wechat.aff.chatbot.i N6() {
        java.lang.String str;
        com.tencent.wechat.aff.chatbot.i iVar = new com.tencent.wechat.aff.chatbot.i();
        jy.m mVar = this.f15149d;
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

    public final void O6(com.tencent.wechat.aff.chatbot.d0 roomInfo) {
        kotlin.jvm.internal.o.g(roomInfo, "roomInfo");
        java.lang.String str = this.f15150e;
        com.tencent.mars.xlog.Log.i(str, "startAISession roomInfo:" + roomInfo);
        com.tencent.wechat.aff.chatbot.i N6 = N6();
        com.tencent.wechat.aff.chatbot.z2 z2Var = new com.tencent.wechat.aff.chatbot.z2();
        z2Var.f216594q = N6();
        boolean[] zArr = z2Var.Q;
        zArr[11] = true;
        z2Var.f216584d = com.tencent.wechat.aff.chatbot.l2.MSG_VOIP_WELCOME;
        zArr[1] = true;
        com.tencent.wechat.aff.chatbot.r2 r2Var = new com.tencent.wechat.aff.chatbot.r2();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.tencent.wechat.aff.chatbot.q2 q2Var = new com.tencent.wechat.aff.chatbot.q2();
        q2Var.f216434d = com.tencent.wechat.aff.chatbot.p2.TYPE_WEBPAGE;
        boolean[] zArr2 = q2Var.f216439i;
        zArr2[1] = true;
        q2Var.f216435e = com.tencent.wechat.aff.chatbot.n2.USER;
        zArr2[2] = true;
        com.tencent.wechat.aff.chatbot.v1 b17 = this.f15149d.f302473d.b();
        q2Var.f216436f = b17 != null ? b17.f216494i[1] ? b17.f216489d : "" : null;
        zArr2[3] = true;
        linkedList.add(q2Var);
        r2Var.f216447d = linkedList;
        r2Var.f216448e[1] = true;
        z2Var.f216590m = r2Var;
        zArr[7] = true;
        hy.b0 b0Var = hy.b0.f285728a;
        java.util.Optional of6 = java.util.Optional.of(N6);
        java.util.Optional of7 = java.util.Optional.of(z2Var);
        kotlin.jvm.internal.o.f(of7, "of(...)");
        hy.a0 e17 = b0Var.e("", of6, of7, N6.b(), N6.getSessionId(), N6.f216264w[16] ? N6.f216261t : com.tencent.wechat.aff.chatbot.w.ChatBotOpenScene_Unknown, java.util.Optional.of(roomInfo));
        com.tencent.mars.xlog.Log.i(str, "startSession complete session=" + e17);
        this.f15153h = e17;
        if (e17 != null) {
            e17.b(this);
        }
    }

    @Override // wx.g1
    public void R9() {
        com.tencent.mars.xlog.Log.i(this.f15150e, "onCallEnd");
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        hy.a0 a0Var = this.f15153h;
        if (a0Var != null) {
            a0Var.d(this);
        }
        super.onCleared();
        java.lang.String str = this.f15150e;
        com.tencent.mars.xlog.Log.i(str, "onCleared");
        com.tencent.mars.xlog.Log.i(str, "destroyVoIPSession");
        hy.a0 a0Var2 = this.f15153h;
        if (a0Var2 != null) {
            a0Var2.c(com.tencent.wechat.aff.chatbot.d3.HANGUP_REASON_MANUAL, new ay.h(this));
        }
        this.f15153h = null;
        gy.c cVar = (gy.c) ((jz5.n) this.f15151f).getValue();
        cVar.f();
        cVar.f277465b.release();
        ((gy.g) ((jz5.n) this.f15152g).getValue()).d();
        dead();
    }
}
