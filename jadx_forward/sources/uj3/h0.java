package uj3;

/* loaded from: classes14.dex */
public final class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj3.l0 f509815d;

    public h0(uj3.l0 l0Var) {
        this.f509815d = l0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectBottomUI$applyClickEvent$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        uj3.l0 l0Var = this.f509815d;
        if (!l0Var.f509861m) {
            yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectBottomUI$applyClickEvent$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1891xcaa9f6bc.C16591xa5634bbe c16591xa5634bbe = l0Var.f509856h;
        if (c16591xa5634bbe != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenProjectReportHelper", "markClickSpeakerOn");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1538L, 8L, 1L);
            zj3.g.f554835a.b(6, 1);
            if (c16591xa5634bbe.isEnabled()) {
                if (c16591xa5634bbe.isChceked) {
                    android.content.Context context = l0Var.f509849a;
                    l0Var.b(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ibu));
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1891xcaa9f6bc.C16591xa5634bbe c16591xa5634bbe2 = l0Var.f509856h;
                    if (c16591xa5634bbe2 != null) {
                        c16591xa5634bbe2.setContentDescription(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.h28));
                    }
                    c16591xa5634bbe.m67103xdd7d58e5(false);
                } else {
                    android.content.Context context2 = l0Var.f509849a;
                    l0Var.b(context2, context2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ibv));
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1891xcaa9f6bc.C16591xa5634bbe c16591xa5634bbe3 = l0Var.f509856h;
                    if (c16591xa5634bbe3 != null) {
                        c16591xa5634bbe3.setContentDescription(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.h29));
                    }
                    c16591xa5634bbe.m67103xdd7d58e5(true);
                }
                ((ku5.t0) ku5.t0.f394148d).g(new uj3.g0(c16591xa5634bbe));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectBottomUI$applyClickEvent$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
