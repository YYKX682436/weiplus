package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* renamed from: com.tencent.mm.plugin.game.ui.GameIndexWxagView */
/* loaded from: classes8.dex */
public class ViewOnClickListenerC15973x5730120c extends android.widget.LinearLayout implements android.view.View.OnClickListener, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.LayoutInflater f222401d;

    /* renamed from: e, reason: collision with root package name */
    public int f222402e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f222403f;

    public ViewOnClickListenerC15973x5730120c(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        this.f222401d = (android.view.LayoutInflater) getContext().getSystemService("layout_inflater");
        this.f222403f = this;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameIndexWxagView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() == null || !(view.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.x3)) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameIndexWxagView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.x3 x3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.x3) view.getTag();
        if (x3Var.f223379b == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameIndexWxagView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
        c12559xbdae8559.f169323f = 1079;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6 h6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class);
        android.content.Context context = getContext();
        m53.h6 h6Var2 = x3Var.f223379b;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) h6Var).aj(context, h6Var2.f405292g, h6Var2.f405289d, h6Var2.f405294i, 0, h6Var2.f405293h, c12559xbdae8559);
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.f(getContext(), 10, 1025, x3Var.f223378a, 30, h6Var2.f405289d, this.f222402e, null);
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameIndexWxagView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameIndexWxagView", "initView finished");
    }
}
