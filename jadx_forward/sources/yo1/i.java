package yo1;

/* loaded from: classes5.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1267xe125c5cf.ActivityC12865x8f6cd034 f545656d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ po1.d f545657e;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1267xe125c5cf.ActivityC12865x8f6cd034 activityC12865x8f6cd034, po1.d dVar) {
        this.f545656d = activityC12865x8f6cd034;
        this.f545657e = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/permission/PermissionRequestUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1267xe125c5cf.ActivityC12865x8f6cd034 activityC12865x8f6cd034 = this.f545656d;
        java.lang.String str = activityC12865x8f6cd034.f174316d;
        po1.d dVar = this.f545657e;
        if (dVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "Device is not initialize, try to get a new device from system");
            java.util.List b17 = ro1.v.f479547a.b();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) b17;
            if (arrayList2.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "Fail to get device from system");
                int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(activityC12865x8f6cd034);
                e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.mvb);
                e4Var.c();
                yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/permission/PermissionRequestUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
            r2 = arrayList2.size() == 1;
            dVar = po1.d.a((po1.d) kz5.n0.i0(b17), null, null, null, null, "/", null, null, 111, null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "Open saf ui and request permission. targetDevice=" + dVar);
        android.content.Intent d17 = to1.g.f502444a.d(dVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d17);
        activityC12865x8f6cd034.startActivityForResult(d17, 296);
        wo1.l1.f529519a.a(r2 ? dVar.b() : null);
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/permission/PermissionRequestUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
