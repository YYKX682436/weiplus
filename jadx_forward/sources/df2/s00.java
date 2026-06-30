package df2;

/* loaded from: classes3.dex */
public final class s00 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.u00 f312814d;

    public s00(df2.u00 u00Var) {
        this.f312814d = u00Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/VisitorDefinitionController$onViewMount$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f443300a >= 500) {
            z17 = false;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f443300a);
            z17 = true;
        }
        qd2.h.f443300a = currentTimeMillis;
        df2.u00 u00Var = this.f312814d;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(u00Var.f313020m, "rootView FastClick!");
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/VisitorDefinitionController$onViewMount$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        u00Var.b7(2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sx sxVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yx.f202011f;
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        if (sxVar.b(context, u00Var.getStore().getLiveRoomData())) {
            android.content.Context context2 = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            u00Var.f313024q = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yx(context2, u00Var.getStore().getLiveRoomData());
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yx yxVar = u00Var.f313024q;
            if (yxVar != null) {
                yxVar.f202015d = u00Var.a7();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yx yxVar2 = u00Var.f313024q;
            if (yxVar2 != null) {
                yxVar2.b(u00Var.U6(), 3);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/VisitorDefinitionController$onViewMount$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
