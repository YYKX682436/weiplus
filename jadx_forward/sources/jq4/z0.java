package jq4;

/* loaded from: classes5.dex */
public abstract class z0 {

    /* renamed from: a */
    public p3325xe03a0797.p3326xc267989b.r2 f382765a;

    /* renamed from: b */
    public boolean f382766b;

    /* renamed from: c */
    public volatile p3325xe03a0797.p3326xc267989b.y0 f382767c;

    /* renamed from: d */
    public android.view.ViewManager f382768d;

    /* renamed from: e */
    public android.view.View f382769e;

    /* renamed from: f */
    public android.content.Intent f382770f;

    /* renamed from: g */
    public long f382771g;

    /* renamed from: h */
    public int f382772h;

    /* renamed from: i */
    public jq4.c0 f382773i;

    /* renamed from: j */
    public android.animation.Animator f382774j;

    /* renamed from: l */
    public boolean f382776l;

    /* renamed from: m */
    public int f382777m;

    /* renamed from: n */
    public int f382778n;

    /* renamed from: o */
    public float f382779o;

    /* renamed from: q */
    public android.view.View f382781q;

    /* renamed from: r */
    public int f382782r;

    /* renamed from: s */
    public boolean f382783s;

    /* renamed from: u */
    public android.view.GestureDetector f382785u;

    /* renamed from: k */
    public java.lang.String f382775k = "";

    /* renamed from: p */
    public java.lang.String f382780p = "";

    /* renamed from: t */
    public final android.view.GestureDetector.SimpleOnGestureListener f382784t = new jq4.j0(this);

    /* renamed from: v */
    public final com.p314xaae8f345.mm.app.t2 f382786v = new jq4.f0(this);

    public static /* synthetic */ void c(jq4.z0 z0Var, boolean z17, boolean z18, boolean z19, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dismissCard");
        }
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        if ((i17 & 2) != 0) {
            z18 = true;
        }
        if ((i17 & 4) != 0) {
            z19 = true;
        }
        z0Var.b(z17, z18, z19);
    }

    public java.lang.String a() {
        com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17;
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        vg3.x3 x3Var = (vg3.x3) gm0.j1.s(vg3.x3.class);
        java.lang.String d17 = (x3Var == null || (Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) x3Var).Bi()) == null || (n17 = Bi.n(this.f382775k, true)) == null) ? null : n17.d1();
        ((sg3.a) v0Var).getClass();
        return c01.a2.e(d17) + this.f382780p + ',';
    }

    public void b(boolean z17, boolean z18, boolean z19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VoipBaseFloatCardManager", "dismissCard() called with: quickHide = " + z17 + ", releaseViewAndIntent = " + z18);
        com.p314xaae8f345.mm.app.w.INSTANCE.p(this.f382786v);
        rq4.s sVar = rq4.s.f480631a;
        rq4.r rVar = rq4.s.f480633c;
        if (rVar.f480629d == 1) {
            rVar.f480626a = 1;
            rVar.f480630e = java.lang.System.currentTimeMillis() - rq4.s.f480632b;
        }
        if (this.f382769e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VoipBaseFloatCardManager", "floatView is null: ".concat(getClass().getName()));
        }
        if (this.f382768d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VoipBaseFloatCardManager", "windowManager is null: ".concat(getClass().getName()));
        }
        android.view.View view = this.f382769e;
        if (view != null) {
            if (z17) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/voip/floatcard/VoipBaseFloatCardManager", "dismissCard", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/voip/floatcard/VoipBaseFloatCardManager", "dismissCard", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.ViewManager viewManager = this.f382768d;
                if (viewManager != null) {
                    viewManager.removeView(view);
                }
                rq4.r rVar2 = rq4.s.f480633c;
                if (rVar2.f480629d == 1) {
                    rVar2.f480627b = 1;
                }
                this.f382768d = null;
                if (z18) {
                    u(view);
                }
                this.f382766b = false;
            } else {
                if (this.f382783s) {
                    return;
                }
                android.animation.Animator animator = this.f382774j;
                if (animator != null) {
                    animator.cancel();
                }
                android.animation.Animator n17 = n();
                n17.addListener(new jq4.g0(view, this, z18));
                n17.setDuration(200L);
                n17.start();
                this.f382783s = true;
                this.f382774j = n17;
            }
        }
        this.f382776l = false;
        jq4.c0 c0Var = this.f382773i;
        if (c0Var != null) {
            c0Var.b();
        }
        this.f382773i = null;
        this.f382767c = null;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f382765a;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f382765a = null;
        this.f382775k = "";
    }

    public abstract int d();

    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bap;
    }

    public abstract int f();

    public final int g(float f17) {
        return this.f382778n + ((int) (f17 - this.f382779o));
    }

    public void h() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VoipBaseFloatCardManager", "hideCard() called");
        c(this, true, false, false, 2, null);
    }

    public void i(android.content.Intent intent, java.lang.String toUser) {
        android.widget.TextView textView;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VoipBaseFloatCardManager", "initView: ");
        android.view.View view = this.f382769e;
        if (view != null) {
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(toUser, true);
            java.lang.String d17 = n17 != null ? n17.d1() : null;
            ((sg3.a) v0Var).getClass();
            java.lang.String e17 = c01.a2.e(d17);
            this.f382775k = toUser;
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(toUser, true);
            this.f382781q = view.findViewById(com.p314xaae8f345.mm.R.id.f566553g91);
            android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.kg8);
            if (textView2 != null) {
                textView2.setText(e17);
            }
            java.lang.String a17 = t41.g.a(n18);
            if (!android.text.TextUtils.isEmpty(a17) && (textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.kg8)) != null) {
                android.text.SpannableString spannableString = new android.text.SpannableString(e17 + ' ' + a17);
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(view.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0j)), e17.length() + 1, spannableString.length(), 33);
                textView.setText(spannableString);
            }
            android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.kfq);
            if (imageView == null) {
                return;
            }
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, toUser, null);
            android.widget.TextView textView3 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.kg6);
            if (textView3 != null) {
                int f17 = f();
                textView3.setText(f17);
                this.f382780p = textView3.getText().toString();
                if (this.f382773i == null) {
                    this.f382773i = new jq4.c0();
                }
                jq4.c0 c0Var = this.f382773i;
                if (c0Var != null) {
                    c0Var.b();
                }
                jq4.c0 c0Var2 = this.f382773i;
                if (c0Var2 != null) {
                    java.lang.String string = view.getResources().getString(f17);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                    c0Var2.a(textView3, string, 500);
                }
            }
            android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.f567705kg4);
            if (findViewById != null) {
                findViewById.setOnClickListener(new jq4.k0(this));
            }
            android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.kfp);
            if (findViewById2 != null) {
                findViewById2.setBackground(findViewById2.getResources().getDrawable(d()));
                findViewById2.setOnClickListener(new jq4.l0(this, intent));
            }
            android.widget.ImageView imageView2 = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.kfz);
            if (imageView2 == null) {
                return;
            }
            imageView2.post(new jq4.o0(this, imageView2, view));
            w();
            view.setOnTouchListener(new jq4.p0(this, view));
        }
    }

    public abstract boolean j();

    public abstract void k(android.content.Intent intent);

    public void l() {
    }

    public boolean m() {
        return false;
    }

    public android.animation.Animator n() {
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(0, -this.f382777m);
        ofInt.addUpdateListener(new jq4.q0(this));
        return ofInt;
    }

    public abstract void o();

    public abstract void p(android.content.Intent intent);

    public abstract void q();

    public abstract void r();

    public void s() {
        c(this, false, false, false, 3, null);
        r();
    }

    public boolean t() {
        return false;
    }

    public final void u(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VoipBaseFloatCardManager", "releaseViewAndIntent: view: " + view + " floatView: " + this.f382769e);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f382769e, view)) {
            this.f382770f = null;
            this.f382769e = null;
            this.f382781q = null;
        }
    }

    public final void v(android.content.Context context, android.content.Intent intent, long j17, int i17, java.lang.String toUser, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VoipBaseFloatCardManager", "showCard() called with: context = " + context + ", intent = " + intent + ", roomKey = " + j17 + ", toUser = " + toUser + ", quickShow = " + z17 + " and roomId=" + i17);
        this.f382766b = true;
        this.f382771g = j17;
        this.f382772h = i17;
        com.p314xaae8f345.mm.app.w.INSTANCE.a(this.f382786v);
        if (this.f382765a == null) {
            p3325xe03a0797.p3326xc267989b.c0 a17 = p3325xe03a0797.p3326xc267989b.v2.a(null, 1, null);
            this.f382767c = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c.mo7096x348d9a(a17));
            this.f382765a = a17;
        }
        if (this.f382768d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VoipBaseFloatCardManager", "Load windowManager:".concat(getClass().getName()));
            java.lang.Object systemService = context.getSystemService("window");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            this.f382768d = new jq4.d0((android.view.WindowManager) systemService);
        }
        if (this.f382769e == null) {
            this.f382785u = new android.view.GestureDetector(context, this.f382784t);
            this.f382769e = android.view.LayoutInflater.from(context).inflate(e(), (android.view.ViewGroup) null, false);
        }
        this.f382770f = intent;
        i(intent, toUser);
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        layoutParams.type = fp.h.c(26) ? 2038 : 2002;
        layoutParams.flags = 2621992;
        layoutParams.format = -3;
        layoutParams.packageName = context.getPackageName();
        layoutParams.gravity = 49;
        layoutParams.width = -1;
        layoutParams.height = -2;
        android.view.View view = this.f382769e;
        if (view != null) {
            if (z17) {
                android.view.ViewManager viewManager = this.f382768d;
                if (viewManager != null) {
                    viewManager.addView(view, layoutParams);
                    return;
                }
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/voip/floatcard/VoipBaseFloatCardManager", "showCard", "(Landroid/content/Context;Landroid/content/Intent;JILjava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/voip/floatcard/VoipBaseFloatCardManager", "showCard", "(Landroid/content/Context;Landroid/content/Intent;JILjava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.ViewManager viewManager2 = this.f382768d;
            if (viewManager2 != null) {
                viewManager2.addView(view, layoutParams);
            }
            view.post(new jq4.v0(this, view));
        }
    }

    public final void w() {
        android.view.View view;
        if ((this.f382775k.length() == 0) || (view = this.f382769e) == null) {
            return;
        }
        kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
        java.lang.String str = this.f382775k;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) c0Var).getClass();
        view.post(new jq4.y0(this, com.p314xaae8f345.mm.p943x351df9c2.g.b(str, false, 0, null), view, (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.kfz), view.findViewById(com.p314xaae8f345.mm.R.id.kfs)));
    }
}
