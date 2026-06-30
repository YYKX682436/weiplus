package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class v7 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 implements com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.i0 {
    public static final /* synthetic */ int P = 0;
    public android.widget.TextView A;
    public android.view.View B;
    public android.widget.TextView C;
    public android.widget.ImageView D;
    public int E;
    public boolean F;
    public int G;
    public int H;
    public android.view.animation.Animation I;

    /* renamed from: J, reason: collision with root package name */
    public long f262205J;
    public int K;
    public java.lang.String L;
    public int M;
    public boolean N;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f262206d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f262207e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f262208f;

    /* renamed from: g, reason: collision with root package name */
    public com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3 f262209g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f262210h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f262211i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f262212m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f262213n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19143xf87104fb f262214o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f262215p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14 f262216q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.u7 f262217r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f262218s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f262219t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f262220u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f262221v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.t7 f262222w;

    /* renamed from: x, reason: collision with root package name */
    public android.content.DialogInterface.OnClickListener f262223x;

    /* renamed from: y, reason: collision with root package name */
    public android.content.DialogInterface.OnCancelListener f262224y;

    /* renamed from: z, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.m f262225z;

    public v7(android.content.Context context, int i17) {
        super(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576328wh);
        this.f262225z = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.m();
        this.E = 0;
        this.F = false;
        this.G = 0;
        this.H = 0;
        this.I = null;
        this.f262205J = -1L;
        this.K = 0;
        this.L = "";
        this.M = 0;
        this.N = false;
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.d6q, null);
        this.f262206d = inflate;
        this.f262207e = (android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.f78304x89ab61fb);
        this.f262208f = (android.widget.ImageView) this.f262206d.findViewById(com.p314xaae8f345.mm.R.id.pem);
        this.f262209g = (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3) this.f262206d.findViewById(com.p314xaae8f345.mm.R.id.f78324xe9b380d4);
        this.f262210h = this.f262206d.findViewById(com.p314xaae8f345.mm.R.id.o1v);
        this.f262211i = (android.widget.TextView) this.f262206d.findViewById(com.p314xaae8f345.mm.R.id.cgi);
        this.f262212m = (android.widget.TextView) this.f262206d.findViewById(com.p314xaae8f345.mm.R.id.pet);
        this.f262213n = (android.widget.TextView) this.f262206d.findViewById(com.p314xaae8f345.mm.R.id.f565879dz0);
        ((android.widget.TextView) this.f262206d.findViewById(com.p314xaae8f345.mm.R.id.klu)).getPaint().setFlags(16);
        this.f262214o = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19143xf87104fb) this.f262206d.findViewById(com.p314xaae8f345.mm.R.id.f565872dy3);
        this.f262218s = this.f262206d.findViewById(com.p314xaae8f345.mm.R.id.dxq);
        this.f262215p = (android.widget.ImageView) this.f262206d.findViewById(com.p314xaae8f345.mm.R.id.bra);
        this.f262219t = this.f262206d.findViewById(com.p314xaae8f345.mm.R.id.aei);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.f262215p, com.p314xaae8f345.mm.p2802xd031a825.ui.r1.D(), null);
        this.f262216q = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14) this.f262206d.findViewById(com.p314xaae8f345.mm.R.id.hdh);
        this.A = (android.widget.TextView) this.f262206d.findViewById(com.p314xaae8f345.mm.R.id.peh);
        this.B = this.f262206d.findViewById(com.p314xaae8f345.mm.R.id.g5t);
        this.C = (android.widget.TextView) this.f262206d.findViewById(com.p314xaae8f345.mm.R.id.g5w);
        this.D = (android.widget.ImageView) this.f262206d.findViewById(com.p314xaae8f345.mm.R.id.g5s);
        this.f262220u = (android.widget.TextView) this.f262206d.findViewById(com.p314xaae8f345.mm.R.id.f565143bf1);
        this.f262221v = this.f262206d.findViewById(com.p314xaae8f345.mm.R.id.dxc);
        this.f262214o.setVisibility(8);
        setCanceledOnTouchOutside(true);
        getWindow().setSoftInputMode(2);
        if (com.p314xaae8f345.mm.p2802xd031a825.ui.r1.P()) {
            getWindow().addFlags(8192);
        }
        this.f262207e.setEnabled(false);
        this.f262207e.setTextColor(context.getResources().getColorStateList(com.p314xaae8f345.mm.R.C30859x5a72f63.a_o));
        qp5.p.b(this.f262216q);
        this.f262216q.m83166x1270e8e7(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.j7(this));
        this.f262216q.requestFocus();
        android.widget.TextView textView = (android.widget.TextView) this.f262206d.findViewById(com.p314xaae8f345.mm.R.id.pet);
        if (textView != null) {
            textView.setText(c01.z1.I() ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kww) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kwv));
        }
        android.widget.EditText editText = (android.widget.EditText) this.f262206d.findViewById(com.p314xaae8f345.mm.R.id.pbn);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.v0(editText);
        this.f262209g.m121469xce4186ff(editText);
        com.p314xaae8f345.mm.p2802xd031a825.e eVar = new com.p314xaae8f345.mm.p2802xd031a825.e(true);
        this.f262209g.m121472x2408cb55(eVar);
        editText.setAccessibilityDelegate(eVar);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.N(this.f262216q, this.f262209g);
        editText.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.k7(this));
        this.f262206d.findViewById(com.p314xaae8f345.mm.R.id.f78325xd41a9ed3).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.l7(this));
        o();
    }

    public static boolean f() {
        gm0.j1.i();
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINGER_PRINT_IS_FORCE_PWD_MODE_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
        if (m17 != null) {
            return ((java.lang.Boolean) m17).booleanValue();
        }
        return false;
    }

    public static void k(boolean z17) {
        gm0.j1.i();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINGER_PRINT_IS_FORCE_PWD_MODE_BOOLEAN_SYNC, java.lang.Boolean.valueOf(z17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.i0
    public void M0() {
        this.N = false;
        c01.z1.I();
    }

    public final void c() {
        this.A.setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.klv));
        this.E = 0;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f262205J = android.os.SystemClock.elapsedRealtime();
        android.view.View view = this.B;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "changeToPwd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "changeToPwd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f262216q.setVisibility(0);
        if (!this.f262210h.isShown()) {
            android.view.View view2 = this.f262210h;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "changeToPwd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "changeToPwd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f262212m.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kwv);
        k(true);
        this.K = 0;
        this.L = "";
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11977, 1, 0, 0, 0, 0, 1);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.q0(29, 1);
        h();
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        try {
            super.dismiss();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletPwdCustomDialog", "dismiss exception, e = " + e17.getMessage());
        }
        h();
        this.f262225z.a();
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.p0(this.f262216q, this.f262209g);
    }

    public void e() {
        k(false);
        android.content.DialogInterface.OnClickListener onClickListener = this.f262223x;
        if (onClickListener != null) {
            onClickListener.onClick(this, 0);
        }
        dismiss();
        if (this.f262217r != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPwdCustomDialog", "doOk use_touch: %s soterAuthReq: %s ", java.lang.Integer.valueOf(this.K), this.L);
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.u7 u7Var = this.f262217r;
            java.lang.String m83161xfb85ada3 = this.f262216q.m83161xfb85ada3();
            int i17 = this.K == 1 ? 1 : 0;
            java.lang.String str = this.L;
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.u uVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.u) u7Var;
            uVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19034xfdf1f8b4 activityC19034xfdf1f8b4 = uVar.f260343a;
            r45.an6 an6Var = activityC19034xfdf1f8b4.f260223d;
            activityC19034xfdf1f8b4.m83099x5406100e(new ss4.c0(m83161xfb85ada3, an6Var.f451692g, an6Var.f451689d, an6Var.f451690e, an6Var.f451691f, an6Var.f451693h, i17, str, ""), true);
        }
        if (this.f262205J < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletPwdCustomDialog", "hy: not set update mode time yet. abandon");
            return;
        }
        int i18 = this.E;
        if (i18 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.mo68477x336bdfd8(686L, 0L, 1L, false);
            long j17 = this.f262205J;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            g0Var.mo68477x336bdfd8(686L, 1L, android.os.SystemClock.elapsedRealtime() - j17, false);
            return;
        }
        if (i18 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var2.mo68477x336bdfd8(686L, 2L, 1L, false);
            long j18 = this.f262205J;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            g0Var2.mo68477x336bdfd8(686L, 3L, android.os.SystemClock.elapsedRealtime() - j18, false);
        }
    }

    public final void h() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPwdCustomDialog", "hy: send release FPManager");
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5900xd57eabf5().e();
    }

    public final void i() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPwdCustomDialog", "reqFingerPrintAuth %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
        re4.n.b();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5820xc13f26f8 c5820xc13f26f8 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5820xc13f26f8();
        am.on onVar = c5820xc13f26f8.f136128g;
        onVar.f89096a = null;
        onVar.f89097b = 1;
        onVar.f89098c = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.q7(this, c5820xc13f26f8);
        c5820xc13f26f8.b(android.os.Looper.getMainLooper());
    }

    public final void o() {
        boolean z17;
        boolean z18;
        this.G = 0;
        this.A.setVisibility(8);
        android.view.View view = this.B;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "updateFingerPrintMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "updateFingerPrintMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f262205J = android.os.SystemClock.elapsedRealtime();
        at4.x1 fj6 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj();
        pz2.a aVar = (pz2.a) gm0.j1.s(pz2.a.class);
        if (fj6 != null) {
            mz2.a aVar2 = (mz2.a) aVar;
            if (aVar2.a()) {
                z17 = aVar2.L2();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPwdCustomDialog", "hy: soter key status: %b", java.lang.Boolean.valueOf(z17));
                this.K = 0;
                this.L = "";
                boolean z27 = aVar == null && aVar.Ic() && !aVar.H4();
                z18 = aVar == null && ((mz2.a) aVar).a();
                if (!z18 && z27 && this.F && !f()) {
                    this.A.setVisibility(0);
                    this.A.setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.kwy));
                    this.E = 1;
                    android.view.View view2 = this.B;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "updateFingerPrintMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "updateFingerPrintMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.D.setVisibility(0);
                    this.f262216q.setVisibility(8);
                    android.view.View view3 = this.f262210h;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "updateFingerPrintMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "updateFingerPrintMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f262212m.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kwq);
                    this.K = 1;
                    i();
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11977, 1, 1, 0, 0, 0, 0);
                } else if (!z18 && z27 && this.F && f()) {
                    this.A.setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.klv));
                    this.A.setVisibility(0);
                    this.E = 0;
                    android.view.View view4 = this.B;
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(8);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "updateFingerPrintMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "updateFingerPrintMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f262216q.setVisibility(0);
                    if (!this.f262210h.isShown()) {
                        android.view.View view5 = this.f262210h;
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        arrayList5.add(0);
                        java.util.Collections.reverse(arrayList5);
                        yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "updateFingerPrintMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                        yj0.a.f(view5, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "updateFingerPrintMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    this.f262212m.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kwv);
                    this.K = 0;
                    this.L = "";
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11977, 1, 0, 0, 0, 0, 0);
                    com.p314xaae8f345.mm.p2802xd031a825.ui.r1.q0(8, 1);
                } else {
                    this.K = 0;
                    this.L = "";
                    this.A.setVisibility(8);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11977, 0, 0, 0, 0, 0, 0);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPwdCustomDialog", "isOpenTouch:" + z18 + ",  isDeviceSupport:" + z27 + ", use_pay_touch:" + this.F + ", isForcePwdMode:" + f());
                this.A.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.m7(this));
            }
        }
        z17 = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPwdCustomDialog", "hy: soter key status: %b", java.lang.Boolean.valueOf(z17));
        this.K = 0;
        this.L = "";
        if (aVar == null) {
        }
        if (aVar == null) {
        }
        if (!z18) {
        }
        if (!z18) {
        }
        this.K = 0;
        this.L = "";
        this.A.setVisibility(8);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11977, 0, 0, 0, 0, 0, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPwdCustomDialog", "isOpenTouch:" + z18 + ",  isDeviceSupport:" + z27 + ", use_pay_touch:" + this.F + ", isForcePwdMode:" + f());
        this.A.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.m7(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.i0
    /* renamed from: onActivityPause */
    public void mo73912xf470b888() {
        this.N = true;
        if (!c01.z1.I() && this.E == 1) {
            c();
        }
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f262206d);
        ju5.n.c().b();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4) {
            android.content.DialogInterface.OnCancelListener onCancelListener = this.f262224y;
            if (onCancelListener != null) {
                onCancelListener.onCancel(this);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.t7 t7Var = this.f262222w;
            if (t7Var != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.w) t7Var).f260347a.finish();
            }
        }
        return super.onKeyUp(i17, keyEvent);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z17) {
        super.setCancelable(z17);
        setCanceledOnTouchOutside(z17);
    }
}
