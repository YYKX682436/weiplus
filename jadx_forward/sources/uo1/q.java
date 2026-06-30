package uo1;

/* loaded from: classes5.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ po1.d f511115d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f511116e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ uo1.u f511117f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f511118g;

    public q(po1.d dVar, qo1.f0 f0Var, uo1.u uVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var) {
        this.f511115d = dVar;
        this.f511116e = f0Var;
        this.f511117f = uVar;
        this.f511118g = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/BackupUIUtils$showConnectionSwitchBottomDialog$2$1$getView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.u uVar = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.u.f174270a;
        po1.d dVar = this.f511115d;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o1 c17 = uVar.c(dVar.f438828a);
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (c17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("BackupUIUtils", "Device manager is null, deviceInfo=" + dVar);
            yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/BackupUIUtils$showConnectionSwitchBottomDialog$2$1$getView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start task now, device=");
        sb6.append(dVar);
        sb6.append(", task=");
        qo1.f0 f0Var = this.f511116e;
        sb6.append(f0Var);
        sb6.append(", pkgId=");
        sb6.append(f0Var.f447016i);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BackupUIUtils", sb6.toString());
        f0Var.mo160577x68ac462();
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.C12844xf7745c1a c12844xf7745c1a = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.C12844xf7745c1a.f174086a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.k kVar = this.f511117f.f511123e;
        if (kVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("accessoryListener");
            throw null;
        }
        c12844xf7745c1a.f(kVar);
        this.f511118g.q();
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/BackupUIUtils$showConnectionSwitchBottomDialog$2$1$getView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
