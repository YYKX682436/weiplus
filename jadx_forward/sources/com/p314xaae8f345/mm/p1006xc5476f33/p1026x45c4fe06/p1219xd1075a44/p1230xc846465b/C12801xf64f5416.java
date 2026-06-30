package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.recent.AppBrandTaskContainer */
/* loaded from: classes7.dex */
public class C12801xf64f5416 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.AbstractC12804x8a4e09f0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.g1 {

    /* renamed from: x, reason: collision with root package name */
    public static final int f173417x = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.w.f173611e;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f173418e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.C12799x63f4f4eb f173419f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.C12795x70ccad8 f173420g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.C12794xce6c1b7c f173421h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ScrollView f173422i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.h1 f173423m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.Rect f173424n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.Rect f173425o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Object f173426p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f173427q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f173428r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f173429s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f173430t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f173431u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f173432v;

    /* renamed from: w, reason: collision with root package name */
    public long f173433w;

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.recent.AppBrandTaskContainer$a */
    /* loaded from: classes4.dex */
    public static final class a implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
        private a() {
        }

        @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
        /* renamed from: invoke */
        public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
            android.os.Bundle bundle = (android.os.Bundle) obj;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTask.AppBrandTaskContainer", "invoke");
            int i17 = bundle.getInt("count");
            int i18 = bundle.getInt("versionType", Integer.MAX_VALUE);
            android.os.Parcel obtain = android.os.Parcel.obtain();
            try {
                obtain.writeTypedList(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z2) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z2.class)).z0(i17, 0, i18));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandTask.AppBrandTaskContainer", e17, "QueryRecentTask", new java.lang.Object[0]);
                obtain.setDataPosition(0);
                obtain.writeTypedList(null);
            }
            return obtain;
        }
    }

    public C12801xf64f5416(android.content.Context context) {
        super(context);
        this.f173424n = new android.graphics.Rect();
        this.f173425o = new android.graphics.Rect();
        this.f173426p = new java.lang.Object();
        this.f173427q = false;
        this.f173428r = null;
        this.f173429s = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f173430t = "";
        this.f173431u = "";
        this.f173432v = "";
        this.f173433w = 0L;
        d();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.AbstractC12804x8a4e09f0
    public void a() {
        android.view.ViewPropertyAnimator animate = this.f173418e.animate();
        this.f173418e.setScaleX(1.0f);
        this.f173418e.setScaleY(1.0f);
        android.view.View view = this.f173418e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/recent/AppBrandTaskContainer", "exitAnimation", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/recent/AppBrandTaskContainer", "exitAnimation", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        animate.scaleX(0.8f).scaleY(0.8f).alpha(0.0f).setInterpolator(new android.view.animation.DecelerateInterpolator()).setDuration(250L).setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.u0(this, animate)).start();
        android.view.ViewPropertyAnimator animate2 = animate();
        setAlpha(1.0f);
        animate2.alpha(0.0f).setInterpolator(new android.view.animation.DecelerateInterpolator()).setDuration(250L).setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.v0(this, animate2)).start();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.AbstractC12804x8a4e09f0
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTask.AppBrandTaskContainer", "refresh");
        if (this.f173428r == null) {
            this.f173428r = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("UpdateAppBrandTaskDataTask");
        }
        synchronized (this.f173426p) {
            if (this.f173427q) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTask.AppBrandTaskContainer", "refresh is running and delay");
                if (this.f173429s.isEmpty()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTask.AppBrandTaskContainer", "refresh add updateTask");
                    this.f173429s.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.x0(this, true));
                }
            } else {
                this.f173427q = true;
                this.f173428r.m77784x795fa299(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.x0(this, true));
            }
        }
    }

    public final void c() {
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f173422i.getLayoutParams();
        layoutParams.width = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.d1.f173502a.a(getContext());
        layoutParams.height = (int) ((r1.a(getContext()) * 3) / 4.0f);
        this.f173422i.setLayoutParams(layoutParams);
    }

    public void d() {
        this.f173418e = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569633dz0, (android.view.ViewGroup) null, false);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        addView(this.f173418e, layoutParams);
        setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560206ai5));
        this.f173419f = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.C12799x63f4f4eb) this.f173418e.findViewById(com.p314xaae8f345.mm.R.id.f564740se5);
        this.f173420g = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.C12795x70ccad8) this.f173418e.findViewById(com.p314xaae8f345.mm.R.id.sdy);
        this.f173421h = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.C12794xce6c1b7c) this.f173418e.findViewById(com.p314xaae8f345.mm.R.id.sdw);
        this.f173422i = (android.widget.ScrollView) this.f173418e.findViewById(com.p314xaae8f345.mm.R.id.se8);
        if (getContext().getResources().getConfiguration().orientation == 2) {
            c();
        }
        setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.r0(this));
        this.f173419f.m53611xaa46bf3a(this);
        this.f173420g.m53611xaa46bf3a(this);
        this.f173421h.m53611xaa46bf3a(this);
    }

    public void e(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTask.AppBrandTaskContainer", "reportAction action:%d, actionNode:%s", java.lang.Integer.valueOf(i17), str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.e1.a(this.f173431u, this.f173430t, i17, str, str2, str3);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.AbstractC12804x8a4e09f0
    /* renamed from: getRecentCount */
    public int mo53628x5fb9223e() {
        return this.f173419f.m53617x7444f759();
    }

    /* renamed from: getRecentLoadCount */
    public int m53629xbe9e5d78() {
        return f173417x;
    }

    /* renamed from: getRecentShowCount */
    public int m53630xfa587dc1() {
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.wxapp_recent_use_new, 0) == 5) {
            return 8;
        }
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.y0.b() ? 4 : 6;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.AbstractC12804x8a4e09f0
    /* renamed from: getTaskSessionId */
    public java.lang.String mo53631x54294a96() {
        return this.f173430t;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.AbstractC12804x8a4e09f0
    /* renamed from: getTaskViewListener */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.h1 mo53632x59d4c014() {
        return this.f173423m;
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (getContext().getResources().getConfiguration().orientation == 2) {
            c();
            return;
        }
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f173422i.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        this.f173422i.setLayoutParams(layoutParams);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        this.f173422i.getGlobalVisibleRect(this.f173424n);
        this.f173421h.getGlobalVisibleRect(this.f173425o);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.AbstractC12804x8a4e09f0
    /* renamed from: setTaskViewListener */
    public void mo53633xfdd15520(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.h1 h1Var) {
        this.f173423m = h1Var;
        this.f173419f.m53612xfdd15520(h1Var);
        this.f173420g.m53612xfdd15520(h1Var);
        this.f173421h.m53612xfdd15520(h1Var);
    }

    public C12801xf64f5416(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f173424n = new android.graphics.Rect();
        this.f173425o = new android.graphics.Rect();
        this.f173426p = new java.lang.Object();
        this.f173427q = false;
        this.f173428r = null;
        this.f173429s = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f173430t = "";
        this.f173431u = "";
        this.f173432v = "";
        this.f173433w = 0L;
        d();
    }

    public C12801xf64f5416(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f173424n = new android.graphics.Rect();
        this.f173425o = new android.graphics.Rect();
        this.f173426p = new java.lang.Object();
        this.f173427q = false;
        this.f173428r = null;
        this.f173429s = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f173430t = "";
        this.f173431u = "";
        this.f173432v = "";
        this.f173433w = 0L;
        d();
    }
}
