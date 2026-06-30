package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class gg extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.n8 implements android.view.View.OnClickListener {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f199962z = 0;

    /* renamed from: h, reason: collision with root package name */
    public yz5.l f199963h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.q f199964i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f199965m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f199966n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f199967o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.TextView f199968p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.TextView f199969q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.TextView f199970r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.ImageView f199971s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.TextView f199972t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f199973u;

    /* renamed from: v, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f199974v;

    /* renamed from: w, reason: collision with root package name */
    public ce2.i f199975w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.eh0 f199976x;

    /* renamed from: y, reason: collision with root package name */
    public long f199977y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.aqd, (android.view.ViewGroup) this, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f199966n = inflate;
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.drl);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.dsr);
        this.f199967o = findViewById;
        this.f199968p = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.dst);
        this.f199969q = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.hoy);
        this.f199970r = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.hou);
        this.f199971s = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.how);
        this.f199972t = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.hox);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.hot);
        this.f199974v = p3325xe03a0797.p3326xc267989b.z0.b();
        this.f199976x = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.eh0.f193949f;
        imageView.setOnClickListener(this);
        findViewById.setOnClickListener(this);
        textView.setOnClickListener(this);
        m58110x3ab833d4(textView);
    }

    public final void b() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = this.f199965m;
        if (y1Var != null) {
            y1Var.q();
        }
        this.f199965m = null;
    }

    public final void c(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l m58104xb7f4f95a;
        dk2.xf W0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveFansJoinWidget", "showWecoinInfo scene:" + i17);
        android.view.View view = this.f199966n;
        if (!(view.getContext() instanceof p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) || (m58104xb7f4f95a = m58104xb7f4f95a()) == null || (W0 = m58104xb7f4f95a.W0()) == null) {
            return;
        }
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        dk2.xf.a(W0, (p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) context, i17, 0, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ag(i17, this), 4, null);
    }

    /* renamed from: getJoinCallBack */
    public final yz5.q m58038xb99e25() {
        return this.f199964i;
    }

    /* renamed from: getWecoinClickCallBack */
    public final yz5.l m58039x8fbfaeb8() {
        return this.f199963h;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansJoinWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.drl) {
            b();
        } else {
            boolean z17 = true;
            if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.dsr) {
                b();
                c(1);
            } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.hot) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                if (currentTimeMillis - qd2.h.f443300a >= 500) {
                    z17 = false;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f443300a);
                }
                qd2.h.f443300a = currentTimeMillis;
                if (z17) {
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansJoinWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                if (!this.f199973u) {
                    android.view.View view2 = this.f199966n;
                    db5.t7.m(view2.getContext(), view2.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dk6));
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansJoinWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                } else {
                    i95.m c17 = i95.n0.c(ml2.r0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    ml2.r0.Lj((ml2.r0) c17, ml2.j4.f409152o, null, this.f199976x, 2, null);
                    p3325xe03a0797.p3326xc267989b.l.d(this.f199974v, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.xf(this, null), 3, null);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansJoinWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    /* renamed from: setJoinCallBack */
    public final void m58040x37029931(yz5.q qVar) {
        this.f199964i = qVar;
    }

    /* renamed from: setWecoinClickCallBack */
    public final void m58041xde046e2c(yz5.l lVar) {
        this.f199963h = lVar;
    }
}
