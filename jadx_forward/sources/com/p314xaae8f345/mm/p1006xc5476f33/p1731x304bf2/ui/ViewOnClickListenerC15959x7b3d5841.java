package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* renamed from: com.tencent.mm.plugin.game.ui.GameFeedGameTemplateView */
/* loaded from: classes8.dex */
public class ViewOnClickListenerC15959x7b3d5841 extends android.widget.LinearLayout implements android.view.View.OnClickListener, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f222311d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f222312e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1759xd1075a44.C16037x7e3b52ab f222313f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f222314g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.FrameLayout f222315h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15988x859a8564 f222316i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f222317m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ViewOnClickListenerC15967xc3165160 f222318n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ViewOnClickListenerC15956x2c9f7c7f f222319o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c f222320p;

    /* renamed from: q, reason: collision with root package name */
    public int f222321q;

    public ViewOnClickListenerC15959x7b3d5841(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(android.widget.ImageView imageView, java.lang.String str) {
        r53.y.a().f(imageView, str, getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561359gb), getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561358ga), (r53.f.h(getContext()) - getPaddingLeft()) - getPaddingRight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameFeedGameTemplateView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c cVar = this.f222320p;
        if (cVar == null || cVar.f221771d == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameFeedGameTemplateView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (view.getId() == com.p314xaae8f345.mm.R.id.oze && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f222320p.f221771d.f405725p.f405580i)) {
            int v17 = r53.f.v(getContext(), this.f222320p.f221771d.f405725p.f405580i, null, null);
            android.content.Context context = getContext();
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c cVar2 = this.f222320p;
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.f(context, 10, 1024, cVar2.f221769b, v17, cVar2.f221771d.f405719g, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15971xe6741863.m64756xd419dffb(), n53.a.a(this.f222320p.f221771d.f405718f, "clickType", "middle"));
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameFeedGameTemplateView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f222320p.f221771d.f405720h)) {
            int v18 = r53.f.v(getContext(), this.f222320p.f221771d.f405720h, null, null);
            android.content.Context context2 = getContext();
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c cVar3 = this.f222320p;
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.f(context2, 10, 1024, cVar3.f221769b, v18, cVar3.f221771d.f405719g, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15971xe6741863.m64756xd419dffb(), n53.a.a(this.f222320p.f221771d.f405718f, "clickType", "card"));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameFeedGameTemplateView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f222311d = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.glm);
        this.f222312e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.gnr);
        this.f222313f = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1759xd1075a44.C16037x7e3b52ab) findViewById(com.p314xaae8f345.mm.R.id.f566672gp2);
        this.f222314g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565583cu2);
        this.f222315h = (android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.oze);
        this.f222316i = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15988x859a8564) findViewById(com.p314xaae8f345.mm.R.id.h88);
        this.f222317m = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.ozp);
        this.f222318n = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ViewOnClickListenerC15967xc3165160) findViewById(com.p314xaae8f345.mm.R.id.nrj);
        this.f222319o = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ViewOnClickListenerC15956x2c9f7c7f) findViewById(com.p314xaae8f345.mm.R.id.f566645gl0);
        setOnClickListener(this);
        this.f222321q = r53.f.h(getContext()) - i65.a.b(getContext(), 175);
    }

    /* renamed from: setData */
    public void m64745x76491f2c(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c cVar) {
        m53.y0 y0Var;
        if (cVar == null || (y0Var = cVar.f221771d) == null || y0Var.f405725p == null) {
            setVisibility(8);
            return;
        }
        this.f222320p = cVar;
        setVisibility(0);
        r53.y.a().b(this.f222311d, y0Var.f405725p.f405583o.f405250d, i65.a.g(getContext()));
        this.f222312e.setText(y0Var.f405725p.f405583o.f405252f);
        this.f222313f.a(y0Var.f405725p.f405583o.C, this.f222321q);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y0Var.f405725p.f405578g)) {
            this.f222314g.setVisibility(8);
        } else {
            this.f222314g.setText(y0Var.f405725p.f405578g);
            this.f222314g.setVisibility(0);
        }
        this.f222315h.setVisibility(0);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y0Var.f405725p.f405581m)) {
            a(this.f222316i, y0Var.f405725p.f405579h);
            this.f222317m.setVisibility(0);
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y0Var.f405725p.f405579h)) {
            this.f222315h.setVisibility(8);
        } else {
            a(this.f222316i, y0Var.f405725p.f405579h);
            this.f222317m.setVisibility(8);
        }
        this.f222315h.setOnClickListener(this);
        this.f222318n.m64753x76491f2c(y0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.t1.a(this.f222320p.f221771d.f405725p.f405583o);
        a17.f221745o2 = 10;
        a17.f221746p2 = 1024;
        a17.f221747q2 = this.f222320p.f221769b;
        this.f222319o.m64740xd951aad8(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c0(a17));
        if (this.f222320p.f221773f) {
            return;
        }
        android.content.Context context = getContext();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c cVar2 = this.f222320p;
        n53.a.b(context, 10, 1024, cVar2.f221769b, 1, cVar2.f221771d.f405719g, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15971xe6741863.m64756xd419dffb(), n53.a.e(this.f222320p.f221771d.f405718f));
        this.f222320p.f221773f = true;
    }
}
