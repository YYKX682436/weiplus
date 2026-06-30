package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes8.dex */
public class w3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f223353d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ViewOnClickListenerC15973x5730120c f223354e;

    public w3(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ViewOnClickListenerC15973x5730120c viewOnClickListenerC15973x5730120c, int i17) {
        this.f223354e = viewOnClickListenerC15973x5730120c;
        this.f223353d = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameIndexWxagView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() == null || !(view.getTag() instanceof m53.h6)) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameIndexWxagView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        m53.h6 h6Var = (m53.h6) view.getTag();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
        c12559xbdae8559.f169323f = 1079;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6 h6Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ViewOnClickListenerC15973x5730120c viewOnClickListenerC15973x5730120c = this.f223354e;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) h6Var2).aj(viewOnClickListenerC15973x5730120c.getContext(), h6Var.f405292g, h6Var.f405289d, h6Var.f405294i, 0, h6Var.f405293h, c12559xbdae8559);
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.f(viewOnClickListenerC15973x5730120c.getContext(), 10, 1025, 999, 30, h6Var.f405289d, this.f223353d, null);
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameIndexWxagView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
