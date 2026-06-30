package hn4;

/* loaded from: classes15.dex */
public class z extends fn4.g {
    public static final /* synthetic */ int T = 0;
    public hn4.c0 G;
    public fn4.h0 H;
    public android.view.View.OnClickListener I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f364141J;
    public android.view.View K;
    public android.widget.TextView L;
    public android.view.View M;
    public android.widget.TextView N;
    public android.widget.TextView P;
    public android.widget.ImageView Q;
    public android.widget.ImageView R;
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 S;

    public z(android.content.Context context, fn4.b bVar, fn4.a aVar) {
        super(context, bVar, aVar);
        this.S = new hn4.x(this);
    }

    @Override // fn4.g
    public void a() {
        android.view.View view = this.M;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "closePointVideo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "closePointVideo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // fn4.g
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.e1 b(r45.xn6 xn6Var) {
        return com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.CONTAIN;
    }

    @Override // fn4.g
    public void c() {
        hn4.c0 c0Var = this.G;
        if (c0Var != null) {
            c0Var.w();
        }
    }

    @Override // fn4.g
    public void d() {
        super.d();
        this.K = findViewById(com.p314xaae8f345.mm.R.id.iqc);
        this.L = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f567244iq3);
        this.M = findViewById(com.p314xaae8f345.mm.R.id.kz7);
        this.N = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.kz8);
        this.P = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f567885kz5);
        this.Q = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.kz6);
        this.R = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f567884kz4);
        this.I = new hn4.n(this);
        this.f346050o.setOnClickListener(new hn4.o(this));
        this.f346048m.setOnClickListener(new hn4.p(this));
        this.f346049n.setOnClickListener(new hn4.q(this));
        this.f346054s.setOnClickListener(new hn4.r(this));
        this.K.setOnClickListener(new hn4.s(this));
        android.view.View view = this.M;
        if (view != null) {
            view.setOnClickListener(new hn4.u(this));
        }
        android.widget.ImageView imageView = this.R;
        if (imageView != null) {
            imageView.setOnClickListener(new hn4.v(this));
        }
        this.H = new fn4.h0(getContext(), this, new hn4.y(this));
        hn4.c0 c0Var = new hn4.c0(getContext());
        this.G = c0Var;
        c0Var.w();
        this.G.m133832x7efa255d(this.I);
        this.G.m133833x46e95712(new hn4.k(this));
        this.G.mo69283xbdcdae58(new hn4.l(this));
        this.G.mo69284xb892d55(new hn4.m(this));
    }

    @Override // fn4.g
    public boolean e() {
        return this.M.getVisibility() == 0;
    }

    @Override // fn4.g
    /* renamed from: getLayoutId */
    public int mo129844x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f571116d20;
    }

    /* renamed from: getListItemUIComponent */
    public hn4.a m133834xc3959822() {
        return (hn4.a) this.f346061z;
    }

    /* renamed from: getListVideoUIComponent */
    public hn4.b m133835x24b16ea2() {
        return (hn4.b) this.A;
    }

    /* renamed from: getSessionId */
    public java.lang.String m133836x23a7af9b() {
        return this.D;
    }

    /* renamed from: getVideoInfo */
    public r45.xn6 m133837x4edba913() {
        return this.E;
    }

    @Override // fn4.g
    /* renamed from: getVideoViewCallback */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 mo129848x9535596f() {
        return this.S;
    }

    @Override // fn4.g
    public void i() {
        super.i();
    }

    @Override // fn4.g
    public void m() {
        r45.on6 on6Var;
        r45.pn6 pn6Var = this.E.Y;
        if (pn6Var == null || (on6Var = pn6Var.f464776n) == null) {
            android.view.View view = this.M;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "showPointVideo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "showPointVideo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        this.N.setText(on6Var.f463915d);
        this.P.setText(this.E.Y.f464776n.f463916e);
        n11.a.b().h(this.E.Y.f464776n.f463921m, this.Q, fn4.g.F);
        android.view.View view2 = this.M;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "showPointVideo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "showPointVideo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        pm4.y.i(this.A.r0(), this.E, 1);
        if (mo129842x143e7d6c().getVisibility() == 0) {
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.M.getLayoutParams();
            layoutParams.bottomMargin = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df);
            this.M.setLayoutParams(layoutParams);
        } else {
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) this.M.getLayoutParams();
            layoutParams2.bottomMargin = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
            this.M.setLayoutParams(layoutParams2);
        }
    }

    @Override // fn4.g
    public boolean n(boolean z17, boolean z18) {
        boolean n17 = super.n(z17, z18);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e) m133835x24b16ea2()).f256659J.l(((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e) m133835x24b16ea2()).f256668o.f469051x);
        return n17;
    }

    @Override // fn4.g
    public void o() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.G.F;
        if (b4Var != null) {
            b4Var.d();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        fn4.h0 h0Var = this.H;
        if (h0Var == null) {
            return true;
        }
        h0Var.a(motionEvent);
        return true;
    }

    @Override // fn4.g
    public void p() {
        super.p();
        hn4.c0 c0Var = this.G;
        if (c0Var != null) {
            c0Var.mo61298xa7077af8(this.E.f471791g);
        }
        if (m133834xc3959822() != null && ((fn4.m) m133834xc3959822()).u() != ((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e) m133835x24b16ea2()).f256668o.f469049v) {
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e) m133835x24b16ea2()).G.b()) {
                j();
            } else {
                k(m129846x994e8055(), getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574979k80));
            }
        }
        if (this.E.V == null) {
            android.view.View view = this.K;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.K;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = this.L;
        long j17 = this.E.V.f471791g;
        textView.setText(j17 <= 0 ? "00:00" : j17 < 60 ? java.lang.String.format(java.util.Locale.getDefault(), "00:%02d", java.lang.Long.valueOf(j17 % 60)) : j17 < 3600 ? java.lang.String.format(java.util.Locale.getDefault(), "%02d:%02d", java.lang.Long.valueOf(j17 / 60), java.lang.Long.valueOf(j17 % 60)) : java.lang.String.format(java.util.Locale.getDefault(), "%02d:%02d:%02d", java.lang.Long.valueOf(j17 / 3600), java.lang.Long.valueOf((j17 % 3600) / 60), java.lang.Long.valueOf(j17 % 60)));
    }

    @Override // fn4.g
    /* renamed from: getControlBar */
    public hn4.c0 mo129842x143e7d6c() {
        return this.G;
    }
}
