package com.tencent.mm.plugin.appbrand.widget.recent;

/* loaded from: classes7.dex */
public class AppBrandTaskContainer extends com.tencent.mm.plugin.appbrand.widget.recent.AppBrandTaskView implements com.tencent.mm.plugin.appbrand.widget.recent.g1 {

    /* renamed from: x, reason: collision with root package name */
    public static final int f91884x = com.tencent.mm.plugin.appbrand.widget.recent.w.f92078e;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f91885e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.recent.AppBrandRecentTaskView f91886f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.recent.AppBrandCommonUsedTaskView f91887g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.recent.AppBrandCloseTaskView f91888h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ScrollView f91889i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.recent.h1 f91890m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.Rect f91891n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.Rect f91892o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Object f91893p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f91894q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f91895r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f91896s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f91897t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f91898u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f91899v;

    /* renamed from: w, reason: collision with root package name */
    public long f91900w;

    /* loaded from: classes4.dex */
    public static final class a implements com.tencent.mm.ipcinvoker.k0 {
        private a() {
        }

        @Override // com.tencent.mm.ipcinvoker.k0
        public java.lang.Object invoke(java.lang.Object obj) {
            android.os.Bundle bundle = (android.os.Bundle) obj;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTask.AppBrandTaskContainer", "invoke");
            int i17 = bundle.getInt("count");
            int i18 = bundle.getInt("versionType", Integer.MAX_VALUE);
            android.os.Parcel obtain = android.os.Parcel.obtain();
            try {
                obtain.writeTypedList(((com.tencent.mm.plugin.appbrand.appusage.z2) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appusage.z2.class)).z0(i17, 0, i18));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandTask.AppBrandTaskContainer", e17, "QueryRecentTask", new java.lang.Object[0]);
                obtain.setDataPosition(0);
                obtain.writeTypedList(null);
            }
            return obtain;
        }
    }

    public AppBrandTaskContainer(android.content.Context context) {
        super(context);
        this.f91891n = new android.graphics.Rect();
        this.f91892o = new android.graphics.Rect();
        this.f91893p = new java.lang.Object();
        this.f91894q = false;
        this.f91895r = null;
        this.f91896s = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f91897t = "";
        this.f91898u = "";
        this.f91899v = "";
        this.f91900w = 0L;
        d();
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.recent.AppBrandTaskView
    public void a() {
        android.view.ViewPropertyAnimator animate = this.f91885e.animate();
        this.f91885e.setScaleX(1.0f);
        this.f91885e.setScaleY(1.0f);
        android.view.View view = this.f91885e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/recent/AppBrandTaskContainer", "exitAnimation", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/recent/AppBrandTaskContainer", "exitAnimation", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        animate.scaleX(0.8f).scaleY(0.8f).alpha(0.0f).setInterpolator(new android.view.animation.DecelerateInterpolator()).setDuration(250L).setListener(new com.tencent.mm.plugin.appbrand.widget.recent.u0(this, animate)).start();
        android.view.ViewPropertyAnimator animate2 = animate();
        setAlpha(1.0f);
        animate2.alpha(0.0f).setInterpolator(new android.view.animation.DecelerateInterpolator()).setDuration(250L).setListener(new com.tencent.mm.plugin.appbrand.widget.recent.v0(this, animate2)).start();
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.recent.AppBrandTaskView
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTask.AppBrandTaskContainer", "refresh");
        if (this.f91895r == null) {
            this.f91895r = new com.tencent.mm.sdk.platformtools.n3("UpdateAppBrandTaskDataTask");
        }
        synchronized (this.f91893p) {
            if (this.f91894q) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTask.AppBrandTaskContainer", "refresh is running and delay");
                if (this.f91896s.isEmpty()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTask.AppBrandTaskContainer", "refresh add updateTask");
                    this.f91896s.add(new com.tencent.mm.plugin.appbrand.widget.recent.x0(this, true));
                }
            } else {
                this.f91894q = true;
                this.f91895r.postToWorker(new com.tencent.mm.plugin.appbrand.widget.recent.x0(this, true));
            }
        }
    }

    public final void c() {
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f91889i.getLayoutParams();
        layoutParams.width = com.tencent.mm.plugin.appbrand.widget.recent.d1.f91969a.a(getContext());
        layoutParams.height = (int) ((r1.a(getContext()) * 3) / 4.0f);
        this.f91889i.setLayoutParams(layoutParams);
    }

    public void d() {
        this.f91885e = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f488100dz0, (android.view.ViewGroup) null, false);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        addView(this.f91885e, layoutParams);
        setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.f478673ai5));
        this.f91886f = (com.tencent.mm.plugin.appbrand.widget.recent.AppBrandRecentTaskView) this.f91885e.findViewById(com.tencent.mm.R.id.f483207se5);
        this.f91887g = (com.tencent.mm.plugin.appbrand.widget.recent.AppBrandCommonUsedTaskView) this.f91885e.findViewById(com.tencent.mm.R.id.sdy);
        this.f91888h = (com.tencent.mm.plugin.appbrand.widget.recent.AppBrandCloseTaskView) this.f91885e.findViewById(com.tencent.mm.R.id.sdw);
        this.f91889i = (android.widget.ScrollView) this.f91885e.findViewById(com.tencent.mm.R.id.se8);
        if (getContext().getResources().getConfiguration().orientation == 2) {
            c();
        }
        setOnTouchListener(new com.tencent.mm.plugin.appbrand.widget.recent.r0(this));
        this.f91886f.setTaskContainer(this);
        this.f91887g.setTaskContainer(this);
        this.f91888h.setTaskContainer(this);
    }

    public void e(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTask.AppBrandTaskContainer", "reportAction action:%d, actionNode:%s", java.lang.Integer.valueOf(i17), str);
        com.tencent.mm.plugin.appbrand.widget.recent.e1.a(this.f91898u, this.f91897t, i17, str, str2, str3);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.recent.AppBrandTaskView
    public int getRecentCount() {
        return this.f91886f.getCount();
    }

    public int getRecentLoadCount() {
        return f91884x;
    }

    public int getRecentShowCount() {
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.wxapp_recent_use_new, 0) == 5) {
            return 8;
        }
        return com.tencent.mm.plugin.appbrand.widget.recent.y0.b() ? 4 : 6;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.recent.AppBrandTaskView
    public java.lang.String getTaskSessionId() {
        return this.f91897t;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.recent.AppBrandTaskView
    public com.tencent.mm.plugin.appbrand.widget.recent.h1 getTaskViewListener() {
        return this.f91890m;
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (getContext().getResources().getConfiguration().orientation == 2) {
            c();
            return;
        }
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f91889i.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        this.f91889i.setLayoutParams(layoutParams);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        this.f91889i.getGlobalVisibleRect(this.f91891n);
        this.f91888h.getGlobalVisibleRect(this.f91892o);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.recent.AppBrandTaskView
    public void setTaskViewListener(com.tencent.mm.plugin.appbrand.widget.recent.h1 h1Var) {
        this.f91890m = h1Var;
        this.f91886f.setTaskViewListener(h1Var);
        this.f91887g.setTaskViewListener(h1Var);
        this.f91888h.setTaskViewListener(h1Var);
    }

    public AppBrandTaskContainer(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f91891n = new android.graphics.Rect();
        this.f91892o = new android.graphics.Rect();
        this.f91893p = new java.lang.Object();
        this.f91894q = false;
        this.f91895r = null;
        this.f91896s = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f91897t = "";
        this.f91898u = "";
        this.f91899v = "";
        this.f91900w = 0L;
        d();
    }

    public AppBrandTaskContainer(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f91891n = new android.graphics.Rect();
        this.f91892o = new android.graphics.Rect();
        this.f91893p = new java.lang.Object();
        this.f91894q = false;
        this.f91895r = null;
        this.f91896s = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f91897t = "";
        this.f91898u = "";
        this.f91899v = "";
        this.f91900w = 0L;
        d();
    }
}
