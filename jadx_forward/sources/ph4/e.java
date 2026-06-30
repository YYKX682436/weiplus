package ph4;

/* loaded from: classes8.dex */
public final class e extends lh4.h implements ph4.f {

    /* renamed from: p, reason: collision with root package name */
    public static final int f436004p = i65.a.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7);

    /* renamed from: q, reason: collision with root package name */
    public static final int f436005q = i65.a.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);

    /* renamed from: m, reason: collision with root package name */
    public final yo0.i f436006m;

    /* renamed from: n, reason: collision with root package name */
    public final ph4.a f436007n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashMap f436008o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(final android.content.Context context, lh4.b callback, int i17) {
        super(context, callback, i17, null, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        yo0.f fVar = new yo0.f();
        fVar.f545611b = true;
        fVar.f545610a = true;
        this.f436006m = fVar.a();
        ph4.d dVar = new ph4.d(this, context);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d(context) { // from class: com.tencent.mm.plugin.taskbar.ui.section.other.TaskBarSectionOtherView$layoutManager$1
            @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
            /* renamed from: canScrollVertically */
            public boolean getF204840r() {
                return false;
            }
        };
        ph4.a aVar = new ph4.a(this);
        this.f436007n = aVar;
        this.f436008o = kz5.c1.i(new jz5.l(2, new sh4.a(this)), new jz5.l(6, new oh4.n(this)), new jz5.l(21, new nh4.b(this)), new jz5.l(3, new mh4.a(this)), new jz5.l(4, new mh4.a(this)), new jz5.l(22, new qh4.a(this)), new jz5.l(25, new qh4.a(this)));
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        int i18 = f436004p - (f436005q / 2);
        layoutParams.setMargins(i18, 0, i18, 0);
        m145776x329d8f10().addView(dVar, layoutParams);
        dVar.mo7967x900dcbe1(c1161x57298f5d);
        dVar.mo7960x6cab2c8d(aVar);
        dVar.setOverScrollMode(2);
    }

    @Override // lh4.h
    public boolean b(int i17) {
        int i18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c) ((java.util.ArrayList) m145780xa0ab20ce().f400257d).get(i17)).f66793x2262335f;
        return (i18 == 6 || i18 == 25 || i18 == 21 || i18 == 22) ? false : true;
    }

    @Override // lh4.h
    public void c() {
        android.widget.TextView m145779x7531c8a2 = m145779x7531c8a2();
        if (m145779x7531c8a2 != null) {
            m145779x7531c8a2.setText(f());
        }
        this.f436007n.m8146xced61ae5();
    }

    @Override // lh4.h
    public void d() {
        android.view.ViewGroup.LayoutParams layoutParams = m145776x329d8f10().getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        m145776x329d8f10().setLayoutParams(marginLayoutParams);
    }

    @Override // lh4.h
    public void e(int i17) {
        if (i17 < 0 || i17 >= ((java.util.ArrayList) m145780xa0ab20ce().f400257d).size()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarSectionOtherView", "remove item outOfBounds " + i17 + ' ' + ((java.util.ArrayList) m145780xa0ab20ce().f400257d).size());
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c) ((java.util.ArrayList) m145780xa0ab20ce().f400257d).remove(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarSectionOtherView", "remove item " + i17 + ' ' + c16601x7ed0e40c.v0().m75945x2fec8307(1) + ' ' + c16601x7ed0e40c.f66791xc8a07680);
        ((gh4.e0) i95.n0.c(gh4.e0.class)).Ni(c16601x7ed0e40c);
        ((gh4.e0) ((gh4.s) i95.n0.c(gh4.s.class))).Ui(c16601x7ed0e40c.f66791xc8a07680, true, 3);
        if (((java.util.ArrayList) m145780xa0ab20ce().f400257d).size() != 0) {
            ph4.a aVar = this.f436007n;
            aVar.m8155x27702c4(i17);
            aVar.m8152xc67946d3(0, aVar.mo1894x7e414b06(), java.lang.Boolean.TRUE);
        }
        lh4.b m145775x71965dbb = m145775x71965dbb();
        int m145778xfc19ce89 = m145778xfc19ce89();
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3) m145775x71965dbb;
        if (m145778xfc19ce89 != 4 || c18557xc00aa3f3.f254058e2.indexOf(java.lang.Integer.valueOf(m145778xfc19ce89)) == -1 || !((java.util.ArrayList) c18557xc00aa3f3.f254056c2.a(4).f400257d).isEmpty()) {
            c18557xc00aa3f3.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.l1(c18557xc00aa3f3, m145778xfc19ce89), c18557xc00aa3f3.E0() ? 200L : 0L);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "other last item removed");
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.o2 o2Var = c18557xc00aa3f3.f254056c2;
        o2Var.c(o2Var.a(4));
        c18557xc00aa3f3.l1(4);
    }

    @Override // lh4.h
    public java.lang.String f() {
        int floor = (int) java.lang.Math.floor((((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_taskbar_recent_timeout, 3600L) * 1000) / 3600000.0d);
        java.lang.String r17 = i65.a.r(getContext(), floor > 1 ? com.p314xaae8f345.mm.R.C30867xcad56011.f571847rk : com.p314xaae8f345.mm.R.C30867xcad56011.f571848rl);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getString(...)");
        java.lang.String format = java.lang.String.format(r17, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(floor)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        return format;
    }

    @Override // lh4.h
    public boolean g(int i17) {
        int i18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c) ((java.util.ArrayList) m145780xa0ab20ce().f400257d).get(i17)).f66793x2262335f;
        return i18 == 2 || i18 == 4;
    }

    /* renamed from: getThumbLoaderOption */
    public final yo0.i m158551x785086a8() {
        return this.f436006m;
    }
}
