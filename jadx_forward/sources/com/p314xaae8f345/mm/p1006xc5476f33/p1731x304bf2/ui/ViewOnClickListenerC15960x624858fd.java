package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* renamed from: com.tencent.mm.plugin.game.ui.GameFeedImageTextView */
/* loaded from: classes8.dex */
public class ViewOnClickListenerC15960x624858fd extends android.widget.LinearLayout implements android.view.View.OnClickListener, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15968xce00ec5e f222322d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15988x859a8564 f222323e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f222324f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15988x859a8564 f222325g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15988x859a8564 f222326h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15988x859a8564 f222327i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f222328m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ViewOnClickListenerC15967xc3165160 f222329n;

    /* renamed from: o, reason: collision with root package name */
    public int f222330o;

    /* renamed from: p, reason: collision with root package name */
    public int f222331p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c f222332q;

    public ViewOnClickListenerC15960x624858fd(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f222330o = 0;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        m53.y0 y0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameFeedImageTextView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c cVar = this.f222332q;
        if (cVar == null || (y0Var = cVar.f221771d) == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameFeedImageTextView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y0Var.f405720h)) {
            int v17 = r53.f.v(getContext(), this.f222332q.f221771d.f405720h, null, null);
            android.content.Context context = getContext();
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c cVar2 = this.f222332q;
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.f(context, 10, 1024, cVar2.f221769b, v17, cVar2.f221771d.f405719g, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15971xe6741863.m64756xd419dffb(), n53.a.a(this.f222332q.f221771d.f405718f, "clickType", "card"));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameFeedImageTextView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f222322d = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15968xce00ec5e) findViewById(com.p314xaae8f345.mm.R.id.gl7);
        this.f222323e = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15988x859a8564) findViewById(com.p314xaae8f345.mm.R.id.ahg);
        this.f222324f = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.n0i);
        this.f222325g = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15988x859a8564) findViewById(com.p314xaae8f345.mm.R.id.g6r);
        this.f222326h = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15988x859a8564) findViewById(com.p314xaae8f345.mm.R.id.f568309mg0);
        this.f222327i = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15988x859a8564) findViewById(com.p314xaae8f345.mm.R.id.f568827o65);
        this.f222328m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.jr7);
        this.f222329n = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ViewOnClickListenerC15967xc3165160) findViewById(com.p314xaae8f345.mm.R.id.nrj);
        setOnClickListener(this);
        this.f222330o = (((r53.f.h(getContext()) - getPaddingLeft()) - getPaddingRight()) - (i65.a.b(getContext(), 10) * 2)) / 3;
        int b17 = i65.a.b(getContext(), 105);
        this.f222331p = b17;
        int i17 = this.f222330o;
        if (i17 < b17) {
            this.f222331p = i17;
        }
        android.view.ViewGroup.LayoutParams layoutParams = this.f222325g.getLayoutParams();
        int i18 = this.f222331p;
        layoutParams.width = i18;
        layoutParams.height = i18;
        this.f222325g.setLayoutParams(layoutParams);
        this.f222326h.setLayoutParams(layoutParams);
        this.f222327i.setLayoutParams(layoutParams);
    }

    /* renamed from: setData */
    public void m64746x76491f2c(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c cVar) {
        m53.y0 y0Var;
        if (cVar == null || (y0Var = cVar.f221771d) == null || y0Var.f405721i == null) {
            setVisibility(8);
            return;
        }
        this.f222332q = cVar;
        setVisibility(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15968xce00ec5e c15968xce00ec5e = this.f222322d;
        m53.m3 m3Var = y0Var.f405721i;
        c15968xce00ec5e.a(m3Var.f405435d, m3Var.f405436e, null);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(y0Var.f405721i.f405437f)) {
            this.f222323e.setVisibility(8);
            this.f222324f.setVisibility(8);
        } else {
            int size = y0Var.f405721i.f405437f.size();
            if (size == 1) {
                this.f222324f.setVisibility(8);
                this.f222323e.setVisibility(0);
                r53.y.a().f(this.f222323e, (java.lang.String) y0Var.f405721i.f405437f.get(0), getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561349g1), getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561348g0), (r53.f.h(getContext()) - getPaddingLeft()) - getPaddingRight());
            } else {
                this.f222323e.setVisibility(8);
                this.f222324f.setVisibility(0);
                this.f222328m.setVisibility(8);
                r53.v vVar = new r53.v();
                vVar.f474239d = true;
                r53.w a17 = vVar.a();
                r53.y.a().e(this.f222325g, (java.lang.String) y0Var.f405721i.f405437f.get(0), a17, null);
                r53.y.a().e(this.f222326h, (java.lang.String) y0Var.f405721i.f405437f.get(1), a17, null);
                if (size > 2) {
                    r53.y.a().e(this.f222327i, (java.lang.String) y0Var.f405721i.f405437f.get(2), a17, null);
                    this.f222327i.setVisibility(0);
                    if (size > 3) {
                        this.f222328m.setVisibility(0);
                        this.f222328m.setText(java.lang.String.format("共%d张", java.lang.Integer.valueOf(size)));
                    }
                } else {
                    this.f222327i.setVisibility(4);
                }
            }
        }
        this.f222329n.m64753x76491f2c(y0Var);
        if (this.f222332q.f221773f) {
            return;
        }
        android.content.Context context = getContext();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c cVar2 = this.f222332q;
        n53.a.b(context, 10, 1024, cVar2.f221769b, 1, cVar2.f221771d.f405719g, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15971xe6741863.m64756xd419dffb(), n53.a.e(this.f222332q.f221771d.f405718f));
        this.f222332q.f221773f = true;
    }
}
