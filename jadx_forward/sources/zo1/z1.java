package zo1;

/* loaded from: classes5.dex */
public final class z1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e f556372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f556373e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e activityC12868xd8a7d79e, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var) {
        super(1);
        this.f556372d = activityC12868xd8a7d79e;
        this.f556373e = y1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        po1.d device = (po1.d) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
        fo1.d dVar = fo1.d.f346391a;
        boolean b17 = dVar.b(device);
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e activityC12868xd8a7d79e = this.f556372d;
        if (!b17 || dVar.c(device)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreatePackageUI", "Selected device is " + device);
            java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e.f174347u;
            activityC12868xd8a7d79e.Y6(device);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreatePackageUI", "Selected an unbind online PC/MAC and version check failed. device=" + device);
            android.content.Intent intent = new android.content.Intent(activityC12868xd8a7d79e, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1266xb06b1e56.ActivityC12862xdeb2e81d.class);
            intent.putExtra("deviceInfo", device.c());
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e activityC12868xd8a7d79e2 = this.f556372d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activityC12868xd8a7d79e2, arrayList.toArray(), "com/tencent/mm/plugin/backup/roambackup/ui/pkg/CreatePackageUI$showDeviceSelectDialog$3", "invoke", "(Lcom/tencent/mm/plugin/backup/roambackup/storage/entity/UnifyDeviceInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC12868xd8a7d79e2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activityC12868xd8a7d79e2, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/CreatePackageUI$showDeviceSelectDialog$3", "invoke", "(Lcom/tencent/mm/plugin/backup/roambackup/storage/entity/UnifyDeviceInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        this.f556373e.q();
        return jz5.f0.f384359a;
    }
}
