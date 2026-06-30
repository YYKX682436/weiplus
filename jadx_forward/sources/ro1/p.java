package ro1;

/* loaded from: classes5.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f479532d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f479533e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ po1.d f479534f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f479535g;

    public p(android.content.Context context, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var, po1.d dVar, boolean z17) {
        this.f479532d = context;
        this.f479533e = y1Var;
        this.f479534f = dVar;
        this.f479535g = z17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/udisk/UsbDevicesDiscover$showBoundDeviceDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean Ui = ((com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1) ((mv.y) i95.n0.c(mv.y.class))).Ui();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = this.f479533e;
        android.content.Context context = this.f479532d;
        if (Ui) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.UsbDevicesDiscover", "click");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1) ((mv.y) i95.n0.c(mv.y.class))).aj(context, new java.util.LinkedHashMap(), mv.b0.f413011f);
            y1Var.q();
            yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/udisk/UsbDevicesDiscover$showBoundDeviceDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        oo1.o oVar = oo1.o.f428684a;
        po1.d dVar = this.f479534f;
        oVar.a(dVar.f438828a);
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12873xf94c39e.class);
        if (this.f479535g) {
            intent.putExtra("sub-intent", true);
            intent.putExtra("deviceInfo", dVar.c());
        } else {
            intent.putExtra("expandCard", true);
            intent.putExtra("deviceId", dVar.f438828a);
        }
        intent.setFlags(335544320);
        android.content.Context context2 = this.f479532d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context2, arrayList2.toArray(), "com/tencent/mm/plugin/backup/roambackup/udisk/UsbDevicesDiscover$showBoundDeviceDialog$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context2, "com/tencent/mm/plugin/backup/roambackup/udisk/UsbDevicesDiscover$showBoundDeviceDialog$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        y1Var.q();
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/udisk/UsbDevicesDiscover$showBoundDeviceDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
