package com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui;

/* renamed from: com.tencent.mm.plugin.downloader_app.ui.TaskItemView */
/* loaded from: classes8.dex */
public class C13249xf095011d extends android.widget.LinearLayout implements xn5.a0 {
    public static final /* synthetic */ int H = 0;
    public android.widget.TextView A;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0 B;
    public boolean C;
    public r02.m0 D;
    public s02.i E;
    public boolean F;
    public android.graphics.Rect G;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f178930d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13239x6402dbdf f178931e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f178932f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f178933g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f178934h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.FrameLayout f178935i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13247xa0adf2d3 f178936m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.FrameLayout f178937n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.Button f178938o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.Button f178939p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13244xeb3e7387 f178940q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.LinearLayout f178941r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ImageView f178942s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f178943t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f178944u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f178945v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f178946w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f178947x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f178948y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f178949z;

    public C13249xf095011d(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.C = false;
        this.E = null;
        this.F = false;
    }

    /* renamed from: getFileSize */
    private long m54720x50026913() {
        h02.a d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.d(this.B.f178850f);
        if (d17 != null) {
            long j17 = d17.f68420xf1eb3542;
            if (j17 > 0) {
                return j17;
            }
        }
        return this.B.f178857m.f306811f;
    }

    /* renamed from: setButtonText */
    private void m54721x31c3fd81(int i17) {
        if (i17 == com.p314xaae8f345.mm.R.C30867xcad56011.g1c) {
            this.f178938o.setVisibility(8);
            this.f178939p.setVisibility(0);
        } else {
            this.f178939p.setVisibility(8);
            this.f178938o.setVisibility(0);
            this.f178938o.setText(i17);
        }
        this.f178937n.setVisibility(0);
    }

    /* renamed from: setTaskSize */
    private void m54722x5e1fdda8(long j17) {
        b(j17, false);
    }

    public void a(boolean z17) {
        s02.i iVar = this.E;
        if (iVar != null) {
            iVar.dismiss();
            this.E = null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0 r0Var = this.B;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskItemView", "dismissDownloadTipBubble appName = %s , appid = %s ,  detached = %b", r0Var.f178851g, r0Var.f178850f, java.lang.Boolean.valueOf(z17));
            if (z17) {
                this.F = false;
            }
        }
    }

    public final void b(long j17, boolean z17) {
        long m54720x50026913 = m54720x50026913();
        float f17 = (float) m54720x50026913;
        float f18 = f17 / 1.0737418E9f;
        float f19 = f17 / 1048576.0f;
        if (j17 >= m54720x50026913) {
            if (f18 >= 1.0f) {
                this.f178934h.setText(java.lang.String.format("%.1fGB", java.lang.Float.valueOf(f18)));
                return;
            } else {
                this.f178934h.setText(java.lang.String.format("%.1fMB", java.lang.Float.valueOf(f19)));
                return;
            }
        }
        this.f178934h.setText(java.lang.String.format("%.1fMB / %.1fMB", java.lang.Float.valueOf(((float) j17) / 1048576.0f), java.lang.Float.valueOf(f19)));
        if (z17) {
            this.f178936m.m54718x3ae760af((int) ((j17 * 100) / m54720x50026913));
        }
    }

    public final void c() {
        int i17;
        java.lang.String str = this.B.f178850f;
        this.f178937n.setVisibility(8);
        h02.a d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.d(this.B.f178850f);
        if (d17 == null || (i17 = d17.f68441x10a0fed7) == 5) {
            m54722x5e1fdda8(m54720x50026913());
            this.f178935i.setVisibility(8);
            m54721x31c3fd81(com.p314xaae8f345.mm.R.C30867xcad56011.bqh);
            return;
        }
        boolean z17 = false;
        if (i17 == 3) {
            this.f178935i.setVisibility(8);
            m54721x31c3fd81(com.p314xaae8f345.mm.R.C30867xcad56011.g1c);
            a(false);
        } else if (i17 == 6) {
            this.f178935i.setVisibility(8);
            if (((java.util.HashSet) com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.n0.f178621a).contains(java.lang.Long.valueOf(d17.f68408x32b20428))) {
                m54721x31c3fd81(com.p314xaae8f345.mm.R.C30867xcad56011.gtk);
            } else {
                m54721x31c3fd81(com.p314xaae8f345.mm.R.C30867xcad56011.g1c);
            }
            a(false);
        } else {
            this.f178935i.setVisibility(0);
            if (this.C) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13247xa0adf2d3 c13247xa0adf2d3 = this.f178936m;
                c13247xa0adf2d3.f178925h = true;
                if (com.p314xaae8f345.mm.ui.bk.C()) {
                    c13247xa0adf2d3.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.avt);
                } else {
                    c13247xa0adf2d3.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.avu);
                }
            } else {
                if (d17.f68441x10a0fed7 == 1) {
                    this.C = false;
                    this.f178936m.m54719x7d38f3f4(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m);
                    this.f178936m.setImageResource(com.p314xaae8f345.mm.R.raw.f79007xb7cfa25a);
                    if (this.F) {
                        this.f178936m.post(new java.lang.Runnable() { // from class: r02.a0$$a
                            @Override // java.lang.Runnable
                            public final void run() {
                                s02.i iVar;
                                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13249xf095011d.H;
                                com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13249xf095011d c13249xf095011d = com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13249xf095011d.this;
                                c13249xf095011d.getClass();
                                android.graphics.Rect rect = new android.graphics.Rect();
                                c13249xf095011d.f178936m.getGlobalVisibleRect(rect);
                                if (rect.equals(c13249xf095011d.G) || (iVar = c13249xf095011d.E) == null) {
                                    return;
                                }
                                iVar.a(c13249xf095011d.f178936m);
                            }
                        });
                    } else {
                        if (this.E == null) {
                            this.E = new s02.i(getContext());
                        }
                        this.f178936m.post(new r02.k0(this));
                        o02.a.b(18, 1801, 1, 1, this.B.f178850f, "", "");
                    }
                } else if (d17.f68431x4651c731 && !com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(getContext())) {
                    this.f178935i.setVisibility(0);
                    this.f178936m.m54719x7d38f3f4(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13247xa0adf2d3 c13247xa0adf2d32 = this.f178936m;
                    c13247xa0adf2d32.f178925h = false;
                    c13247xa0adf2d32.m54717x8d516947("download_wait_wifi");
                } else if (d17.f68441x10a0fed7 == 4) {
                    this.f178935i.setVisibility(8);
                    m54721x31c3fd81(com.p314xaae8f345.mm.R.C30867xcad56011.f572603bs4);
                    a(false);
                } else {
                    this.f178936m.m54719x7d38f3f4(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833);
                    this.f178936m.m54717x8d516947("download_app_pause");
                    a(false);
                }
                z17 = true;
            }
        }
        b(d17.f68413xf432b5ad, z17);
    }

    /* renamed from: getIconPaddingLeft */
    public int m54723xdb39c749() {
        return this.f178930d.getVisibility() == 0 ? (getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv) * 2) + getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561780sg) : getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv) * 2;
    }

    /* renamed from: getNamePaddingLeft */
    public int m54724xb68269f7() {
        return this.f178930d.getVisibility() == 0 ? getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561781sh) : getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561779sf);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a(true);
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f178930d = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.bsc);
        this.f178931e = (com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13239x6402dbdf) findViewById(com.p314xaae8f345.mm.R.id.h5n);
        this.f178932f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.hiq);
        this.f178933g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.hir);
        this.f178934h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.hjf);
        this.f178935i = (android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.lbn);
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13247xa0adf2d3 c13247xa0adf2d3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13247xa0adf2d3) findViewById(com.p314xaae8f345.mm.R.id.nyx);
        this.f178936m = c13247xa0adf2d3;
        c13247xa0adf2d3.setOnClickListener(new r02.d0(this));
        this.f178937n = (android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.f565060b41);
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.kil);
        this.f178938o = button;
        button.setOnClickListener(new r02.e0(this));
        android.widget.Button button2 = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.hdz);
        this.f178939p = button2;
        button2.setOnClickListener(new r02.f0(this));
        this.f178940q = (com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13244xeb3e7387) findViewById(com.p314xaae8f345.mm.R.id.f569039ot5);
        this.f178941r = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.d2q);
        this.f178942s = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.d2s);
        this.f178943t = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.d2r);
        this.f178941r.setOnClickListener(new r02.g0(this));
        this.f178944u = findViewById(com.p314xaae8f345.mm.R.id.giv);
        this.f178945v = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.gkx);
        this.f178946w = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f566664go0);
        this.f178947x = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.gpg);
        this.f178948y = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.l5k);
        this.f178949z = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.l5w);
        this.A = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.qeu);
    }

    /* renamed from: setData */
    public void m54725x76491f2c(com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0 r0Var) {
        int i17;
        this.B = r0Var;
        if (r0Var == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        this.f178935i.setVisibility(8);
        this.f178937n.setVisibility(8);
        this.f178940q.setVisibility(8);
        this.f178941r.setVisibility(8);
        n11.a.b().g(this.B.f178852h, this.f178931e);
        this.f178932f.setText(this.B.f178851g);
        h02.a d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.d(this.B.f178850f);
        if (d17 == null || !d17.f68405x56e99a7c) {
            this.f178933g.setVisibility(8);
        } else {
            this.f178933g.setVisibility(0);
        }
        if (this.B.f178845a) {
            if (this.f178930d.getVisibility() != 0) {
                this.f178930d.setVisibility(0);
                this.f178930d.startAnimation(android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559401dr));
            }
            setSelected(this.B.f178846b);
            m54722x5e1fdda8(m54720x50026913());
            android.view.View view = this.f178944u;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/downloader_app/ui/TaskItemView", "setData", "(Lcom/tencent/mm/plugin/downloader_app/model/TaskInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/downloader_app/ui/TaskItemView", "setData", "(Lcom/tencent/mm/plugin/downloader_app/model/TaskInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            a(false);
            return;
        }
        this.f178930d.setVisibility(8);
        if (this.B.f178859o != null) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f178941r.getLayoutParams();
            if (this.B.f178845a) {
                layoutParams.leftMargin = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561781sh);
            } else {
                layoutParams.leftMargin = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561779sf);
            }
            this.f178941r.setLayoutParams(layoutParams);
            this.f178941r.setVisibility(0);
            n11.a.b().g(this.B.f178859o.f306805d, this.f178942s);
            d02.r rVar = this.B.f178859o.f306806e;
            if (rVar != null) {
                this.f178943t.setText(rVar.f306891e);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0 r0Var2 = this.B;
            if (!r0Var2.f178849e) {
                r0Var2.f178849e = true;
                o02.a.b(10, 1006, r0Var2.f178848d, 1, r0Var2.f178850f, "", "");
            }
        } else {
            this.f178941r.setVisibility(8);
        }
        m54722x5e1fdda8(m54720x50026913());
        this.f178940q.setVisibility(8);
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0 r0Var3 = this.B;
        int i18 = r0Var3.f178847c;
        if (i18 == 4) {
            h02.a d18 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.d(r0Var3.f178850f);
            if (d18 == null || (i17 = d18.f68441x10a0fed7) == 0 || i17 == 5) {
                this.f178935i.setVisibility(8);
                m54721x31c3fd81(com.p314xaae8f345.mm.R.C30867xcad56011.k3g);
                this.f178940q.m54715x76491f2c(this.B);
            } else {
                c();
            }
        } else if (i18 == 6) {
            this.f178935i.setVisibility(8);
            m54721x31c3fd81(com.p314xaae8f345.mm.R.C30867xcad56011.gax);
        } else {
            c();
        }
        if (this.B.f178857m == null) {
            android.view.View view2 = this.f178944u;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/downloader_app/ui/TaskItemView", "initBrandInfo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/downloader_app/ui/TaskItemView", "initBrandInfo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view3 = this.f178944u;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/downloader_app/ui/TaskItemView", "initBrandInfo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/downloader_app/ui/TaskItemView", "initBrandInfo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f178945v.setText(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571905t5) + this.B.f178857m.f306824v);
        this.f178946w.setText(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572042x3) + this.B.f178857m.f306827y);
        this.f178947x.setText(this.B.f178851g + " " + this.B.f178857m.f306821s);
        this.f178948y.setOnClickListener(new r02.h0(this));
        this.A.setOnClickListener(new r02.i0(this));
        this.f178949z.setOnClickListener(new r02.j0(this));
    }

    /* renamed from: setOnItemOpButtonClickListener */
    public void m54726x26e1c75(r02.m0 m0Var) {
        this.D = m0Var;
    }

    @Override // android.view.View
    public void setSelected(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0 r0Var = this.B;
        java.lang.String str = r0Var.f178850f;
        r0Var.f178846b = z17;
        if (z17) {
            l02.n.a(this.f178930d, "checkbox_cell_on");
        } else {
            l02.n.a(this.f178930d, "checkbox_cell_off");
        }
        for (android.view.ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13250xfa9a7928) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13250xfa9a7928 c13250xfa9a7928 = (com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13250xfa9a7928) parent;
                java.util.Iterator it = c13250xfa9a7928.f178951f2.f449857d.iterator();
                boolean z18 = true;
                boolean z19 = false;
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0 r0Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0) it.next();
                    int i17 = r0Var2.f178847c;
                    if (i17 == 2 || i17 == 4 || i17 == 6) {
                        if (r0Var2.f178846b) {
                            z19 = true;
                        } else {
                            z18 = false;
                        }
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.x.b(z19);
                if (!z18) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13241xdbd8cf0 c13241xdbd8cf0 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.ActivityC13242xdf6880d5) c13250xfa9a7928.getContext()).f178906e;
                    c13241xdbd8cf0.f178902m = false;
                    l02.n.a(c13241xdbd8cf0.f178897e, "checkbox_cell_off");
                    return;
                } else {
                    if (c13250xfa9a7928.getContext() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.ActivityC13242xdf6880d5) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13241xdbd8cf0 c13241xdbd8cf02 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.ActivityC13242xdf6880d5) c13250xfa9a7928.getContext()).f178906e;
                        c13241xdbd8cf02.f178902m = true;
                        l02.n.a(c13241xdbd8cf02.f178897e, "checkbox_cell_on");
                        return;
                    }
                    return;
                }
            }
        }
    }
}
