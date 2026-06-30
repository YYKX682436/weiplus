package ue2;

/* loaded from: classes3.dex */
public class q extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f508380d;

    /* renamed from: e, reason: collision with root package name */
    public ue2.o f508381e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.FrameLayout f508382f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f508383g;

    /* renamed from: h, reason: collision with root package name */
    public km2.m f508384h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f508380d = "MicroMsg.FinderLiveChatAnchorUIC";
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e9g;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo2273x9d4787cb(i17, i18, intent);
        ue2.o oVar = this.f508381e;
        if (oVar != null) {
            oVar.mo46548x9d4787cb(i17, i18, intent);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        ue2.o oVar = this.f508381e;
        if (oVar != null) {
            oVar.mo57508x41012807();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onViewCreated */
    public void mo47092x594b1124(android.view.View contentView) {
        km2.m mVar;
        ue2.o oVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentView, "contentView");
        super.mo47092x594b1124(contentView);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) contentView.findViewById(com.p314xaae8f345.mm.R.id.evz);
        this.f508382f = frameLayout;
        java.lang.String str = this.f508380d;
        if (frameLayout == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "finder_live_content_root not found in layout");
            return;
        }
        android.view.View findViewById = contentView.findViewById(com.p314xaae8f345.mm.R.id.f566245tl0);
        this.f508383g = findViewById;
        if (findViewById == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "finder_live_mask not found in layout");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "遮罩层初始化成功");
        }
        android.view.View view = this.f508383g;
        if (view != null) {
            view.setOnClickListener(new ue2.p(this));
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        jz5.f0 f0Var = null;
        this.f508381e = new ue2.o((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085, m158358x197d1fc6(), null);
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = m158358x197d1fc6();
        android.os.Bundle m7436x8619eaa0 = m158358x197d1fc6 != null ? m158358x197d1fc6.m7436x8619eaa0() : null;
        if (m7436x8619eaa0 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "No arguments found");
        } else {
            android.content.Intent intent = (android.content.Intent) m7436x8619eaa0.getParcelable("KEY_PARAMS_LIVE_FROM_NEARBY_CHAT_INNER_INTENT");
            if (intent == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "No intent found in arguments");
            } else {
                dk2.x4 a17 = dk2.x4.C.a(intent);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "initDataFromArguments: configProvider = " + a17);
                if (a17 == null || !(!a17.f315851l.isEmpty())) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "No valid config found in intent");
                    mVar = null;
                } else {
                    com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e c10828x8f239b6e = (com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e) kz5.n0.Z(a17.f315851l);
                    if (c10828x8f239b6e == null) {
                        c10828x8f239b6e = com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e.a("", 0);
                    }
                    mVar = new km2.m(c10828x8f239b6e);
                }
                this.f508384h = mVar;
                if (mVar != null) {
                    dk2.ef efVar = dk2.ef.f314905a;
                    gk2.e o07 = efVar.o0(mVar);
                    if (o07 == null) {
                        o07 = new gk2.e("FinderLiveAnchorUIC");
                    }
                    km2.m mVar2 = this.f508384h;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mVar2);
                    mVar2.f390665g = new r45.h32();
                    km2.m mVar3 = this.f508384h;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mVar3);
                    mVar3.f390674s = true;
                    km2.n nVar = new km2.n();
                    km2.m mVar4 = this.f508384h;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mVar4);
                    nVar.f390686e = kz5.c0.d(new km2.t(mVar4));
                    efVar.g0(nVar);
                    if (efVar.o0(this.f508384h) == null) {
                        new gk2.e("FinderLiveAnchorUIC");
                    }
                    km2.m mVar5 = this.f508384h;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mVar5);
                    dk2.ef.h(efVar, o07, mVar5.f390664f, this.f508381e, 0, null, 24, null);
                    ((mm2.c1) o07.a(mm2.c1.class)).H3 = a17 != null ? a17.f315852m : 1;
                    ((mm2.s1) o07.a(mm2.s1.class)).R6(intent, a17);
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "initializePluginLayout: 创建插件布局实例");
        if (dk2.ef.f314905a.o0(this.f508384h) == null) {
            new gk2.e("FinderLiveAnchorUIC");
        }
        km2.m mVar6 = this.f508384h;
        if (mVar6 != null && (oVar = this.f508381e) != null) {
            oVar.mo57463x37f82187(mVar6);
        }
        android.widget.FrameLayout frameLayout2 = this.f508382f;
        if (frameLayout2 != null) {
            frameLayout2.addView(this.f508381e);
        }
        ue2.o oVar2 = this.f508381e;
        if (oVar2 != null) {
            oVar2.mo46547x6343c19();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "initializePluginLayout: 插件布局已添加到容器，触发了layout逻辑");
        ue2.o oVar3 = this.f508381e;
        if (oVar3 != null) {
            oVar3.A();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "showChatDialog: 请求PluginLayout显示弹窗并启动预览");
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "showChatDialog: PluginLayout未初始化");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f508380d = "MicroMsg.FinderLiveChatAnchorUIC";
    }
}
