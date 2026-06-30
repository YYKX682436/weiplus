package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI */
/* loaded from: classes12.dex */
public class ActivityC17364x9169f957 extends com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a {

    /* renamed from: s, reason: collision with root package name */
    public static java.lang.String f241609s = null;

    /* renamed from: t, reason: collision with root package name */
    public static java.lang.String f241610t = "00:00";

    /* renamed from: u, reason: collision with root package name */
    public static java.lang.String f241611u = "24:00";

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f241612e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f241613f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f241614g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f241615h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f241616i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f241617m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f241618n;

    /* renamed from: o, reason: collision with root package name */
    public final java.text.SimpleDateFormat f241619o = new java.text.SimpleDateFormat("yyyy.MM.dd");

    /* renamed from: p, reason: collision with root package name */
    public final java.text.SimpleDateFormat f241620p = new java.text.SimpleDateFormat("yyyyMMdd");

    /* renamed from: q, reason: collision with root package name */
    public final java.util.ArrayList f241621q = new java.util.ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.ArrayList f241622r = new java.util.ArrayList();

    public ActivityC17364x9169f957() {
        for (int i17 = 0; i17 <= 24; i17++) {
            java.lang.String format = java.lang.String.format("%02d:00", java.lang.Integer.valueOf(i17));
            this.f241621q.add(format);
            this.f241622r.add(format);
        }
        this.f241621q.remove(24);
        this.f241622r.remove(0);
    }

    public static void Z6(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17364x9169f957 activityC17364x9169f957, boolean z17) {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC17364x9169f957.mo55332x76847179();
        java.util.ArrayList arrayList = activityC17364x9169f957.f241621q;
        java.util.ArrayList arrayList2 = activityC17364x9169f957.f241622r;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0(mo55332x76847179, z17 ? arrayList : arrayList2);
        c0Var.f293792t = new o14.b0(activityC17364x9169f957, z17, c0Var);
        if (z17) {
            int indexOf = arrayList.indexOf(f241610t);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22706xd568f79 c22706xd568f79 = c0Var.f293789q;
            if (c22706xd568f79 != null) {
                c22706xd568f79.m82071x53d8522f(indexOf);
                c0Var.f293789q.c(indexOf);
            }
        } else {
            int indexOf2 = arrayList2.indexOf(f241611u);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22706xd568f79 c22706xd568f792 = c0Var.f293789q;
            if (c22706xd568f792 != null) {
                c22706xd568f792.m82071x53d8522f(indexOf2);
                c0Var.f293789q.c(indexOf2);
            }
        }
        c0Var.l();
    }

    public final void a7(java.lang.Throwable th6) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        java.io.PrintWriter printWriter = new java.io.PrintWriter(stringWriter);
        th6.printStackTrace(printWriter);
        printWriter.flush();
        java.lang.String stringWriter2 = stringWriter.toString();
        android.widget.TextView textView = new android.widget.TextView(this);
        textView.setText(stringWriter2);
        textView.setGravity(8388627);
        textView.setTextSize(1, 10.0f);
        textView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        textView.setTextColor(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832, mo55332x76847179().getTheme()));
        textView.setTypeface(android.graphics.Typeface.MONOSPACE);
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561399hf);
        textView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar.L = textView;
        aVar.f293265v = of5.b.a(this).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(this, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        j0Var.show();
    }

    public final void b7() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        int i17 = al5.u4.f87591t;
        al5.t4 t4Var = new al5.t4(mo55332x76847179);
        t4Var.f87575e = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573654o36);
        t4Var.f(true);
        t4Var.b(true);
        final al5.u4 g17 = t4Var.g();
        ((ku5.t0) ku5.t0.f394148d).q(new java.lang.Runnable() { // from class: o14.u$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.vfs.r6 j17;
                final com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17364x9169f957 activityC17364x9169f957 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17364x9169f957.this;
                final al5.u4 u4Var = g17;
                java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17364x9169f957.f241609s;
                activityC17364x9169f957.getClass();
                java.io.File file = null;
                try {
                    com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
                    file = p55.b.a(new java.io.File(lp0.b.h0("packed-logs").o()));
                    if (file != null) {
                        fp.r.a(activityC17364x9169f957.mo55332x76847179(), file, "wechat-logs.zip", "application/zip");
                    }
                    ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: o14.u$$g
                        @Override // java.lang.Runnable
                        public final void run() {
                            java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17364x9169f957.f241609s;
                            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17364x9169f957 activityC17364x9169f9572 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17364x9169f957.this;
                            activityC17364x9169f9572.getClass();
                            al5.t4 t4Var2 = u4Var.f87592d;
                            t4Var2.f87575e = activityC17364x9169f9572.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573656fa1);
                            t4Var2.f(false);
                            t4Var2.b(false);
                            t4Var2.e(com.p314xaae8f345.mm.R.raw.f78821xb211a201);
                            t4Var2.i();
                        }
                    });
                } catch (java.lang.Throwable th6) {
                    try {
                        ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: o14.u$$h
                            @Override // java.lang.Runnable
                            public final void run() {
                                java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17364x9169f957.f241609s;
                                final com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17364x9169f957 activityC17364x9169f9572 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17364x9169f957.this;
                                activityC17364x9169f9572.getClass();
                                al5.t4 t4Var2 = u4Var.f87592d;
                                t4Var2.f87575e = activityC17364x9169f9572.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573653o35);
                                t4Var2.f(false);
                                t4Var2.b(false);
                                t4Var2.e(com.p314xaae8f345.mm.R.raw.f81445xd56bca2);
                                t4Var2.a(activityC17364x9169f9572.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o3c));
                                final java.lang.Throwable th7 = th6;
                                t4Var2.f87571a.f87547b = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.g() { // from class: o14.u$$i
                                    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.g
                                    public final void a() {
                                        java.lang.String str3 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17364x9169f957.f241609s;
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17364x9169f957.this.a7(th7);
                                    }
                                };
                                t4Var2.i();
                            }
                        });
                        if (file == null) {
                            return;
                        }
                        j17 = com.p314xaae8f345.mm.vfs.r6.j(file);
                        if (!j17.m()) {
                            return;
                        }
                    } catch (java.lang.Throwable th7) {
                        if (file != null) {
                            com.p314xaae8f345.mm.vfs.r6 j18 = com.p314xaae8f345.mm.vfs.r6.j(file);
                            if (j18.m()) {
                                j18.l();
                            }
                        }
                        throw th7;
                    }
                }
                if (file != null) {
                    j17 = com.p314xaae8f345.mm.vfs.r6.j(file);
                    if (!j17.m()) {
                        return;
                    }
                    j17.l();
                }
            }
        });
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bam;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.fa9);
        this.f241612e = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.g7d);
        this.f241613f = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.bup);
        this.f241614g = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.bu8);
        this.f241615h = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.bu_);
        this.f241616i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f566535g74);
        this.f241617m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f566533g72);
        this.f241618n = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f566534g73);
        this.f241616i.setText(this.f241619o.format(new java.util.Date()));
        this.f241617m.setText(f241610t);
        this.f241618n.setText(f241611u);
        f241609s = this.f241620p.format(new java.util.Date());
        this.f241612e.setOnClickListener(new o14.v(this));
        this.f241613f.setOnClickListener(new o14.w(this));
        this.f241614g.setOnClickListener(new o14.x(this));
        this.f241615h.setOnClickListener(new o14.y(this));
        mo54448x9c8c0d33(new o14.z(this));
        m78478x84f07bce(0, com.p314xaae8f345.mm.R.C30867xcad56011.jzq, com.p314xaae8f345.mm.R.raw.f78355x20db789a, new android.view.MenuItem.OnMenuItemClickListener() { // from class: o14.u$$d
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
                java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17364x9169f957.f241609s;
                final com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17364x9169f957 activityC17364x9169f957 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17364x9169f957.this;
                activityC17364x9169f957.getClass();
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC17364x9169f957, 1, false);
                k0Var.f293405n = new o14.C29250x35bb50();
                k0Var.f293414s = new db5.t4() { // from class: o14.u$$f
                    @Override // db5.t4
                    /* renamed from: onMMMenuItemSelected */
                    public final void mo888x34063ac(android.view.MenuItem menuItem2, int i17) {
                        final com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17364x9169f957 activityC17364x9169f9572 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17364x9169f957.this;
                        java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17364x9169f957.f241609s;
                        activityC17364x9169f9572.getClass();
                        boolean z17 = true;
                        if (menuItem2.getItemId() == 0) {
                            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC17364x9169f9572.mo55332x76847179();
                            int i18 = al5.u4.f87591t;
                            al5.t4 t4Var = new al5.t4(mo55332x76847179);
                            t4Var.f87575e = activityC17364x9169f9572.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573654o36);
                            t4Var.f(true);
                            t4Var.b(true);
                            final al5.u4 g17 = t4Var.g();
                            ((ku5.t0) ku5.t0.f394148d).q(new java.lang.Runnable() { // from class: o14.u$$j
                                @Override // java.lang.Runnable
                                public final void run() {
                                    final com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17364x9169f957 activityC17364x9169f9573 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17364x9169f957.this;
                                    final al5.u4 u4Var = g17;
                                    java.lang.String str3 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17364x9169f957.f241609s;
                                    activityC17364x9169f9573.getClass();
                                    try {
                                        com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
                                        java.io.File a17 = p55.b.a(new java.io.File(lp0.b.h0("packed-logs").o()));
                                        if (a17 != null) {
                                            final com.p314xaae8f345.mm.vfs.r6 j17 = com.p314xaae8f345.mm.vfs.r6.j(a17);
                                            ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: o14.u$$k
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    java.lang.String str4 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17364x9169f957.f241609s;
                                                    com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17364x9169f957 activityC17364x9169f9574 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17364x9169f957.this;
                                                    android.net.Uri b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.b(activityC17364x9169f9574.mo55332x76847179(), j17);
                                                    android.content.Intent intent = new android.content.Intent("android.intent.action.SEND");
                                                    intent.setType("application/zip");
                                                    intent.addFlags(1);
                                                    intent.putExtra("android.intent.extra.STREAM", b17);
                                                    android.content.Intent createChooser = android.content.Intent.createChooser(intent, activityC17364x9169f9574.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o3_));
                                                    java.util.ArrayList arrayList = new java.util.ArrayList();
                                                    arrayList.add(createChooser);
                                                    java.util.Collections.reverse(arrayList);
                                                    yj0.a.d(activityC17364x9169f9574, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/fixtools/FixToolsUplogUI", "lambda$forwardLogs$3", "(Lcom/tencent/mm/vfs/VFSFile;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                                    activityC17364x9169f9574.startActivity((android.content.Intent) arrayList.get(0));
                                                    yj0.a.f(activityC17364x9169f9574, "com/tencent/mm/plugin/setting/ui/fixtools/FixToolsUplogUI", "lambda$forwardLogs$3", "(Lcom/tencent/mm/vfs/VFSFile;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                                }
                                            });
                                        }
                                        ku5.u0 u0Var = ku5.t0.f394148d;
                                        java.util.Objects.requireNonNull(u4Var);
                                        ((ku5.t0) u0Var).B(new java.lang.Runnable() { // from class: o14.u$$l
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                al5.u4.this.dismiss();
                                            }
                                        });
                                    } catch (java.lang.Throwable th6) {
                                        ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: o14.u$$b
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                java.lang.String str4 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17364x9169f957.f241609s;
                                                final com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17364x9169f957 activityC17364x9169f9574 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17364x9169f957.this;
                                                activityC17364x9169f9574.getClass();
                                                al5.t4 t4Var2 = u4Var.f87592d;
                                                t4Var2.f87575e = activityC17364x9169f9574.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573653o35);
                                                t4Var2.f(false);
                                                t4Var2.b(false);
                                                t4Var2.e(com.p314xaae8f345.mm.R.raw.f81445xd56bca2);
                                                t4Var2.a(activityC17364x9169f9574.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o3c));
                                                final java.lang.Throwable th7 = th6;
                                                t4Var2.f87571a.f87547b = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.g() { // from class: o14.u$$c
                                                    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.g
                                                    public final void a() {
                                                        java.lang.String str5 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17364x9169f957.f241609s;
                                                        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17364x9169f957.this.a7(th7);
                                                    }
                                                };
                                                t4Var2.i();
                                            }
                                        });
                                    }
                                }
                            });
                            return;
                        }
                        if (menuItem2.getItemId() == 1) {
                            if (android.os.Build.VERSION.SDK_INT < 29) {
                                ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                                if (!j35.u.d(activityC17364x9169f9572, "android.permission.WRITE_EXTERNAL_STORAGE", true)) {
                                    j35.u.i(activityC17364x9169f9572, "android.permission.WRITE_EXTERNAL_STORAGE", 32);
                                    z17 = false;
                                }
                            }
                            if (z17) {
                                activityC17364x9169f9572.b7();
                            }
                        }
                    }
                };
                k0Var.v();
                return true;
            }
        });
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        setResult(i18);
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getExtras() == null || !getIntent().getExtras().getBoolean("MMWizardActivity.WIZARD_ROOT_KILLSELF", false)) {
            int intExtra = getIntent().getIntExtra("entry_fix_tools_uplog", 5);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.mo68477x336bdfd8(873L, intExtra, 1L, false);
            g0Var.mo68477x336bdfd8(873L, 8L, 1L, false);
            mo43517x10010bd5();
            if (k14.n.a().f384894a) {
                m78751x5dc77fb5(new android.content.Intent(mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17363xb7882d32.class));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (i17 != 32) {
            super.onRequestPermissionsResult(i17, strArr, iArr);
            return;
        }
        if (iArr.length > 0 && iArr[0] == 0) {
            b7();
            return;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        int i18 = al5.u4.f87591t;
        al5.t4 t4Var = new al5.t4(mo55332x76847179);
        t4Var.f87575e = getString(com.p314xaae8f345.mm.R.C30867xcad56011.o3b);
        t4Var.b(false);
        t4Var.e(com.p314xaae8f345.mm.R.raw.f81445xd56bca2);
        t4Var.g();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (k14.n.a().f384894a) {
            finish();
        }
    }
}
