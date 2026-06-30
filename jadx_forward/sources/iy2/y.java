package iy2;

/* loaded from: classes11.dex */
public final class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15489x5c3b8a7a f377447d;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15489x5c3b8a7a c15489x5c3b8a7a) {
        this.f377447d = c15489x5c3b8a7a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/voice/FinderLiveVoiceInputPanel$init$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15489x5c3b8a7a c15489x5c3b8a7a = this.f377447d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(c15489x5c3b8a7a.getContext());
        iy2.x xVar = new iy2.x(c15489x5c3b8a7a, u1Var);
        u1Var.u(c15489x5c3b8a7a.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573411nw2));
        u1Var.t(c15489x5c3b8a7a.B, xVar, c15489x5c3b8a7a.A);
        u1Var.a(true);
        u1Var.i(iy2.w.f377444a);
        u1Var.q(false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/voice/FinderLiveVoiceInputPanel$init$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
