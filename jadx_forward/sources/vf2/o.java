package vf2;

/* loaded from: classes3.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vf2.q f517883d;

    public o(vf2.q qVar) {
        this.f517883d = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/screencast/AnchorScreenCastLivingStatusController$onViewMount$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vf2.q qVar = this.f517883d;
        if (qVar.f517887m != null) {
            vf2.q.Z6(qVar);
        } else {
            vf2.n nVar = new vf2.n(qVar);
            r45.xq1 xq1Var = ((mm2.c1) qVar.m56788xbba4bfc0(mm2.c1.class)).C2;
            java.lang.String m75945x2fec8307 = xq1Var != null ? xq1Var.m75945x2fec8307(2) : null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorScreenCastLivingStatusController", "[requestGameUserInfo] appId = " + m75945x2fec8307);
            if (m75945x2fec8307 != null) {
                java.lang.String str = m75945x2fec8307.length() > 0 ? m75945x2fec8307 : null;
                if (str != null) {
                    ke2.y yVar = new ke2.y(str, 0, false, null, false, null, 60, null);
                    yVar.t(qVar.O6(), qVar.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9y), 0L);
                    pq5.g l17 = yVar.l();
                    l17.f((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) qVar.O6());
                    l17.K(new vf2.p(qVar, nVar, str));
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/screencast/AnchorScreenCastLivingStatusController$onViewMount$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
