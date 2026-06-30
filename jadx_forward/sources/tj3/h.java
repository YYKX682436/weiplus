package tj3;

/* loaded from: classes14.dex */
public final class h extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f501272d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f501273e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f501274f;

    /* renamed from: g, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.k0 f501275g;

    /* renamed from: h, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.k0 f501276h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f501272d = jz5.h.b(new tj3.f(context));
        this.f501273e = jz5.h.b(new tj3.b(this));
        this.f501274f = jz5.h.b(new tj3.g(this));
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c2z, (android.view.ViewGroup) this, true);
        this.f501275g = new tj3.a(this);
        this.f501276h = new tj3.e(this, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getCameraSwitcher */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1891xcaa9f6bc.C16591xa5634bbe m166664xa147c61c() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1891xcaa9f6bc.C16591xa5634bbe) ((jz5.n) this.f501273e).mo141623x754a37bb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getViewModel */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.b0 m166665xa0ab20ce() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.b0) ((jz5.n) this.f501272d).mo141623x754a37bb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getVirtualBackgroundSwitcher */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1891xcaa9f6bc.C16591xa5634bbe m166666xc77f5de4() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1891xcaa9f6bc.C16591xa5634bbe) ((jz5.n) this.f501274f).mo141623x754a37bb();
    }

    public final void d() {
        if (getVisibility() == 0) {
            java.lang.Boolean bool = (java.lang.Boolean) m166665xa0ab20ce().f231796n.mo3195x754a37bb();
            if (bool == null) {
                bool = java.lang.Boolean.FALSE;
            }
            boolean booleanValue = bool.booleanValue();
            boolean f17 = f();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkAvatarControlLayout", "enable: " + f17 + " cam: " + booleanValue);
            m166664xa147c61c().setVisibility(booleanValue ? 0 : 8);
            m166666xc77f5de4().setVisibility((f17 && booleanValue) ? 0 : 8);
        }
    }

    public final boolean e() {
        java.lang.Boolean bool = (java.lang.Boolean) m166665xa0ab20ce().f231796n.mo3195x754a37bb();
        if (bool == null) {
            bool = java.lang.Boolean.FALSE;
        }
        boolean booleanValue = bool.booleanValue();
        f();
        return booleanValue;
    }

    public final boolean f() {
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_voip_virtual_background_gpu_rating, 40);
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_multitalk_virtual_background_disable, false);
        int f17 = rs0.n.f480839d.f();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkAvatarControlLayout", "gpuRatingLimiting: " + Ni + ", gpuRating: " + f17 + ", disableVirtualBackground: " + fj6);
        return f17 >= Ni && !fj6;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        super.setVisibility(i17);
        p012xc85e97e9.p093xedfae76a.k0 k0Var = this.f501276h;
        p012xc85e97e9.p093xedfae76a.k0 k0Var2 = this.f501275g;
        if (i17 != 0) {
            m166665xa0ab20ce().f231796n.mo522xb5bdeb7a(k0Var2);
            m166665xa0ab20ce().f231804v.mo522xb5bdeb7a(k0Var);
            return;
        }
        d();
        java.lang.Object context = getContext();
        p012xc85e97e9.p093xedfae76a.y yVar = context instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) context : null;
        if (yVar != null) {
            m166665xa0ab20ce().f231796n.mo7806x9d92d11c(yVar, k0Var2);
            m166665xa0ab20ce().f231804v.mo7806x9d92d11c(yVar, k0Var);
        }
        m166664xa147c61c().setOnClickListener(new tj3.c(this));
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.wi().d()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1891xcaa9f6bc.C16591xa5634bbe m166664xa147c61c = m166664xa147c61c();
            android.content.Context context2 = getContext();
            m166664xa147c61c.setContentDescription(context2 != null ? context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h1s) : null);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1891xcaa9f6bc.C16591xa5634bbe m166664xa147c61c2 = m166664xa147c61c();
            android.content.Context context3 = getContext();
            m166664xa147c61c2.setContentDescription(context3 != null ? context3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574113h11) : null);
        }
        m166666xc77f5de4().setOnClickListener(new tj3.d(this));
    }
}
