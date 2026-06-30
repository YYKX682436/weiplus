package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* renamed from: com.tencent.mm.plugin.game.ui.GameRecomBlockView */
/* loaded from: classes8.dex */
public class ViewOnClickListenerC15985x3dd082b6 extends android.widget.LinearLayout implements android.view.View.OnClickListener, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f222487d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.LayoutInflater f222488e;

    /* renamed from: f, reason: collision with root package name */
    public int f222489f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.ViewGroup f222490g;

    public ViewOnClickListenerC15985x3dd082b6(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        this.f222487d = context;
        this.f222488e = (android.view.LayoutInflater) getContext().getSystemService("layout_inflater");
        this.f222490g = this;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameRecomBlockView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() == null || !(view.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.o5)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameRecomBlockView", "getTag is null");
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameRecomBlockView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.o5 o5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.o5) view.getTag();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o5Var.f223230c)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameRecomBlockView", "jumpUrl is null");
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameRecomBlockView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.f(this.f222487d, 10, com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46405xe4de6fbf, o5Var.f223229b, r53.f.v(this.f222487d, o5Var.f223230c, o5Var.f223232e, null), o5Var.f223228a, this.f222489f, n53.a.e(o5Var.f223231d));
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameRecomBlockView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecomBlockView", "initView finished");
    }
}
