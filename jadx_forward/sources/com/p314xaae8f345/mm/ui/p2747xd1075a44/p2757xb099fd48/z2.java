package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48;

/* loaded from: classes14.dex */
public class z2 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {
    public android.widget.LinearLayout A;
    public android.widget.LinearLayout B;
    public android.widget.TextView C;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 D;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 E;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 F;
    public android.view.View G;
    public final boolean H;
    public final boolean I;

    /* renamed from: J, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.q3 f293587J;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.r3 K;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a4 f293588d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.o3 f293589e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f293590f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f293591g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f293592h;

    /* renamed from: i, reason: collision with root package name */
    public int f293593i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f293594m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.ViewTreeObserver f293595n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f293596o;

    /* renamed from: p, reason: collision with root package name */
    public int f293597p;

    /* renamed from: q, reason: collision with root package name */
    public int f293598q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.LinearLayout f293599r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.LinearLayout f293600s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.Button f293601t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.Button f293602u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 f293603v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 f293604w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.Button f293605x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.LinearLayout f293606y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.LinearLayout f293607z;

    public z2(android.content.Context context) {
        this.f293592h = false;
        this.f293596o = false;
        this.H = true;
        this.I = false;
        this.f293590f = context;
        this.f293597p = 0;
        this.f293598q = 0;
        f(context);
    }

    public static void a(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        z2Var.f293600s.setVisibility(0);
        z2Var.f293599r.setVisibility(8);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0 = z2Var.f293604w;
        if (c22661xa3a2b3c0 == null || z2Var.f293603v == null) {
            return;
        }
        c22661xa3a2b3c0.setText(charSequence);
        z2Var.f293603v.setText(charSequence2);
        z2Var.f293604w.setOnClickListener(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i3(z2Var));
        z2Var.f293603v.setOnClickListener(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j3(z2Var));
    }

    public void A(int i17) {
        this.f293588d.getWindow().getAttributes().softInputMode = i17;
    }

    public void B() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a4 a4Var = this.f293588d;
        if (a4Var == null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.q3 q3Var = this.f293587J;
            if (q3Var != null) {
                q3Var.mo2069x63a3b28a();
                return;
            }
            return;
        }
        android.content.Context context = this.f293590f;
        if (!(context instanceof android.app.Activity)) {
            a4Var.dismiss();
        } else {
            if (context == null || ((android.app.Activity) context).isFinishing() || ((android.app.Activity) context).isDestroyed()) {
                return;
            }
            this.f293588d.dismiss();
        }
    }

    public void C() {
        this.f293592h = g();
        android.content.Context context = this.f293590f;
        this.f293593i = context instanceof android.app.Activity ? ((android.app.Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation() : 0;
        boolean z17 = context instanceof android.app.Activity;
        if (!z17) {
            com.p314xaae8f345.mm.ui.ActivityC21340x254df46b.f278091o = this.f293589e;
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.ActivityC21340x254df46b.class);
            intent.setFlags(335544320);
            intent.putExtra("dialog_scene", 3);
            android.content.Context context2 = this.f293590f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog", "tryShow", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context2, "com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog", "tryShow", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        if (this.f293588d != null) {
            ((android.view.ViewGroup) this.f293591g.getParent()).setVisibility(0);
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.f293591g.getLayoutParams();
            if (this.f293592h && this.f293594m != null) {
                android.graphics.Rect rect = new android.graphics.Rect();
                this.f293594m.getWindowVisibleDisplayFrame(rect);
                layoutParams.width = java.lang.Math.min(rect.right, rect.bottom);
            }
            this.f293591g.setLayoutParams(layoutParams);
            this.f293588d.getWindow().addFlags(Integer.MIN_VALUE);
            this.f293588d.getWindow().clearFlags(8);
            this.f293588d.getWindow().clearFlags(131072);
            this.f293588d.getWindow().clearFlags(128);
            this.f293588d.getWindow().getDecorView().setSystemUiVisibility(0);
            android.view.View view = this.f293594m;
            if (view != null) {
                boolean z18 = this.f293595n == null;
                android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f293595n = viewTreeObserver;
                if (z18) {
                    viewTreeObserver.addOnGlobalLayoutListener(this);
                }
            }
            if (z17) {
                if (((android.app.Activity) context).isFinishing()) {
                    return;
                }
                this.f293588d.show();
                return;
            }
            com.p314xaae8f345.mm.ui.ActivityC21340x254df46b.f278091o = this.f293589e;
            android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.ActivityC21340x254df46b.class);
            intent2.setFlags(335544320);
            intent2.putExtra("dialog_scene", 3);
            android.content.Context context3 = this.f293590f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent2);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context3, arrayList2.toArray(), "com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog", "tryShow", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context3.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context3, "com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog", "tryShow", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    public void b(boolean z17) {
        android.widget.Button button = this.f293602u;
        if (button != null) {
            button.setEnabled(z17);
        }
    }

    public int c() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.byo;
    }

    public final void d() {
        this.f293599r = (android.widget.LinearLayout) this.f293591g.findViewById(com.p314xaae8f345.mm.R.id.b0u);
        this.f293601t = (android.widget.Button) this.f293591g.findViewById(com.p314xaae8f345.mm.R.id.b0e);
        this.f293602u = (android.widget.Button) this.f293591g.findViewById(com.p314xaae8f345.mm.R.id.b0f);
        this.f293605x = (android.widget.Button) this.f293591g.findViewById(com.p314xaae8f345.mm.R.id.b1e);
        this.f293600s = (android.widget.LinearLayout) this.f293591g.findViewById(com.p314xaae8f345.mm.R.id.b0v);
        this.f293603v = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0) this.f293591g.findViewById(com.p314xaae8f345.mm.R.id.b0g);
        this.f293604w = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0) this.f293591g.findViewById(com.p314xaae8f345.mm.R.id.b0d);
        int i17 = this.f293597p;
        if (i17 == 0) {
            this.f293599r.setVisibility(8);
            this.f293600s.setVisibility(8);
            return;
        }
        if (i17 == 1) {
            this.f293600s.setVisibility(8);
            this.f293599r.setVisibility(0);
            this.f293605x.setVisibility(8);
            this.f293601t.setOnClickListener(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k3(this));
            this.f293602u.setOnClickListener(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.l3(this));
            return;
        }
        if (i17 == 2) {
            this.f293600s.setVisibility(8);
            this.f293599r.setVisibility(0);
            this.f293601t.setVisibility(8);
            this.f293602u.setVisibility(8);
            this.f293605x.setOnClickListener(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.m3(this));
            return;
        }
        if (i17 != 3) {
            return;
        }
        this.f293600s.setVisibility(0);
        this.f293599r.setVisibility(8);
        this.f293604w.setOnClickListener(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.n3(this));
        this.f293603v.setOnClickListener(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a3(this));
    }

    public final void e() {
        android.widget.LinearLayout linearLayout = this.f293606y;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
            int i17 = this.f293598q;
            if (i17 == 0) {
                this.f293606y.setVisibility(8);
                return;
            }
            android.content.Context context = this.f293590f;
            if (i17 != 1) {
                if (i17 == 2) {
                    android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570698bj2, (android.view.ViewGroup) null);
                    this.C = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odb);
                    this.f293606y.removeAllViews();
                    this.f293606y.setGravity(17);
                    this.f293606y.addView(inflate, -1, -2);
                    return;
                }
                if (i17 != 4) {
                    return;
                }
            }
            android.view.View inflate2 = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570697bj1, (android.view.ViewGroup) null);
            android.view.View findViewById = inflate2.findViewById(com.p314xaae8f345.mm.R.id.bzg);
            android.view.View findViewById2 = inflate2.findViewById(com.p314xaae8f345.mm.R.id.u9x);
            android.view.View findViewById3 = inflate2.findViewById(com.p314xaae8f345.mm.R.id.qlj);
            android.widget.TextView textView = (android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.u_0);
            int i18 = this.f293598q;
            if (i18 == 1) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog", "initHeaderView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog", "initHeaderView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog", "initHeaderView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog", "initHeaderView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate2.findViewById(com.p314xaae8f345.mm.R.id.f78246x851a1260);
                if (this.I) {
                    findViewById.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563406ag5);
                    c22699x3dcdb352.m82040x7541828(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
                }
                findViewById.setOnClickListener(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.b3(this));
            } else if (i18 == 4) {
                this.C = textView;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog", "initHeaderView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog", "initHeaderView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(findViewById, arrayList4.toArray(), "com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog", "initHeaderView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog", "initHeaderView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setOnClickListener(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c3(this));
            }
            this.f293606y.removeAllViews();
            this.f293606y.setGravity(17);
            this.f293606y.addView(inflate2, -1, -2);
        }
    }

    public final void f(android.content.Context context) {
        android.content.Context context2 = this.f293590f;
        boolean z17 = context2 instanceof android.app.Activity;
        boolean z18 = this.H;
        if (!z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.o3 o3Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.o3(context2);
            this.f293589e = o3Var;
            int i17 = this.f293597p;
            int i18 = this.f293598q;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.h hVar = o3Var.f293472b;
            hVar.f293337a = i17;
            hVar.f293338b = i18;
            hVar.f293339c = z18;
            return;
        }
        this.f293594m = ((android.view.ViewGroup) ((android.app.Activity) context2).getWindow().getDecorView()).findViewById(android.R.id.content);
        this.f293588d = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a4(context);
        android.view.View inflate = android.view.View.inflate(context, c(), null);
        this.f293591g = inflate;
        if (inflate != null && this.I) {
            inflate.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b8l);
        }
        this.f293606y = (android.widget.LinearLayout) this.f293591g.findViewById(com.p314xaae8f345.mm.R.id.avh);
        this.f293607z = (android.widget.LinearLayout) this.f293591g.findViewById(com.p314xaae8f345.mm.R.id.av7);
        this.A = (android.widget.LinearLayout) this.f293591g.findViewById(com.p314xaae8f345.mm.R.id.av9);
        this.B = (android.widget.LinearLayout) this.f293591g.findViewById(com.p314xaae8f345.mm.R.id.av6);
        this.G = this.f293591g.findViewById(com.p314xaae8f345.mm.R.id.ohw);
        d();
        e();
        this.f293592h = g();
        this.f293588d.setContentView(this.f293591g);
        this.f293588d.setCancelable(z18);
        this.f293588d.f293278h = z18;
        if (com.p314xaae8f345.mm.ui.b4.c(context)) {
            android.view.View view = this.f293591g;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.C22694x6ce79e9 c22694x6ce79e9 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.C22694x6ce79e9();
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.a1.u(view, c22694x6ce79e9);
        }
        this.f293588d.setOnDismissListener(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f3(this));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.o3 o3Var2 = this.f293589e;
        if (o3Var2 != null) {
            o3Var2.f293472b.f293347k = this.f293587J;
        }
    }

    public final boolean g() {
        return this.f293590f.getResources().getConfiguration().orientation == 2;
    }

    public boolean h() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a4 a4Var = this.f293588d;
        return a4Var != null && a4Var.isShowing();
    }

    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 i(int i17) {
        android.widget.LinearLayout linearLayout = this.B;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
            android.view.LayoutInflater.from(this.f293591g.getContext()).inflate(i17, (android.view.ViewGroup) this.B, true);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.o3 o3Var = this.f293589e;
        if (o3Var != null) {
            o3Var.f293472b.f293345i = i17;
        }
        return this;
    }

    public void j(android.view.View view) {
        android.widget.LinearLayout linearLayout = this.B;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
            this.B.removeAllViews();
            this.B.setGravity(17);
            this.B.addView(view, -1, -2);
            android.widget.Button button = (android.widget.Button) this.B.findViewById(com.p314xaae8f345.mm.R.id.kao);
            android.widget.Button button2 = (android.widget.Button) this.B.findViewById(com.p314xaae8f345.mm.R.id.b5i);
            if (button != null) {
                button.setOnClickListener(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d3(this));
            }
            if (button2 != null) {
                button2.setOnClickListener(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e3(this));
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.o3 o3Var = this.f293589e;
        if (o3Var != null) {
            o3Var.f293472b.f293340d = view;
        }
    }

    public void k(android.view.View view, int i17, int i18) {
        android.widget.LinearLayout linearLayout = this.B;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
            this.B.removeAllViews();
            this.B.setGravity(17);
            this.B.addView(view, -1, -2);
            this.B.setPadding(i17, 0, i18, 0);
        }
    }

    public void l(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.q3 q3Var) {
        this.f293587J = q3Var;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.o3 o3Var = this.f293589e;
        if (o3Var != null) {
            o3Var.f293472b.f293347k = q3Var;
        }
    }

    public void m(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        android.widget.Button button = this.f293601t;
        if (button != null && this.f293602u != null) {
            button.setText(charSequence);
            this.f293602u.setText(charSequence2);
            this.f293601t.post(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g3(this, charSequence, charSequence2));
            this.f293602u.post(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.h3(this, charSequence, charSequence2));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0 = this.f293604w;
        if (c22661xa3a2b3c0 == null || this.f293603v == null) {
            return;
        }
        c22661xa3a2b3c0.setText(charSequence);
        this.f293603v.setText(charSequence2);
    }

    public void n(int i17) {
        android.widget.Button button = this.f293601t;
        if (button != null) {
            android.content.Context context = this.f293590f;
            if (i17 == 0) {
                button.setBackgroundColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.abr));
                return;
            }
            if (i17 == 2) {
                button.setBackgroundColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.abq));
                return;
            }
            if (i17 == 3) {
                button.setBackgroundColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77922x54cad3c6));
                return;
            }
            if (i17 == 4) {
                button.setBackgroundColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77716xe690c4ac));
            } else if (i17 == 5) {
                button.setBackgroundColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560059a7));
            } else {
                if (i17 != 6) {
                    return;
                }
                button.setBackgroundColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.abt));
            }
        }
    }

    public void o(int i17) {
        android.widget.Button button = this.f293602u;
        if (button != null) {
            android.content.Context context = this.f293590f;
            if (i17 == 0) {
                button.setBackgroundColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.abr));
                return;
            }
            if (i17 == 2) {
                button.setBackgroundColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.abq));
                return;
            }
            if (i17 == 3) {
                button.setBackgroundColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77922x54cad3c6));
                return;
            }
            if (i17 == 4) {
                button.setBackgroundColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77716xe690c4ac));
            } else if (i17 == 5) {
                button.setBackgroundColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560059a7));
            } else {
                if (i17 != 6) {
                    return;
                }
                button.setBackgroundColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.abt));
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (h()) {
            android.view.View view = this.f293594m;
            if (view == null || !(view.isShown() || view.getVisibility() == 0)) {
                B();
                return;
            }
            if (h()) {
                if (this.f293592h == g()) {
                    int i17 = this.f293593i;
                    android.content.Context context = this.f293590f;
                    if (i17 == (context instanceof android.app.Activity ? ((android.app.Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation() : 0)) {
                        return;
                    }
                }
                B();
            }
        }
    }

    public void p(android.view.View view) {
        android.widget.LinearLayout linearLayout = this.f293607z;
        if (linearLayout != null) {
            if (view == null) {
                linearLayout.setVisibility(8);
                this.A.setVisibility(8);
                return;
            }
            if (this.f293597p == 3) {
                linearLayout.setVisibility(8);
                this.A.setVisibility(0);
                this.A.removeAllViews();
                this.A.setGravity(17);
                this.A.addView(view, -1, -2);
                return;
            }
            this.A.setVisibility(8);
            this.f293607z.setVisibility(0);
            this.f293607z.removeAllViews();
            this.f293607z.setGravity(17);
            this.f293607z.addView(view, -1, -2);
        }
    }

    public void q(java.lang.CharSequence charSequence) {
        android.widget.TextView textView = this.C;
        if (textView != null) {
            textView.setText(charSequence);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.o3 o3Var = this.f293589e;
        if (o3Var != null) {
            o3Var.f293472b.f293343g = charSequence;
        }
    }

    public void r(android.content.Context context, int i17) {
        android.widget.TextView textView = this.C;
        if (textView != null) {
            textView.setTextColor(context.getResources().getColor(i17));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.o3 o3Var = this.f293589e;
        if (o3Var != null) {
            o3Var.f293472b.f293344h = context.getResources().getColor(i17);
        }
    }

    public void s(android.view.View view) {
        android.widget.LinearLayout linearLayout = this.f293606y;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
            this.f293606y.removeAllViews();
            this.f293606y.setGravity(17);
            this.f293606y.addView(view, -1, -2);
        }
    }

    public void t(android.view.View view) {
        android.widget.LinearLayout linearLayout = this.f293606y;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f293606y.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            this.f293606y.setLayoutParams(layoutParams);
            this.f293606y.removeAllViews();
            this.f293606y.setGravity(17);
            this.f293606y.addView(view, -1, -2);
        }
    }

    public void u(int i17) {
        if (i17 != 0) {
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.f293591g.getLayoutParams();
            layoutParams.height = i17;
            this.f293591g.setLayoutParams(layoutParams);
            this.f293591g.invalidate();
        }
    }

    public void v(int i17) {
        android.widget.Button button = this.f293601t;
        if (button != null) {
            button.setTextColor(i17);
        }
    }

    public void w(android.content.DialogInterface.OnShowListener onShowListener) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a4 a4Var = this.f293588d;
        if (a4Var != null) {
            a4Var.setOnShowListener(onShowListener);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.o3 o3Var = this.f293589e;
        if (o3Var != null) {
            o3Var.f293472b.f293348l = onShowListener;
        }
    }

    public void x(int i17) {
        android.widget.Button button = this.f293605x;
        if (button != null) {
            boolean z17 = this.I;
            android.content.Context context = this.f293590f;
            android.content.res.Resources resources = context.getResources();
            button.setTextColor(z17 ? resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560370in) : resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560371io));
            switch (i17) {
                case 0:
                    this.f293605x.setBackgroundColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.abr));
                    break;
                case 1:
                    this.f293605x.setBackgroundColor(context.getResources().getColor(z17 ? com.p314xaae8f345.mm.R.C30859x5a72f63.f77666x8b2be3e1 : com.p314xaae8f345.mm.R.C30859x5a72f63.f560747t2));
                    this.f293605x.setTextColor(z17 ? context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560371io) : context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aax));
                    break;
                case 2:
                    this.f293605x.setBackgroundColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.abq));
                    break;
                case 3:
                    this.f293605x.setBackgroundColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77922x54cad3c6));
                    break;
                case 4:
                    this.f293605x.setBackgroundColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77716xe690c4ac));
                    break;
                case 5:
                    this.f293605x.setBackgroundColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.abr));
                case 6:
                    this.f293605x.setBackgroundColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
                    this.f293605x.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560277fz));
                    break;
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.o3 o3Var = this.f293589e;
        if (o3Var != null) {
            o3Var.f293472b.f293342f = i17;
        }
    }

    public void y(java.lang.CharSequence charSequence) {
        android.widget.Button button = this.f293605x;
        if (button != null) {
            button.setText(charSequence);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.o3 o3Var = this.f293589e;
        if (o3Var != null) {
            o3Var.f293472b.f293341e = charSequence;
        }
    }

    public void z(int i17) {
        android.widget.Button button = this.f293605x;
        if (button != null) {
            button.setTextColor(i17);
        }
    }

    public z2(android.content.Context context, int i17, int i18) {
        this.f293592h = false;
        this.f293596o = false;
        this.H = true;
        this.I = false;
        this.f293590f = context;
        this.f293597p = i17;
        this.f293598q = i18;
        f(context);
    }

    public z2(android.content.Context context, int i17, int i18, boolean z17) {
        this.f293592h = false;
        this.f293596o = false;
        this.H = true;
        this.I = false;
        this.f293590f = context;
        this.f293597p = i17;
        this.f293598q = i18;
        this.H = z17;
        f(context);
    }

    public z2(android.content.Context context, int i17, int i18, boolean z17, boolean z18) {
        this.f293592h = false;
        this.f293596o = false;
        this.H = true;
        this.I = false;
        this.f293590f = context;
        this.f293597p = i17;
        this.f293598q = i18;
        this.H = z17;
        this.I = z18;
        f(context);
    }
}
