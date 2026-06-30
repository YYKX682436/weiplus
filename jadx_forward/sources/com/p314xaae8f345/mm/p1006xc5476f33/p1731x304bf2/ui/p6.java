package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes8.dex */
public class p6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f223251d;

    /* renamed from: e, reason: collision with root package name */
    public int f223252e;

    /* renamed from: f, reason: collision with root package name */
    public int f223253f;

    /* renamed from: g, reason: collision with root package name */
    public int f223254g;

    public p6(android.content.Context context, int i17) {
        this.f223251d = context;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameURLClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameURLClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        boolean z17 = view.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1;
        android.content.Context context = this.f223251d;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1) view.getTag();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(e1Var.f221808b2)) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.v0) e1Var.f221808b2.get(0)).getClass();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(null)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameURLClickListener", "message's jumpurl is null");
                } else {
                    com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.d(this.f223251d, 13, this.f223253f, this.f223254g, r53.f.v(context, null, null, null), 0, e1Var.f68449x28d45f97, this.f223252e, e1Var.f68469xc4aab016, e1Var.f68458xd54c6aa5, e1Var.T2, com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.a(null, null, e1Var.U2, null));
                }
            }
        } else if (view.getTag() instanceof java.lang.String) {
            java.lang.String str = (java.lang.String) view.getTag();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameURLClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else {
                com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(this.f223251d, 13, this.f223253f, this.f223254g, r53.f.v(context, str, null, null), this.f223252e, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameURLClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
