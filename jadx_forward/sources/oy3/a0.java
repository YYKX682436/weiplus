package oy3;

/* loaded from: classes5.dex */
public final class a0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.ui.ActivityC17256xc70b42d4 f431543d;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.ui.ActivityC17256xc70b42d4 activityC17256xc70b42d4) {
        this.f431543d = activityC17256xc70b42d4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/rtos/ui/RtosWatchLoginUI$switchStatusView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.ui.ActivityC17256xc70b42d4.E;
        com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.ui.ActivityC17256xc70b42d4 activityC17256xc70b42d4 = this.f431543d;
        activityC17256xc70b42d4.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchLoginUI", "jump to scan UI");
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(activityC17256xc70b42d4, "com.tencent.mm.plugin.scanner.ui.BaseScanUI");
        intent.putExtra("key_enable_multi_code", true);
        intent.putExtra("key_scan_goods_enable_dynamic_wording", true);
        intent.putExtra("key_check_camera_using", true);
        intent.putExtra("key_scan_report_enter_scene", 19);
        intent.addFlags(67108864);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC17256xc70b42d4.mo55332x76847179();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(mo55332x76847179, arrayList2.toArray(), "com/tencent/mm/plugin/rtos/ui/RtosWatchLoginUI", "jumpToScan", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mo55332x76847179.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(mo55332x76847179, "com/tencent/mm/plugin/rtos/ui/RtosWatchLoginUI", "jumpToScan", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC17256xc70b42d4.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/rtos/ui/RtosWatchLoginUI$switchStatusView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
