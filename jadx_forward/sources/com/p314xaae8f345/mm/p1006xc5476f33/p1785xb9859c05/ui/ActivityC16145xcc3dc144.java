package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponCardUI */
/* loaded from: classes8.dex */
public class ActivityC16145xcc3dc144 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0, jk5.b, jk5.a {
    public static final /* synthetic */ int F = 0;
    public android.view.View E;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f224203d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f224204e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f224205f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f224206g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f224207h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.Button f224208i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f224209m;

    /* renamed from: n, reason: collision with root package name */
    public final jk5.j f224210n = new jk5.j();

    /* renamed from: o, reason: collision with root package name */
    public android.app.ProgressDialog f224211o = null;

    /* renamed from: p, reason: collision with root package name */
    public android.app.ProgressDialog f224212p = null;

    /* renamed from: q, reason: collision with root package name */
    public android.app.ProgressDialog f224213q = null;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ImageView f224214r = null;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ProgressBar f224215s = null;

    /* renamed from: t, reason: collision with root package name */
    public final q83.d f224216t = new q83.d();

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f224217u = null;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f224218v = null;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f224219w = null;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f224220x = null;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f224221y = null;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f224222z = null;
    public java.lang.String A = null;
    public r45.u57 B = null;
    public java.lang.String C = null;
    public int D = 0;

    @Override // jk5.b
    public void I4(jk5.c cVar) {
        android.app.ProgressDialog progressDialog = this.f224212p;
        if (progressDialog != null) {
            progressDialog.cancel();
        }
        int ordinal = cVar.ordinal();
        if (ordinal == 0) {
            db5.e1.n(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.f574944k25, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.n4(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.o4(this));
        } else {
            if (ordinal != 1) {
                return;
            }
            db5.e1.n(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.f574943k24, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.n4(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.o4(this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap T6() {
        /*
            r8 = this;
            java.lang.String r0 = c01.z1.r()
            java.lang.String r1 = g83.a.a()
            java.lang.String r2 = g83.a.b()
            java.lang.String r3 = "qr_"
            byte[] r0 = r0.getBytes()
            java.lang.String r4 = kk.k.g(r0)
            java.lang.String r5 = ".png"
            r6 = 1
            r7 = 1
            java.lang.String r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.h1.a(r1, r2, r3, r4, r5, r6, r7)
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)
            r2 = 0
            java.lang.String r3 = "MicroMsg.IPCallShareCouponCardUI"
            if (r1 == 0) goto L2d
            java.lang.String r0 = "filename is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r0)
            goto L55
        L2d:
            r1 = 0
            java.io.RandomAccessFile r0 = com.p314xaae8f345.mm.vfs.w6.B(r0, r1)     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L47
            long r4 = r0.length()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            int r4 = (int) r4     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            r0.read(r4)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            r0.close()     // Catch: java.lang.Exception -> L56
            goto L56
        L40:
            r1 = move-exception
            r2 = r0
            goto L5e
        L43:
            r4 = move-exception
            goto L49
        L45:
            r0 = move-exception
            goto L5f
        L47:
            r4 = move-exception
            r0 = r2
        L49:
            java.lang.String r5 = ""
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L40
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r3, r4, r5, r1)     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L55
            r0.close()     // Catch: java.lang.Exception -> L55
        L55:
            r4 = r2
        L56:
            if (r4 != 0) goto L59
            return r2
        L59:
            android.graphics.Bitmap r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.G(r4)
            return r0
        L5e:
            r0 = r1
        L5f:
            if (r2 == 0) goto L64
            r2.close()     // Catch: java.lang.Exception -> L64
        L64:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16145xcc3dc144.T6():android.graphics.Bitmap");
    }

    public final void U6(int i17, java.lang.String str, java.lang.String str2) {
        android.view.View inflate = android.view.View.inflate(mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f570206a02, null);
        this.E = inflate;
        android.widget.EditText editText = (android.widget.EditText) inflate.findViewById(com.p314xaae8f345.mm.R.id.c_l);
        this.f224214r = (android.widget.ImageView) this.E.findViewById(com.p314xaae8f345.mm.R.id.c_i);
        this.f224215s = (android.widget.ProgressBar) this.E.findViewById(com.p314xaae8f345.mm.R.id.imb);
        editText.setText(str);
        android.graphics.Bitmap T6 = T6();
        if (T6 == null) {
            c01.d9.e().g(new g21.a(c01.z1.r(), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) c01.d9.b().p().l(66561, null)), 0));
            this.f224215s.setVisibility(0);
        } else {
            android.widget.ImageView imageView = this.f224214r;
            if (imageView != null) {
                imageView.setImageBitmap(T6);
            }
        }
        r35.j1.i(this.f39322x2305be9, str2, this.E, getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya), new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.d4(this, editText, str, i17));
    }

    @Override // jk5.a
    public void V2(jk5.c cVar) {
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.blp;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 1 || intent == null) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            return;
        }
        r35.j1.j(mo78514x143f1b92(), this.f224220x, this.f224219w, this.f224218v, null, true, getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya), new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.g4(this, stringExtra));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.g6b);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.h4(this));
        this.f224203d = findViewById(com.p314xaae8f345.mm.R.id.hur);
        this.f224204e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ckd);
        this.f224205f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.cqh);
        this.f224206g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565490ck3);
        this.f224207h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.cke);
        this.f224208i = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.msh);
        this.f224209m = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.gyk);
        android.view.View view = this.f224203d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponCardUI", "initview", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponCardUI", "initview", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(this.f224209m, c01.z1.r(), 0.5f);
        this.f224213q = db5.e1.Q(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g3z), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.i4(this));
        if (r83.b.f474844b == null) {
            r83.b.f474844b = new r83.b();
        }
        r83.b.f474844b.a(false);
        this.D = getIntent().getIntExtra("IPCallShareCouponCardUI_KFrom", 0);
        c01.d9.e().a(257, this);
        c01.d9.e().a(1804, this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c01.d9.e().q(257, this);
        c01.d9.e().q(1804, this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (!(m1Var instanceof p83.g)) {
            if (!(m1Var instanceof w11.o0)) {
                if ((m1Var instanceof g21.a) && i17 == 0 && i18 == 0 && this.f224214r != null) {
                    android.widget.ProgressBar progressBar = this.f224215s;
                    if (progressBar != null) {
                        progressBar.setVisibility(8);
                    }
                    this.f224214r.setImageBitmap(T6());
                    return;
                }
                return;
            }
            android.app.ProgressDialog progressDialog = this.f224211o;
            if (progressDialog != null) {
                progressDialog.dismiss();
                this.f224211o = null;
            }
            o25.s1 wi6 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
            ((com.p314xaae8f345.mm.app.o7) wi6).getClass();
            if (com.p314xaae8f345.mm.ui.pc.a(mo55332x76847179, i17, i18, str, 7)) {
                return;
            }
            if (i17 == 0 && i18 == 0) {
                db5.e1.T(this, getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572473bb2));
                return;
            } else {
                db5.e1.i(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.iil, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
                return;
            }
        }
        if (i17 != 0 || i18 != 0) {
            android.app.ProgressDialog progressDialog2 = this.f224213q;
            if (progressDialog2 == null || !progressDialog2.isShowing()) {
                return;
            }
            this.f224213q.dismiss();
            db5.e1.t(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g3x), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g3s), new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.j4(this));
            return;
        }
        android.view.View view = this.f224203d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponCardUI", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponCardUI", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r45.zr3 e17 = t83.f.e();
        if (e17 != null) {
            this.f224217u = e17.f473850d;
            this.f224218v = e17.f473853g;
            this.f224219w = e17.f473854h;
            this.f224220x = e17.f473852f;
            this.f224221y = e17.f473855i;
            this.f224222z = e17.f473858o;
            this.A = e17.f473860q;
            this.B = e17.f473859p;
            this.C = e17.f473861r;
        }
        this.f224204e.setText(this.A);
        this.f224205f.setText(java.lang.String.format(mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573889g65), this.f224217u));
        this.f224208i.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.k4(this));
        this.f224206g.setText(java.lang.String.format(getString(com.p314xaae8f345.mm.R.C30867xcad56011.g67), this.A));
        android.widget.TextView textView = this.f224207h;
        java.lang.String format = java.lang.String.format(getString(com.p314xaae8f345.mm.R.C30867xcad56011.g66), this.A);
        java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6a);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            textView.setText(format);
        } else {
            java.lang.String string2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6c);
            android.text.TextPaint paint = textView.getPaint();
            float measureText = paint.measureText(format);
            float measureText2 = paint.measureText(string2);
            float B = i65.a.B(mo55332x76847179()) - (((android.widget.LinearLayout.LayoutParams) textView.getLayoutParams()).leftMargin + ((android.widget.LinearLayout.LayoutParams) textView.getLayoutParams()).rightMargin);
            int ceil = (int) java.lang.Math.ceil(measureText / B);
            int ceil2 = (int) java.lang.Math.ceil((measureText + measureText2) / B);
            if (ceil == 0) {
                ceil = 1;
            }
            if (ceil2 > ceil) {
                string2 = "\n" + string2;
            }
            textView.setGravity(17);
            android.text.Spannable newSpannable = android.text.Spannable.Factory.getInstance().newSpannable(format + string2);
            newSpannable.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.f4(this, string), format.length(), format.length() + string2.length(), 33);
            textView.setText(newSpannable);
            textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        }
        android.app.ProgressDialog progressDialog3 = this.f224213q;
        if (progressDialog3 == null || !progressDialog3.isShowing()) {
            return;
        }
        this.f224213q.dismiss();
    }
}
