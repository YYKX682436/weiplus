package jw3;

/* loaded from: classes8.dex */
public final class i extends p012xc85e97e9.p016x746ad0e3.app.i0 implements wq1.d {

    /* renamed from: f, reason: collision with root package name */
    public r45.sn f383857f;

    /* renamed from: g, reason: collision with root package name */
    public android.content.Context f383858g;

    /* renamed from: h, reason: collision with root package name */
    public zg0.q2 f383859h;

    /* renamed from: i, reason: collision with root package name */
    public final jw3.g f383860i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f383861m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.Button f383862n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f383863o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f383864p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f383865q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.FrameLayout f383866r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.FrameLayout f383867s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.box.p1288x48fb3bf9.C12962xa24d9bee f383868t;

    /* renamed from: u, reason: collision with root package name */
    public uc0.s f383869u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(android.content.Context context, r45.sn homeContext, uc0.s sVar) {
        super(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f575609dr);
        com.p314xaae8f345.mm.p1006xc5476f33.box.p1288x48fb3bf9.C12962xa24d9bee c12962xa24d9bee;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(homeContext, "homeContext");
        jw3.h hVar = new jw3.h(this);
        this.f383860i = new jw3.g(this);
        zg0.i3 i3Var = (zg0.i3) i95.n0.c(zg0.i3.class);
        iw3.f fVar = iw3.f.f376770b;
        ((yg0.i4) i3Var).getClass();
        java.util.ArrayList arrayList = (java.util.ArrayList) nw4.d3.f422355b;
        if (!arrayList.contains(fVar)) {
            arrayList.add(fVar);
            arrayList.size();
        }
        this.f383858g = context;
        this.f383857f = homeContext;
        this.f383869u = sVar;
        boolean z17 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2533xb4860a9e.C20214x7e305b95()) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectTextDialog", "createWebView() called enablePreloadWebView:" + z17);
        if (z17) {
            kd0.e2 e2Var = (kd0.e2) i95.n0.c(kd0.e2.class);
            android.content.Context context2 = this.f383858g;
            if (context2 == 0) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mContext");
                throw null;
            }
            c12962xa24d9bee = (com.p314xaae8f345.mm.p1006xc5476f33.box.p1288x48fb3bf9.C12962xa24d9bee) ((jd0.c) e2Var).wi(context2, context2 instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) context2 : null, jw3.a.f383849d);
        } else {
            android.content.Context context3 = this.f383858g;
            if (context3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mContext");
                throw null;
            }
            c12962xa24d9bee = new com.p314xaae8f345.mm.p1006xc5476f33.box.p1288x48fb3bf9.C12962xa24d9bee(context3);
        }
        this.f383868t = c12962xa24d9bee;
        c12962xa24d9bee.J0(null, null);
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            com.p314xaae8f345.mm.p1006xc5476f33.box.p1288x48fb3bf9.C12962xa24d9bee c12962xa24d9bee2 = this.f383868t;
            com.p314xaae8f345.p3210x3857dc.z0 mo120153xd15cf999 = c12962xa24d9bee2 != null ? c12962xa24d9bee2.mo120153xd15cf999() : null;
            if (mo120153xd15cf999 != null) {
                mo120153xd15cf999.B(2);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.box.p1288x48fb3bf9.C12962xa24d9bee c12962xa24d9bee3 = this.f383868t;
            if (c12962xa24d9bee3 != null) {
                c12962xa24d9bee3.setBackgroundColor(0);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.box.p1288x48fb3bf9.C12962xa24d9bee c12962xa24d9bee4 = this.f383868t;
            android.graphics.drawable.Drawable background = c12962xa24d9bee4 != null ? c12962xa24d9bee4.getBackground() : null;
            if (background != null) {
                background.setAlpha(0);
            }
        }
        android.widget.FrameLayout frameLayout = this.f383867s;
        if (frameLayout != null) {
            frameLayout.addView(this.f383868t);
        }
        setCancelable(true);
        zg0.g3 g3Var = (zg0.g3) i95.n0.c(zg0.g3.class);
        com.p314xaae8f345.mm.p1006xc5476f33.box.p1288x48fb3bf9.C12962xa24d9bee c12962xa24d9bee5 = this.f383868t;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c12962xa24d9bee5);
        zg0.q2 Ai = ((yg0.e4) g3Var).Ai(c12962xa24d9bee5, new zg0.k2(null, true, false, false, true, 0, false, 105, null), fVar);
        this.f383859h = Ai;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) Ai).D(hVar);
        zg0.q2 q2Var = this.f383859h;
        if (q2Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) q2Var).q0();
        }
        ((ku5.t0) ku5.t0.f394148d).B(new jw3.f(this));
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.i0, wq1.d
    public android.content.Context H() {
        android.content.Context context = this.f383858g;
        if (context != null) {
            return context;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mContext");
        throw null;
    }

    @Override // wq1.d
    public com.p314xaae8f345.mm.p1006xc5476f33.box.p1288x48fb3bf9.C12962xa24d9bee c() {
        return this.f383868t;
    }

    @Override // android.app.Dialog, android.content.DialogInterface, wq1.d
    public void dismiss() {
        android.content.Context context = getContext();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 ? (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context : null;
        if (activityC0065xcd7aa112 != null && activityC0065xcd7aa112.isDestroyed()) {
            return;
        }
        if (activityC0065xcd7aa112 != null && activityC0065xcd7aa112.isFinishing()) {
            return;
        }
        super.dismiss();
    }

    @Override // wq1.d
    public void h() {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // wq1.d
    public xq1.g o() {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        android.text.TextPaint paint;
        android.widget.FrameLayout frameLayout;
        android.widget.Button button;
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
            window3.setDimAmount(0.5f);
        }
        uc0.r[] rVarArr = uc0.r.f507808d;
        android.view.Window window4 = getWindow();
        if (window4 != null) {
            window4.setWindowAnimations(com.p314xaae8f345.mm.R.C30868x68b1db1.f575608dq);
        }
        C(1);
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570975ck3, (android.view.ViewGroup) null, false);
        setContentView(inflate, new android.view.ViewGroup.LayoutParams(-1, -1));
        this.f383861m = inflate;
        if (inflate != null) {
        }
        android.view.View view = this.f383861m;
        this.f383867s = view != null ? (android.widget.FrameLayout) view.findViewById(com.p314xaae8f345.mm.R.id.f569232pi0) : null;
        android.view.View view2 = this.f383861m;
        this.f383866r = view2 != null ? (android.widget.FrameLayout) view2.findViewById(com.p314xaae8f345.mm.R.id.gxo) : null;
        android.view.View view3 = this.f383861m;
        this.f383862n = view3 != null ? (android.widget.Button) view3.findViewById(com.p314xaae8f345.mm.R.id.e2o) : null;
        android.view.View view4 = this.f383861m;
        this.f383863o = view4 != null ? (android.widget.TextView) view4.findViewById(com.p314xaae8f345.mm.R.id.cz6) : null;
        android.view.View view5 = this.f383861m;
        this.f383864p = view5 != null ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view5.findViewById(com.p314xaae8f345.mm.R.id.llx) : null;
        android.view.View view6 = this.f383861m;
        this.f383865q = view6 != null ? (android.widget.TextView) view6.findViewById(com.p314xaae8f345.mm.R.id.czu) : null;
        android.widget.TextView textView = this.f383863o;
        if (textView != null) {
            textView.setVisibility(0);
        }
        android.widget.TextView textView2 = this.f383863o;
        if (textView2 != null) {
            textView2.setOnClickListener(new jw3.b(this));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f383864p;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setVisibility(8);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f383864p;
        if (c22699x3dcdb3522 != null) {
            c22699x3dcdb3522.setOnClickListener(new jw3.c(this));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = this.f383864p;
        if (c22699x3dcdb3523 != null) {
            c22699x3dcdb3523.post(new jw3.d(c22699x3dcdb3523));
        }
        android.widget.FrameLayout frameLayout2 = this.f383867s;
        if (frameLayout2 != null) {
            frameLayout2.addView(this.f383868t);
        }
        setOnDismissListener(new jw3.e(this));
        setCancelable(true);
        uc0.s sVar = this.f383869u;
        if (sVar != null) {
            zv2.m mVar = ((zv2.e) sVar).f557934a;
            java.lang.String string = mVar.f557928d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.evr);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            if (string.length() == 0) {
                android.widget.TextView textView3 = this.f383865q;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
            } else {
                android.widget.TextView textView4 = this.f383865q;
                if (textView4 != null && (paint = textView4.getPaint()) != null) {
                    com.p314xaae8f345.mm.ui.bk.r0(paint, 0.8f);
                }
                android.widget.TextView textView5 = this.f383865q;
                if (textView5 != null) {
                    textView5.setText(string);
                }
                android.widget.TextView textView6 = this.f383865q;
                if (textView6 != null) {
                    textView6.setVisibility(0);
                }
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = mVar.f557928d;
            java.lang.String string2 = activityC0065xcd7aa112.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            if (!(string2.length() == 0) && (button = this.f383862n) != null) {
                button.setText(string2);
            }
            mVar.f557949o = com.p314xaae8f345.mm.ui.id.b(activityC0065xcd7aa112).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b2_, (android.view.ViewGroup) null, false);
            zv2.m.m(mVar);
            android.view.View view7 = mVar.f557949o;
            if (view7 == null || (frameLayout = this.f383866r) == null) {
                return;
            }
            frameLayout.addView(view7);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        android.view.Window window = getWindow();
        if (window != null) {
            window.addFlags(Integer.MIN_VALUE);
        }
        try {
            if (getContext() instanceof android.app.Activity) {
                android.content.Context context = getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                if (((android.app.Activity) context).isFinishing()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SelectTextDialog", "realShowDialog ui is finishing and ignore");
                }
            }
            super.show();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SelectTextDialog", e17, "realShowDialog exception", new java.lang.Object[0]);
        }
    }

    @Override // wq1.d
    public xq1.f u() {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }
}
