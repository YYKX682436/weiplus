package wo1;

/* loaded from: classes5.dex */
public abstract class a1 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public boolean f529419d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f529420e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f529421f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2762x1410e13c.C22703xb395948f f529422g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f529423h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ProgressBar f529424i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f529425m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f529426n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.Button f529427o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.Button f529428p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.Button f529429q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f529430r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f529431s;

    /* renamed from: t, reason: collision with root package name */
    public android.animation.ValueAnimator f529432t;

    /* renamed from: u, reason: collision with root package name */
    public android.animation.ObjectAnimator f529433u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(android.content.Context context, android.util.AttributeSet attrs, int i17, int i18) {
        super(context, attrs, i17, i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.f529431s = jz5.h.b(new wo1.z(context));
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, rj.t.f477686c);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        if (resourceId == 0) {
            throw new java.lang.IllegalArgumentException("BaseTaskStatusView must have a valid layoutResource");
        }
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(resourceId, (android.view.ViewGroup) this, true);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.s7y);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f529420e = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.s7z);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f529421f = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.f568760s81);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f529422g = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2762x1410e13c.C22703xb395948f) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.p314xaae8f345.mm.R.id.f568763s84);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f529423h = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = inflate.findViewById(com.p314xaae8f345.mm.R.id.f568761s82);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f529424i = (android.widget.ProgressBar) findViewById5;
        android.view.View findViewById6 = inflate.findViewById(com.p314xaae8f345.mm.R.id.f568762s83);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f529425m = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = inflate.findViewById(com.p314xaae8f345.mm.R.id.s7x);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById7;
        this.f529426n = textView;
        android.view.View findViewById8 = inflate.findViewById(com.p314xaae8f345.mm.R.id.s7v);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        this.f529427o = (android.widget.Button) findViewById8;
        android.view.View findViewById9 = inflate.findViewById(com.p314xaae8f345.mm.R.id.s7w);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        this.f529428p = (android.widget.Button) findViewById9;
        android.view.View findViewById10 = inflate.findViewById(com.p314xaae8f345.mm.R.id.f568759s80);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById10, "findViewById(...)");
        this.f529429q = (android.widget.Button) findViewById10;
        textView.setMovementMethod(new android.text.method.LinkMovementMethod());
        textView.setHighlightColor(0);
    }

    /* renamed from: getInfiniteRotate */
    private final android.view.animation.Animation m174208x7c2f2185() {
        return (android.view.animation.Animation) ((jz5.n) this.f529431s).mo141623x754a37bb();
    }

    public final jz5.l a(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g pkgInfo, po1.d device, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgInfo, "pkgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseTaskStatusView", "checkPermissionAndStartTask, pkgId=" + pkgInfo.f297362d + ", isBackup=" + z17);
        fo1.p pVar = fo1.p.f346423a;
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
        if (!pVar.a((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) context, device, new wo1.y(pkgInfo, z17))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BaseTaskStatusView", "[checkPermissionAndStartTask] permission denied. pkgId=" + pkgInfo.f297362d + ", isBackup=" + z17);
            return new jz5.l(null, java.lang.Boolean.TRUE);
        }
        qo1.d1 g17 = z17 ? qo1.j1.f447056a.g(pkgInfo) : qo1.j1.f447056a.h(pkgInfo, kz5.p0.f395529d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseTaskStatusView", "[checkPermissionAndStartTask] result = " + g17 + '.');
        int ordinal = g17.ordinal();
        if (ordinal == 0) {
            qo1.j0 d17 = qo1.j1.f447056a.d(pkgInfo.f297362d);
            if (d17 instanceof qo1.v0) {
                qo1.v0 v0Var = (qo1.v0) d17;
                if (v0Var.f447009b == com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o0.AFFROAM_TASK_TYPE_AUTO_BACKUP) {
                    v0Var.f447090x = true;
                }
            }
            return new jz5.l(g17, java.lang.Boolean.FALSE);
        }
        int i17 = com.p314xaae8f345.mm.R.C30867xcad56011.n0p;
        if (ordinal != 1) {
            if (ordinal == 2) {
                i17 = com.p314xaae8f345.mm.R.C30867xcad56011.n0q;
            } else if (ordinal != 3) {
                throw new jz5.j();
            }
        }
        android.content.Context context2 = getContext();
        int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context2);
        e4Var.d(i17);
        e4Var.b(com.p314xaae8f345.mm.R.raw.f79770xc84f57c6);
        e4Var.c();
        return new jz5.l(g17, java.lang.Boolean.FALSE);
    }

    public final int b(po1.d dVar, qo1.j0 j0Var) {
        int ordinal = dVar.f438829b.ordinal();
        return (ordinal == 0 || ordinal == 1) ? ((j0Var instanceof qo1.c1) || (this.f529419d && (j0Var instanceof qo1.g0))) ? j0Var.b() ? com.p314xaae8f345.mm.R.C30861xcebc809e.f78107x3b597091 : com.p314xaae8f345.mm.R.C30861xcebc809e.f78106xb97f2cdb : j0Var.b() ? com.p314xaae8f345.mm.R.C30861xcebc809e.f78068x5769ab60 : com.p314xaae8f345.mm.R.C30861xcebc809e.f78067x126befea : ordinal != 2 ? ((j0Var instanceof qo1.c1) || (this.f529419d && (j0Var instanceof qo1.g0))) ? j0Var.b() ? com.p314xaae8f345.mm.R.C30861xcebc809e.f78105xddcee66f : com.p314xaae8f345.mm.R.C30861xcebc809e.f78104x946ea339 : j0Var.b() ? com.p314xaae8f345.mm.R.C30861xcebc809e.f78066x780a3600 : com.p314xaae8f345.mm.R.C30861xcebc809e.f78065x8d14528a : ((j0Var instanceof qo1.c1) || (this.f529419d && (j0Var instanceof qo1.g0))) ? j0Var.b() ? com.p314xaae8f345.mm.R.C30861xcebc809e.f78109xe4bd4efe : com.p314xaae8f345.mm.R.C30861xcebc809e.f78108x99652408 : j0Var.b() ? com.p314xaae8f345.mm.R.C30861xcebc809e.f78070xddf94ecf : com.p314xaae8f345.mm.R.C30861xcebc809e.f78069x33a07399;
    }

    public final java.lang.String c(qo1.j0 task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        if ((task instanceof qo1.g0) && this.f529419d) {
            java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.w1.f174456a;
            return com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.w1.f174457b;
        }
        if (task instanceof qo1.c1) {
            java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.w1.f174456a;
            return com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.w1.f174457b;
        }
        java.lang.String str3 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.w1.f174456a;
        return com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.w1.f174456a;
    }

    public void d(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g pkgInfo, qo1.f0 task, po1.d device, qo1.i0 error) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgInfo, "pkgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(error, "error");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseTaskStatusView", "[onAutoBackupConsecutiveFail] pkgId=" + task.f447016i + ", error=" + error);
        android.widget.ImageView imageView = this.f529421f;
        imageView.setVisibility(0);
        imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cwp);
        this.f529423h.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f574406n00);
        android.widget.TextView textView = this.f529426n;
        textView.setVisibility(0);
        t(textView, pkgInfo);
        android.widget.Button button = this.f529428p;
        button.setVisibility(0);
        button.setText(com.p314xaae8f345.mm.R.C30867xcad56011.mwo);
        button.setOnClickListener(new wo1.a0(this, pkgInfo, device));
        android.widget.Button button2 = this.f529429q;
        button2.setVisibility(0);
        button2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572213a72);
        button2.setOnClickListener(new wo1.b0(task, this, pkgInfo, device));
    }

    public void e(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g pkgInfo, qo1.j0 task, po1.d device, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgInfo, "pkgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
        android.widget.ImageView imageView = this.f529421f;
        imageView.setVisibility(0);
        imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f78838xa71f2f0a);
        this.f529423h.setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mzy, c(task)));
        if (task instanceof qo1.c1) {
            long m17 = ((qo1.c1) task).m();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseTaskStatusView", "onCompletedState failConvCount=" + m17);
            if (m17 > 0) {
                android.widget.TextView textView = this.f529426n;
                textView.setVisibility(0);
                textView.setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ofn, java.lang.Long.valueOf(m17)));
            }
        }
    }

    public void f(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g pkgInfo, qo1.j0 task, po1.d device, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgInfo, "pkgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
        android.widget.ImageView imageView = this.f529421f;
        imageView.setVisibility(0);
        imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f81132x17eadb03);
        imageView.startAnimation(m174208x7c2f2185());
        this.f529430r = true;
        this.f529423h.setText(com.p314xaae8f345.mm.R.C30867xcad56011.mzo);
        android.widget.TextView textView = this.f529426n;
        textView.setVisibility(0);
        textView.setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mzq, c(task)));
        android.widget.Button button = this.f529429q;
        button.setVisibility(0);
        button.setText(com.p314xaae8f345.mm.R.C30867xcad56011.mvh);
        button.setOnClickListener(new wo1.c0(this, pkgInfo, task, device));
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0299  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g r18, qo1.f0 r19, po1.d r20, qo1.i0 r21) {
        /*
            Method dump skipped, instructions count: 705
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wo1.a1.g(com.tencent.wechat.aff.affroam.g, qo1.f0, po1.d, qo1.i0):void");
    }

    /* renamed from: getDummyAsRestore */
    public final boolean m174209x4201472a() {
        return this.f529419d;
    }

    /* renamed from: getGreenBtn */
    public final android.widget.Button m174210x881571cf() {
        return this.f529427o;
    }

    /* renamed from: getGreyBtn */
    public final android.widget.Button m174211x4ebed6c7() {
        return this.f529428p;
    }

    /* renamed from: getHintTv */
    public final android.widget.TextView m174212x1c8a865f() {
        return this.f529426n;
    }

    /* renamed from: getIconRectangle */
    public final android.widget.ImageView m174213xcbd04540() {
        return this.f529420e;
    }

    /* renamed from: getIconSquare */
    public final android.widget.ImageView m174214xd0783aec() {
        return this.f529421f;
    }

    /* renamed from: getLinkBtn */
    public final android.widget.Button m174215x485ad7cc() {
        return this.f529429q;
    }

    /* renamed from: getLoadingProgress */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2762x1410e13c.C22703xb395948f m174216x963add53() {
        return this.f529422g;
    }

    /* renamed from: getNeedRotateAnimation */
    public final boolean m174217x7ccc41bd() {
        return this.f529430r;
    }

    /* renamed from: getProgressBar */
    public final android.widget.ProgressBar m174218x1d47bd70() {
        return this.f529424i;
    }

    /* renamed from: getProgressHintTv */
    public final android.widget.TextView m174219x6a23c8ec() {
        return this.f529425m;
    }

    /* renamed from: getTitleTv */
    public final android.widget.TextView m174220xefe232c4() {
        return this.f529423h;
    }

    public void h(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g pkgInfo, qo1.f0 task, po1.d device, qo1.i0 error) {
        java.lang.String string;
        java.lang.String string2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgInfo, "pkgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(error, "error");
        android.widget.ImageView imageView = this.f529421f;
        imageView.setVisibility(0);
        imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cwp);
        int ordinal = task.f447009b.ordinal();
        if (ordinal == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseTaskStatusView", "Task type error.");
            return;
        }
        if (ordinal == 1) {
            q(pkgInfo, task, device, -1);
            return;
        }
        android.widget.TextView textView = this.f529423h;
        android.widget.Button button = this.f529428p;
        if (ordinal == 2) {
            textView.setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574410n04, device.b()));
            if (task.f447012e == null) {
                string = getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.aby);
            } else {
                android.content.Context context = getContext();
                java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.w1.f174456a;
                string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mwj, com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.w1.f174456a);
            }
            button.setText(string);
        } else if (ordinal == 3) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f574412n06);
            android.widget.TextView textView2 = this.f529426n;
            textView2.setVisibility(0);
            textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.mvx);
            if (task.f447012e == null) {
                string2 = getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.aby);
            } else {
                android.content.Context context2 = getContext();
                java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.w1.f174456a;
                string2 = context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mwj, com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.w1.f174457b);
            }
            button.setText(string2);
        }
        if (task.f447012e != null) {
            android.widget.ProgressBar progressBar = this.f529424i;
            progressBar.setVisibility(0);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a2 a2Var = task.f447012e;
            progressBar.setProgress((int) ((a2Var != null ? a2Var.b() : 0.0f) * 100));
            progressBar.setProgressDrawable(getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.aow));
        }
        button.setVisibility(0);
        button.setOnClickListener(new wo1.j0(this, pkgInfo, device, task));
        android.widget.Button button2 = this.f529429q;
        button2.setVisibility(0);
        button2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.mvh);
        button2.setOnClickListener(new wo1.k0(this, pkgInfo, task, device));
    }

    public void i(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g pkgInfo, qo1.j0 task, po1.d device, com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.a extState, java.lang.Object obj) {
        java.lang.String c17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgInfo, "pkgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extState, "extState");
        int ordinal = extState.ordinal();
        android.widget.TextView textView = this.f529423h;
        android.widget.ImageView imageView = this.f529421f;
        android.widget.TextView textView2 = this.f529426n;
        if (ordinal == 0) {
            if (!(obj instanceof java.lang.Boolean)) {
                c17 = c(task);
            } else if (((java.lang.Boolean) obj).booleanValue()) {
                java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.w1.f174456a;
                c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.w1.f174456a;
            } else {
                java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.w1.f174456a;
                c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.w1.f174457b;
            }
            imageView.setVisibility(0);
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cwp);
            textView.setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.n08, c17));
            textView2.setVisibility(0);
            textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.myl);
            android.widget.Button button = this.f529428p;
            button.setVisibility(0);
            button.setText(com.p314xaae8f345.mm.R.C30867xcad56011.aby);
            button.setOnClickListener(new wo1.l0(this, pkgInfo, device, task));
            android.widget.Button button2 = this.f529429q;
            button2.setVisibility(0);
            button2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.mvh);
            button2.setOnClickListener(new wo1.m0(extState, pkgInfo));
            return;
        }
        if (ordinal != 1) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.backup.roambackup.listeners.DeleteParams");
        io1.a aVar = (io1.a) obj;
        boolean z17 = aVar.f374989e;
        io1.b bVar = aVar.f374986b;
        if (z17) {
            imageView.setVisibility(0);
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f78838xa71f2f0a);
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.mvu);
            if (bVar == io1.b.f374991d && aVar.f374990f == -1) {
                textView2.setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mxa, aVar.f374987c.f438832e));
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2762x1410e13c.C22703xb395948f c22703xb395948f = this.f529422g;
        c22703xb395948f.setVisibility(0);
        android.animation.ValueAnimator valueAnimator = this.f529432t;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        int i17 = (int) (aVar.f374988d * 100);
        if (i17 > c22703xb395948f.m82048x402effa3()) {
            android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(c22703xb395948f.m82048x402effa3(), i17);
            ofInt.setDuration(500L);
            ofInt.addUpdateListener(new wo1.n0(this));
            ofInt.start();
            this.f529432t = ofInt;
        } else {
            c22703xb395948f.m82049x3ae760af(i17);
        }
        if (bVar == io1.b.f374991d) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.mvt);
        } else {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.mzp);
        }
        textView2.setVisibility(0);
        java.lang.String string = getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mvr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        textView2.setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mzq, string));
    }

    public void j(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g pkgInfo, qo1.j0 task, po1.d device, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgInfo, "pkgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
        android.widget.ImageView imageView = this.f529421f;
        imageView.setVisibility(0);
        imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f81135xe62b4f47);
        imageView.startAnimation(m174208x7c2f2185());
        this.f529430r = true;
        this.f529423h.setText(com.p314xaae8f345.mm.R.C30867xcad56011.n0b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
    
        if (r11.a(r3) <= java.lang.System.currentTimeMillis()) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0049, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
    
        monitor-exit(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (r2 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        r0.setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mvd, fo1.r.a(r11.a(r8.f297362d))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0070, code lost:
    
        r11 = r7.f529428p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        r0.setText(com.p314xaae8f345.mm.R.C30867xcad56011.mve);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0035, code lost:
    
        if (((r8.f297368m & 1) != 0) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0027, code lost:
    
        if (((qo1.f0) r9).f447009b != com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o0.AFFROAM_TASK_TYPE_AUTO_BACKUP) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0037, code lost:
    
        r11 = eo1.a.f337078a;
        r3 = r8.f297362d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003b, code lost:
    
        monitor-enter(r11);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g r8, qo1.j0 r9, po1.d r10, int r11) {
        /*
            r7 = this;
            java.lang.String r0 = "pkgInfo"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r0)
            java.lang.String r0 = "task"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r9, r0)
            java.lang.String r0 = "device"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r10, r0)
            android.widget.ImageView r0 = r7.f529420e
            r1 = 0
            r0.setVisibility(r1)
            r0.setImageResource(r11)
            boolean r11 = r9 instanceof qo1.f0
            android.widget.TextView r0 = r7.f529423h
            r2 = 1
            if (r11 == 0) goto L29
            r11 = r9
            qo1.f0 r11 = (qo1.f0) r11
            com.tencent.wechat.aff.affroam.o0 r3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o0.AFFROAM_TASK_TYPE_AUTO_BACKUP
            com.tencent.wechat.aff.affroam.o0 r11 = r11.f447009b
            if (r11 == r3) goto L37
        L29:
            boolean r11 = r9 instanceof qo1.g0
            if (r11 == 0) goto L76
            int r11 = r8.f297368m
            r11 = r11 & r2
            if (r11 == 0) goto L34
            r11 = r2
            goto L35
        L34:
            r11 = r1
        L35:
            if (r11 == 0) goto L76
        L37:
            eo1.a r11 = eo1.a.f337078a
            long r3 = r8.f297362d
            monitor-enter(r11)
            long r3 = r11.a(r3)     // Catch: java.lang.Throwable -> L73
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L73
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L49
            goto L4a
        L49:
            r2 = r1
        L4a:
            monitor-exit(r11)
            if (r2 == 0) goto L6a
            long r2 = r8.f297362d
            long r2 = r11.a(r2)
            android.content.Context r11 = r7.getContext()
            java.lang.String r2 = fo1.r.a(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            r3 = 2131774146(0x7f104ac2, float:1.91797E38)
            java.lang.String r11 = r11.getString(r3, r2)
            r0.setText(r11)
            goto L70
        L6a:
            r11 = 2131774147(0x7f104ac3, float:1.9179702E38)
            r0.setText(r11)
        L70:
            android.widget.Button r11 = r7.f529428p
            goto Lbb
        L73:
            r8 = move-exception
            monitor-exit(r11)
            throw r8
        L76:
            po1.a r11 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9.f35348x681a0c0c
            com.tencent.wechat.aff.affroam.i r2 = r8.f297367i
            java.lang.String r3 = "getBackupRange(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r3)
            com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo r11 = r11.a(r2)
            po1.b r11 = r11.f174263d
            po1.b r2 = po1.b.f438822d
            if (r11 != r2) goto L95
            android.content.Context r11 = r7.getContext()
            r2 = 2131774162(0x7f104ad2, float:1.9179732E38)
            java.lang.String r11 = r11.getString(r2)
            goto La0
        L95:
            android.content.Context r11 = r7.getContext()
            r2 = 2131774291(0x7f104b53, float:1.9179994E38)
            java.lang.String r11 = r11.getString(r2)
        La0:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r11)
            android.content.Context r2 = r7.getContext()
            java.lang.String r3 = r10.b()
            java.lang.Object[] r11 = new java.lang.Object[]{r11, r3}
            r3 = 2131774384(0x7f104bb0, float:1.9180182E38)
            java.lang.String r11 = r2.getString(r3, r11)
            r0.setText(r11)
            android.widget.Button r11 = r7.f529427o
        Lbb:
            android.widget.TextView r0 = r7.f529426n
            r7.t(r0, r8)
            r11.setVisibility(r1)
            r0 = 2131774203(0x7f104afb, float:1.9179815E38)
            r11.setText(r0)
            wo1.o0 r0 = new wo1.o0
            r0.<init>(r8, r9, r10, r7)
            r11.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wo1.a1.k(com.tencent.wechat.aff.affroam.g, qo1.j0, po1.d, int):void");
    }

    public void l(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g pkgInfo, qo1.f0 task, po1.d device, qo1.i0 error) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgInfo, "pkgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(error, "error");
        android.widget.ImageView imageView = this.f529421f;
        imageView.setVisibility(0);
        if (task.o()) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f79077x2e716e0d);
            imageView.setColorFilter(new android.graphics.PorterDuffColorFilter(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834), android.graphics.PorterDuff.Mode.SRC_IN));
        } else {
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cwp);
        }
        this.f529423h.setText(com.p314xaae8f345.mm.R.C30867xcad56011.mzl);
        android.widget.Button button = this.f529428p;
        button.setVisibility(0);
        button.setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.aby));
        button.setOnClickListener(new wo1.p0(this, pkgInfo, device, task));
        android.widget.Button button2 = this.f529429q;
        button2.setVisibility(0);
        button2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.mvh);
        button2.setOnClickListener(new wo1.q0(this, pkgInfo, task, device));
    }

    public void m(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g pkgInfo, qo1.j0 task, po1.d device, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgInfo, "pkgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
        this.f529421f.setVisibility(0);
        this.f529421f.setImageResource(com.p314xaae8f345.mm.R.raw.f81132x17eadb03);
        this.f529421f.startAnimation(m174208x7c2f2185());
        this.f529430r = true;
        this.f529423h.setText(com.p314xaae8f345.mm.R.C30867xcad56011.n0h);
        if (task instanceof qo1.f0) {
            int i18 = ((qo1.f0) task).f447020m;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseTaskStatusView", "[onPreparingState] prepareState=" + i18);
            if (i18 == 1) {
                this.f529423h.setText(com.p314xaae8f345.mm.R.C30867xcad56011.mzx);
            } else if (i18 == 2) {
                this.f529423h.setText(com.p314xaae8f345.mm.R.C30867xcad56011.mzw);
            }
        }
        this.f529426n.setVisibility(0);
        this.f529426n.setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mzq, c(task)));
        this.f529429q.setVisibility(0);
        this.f529429q.setText(com.p314xaae8f345.mm.R.C30867xcad56011.mvh);
        this.f529429q.setOnClickListener(new wo1.r0(this, pkgInfo, task, device));
    }

    public void n(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g pkgInfo, qo1.f0 task, po1.d device, qo1.i0 error) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgInfo, "pkgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(error, "error");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseTaskStatusView", "onRestError, pkgId=" + task.f447016i + " taskType=" + task.f447009b + ", error=" + error);
        boolean o17 = task.o();
        boolean z17 = (task instanceof qo1.v0) && ((qo1.v0) task).f447090x;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BaseTaskStatusView", "pkgId=" + task.f447016i + " isAutoBackup=" + o17 + ", needShowError=" + z17);
        if (o17 && !z17) {
            q(pkgInfo, task, device, -1);
            return;
        }
        java.lang.String c17 = c(task);
        this.f529421f.setVisibility(0);
        if (o17) {
            this.f529421f.setImageResource(com.p314xaae8f345.mm.R.raw.f79077x2e716e0d);
            this.f529421f.setColorFilter(new android.graphics.PorterDuffColorFilter(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834), android.graphics.PorterDuff.Mode.SRC_IN));
        } else {
            this.f529421f.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cwp);
        }
        this.f529423h.setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.n08, c17));
        if (task.f447012e == null) {
            this.f529428p.setText(com.p314xaae8f345.mm.R.C30867xcad56011.aby);
        } else {
            this.f529424i.setVisibility(0);
            android.widget.ProgressBar progressBar = this.f529424i;
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a2 a2Var = task.f447012e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a2Var);
            progressBar.setProgress((int) (a2Var.b() * 100));
            this.f529424i.setProgressDrawable(getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.aow));
            this.f529428p.setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mwj, c17));
        }
        this.f529428p.setVisibility(0);
        this.f529428p.setOnClickListener(new wo1.s0(this, pkgInfo, device, task));
        this.f529429q.setVisibility(0);
        this.f529429q.setText(com.p314xaae8f345.mm.R.C30867xcad56011.mvh);
        this.f529429q.setOnClickListener(new wo1.t0(this, pkgInfo, task, device));
    }

    public void o(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g pkgInfo, qo1.j0 task, qo1.i0 error, po1.d device, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgInfo, "pkgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(error, "error");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
        qo1.f0 f0Var = (qo1.f0) task;
        java.lang.String c17 = c(task);
        android.widget.ImageView imageView = this.f529420e;
        imageView.setVisibility(0);
        imageView.setImageResource(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0 r0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a;
        java.lang.String str = pkgInfo.f297365g.f297522e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getDeviceId(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.n nVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.n) com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174222f.get(str);
        if (nVar == null) {
            nVar = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.n.f174190d;
        }
        int ordinal = nVar.ordinal();
        this.f529423h.setText(getContext().getString(ordinal != 1 ? ordinal != 2 ? com.p314xaae8f345.mm.R.C30867xcad56011.n0i : com.p314xaae8f345.mm.R.C30867xcad56011.n0m : com.p314xaae8f345.mm.R.C30867xcad56011.n0n, c17));
        android.widget.TextView textView = this.f529426n;
        textView.setVisibility(0);
        if (nVar == com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.n.f174191e && f0Var.f447015h) {
            java.lang.String string = getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.n0o);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            java.lang.String string2 = getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mw_);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            s(textView, string, string2, new wo1.u0(this, task, device));
        } else {
            textView.setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mzq, c17));
        }
        android.widget.ProgressBar progressBar = this.f529424i;
        progressBar.setVisibility(0);
        this.f529425m.setVisibility(0);
        progressBar.setProgressDrawable(getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.aoy));
        u(-1.0f, task);
        android.widget.Button button = this.f529429q;
        button.setVisibility(0);
        button.setText(com.p314xaae8f345.mm.R.C30867xcad56011.mwr);
        button.setOnClickListener(new wo1.v0(this, pkgInfo, task, device));
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z17) {
        super.onVisibilityAggregated(z17);
        if (this.f529430r && z17) {
            android.widget.ImageView imageView = this.f529421f;
            imageView.clearAnimation();
            imageView.startAnimation(m174208x7c2f2185());
        }
    }

    public abstract void p(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar, qo1.f0 f0Var, po1.d dVar);

    public void q(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g pkgInfo, qo1.j0 task, po1.d device, int i17) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgInfo, "pkgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a2 c17 = task.c();
        if (c17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseTaskStatusView", "Task failed before enter sdk. pkgId=" + task.a());
            if (i17 <= 0) {
                i17 = b(device, task);
            }
            k(pkgInfo, task, device, i17);
            return;
        }
        java.lang.String c18 = c(task);
        android.widget.ImageView imageView = this.f529421f;
        imageView.setVisibility(0);
        long j17 = c17.c().f297480e;
        boolean z18 = task instanceof qo1.f0;
        android.widget.TextView textView = this.f529423h;
        if (z18) {
            if (((qo1.f0) task).f447009b == com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o0.AFFROAM_TASK_TYPE_AUTO_BACKUP) {
                android.widget.TextView textView2 = this.f529426n;
                textView2.setVisibility(0);
                if (((com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0) task.d().f384366d) == com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_STOPPED) {
                    eo1.a aVar = eo1.a.f337078a;
                    long j18 = pkgInfo.f297362d;
                    synchronized (aVar) {
                        z17 = aVar.a(j18) > java.lang.System.currentTimeMillis();
                    }
                    if (z17) {
                        imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f78838xa71f2f0a);
                        textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.oes);
                        textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.mwp);
                        return;
                    }
                }
                imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f78859xcd13c2b3);
                imageView.setColorFilter(new android.graphics.PorterDuffColorFilter(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77716xe690c4ac), android.graphics.PorterDuff.Mode.SRC_IN));
                textView.setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.n0k, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.S1(j17)));
                textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.mzm);
                return;
            }
        }
        imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f78838xa71f2f0a);
        textView.setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.n0l, c18));
    }

    public void r() {
        this.f529430r = false;
        android.widget.ImageView imageView = this.f529421f;
        imageView.clearAnimation();
        imageView.setVisibility(8);
        imageView.clearColorFilter();
        this.f529422g.setVisibility(8);
        this.f529420e.setVisibility(8);
        this.f529424i.setVisibility(8);
        this.f529425m.setVisibility(8);
        this.f529426n.setVisibility(8);
        this.f529427o.setVisibility(8);
        this.f529428p.setVisibility(8);
        this.f529429q.setVisibility(8);
    }

    public final void s(android.widget.TextView textView, java.lang.String hintStr, java.lang.String linkStr, yz5.a cb6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "textView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hintStr, "hintStr");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(linkStr, "linkStr");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cb6, "cb");
        textView.setText(hintStr);
        textView.append(" ");
        android.text.SpannableString spannableString = new android.text.SpannableString(linkStr);
        spannableString.setSpan(new wo1.z0(this, cb6), 0, linkStr.length(), 33);
        textView.append(spannableString);
    }

    /* renamed from: setDummyAsRestore */
    public final void m174221x9f7af36(boolean z17) {
        this.f529419d = z17;
    }

    /* renamed from: setNeedRotateAnimation */
    public final void m174222xcb110131(boolean z17) {
        this.f529430r = z17;
    }

    public final void t(android.widget.TextView view, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g pkgInfo) {
        java.lang.String string;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgInfo, "pkgInfo");
        view.setVisibility(0);
        if (pkgInfo.f297370o.f297372e > 0) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.l0 h17 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.u.f174270a.d().h(pkgInfo.f297362d);
            long j17 = 1000;
            long j18 = pkgInfo.f297370o.f297372e * j17;
            long j19 = h17.f297423g * j17;
            long j27 = h17.f297421e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseTaskStatusView", "pkgId = " + pkgInfo.f297362d + ", lastBackupUpdateTime = " + j19 + ", lastStopOrErrorTime = " + j27 + ", timestamp = " + j18);
            if (j19 <= 0) {
                string = getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.n0f, k35.m1.f(getContext(), j18, true, false));
            } else if (j27 >= j19) {
                string = getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.n0j, k35.m1.f(getContext(), j27, true, false));
            } else {
                string = getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.n0e, k35.m1.f(getContext(), j19, true, false));
            }
        } else {
            string = getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mzz);
        }
        view.setText(string);
    }

    public void u(float f17, qo1.j0 task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a2 c17 = task.c();
        if (c17 == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fail to get roamTask by pkgId=");
            qo1.f0 f0Var = task instanceof qo1.f0 ? (qo1.f0) task : null;
            sb6.append(f0Var != null ? java.lang.Long.valueOf(f0Var.f447016i) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseTaskStatusView", sb6.toString());
            return;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.p0 c18 = c17.c();
        if (f17 < 0.0f) {
            f17 = c17.b();
        }
        int i17 = (int) (f17 * 100);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c18);
        java.lang.String b17 = fo1.r.b(c18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseTaskStatusView", "updateProgress, progress = " + i17 + ", hint = " + b17);
        this.f529425m.setText(b17);
        android.animation.ObjectAnimator objectAnimator = this.f529433u;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            objectAnimator.cancel();
        }
        android.widget.ProgressBar progressBar = this.f529424i;
        if (progressBar.getProgress() <= 0 || i17 - progressBar.getProgress() <= 2.0f) {
            progressBar.setProgress(i17);
            return;
        }
        android.animation.ObjectAnimator ofInt = android.animation.ObjectAnimator.ofInt(progressBar, "progress", progressBar.getProgress(), i17);
        if (i17 < 90) {
            ofInt.setDuration(1000L);
        } else {
            ofInt.setDuration((java.lang.Math.max(100 - i17, 0) * 50) + 100);
        }
        ofInt.start();
        this.f529433u = ofInt;
    }

    public final void v(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g pkgInfo, qo1.j0 task, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 state, qo1.i0 error) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgInfo, "pkgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(error, "error");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseTaskStatusView", "updateStatus state = " + state + ", error=" + error + ", pkgId=" + pkgInfo.f297362d);
        po1.c cVar = po1.d.f438827i;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.u uVar = pkgInfo.f297365g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uVar, "getTargetDevice(...)");
        po1.d a17 = cVar.a(uVar);
        int b17 = b(a17, task);
        r();
        jz5.l a18 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.b.f174101a.a(pkgInfo.f297362d);
        if (a18 != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Intercept normal state=");
            sb6.append(state);
            sb6.append(" and show extState=");
            java.lang.Object obj = a18.f384366d;
            sb6.append(obj);
            sb6.append(", extra=");
            sb6.append(a18.f384367e);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseTaskStatusView", sb6.toString());
            i(pkgInfo, task, a17, (com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.a) obj, a18.f384367e);
            return;
        }
        switch (state) {
            case AFFROAM_TASK_STATE_INITED:
                k(pkgInfo, task, a17, b17);
                return;
            case AFFROAM_TASK_STATE_PREPARING:
                m(pkgInfo, task, a17, b17);
                return;
            case AFFROAM_TASK_STATE_RUNNING:
                o(pkgInfo, task, error, a17, b17);
                return;
            case AFFROAM_TASK_STATE_PAUSED:
                g(pkgInfo, (qo1.f0) task, a17, qo1.i0.f447042p);
                return;
            case AFFROAM_TASK_STATE_COMPLETED:
                e(pkgInfo, task, a17, b17);
                return;
            case AFFROAM_TASK_STATE_STOPPED:
                q(pkgInfo, task, a17, b17);
                return;
            case AFFROAM_TASK_STATE_QUIT:
                g(pkgInfo, (qo1.f0) task, a17, qo1.i0.f447042p);
                return;
            case AFFROAM_TASK_STATE_ERROR:
                if (!(task instanceof qo1.f0)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BaseTaskStatusView", "Task type error");
                    return;
                }
                qo1.f0 f0Var = (qo1.f0) task;
                if (f0Var.o() && f0Var.p()) {
                    d(pkgInfo, f0Var, a17, error);
                    return;
                }
                switch (error.ordinal()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 6:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        n(pkgInfo, f0Var, a17, error);
                        return;
                    case 4:
                        h(pkgInfo, f0Var, a17, error);
                        return;
                    case 5:
                    case 7:
                        g(pkgInfo, f0Var, a17, error);
                        return;
                    case 8:
                        l(pkgInfo, f0Var, a17, error);
                        return;
                    case 9:
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseTaskStatusView", "Error state, pkgId=" + pkgInfo.f297362d);
                        return;
                    default:
                        return;
                }
            case AFFROAM_TASK_STATE_IMPORTING:
                j(pkgInfo, task, a17, b17);
                return;
            case AFFROAM_TASK_STATE_DELETING:
                f(pkgInfo, task, a17, b17);
                return;
            case AFFROAM_TASK_STATE_CONNECTING:
                m(pkgInfo, task, a17, b17);
                return;
            default:
                return;
        }
    }
}
