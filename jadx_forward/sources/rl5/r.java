package rl5;

/* loaded from: classes15.dex */
public class r implements android.widget.PopupWindow.OnDismissListener, android.widget.AdapterView.OnItemClickListener, android.view.View.OnKeyListener {

    /* renamed from: l1, reason: collision with root package name */
    public static boolean f478865l1;

    /* renamed from: x0, reason: collision with root package name */
    public static int f478866x0;

    /* renamed from: y0, reason: collision with root package name */
    public static int f478867y0;
    public android.view.View A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f478868J;
    public boolean K;
    public android.widget.PopupWindow.OnDismissListener L;
    public rl5.o M;
    public boolean N;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public int T;
    public boolean U;
    public boolean V;
    public boolean W;
    public long X;
    public rl5.n Y;
    public boolean Z;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f478869d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.LayoutInflater f478870e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f478871f;

    /* renamed from: g, reason: collision with root package name */
    public rl5.q f478872g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21505x98c24a7e f478873h;

    /* renamed from: i, reason: collision with root package name */
    public db5.d5 f478874i;

    /* renamed from: m, reason: collision with root package name */
    public db5.d5 f478875m;

    /* renamed from: n, reason: collision with root package name */
    public db5.d5 f478876n;

    /* renamed from: o, reason: collision with root package name */
    public db5.d5 f478877o;

    /* renamed from: p, reason: collision with root package name */
    public int f478878p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f478879p0;

    /* renamed from: q, reason: collision with root package name */
    public int f478880q;

    /* renamed from: r, reason: collision with root package name */
    public android.util.DisplayMetrics f478881r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f478882s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f478883t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View.OnCreateContextMenuListener f478884u;

    /* renamed from: v, reason: collision with root package name */
    public db5.r4 f478885v;

    /* renamed from: w, reason: collision with root package name */
    public db5.q4 f478886w;

    /* renamed from: x, reason: collision with root package name */
    public db5.t4 f478887x;

    /* renamed from: y, reason: collision with root package name */
    public db5.n4 f478888y;

    /* renamed from: z, reason: collision with root package name */
    public db5.g4 f478889z;

    public r(android.content.Context context, android.view.View view) {
        this.f478869d = null;
        this.f478872g = null;
        this.f478882s = false;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = 0;
        this.I = false;
        this.K = false;
        this.N = false;
        this.P = false;
        this.Q = true;
        this.R = true;
        this.S = true;
        this.T = 0;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = 0L;
        this.Z = true;
        this.f478879p0 = false;
        this.f478869d = context;
        this.f478871f = view;
        this.f478870e = (android.view.LayoutInflater) context.getSystemService("layout_inflater");
        c();
        l();
    }

    public boolean a() {
        if (e()) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21505x98c24a7e c21505x98c24a7e = this.f478873h;
            if (c21505x98c24a7e != null) {
                c21505x98c24a7e.a();
            }
            return true;
        }
        db5.d5 d5Var = this.f478874i;
        if (d5Var != null && d5Var.isShowing()) {
            db5.d5 d5Var2 = this.f478874i;
            if (d5Var2 != null) {
                d5Var2.dismiss();
            }
            return true;
        }
        if (d()) {
            db5.d5 d5Var3 = this.f478875m;
            if (d5Var3 != null) {
                d5Var3.dismiss();
            }
            return true;
        }
        db5.d5 d5Var4 = this.f478877o;
        if (!(d5Var4 != null && d5Var4.isShowing())) {
            return false;
        }
        db5.d5 d5Var5 = this.f478877o;
        if (d5Var5 != null) {
            d5Var5.dismiss();
        }
        return true;
    }

    public int b() {
        db5.d5 d5Var = this.f478875m;
        if (d5Var == null || d5Var.getContentView() == null) {
            return 0;
        }
        android.view.View contentView = this.f478875m.getContentView();
        contentView.measure(0, 0);
        return contentView.getMeasuredHeight();
    }

    public final void c() {
        a();
        android.content.Context context = this.f478869d;
        this.f478889z = new db5.g4(context);
        this.f478872g = new rl5.q(this, null);
        this.f478881r = context.getResources().getDisplayMetrics();
    }

    public boolean d() {
        db5.d5 d5Var = this.f478875m;
        return d5Var != null && d5Var.isShowing();
    }

    public boolean e() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21505x98c24a7e c21505x98c24a7e = this.f478873h;
        return c21505x98c24a7e != null && c21505x98c24a7e.f279010g.isShowing();
    }

    public void f(android.view.View view, db5.n4 n4Var, db5.t4 t4Var, int i17, int i18) {
        this.f478887x = t4Var;
        this.f478871f = view;
        if (!(view instanceof android.widget.TextView) && (i17 == 0 || i18 == 0)) {
            l();
        }
        this.f478889z.clear();
        n4Var.a(this.f478889z, view, null);
        if (i17 == 0 && i18 == 0) {
            m();
        } else {
            n(i17, i18);
        }
    }

    public void g(android.view.View view, int i17, long j17, android.view.View.OnCreateContextMenuListener onCreateContextMenuListener, db5.t4 t4Var, int i18, int i19) {
        this.f478887x = t4Var;
        this.f478871f = view;
        l();
        this.f478889z.clear();
        android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = new android.widget.AdapterView.AdapterContextMenuInfo(view, i17, j17);
        onCreateContextMenuListener.onCreateContextMenu(this.f478889z, view, adapterContextMenuInfo);
        java.util.Iterator it = ((java.util.ArrayList) this.f478889z.f309877d).iterator();
        while (it.hasNext()) {
            ((db5.h4) ((android.view.MenuItem) it.next())).f309914y = adapterContextMenuInfo;
        }
        if (i18 == 0 && i19 == 0) {
            m();
        } else {
            n(i18, i19);
        }
    }

    public void h(android.view.View view, android.view.View.OnCreateContextMenuListener onCreateContextMenuListener, db5.t4 t4Var, int i17, int i18) {
        this.f478887x = t4Var;
        this.f478871f = view;
        if (!(view instanceof android.widget.TextView) && (i17 == 0 || i18 == 0)) {
            l();
        }
        this.f478889z.clear();
        onCreateContextMenuListener.onCreateContextMenu(this.f478889z, view, null);
        if (i17 == 0 && i18 == 0) {
            m();
        } else {
            n(i17, i18);
        }
    }

    public void i(android.view.View view, db5.n4 n4Var, db5.t4 t4Var) {
        this.f478871f = view;
        l();
        this.f478887x = t4Var;
        if (view instanceof android.widget.AbsListView) {
            com.p314xaae8f345.mm.ui.yk.e("MicroMsg.MMPopupMenu", "registerForPopupMenu AbsListView", new java.lang.Object[0]);
            ((android.widget.AbsListView) view).setOnItemLongClickListener(new rl5.g(this, n4Var));
        } else {
            com.p314xaae8f345.mm.ui.yk.e("MicroMsg.MMPopupMenu", "registerForPopupMenu normal view", new java.lang.Object[0]);
            view.setOnLongClickListener(new rl5.h(this, n4Var, view));
        }
    }

    public void j(android.view.View view, android.view.View.OnCreateContextMenuListener onCreateContextMenuListener, db5.t4 t4Var) {
        this.f478871f = view;
        l();
        this.f478887x = t4Var;
        if (view instanceof android.widget.AbsListView) {
            com.p314xaae8f345.mm.ui.yk.e("MicroMsg.MMPopupMenu", "registerForPopupMenu AbsListView", new java.lang.Object[0]);
            ((android.widget.AbsListView) view).setOnItemLongClickListener(new rl5.e(this, onCreateContextMenuListener));
        } else {
            com.p314xaae8f345.mm.ui.yk.e("MicroMsg.MMPopupMenu", "registerForPopupMenu normal view", new java.lang.Object[0]);
            view.setOnLongClickListener(new rl5.f(this, onCreateContextMenuListener));
        }
    }

    public void k(int i17) {
        db5.d5 d5Var;
        boolean z17 = this.W;
        android.content.Context context = this.f478869d;
        if (z17 && (d5Var = this.f478877o) != null) {
            d5Var.setBackgroundDrawable(context.getResources().getDrawable(i17));
            return;
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21505x98c24a7e c21505x98c24a7e = this.f478873h;
        if (c21505x98c24a7e != null) {
            c21505x98c24a7e.f279010g.setBackgroundDrawable(context.getResources().getDrawable(i17));
        }
    }

    public final void l() {
        this.f478871f.setOnTouchListener(new rl5.d(this));
    }

    public boolean m() {
        return n(0, 0);
    }

    public boolean n(int i17, int i18) {
        int i19;
        int i27;
        int width;
        int dimensionPixelSize;
        android.view.View view = this.f478871f;
        if (((view != null && !view.equals(this.A)) || !f478865l1) && (i17 != 0 || i18 != 0)) {
            f478866x0 = i17;
            f478867y0 = i18;
        }
        this.A = null;
        boolean z17 = false;
        if (this.S) {
            i19 = f478866x0;
            i27 = f478867y0;
        } else {
            i19 = 0;
            i27 = 0;
        }
        f478865l1 = false;
        android.util.DisplayMetrics displayMetrics = this.f478881r;
        android.content.Context context = this.f478869d;
        if (displayMetrics == null) {
            this.f478881r = context.getResources().getDisplayMetrics();
        }
        android.view.View view2 = this.f478871f;
        if (view2 != null) {
            int[] iArr = new int[2];
            view2.getLocationInWindow(iArr);
            if (i19 == 0 || i19 > this.f478881r.widthPixels || this.F) {
                i19 = iArr[0] + (this.f478871f.getWidth() / 2);
            }
            if (this.F && !this.W) {
                if (this.G) {
                    width = iArr[0];
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
                } else {
                    width = iArr[0] + this.f478871f.getWidth();
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
                }
                i19 = width - dimensionPixelSize;
            }
            int i28 = iArr[1];
            int height = this.f478871f.getHeight() + i28;
            if (i28 < 0) {
                i28 = 0;
            }
            int i29 = this.f478881r.heightPixels;
            if (height > i29) {
                height = i29;
            }
            if (i27 == 0 || this.F) {
                i27 = ((i28 + height) / 2) - (this.W ? this.f478871f.getHeight() / 2 : 0);
            }
        }
        com.p314xaae8f345.mm.ui.yk.c("MicroMsg.MMPopupMenu", "show popMenu , xDown:%s, yDown:%s, showPointX:%s, showPointY:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        if (e()) {
            db5.d5 d5Var = this.f478874i;
            if (d5Var != null && d5Var.isShowing()) {
                z17 = true;
            }
            if (z17 && d()) {
                return a() & p(i19, i27);
            }
        }
        return p(i19, i27);
    }

    public final void o(int i17, int i18) {
        android.content.Context context = this.f478869d;
        db5.d5 d5Var = new db5.d5(context);
        this.f478877o = d5Var;
        d5Var.setOnDismissListener(this);
        this.f478877o.setWidth(-2);
        this.f478877o.setHeight(-2);
        this.f478877o.setFocusable(true);
        this.f478877o.setOutsideTouchable(true);
        this.f478877o.setAnimationStyle(com.p314xaae8f345.mm.R.C30868x68b1db1.f575992nm);
        this.f478877o.setInputMethodMode(2);
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.dlz, null);
        inflate.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.f567433jh2);
        linearLayout.setVisibility(0);
        linearLayout.removeAllViews();
        int size = this.f478889z.size();
        for (int i19 = 0; i19 < size; i19++) {
            rl5.n nVar = this.Y;
            android.view.View a17 = nVar != null ? nVar.a(context, (android.view.MenuItem) ((java.util.ArrayList) this.f478889z.f309877d).get(i19)) : null;
            if (a17 == null) {
                android.view.MenuItem menuItem = (android.view.MenuItem) ((java.util.ArrayList) this.f478889z.f309877d).get(i19);
                android.view.View inflate2 = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.dly, null);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate2.findViewById(com.p314xaae8f345.mm.R.id.h5n);
                android.widget.TextView textView = (android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.obc);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate2.findViewById(com.p314xaae8f345.mm.R.id.qx_);
                c22699x3dcdb352.setImageDrawable(menuItem.getIcon());
                textView.setText(menuItem.getTitle());
                if (menuItem.getItemId() == this.f478878p) {
                    c22699x3dcdb3522.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f78821xb211a201, context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19)));
                    c22699x3dcdb3522.setVisibility(0);
                }
                if (i19 + 1 == size) {
                    ((android.widget.ImageView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.f565642d21)).setVisibility(8);
                }
                a17 = inflate2;
            }
            a17.setOnClickListener(new rl5.a(this, i19));
            if (linearLayout.getChildCount() < 5) {
                linearLayout.addView(a17);
            }
        }
        this.f478877o.setContentView(inflate);
        inflate.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = inflate.getMeasuredHeight();
        int measuredWidth = inflate.getMeasuredWidth();
        int a18 = com.p314xaae8f345.mm.ui.zk.a(context, 12);
        int i27 = i17 - ((int) (measuredWidth / 2.0f));
        int i28 = i27 + measuredWidth;
        int i29 = this.f478881r.widthPixels;
        if (i28 > i29 - a18) {
            a18 = (i29 - a18) - measuredWidth;
        } else if (i27 >= a18) {
            a18 = i27;
        }
        int a19 = a18 - com.p314xaae8f345.mm.ui.zk.a(context, 8);
        int e17 = (i18 - measuredHeight) - com.p314xaae8f345.mm.ui.zk.e(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        if (e17 < 0 || this.V) {
            e17 = i18 + this.f478871f.getHeight() + com.p314xaae8f345.mm.ui.zk.e(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
        }
        if (!(context instanceof android.app.Activity) || ((android.app.Activity) context).isFinishing()) {
            return;
        }
        com.p314xaae8f345.mm.ui.yk.c("MicroMsg.MMPopupMenu", "showTickStyleMenu, x:" + a19 + ", y:" + e17, new java.lang.Object[0]);
        this.f478877o.showAtLocation(this.f478871f, 0, a19, e17);
        this.X = java.lang.System.currentTimeMillis();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        if (!this.f478882s) {
            android.view.View view = this.f478883t;
            if (view != null) {
                view.setSelected(false);
            } else {
                this.f478871f.setSelected(false);
            }
        }
        android.widget.PopupWindow.OnDismissListener onDismissListener = this.L;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/menu/MMPopupMenu", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        yj0.a.h(this, "com/tencent/mm/ui/widget/menu/MMPopupMenu", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(android.view.View view, int i17, android.view.KeyEvent keyEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(keyEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/menu/MMPopupMenu", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
        yj0.a.i(false, this, "com/tencent/mm/ui/widget/menu/MMPopupMenu", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x095d  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x09e3  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0a2b  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0a6f  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0af4 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0a6b  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x09fa  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0960  */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v49 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p(int r29, int r30) {
        /*
            Method dump skipped, instructions count: 2808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rl5.r.p(int, int):boolean");
    }

    public r(android.content.Context context) {
        this.f478869d = null;
        this.f478871f = null;
        this.f478872g = null;
        this.f478882s = false;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = 0;
        this.I = false;
        this.K = false;
        this.N = false;
        this.P = false;
        this.Q = true;
        this.R = true;
        this.S = true;
        this.T = 0;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = 0L;
        this.Z = true;
        this.f478879p0 = false;
        this.f478869d = context;
        this.f478870e = (android.view.LayoutInflater) context.getSystemService("layout_inflater");
        c();
    }
}
