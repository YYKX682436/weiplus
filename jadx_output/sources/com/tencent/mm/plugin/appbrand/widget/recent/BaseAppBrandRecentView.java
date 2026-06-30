package com.tencent.mm.plugin.appbrand.widget.recent;

/* loaded from: classes7.dex */
public abstract class BaseAppBrandRecentView extends com.tencent.mm.plugin.appbrand.widget.recent.AppBrandRecentView implements l75.q0 {

    /* renamed from: d2, reason: collision with root package name */
    public android.content.Context f91906d2;

    /* renamed from: e2, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.recent.h0 f91907e2;

    /* renamed from: f2, reason: collision with root package name */
    public java.util.List f91908f2;

    /* renamed from: g2, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.recent.m1 f91909g2;

    /* renamed from: h2, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.recent.l2 f91910h2;

    /* renamed from: i2, reason: collision with root package name */
    public boolean f91911i2;

    /* renamed from: j2, reason: collision with root package name */
    public final java.util.List f91912j2;

    /* renamed from: k2, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.recent.l0 f91913k2;

    /* renamed from: l2, reason: collision with root package name */
    public final java.lang.Object f91914l2;

    /* renamed from: m2, reason: collision with root package name */
    public boolean f91915m2;

    /* renamed from: n2, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f91916n2;

    /* renamed from: o2, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f91917o2;

    /* renamed from: p2, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.recent.i0 f91918p2;

    /* renamed from: q2, reason: collision with root package name */
    public float f91919q2;

    /* renamed from: r2, reason: collision with root package name */
    public float f91920r2;

    /* renamed from: s2, reason: collision with root package name */
    public boolean f91921s2;

    public BaseAppBrandRecentView(android.content.Context context) {
        super(context);
        this.f91908f2 = new java.util.ArrayList();
        this.f91910h2 = null;
        this.f91911i2 = false;
        this.f91912j2 = new java.util.ArrayList();
        this.f91914l2 = new java.lang.Object();
        this.f91915m2 = false;
        this.f91916n2 = null;
        this.f91917o2 = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f91918p2 = new com.tencent.mm.plugin.appbrand.widget.recent.k1(this);
        this.f91921s2 = false;
        i1(context);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i17) {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f91919q2 = motionEvent.getRawX();
            this.f91920r2 = motionEvent.getRawY();
        } else if (motionEvent.getAction() == 2 && this.f91921s2) {
            return true;
        }
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.f91921s2 = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.recent.AppBrandRecentView
    public void g1() {
        if (this.f91916n2 == null) {
            this.f91916n2 = new com.tencent.mm.sdk.platformtools.n3("UpdateAppBrandList_" + this.f91913k2);
        }
        synchronized (this.f91914l2) {
            if (this.f91915m2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BaseAppBrandRecentView", "refresh is running and delay mType: %s", this.f91913k2);
                if (this.f91917o2.size() <= 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BaseAppBrandRecentView", "refresh add updateTask");
                    this.f91917o2.add(new com.tencent.mm.plugin.appbrand.widget.recent.r1(this, true));
                }
            } else {
                this.f91915m2 = true;
                this.f91916n2.postToWorker(new com.tencent.mm.plugin.appbrand.widget.recent.r1(this, true));
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.recent.AppBrandRecentView, androidx.recyclerview.widget.RecyclerView
    public androidx.recyclerview.widget.f2 getAdapter() {
        return this.f91909g2;
    }

    public int getCompletelyCountPerPage() {
        return 4;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.recent.AppBrandRecentView
    public int getCount() {
        return this.f91908f2.size();
    }

    public int getCurrentPage() {
        com.tencent.mm.plugin.appbrand.widget.recent.l2 l2Var = this.f91910h2;
        if (l2Var != null) {
            return l2Var.f92004i;
        }
        return 0;
    }

    public int getCustomItemCount() {
        return 0;
    }

    public int getDataCount() {
        java.util.List list = this.f91908f2;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public int getItemWidth() {
        return 0;
    }

    public abstract int getLayoutId();

    public abstract int getLoadCount();

    public com.tencent.mm.plugin.appbrand.widget.recent.j0 getOnDataChangedListener() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.recent.AppBrandRecentView
    public com.tencent.mm.plugin.appbrand.widget.recent.h0 getOnItemClickListener() {
        return this.f91907e2;
    }

    public java.util.List<com.tencent.mm.plugin.appbrand.widget.recent.x> getPreviewItemList() {
        if (this.f91908f2 == null) {
            this.f91908f2 = new java.util.ArrayList();
        }
        return this.f91908f2;
    }

    public abstract int getShowCount();

    public float getShowCountPerPage() {
        return 4.0f;
    }

    public abstract java.lang.String getType();

    public final java.lang.String h1(java.lang.String str) {
        if (str != null) {
            try {
                if (com.tencent.mm.ui.tools.v4.f(str) <= 11) {
                    return str;
                }
                int i17 = 0;
                int i18 = 0;
                for (char c17 : str.toCharArray()) {
                    i17 += com.tencent.mm.ui.tools.v4.f(c17 + "");
                    if (i17 >= 11) {
                        return str.substring(0, i18) + (char) 8230;
                    }
                    i18++;
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return str;
    }

    public void i1(android.content.Context context) {
        this.f91906d2 = context;
        context.getResources().getDimension(com.tencent.mm.R.dimen.f479629b4);
        com.tencent.mm.plugin.appbrand.widget.recent.l1 l1Var = new com.tencent.mm.plugin.appbrand.widget.recent.l1(this, this.f91906d2);
        l1Var.Q(0);
        setLayoutManager(l1Var);
        setHasFixedSize(true);
        com.tencent.mm.plugin.appbrand.widget.recent.m1 m1Var = new com.tencent.mm.plugin.appbrand.widget.recent.m1(this, null);
        this.f91909g2 = m1Var;
        setAdapter(m1Var);
        com.tencent.mm.plugin.appbrand.widget.recent.l2 l2Var = new com.tencent.mm.plugin.appbrand.widget.recent.l2(getCustomItemCount());
        this.f91910h2 = l2Var;
        getContext();
        int completelyCountPerPage = getCompletelyCountPerPage();
        l2Var.f91999d = this;
        l2Var.f92005m = completelyCountPerPage;
        V0(l2Var);
        l2Var.f91999d.i(l2Var);
        l2Var.f92009q = (androidx.recyclerview.widget.LinearLayoutManager) l2Var.f91999d.getLayoutManager();
        l2Var.f92002g = new com.tencent.mm.plugin.appbrand.widget.recent.i2(l2Var, l2Var.f91999d.getContext());
        l2Var.f92003h = new com.tencent.mm.plugin.appbrand.widget.recent.j2(l2Var, l2Var.f91999d.getContext());
    }

    public void j1(com.tencent.mm.plugin.appbrand.widget.recent.p1 p1Var, com.tencent.mm.plugin.appbrand.widget.recent.x xVar, int i17) {
        com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo;
        int itemWidth = getItemWidth();
        float showCountPerPage = getShowCountPerPage();
        if (itemWidth <= 0) {
            itemWidth = (int) (getWidth() / showCountPerPage);
        }
        if (itemWidth <= 0) {
            itemWidth = (int) (getResources().getDisplayMetrics().widthPixels / showCountPerPage);
        }
        if (i17 == this.f91909g2.getItemCount() - 1) {
            double d17 = itemWidth;
            double d18 = showCountPerPage;
            itemWidth = (int) (d17 * (1.0d - (java.lang.Math.ceil(d18) - d18)));
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseAppBrandRecentView", "lastPosition %d set width %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(itemWidth));
        }
        p1Var.f92032g.getLayoutParams().width = itemWidth;
        android.view.View view = p1Var.f92032g;
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        if (xVar == null || xVar.f92085b != 1 || (localUsageInfo = xVar.f92084a) == null) {
            return;
        }
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(localUsageInfo.f76367m);
        android.widget.TextView textView = p1Var.f92031f;
        if (!K0) {
            textView.setText(h1(localUsageInfo.f76367m));
            textView.setVisibility(0);
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(localUsageInfo.f76365h)) {
            textView.setText(h1(localUsageInfo.f76365h));
            textView.setVisibility(0);
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(localUsageInfo.f76361d)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BaseAppBrandRecentView", "[onBindCustomViewHolder] nickname is null! username:%s appId:%s", localUsageInfo.f76361d, localUsageInfo.f76362e);
            textView.setText("");
            textView.setVisibility(4);
        } else {
            textView.setText(localUsageInfo.f76361d);
            textView.setVisibility(0);
        }
        p1Var.f92030e.setVisibility(0);
        boolean K02 = com.tencent.mm.sdk.platformtools.t8.K0(localUsageInfo.f76368n);
        android.widget.ImageView imageView = p1Var.f92029d;
        if (K02) {
            imageView.setImageDrawable(l01.a.h());
        } else {
            l01.d0.f314761a.b(imageView, localUsageInfo.f76368n, l01.a.h(), l01.q0.f314787d);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        getMeasuredWidth();
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseAppBrandRecentView", "[onNotifyChange] process:%s eventId:%s, mType: %s", ((km0.c) gm0.j1.p().a()).toString(), java.lang.Integer.valueOf(w0Var.f316974b), this.f91913k2);
        int i17 = w0Var.f316974b;
        g1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean r0(int i17, int i18) {
        com.tencent.mm.plugin.appbrand.widget.recent.l2 l2Var = this.f91910h2;
        int b17 = l2Var.b(l2Var.f92000e + i17);
        com.tencent.mm.plugin.appbrand.widget.recent.BaseAppBrandRecentView baseAppBrandRecentView = l2Var.f91999d;
        if (baseAppBrandRecentView != null && l2Var.f92014v) {
            l2Var.f92003h.f12049a = b17;
            l2Var.f92015w = true;
            baseAppBrandRecentView.getLayoutManager().startSmoothScroll(l2Var.f92003h);
        }
        return super.r0(i17, i18);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.recent.AppBrandRecentView
    public void setDataQuery(com.tencent.mm.plugin.appbrand.widget.recent.i0 i0Var) {
        this.f91918p2 = i0Var;
    }

    public void setEnableDataCache(boolean z17) {
        this.f91911i2 = z17;
    }

    public void setOnDataChangedListener(com.tencent.mm.plugin.appbrand.widget.recent.j0 j0Var) {
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.recent.AppBrandRecentView
    public void setOnItemClickListener(com.tencent.mm.plugin.appbrand.widget.recent.h0 h0Var) {
        this.f91907e2 = h0Var;
    }

    public void setOnScrollPageListener(com.tencent.mm.plugin.appbrand.widget.recent.k2 k2Var) {
        com.tencent.mm.plugin.appbrand.widget.recent.l2 l2Var = this.f91910h2;
        if (l2Var != null) {
            l2Var.getClass();
        }
    }

    public void setType(com.tencent.mm.plugin.appbrand.widget.recent.l0 l0Var) {
        this.f91913k2 = l0Var;
        if (l0Var == com.tencent.mm.plugin.appbrand.widget.recent.l0.MY_APP_BRAND) {
            if (i95.n0.c(com.tencent.mm.plugin.appbrand.appusage.z5.class) != null) {
                ((com.tencent.mm.plugin.appbrand.appusage.z5) i95.n0.c(com.tencent.mm.plugin.appbrand.appusage.z5.class)).add(this);
            }
        } else {
            if (l0Var != com.tencent.mm.plugin.appbrand.widget.recent.l0.RECENT_APP_BRAND || i95.n0.c(com.tencent.mm.plugin.appbrand.appusage.b6.class) == null) {
                return;
            }
            ((com.tencent.mm.plugin.appbrand.appusage.b6) i95.n0.c(com.tencent.mm.plugin.appbrand.appusage.b6.class)).add(this);
        }
    }

    public BaseAppBrandRecentView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f91908f2 = new java.util.ArrayList();
        this.f91910h2 = null;
        this.f91911i2 = false;
        this.f91912j2 = new java.util.ArrayList();
        this.f91914l2 = new java.lang.Object();
        this.f91915m2 = false;
        this.f91916n2 = null;
        this.f91917o2 = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f91918p2 = new com.tencent.mm.plugin.appbrand.widget.recent.k1(this);
        this.f91921s2 = false;
        i1(context);
    }
}
