package on2;

/* loaded from: classes3.dex */
public final class a2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.n8 implements android.view.View.OnClickListener {

    /* renamed from: h, reason: collision with root package name */
    public final gk2.e f428361h;

    /* renamed from: i, reason: collision with root package name */
    public final int f428362i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f428363m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f428364n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f428365o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f428366p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c f428367q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View f428368r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View f428369s;

    /* renamed from: t, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f428370t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f428371u;

    /* renamed from: v, reason: collision with root package name */
    public final int[] f428372v;

    /* renamed from: w, reason: collision with root package name */
    public final on2.j1 f428373w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(android.content.Context context, gk2.e eVar, int i17) {
        super(context);
        p012xc85e97e9.p093xedfae76a.j0 j0Var;
        p012xc85e97e9.p093xedfae76a.g0 g0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f428361h = eVar;
        this.f428362i = i17;
        boolean z17 = context.getResources().getConfiguration().orientation == 2;
        this.f428363m = z17;
        this.f428364n = jz5.h.b(new on2.m1(this));
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.atv, (android.view.ViewGroup) this, true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f428365o = inflate;
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.irs);
        this.f428366p = findViewById;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c) inflate.findViewById(com.p314xaae8f345.mm.R.id.irt);
        this.f428367q = c22613xe7040d9c;
        android.view.View findViewById2 = c22613xe7040d9c.findViewById(com.p314xaae8f345.mm.R.id.irr);
        this.f428368r = findViewById2;
        android.view.View findViewById3 = c22613xe7040d9c.findViewById(com.p314xaae8f345.mm.R.id.irv);
        this.f428369s = findViewById3;
        android.widget.TextView textView = (android.widget.TextView) c22613xe7040d9c.findViewById(com.p314xaae8f345.mm.R.id.irx);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) c22613xe7040d9c.findViewById(com.p314xaae8f345.mm.R.id.iru);
        this.f428370t = c1163xf1deaba4;
        this.f428371u = jz5.h.b(new on2.z1(context));
        this.f428372v = new int[2];
        on2.j1 j1Var = new on2.j1();
        j1Var.f428480f = new on2.u1(this, context, j1Var);
        j1Var.f428481g = new on2.y1(j1Var, this, context);
        this.f428373w = j1Var;
        c22613xe7040d9c.getLayoutParams().height = m152020x96691596();
        c22613xe7040d9c.m81307xf9cef5a7(new on2.n1(this));
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(inflate.getContext()));
        c1163xf1deaba4.mo7960x6cab2c8d(j1Var);
        c1163xf1deaba4.N(new on2.o1(this));
        c1163xf1deaba4.P(new on2.p1(this));
        findViewById.setOnClickListener(this);
        c22613xe7040d9c.setOnClickListener(this);
        findViewById3.setOnClickListener(this);
        textView.setOnClickListener(this);
        findViewById2.setOnClickListener(this);
        on2.z2 z2Var = (on2.z2) c(on2.z2.class);
        if (z2Var != null && (g0Var = z2Var.f428623h) != null) {
            g0Var.mo7806x9d92d11c((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context, new on2.k1(this));
        }
        on2.z2 z2Var2 = (on2.z2) c(on2.z2.class);
        if (z2Var2 != null && (j0Var = z2Var2.f428628p) != null) {
            j0Var.mo7806x9d92d11c((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context, new on2.l1(this));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLotteryPanelWidget", "init sourceScene:" + i17 + " isLand:" + z17 + ", DEFAULT_PANEL_HEIGHT:" + m152020x96691596());
    }

    /* renamed from: getDEFAULT_PANEL_HEIGHT */
    private final int m152020x96691596() {
        return ((java.lang.Number) ((jz5.n) this.f428364n).mo141623x754a37bb()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getPopupMenu */
    public final rl5.r m152021xdab03575() {
        return (rl5.r) ((jz5.n) this.f428371u).mo141623x754a37bb();
    }

    public final p012xc85e97e9.p093xedfae76a.c1 c(java.lang.Class bu6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bu6, "bu");
        gk2.e eVar = this.f428361h;
        if (eVar != null) {
            return eVar.a(bu6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l m58104xb7f4f95a = m58104xb7f4f95a();
        if (m58104xb7f4f95a != null) {
            return m58104xb7f4f95a.P0(bu6);
        }
        return null;
    }

    public final void d() {
        this.f428367q.setTranslationY(0.0f);
    }

    /* renamed from: getLiveData */
    public final gk2.e m152022xd052fc2c() {
        return this.f428361h;
    }

    /* renamed from: getSourceScene */
    public final int m152023xd419dffb() {
        return this.f428362i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        r45.nw1 nw1Var;
        boolean z17;
        int i17;
        java.lang.String str2;
        java.lang.String str3;
        r45.nw1 nw1Var2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/FinderLiveLotteryPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if ((valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.irs) || (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.irv)) {
            d();
        } else {
            str = "";
            if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.irx) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                if (currentTimeMillis - qd2.h.f443300a >= 500) {
                    z17 = false;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f443300a);
                    z17 = true;
                }
                qd2.h.f443300a = currentTimeMillis;
                if (z17) {
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/FinderLiveLotteryPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                ((ml2.j0) i95.n0.c(ml2.j0.class)).Fj(ml2.j1.f409138u, "");
                android.content.Intent intent = new android.content.Intent();
                mm2.c1 c1Var = (mm2.c1) c(mm2.c1.class);
                if (c1Var != null && c1Var.T) {
                    i17 = 3;
                } else {
                    mm2.n0 n0Var = (mm2.n0) c(mm2.n0.class);
                    i17 = n0Var != null && n0Var.f410806r ? 16 : 1;
                }
                intent.putExtra("KEY_LOTTERY_HISTORY_SCENE", i17);
                mm2.e1 e1Var = (mm2.e1) c(mm2.e1.class);
                intent.putExtra("KEY_LOTTERY_HISTORY_LIVE_ID", (e1Var == null || (nw1Var2 = e1Var.f410521r) == null) ? 0L : nw1Var2.m75942xfb822ef2(0));
                mm2.e1 e1Var2 = (mm2.e1) c(mm2.e1.class);
                intent.putExtra("KEY_LOTTERY_HISTORY_OBJECT_ID", e1Var2 != null ? e1Var2.f410516m : 0L);
                mm2.e1 e1Var3 = (mm2.e1) c(mm2.e1.class);
                if (e1Var3 == null || (str2 = e1Var3.f410525v) == null) {
                    str2 = "";
                }
                intent.putExtra("KEY_LOTTERY_HISTORY_OBJECT_NONCE_ID", str2);
                mm2.c1 c1Var2 = (mm2.c1) c(mm2.c1.class);
                if (c1Var2 != null && (str3 = c1Var2.f410385o) != null) {
                    str = str3;
                }
                intent.putExtra("KEY_LIVE_ANCHOR_USERNAME", str);
                i95.m c17 = i95.n0.c(c61.yb.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                c61.yb ybVar = (c61.yb) c17;
                android.content.Context context = this.f428365o.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                c61.yb.H7(ybVar, context, intent, 0L, null, 0, 0, false, 124, null);
                c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
                android.content.Context context2 = this.f428365o.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ubVar).Oj(context2, intent, true);
            } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.irr) {
                on2.z2 z2Var = (on2.z2) c(on2.z2.class);
                if (!(z2Var != null && z2Var.V6())) {
                    on2.z2 z2Var2 = (on2.z2) c(on2.z2.class);
                    if (!(z2Var2 != null && z2Var2.T6())) {
                        on2.z2 z2Var3 = (on2.z2) c(on2.z2.class);
                        if ((z2Var3 != null ? z2Var3.f428621f : 100) <= this.f428373w.mo1894x7e414b06()) {
                            db5.t7.g(this.f428365o.getContext(), this.f428365o.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dpu));
                        } else {
                            mm2.e1 e1Var4 = (mm2.e1) c(mm2.e1.class);
                            java.lang.Long valueOf2 = (e1Var4 == null || (nw1Var = e1Var4.f410521r) == null) ? null : java.lang.Long.valueOf(nw1Var.m75942xfb822ef2(0));
                            mm2.e1 e1Var5 = (mm2.e1) c(mm2.e1.class);
                            java.lang.Long valueOf3 = e1Var5 != null ? java.lang.Long.valueOf(e1Var5.f410516m) : null;
                            mm2.e1 e1Var6 = (mm2.e1) c(mm2.e1.class);
                            java.lang.String str4 = e1Var6 != null ? e1Var6.f410525v : null;
                            mm2.c1 c1Var3 = (mm2.c1) c(mm2.c1.class);
                            java.lang.String str5 = c1Var3 != null ? c1Var3.f410385o : null;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLotteryPanelWidget", "enterFinderCreateLotteryUI liveId:" + valueOf2 + ",objectId:" + valueOf3 + ",nonceId:" + str4 + ",sourceScene:" + this.f428362i);
                            c61.ub ubVar2 = (c61.ub) i95.n0.c(c61.ub.class);
                            android.content.Context context3 = this.f428365o.getContext();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context3, "null cannot be cast to non-null type android.app.Activity");
                            android.app.Activity activity = (android.app.Activity) context3;
                            android.content.Intent intent2 = new android.content.Intent();
                            intent2.putExtra("KEY_PARAMS_LOTTERY_SOURCE", this.f428362i);
                            intent2.putExtra("KEY_PARAMS_LIVE_ID", valueOf2 != null ? valueOf2.longValue() : 0L);
                            intent2.putExtra("KEY_PARAMS_OBJECT_ID", valueOf3 != null ? valueOf3.longValue() : 0L);
                            if (str4 == null) {
                                str4 = "";
                            }
                            intent2.putExtra("KEY_PARAMS_NONCE_ID", str4);
                            intent2.putExtra("KEY_PARAMS_ANCHOR_USERNAME", str5 != null ? str5 : "");
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ubVar2).sj(activity, intent2, 1002);
                        }
                    }
                }
                db5.t7.m(this.f428365o.getContext(), this.f428365o.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dpv));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/FinderLiveLotteryPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
