package oy3;

/* loaded from: classes.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final oy3.c f431546d = new oy3.c();

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/rtos/ui/RepairerRtosWatchUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.ij().J0(new ny3.a());
        ny3.a aVar = new ny3.a();
        aVar.f69149xe5044689 = 3;
        aVar.f69150xde32aff9 = "稍后回复";
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.ij().J0(aVar);
        ny3.a aVar2 = new ny3.a();
        aVar2.f69150xde32aff9 = "稍后";
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.ij().J0(aVar2);
        ny3.a aVar3 = new ny3.a();
        aVar3.f69149xe5044689 = 1;
        aVar3.f69150xde32aff9 = "稍后回复1";
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.ij().J0(aVar3);
        ny3.a aVar4 = new ny3.a();
        aVar4.f69149xe5044689 = 2;
        aVar4.f69150xde32aff9 = "稍后回复2";
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.ij().J0(aVar4);
        java.util.ArrayList z07 = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.ij().z0();
        if (!z07.isEmpty()) {
            java.util.Iterator it = z07.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RepairerRtosWatchUI", ((ny3.a) it.next()).m150302x9616526c());
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/rtos/ui/RepairerRtosWatchUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
