package xo1;

/* loaded from: classes5.dex */
public final class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1266xb06b1e56.ActivityC12862xdeb2e81d f537295d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ po1.d f537296e;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1266xb06b1e56.ActivityC12862xdeb2e81d activityC12862xdeb2e81d, po1.d dVar) {
        this.f537295d = activityC12862xdeb2e81d;
        this.f537296e = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/device/NewPcDeviceUI$updateView$delay$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1266xb06b1e56.ActivityC12862xdeb2e81d.f174300t;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1266xb06b1e56.ActivityC12862xdeb2e81d activityC12862xdeb2e81d = this.f537295d;
        activityC12862xdeb2e81d.getClass();
        po1.d device = this.f537296e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
        if (r26.i0.A(device.f438828a, "#OnlineDeviceId@", false, 2, null)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC12862xdeb2e81d.f174301d, "device=" + device + " is already bound");
            android.content.Intent intent = new android.content.Intent(activityC12862xdeb2e81d.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e.class);
            intent.putExtra("deviceInfo", device.c());
            activityC12862xdeb2e81d.finish();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(activityC12862xdeb2e81d, arrayList2.toArray(), "com/tencent/mm/plugin/backup/roambackup/ui/device/NewPcDeviceUI", "tryBindDevice", "(Lcom/tencent/mm/plugin/backup/roambackup/storage/entity/UnifyDeviceInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC12862xdeb2e81d.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(activityC12862xdeb2e81d, "com/tencent/mm/plugin/backup/roambackup/ui/device/NewPcDeviceUI", "tryBindDevice", "(Lcom/tencent/mm/plugin/backup/roambackup/storage/entity/UnifyDeviceInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            activityC12862xdeb2e81d.f174303f = true;
            activityC12862xdeb2e81d.U6(device);
            xo1.j jVar = new xo1.j(activityC12862xdeb2e81d, device);
            java.lang.String uuid = java.util.UUID.randomUUID().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1) ((mv.y) i95.n0.c(mv.y.class))).bj(uuid, device.f438834g, 8000L, new fo1.c(jVar, device));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/device/NewPcDeviceUI$updateView$delay$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
