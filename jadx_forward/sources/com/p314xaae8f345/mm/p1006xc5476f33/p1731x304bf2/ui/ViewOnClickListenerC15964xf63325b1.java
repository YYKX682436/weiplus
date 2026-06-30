package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* renamed from: com.tencent.mm.plugin.game.ui.GameFeedNoGamePlayTemplate */
/* loaded from: classes8.dex */
public class ViewOnClickListenerC15964xf63325b1 extends android.widget.LinearLayout implements android.view.View.OnClickListener, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15968xce00ec5e f222340d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f222341e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15988x859a8564 f222342f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f222343g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.RelativeLayout f222344h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f222345i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ViewOnClickListenerC15956x2c9f7c7f f222346m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f222347n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c f222348o;

    public ViewOnClickListenerC15964xf63325b1(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        m53.y0 y0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameFeedNoGamePlayTemplate", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c cVar = this.f222348o;
        if (cVar == null || (y0Var = cVar.f221771d) == null || y0Var.f405726q == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameFeedNoGamePlayTemplate", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (view.getId() == com.p314xaae8f345.mm.R.id.h_1 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f222348o.f221771d.f405726q.f405379h)) {
            int v17 = r53.f.v(getContext(), this.f222348o.f221771d.f405726q.f405379h, null, null);
            android.content.Context context = getContext();
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c cVar2 = this.f222348o;
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.f(context, 10, 1024, cVar2.f221769b, v17, cVar2.f221771d.f405719g, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15971xe6741863.m64756xd419dffb(), n53.a.a(this.f222348o.f221771d.f405718f, "clickType", "middle"));
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameFeedNoGamePlayTemplate", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f222348o.f221771d.f405720h)) {
            int v18 = r53.f.v(getContext(), this.f222348o.f221771d.f405720h, null, null);
            android.content.Context context2 = getContext();
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c cVar3 = this.f222348o;
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.f(context2, 10, 1024, cVar3.f221769b, v18, cVar3.f221771d.f405719g, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15971xe6741863.m64756xd419dffb(), n53.a.a(this.f222348o.f221771d.f405718f, "clickType", "card"));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameFeedNoGamePlayTemplate", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f222340d = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15968xce00ec5e) findViewById(com.p314xaae8f345.mm.R.id.gl7);
        this.f222341e = (android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.h_1);
        this.f222342f = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15988x859a8564) findViewById(com.p314xaae8f345.mm.R.id.f565503cl4);
        this.f222343g = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.ozp);
        this.f222344h = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.gje);
        this.f222345i = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.glm);
        this.f222347n = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.gnr);
        this.f222346m = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ViewOnClickListenerC15956x2c9f7c7f) findViewById(com.p314xaae8f345.mm.R.id.f566645gl0);
        setOnClickListener(this);
        this.f222341e.setOnClickListener(this);
    }

    /* renamed from: setData */
    public void m64750x76491f2c(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c cVar) {
        m53.y0 y0Var;
        if (cVar == null || (y0Var = cVar.f221771d) == null || y0Var.f405726q == null) {
            setVisibility(8);
            return;
        }
        this.f222348o = cVar;
        setVisibility(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15968xce00ec5e c15968xce00ec5e = this.f222340d;
        m53.k4 k4Var = y0Var.f405726q;
        c15968xce00ec5e.a(k4Var.f405375d, k4Var.f405378g, k4Var.f405381m);
        this.f222341e.setVisibility(0);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y0Var.f405726q.f405377f)) {
            this.f222341e.setVisibility(8);
        } else {
            r53.y.a().f(this.f222342f, y0Var.f405726q.f405377f, getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561359gb), getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561358ga), (r53.f.h(getContext()) - getPaddingLeft()) - getPaddingRight());
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y0Var.f405726q.f405379h)) {
                this.f222343g.setVisibility(8);
            } else {
                this.f222343g.setVisibility(0);
            }
        }
        if (y0Var.f405726q.f405380i != null) {
            this.f222344h.setVisibility(0);
            r53.y.a().b(this.f222345i, y0Var.f405726q.f405380i.f405250d, i65.a.g(getContext()));
            this.f222347n.setText(y0Var.f405726q.f405380i.f405252f);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.t1.a(y0Var.f405726q.f405380i);
            a17.f221745o2 = 10;
            a17.f221746p2 = 1024;
            a17.f221747q2 = this.f222348o.f221769b;
            this.f222346m.m64740xd951aad8(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c0(a17));
        }
        if (this.f222348o.f221773f) {
            return;
        }
        android.content.Context context = getContext();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c cVar2 = this.f222348o;
        n53.a.b(context, 10, 1024, cVar2.f221769b, 1, cVar2.f221771d.f405719g, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15971xe6741863.m64756xd419dffb(), n53.a.e(this.f222348o.f221771d.f405718f));
        this.f222348o.f221773f = true;
    }
}
