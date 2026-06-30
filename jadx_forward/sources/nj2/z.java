package nj2;

/* loaded from: classes10.dex */
public final class z extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g implements android.view.View.OnClickListener {

    /* renamed from: h, reason: collision with root package name */
    public final gk2.e f419401h;

    /* renamed from: i, reason: collision with root package name */
    public final zh2.c f419402i;

    /* renamed from: m, reason: collision with root package name */
    public final zh2.e f419403m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f419404n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f419405o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f419406p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f419407q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f419408r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f419409s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View f419410t;

    /* renamed from: u, reason: collision with root package name */
    public final nj2.w f419411u;

    /* renamed from: v, reason: collision with root package name */
    public final kj2.o f419412v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(android.content.Context context, gk2.e liveData, zh2.c pluginAbility, zh2.e userInterface) {
        super(context, false, null, false, 12, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userInterface, "userInterface");
        this.f419401h = liveData;
        this.f419402i = pluginAbility;
        this.f419403m = userInterface;
        this.f419404n = jz5.h.b(new nj2.v(context, this));
        this.f419405o = jz5.h.b(new nj2.s(this));
        this.f419406p = jz5.h.b(new nj2.y(context, this));
        android.view.View view = this.f419408r;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        android.view.View inviteListLayout = view.findViewById(com.p314xaae8f345.mm.R.id.qtx);
        this.f419410t = inviteListLayout;
        this.f419411u = new nj2.w(this);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inviteListLayout, "inviteListLayout");
        this.f419412v = new kj2.o(inviteListLayout, liveData, new nj2.t(this), null, new nj2.u(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570386ci0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int l() {
        return 8;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveVoiceRoomLinkPanel", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.f6c) {
            a();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveVoiceRoomLinkPanel", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        this.f419408r = rootView;
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.f6c);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f419407q = findViewById;
        findViewById.setOnClickListener(this);
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.fno);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f419409s = (android.widget.TextView) findViewById2;
        android.view.View view = this.f419408r;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = (com.p314xaae8f345.mm.ui.bl.b(rootView.getContext()).y * 2) / 3;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void t() {
        super.t();
        this.f419412v.b();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void w() {
        if (q()) {
            return;
        }
        super.w();
        gk2.e eVar = this.f419401h;
        if (((mm2.e1) eVar.a(mm2.e1.class)).b7()) {
            android.widget.TextView textView = this.f419409s;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleView");
                throw null;
            }
            textView.setText(this.f199914d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nwa));
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", 1);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.X1, jSONObject.toString(), null, 4, null);
        }
        this.f419412v.f();
        y().n();
        z().r("onBind");
        boolean Z6 = ((mm2.e1) eVar.a(mm2.e1.class)).Z6();
        jz5.g gVar = this.f419404n;
        if (!Z6) {
            ((lj2.n) ((jz5.n) gVar).mo141623x754a37bb()).a();
        } else {
            ((lj2.n) ((jz5.n) gVar).mo141623x754a37bb()).b();
            ((lj2.n) ((jz5.n) gVar).mo141623x754a37bb()).c();
        }
    }

    public final nj2.r y() {
        return (nj2.r) ((jz5.n) this.f419405o).mo141623x754a37bb();
    }

    public final mj2.m z() {
        return (mj2.m) ((jz5.n) this.f419406p).mo141623x754a37bb();
    }
}
