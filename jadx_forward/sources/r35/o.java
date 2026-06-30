package r35;

/* loaded from: classes11.dex */
public class o implements kv.e0, ns.e, r35.o3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f450748d;

    /* renamed from: e, reason: collision with root package name */
    public final int f450749e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f450750f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f450751g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f450752h;

    /* renamed from: i, reason: collision with root package name */
    public int f450753i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f450754m;

    /* renamed from: n, reason: collision with root package name */
    public int f450755n;

    /* renamed from: o, reason: collision with root package name */
    public final r35.n3 f450756o;

    /* renamed from: p, reason: collision with root package name */
    public android.app.ProgressDialog f450757p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f450758q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f450759r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f450760s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f450761t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f450762u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f450763v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f450764w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f450765x;

    public o(android.content.Context context, java.lang.String str, int i17, r35.n3 n3Var, o25.a aVar, boolean z17) {
        this(context, str, i17, n3Var);
        d(aVar);
        this.f450765x = z17;
    }

    @Override // kv.e0
    public void U(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f450760s;
        if (z3Var != null) {
            boolean z17 = z3Var.d1() != null && this.f450760s.d1().equals(str);
            boolean z18 = this.f450760s.t0() != null && this.f450760s.t0().equals(str);
            if (!z17 && !z18) {
                return;
            }
        } else {
            java.lang.String str2 = this.f450761t;
            if (str2 == null || !str2.equals(str)) {
                return;
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = this.f450758q;
        if (j0Var == null || !j0Var.isShowing()) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new r35.l(this));
    }

    @Override // ns.e
    public void a(boolean z17, boolean z18, java.lang.String str, java.lang.String str2) {
        android.app.ProgressDialog progressDialog = this.f450757p;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        if (!z17) {
            b(-1);
            return;
        }
        this.f450760s.N2();
        this.f450760s.X1(str);
        if (((int) this.f450760s.E2) == 0) {
            gm0.j1.i();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().h0(this.f450760s);
        } else {
            gm0.j1.i();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().p0(this.f450760s.d1(), this.f450760s);
        }
        if (this.f450763v) {
            android.content.Context context = this.f450748d;
            db5.e1.U(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.law), 1);
        }
        b(1);
    }

    public final void b(int i17) {
        r35.n3 n3Var = this.f450756o;
        if (n3Var != null) {
            n3Var.a(i17);
        }
    }

    public final void c(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        android.app.ProgressDialog progressDialog = this.f450757p;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        android.content.Context context = this.f450748d;
        boolean z17 = this.f450765x;
        if (!z17) {
            android.content.Context context2 = this.f450748d;
            this.f450757p = db5.e1.Q(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lat), true, true, null);
        }
        r35.a aVar = new r35.a(context, this);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(java.lang.Integer.valueOf(this.f450749e));
        r45.hy6 hy6Var = new r45.hy6();
        hy6Var.f458091e = this.f450750f;
        hy6Var.f458094h = this.f450751g;
        hy6Var.f458093g = this.f450752h;
        hy6Var.f458090d = this.f450753i;
        aVar.F = hy6Var;
        aVar.C = 0;
        aVar.D = this.f450754m;
        aVar.f450555w = !z17;
        aVar.b(z3Var.d1(), linkedList, false, this.f450764w);
    }

    public final void d(o25.a aVar) {
        if (aVar != null) {
            this.f450762u = aVar.f424002g;
            this.f450764w = aVar.f423996a;
            this.f450755n = aVar.f423997b;
            this.f450750f = aVar.f423998c;
            this.f450751g = aVar.f423999d;
            this.f450752h = aVar.f424000e;
            this.f450753i = aVar.f424001f;
            this.f450754m = "";
            this.f450763v = aVar.f424003h;
        }
    }

    public final void e(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddContactDialog", "searchContact %s", str);
        if (this.f450759r == null) {
            this.f450759r = new r35.m(this);
        }
        gm0.j1.i();
        gm0.j1.n().f354821b.a(106, this.f450759r);
        tg3.r1 r1Var = new tg3.r1(str, this.f450755n);
        gm0.j1.i();
        gm0.j1.n().f354821b.g(r1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f() {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r35.o.f():void");
    }

    public final void g(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        android.widget.EditText editText;
        if (z3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AddContactDialog", "showContact fail, contact is null");
            b(-1);
            return;
        }
        android.content.Context context = this.f450748d;
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lar);
        kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
        java.lang.String d17 = z3Var.d1();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) c0Var).getClass();
        android.graphics.Bitmap a17 = com.p314xaae8f345.mm.p943x351df9c2.g.a(d17);
        if (a17 == null) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().d(this);
        }
        if (a17 != null && z3Var.k2()) {
            a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(a17, false, a17.getWidth() / 2);
        }
        java.lang.String P0 = z3Var.P0();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = null;
        this.f450758q = null;
        if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            if (!this.f450762u) {
                c(z3Var);
                return;
            }
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.p314xaae8f345.mm.p943x351df9c2.r0 n07 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().n0(z3Var.d1());
            java.lang.String d18 = (n07 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n07.d())) ? null : n07.d();
            com.p314xaae8f345.mm.ui.ga mo78514x143f1b92 = ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).mo78514x143f1b92();
            r35.k kVar = new r35.k(this, z3Var);
            if ((string == null || string.length() == 0) && (P0 == null || P0.length() == 0)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMConfirmDialog", "showDialogItem6 fail, title message both are empty");
            } else {
                android.view.View inflate = ((android.view.LayoutInflater) mo78514x143f1b92.x().getSystemService("layout_inflater")).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570208a05, (android.view.ViewGroup) null);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0(mo78514x143f1b92.x());
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = i0Var.f293354b;
                aVar.A = false;
                aVar.B = false;
                if (inflate != null && (editText = (android.widget.EditText) inflate.findViewById(com.p314xaae8f345.mm.R.id.c_l)) != null) {
                    editText.setVisibility(8);
                }
                r35.j1.e(mo78514x143f1b92, i0Var, kVar, inflate, mo78514x143f1b92.x().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bbp));
                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.c_o);
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 x17 = mo78514x143f1b92.x();
                float textSize = textView.getTextSize();
                ((ke0.e) xVar).getClass();
                textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(x17, string, textSize));
                textView.getPaint().setFakeBoldText(true);
                android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.c_k);
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 x18 = mo78514x143f1b92.x();
                float textSize2 = textView2.getTextSize();
                ((ke0.e) xVar2).getClass();
                textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(x18, P0, textSize2));
                android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.c_m);
                if (imageView != null) {
                    if (a17 != null && !a17.isRecycled()) {
                        imageView.setImageBitmap(a17);
                        aVar.H = new r35.w0(a17);
                    } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d18)) {
                        imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bgo);
                    } else {
                        n11.a b17 = n11.a.b();
                        o11.f fVar = new o11.f();
                        fVar.f423624o = com.p314xaae8f345.mm.R.C30861xcebc809e.bgo;
                        fVar.f423612c = true;
                        fVar.f423629t = true;
                        b17.h(d18, imageView, fVar.a());
                    }
                }
                aVar.L = inflate;
                j0Var = i0Var.a();
                j0Var.show();
            }
            this.f450758q = j0Var;
        }
        if (this.f450758q == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AddContactDialog", "showContact fail, cannot show dialog");
            b(-1);
        }
    }

    public o(android.content.Context context, java.lang.String str, int i17, r35.n3 n3Var) {
        this.f450754m = "";
        this.f450755n = 0;
        this.f450759r = null;
        this.f450762u = true;
        this.f450763v = true;
        this.f450748d = context;
        this.f450761t = str;
        this.f450749e = i17;
        this.f450756o = n3Var;
    }
}
