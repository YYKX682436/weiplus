package yu4;

/* loaded from: classes8.dex */
public final class k extends p012xc85e97e9.p016x746ad0e3.app.i0 implements com.p314xaae8f345.mm.ui.p2740x696c9db.c5 {

    /* renamed from: f, reason: collision with root package name */
    public final r45.xi0 f547414f;

    /* renamed from: g, reason: collision with root package name */
    public final ur.l f547415g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f547416h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f547417i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f547418m;

    /* renamed from: n, reason: collision with root package name */
    public yu4.n f547419n;

    /* renamed from: o, reason: collision with root package name */
    public yu4.o f547420o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f547421p;

    /* renamed from: q, reason: collision with root package name */
    public long f547422q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f547423r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(android.content.Context context, r45.xi0 homeContext, ur.l listener) {
        super(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f575690fp);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(homeContext, "homeContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f547414f = homeContext;
        this.f547415g = listener;
        this.f547416h = "MicroMsg.WebSearch.EmojiSearchDialog";
        this.f547421p = "com.tencent.mm.Intent.ACTION_NET_STATS";
    }

    public final void D(r45.sn3 shareContent, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareContent, "shareContent");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f547416h, "onSearchShare " + shareContent.mo12245xcc313de3() + '}');
        pm0.v.X(new yu4.f(this, shareContent, str));
    }

    public final void E(java.lang.String id6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        if (this.f547423r == null) {
            this.f547423r = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(getContext(), getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), true, 0, new yu4.g(this));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f547423r;
        if (u3Var == null || u3Var.isShowing()) {
            return;
        }
        u3Var.show();
    }

    public final void F(r45.lw5 emoticon, r45.rn3 request, byte[] bArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emoticon, "emoticon");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f547422q = android.os.SystemClock.elapsedRealtime();
        o25.q1 q1Var = (o25.q1) i95.n0.c(o25.q1.class);
        android.content.Context context = getContext();
        r45.xi0 xi0Var = this.f547414f;
        ((r35.k1) q1Var).Bi(context, xi0Var.f471656o, emoticon.mo14344x5f01b1f6(), null, xi0Var.f471658q, this.f547422q, bArr, new yu4.h(this, request));
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.f547422q = 0L;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.t0(this.f547417i);
        super.dismiss();
        android.content.Intent intent = new android.content.Intent(this.f547421p);
        intent.putExtra("ui", yu4.k.class.getSimpleName());
        intent.putExtra("opCode", 4);
        getContext().sendBroadcast(intent);
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        android.view.View findViewById;
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator rotation;
        android.view.ViewPropertyAnimator duration;
        android.widget.TextView textView;
        if (!this.f547418m) {
            dismiss();
            return;
        }
        android.view.View view = this.f547417i;
        if (view != null && (textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.odf)) != null) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.bxv);
        }
        android.view.View view2 = this.f547417i;
        if (view2 != null && (findViewById = view2.findViewById(com.p314xaae8f345.mm.R.id.f565291bz2)) != null && (animate = findViewById.animate()) != null && (rotation = animate.rotation(0.0f)) != null && (duration = rotation.setDuration(200L)) != null) {
            duration.start();
        }
        yu4.o oVar = this.f547420o;
        if (oVar != null) {
            oVar.f547442g.animate().translationX(i65.a.B(oVar.H())).setDuration(300L).start();
        }
        this.f547418m = false;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        android.view.Window window2 = getWindow();
        if (window2 != null) {
            window2.addFlags(67108864);
        }
        android.view.Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(48);
        }
        android.view.Window window4 = getWindow();
        if (window4 != null) {
            window4.setDimAmount(0.5f);
        }
        android.view.Window window5 = getWindow();
        if (window5 != null) {
            window5.setWindowAnimations(com.p314xaae8f345.mm.R.C30868x68b1db1.f575608dq);
        }
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a7d, (android.view.ViewGroup) null);
        setContentView(inflate, new android.view.ViewGroup.LayoutParams(-1, -1));
        inflate.findViewById(com.p314xaae8f345.mm.R.id.f565753df2).setOnTouchListener(new yu4.a(this));
        inflate.findViewById(com.p314xaae8f345.mm.R.id.f565291bz2).setOnClickListener(new yu4.b(this));
        ((android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.meb)).setOnClickListener(new yu4.c(inflate));
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odf)).setTextSize(0, i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561383gz) * i65.a.m(getContext()));
        this.f547419n = new yu4.n(this, this.f547414f, this.f547415g, inflate);
        setOnShowListener(new yu4.d(this));
        setOnDismissListener(new yu4.e(this));
        setCancelable(true);
        this.f547417i = inflate;
        android.content.Intent intent = new android.content.Intent(this.f547421p);
        intent.putExtra("ui", yu4.k.class.getSimpleName());
        intent.putExtra("opCode", 3);
        getContext().sendBroadcast(intent);
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public void w2(int i17, boolean z17) {
        yu4.n nVar = this.f547419n;
        if (nVar != null) {
            nVar.f547438q = a06.d.b(i17 / i65.a.g(nVar.f547428d.getContext()));
            nVar.f547434m.e(nVar.a(), nVar.f547438q);
        }
    }
}
