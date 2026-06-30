package uy3;

/* loaded from: classes8.dex */
public final class j0 extends p012xc85e97e9.p016x746ad0e3.app.i0 implements wq1.d, uy3.t {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.box.C17269x3d649890 E;
    public final jz5.g F;

    /* renamed from: f, reason: collision with root package name */
    public r45.sn f513481f;

    /* renamed from: g, reason: collision with root package name */
    public android.content.Context f513482g;

    /* renamed from: h, reason: collision with root package name */
    public zg0.q2 f513483h;

    /* renamed from: i, reason: collision with root package name */
    public final uy3.g0 f513484i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.box.p1288x48fb3bf9.C12962xa24d9bee f513485m;

    /* renamed from: n, reason: collision with root package name */
    public uy3.s0 f513486n;

    /* renamed from: o, reason: collision with root package name */
    public uy3.u0 f513487o;

    /* renamed from: p, reason: collision with root package name */
    public uy3.k0 f513488p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.box.AbstractC17267x816864c7 f513489q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f513490r;

    /* renamed from: s, reason: collision with root package name */
    public int f513491s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f513492t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f513493u;

    /* renamed from: v, reason: collision with root package name */
    public int f513494v;

    /* renamed from: w, reason: collision with root package name */
    public float f513495w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f513496x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f513497y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f513498z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [androidx.lifecycle.x, com.tencent.mm.plugin.scanner.box.ScanBoxDialog$onDestroyObserver$1] */
    public j0(android.content.Context context, r45.sn homeContext, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.box.AbstractC17267x816864c7 abstractC17267x816864c7, uy3.k0 k0Var) {
        super(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f575609dr);
        int i17;
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(homeContext, "homeContext");
        uy3.i0 i0Var = new uy3.i0(this);
        uy3.h0 h0Var = new uy3.h0(this);
        this.f513484i = new uy3.g0(this);
        this.f513492t = true;
        this.f513496x = true;
        this.f513497y = true;
        this.f513498z = true;
        ?? r66 = new p012xc85e97e9.p093xedfae76a.x() { // from class: com.tencent.mm.plugin.scanner.box.ScanBoxDialog$onDestroyObserver$1
            @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
            /* renamed from: onDestroy */
            public final void m68547xac79a11b() {
                p012xc85e97e9.p093xedfae76a.o mo273xed6858b42;
                uy3.j0 j0Var = uy3.j0.this;
                java.lang.Object obj = j0Var.f513482g;
                if (obj == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mContext");
                    throw null;
                }
                p012xc85e97e9.p093xedfae76a.y yVar = obj instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) obj : null;
                if (yVar != null && (mo273xed6858b42 = yVar.mo273xed6858b4()) != null) {
                    mo273xed6858b42.c(this);
                }
                ((jz5.n) j0Var.F).mo141623x754a37bb();
            }
        };
        this.E = r66;
        this.F = jz5.h.b(new uy3.a0(this));
        this.f513489q = abstractC17267x816864c7;
        this.f513488p = k0Var;
        zg0.i3 i3Var = (zg0.i3) i95.n0.c(zg0.i3.class);
        vy3.x xVar = vy3.x.f523025b;
        ((yg0.i4) i3Var).getClass();
        java.util.ArrayList arrayList = (java.util.ArrayList) nw4.d3.f422355b;
        if (!arrayList.contains(xVar)) {
            arrayList.add(xVar);
            arrayList.size();
        }
        this.f513482g = context;
        this.f513481f = homeContext;
        this.f513487o = new uy3.u0(this);
        uy3.k0 k0Var2 = this.f513488p;
        if (k0Var2 != null) {
            ((uy3.m0) k0Var2).f513514d = java.lang.System.currentTimeMillis();
        }
        kd0.e2 e2Var = (kd0.e2) i95.n0.c(kd0.e2.class);
        android.content.Context context2 = this.f513482g;
        if (context2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mContext");
            throw null;
        }
        context2 = context2 instanceof com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 ? ((com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37) context2).m81186xd24c19fa() : context2;
        java.lang.Object obj = this.f513482g;
        if (obj == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mContext");
            throw null;
        }
        this.f513485m = (com.p314xaae8f345.mm.p1006xc5476f33.box.p1288x48fb3bf9.C12962xa24d9bee) ((jd0.c) e2Var).wi(context2, obj instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) obj : null, new uy3.b0(this));
        this.C = false;
        zg0.g3 g3Var = (zg0.g3) i95.n0.c(zg0.g3.class);
        com.p314xaae8f345.mm.p1006xc5476f33.box.p1288x48fb3bf9.C12962xa24d9bee c12962xa24d9bee = this.f513485m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c12962xa24d9bee);
        zg0.q2 Ai = ((yg0.e4) g3Var).Ai(c12962xa24d9bee, new zg0.k2(null, true, false, false, true, 0, false, 105, null), xVar);
        this.f513483h = Ai;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) Ai).D(i0Var);
        zg0.q2 q2Var = this.f513483h;
        if (q2Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) q2Var).C(h0Var);
        }
        zg0.q2 q2Var2 = this.f513483h;
        if (q2Var2 != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) q2Var2).q0();
        }
        uy3.k0 k0Var3 = this.f513488p;
        if (k0Var3 != null) {
            ((uy3.m0) k0Var3).f513515e = java.lang.System.currentTimeMillis();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanBoxDialog", "initWebView");
        this.f513486n = new uy3.s0(this);
        com.p314xaae8f345.mm.p1006xc5476f33.box.p1288x48fb3bf9.C12962xa24d9bee c12962xa24d9bee2 = this.f513485m;
        if (c12962xa24d9bee2 != null) {
            c12962xa24d9bee2.J0(null, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.box.p1288x48fb3bf9.C12962xa24d9bee c12962xa24d9bee3 = this.f513485m;
        if (c12962xa24d9bee3 != null) {
            c12962xa24d9bee3.mo81410x6fd49b97(null);
            c12962xa24d9bee3.mo74800x23d27c02(null);
            c12962xa24d9bee3.mo120520x57c53c73(true);
            i17 = 0;
            c12962xa24d9bee3.mo120519x347eaca1(false);
            c12962xa24d9bee3.setBackgroundColor(c12962xa24d9bee3.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560027f));
            c12962xa24d9bee3.G0();
        } else {
            i17 = 0;
        }
        getContext().getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), i17);
        float b17 = j65.c.b(getContext());
        if (b17 >= i65.a.v(getContext())) {
            com.p314xaae8f345.mm.p1006xc5476f33.box.p1288x48fb3bf9.C12962xa24d9bee c12962xa24d9bee4 = this.f513485m;
            com.p314xaae8f345.p3210x3857dc.z0 mo120153xd15cf999 = c12962xa24d9bee4 != null ? c12962xa24d9bee4.mo120153xd15cf999() : null;
            if (mo120153xd15cf999 != null) {
                mo120153xd15cf999.O(148);
            }
        } else if (b17 >= i65.a.u(getContext())) {
            com.p314xaae8f345.mm.p1006xc5476f33.box.p1288x48fb3bf9.C12962xa24d9bee c12962xa24d9bee5 = this.f513485m;
            com.p314xaae8f345.p3210x3857dc.z0 mo120153xd15cf9992 = c12962xa24d9bee5 != null ? c12962xa24d9bee5.mo120153xd15cf999() : null;
            if (mo120153xd15cf9992 != null) {
                mo120153xd15cf9992.O(140);
            }
        } else if (b17 >= i65.a.t(getContext())) {
            com.p314xaae8f345.mm.p1006xc5476f33.box.p1288x48fb3bf9.C12962xa24d9bee c12962xa24d9bee6 = this.f513485m;
            com.p314xaae8f345.p3210x3857dc.z0 mo120153xd15cf9993 = c12962xa24d9bee6 != null ? c12962xa24d9bee6.mo120153xd15cf999() : null;
            if (mo120153xd15cf9993 != null) {
                mo120153xd15cf9993.O(132);
            }
        } else if (b17 >= i65.a.s(getContext())) {
            com.p314xaae8f345.mm.p1006xc5476f33.box.p1288x48fb3bf9.C12962xa24d9bee c12962xa24d9bee7 = this.f513485m;
            com.p314xaae8f345.p3210x3857dc.z0 mo120153xd15cf9994 = c12962xa24d9bee7 != null ? c12962xa24d9bee7.mo120153xd15cf999() : null;
            if (mo120153xd15cf9994 != null) {
                mo120153xd15cf9994.O(124);
            }
        } else if (b17 >= i65.a.z(getContext())) {
            com.p314xaae8f345.mm.p1006xc5476f33.box.p1288x48fb3bf9.C12962xa24d9bee c12962xa24d9bee8 = this.f513485m;
            com.p314xaae8f345.p3210x3857dc.z0 mo120153xd15cf9995 = c12962xa24d9bee8 != null ? c12962xa24d9bee8.mo120153xd15cf999() : null;
            if (mo120153xd15cf9995 != null) {
                mo120153xd15cf9995.O(116);
            }
        } else if (b17 >= i65.a.w(getContext())) {
            com.p314xaae8f345.mm.p1006xc5476f33.box.p1288x48fb3bf9.C12962xa24d9bee c12962xa24d9bee9 = this.f513485m;
            com.p314xaae8f345.p3210x3857dc.z0 mo120153xd15cf9996 = c12962xa24d9bee9 != null ? c12962xa24d9bee9.mo120153xd15cf999() : null;
            if (mo120153xd15cf9996 != null) {
                mo120153xd15cf9996.O(108);
            }
        } else {
            i65.a.x(getContext());
            if (b17 >= 1.0f) {
                com.p314xaae8f345.mm.p1006xc5476f33.box.p1288x48fb3bf9.C12962xa24d9bee c12962xa24d9bee10 = this.f513485m;
                com.p314xaae8f345.p3210x3857dc.z0 mo120153xd15cf9997 = c12962xa24d9bee10 != null ? c12962xa24d9bee10.mo120153xd15cf999() : null;
                if (mo120153xd15cf9997 != null) {
                    mo120153xd15cf9997.O(100);
                }
            } else if (b17 >= i65.a.y(getContext())) {
                com.p314xaae8f345.mm.p1006xc5476f33.box.p1288x48fb3bf9.C12962xa24d9bee c12962xa24d9bee11 = this.f513485m;
                com.p314xaae8f345.p3210x3857dc.z0 mo120153xd15cf9998 = c12962xa24d9bee11 != null ? c12962xa24d9bee11.mo120153xd15cf999() : null;
                if (mo120153xd15cf9998 != null) {
                    mo120153xd15cf9998.O(92);
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.box.p1288x48fb3bf9.C12962xa24d9bee c12962xa24d9bee12 = this.f513485m;
                com.p314xaae8f345.p3210x3857dc.z0 mo120153xd15cf9999 = c12962xa24d9bee12 != null ? c12962xa24d9bee12.mo120153xd15cf999() : null;
                if (mo120153xd15cf9999 != null) {
                    mo120153xd15cf9999.O(80);
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanBoxDialog", "initFontSize, fontSize = %f", java.lang.Float.valueOf(b17));
        com.p314xaae8f345.mm.p1006xc5476f33.box.p1288x48fb3bf9.C12962xa24d9bee c12962xa24d9bee13 = this.f513485m;
        if (c12962xa24d9bee13 != null) {
            c12962xa24d9bee13.mo120128x74041feb(this.f513487o, "boxJSApi");
        }
        ((ku5.t0) ku5.t0.f394148d).B(new uy3.f0(this));
        uy3.k0 k0Var4 = this.f513488p;
        if (k0Var4 != null) {
            uy3.m0 m0Var = (uy3.m0) k0Var4;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            uy3.l0 l0Var = m0Var.f513516f;
            if (l0Var != null) {
                l0Var.f513505e = currentTimeMillis - m0Var.f513515e;
            }
            if (l0Var != null) {
                l0Var.a();
            }
        }
        java.lang.Object obj2 = this.f513482g;
        if (obj2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mContext");
            throw null;
        }
        p012xc85e97e9.p093xedfae76a.y yVar = obj2 instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) obj2 : null;
        if (yVar == null || (mo273xed6858b4 = yVar.mo273xed6858b4()) == 0) {
            return;
        }
        mo273xed6858b4.a(r66);
    }

    public boolean D() {
        return isShowing() || this.D;
    }

    public final void E() {
        try {
            if (getContext() instanceof android.app.Activity) {
                android.content.Context context = getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                if (((android.app.Activity) context).isFinishing()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScanBoxDialog", "realShowDialog ui is finishing and ignore");
                    return;
                }
            }
            super.show();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanBoxDialog", e17, "realShowDialog exception", new java.lang.Object[0]);
        }
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.i0, wq1.d
    public android.content.Context H() {
        android.content.Context context = this.f513482g;
        if (context != null) {
            return context;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mContext");
        throw null;
    }

    @Override // wq1.d
    public com.p314xaae8f345.mm.p1006xc5476f33.box.p1288x48fb3bf9.C12962xa24d9bee c() {
        return this.f513485m;
    }

    @Override // android.app.Dialog, android.content.DialogInterface, wq1.d
    public void dismiss() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.box.AbstractC17267x816864c7 abstractC17267x816864c7;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanBoxDialog", "dismissDialog isShowing: %s", java.lang.Boolean.valueOf(isShowing()));
        this.D = false;
        if (!isShowing() || (abstractC17267x816864c7 = this.f513489q) == null || abstractC17267x816864c7.U) {
            return;
        }
        abstractC17267x816864c7.c(5);
    }

    /* renamed from: dismissDialog */
    public void m170709xf0b10c72(int i17) {
        isShowing();
        this.f513491s = i17;
        this.D = false;
        if (isShowing() && this.f513490r) {
            super.dismiss();
        }
    }

    @Override // wq1.d
    public void h() {
    }

    @Override // wq1.d
    public xq1.g o() {
        return this.f513486n;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f513490r = true;
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        boolean z17;
        if (!isShowing()) {
            super.onBackPressed();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.box.AbstractC17267x816864c7 abstractC17267x816864c7 = this.f513489q;
        if (abstractC17267x816864c7 != null) {
            if (!abstractC17267x816864c7.U) {
                abstractC17267x816864c7.c(5);
            }
            z17 = true;
        } else {
            z17 = false;
        }
        if (z17) {
            return;
        }
        super.onBackPressed();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        android.view.WindowManager.LayoutParams attributes;
        android.view.View decorView;
        android.content.res.Resources resources;
        android.util.DisplayMetrics displayMetrics;
        super.onCreate(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanBoxDialog", "onCreate");
        if (this.f513492t) {
            android.view.Window window = getWindow();
            if (window != null) {
                window.addFlags(100729856);
            }
        } else {
            android.view.Window window2 = getWindow();
            if (window2 != null) {
                window2.addFlags(67108864);
            }
        }
        C(1);
        android.view.Window window3 = getWindow();
        if (window3 != null) {
            window3.setLayout(-1, -1);
        }
        android.view.Window window4 = getWindow();
        if (window4 != null) {
            window4.setDimAmount(0.0f);
        }
        android.view.Window window5 = getWindow();
        if (window5 != null) {
            window5.setWindowAnimations(com.p314xaae8f345.mm.R.C30868x68b1db1.f575610ds);
        }
        android.view.Window window6 = getWindow();
        if (window6 != null && (decorView = window6.getDecorView()) != null) {
            android.content.Context context = decorView.getContext();
            decorView.setMinimumWidth((context == null || (resources = context.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? i65.a.B(decorView.getContext()) : displayMetrics.widthPixels);
            decorView.setPadding(0, 0, 0, 0);
        }
        android.view.Window window7 = getWindow();
        if (window7 != null && (attributes = window7.getAttributes()) != null) {
            attributes.width = -1;
            attributes.height = -1;
            attributes.gravity = 80;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.box.AbstractC17267x816864c7 abstractC17267x816864c7 = this.f513489q;
        if (abstractC17267x816864c7 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.box.p1288x48fb3bf9.C12962xa24d9bee c12962xa24d9bee = this.f513485m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c12962xa24d9bee);
            abstractC17267x816864c7.f240229r = c12962xa24d9bee;
            c12962xa24d9bee.D0(new uy3.f(abstractC17267x816864c7));
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.box.C17268x970b5c33 c17268x970b5c33 = abstractC17267x816864c7.f240224o;
            if (c17268x970b5c33 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("webViewContainer");
                throw null;
            }
            c17268x970b5c33.addView(abstractC17267x816864c7.f240229r, new android.widget.RelativeLayout.LayoutParams(-1, -2));
        }
        if (abstractC17267x816864c7 != null) {
            abstractC17267x816864c7.f240220i = this;
        }
        if (abstractC17267x816864c7 != null) {
            abstractC17267x816864c7.m68545xa9f0d278(this.f513493u);
        }
        if (abstractC17267x816864c7 != null) {
            abstractC17267x816864c7.m68543x67993882(this.f513494v);
        }
        if (abstractC17267x816864c7 != null) {
            abstractC17267x816864c7.m68544xf8be882(this.f513495w);
        }
        if (abstractC17267x816864c7 != null) {
            abstractC17267x816864c7.m68540x42d8eb5a(this.f513497y);
        }
        if (abstractC17267x816864c7 != null) {
            abstractC17267x816864c7.m68542x4eb03fc1(this.f513496x);
        }
        if (abstractC17267x816864c7 != null) {
            abstractC17267x816864c7.m68539xbba588e0(this.f513498z);
        }
        if (abstractC17267x816864c7 != null) {
            abstractC17267x816864c7.m68541x6c5d9a8e(this.A);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(abstractC17267x816864c7);
        setContentView(abstractC17267x816864c7, new android.view.ViewGroup.LayoutParams(-1, -1));
        setOnShowListener(new uy3.c0(this));
        setOnDismissListener(new uy3.d0(this));
        setOnCancelListener(new uy3.e0(this));
        setCancelable(true);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f513490r = false;
    }

    @Override // android.app.Dialog
    public void show() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanBoxDialog", "showDialog showAfterWebViewReady: %b, webViewReady: %b", java.lang.Boolean.valueOf(this.B), java.lang.Boolean.valueOf(this.C));
        if (!this.B) {
            E();
        } else if (this.C) {
            E();
        } else {
            this.D = true;
        }
    }

    @Override // wq1.d
    public xq1.f u() {
        return this.f513487o;
    }
}
