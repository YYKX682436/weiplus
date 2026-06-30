package zo1;

/* loaded from: classes5.dex */
public final class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f556367d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e f556368e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ po1.d f556369f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f556370g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f556371h;

    public z0(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e activityC12868xd8a7d79e, po1.d dVar, int i17, long j17) {
        this.f556367d = u3Var;
        this.f556368e = activityC12868xd8a7d79e;
        this.f556369f = dVar;
        this.f556370g = i17;
        this.f556371h = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f556367d.dismiss();
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e activityC12868xd8a7d79e = this.f556368e;
        android.widget.Button button = activityC12868xd8a7d79e.f174355n;
        if (button == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("createBtn");
            throw null;
        }
        button.setEnabled(true);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createBackupPackage done, device.deviceId = ");
        po1.d dVar = this.f556369f;
        sb6.append(dVar.f438828a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreatePackageUI", sb6.toString());
        if (this.f556370g == 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("deviceId", dVar.f438828a);
            intent.putExtra("packageId", this.f556371h);
            activityC12868xd8a7d79e.setResult(-1, intent);
            activityC12868xd8a7d79e.finish();
            return;
        }
        int size = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a.h(false).size();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreatePackageUI", "Create package failed, count of packages is " + size);
        if (size >= 20) {
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(activityC12868xd8a7d79e);
            e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.f574390mx5);
            e4Var.c();
        }
    }
}
