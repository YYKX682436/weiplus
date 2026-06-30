package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* renamed from: com.tencent.mm.plugin.game.ui.GameFeedQipaiView */
/* loaded from: classes8.dex */
public class ViewOnClickListenerC15965xf7560355 extends android.widget.LinearLayout implements android.view.View.OnClickListener, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f222349d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f222350e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f222351f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f222352g;

    /* renamed from: h, reason: collision with root package name */
    public m53.y0 f222353h;

    public ViewOnClickListenerC15965xf7560355(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameFeedQipaiView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f222353h == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameFeedQipaiView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (view.getId() == com.p314xaae8f345.mm.R.id.f567508jr1) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f222353h.f405730u.f405662g)) {
                com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.f(getContext(), 10, 1023, 999, r53.f.v(getContext(), this.f222353h.f405730u.f405662g, null, null), null, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15971xe6741863.m64756xd419dffb(), n53.a.e(this.f222353h.f405718f));
            }
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameFeedQipaiView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int intValue = ((java.lang.Integer) view.getTag()).intValue();
        if (intValue < 0 || intValue > this.f222353h.f405730u.f405660e.size() - 1) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameFeedQipaiView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        m53.i1 i1Var = (m53.i1) this.f222353h.f405730u.f405660e.get(intValue);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i1Var.f405312g)) {
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.f(getContext(), 10, 1023, intValue + 1, r53.f.v(getContext(), i1Var.f405312g, null, null), i1Var.f405313h, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15971xe6741863.m64756xd419dffb(), n53.a.e(this.f222353h.f405718f));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameFeedQipaiView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f222349d = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.obc);
        this.f222350e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f567508jr1);
        this.f222351f = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.jqn);
        this.f222352g = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.gme);
        this.f222350e.setOnClickListener(this);
    }

    /* renamed from: setData */
    public void m64751x76491f2c(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c cVar) {
        m53.y0 y0Var;
        if (cVar == null || (y0Var = cVar.f221771d) == null || y0Var.f405730u == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        this.f222353h = y0Var;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y0Var.f405730u.f405659d)) {
            this.f222349d.setVisibility(8);
        } else {
            this.f222349d.setText(y0Var.f405730u.f405659d);
            this.f222349d.setVisibility(0);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y0Var.f405730u.f405661f)) {
            this.f222350e.setVisibility(8);
            this.f222351f.setVisibility(8);
        } else {
            this.f222351f.setVisibility(0);
            this.f222350e.setVisibility(0);
            this.f222350e.setText(y0Var.f405730u.f405661f);
        }
        this.f222352g.removeAllViews();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(y0Var.f405730u.f405660e)) {
            java.util.Iterator it = y0Var.f405730u.f405660e.iterator();
            while (it.hasNext()) {
                m53.i1 i1Var = (m53.i1) it.next();
                android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bea, (android.view.ViewGroup) this, false);
                inflate.setOnClickListener(this);
                inflate.setTag(java.lang.Integer.valueOf(y0Var.f405730u.f405660e.indexOf(i1Var)));
                this.f222352g.addView(inflate, new android.widget.LinearLayout.LayoutParams(-1, -2, 1.0f));
                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.lne);
                android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.lnb);
                android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.lnd);
                android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.lna);
                textView.setVisibility(8);
                r53.y.a().e(imageView, i1Var.f405309d, null, null);
                textView2.setText(i1Var.f405310e);
                textView3.setText(i1Var.f405311f);
            }
        }
        if (cVar.f221773f) {
            return;
        }
        n53.a.b(getContext(), 10, 1023, cVar.f221769b, 1, cVar.f221771d.f405719g, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15971xe6741863.m64756xd419dffb(), n53.a.e(cVar.f221771d.f405718f));
        cVar.f221773f = true;
    }
}
