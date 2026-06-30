package xo1;

/* loaded from: classes.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1266xb06b1e56.ActivityC12862xdeb2e81d f537293d;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1266xb06b1e56.ActivityC12862xdeb2e81d activityC12862xdeb2e81d) {
        this.f537293d = activityC12862xdeb2e81d;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/device/NewPcDeviceUI$updateView$delay$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1266xb06b1e56.ActivityC12862xdeb2e81d.f174300t;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1266xb06b1e56.ActivityC12862xdeb2e81d activityC12862xdeb2e81d = this.f537293d;
        activityC12862xdeb2e81d.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("CLICK_ENTER_SCAN", true);
        if (!iq.b.i(activityC12862xdeb2e81d, true, bundle) && !iq.b.v(activityC12862xdeb2e81d) && !iq.b.c(activityC12862xdeb2e81d, true) && !iq.b.o(activityC12862xdeb2e81d, true)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_scan_report_enter_scene", 18);
            intent.putExtra("BaseScanUI_select_scan_mode", 8);
            j45.l.j(activityC12862xdeb2e81d, "scanner", ".ui.BaseScanUI", intent, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/device/NewPcDeviceUI$updateView$delay$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
