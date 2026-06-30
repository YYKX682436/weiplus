package zo1;

/* loaded from: classes5.dex */
public final class f2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12869xafc66e3 f556137d;

    public f2(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12869xafc66e3 activityC12869xafc66e3) {
        this.f556137d = activityC12869xafc66e3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/PackageDeleteConfirmUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("On delete btn clicked, pkgId=");
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12869xafc66e3 activityC12869xafc66e3 = this.f556137d;
        sb6.append(activityC12869xafc66e3.f174362d);
        sb6.append(", deviceId=");
        po1.d dVar = activityC12869xafc66e3.f174364f;
        if (dVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("deviceInfo");
            throw null;
        }
        sb6.append(dVar.f438828a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PackageDeleteConfirmUI", sb6.toString());
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar = activityC12869xafc66e3.f174363e;
        if (gVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkgInfo");
            throw null;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.h hVar = gVar.f297370o;
        if (hVar.f297372e == 0) {
            if (gVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkgInfo");
                throw null;
            }
            if (hVar.f297371d == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PackageDeleteConfirmUI", "Delete package directly, pkgId=" + activityC12869xafc66e3.f174362d);
                com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12869xafc66e3.T6(activityC12869xafc66e3);
                yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/PackageDeleteConfirmUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }
        int i17 = activityC12869xafc66e3.f174369n + 1;
        activityC12869xafc66e3.f174369n = i17;
        activityC12869xafc66e3.getClass();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(activityC12869xafc66e3);
        android.view.View inflate = android.view.LayoutInflater.from(activityC12869xafc66e3).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570247e46, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.t3s)).setOnClickListener(new zo1.i2(activityC12869xafc66e3, y1Var));
        zo1.j2 j2Var = new zo1.j2(i17, activityC12869xafc66e3, y1Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.u uVar = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.u.f174270a;
        po1.d dVar2 = activityC12869xafc66e3.f174364f;
        if (dVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("deviceInfo");
            throw null;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o1 c17 = uVar.c(dVar2.f438828a);
        if (c17 == null) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("Fail to get device manager by deviceId=");
            po1.d dVar3 = activityC12869xafc66e3.f174364f;
            if (dVar3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("deviceInfo");
                throw null;
            }
            sb7.append(dVar3.f438828a);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("PackageDeleteConfirmUI", sb7.toString());
            j2Var.mo146xb9724478(java.lang.Boolean.FALSE);
        } else {
            c17.a(new zo1.d2(j2Var));
        }
        y1Var.k(inflate);
        y1Var.s();
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/PackageDeleteConfirmUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
