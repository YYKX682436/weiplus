package yt3;

/* loaded from: classes10.dex */
public final class z implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2004x317b13.C17058xaee30621 f547265d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f547266e;

    /* renamed from: f, reason: collision with root package name */
    public zu3.b0 f547267f;

    /* renamed from: g, reason: collision with root package name */
    public zu3.c0 f547268g;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2004x317b13.C17058xaee30621 view, ju3.d0 status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f547265d = view;
        this.f547266e = status;
        view.m68320x2effbb7a(new yt3.u(this));
        view.m68321x48f766ae(new yt3.v(this));
        view.m68318xe1a30e72(new yt3.w(this));
        view.m68313x24b3e0b8(new yt3.x(this));
        view.m68315x1bcd5a79(new yt3.y(this));
    }

    public final void a(java.lang.String text, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2004x317b13.C17058xaee30621 c17058xaee30621 = this.f547265d;
        zu3.c0 c0Var = c17058xaee30621.tipItemView;
        if (c0Var != null) {
            c17058xaee30621.f237660p.removeView(c0Var);
            c17058xaee30621.tipItemView = null;
        }
        if (r26.n0.N(text)) {
            return;
        }
        c17058xaee30621.tipItemView = new zu3.c0(c17058xaee30621.getContext());
        c17058xaee30621.f237660p.addView(c17058xaee30621.tipItemView, new android.widget.RelativeLayout.LayoutParams(-2, -2));
        zu3.c0 c0Var2 = c17058xaee30621.tipItemView;
        if (c0Var2 != null) {
            c0Var2.j(lt3.n.f402795c, lt3.n.f402798f);
        }
        zu3.c0 c0Var3 = c17058xaee30621.tipItemView;
        if (c0Var3 != null) {
            c0Var3.mo122950x198ca867(lt3.n.f402796d);
        }
        zu3.c0 c0Var4 = c17058xaee30621.tipItemView;
        if (c0Var4 != null) {
            cw3.s.h(c0Var4, c17058xaee30621.displayArea, 0.0f, 2, null);
        }
        zu3.c0 c0Var5 = c17058xaee30621.tipItemView;
        if (c0Var5 != null) {
            c0Var5.m179518xe2f7cd9d(c17058xaee30621.M);
        }
        zu3.c0 c0Var6 = c17058xaee30621.tipItemView;
        if (c0Var6 != null) {
            c0Var6.m179526x765074af(new zu3.a0(text, i17, i18, c17058xaee30621.m68307x99129da5(), new android.graphics.Matrix()));
        }
        zu3.c0 c0Var7 = c17058xaee30621.tipItemView;
        if (c0Var7 != null) {
            c0Var7.setOnClickListener(c17058xaee30621.I);
        }
    }

    public final float[] b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2004x317b13.C17058xaee30621 c17058xaee30621 = this.f547265d;
        return new float[]{c17058xaee30621.getLeft(), c17058xaee30621.getTop(), c17058xaee30621.getRight(), c17058xaee30621.getBottom()};
    }

    public final java.util.ArrayList c() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = this.f547265d.m68302x220820f0().iterator();
        while (it.hasNext()) {
            zu3.a g17 = ((zu3.n) it.next()).g();
            if (g17 != null) {
                arrayList.add(g17);
            }
        }
        return arrayList;
    }

    public final java.util.ArrayList d(android.graphics.Matrix matrix) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = this.f547265d.m68302x220820f0().iterator();
        while (it.hasNext()) {
            av3.a p17 = ((zu3.n) it.next()).p(matrix);
            if (p17 != null) {
                arrayList.add(p17);
            }
        }
        return arrayList;
    }

    public final int e() {
        java.util.Iterator<T> it = this.f547265d.m68302x220820f0().iterator();
        int i17 = 0;
        while (it.hasNext()) {
            if (((zu3.n) it.next()) instanceof zu3.l) {
                i17++;
            }
        }
        return i17;
    }

    public final int f() {
        java.util.Iterator<T> it = this.f547265d.m68302x220820f0().iterator();
        int i17 = 0;
        while (it.hasNext()) {
            if (((zu3.n) it.next()) instanceof zu3.b0) {
                i17++;
            }
        }
        return i17;
    }

    public final float[] g() {
        lt3.n nVar = lt3.n.f402793a;
        android.graphics.Rect rect = lt3.n.f402796d;
        return new float[]{rect.left, rect.top, rect.right, rect.bottom};
    }

    public final void h(float f17, float f18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2004x317b13.C17058xaee30621 c17058xaee30621 = this.f547265d;
        android.content.Context context = c17058xaee30621.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17041xb2d1daa5 c17041xb2d1daa5 = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17041xb2d1daa5(context);
        c17058xaee30621.f237665u = c17041xb2d1daa5;
        c17041xb2d1daa5.m68207xa32537ab(wu3.p0.f531324e);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17041xb2d1daa5 c17041xb2d1daa52 = c17058xaee30621.f237665u;
        if (c17041xb2d1daa52 != null) {
            c17041xb2d1daa52.setVisibility(4);
        }
        int i17 = (int) f18;
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, i17);
        layoutParams.addRule(10);
        c17058xaee30621.addView(c17058xaee30621.f237665u, layoutParams);
        android.content.Context context2 = c17058xaee30621.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17041xb2d1daa5 c17041xb2d1daa53 = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17041xb2d1daa5(context2);
        c17058xaee30621.f237667w = c17041xb2d1daa53;
        c17041xb2d1daa53.m68207xa32537ab(wu3.p0.f531326g);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17041xb2d1daa5 c17041xb2d1daa54 = c17058xaee30621.f237667w;
        if (c17041xb2d1daa54 != null) {
            c17041xb2d1daa54.setVisibility(4);
        }
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, i17);
        layoutParams2.addRule(12);
        c17058xaee30621.addView(c17058xaee30621.f237667w, layoutParams2);
        android.graphics.Rect rect = lt3.n.f402795c;
        rect.top = i17;
        rect.bottom = i17 + ((int) f17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorItemContainer", "logStory: initHeightSafeArea safeAreaRect:" + rect);
    }

    public final void i(float f17, float f18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2004x317b13.C17058xaee30621 c17058xaee30621 = this.f547265d;
        android.content.Context context = c17058xaee30621.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17041xb2d1daa5 c17041xb2d1daa5 = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17041xb2d1daa5(context);
        c17058xaee30621.f237664t = c17041xb2d1daa5;
        c17041xb2d1daa5.m68207xa32537ab(wu3.p0.f531323d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17041xb2d1daa5 c17041xb2d1daa52 = c17058xaee30621.f237664t;
        if (c17041xb2d1daa52 != null) {
            c17041xb2d1daa52.setVisibility(4);
        }
        int i17 = (int) f18;
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(i17, -1);
        layoutParams.addRule(20);
        c17058xaee30621.addView(c17058xaee30621.f237664t, layoutParams);
        android.content.Context context2 = c17058xaee30621.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17041xb2d1daa5 c17041xb2d1daa53 = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17041xb2d1daa5(context2);
        c17058xaee30621.f237666v = c17041xb2d1daa53;
        c17041xb2d1daa53.m68207xa32537ab(wu3.p0.f531325f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17041xb2d1daa5 c17041xb2d1daa54 = c17058xaee30621.f237666v;
        if (c17041xb2d1daa54 != null) {
            c17041xb2d1daa54.setVisibility(4);
        }
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(i17, -1);
        layoutParams2.addRule(21);
        c17058xaee30621.addView(c17058xaee30621.f237666v, layoutParams2);
        android.graphics.Rect rect = lt3.n.f402795c;
        rect.left = i17;
        rect.right = i17 + ((int) f17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorItemContainer", "logStory: initWidthSafeArea safeAreaRect:" + rect);
    }

    @Override // yt3.r2
    /* renamed from: onBackPress */
    public boolean mo9064x4ceae47d() {
        return false;
    }

    @Override // yt3.r2
    /* renamed from: onPause */
    public void mo11000xb01dfb57() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2004x317b13.C17058xaee30621 c17058xaee30621 = this.f547265d;
        android.view.ViewGroup viewGroup = c17058xaee30621.f237660p;
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = viewGroup.getChildAt(i17);
            if (childAt instanceof zu3.l) {
                ((zu3.l) childAt).m64932x65825f6();
            }
        }
        nu3.i.f421751a.n("KEY_TEXT_WIDGET_CONTENT_STRING", c17058xaee30621.m68310x2f2519dd());
    }

    @Override // yt3.r2
    /* renamed from: onResume */
    public void mo11001x57429eec() {
        android.view.ViewGroup viewGroup = this.f547265d.f237660p;
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = viewGroup.getChildAt(i17);
            if (childAt instanceof zu3.l) {
                ((zu3.l) childAt).m64933xc84dc82d();
            }
        }
    }

    @Override // yt3.r2
    /* renamed from: release */
    public void mo9065x41012807() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2004x317b13.C17058xaee30621 c17058xaee30621 = this.f547265d;
        c17058xaee30621.locationView = null;
        c17058xaee30621.tipItemView = null;
        c17058xaee30621.lyricsView = null;
        c17058xaee30621.f237660p.removeAllViews();
    }

    @Override // yt3.r2
    /* renamed from: reset */
    public void mo9066x6761d4f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2004x317b13.C17058xaee30621 c17058xaee30621 = this.f547265d;
        c17058xaee30621.locationView = null;
        c17058xaee30621.tipItemView = null;
        c17058xaee30621.lyricsView = null;
        c17058xaee30621.f237660p.removeAllViews();
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        this.f547265d.setVisibility(i17);
    }
}
