package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* renamed from: com.tencent.mm.plugin.game.ui.GameBestSellingMore */
/* loaded from: classes8.dex */
public class ViewOnClickListenerC15941x3fc583cf extends android.widget.LinearLayout implements android.view.View.OnClickListener, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f222210d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f222211e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c f222212f;

    public ViewOnClickListenerC15941x3fc583cf(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        m53.y0 y0Var;
        m53.m1 m1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameBestSellingMore", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c cVar = this.f222212f;
        if (cVar == null || (y0Var = cVar.f221771d) == null || (m1Var = y0Var.f405727r) == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m1Var.f405428g)) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameBestSellingMore", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.f(getContext(), 10, com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46404xa5f7fd74, 999, r53.f.v(getContext(), this.f222212f.f221771d.f405727r.f405428g, null, null), null, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15971xe6741863.m64756xd419dffb(), n53.a.e(this.f222212f.f221771d.f405718f));
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameBestSellingMore", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f222210d = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f567512jr5);
        this.f222211e = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f567511jr4);
        setOnClickListener(this);
    }

    /* renamed from: setData */
    public void m64735x76491f2c(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c cVar) {
        m53.y0 y0Var;
        m53.m1 m1Var;
        this.f222212f = cVar;
        if (cVar == null || (y0Var = cVar.f221771d) == null || (m1Var = y0Var.f405727r) == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m1Var.f405427f)) {
            this.f222210d.setVisibility(8);
            this.f222211e.setVisibility(8);
            setPadding(0, 0, 0, 0);
        } else {
            setPadding(getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561352g4), 0, getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561352g4), getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561352g4));
            this.f222210d.setVisibility(0);
            this.f222211e.setVisibility(0);
            this.f222210d.setText(cVar.f221771d.f405727r.f405427f);
        }
    }
}
