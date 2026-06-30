package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* renamed from: com.tencent.mm.plugin.game.ui.GameFeedVideoView */
/* loaded from: classes8.dex */
public class ViewOnClickListenerC15969x690956d0 extends android.widget.LinearLayout implements android.view.View.OnClickListener, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15968xce00ec5e f222370d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f222371e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15988x859a8564 f222372f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f222373g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f222374h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f222375i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ViewOnClickListenerC15967xc3165160 f222376m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c f222377n;

    public ViewOnClickListenerC15969x690956d0(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameFeedVideoView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c cVar = this.f222377n;
        if (cVar == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameFeedVideoView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f221771d.f405720h)) {
            int v17 = r53.f.v(getContext(), this.f222377n.f221771d.f405720h, null, null);
            android.content.Context context = getContext();
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c cVar2 = this.f222377n;
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.f(context, 10, 1024, cVar2.f221769b, v17, cVar2.f221771d.f405719g, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15971xe6741863.m64756xd419dffb(), n53.a.a(this.f222377n.f221771d.f405718f, "clickType", "card"));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameFeedVideoView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f222370d = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15968xce00ec5e) findViewById(com.p314xaae8f345.mm.R.id.gl7);
        this.f222371e = (android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.oze);
        this.f222372f = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15988x859a8564) findViewById(com.p314xaae8f345.mm.R.id.oye);
        this.f222373g = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.oyj);
        this.f222374h = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f569094p04);
        this.f222375i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.oyk);
        this.f222376m = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ViewOnClickListenerC15967xc3165160) findViewById(com.p314xaae8f345.mm.R.id.nrj);
        setOnClickListener(this);
    }

    /* renamed from: setLiveData */
    public void m64754xcb0b5d38(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c cVar) {
        m53.y0 y0Var;
        if (cVar == null || (y0Var = cVar.f221771d) == null || y0Var.f405723n == null) {
            setVisibility(8);
            return;
        }
        this.f222377n = cVar;
        setVisibility(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15968xce00ec5e c15968xce00ec5e = this.f222370d;
        m53.w3 w3Var = y0Var.f405723n;
        c15968xce00ec5e.a(w3Var.f405689d, w3Var.f405690e, null);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y0Var.f405723n.f405691f)) {
            this.f222371e.setVisibility(8);
        } else {
            this.f222371e.setVisibility(0);
            r53.y.a().f(this.f222372f, y0Var.f405723n.f405691f, getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561349g1), getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561348g0), (r53.f.h(getContext()) - getPaddingLeft()) - getPaddingRight());
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y0Var.f405723n.f405692g)) {
            this.f222373g.setVisibility(8);
        } else {
            this.f222373g.setVisibility(0);
            this.f222374h.setVisibility(0);
            this.f222375i.setText(y0Var.f405723n.f405692g);
        }
        this.f222376m.m64753x76491f2c(y0Var);
        if (this.f222377n.f221773f) {
            return;
        }
        android.content.Context context = getContext();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c cVar2 = this.f222377n;
        n53.a.b(context, 10, 1024, cVar2.f221769b, 1, cVar2.f221771d.f405719g, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15971xe6741863.m64756xd419dffb(), n53.a.e(this.f222377n.f221771d.f405718f));
        this.f222377n.f221773f = true;
    }

    /* renamed from: setVideoData */
    public void m64755xab2cf483(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c cVar) {
        m53.y0 y0Var;
        m53.z5 z5Var;
        if (cVar == null || (y0Var = cVar.f221771d) == null || (z5Var = y0Var.f405722m) == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z5Var.f405773g)) {
            setVisibility(8);
            return;
        }
        this.f222377n = cVar;
        m53.y0 y0Var2 = cVar.f221771d;
        setVisibility(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15968xce00ec5e c15968xce00ec5e = this.f222370d;
        m53.z5 z5Var2 = y0Var2.f405722m;
        c15968xce00ec5e.a(z5Var2.f405770d, z5Var2.f405771e, null);
        r53.y.a().f(this.f222372f, y0Var2.f405722m.f405773g, getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561349g1), getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561348g0), (r53.f.h(getContext()) - getPaddingLeft()) - getPaddingRight());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y0Var2.f405722m.f405772f)) {
            this.f222373g.setVisibility(8);
        } else {
            this.f222373g.setVisibility(0);
            this.f222374h.setVisibility(8);
            this.f222375i.setText(y0Var2.f405722m.f405772f);
        }
        this.f222376m.m64753x76491f2c(y0Var2);
    }
}
