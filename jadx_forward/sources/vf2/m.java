package vf2;

/* loaded from: classes3.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vf2.q f517881d;

    public m(vf2.q qVar) {
        this.f517881d = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/screencast/AnchorScreenCastLivingStatusController$onViewMount$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).Gj(7);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorScreenCastLivingStatusController", "#enableBtn click ");
        vf2.q qVar = this.f517881d;
        qVar.getClass();
        in0.q qVar2 = in0.q.f374302b2;
        boolean z17 = false;
        if (qVar2 != null) {
            if (qVar2 == null) {
                in0.q.f374302b2 = new in0.q(rn0.a.f479142a.a());
            }
            in0.q qVar3 = in0.q.f374302b2;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(qVar3);
            boolean z18 = un0.s.f510951b != null;
            boolean h17 = qVar3.D.h();
            boolean f76 = ((mm2.e1) qVar.m56788xbba4bfc0(mm2.e1.class)).f7();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorScreenCastLivingStatusController", "#canExecuteScreenCast isScreenCastRunning=" + z18 + " isLiving=" + h17 + " isScreenCastGameMode=" + f76);
            if (!z18 && h17 && f76) {
                z17 = true;
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorScreenCastLivingStatusController", "#canExecuteScreenCast not instance");
        }
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.rc rcVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.rc(qVar.O6(), null, 2, null);
            rcVar.f198194m = vf2.g.f517871d;
            rcVar.f198192h = vf2.h.f517872d;
            rcVar.f198193i = new vf2.i(qVar);
            rcVar.w();
            ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).Gj(1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/screencast/AnchorScreenCastLivingStatusController$onViewMount$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
