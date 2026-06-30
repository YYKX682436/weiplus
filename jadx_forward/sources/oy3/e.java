package oy3;

/* loaded from: classes.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final oy3.e f431550d = new oy3.e();

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/rtos/ui/RepairerRtosWatchUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RepairerRtosWatchUI", "save quick reply.");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5951x51c5bdf0 c5951x51c5bdf0 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5951x51c5bdf0();
        c5951x51c5bdf0.e();
        am.fs fsVar = c5951x51c5bdf0.f136249g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RepairerRtosWatchUI", fsVar.f88237a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RepairerRtosWatchUI", fsVar.f88238b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RepairerRtosWatchUI", new org.json.JSONArray(fsVar.f88238b).toString());
        yj0.a.h(this, "com/tencent/mm/plugin/rtos/ui/RepairerRtosWatchUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
