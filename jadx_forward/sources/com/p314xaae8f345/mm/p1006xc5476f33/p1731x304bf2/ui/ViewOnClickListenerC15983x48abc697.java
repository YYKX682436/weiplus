package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* renamed from: com.tencent.mm.plugin.game.ui.GameNewClassifyView */
/* loaded from: classes8.dex */
public class ViewOnClickListenerC15983x48abc697 extends android.widget.LinearLayout implements android.view.View.OnClickListener, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public int f222476d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.LayoutInflater f222477e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f222478f;

    public ViewOnClickListenerC15983x48abc697(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameNewClassifyView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() == null || !(view.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.m5)) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameNewClassifyView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.m5 m5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.m5) view.getTag();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m5Var.f223006a)) {
            r53.f.u(getContext(), m5Var.f223006a);
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.f(getContext(), 10, com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46406xaf4081cb, m5Var.f223007b, 7, null, this.f222476d, n53.a.e(m5Var.f223008c));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameNewClassifyView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f222477e = (android.view.LayoutInflater) getContext().getSystemService("layout_inflater");
        this.f222478f = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.f566658gn0);
    }
}
