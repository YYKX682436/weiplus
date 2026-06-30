package gn4;

/* loaded from: classes15.dex */
public class z extends fn4.g {
    public static final /* synthetic */ int V = 0;
    public gn4.c0 G;
    public fn4.h0 H;
    public android.view.View.OnClickListener I;

    /* renamed from: J, reason: collision with root package name */
    public android.view.View.OnClickListener f355197J;
    public android.view.View.OnClickListener K;
    public android.view.View.OnClickListener L;
    public android.view.View.OnClickListener M;
    public boolean N;
    public android.view.View P;
    public android.widget.TextView Q;
    public android.widget.TextView R;
    public android.widget.ImageView S;
    public android.widget.ImageView T;
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 U;

    public z(android.content.Context context, fn4.b bVar, fn4.a aVar) {
        super(context, bVar, aVar);
        this.U = new gn4.l(this);
        if (this.A.p6()) {
            this.f346045g.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        }
    }

    @Override // fn4.g
    public void a() {
        if (this instanceof gn4.f1) {
            return;
        }
        android.view.View view = this.P;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "closePointVideo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "closePointVideo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // fn4.g
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.e1 b(r45.xn6 xn6Var) {
        return com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.CONTAIN;
    }

    @Override // fn4.g
    public void c() {
        gn4.c0 c0Var = this.G;
        if (c0Var != null) {
            c0Var.w();
        }
    }

    @Override // fn4.g
    public void d() {
        super.d();
        boolean z17 = this instanceof gn4.f1;
        if (!z17) {
            this.P = findViewById(com.p314xaae8f345.mm.R.id.kz7);
            this.Q = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.kz8);
            this.R = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f567885kz5);
            this.S = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.kz6);
            this.T = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f567884kz4);
        }
        this.I = new gn4.q(this);
        this.f355197J = new gn4.r(this);
        this.K = new gn4.s(this);
        this.L = new gn4.t(this);
        this.M = new gn4.u(this);
        this.f346050o.setOnClickListener(new gn4.v(this));
        this.f346048m.setOnClickListener(new gn4.w(this));
        this.f346049n.setOnClickListener(new gn4.x(this));
        this.f346054s.setOnClickListener(new gn4.g(this));
        if (!z17) {
            this.P.setOnClickListener(new gn4.i(this));
            this.T.setOnClickListener(new gn4.j(this));
        }
        r();
        if (m131898x15cb7231().p6()) {
            this.G = new gn4.g1(getContext());
        } else {
            this.G = new gn4.c0(getContext());
            if (com.p314xaae8f345.mm.ui.bk.u(getContext(), false)) {
                this.G.I.setPadding(i65.a.b(getContext(), 24), 0, i65.a.b(getContext(), 24), 0);
            }
        }
        this.G.m131890x1bf7447b(z17);
        this.G.w();
        this.G.m131891x5634481d(this.f355197J);
        this.G.m131895x69555c5d(this.K);
        this.G.m131893x35bdf958(this.L);
        this.G.m131892xe48a706c(this.M);
        if (1 >= com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016()) {
            this.G.m131894x8f9a66e6(new gn4.m(this));
        }
        this.G.mo131889x46e95712(new gn4.n(this));
        this.G.mo69283xbdcdae58(new gn4.o(this));
        this.G.mo69284xb892d55(new gn4.p(this));
    }

    @Override // fn4.g
    public boolean e() {
        android.view.View view = this.P;
        return view != null && view.getVisibility() == 0;
    }

    /* renamed from: getFSItemUIComponent */
    public gn4.a m131897x2e7566b3() {
        return (gn4.a) this.f346061z;
    }

    /* renamed from: getFSVideoUIComponent */
    public fn4.b m131898x15cb7231() {
        return this.A;
    }

    @Override // fn4.g
    /* renamed from: getLayoutId */
    public int mo129844x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d1o;
    }

    /* renamed from: getSessionId */
    public java.lang.String m131899x23a7af9b() {
        return this.D;
    }

    /* renamed from: getVideoInfo */
    public r45.xn6 m131900x4edba913() {
        return this.E;
    }

    @Override // fn4.g
    /* renamed from: getVideoViewCallback */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 mo129848x9535596f() {
        return this.U;
    }

    @Override // fn4.g
    public void i() {
        super.i();
    }

    @Override // fn4.g
    public void l() {
        gn4.c0 c0Var = this.G;
        if (c0Var != null) {
            c0Var.x();
        }
    }

    @Override // fn4.g
    public void m() {
        r45.on6 on6Var;
        if (this instanceof gn4.f1) {
            return;
        }
        r45.pn6 pn6Var = this.E.Y;
        if (pn6Var == null || (on6Var = pn6Var.f464776n) == null) {
            android.view.View view = this.P;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "showPointVideo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "showPointVideo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        this.Q.setText(on6Var.f463915d);
        this.R.setText(this.E.Y.f464776n.f463916e);
        n11.a.b().h(this.E.Y.f464776n.f463921m, this.S, fn4.g.F);
        android.view.View view2 = this.P;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "showPointVideo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "showPointVideo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        pm4.y.i(this.A.r0(), this.E, 1);
    }

    @Override // fn4.g
    public void o() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.G.f355132x0;
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
        gn4.c0 c0Var = this.G;
        if (c0Var != null) {
            c0Var.mo61298xa7077af8(this.E.f471791g);
            this.G.A(this.E);
        }
        if (m131897x2e7566b3() != null && ((gn4.d0) m131897x2e7566b3()).m8183xf806b362() != m131898x15cb7231().Y2()) {
            if (m131898x15cb7231().s1().b()) {
                j();
            } else {
                k(m129846x994e8055(), getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574979k80));
            }
        }
        android.widget.TextView textView = this.f346047i;
        if (textView != null) {
            textView.setText(this.E.f471788d);
            com.p314xaae8f345.mm.ui.bk.r0(this.f346047i.getPaint(), 0.8f);
        }
    }

    public void r() {
        this.H = new fn4.h0(getContext(), this, new gn4.y(this));
    }

    public void s() {
        android.view.View view = this.f346054s;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "setListScrollPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "setListScrollPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f346053r;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "setListScrollPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "setListScrollPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f346045g.setVisibility(0);
        this.f346043e.setVisibility(8);
        this.f346042d.setVisibility(8);
        this.f346058w.setVisibility(8);
    }

    public void t() {
        android.view.View view = this.f346054s;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "setListScrollStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "setListScrollStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (!(m131898x15cb7231().s1().f346102c == 2) || su4.r2.k()) {
            android.view.View view2 = this.f346053r;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "setListScrollStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "setListScrollStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view3 = this.f346053r;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "setListScrollStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "setListScrollStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f346045g.setVisibility(0);
        this.f346043e.setVisibility(8);
        this.f346042d.setVisibility(8);
        this.f346058w.setVisibility(8);
        android.view.View view4 = this.f346056u;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "setListScrollStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "setListScrollStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view5 = this.f346055t;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "setListScrollStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "setListScrollStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f346048m.setVisibility(0);
        this.f346049n.setVisibility(8);
        this.f346052q.setVisibility(8);
    }

    public void u() {
        this.G.B(this.E);
    }

    @Override // fn4.g
    /* renamed from: getControlBar */
    public gn4.c0 mo129842x143e7d6c() {
        return this.G;
    }
}
