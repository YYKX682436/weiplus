package com.tencent.mm.plugin.downloader_app.ui;

/* loaded from: classes8.dex */
public class TaskItemView extends android.widget.LinearLayout implements xn5.a0 {
    public static final /* synthetic */ int H = 0;
    public android.widget.TextView A;
    public com.tencent.mm.plugin.downloader_app.model.r0 B;
    public boolean C;
    public r02.m0 D;
    public s02.i E;
    public boolean F;
    public android.graphics.Rect G;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f97397d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.downloader_app.ui.AppIconView f97398e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f97399f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f97400g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f97401h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.FrameLayout f97402i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.downloader_app.ui.ProgressImageView f97403m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.FrameLayout f97404n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.Button f97405o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.Button f97406p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.downloader_app.ui.DownloadUpdateDescView f97407q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.LinearLayout f97408r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ImageView f97409s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f97410t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f97411u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f97412v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f97413w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f97414x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f97415y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f97416z;

    public TaskItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.C = false;
        this.E = null;
        this.F = false;
    }

    private long getFileSize() {
        h02.a d17 = com.tencent.mm.plugin.downloader.model.m0.d(this.B.f97317f);
        if (d17 != null) {
            long j17 = d17.field_fileSize;
            if (j17 > 0) {
                return j17;
            }
        }
        return this.B.f97324m.f225278f;
    }

    private void setButtonText(int i17) {
        if (i17 == com.tencent.mm.R.string.g1c) {
            this.f97405o.setVisibility(8);
            this.f97406p.setVisibility(0);
        } else {
            this.f97406p.setVisibility(8);
            this.f97405o.setVisibility(0);
            this.f97405o.setText(i17);
        }
        this.f97404n.setVisibility(0);
    }

    private void setTaskSize(long j17) {
        b(j17, false);
    }

    public void a(boolean z17) {
        s02.i iVar = this.E;
        if (iVar != null) {
            iVar.dismiss();
            this.E = null;
            com.tencent.mm.plugin.downloader_app.model.r0 r0Var = this.B;
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskItemView", "dismissDownloadTipBubble appName = %s , appid = %s ,  detached = %b", r0Var.f97318g, r0Var.f97317f, java.lang.Boolean.valueOf(z17));
            if (z17) {
                this.F = false;
            }
        }
    }

    public final void b(long j17, boolean z17) {
        long fileSize = getFileSize();
        float f17 = (float) fileSize;
        float f18 = f17 / 1.0737418E9f;
        float f19 = f17 / 1048576.0f;
        if (j17 >= fileSize) {
            if (f18 >= 1.0f) {
                this.f97401h.setText(java.lang.String.format("%.1fGB", java.lang.Float.valueOf(f18)));
                return;
            } else {
                this.f97401h.setText(java.lang.String.format("%.1fMB", java.lang.Float.valueOf(f19)));
                return;
            }
        }
        this.f97401h.setText(java.lang.String.format("%.1fMB / %.1fMB", java.lang.Float.valueOf(((float) j17) / 1048576.0f), java.lang.Float.valueOf(f19)));
        if (z17) {
            this.f97403m.setProgress((int) ((j17 * 100) / fileSize));
        }
    }

    public final void c() {
        int i17;
        java.lang.String str = this.B.f97317f;
        this.f97404n.setVisibility(8);
        h02.a d17 = com.tencent.mm.plugin.downloader.model.m0.d(this.B.f97317f);
        if (d17 == null || (i17 = d17.field_status) == 5) {
            setTaskSize(getFileSize());
            this.f97402i.setVisibility(8);
            setButtonText(com.tencent.mm.R.string.bqh);
            return;
        }
        boolean z17 = false;
        if (i17 == 3) {
            this.f97402i.setVisibility(8);
            setButtonText(com.tencent.mm.R.string.g1c);
            a(false);
        } else if (i17 == 6) {
            this.f97402i.setVisibility(8);
            if (((java.util.HashSet) com.tencent.mm.plugin.downloader.model.n0.f97088a).contains(java.lang.Long.valueOf(d17.field_downloadId))) {
                setButtonText(com.tencent.mm.R.string.gtk);
            } else {
                setButtonText(com.tencent.mm.R.string.g1c);
            }
            a(false);
        } else {
            this.f97402i.setVisibility(0);
            if (this.C) {
                com.tencent.mm.plugin.downloader_app.ui.ProgressImageView progressImageView = this.f97403m;
                progressImageView.f97392h = true;
                if (com.tencent.mm.ui.bk.C()) {
                    progressImageView.setImageResource(com.tencent.mm.R.drawable.avt);
                } else {
                    progressImageView.setImageResource(com.tencent.mm.R.drawable.avu);
                }
            } else {
                if (d17.field_status == 1) {
                    this.C = false;
                    this.f97403m.setProgressColor(com.tencent.mm.R.color.f478502m);
                    this.f97403m.setImageResource(com.tencent.mm.R.raw.downloading);
                    if (this.F) {
                        this.f97403m.post(new java.lang.Runnable() { // from class: r02.a0$$a
                            @Override // java.lang.Runnable
                            public final void run() {
                                s02.i iVar;
                                int i18 = com.tencent.mm.plugin.downloader_app.ui.TaskItemView.H;
                                com.tencent.mm.plugin.downloader_app.ui.TaskItemView taskItemView = com.tencent.mm.plugin.downloader_app.ui.TaskItemView.this;
                                taskItemView.getClass();
                                android.graphics.Rect rect = new android.graphics.Rect();
                                taskItemView.f97403m.getGlobalVisibleRect(rect);
                                if (rect.equals(taskItemView.G) || (iVar = taskItemView.E) == null) {
                                    return;
                                }
                                iVar.a(taskItemView.f97403m);
                            }
                        });
                    } else {
                        if (this.E == null) {
                            this.E = new s02.i(getContext());
                        }
                        this.f97403m.post(new r02.k0(this));
                        o02.a.b(18, 1801, 1, 1, this.B.f97317f, "", "");
                    }
                } else if (d17.field_reserveInWifi && !com.tencent.mars.comm.NetStatusUtil.isWifi(getContext())) {
                    this.f97402i.setVisibility(0);
                    this.f97403m.setProgressColor(com.tencent.mm.R.color.FG_1);
                    com.tencent.mm.plugin.downloader_app.ui.ProgressImageView progressImageView2 = this.f97403m;
                    progressImageView2.f97392h = false;
                    progressImageView2.setImageResource("download_wait_wifi");
                } else if (d17.field_status == 4) {
                    this.f97402i.setVisibility(8);
                    setButtonText(com.tencent.mm.R.string.f491070bs4);
                    a(false);
                } else {
                    this.f97403m.setProgressColor(com.tencent.mm.R.color.FG_1);
                    this.f97403m.setImageResource("download_app_pause");
                    a(false);
                }
                z17 = true;
            }
        }
        b(d17.field_downloadedSize, z17);
    }

    public int getIconPaddingLeft() {
        return this.f97397d.getVisibility() == 0 ? (getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv) * 2) + getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480247sg) : getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv) * 2;
    }

    public int getNamePaddingLeft() {
        return this.f97397d.getVisibility() == 0 ? getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480248sh) : getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480246sf);
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
        this.f97397d = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.bsc);
        this.f97398e = (com.tencent.mm.plugin.downloader_app.ui.AppIconView) findViewById(com.tencent.mm.R.id.h5n);
        this.f97399f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.hiq);
        this.f97400g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.hir);
        this.f97401h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.hjf);
        this.f97402i = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.lbn);
        com.tencent.mm.plugin.downloader_app.ui.ProgressImageView progressImageView = (com.tencent.mm.plugin.downloader_app.ui.ProgressImageView) findViewById(com.tencent.mm.R.id.nyx);
        this.f97403m = progressImageView;
        progressImageView.setOnClickListener(new r02.d0(this));
        this.f97404n = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.f483527b41);
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.kil);
        this.f97405o = button;
        button.setOnClickListener(new r02.e0(this));
        android.widget.Button button2 = (android.widget.Button) findViewById(com.tencent.mm.R.id.hdz);
        this.f97406p = button2;
        button2.setOnClickListener(new r02.f0(this));
        this.f97407q = (com.tencent.mm.plugin.downloader_app.ui.DownloadUpdateDescView) findViewById(com.tencent.mm.R.id.f487506ot5);
        this.f97408r = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.d2q);
        this.f97409s = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.d2s);
        this.f97410t = (android.widget.TextView) findViewById(com.tencent.mm.R.id.d2r);
        this.f97408r.setOnClickListener(new r02.g0(this));
        this.f97411u = findViewById(com.tencent.mm.R.id.giv);
        this.f97412v = (android.widget.TextView) findViewById(com.tencent.mm.R.id.gkx);
        this.f97413w = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485131go0);
        this.f97414x = (android.widget.TextView) findViewById(com.tencent.mm.R.id.gpg);
        this.f97415y = (android.widget.TextView) findViewById(com.tencent.mm.R.id.l5k);
        this.f97416z = (android.widget.TextView) findViewById(com.tencent.mm.R.id.l5w);
        this.A = (android.widget.TextView) findViewById(com.tencent.mm.R.id.qeu);
    }

    public void setData(com.tencent.mm.plugin.downloader_app.model.r0 r0Var) {
        int i17;
        this.B = r0Var;
        if (r0Var == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        this.f97402i.setVisibility(8);
        this.f97404n.setVisibility(8);
        this.f97407q.setVisibility(8);
        this.f97408r.setVisibility(8);
        n11.a.b().g(this.B.f97319h, this.f97398e);
        this.f97399f.setText(this.B.f97318g);
        h02.a d17 = com.tencent.mm.plugin.downloader.model.m0.d(this.B.f97317f);
        if (d17 == null || !d17.field_autoDownload) {
            this.f97400g.setVisibility(8);
        } else {
            this.f97400g.setVisibility(0);
        }
        if (this.B.f97312a) {
            if (this.f97397d.getVisibility() != 0) {
                this.f97397d.setVisibility(0);
                this.f97397d.startAnimation(android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477868dr));
            }
            setSelected(this.B.f97313b);
            setTaskSize(getFileSize());
            android.view.View view = this.f97411u;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/downloader_app/ui/TaskItemView", "setData", "(Lcom/tencent/mm/plugin/downloader_app/model/TaskInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/downloader_app/ui/TaskItemView", "setData", "(Lcom/tencent/mm/plugin/downloader_app/model/TaskInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            a(false);
            return;
        }
        this.f97397d.setVisibility(8);
        if (this.B.f97326o != null) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f97408r.getLayoutParams();
            if (this.B.f97312a) {
                layoutParams.leftMargin = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480248sh);
            } else {
                layoutParams.leftMargin = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480246sf);
            }
            this.f97408r.setLayoutParams(layoutParams);
            this.f97408r.setVisibility(0);
            n11.a.b().g(this.B.f97326o.f225272d, this.f97409s);
            d02.r rVar = this.B.f97326o.f225273e;
            if (rVar != null) {
                this.f97410t.setText(rVar.f225358e);
            }
            com.tencent.mm.plugin.downloader_app.model.r0 r0Var2 = this.B;
            if (!r0Var2.f97316e) {
                r0Var2.f97316e = true;
                o02.a.b(10, 1006, r0Var2.f97315d, 1, r0Var2.f97317f, "", "");
            }
        } else {
            this.f97408r.setVisibility(8);
        }
        setTaskSize(getFileSize());
        this.f97407q.setVisibility(8);
        com.tencent.mm.plugin.downloader_app.model.r0 r0Var3 = this.B;
        int i18 = r0Var3.f97314c;
        if (i18 == 4) {
            h02.a d18 = com.tencent.mm.plugin.downloader.model.m0.d(r0Var3.f97317f);
            if (d18 == null || (i17 = d18.field_status) == 0 || i17 == 5) {
                this.f97402i.setVisibility(8);
                setButtonText(com.tencent.mm.R.string.k3g);
                this.f97407q.setData(this.B);
            } else {
                c();
            }
        } else if (i18 == 6) {
            this.f97402i.setVisibility(8);
            setButtonText(com.tencent.mm.R.string.gax);
        } else {
            c();
        }
        if (this.B.f97324m == null) {
            android.view.View view2 = this.f97411u;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/downloader_app/ui/TaskItemView", "initBrandInfo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/downloader_app/ui/TaskItemView", "initBrandInfo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view3 = this.f97411u;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/downloader_app/ui/TaskItemView", "initBrandInfo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/downloader_app/ui/TaskItemView", "initBrandInfo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f97412v.setText(getResources().getString(com.tencent.mm.R.string.f490372t5) + this.B.f97324m.f225291v);
        this.f97413w.setText(getResources().getString(com.tencent.mm.R.string.f490509x3) + this.B.f97324m.f225294y);
        this.f97414x.setText(this.B.f97318g + " " + this.B.f97324m.f225288s);
        this.f97415y.setOnClickListener(new r02.h0(this));
        this.A.setOnClickListener(new r02.i0(this));
        this.f97416z.setOnClickListener(new r02.j0(this));
    }

    public void setOnItemOpButtonClickListener(r02.m0 m0Var) {
        this.D = m0Var;
    }

    @Override // android.view.View
    public void setSelected(boolean z17) {
        com.tencent.mm.plugin.downloader_app.model.r0 r0Var = this.B;
        java.lang.String str = r0Var.f97317f;
        r0Var.f97313b = z17;
        if (z17) {
            l02.n.a(this.f97397d, "checkbox_cell_on");
        } else {
            l02.n.a(this.f97397d, "checkbox_cell_off");
        }
        for (android.view.ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof com.tencent.mm.plugin.downloader_app.ui.TaskListView) {
                com.tencent.mm.plugin.downloader_app.ui.TaskListView taskListView = (com.tencent.mm.plugin.downloader_app.ui.TaskListView) parent;
                java.util.Iterator it = taskListView.f97418f2.f368324d.iterator();
                boolean z18 = true;
                boolean z19 = false;
                while (it.hasNext()) {
                    com.tencent.mm.plugin.downloader_app.model.r0 r0Var2 = (com.tencent.mm.plugin.downloader_app.model.r0) it.next();
                    int i17 = r0Var2.f97314c;
                    if (i17 == 2 || i17 == 4 || i17 == 6) {
                        if (r0Var2.f97313b) {
                            z19 = true;
                        } else {
                            z18 = false;
                        }
                    }
                }
                com.tencent.mm.plugin.downloader_app.model.x.b(z19);
                if (!z18) {
                    com.tencent.mm.plugin.downloader_app.ui.DeleteTaskFooterView deleteTaskFooterView = ((com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI) taskListView.getContext()).f97373e;
                    deleteTaskFooterView.f97369m = false;
                    l02.n.a(deleteTaskFooterView.f97364e, "checkbox_cell_off");
                    return;
                } else {
                    if (taskListView.getContext() instanceof com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI) {
                        com.tencent.mm.plugin.downloader_app.ui.DeleteTaskFooterView deleteTaskFooterView2 = ((com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI) taskListView.getContext()).f97373e;
                        deleteTaskFooterView2.f97369m = true;
                        l02.n.a(deleteTaskFooterView2.f97364e, "checkbox_cell_on");
                        return;
                    }
                    return;
                }
            }
        }
    }
}
